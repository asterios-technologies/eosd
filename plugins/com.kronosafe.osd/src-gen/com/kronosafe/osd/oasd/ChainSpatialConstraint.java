/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Spatial Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of paths that are excluded or included in the same memory partition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.ChainSpatialConstraint#getLItems <em>LItems</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.ChainSpatialConstraint#getRItems <em>RItems</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getChainSpatialConstraint()
 * @model
 * @generated
 */
public interface ChainSpatialConstraint extends SpatialConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>LItems</b></em>' reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.FunctionalChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The right elements constrained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LItems</em>' reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getChainSpatialConstraint_LItems()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<FunctionalChain> getLItems();

	/**
	 * Returns the value of the '<em><b>RItems</b></em>' reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.FunctionalChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The left elements constrained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RItems</em>' reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getChainSpatialConstraint_RItems()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<FunctionalChain> getRItems();

} // ChainSpatialConstraint
