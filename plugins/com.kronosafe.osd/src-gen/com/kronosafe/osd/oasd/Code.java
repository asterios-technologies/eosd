/**
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.common.util.EList;

import com.kronosafe.osd.core.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element gives a set of files associated to an implementation of a behaviorItem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.Code#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getCode()
 * @model
 * @generated
 */
public interface Code extends IdentifiedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of files either manually written or generated to implement the functional requirements/designs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getCode_Files()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<File> getFiles();

} // Code
