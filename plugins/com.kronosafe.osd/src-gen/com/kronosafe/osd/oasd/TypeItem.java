/**
 */
package com.kronosafe.osd.oasd;

import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TypeItem represents the type of a data manipulated by a BehaviorItem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.TypeItem#getCopyFunction <em>Copy Function</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getTypeItem()
 * @model
 * @generated
 */
public interface TypeItem extends IdentifiedElement, NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Copy Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function used to copy the element in the functional implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Function</em>' attribute.
	 * @see #setCopyFunction(String)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getTypeItem_CopyFunction()
	 * @model dataType="com.kronosafe.osd.core.AString"
	 * @generated
	 */
	String getCopyFunction();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.TypeItem#getCopyFunction <em>Copy Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Function</em>' attribute.
	 * @see #getCopyFunction()
	 * @generated
	 */
	void setCopyFunction(String value);

} // TypeItem
