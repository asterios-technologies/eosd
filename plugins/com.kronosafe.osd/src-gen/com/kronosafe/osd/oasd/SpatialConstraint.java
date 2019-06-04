/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd;

import com.kronosafe.osd.core.AnnotatedElement;
import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatial Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A memory partition constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.SpatialConstraint#getSpatialOperator <em>Spatial Operator</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getSpatialConstraint()
 * @model abstract="true"
 * @generated
 */
public interface SpatialConstraint extends IdentifiedElement, NamedElement, AnnotatedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Spatial Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.kronosafe.osd.oasd.SpatialOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spatial Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint spatial operator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spatial Operator</em>' attribute.
	 * @see com.kronosafe.osd.oasd.SpatialOperator
	 * @see #setSpatialOperator(SpatialOperator)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSpatialConstraint_SpatialOperator()
	 * @model required="true"
	 * @generated
	 */
	SpatialOperator getSpatialOperator();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.SpatialConstraint#getSpatialOperator <em>Spatial Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Operator</em>' attribute.
	 * @see com.kronosafe.osd.oasd.SpatialOperator
	 * @see #getSpatialOperator()
	 * @generated
	 */
	void setSpatialOperator(SpatialOperator value);

} // SpatialConstraint
