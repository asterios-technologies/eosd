/**
 */
package com.kronosafe.osd.oasd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identified Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element with an Id.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.IdentifiedElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getIdentifiedElement()
 * @model abstract="true"
 * @generated
 */
public interface IdentifiedElement extends IdentifiableElementReferencer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element model Id. This is a number to reference the element in the model. All attributes IDs shall be global to the system, e.g. all id of Output shall be different for a given system. Two outputs with the same Id is forbidden. Nevertheless, an Output of Id "0" and an Input of Id "0" may exist.
	 * 
	 * This id is used to serialize the references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getIdentifiedElement_Id()
	 * @model id="true" dataType="com.kronosafe.osd.oasd.IdVal" required="true"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.IdentifiedElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

} // IdentifiedElement
