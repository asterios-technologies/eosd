/**
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable Element Referencer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element that references an IdentifiedElement.
 * <!-- end-model-doc -->
 *
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getIdentifiableElementReferencer()
 * @model abstract="true"
 * @generated
 */
public interface IdentifiableElementReferencer extends AnnotatedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="com.kronosafe.osd.oasd.IdVal"
	 * @generated
	 */
	IdentifiedElement findItem(Integer id, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="com.kronosafe.osd.oasd.IdVal"
	 * @generated
	 */
	IdentifiedElement findItem(Integer id, EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="com.kronosafe.osd.oasd.IdVal"
	 * @generated
	 */
	IdentifiedElement findItemInResourceSet(Integer id, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="com.kronosafe.osd.oasd.IdVal"
	 * @generated
	 */
	IdentifiedElement findItem(Integer id, EClass eClass, Resource eRessource);

} // IdentifiableElementReferencer
