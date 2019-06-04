/**
 */
package com.kronosafe.osd.core.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.kronosafe.osd.core.IdentifiableElementReferencer;
import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.corePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifiable Element Referencer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class IdentifiableElementReferencerImpl extends AnnotatedElementImpl implements IdentifiableElementReferencer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiableElementReferencerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return corePackage.Literals.IDENTIFIABLE_ELEMENT_REFERENCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public IdentifiedElement findItem(Integer id, EClass eClass) {
		return findItem(id, eClass, this.eResource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public IdentifiedElement findItem(Integer id, EStructuralFeature feature) {
		if(id == null || feature == null)
			return null;
		Object object = this.eGet(feature);
		
		if(feature.isMany()) {
			@SuppressWarnings("unchecked")
			EList<EObject> elements = (EList<EObject>)object;
			for (EObject element : elements) {
				if(element instanceof IdentifiedElement) {
					IdentifiedElement idElement = (IdentifiedElement)element;
					if(idElement.getId().equals(id))
						return idElement;
				}
			}
		} else {
			if(object instanceof IdentifiedElement) {
				IdentifiedElement idElement = (IdentifiedElement)object;
				if(idElement.getId() == id)
					return idElement;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public IdentifiedElement findItemInResourceSet(Integer id, EClass eClass) {	
			ResourceSet resourceSet = this.eResource().getResourceSet();
			
			for (Resource resource : resourceSet.getResources()) {
				IdentifiedElement element = findItem(id, eClass, resource);
				if(element != null)
					return element;
			}
			
			return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public IdentifiedElement findItem(Integer id, EClass eClass, Resource eRessource) {
		if(id == null || eClass == null || eRessource == null)
			return null;
		
		for (TreeIterator<EObject> iterator = eRessource.getAllContents();iterator.hasNext();) {
			EObject element = iterator.next();
			if(element instanceof IdentifiedElement && element.eClass() == eClass) {
				IdentifiedElement idElement = (IdentifiedElement)element;
				if(idElement.getId().equals(id))
					return idElement;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS:
				return findItem((Integer)arguments.get(0), (EClass)arguments.get(1));
			case corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE:
				return findItem((Integer)arguments.get(0), (EStructuralFeature)arguments.get(1));
			case corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS:
				return findItemInResourceSet((Integer)arguments.get(0), (EClass)arguments.get(1));
			case corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE:
				return findItem((Integer)arguments.get(0), (EClass)arguments.get(1), (Resource)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IdentifiableElementReferencerImpl
