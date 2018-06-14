/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A timing constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.TimingConstraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.TimingConstraint#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getTimingConstraint()
 * @model
 * @generated
 */
public interface TimingConstraint extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.kronosafe.osd.oasd.ConstraintOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing operator of the constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.kronosafe.osd.oasd.ConstraintOperator
	 * @see #setOperator(ConstraintOperator)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getTimingConstraint_Operator()
	 * @model required="true"
	 * @generated
	 */
	ConstraintOperator getOperator();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.TimingConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.kronosafe.osd.oasd.ConstraintOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ConstraintOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing value of the constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getTimingConstraint_Value()
	 * @model dataType="com.kronosafe.osd.oasd.TimeUnit" required="true"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.TimingConstraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getConstraintExpression();

} // TimingConstraint
