/**
 */
package com.kronosafe.osd.oad.impl;

import com.kronosafe.osd.core.impl.AnnotatedElementImpl;
import com.kronosafe.osd.oad.Allocation;
import com.kronosafe.osd.oad.BehaviorItemReference;
import com.kronosafe.osd.oad.oadPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oad.impl.AllocationImpl#getSwExecutionUnit <em>Sw Execution Unit</em>}</li>
 *   <li>{@link com.kronosafe.osd.oad.impl.AllocationImpl#getBehaviorItemReferences <em>Behavior Item References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationImpl extends AnnotatedElementImpl implements Allocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The default value of the '{@link #getSwExecutionUnit() <em>Sw Execution Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwExecutionUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String SW_EXECUTION_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwExecutionUnit() <em>Sw Execution Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwExecutionUnit()
	 * @generated
	 * @ordered
	 */
	protected String swExecutionUnit = SW_EXECUTION_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehaviorItemReferences() <em>Behavior Item References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorItemReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorItemReference> behaviorItemReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oadPackage.Literals.ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSwExecutionUnit() {
		return swExecutionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwExecutionUnit(String newSwExecutionUnit) {
		String oldSwExecutionUnit = swExecutionUnit;
		swExecutionUnit = newSwExecutionUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oadPackage.ALLOCATION__SW_EXECUTION_UNIT, oldSwExecutionUnit, swExecutionUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviorItemReference> getBehaviorItemReferences() {
		if (behaviorItemReferences == null) {
			behaviorItemReferences = new EObjectContainmentEList<BehaviorItemReference>(BehaviorItemReference.class, this, oadPackage.ALLOCATION__BEHAVIOR_ITEM_REFERENCES);
		}
		return behaviorItemReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case oadPackage.ALLOCATION__BEHAVIOR_ITEM_REFERENCES:
				return ((InternalEList<?>)getBehaviorItemReferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case oadPackage.ALLOCATION__SW_EXECUTION_UNIT:
				return getSwExecutionUnit();
			case oadPackage.ALLOCATION__BEHAVIOR_ITEM_REFERENCES:
				return getBehaviorItemReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case oadPackage.ALLOCATION__SW_EXECUTION_UNIT:
				setSwExecutionUnit((String)newValue);
				return;
			case oadPackage.ALLOCATION__BEHAVIOR_ITEM_REFERENCES:
				getBehaviorItemReferences().clear();
				getBehaviorItemReferences().addAll((Collection<? extends BehaviorItemReference>)newValue);
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
			case oadPackage.ALLOCATION__SW_EXECUTION_UNIT:
				setSwExecutionUnit(SW_EXECUTION_UNIT_EDEFAULT);
				return;
			case oadPackage.ALLOCATION__BEHAVIOR_ITEM_REFERENCES:
				getBehaviorItemReferences().clear();
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
			case oadPackage.ALLOCATION__SW_EXECUTION_UNIT:
				return SW_EXECUTION_UNIT_EDEFAULT == null ? swExecutionUnit != null : !SW_EXECUTION_UNIT_EDEFAULT.equals(swExecutionUnit);
			case oadPackage.ALLOCATION__BEHAVIOR_ITEM_REFERENCES:
				return behaviorItemReferences != null && !behaviorItemReferences.isEmpty();
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
		result.append(" (swExecutionUnit: ");
		result.append(swExecutionUnit);
		result.append(')');
		return result.toString();
	}

} //AllocationImpl
