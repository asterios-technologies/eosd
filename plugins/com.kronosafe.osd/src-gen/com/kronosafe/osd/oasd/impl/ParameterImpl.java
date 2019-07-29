/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd.impl;

import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.impl.IdentifiableElementReferencerImpl;
import com.kronosafe.osd.oasd.Parameter;
import com.kronosafe.osd.oasd.ParameterDir;
import com.kronosafe.osd.oasd.ParameterReference;
import com.kronosafe.osd.oasd.oasdPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.ParameterImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.ParameterImpl#isPointer <em>Pointer</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.ParameterImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.ParameterImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.ParameterImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends IdentifiableElementReferencerImpl implements Parameter {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDir DIR_EDEFAULT = ParameterDir.INTERN;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected ParameterDir dir = DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #isPointer() <em>Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPointer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POINTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPointer() <em>Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPointer()
	 * @generated
	 * @ordered
	 */
	protected boolean pointer = POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected ParameterReference ref;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDir getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDir(ParameterDir newDir) {
		ParameterDir oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.PARAMETER__DIR, oldDir, dir));
	}
	


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPointer() {
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointer(boolean newPointer) {
		boolean oldPointer = pointer;
		pointer = newPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.PARAMETER__POINTER, oldPointer, pointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.PARAMETER__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterReference getRef() {
		return ref;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public void basicsetRef(ParameterReference newRef) {
		ref = newRef;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 @not generated
	 */
	@Override
	public void setRef(ParameterReference newRef) {
		ParameterReference oldRef = ref;
		ref = newRef;

		if(newRef == null) {
			setDir(DIR_EDEFAULT);
		}
		else if(ref.eClass() == oasdPackage.eINSTANCE.getOutput()) {
			setDir(ParameterDir.OUTPUT);
		}
		else if (ref.eClass() == oasdPackage.eINSTANCE.getInput()) {
			setDir(ParameterDir.INPUT);
		}
		else if (ref.eClass() == oasdPackage.eINSTANCE.getGlobal()) {
			setDir(ParameterDir.INTERN);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.PARAMETER__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case oasdPackage.PARAMETER__DIR:
				return getDir();
			case oasdPackage.PARAMETER__POINTER:
				return isPointer();
			case oasdPackage.PARAMETER__ORDER:
				return getOrder();
			case oasdPackage.PARAMETER__REF:
				return getRef();
			case oasdPackage.PARAMETER__NAME:
				return getName();
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
			case oasdPackage.PARAMETER__DIR:
				setDir((ParameterDir)newValue);
				return;
			case oasdPackage.PARAMETER__POINTER:
				setPointer((Boolean)newValue);
				return;
			case oasdPackage.PARAMETER__ORDER:
				setOrder((Integer)newValue);
				return;
			case oasdPackage.PARAMETER__REF:
				setRef((ParameterReference)newValue);
				return;
			case oasdPackage.PARAMETER__NAME:
				setName((String)newValue);
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
			case oasdPackage.PARAMETER__DIR:
				setDir(DIR_EDEFAULT);
				return;
			case oasdPackage.PARAMETER__POINTER:
				setPointer(POINTER_EDEFAULT);
				return;
			case oasdPackage.PARAMETER__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case oasdPackage.PARAMETER__REF:
				setRef((ParameterReference)null);
				return;
			case oasdPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
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
			case oasdPackage.PARAMETER__DIR:
				return dir != DIR_EDEFAULT;
			case oasdPackage.PARAMETER__POINTER:
				return pointer != POINTER_EDEFAULT;
			case oasdPackage.PARAMETER__ORDER:
				return order != ORDER_EDEFAULT;
			case oasdPackage.PARAMETER__REF:
				return ref != null;
			case oasdPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", pointer: ");
		result.append(pointer);
		result.append(", order: ");
		result.append(order);
		result.append(", name: ");
		result.append(name);
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
		if(eReference == oasdPackage.eINSTANCE.getParameter_Ref()) {
			switch (this.dir.getValue()) {
			case ParameterDir.INPUT_VALUE:
				referenceEClass = oasdPackage.eINSTANCE.getInput();
				break;
			case ParameterDir.OUTPUT_VALUE:
				referenceEClass = oasdPackage.eINSTANCE.getOutput();
				break;
			case ParameterDir.INTERN_VALUE:
				referenceEClass = oasdPackage.eINSTANCE.getGlobal();
				break;
			default:
				break;
			}
		}
		return super.findItem(id, referenceEClass, eRessource);
	}


} //ParameterImpl
