/**
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Source represents the set of external C-files and header files necessary to compile the block of the application.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.Source#getHeaders <em>Headers</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.Source#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends IdentifiableElementReferencer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code element associated with the source file
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(Code)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSource_Code()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Source#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The headers produced by the functional implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSource_Headers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<File> getHeaders();

} // Source
