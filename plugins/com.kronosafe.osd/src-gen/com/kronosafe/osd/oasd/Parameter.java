/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd;

import com.kronosafe.osd.core.IdentifiableElementReferencer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A function parameter in case of separate IO generation, i.e. functions are using parameters to exchange data and not global variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.Parameter#getDir <em>Dir</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.Parameter#isPointer <em>Pointer</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.Parameter#getOrder <em>Order</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.Parameter#getRef <em>Ref</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.Parameter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends IdentifiableElementReferencer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link com.kronosafe.osd.oasd.ParameterDir}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter direction derivated from the input/output/global reference type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see com.kronosafe.osd.oasd.ParameterDir
	 * @see #setDir(ParameterDir)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getParameter_Dir()
	 * @model required="true" derived="true"
	 * @generated
	 */
	ParameterDir getDir();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Parameter#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see com.kronosafe.osd.oasd.ParameterDir
	 * @see #getDir()
	 * @generated
	 */
	void setDir(ParameterDir value);

	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the parameter is a pointer, i.e. at execution the assigned variable to this parameter is passed by reference. If false, the assigned variable is passed by value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pointer</em>' attribute.
	 * @see #setPointer(boolean)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getParameter_Pointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isPointer();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Parameter#isPointer <em>Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' attribute.
	 * @see #isPointer()
	 * @generated
	 */
	void setPointer(boolean value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter position in the function prototype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getParameter_Order()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Parameter#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input/output/global that the parameter references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(ParameterReference)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getParameter_Ref()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	ParameterReference getRef();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Parameter#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ParameterReference value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getParameter_Name()
	 * @model dataType="com.kronosafe.osd.core.AString"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Parameter
