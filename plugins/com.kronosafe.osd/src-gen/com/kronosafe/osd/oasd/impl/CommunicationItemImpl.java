/**
 */
package com.kronosafe.osd.oasd.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.impl.IdentifiedElementImpl;
import com.kronosafe.osd.oasd.CommunicationItem;
import com.kronosafe.osd.oasd.Input;
import com.kronosafe.osd.oasd.Output;
import com.kronosafe.osd.oasd.Temporal;
import com.kronosafe.osd.oasd.TypeItem;
import com.kronosafe.osd.oasd.oasdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl#getPValue <em>PValue</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl#getDst <em>Dst</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationItemImpl extends IdentifiedElementImpl implements CommunicationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The default value of the '{@link #getPValue() <em>PValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPValue()
	 * @generated
	 * @ordered
	 */
	protected static final int PVALUE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getPValue() <em>PValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPValue()
	 * @generated
	 * @ordered
	 */
	protected int pValue = PVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isImmediate() <em>Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmediate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMMEDIATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImmediate() <em>Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmediate()
	 * @generated
	 * @ordered
	 */
	protected boolean immediate = IMMEDIATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporal()
	 * @generated
	 * @ordered
	 */
	protected Temporal temporal;

	/**
	 * The cached value of the '{@link #getDst() <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDst()
	 * @generated
	 * @ordered
	 */
	protected Input dst;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Output src;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeItem type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.COMMUNICATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc(Output newSrc) {
		Output oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.COMMUNICATION_ITEM__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input getDst() {
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDst(Input newDst) {
		Input oldDst = dst;
		dst = newDst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.COMMUNICATION_ITEM__DST, oldDst, dst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPValue() {
		return pValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPValue(int newPValue) {
		int oldPValue = pValue;
		pValue = newPValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.COMMUNICATION_ITEM__PVALUE, oldPValue, pValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImmediate() {
		return immediate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmediate(boolean newImmediate) {
		boolean oldImmediate = immediate;
		immediate = newImmediate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.COMMUNICATION_ITEM__IMMEDIATE, oldImmediate, immediate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeItem getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeItem newType) {
		TypeItem oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.COMMUNICATION_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getTemporal() {
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporal(Temporal newTemporal, NotificationChain msgs) {
		Temporal oldTemporal = temporal;
		temporal = newTemporal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, oasdPackage.COMMUNICATION_ITEM__TEMPORAL, oldTemporal, newTemporal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporal(Temporal newTemporal) {
		if (newTemporal != temporal) {
			NotificationChain msgs = null;
			if (temporal != null)
				msgs = ((InternalEObject)temporal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - oasdPackage.COMMUNICATION_ITEM__TEMPORAL, null, msgs);
			if (newTemporal != null)
				msgs = ((InternalEObject)newTemporal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - oasdPackage.COMMUNICATION_ITEM__TEMPORAL, null, msgs);
			msgs = basicSetTemporal(newTemporal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.COMMUNICATION_ITEM__TEMPORAL, newTemporal, newTemporal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public EList<IdentifiedElement> getPorts() {
		BasicEList<IdentifiedElement> ports = new BasicEList<IdentifiedElement>();
		Output output = this.getSrc();
		Input input = this.getDst();
		if(output != null)
			ports.add(output);
		if(input != null)
			ports.add(input);
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case oasdPackage.COMMUNICATION_ITEM__TEMPORAL:
				return basicSetTemporal(null, msgs);
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
			case oasdPackage.COMMUNICATION_ITEM__PVALUE:
				return getPValue();
			case oasdPackage.COMMUNICATION_ITEM__IMMEDIATE:
				return isImmediate();
			case oasdPackage.COMMUNICATION_ITEM__TEMPORAL:
				return getTemporal();
			case oasdPackage.COMMUNICATION_ITEM__DST:
				return getDst();
			case oasdPackage.COMMUNICATION_ITEM__SRC:
				return getSrc();
			case oasdPackage.COMMUNICATION_ITEM__TYPE:
				return getType();
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
			case oasdPackage.COMMUNICATION_ITEM__PVALUE:
				setPValue((Integer)newValue);
				return;
			case oasdPackage.COMMUNICATION_ITEM__IMMEDIATE:
				setImmediate((Boolean)newValue);
				return;
			case oasdPackage.COMMUNICATION_ITEM__TEMPORAL:
				setTemporal((Temporal)newValue);
				return;
			case oasdPackage.COMMUNICATION_ITEM__DST:
				setDst((Input)newValue);
				return;
			case oasdPackage.COMMUNICATION_ITEM__SRC:
				setSrc((Output)newValue);
				return;
			case oasdPackage.COMMUNICATION_ITEM__TYPE:
				setType((TypeItem)newValue);
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
			case oasdPackage.COMMUNICATION_ITEM__PVALUE:
				setPValue(PVALUE_EDEFAULT);
				return;
			case oasdPackage.COMMUNICATION_ITEM__IMMEDIATE:
				setImmediate(IMMEDIATE_EDEFAULT);
				return;
			case oasdPackage.COMMUNICATION_ITEM__TEMPORAL:
				setTemporal((Temporal)null);
				return;
			case oasdPackage.COMMUNICATION_ITEM__DST:
				setDst((Input)null);
				return;
			case oasdPackage.COMMUNICATION_ITEM__SRC:
				setSrc((Output)null);
				return;
			case oasdPackage.COMMUNICATION_ITEM__TYPE:
				setType((TypeItem)null);
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
			case oasdPackage.COMMUNICATION_ITEM__PVALUE:
				return pValue != PVALUE_EDEFAULT;
			case oasdPackage.COMMUNICATION_ITEM__IMMEDIATE:
				return immediate != IMMEDIATE_EDEFAULT;
			case oasdPackage.COMMUNICATION_ITEM__TEMPORAL:
				return temporal != null;
			case oasdPackage.COMMUNICATION_ITEM__DST:
				return dst != null;
			case oasdPackage.COMMUNICATION_ITEM__SRC:
				return src != null;
			case oasdPackage.COMMUNICATION_ITEM__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case oasdPackage.COMMUNICATION_ITEM___GET_PORTS:
				return getPorts();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (pValue: ");
		result.append(pValue);
		result.append(", immediate: ");
		result.append(immediate);
		result.append(')');
		return result.toString();
	}

} //CommunicationItemImpl
