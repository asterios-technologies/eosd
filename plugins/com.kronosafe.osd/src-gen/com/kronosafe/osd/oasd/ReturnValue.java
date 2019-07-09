/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd;

import com.kronosafe.osd.core.IdentifiableElementReferencer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A function return value in case of separate IO generation, i.e. functions are using return value to exchange data and not global variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.ReturnValue#getRef <em>Ref</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.ReturnValue#getDir <em>Dir</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getReturnValue()
 * @model
 * @generated
 */
public interface ReturnValue extends IdentifiableElementReferencer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output/global that the function references as return value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(ReturnValueReference)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getReturnValue_Ref()
	 * @model required="true"
	 * @generated
	 */
	ReturnValueReference getRef();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.ReturnValue#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ReturnValueReference value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link com.kronosafe.osd.oasd.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter direction derivated from the output/global reference type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see com.kronosafe.osd.oasd.ReturnType
	 * @see #setDir(ReturnType)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getReturnValue_Dir()
	 * @model required="true" derived="true"
	 * @generated
	 */
	ReturnType getDir();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.ReturnValue#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see com.kronosafe.osd.oasd.ReturnType
	 * @see #getDir()
	 * @generated
	 */
	void setDir(ReturnType value);

} // ReturnValue
