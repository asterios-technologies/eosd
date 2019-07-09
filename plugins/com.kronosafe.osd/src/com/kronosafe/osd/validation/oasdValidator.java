package com.kronosafe.osd.validation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectValidator;
import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.oasd.FunctionItem;
import com.kronosafe.osd.oasd.FunctionKind;
import com.kronosafe.osd.oasd.Parameter;
import com.kronosafe.osd.oasd.ParameterDir;
import com.kronosafe.osd.oasd.ReturnType;
import com.kronosafe.osd.oasd.ReturnValue;
import com.kronosafe.osd.oasd.oasdPackage;
import com.kronosafe.osd.oasd.util.oasdSwitch;

/**
 * Abstract base class for validators.
 */
public class oasdValidator extends EObjectValidator {

	@Override
	public boolean validate_UniqueID(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (!(eObject instanceof IdentifiedElement)) {
			return super.validate_UniqueID(eObject, diagnostics, context);
		}

		IdentifiedElement elementToValidate = (IdentifiedElement) eObject;
		Resource eRessource = elementToValidate.eResource();
		EList<IdentifiedElement> elements = new BasicEList<IdentifiedElement>();

		// search all the element with the same ID
		for (TreeIterator<EObject> iterator = eRessource.getAllContents(); iterator.hasNext();) {
			EObject element = iterator.next();
			if (element != elementToValidate && element instanceof IdentifiedElement
					&& element.eClass() == elementToValidate.eClass()) {
				IdentifiedElement candidate = (IdentifiedElement) element;
				if (candidate.getId() == elementToValidate.getId())
					elements.add(candidate);
			}
		}

		// if multiple elements exists create a diagnostic
		for (IdentifiedElement identifiedElement : elements) {
			diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, EOBJECT__UNIQUE_ID,
					"_UI_DuplicateID_diagnostic",
					new Object[] { elementToValidate.getId(), getObjectLabel(eObject, context),
							getObjectLabel(identifiedElement, context) },
					new Object[] { eObject, identifiedElement, elementToValidate.getId() }, context));

		}

		return elements.isEmpty();
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		final boolean isECOREValid = super.validate(eClass, eObject, diagnostics, context);
		final Diagnostic diagnostic = new OASDValidatingVisitor().doSwitch(eObject);
		final boolean isOSDValid = diagnostic == null;
		if (!isOSDValid) {
			diagnostics.add(diagnostic);
		}
		return isECOREValid && isOSDValid;
	}

	private class OASDValidatingVisitor extends oasdSwitch<Diagnostic> {

		protected Diagnostic error(final String message, final EObject eObject) {
	        return new BasicDiagnostic(Diagnostic.ERROR, null, -1, message, new Object[] { eObject });
	    }

		protected Diagnostic warning(final String message, final EObject eObject) {
	        return new BasicDiagnostic(Diagnostic.WARNING, null, -1, message, new Object[] { eObject });
	    }
		
		@Override
		public Diagnostic defaultCase(EObject object) {
			return null;
		}

		@Override
		public Diagnostic caseFunctionItem(FunctionItem object) {
			
			boolean isValid = true;
			//object.getExecTWRhythm() == null && object.getExecTWLength() ==null -> no problem
			//object.getExecTWRhythm() != null && object.getExecTWLength() ==null -> no problem
			if(object.getExecTWRhythm() == null && object.getExecTWLength() !=null) {
				isValid = false;
			}else if(object.getExecTWRhythm() != null && object.getExecTWLength() != null && object.getExecTWLength() > object.getExecTWRhythm()) {
				isValid = false;
			}
			
			if(!isValid) {
				return error(oasdPackage.eINSTANCE.getFunctionItem_ExecTWLength().getName()+" must be <= "+oasdPackage.eINSTANCE.getFunctionItem_ExecTWRhythm().getName()+" for "+object.eClass().getName()+" '"+object.getName()+"'", object);
			}
			
			if(object.getKind() == FunctionKind.INIT && object.getExecTWLength() != null) {
				return warning(oasdPackage.eINSTANCE.getFunctionItem_ExecTWLength().getName()+" is not used for init, use "+oasdPackage.eINSTANCE.getFunctionItem_ExecTWRhythm().getName()+" to describe constraint for "+object.eClass().getName()+" '"+object.getName()+"'", object);
			}

			return null;
		}

		@Override
		public Diagnostic caseParameter(Parameter object) {
			boolean isValid = true;
			if (object.getRef() != null && object.getDir() != null) {
				switch (object.getDir().getValue()) {
				case ParameterDir.INTERN_VALUE:
					if (object.getRef().eClass() != oasdPackage.eINSTANCE.getGlobal())
						isValid = false;
					break;
				case ParameterDir.INPUT_VALUE:
					if (object.getRef().eClass() != oasdPackage.eINSTANCE.getInput())
						isValid = false;
					break;
				case ParameterDir.OUTPUT_VALUE:
					if (object.getRef().eClass() != oasdPackage.eINSTANCE.getOutput())
						isValid = false;
					break;
				default:
					break;
				}
			}
			if (!isValid)
				return error("Inconsistency between " + oasdPackage.eINSTANCE.getReturnValue_Dir().getName() + " and "
						+ oasdPackage.eINSTANCE.getReturnValue_Ref().getName(), object);
			
			EList<Parameter> conflicts = new BasicEList<Parameter>();
			if (object.eContainer() == null)
				return super.caseParameter(object);
			for (Parameter element : ((FunctionItem) object.eContainer()).getParameters()) {
				if (element != object && element.getOrder() == object.getOrder()) {
					conflicts.add(element);
				}
			}

			if (!conflicts.isEmpty()) {
				if (object.getName() == null || object.getName().isEmpty()) {
					return warning("Duplicate order detected for " + object.eClass().getName() + " in "
							+ ((FunctionItem) object.eContainer()).getName(), object);
				} else {
					return warning("Duplicate order detected for " + object.eClass().getName() + " " + object.getName()
							+ " in " + ((FunctionItem) object.eContainer()).getName(), object);
				}

			}
			return super.caseParameter(object);
		}

		@Override
		public Diagnostic caseReturnValue(ReturnValue object) {
			boolean isValid = true;
			if (object.getRef() != null && object.getDir() != null) {
				switch (object.getDir().getValue()) {
				case ReturnType.OUTPUT_VALUE:
					if (object.getRef().eClass() != oasdPackage.eINSTANCE.getOutput())
						isValid = false;
					break;
				case ReturnType.INTERN_VALUE:
					if (object.getRef().eClass() != oasdPackage.eINSTANCE.getGlobal())
						isValid = false;
					break;
				default:
					break;
				}
			}
			if (!isValid)
				return error("Inconsistency between " + oasdPackage.eINSTANCE.getReturnValue_Dir().getName() + " and "
						+ oasdPackage.eINSTANCE.getReturnValue_Ref().getName(), object);

			return super.caseReturnValue(object);
		}

	}

}