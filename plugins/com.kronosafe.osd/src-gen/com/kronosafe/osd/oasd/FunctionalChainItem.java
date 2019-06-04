/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd;

import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Chain Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of communicationItem imply in a specific path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.FunctionalChainItem#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.FunctionalChainItem#getTimingpaths <em>Timingpaths</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.FunctionalChainItem#getCommunicationItems <em>Communication Items</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionalChainItem()
 * @model
 * @generated
 */
public interface FunctionalChainItem extends IdentifiedElement, NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.TimingConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of constraints if ChainSpatialConstraints exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionalChainItem_Constraints()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<TimingConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Timingpaths</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.TimingPathItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing paths of the functional chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timingpaths</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionalChainItem_Timingpaths()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingPathItem> getTimingpaths();

	/**
	 * Returns the value of the '<em><b>Communication Items</b></em>' reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.CommunicationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication items implied in the path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Items</em>' reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionalChainItem_CommunicationItems()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<CommunicationItem> getCommunicationItems();

} // FunctionalChainItem
