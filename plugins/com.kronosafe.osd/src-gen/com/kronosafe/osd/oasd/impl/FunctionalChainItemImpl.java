/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd.impl;

import com.kronosafe.osd.core.NamedElement;
import com.kronosafe.osd.core.corePackage;

import com.kronosafe.osd.core.impl.IdentifiedElementImpl;

import com.kronosafe.osd.oasd.CommunicationItem;
import com.kronosafe.osd.oasd.FunctionalChainItem;
import com.kronosafe.osd.oasd.TimingConstraint;
import com.kronosafe.osd.oasd.TimingPathItem;
import com.kronosafe.osd.oasd.oasdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Chain Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionalChainItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionalChainItemImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionalChainItemImpl#getTimingpaths <em>Timingpaths</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionalChainItemImpl#getCommunicationItems <em>Communication Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalChainItemImpl extends IdentifiedElementImpl implements FunctionalChainItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingConstraint> constraints;

	/**
	 * The cached value of the '{@link #getTimingpaths() <em>Timingpaths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingpaths()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingPathItem> timingpaths;

	/**
	 * The cached value of the '{@link #getCommunicationItems() <em>Communication Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationItem> communicationItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalChainItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.FUNCTIONAL_CHAIN_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.FUNCTIONAL_CHAIN_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimingConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<TimingConstraint>(TimingConstraint.class, this, oasdPackage.FUNCTIONAL_CHAIN_ITEM__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimingPathItem> getTimingpaths() {
		if (timingpaths == null) {
			timingpaths = new EObjectContainmentEList<TimingPathItem>(TimingPathItem.class, this, oasdPackage.FUNCTIONAL_CHAIN_ITEM__TIMINGPATHS);
		}
		return timingpaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationItem> getCommunicationItems() {
		if (communicationItems == null) {
			communicationItems = new EObjectEList<CommunicationItem>(CommunicationItem.class, this, oasdPackage.FUNCTIONAL_CHAIN_ITEM__COMMUNICATION_ITEMS);
		}
		return communicationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__TIMINGPATHS:
				return ((InternalEList<?>)getTimingpaths()).basicRemove(otherEnd, msgs);
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
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__NAME:
				return getName();
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__CONSTRAINTS:
				return getConstraints();
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__TIMINGPATHS:
				return getTimingpaths();
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__COMMUNICATION_ITEMS:
				return getCommunicationItems();
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
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__NAME:
				setName((String)newValue);
				return;
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends TimingConstraint>)newValue);
				return;
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__TIMINGPATHS:
				getTimingpaths().clear();
				getTimingpaths().addAll((Collection<? extends TimingPathItem>)newValue);
				return;
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__COMMUNICATION_ITEMS:
				getCommunicationItems().clear();
				getCommunicationItems().addAll((Collection<? extends CommunicationItem>)newValue);
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
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__CONSTRAINTS:
				getConstraints().clear();
				return;
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__TIMINGPATHS:
				getTimingpaths().clear();
				return;
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__COMMUNICATION_ITEMS:
				getCommunicationItems().clear();
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
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__TIMINGPATHS:
				return timingpaths != null && !timingpaths.isEmpty();
			case oasdPackage.FUNCTIONAL_CHAIN_ITEM__COMMUNICATION_ITEMS:
				return communicationItems != null && !communicationItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case oasdPackage.FUNCTIONAL_CHAIN_ITEM__NAME: return corePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case corePackage.NAMED_ELEMENT__NAME: return oasdPackage.FUNCTIONAL_CHAIN_ITEM__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FunctionalChainItemImpl
