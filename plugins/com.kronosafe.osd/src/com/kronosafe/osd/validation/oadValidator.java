package com.kronosafe.osd.validation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectValidator;

import com.kronosafe.osd.oad.BehaviorItemReference;
import com.kronosafe.osd.oad.oadPackage;

/**
 * Abstract base class for validators.
 */
public class oadValidator extends EObjectValidator {

	@Override
	protected boolean validate_MultiplicityConforms(EObject eObject, EStructuralFeature eStructuralFeature,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (eObject instanceof BehaviorItemReference
				&& eStructuralFeature == oadPackage.eINSTANCE.getBehaviorItemReference_BehaviorItemElement()) {
			// force to resolve the element;
			((BehaviorItemReference)eObject).getBehaviorItemElement();
		}
		return super.validate_MultiplicityConforms(eObject, eStructuralFeature, diagnostics, context);
	}

}