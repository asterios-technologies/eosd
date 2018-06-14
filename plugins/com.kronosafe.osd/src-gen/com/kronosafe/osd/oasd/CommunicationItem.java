/**
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CommunicationItem represents a data communication channel between a source and a destination.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.CommunicationItem#getPValue <em>PValue</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.CommunicationItem#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.CommunicationItem#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.CommunicationItem#getDst <em>Dst</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.CommunicationItem#getSrc <em>Src</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.CommunicationItem#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getCommunicationItem()
 * @model
 * @generated
 */
public interface CommunicationItem extends IdentifiedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source port of the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Output)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getCommunicationItem_Src()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	Output getSrc();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.CommunicationItem#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Output value);

	/**
	 * Returns the value of the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The destination port of the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dst</em>' reference.
	 * @see #setDst(Input)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getCommunicationItem_Dst()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	Input getDst();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.CommunicationItem#getDst <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' reference.
	 * @see #getDst()
	 * @generated
	 */
	void setDst(Input value);

	/**
	 * Returns the value of the '<em><b>PValue</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PValue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of past value available in the communication channel. This number is an integer with positive and negative supported values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PValue</em>' attribute.
	 * @see #setPValue(int)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getCommunicationItem_PValue()
	 * @model default="-1" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getPValue();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.CommunicationItem#getPValue <em>PValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PValue</em>' attribute.
	 * @see #getPValue()
	 * @generated
	 */
	void setPValue(int value);

	/**
	 * Returns the value of the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a communication is immediate, the data is communicated to the consumer just after the producer execution without waiting the next temporal sycnhronization point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immediate</em>' attribute.
	 * @see #setImmediate(boolean)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getCommunicationItem_Immediate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isImmediate();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.CommunicationItem#isImmediate <em>Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate</em>' attribute.
	 * @see #isImmediate()
	 * @generated
	 */
	void setImmediate(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the communication.
	 * @DEPRECATED
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeItem)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getCommunicationItem_Type()
	 * @model resolveProxies="false"
	 * @generated
	 */
	TypeItem getType();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.CommunicationItem#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeItem value);

	/**
	 * Returns the value of the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing properties of the communication item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporal</em>' containment reference.
	 * @see #setTemporal(Temporal)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getCommunicationItem_Temporal()
	 * @model containment="true"
	 * @generated
	 */
	Temporal getTemporal();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.CommunicationItem#getTemporal <em>Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal</em>' containment reference.
	 * @see #getTemporal()
	 * @generated
	 */
	void setTemporal(Temporal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<IdentifiedElement> getPorts();

} // CommunicationItem
