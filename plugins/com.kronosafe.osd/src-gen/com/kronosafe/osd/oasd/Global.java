/**
 */
package com.kronosafe.osd.oasd;

import com.kronosafe.osd.core.IdentifiableElementReferencer;
import com.kronosafe.osd.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Global represents a global data of the block under consideration. It is an element of the context of the C-functions that correspond to the block.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.Global#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getGlobal()
 * @model
 * @generated
 */
public interface Global extends IdentifiableElementReferencer, NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The global variable type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeItem)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getGlobal_Type()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	TypeItem getType();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Global#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeItem value);

} // Global
