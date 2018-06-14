/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.impl;

import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.TimingPath;
import com.kronosafe.osd.oasd.oasdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.TimingPathImpl#getDate <em>Date</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.TimingPathImpl#getBehaviorItem <em>Behavior Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingPathImpl extends IdentifiableElementReferencerImpl implements TimingPath {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Integer date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehaviorItem() <em>Behavior Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorItem()
	 * @generated
	 * @ordered
	 */
	protected BehaviorItem behaviorItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.TIMING_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Integer newDate) {
		Integer oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.TIMING_PATH__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorItem getBehaviorItem() {
		if (behaviorItem != null && behaviorItem.eIsProxy()) {
			InternalEObject oldBehaviorItem = (InternalEObject)behaviorItem;
			behaviorItem = (BehaviorItem)eResolveProxy(oldBehaviorItem);
			if (behaviorItem != oldBehaviorItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, oasdPackage.TIMING_PATH__BEHAVIOR_ITEM, oldBehaviorItem, behaviorItem));
			}
		}
		return behaviorItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorItem basicGetBehaviorItem() {
		return behaviorItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehaviorItem(BehaviorItem newBehaviorItem) {
		BehaviorItem oldBehaviorItem = behaviorItem;
		behaviorItem = newBehaviorItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.TIMING_PATH__BEHAVIOR_ITEM, oldBehaviorItem, behaviorItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case oasdPackage.TIMING_PATH__DATE:
				return getDate();
			case oasdPackage.TIMING_PATH__BEHAVIOR_ITEM:
				if (resolve) return getBehaviorItem();
				return basicGetBehaviorItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case oasdPackage.TIMING_PATH__DATE:
				setDate((Integer)newValue);
				return;
			case oasdPackage.TIMING_PATH__BEHAVIOR_ITEM:
				setBehaviorItem((BehaviorItem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case oasdPackage.TIMING_PATH__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case oasdPackage.TIMING_PATH__BEHAVIOR_ITEM:
				setBehaviorItem((BehaviorItem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case oasdPackage.TIMING_PATH__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case oasdPackage.TIMING_PATH__BEHAVIOR_ITEM:
				return behaviorItem != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //TimingPathImpl
