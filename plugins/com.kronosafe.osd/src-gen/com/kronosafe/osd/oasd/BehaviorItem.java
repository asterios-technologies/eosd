/**
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BehaviorItem represents a block in the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.BehaviorItem#getKind <em>Kind</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.BehaviorItem#getOrder <em>Order</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.BehaviorItem#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.BehaviorItem#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.BehaviorItem#getGlobals <em>Globals</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.BehaviorItem#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.BehaviorItem#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getBehaviorItem()
 * @model
 * @generated
 */
public interface BehaviorItem extends IdentifiedElement, NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"internal"</code>.
	 * The literals are from the enumeration {@link com.kronosafe.osd.oasd.BehaviorItemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of behaviorItem. A behaviorItem may be internal to a system, produce outputs (out) or acquire inputs (in).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.kronosafe.osd.oasd.BehaviorItemKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(BehaviorItemKind)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getBehaviorItem_Kind()
	 * @model default="internal" unsettable="true" required="true"
	 * @generated
	 */
	BehaviorItemKind getKind();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.BehaviorItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.kronosafe.osd.oasd.BehaviorItemKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BehaviorItemKind value);

	/**
	 * Unsets the value of the '{@link com.kronosafe.osd.oasd.BehaviorItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(BehaviorItemKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link com.kronosafe.osd.oasd.BehaviorItem#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(BehaviorItemKind)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The order of the behaviorItem execution in a time interval of a thread.	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(Integer)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getBehaviorItem_Order()
	 * @model default="0" dataType="com.kronosafe.osd.oasd.OrderVal" required="true"
	 * @generated
	 */
	Integer getOrder();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.BehaviorItem#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.FunctionItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The functions of the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getBehaviorItem_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionItem> getFunctions();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output ports of the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getBehaviorItem_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Globals</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.Global}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The global variables used in the functional code to pass data to functions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Globals</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getBehaviorItem_Globals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Global> getGlobals();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.kronosafe.osd.oasd.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input ports of the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.kronosafe.osd.oasd.oasdPackage#getBehaviorItem_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source element produced by the functional implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getBehaviorItem_Source()
	 * @model containment="true"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.BehaviorItem#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

} // BehaviorItem
