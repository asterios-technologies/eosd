/**
 */
package com.kronosafe.osd.oasd;

import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Input represents an input data of the block under consideration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.Input#getInner <em>Inner</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.Input#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends IdentifiedElement, NamedElement, ParameterReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port name manipulated by the functional C function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner</em>' attribute.
	 * @see #setInner(String)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getInput_Inner()
	 * @model dataType="com.kronosafe.osd.core.AString"
	 * @generated
	 */
	String getInner();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Input#getInner <em>Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' attribute.
	 * @see #getInner()
	 * @generated
	 */
	void setInner(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the input
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeItem)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getInput_Type()
	 * @model resolveProxies="false"
	 * @generated
	 */
	TypeItem getType();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Input#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeItem value);

} // Input
