/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd.impl;

import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.impl.IdentifiableElementReferencerImpl;
import com.kronosafe.osd.oasd.ReturnType;
import com.kronosafe.osd.oasd.ReturnValue;
import com.kronosafe.osd.oasd.ReturnValueReference;
import com.kronosafe.osd.oasd.oasdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.ReturnValueImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.ReturnValueImpl#getDir <em>Dir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnValueImpl extends IdentifiableElementReferencerImpl implements ReturnValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected ReturnValueReference ref;

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnType DIR_EDEFAULT = ReturnType.INTERN;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected ReturnType dir = DIR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.RETURN_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnValueReference getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (ReturnValueReference)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, oasdPackage.RETURN_VALUE__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnValueReference basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public void setRef(ReturnValueReference newRef) {
		ReturnValueReference oldRef = ref;
		ref = newRef;
		if(newRef == null) {
			setDir(DIR_EDEFAULT);
		}
		else if(ref.eClass() == oasdPackage.eINSTANCE.getOutput()) {
			setDir(ReturnType.OUTPUT);
		}
		else if (ref.eClass() == oasdPackage.eINSTANCE.getGlobal()) {
			setDir(ReturnType.INTERN);
		}		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.RETURN_VALUE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDir(ReturnType newDir) {
		ReturnType oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.RETURN_VALUE__DIR, oldDir, dir));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case oasdPackage.RETURN_VALUE__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case oasdPackage.RETURN_VALUE__DIR:
				return getDir();
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
			case oasdPackage.RETURN_VALUE__REF:
				setRef((ReturnValueReference)newValue);
				return;
			case oasdPackage.RETURN_VALUE__DIR:
				setDir((ReturnType)newValue);
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
			case oasdPackage.RETURN_VALUE__REF:
				setRef((ReturnValueReference)null);
				return;
			case oasdPackage.RETURN_VALUE__DIR:
				setDir(DIR_EDEFAULT);
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
			case oasdPackage.RETURN_VALUE__REF:
				return ref != null;
			case oasdPackage.RETURN_VALUE__DIR:
				return dir != DIR_EDEFAULT;
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
		result.append(" (dir: ");
		result.append(dir);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public IdentifiedElement findItem(Integer id, EReference eReference, Resource eRessource) {
		EClass referenceEClass = eReference.getEReferenceType();
		if(eReference == oasdPackage.eINSTANCE.getReturnValue_Ref()) {
			switch (this.dir.getValue()) {
			case ReturnType.OUTPUT_VALUE:
				referenceEClass = oasdPackage.eINSTANCE.getOutput();
				break;
			case ReturnType.INTERN_VALUE:
				referenceEClass = oasdPackage.eINSTANCE.getGlobal();
				break;
			default:
				break;
			}
		}
		return super.findItem(id, referenceEClass, eRessource);
	}	

} //ReturnValueImpl
