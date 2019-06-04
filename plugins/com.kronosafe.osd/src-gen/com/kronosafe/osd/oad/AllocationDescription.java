/**
 */
package com.kronosafe.osd.oad;

import com.kronosafe.osd.core.AnnotatedElement;
import com.kronosafe.osd.core.VersionedElement;
import org.eclipse.emf.common.util.EList;

import com.kronosafe.osd.oasd.SystemDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The set of allocations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oad.AllocationDescription#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link com.kronosafe.osd.oad.AllocationDescription#getSystemDescriptionRef <em>System Description Ref</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oad.oadPackage#getAllocationDescription()
 * @model
 * @generated
 */
public interface AllocationDescription extends VersionedElement, AnnotatedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oad.Allocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The allocations described in the models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocations</em>' containment reference list.
	 * @see com.kronosafe.osd.oad.oadPackage#getAllocationDescription_Allocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Allocation> getAllocations();

	/**
	 * Returns the value of the '<em><b>System Description Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Description Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Open Architecture System Description referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Description Ref</em>' reference.
	 * @see #setSystemDescriptionRef(SystemDescription)
	 * @see com.kronosafe.osd.oad.oadPackage#getAllocationDescription_SystemDescriptionRef()
	 * @model required="true"
	 * @generated
	 */
	SystemDescription getSystemDescriptionRef();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oad.AllocationDescription#getSystemDescriptionRef <em>System Description Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Description Ref</em>' reference.
	 * @see #getSystemDescriptionRef()
	 * @generated
	 */
	void setSystemDescriptionRef(SystemDescription value);

} // AllocationDescription
