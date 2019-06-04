/**
 */
package com.kronosafe.osd.oad.impl;

import com.kronosafe.osd.core.impl.VersionedElementImpl;
import com.kronosafe.osd.oad.Allocation;
import com.kronosafe.osd.oad.AllocationDescription;
import com.kronosafe.osd.oad.oadPackage;
import com.kronosafe.osd.oasd.SystemDescription;
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
 * An implementation of the model object '<em><b>Allocation Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oad.impl.AllocationDescriptionImpl#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link com.kronosafe.osd.oad.impl.AllocationDescriptionImpl#getSystemDescriptionRef <em>System Description Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationDescriptionImpl extends VersionedElementImpl implements AllocationDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The cached value of the '{@link #getAllocations() <em>Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Allocation> allocations;

	/**
	 * The cached value of the '{@link #getSystemDescriptionRef() <em>System Description Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDescriptionRef()
	 * @generated
	 * @ordered
	 */
	protected SystemDescription systemDescriptionRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oadPackage.Literals.ALLOCATION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Allocation> getAllocations() {
		if (allocations == null) {
			allocations = new EObjectContainmentEList<Allocation>(Allocation.class, this, oadPackage.ALLOCATION_DESCRIPTION__ALLOCATIONS);
		}
		return allocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemDescription getSystemDescriptionRef() {
		if (systemDescriptionRef != null && systemDescriptionRef.eIsProxy()) {
			InternalEObject oldSystemDescriptionRef = (InternalEObject)systemDescriptionRef;
			systemDescriptionRef = (SystemDescription)eResolveProxy(oldSystemDescriptionRef);
			if (systemDescriptionRef != oldSystemDescriptionRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, oadPackage.ALLOCATION_DESCRIPTION__SYSTEM_DESCRIPTION_REF, oldSystemDescriptionRef, systemDescriptionRef));
			}
		}
		return systemDescriptionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDescription basicGetSystemDescriptionRef() {
		return systemDescriptionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemDescriptionRef(SystemDescription newSystemDescriptionRef) {
		SystemDescription oldSystemDescriptionRef = systemDescriptionRef;
		systemDescriptionRef = newSystemDescriptionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oadPackage.ALLOCATION_DESCRIPTION__SYSTEM_DESCRIPTION_REF, oldSystemDescriptionRef, systemDescriptionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case oadPackage.ALLOCATION_DESCRIPTION__ALLOCATIONS:
				return ((InternalEList<?>)getAllocations()).basicRemove(otherEnd, msgs);
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
			case oadPackage.ALLOCATION_DESCRIPTION__ALLOCATIONS:
				return getAllocations();
			case oadPackage.ALLOCATION_DESCRIPTION__SYSTEM_DESCRIPTION_REF:
				if (resolve) return getSystemDescriptionRef();
				return basicGetSystemDescriptionRef();
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
			case oadPackage.ALLOCATION_DESCRIPTION__ALLOCATIONS:
				getAllocations().clear();
				getAllocations().addAll((Collection<? extends Allocation>)newValue);
				return;
			case oadPackage.ALLOCATION_DESCRIPTION__SYSTEM_DESCRIPTION_REF:
				setSystemDescriptionRef((SystemDescription)newValue);
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
			case oadPackage.ALLOCATION_DESCRIPTION__ALLOCATIONS:
				getAllocations().clear();
				return;
			case oadPackage.ALLOCATION_DESCRIPTION__SYSTEM_DESCRIPTION_REF:
				setSystemDescriptionRef((SystemDescription)null);
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
			case oadPackage.ALLOCATION_DESCRIPTION__ALLOCATIONS:
				return allocations != null && !allocations.isEmpty();
			case oadPackage.ALLOCATION_DESCRIPTION__SYSTEM_DESCRIPTION_REF:
				return systemDescriptionRef != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationDescriptionImpl
