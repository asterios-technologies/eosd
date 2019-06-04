/**
 */
package com.kronosafe.osd.oad;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The allocation of behavior items to software execution unit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oad.Allocation#getSwExecutionUnit <em>Sw Execution Unit</em>}</li>
 *   <li>{@link com.kronosafe.osd.oad.Allocation#getBehaviorItemReferences <em>Behavior Item References</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oad.oadPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Sw Execution Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Execution Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The software execution unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sw Execution Unit</em>' attribute.
	 * @see #setSwExecutionUnit(String)
	 * @see com.kronosafe.osd.oad.oadPackage#getAllocation_SwExecutionUnit()
	 * @model dataType="com.kronosafe.osd.core.AString"
	 * @generated
	 */
	String getSwExecutionUnit();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oad.Allocation#getSwExecutionUnit <em>Sw Execution Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Execution Unit</em>' attribute.
	 * @see #getSwExecutionUnit()
	 * @generated
	 */
	void setSwExecutionUnit(String value);

	/**
	 * Returns the value of the '<em><b>Behavior Item References</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oad.BehaviorItemReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Item References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior item references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior Item References</em>' containment reference list.
	 * @see com.kronosafe.osd.oad.oadPackage#getAllocation_BehaviorItemReferences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BehaviorItemReference> getBehaviorItemReferences();

} // Allocation
