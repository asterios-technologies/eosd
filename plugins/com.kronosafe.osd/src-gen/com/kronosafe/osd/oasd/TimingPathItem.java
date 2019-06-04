/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd;

import com.kronosafe.osd.core.IdentifiableElementReferencer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Path Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The timing path of the functional chain, i.e. the timing instants through which the functional chain passes. Reserved for internal use.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.TimingPathItem#getDate <em>Date</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.TimingPathItem#getBehaviorItem <em>Behavior Item</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getTimingPathItem()
 * @model
 * @generated
 */
public interface TimingPathItem extends IdentifiableElementReferencer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing instant date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Integer)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getTimingPathItem_Date()
	 * @model dataType="com.kronosafe.osd.oasd.TimeUnit" required="true"
	 * @generated
	 */
	Integer getDate();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.TimingPathItem#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Integer value);

	/**
	 * Returns the value of the '<em><b>Behavior Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behaviorItem through which the functional chain passes at the given timing instant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior Item</em>' reference.
	 * @see #setBehaviorItem(BehaviorItem)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getTimingPathItem_BehaviorItem()
	 * @model required="true"
	 * @generated
	 */
	BehaviorItem getBehaviorItem();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.TimingPathItem#getBehaviorItem <em>Behavior Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Item</em>' reference.
	 * @see #getBehaviorItem()
	 * @generated
	 */
	void setBehaviorItem(BehaviorItem value);

} // TimingPathItem
