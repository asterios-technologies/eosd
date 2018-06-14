/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Chain</b></em>'.
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
 *   <li>{@link com.kronosafe.osd.oasd.FunctionalChain#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.FunctionalChain#getTimingpaths <em>Timingpaths</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.FunctionalChain#getCommunicationItems <em>Communication Items</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionalChain()
 * @model
 * @generated
 */
public interface FunctionalChain extends IdentifiedElement, NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Communication Items</b></em>' reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.CommunicationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication items implied in the path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Items</em>' reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionalChain_CommunicationItems()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<CommunicationItem> getCommunicationItems();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.TimingConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of constraints if ChainSpatialConstraints exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionalChain_Constraints()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<TimingConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Timingpaths</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.TimingPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timingpaths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing paths of the functional chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timingpaths</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionalChain_Timingpaths()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingPath> getTimingpaths();

} // FunctionalChain
