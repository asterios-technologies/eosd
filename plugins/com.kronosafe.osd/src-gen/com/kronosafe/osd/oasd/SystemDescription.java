/**
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getTypes <em>Types</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getCodes <em>Codes</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getSource <em>Source</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getTimeUnitDeclaration <em>Time Unit Declaration</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getCommunications <em>Communications</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getFunctionalChains <em>Functional Chains</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getChainSpatialConstraints <em>Chain Spatial Constraints</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getBlockSpatialConstraints <em>Block Spatial Constraints</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.SystemDescription#getComSpatialConstraints <em>Com Spatial Constraints</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription()
 * @model
 * @generated
 */
public interface SystemDescription extends IdentifiableElementReferencer, NamedElement, VersionedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.TypeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system owned types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeItem> getTypes();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.BehaviorItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system owned behavior items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_Behaviors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BehaviorItem> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Codes</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system owned codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Codes</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_Codes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getCodes();

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The default value is <code>"ast_realtime_us"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit used for the timing values in the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(String)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_TimeUnit()
	 * @model default="ast_realtime_us" dataType="com.kronosafe.osd.oasd.AString" required="true"
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.SystemDescription#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The default value is <code>"realtime"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the application timing source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_Source()
	 * @model default="realtime" dataType="com.kronosafe.osd.oasd.AString" required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.SystemDescription#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Time Unit Declaration</b></em>' attribute.
	 * The default value is <code>"asterios.h"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The file path in in which are declared the timing units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Unit Declaration</em>' attribute.
	 * @see #setTimeUnitDeclaration(String)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_TimeUnitDeclaration()
	 * @model default="asterios.h" dataType="com.kronosafe.osd.oasd.AString" required="true"
	 * @generated
	 */
	String getTimeUnitDeclaration();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.SystemDescription#getTimeUnitDeclaration <em>Time Unit Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit Declaration</em>' attribute.
	 * @see #getTimeUnitDeclaration()
	 * @generated
	 */
	void setTimeUnitDeclaration(String value);

	/**
	 * Returns the value of the '<em><b>Communications</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.CommunicationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system owned communication items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communications</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_Communications()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationItem> getCommunications();

	/**
	 * Returns the value of the '<em><b>Functional Chains</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.FunctionalChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Chains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system owned functional chains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functional Chains</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_FunctionalChains()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalChain> getFunctionalChains();

	/**
	 * Returns the value of the '<em><b>Chain Spatial Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.ChainSpatialConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system owned chain spatial constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chain Spatial Constraints</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_ChainSpatialConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChainSpatialConstraint> getChainSpatialConstraints();

	/**
	 * Returns the value of the '<em><b>Block Spatial Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.BlockSpatialConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Spatial Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system owned block spatial constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Spatial Constraints</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_BlockSpatialConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockSpatialConstraint> getBlockSpatialConstraints();

	/**
	 * Returns the value of the '<em><b>Com Spatial Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.ComSpatialConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Spatial Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system owned com spatial constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Com Spatial Constraints</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getSystemDescription_ComSpatialConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComSpatialConstraint> getComSpatialConstraints();

} // SystemDescription
