/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oad;

import com.kronosafe.osd.core.IdentifiableElementReferencer;
import com.kronosafe.osd.oasd.BehaviorItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Item Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a behavior item.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItem <em>Behavior Item</em>}</li>
 *   <li>{@link com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItemElement <em>Behavior Item Element</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oad.oadPackage#getBehaviorItemReference()
 * @model
 * @generated
 */
public interface BehaviorItemReference extends IdentifiableElementReferencer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Behavior Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior item id referenced in the Open Architecture System Description model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior Item</em>' attribute.
	 * @see #setBehaviorItem(Integer)
	 * @see com.kronosafe.osd.oad.oadPackage#getBehaviorItemReference_BehaviorItem()
	 * @model dataType="com.kronosafe.osd.core.IdVal" required="true" derived="true"
	 * @generated
	 */
	Integer getBehaviorItem();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItem <em>Behavior Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Item</em>' attribute.
	 * @see #getBehaviorItem()
	 * @generated
	 */
	void setBehaviorItem(Integer value);

	/**
	 * Returns the value of the '<em><b>Behavior Item Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Item Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior item element referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior Item Element</em>' reference.
	 * @see #setBehaviorItemElement(BehaviorItem)
	 * @see com.kronosafe.osd.oad.oadPackage#getBehaviorItemReference_BehaviorItemElement()
	 * @model required="true" transient="true"
	 * @generated
	 */
	BehaviorItem getBehaviorItemElement();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItemElement <em>Behavior Item Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Item Element</em>' reference.
	 * @see #getBehaviorItemElement()
	 * @generated
	 */
	void setBehaviorItemElement(BehaviorItem value);

} // BehaviorItemReference
