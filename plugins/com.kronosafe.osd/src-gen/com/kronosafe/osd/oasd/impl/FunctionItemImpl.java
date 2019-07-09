/**
 */
package com.kronosafe.osd.oasd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import com.kronosafe.osd.core.impl.NamedElementImpl;
import com.kronosafe.osd.oasd.FunctionItem;
import com.kronosafe.osd.oasd.FunctionKind;
import com.kronosafe.osd.oasd.Parameter;
import com.kronosafe.osd.oasd.ReturnValue;
import com.kronosafe.osd.oasd.oasdPackage;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl#getBudget <em>Budget</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl#getExecTWLength <em>Exec TW Length</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl#getExecTWRhythm <em>Exec TW Rhythm</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionItemImpl extends NamedElementImpl implements FunctionItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final FunctionKind KIND_EDEFAULT = FunctionKind.INIT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected FunctionKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected static final Long BUDGET_EDEFAULT = new Long(0L);

	/**
	 * The cached value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected Long budget = BUDGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecTWLength() <em>Exec TW Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecTWLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXEC_TW_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecTWLength() <em>Exec TW Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecTWLength()
	 * @generated
	 * @ordered
	 */
	protected Integer execTWLength = EXEC_TW_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecTWRhythm() <em>Exec TW Rhythm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecTWRhythm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXEC_TW_RHYTHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecTWRhythm() <em>Exec TW Rhythm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecTWRhythm()
	 * @generated
	 * @ordered
	 */
	protected Integer execTWRhythm = EXEC_TW_RHYTHM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected ReturnValue returnValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.FUNCTION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(FunctionKind newKind) {
		FunctionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.FUNCTION_ITEM__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBudget() {
		return budget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudget(Long newBudget) {
		Long oldBudget = budget;
		budget = newBudget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.FUNCTION_ITEM__BUDGET, oldBudget, budget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExecTWLength() {
		return execTWLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecTWLength(Integer newExecTWLength) {
		Integer oldExecTWLength = execTWLength;
		execTWLength = newExecTWLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.FUNCTION_ITEM__EXEC_TW_LENGTH, oldExecTWLength, execTWLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExecTWRhythm() {
		return execTWRhythm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecTWRhythm(Integer newExecTWRhythm) {
		Integer oldExecTWRhythm = execTWRhythm;
		execTWRhythm = newExecTWRhythm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.FUNCTION_ITEM__EXEC_TW_RHYTHM, oldExecTWRhythm, execTWRhythm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, oasdPackage.FUNCTION_ITEM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnValue getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnValue(ReturnValue newReturnValue, NotificationChain msgs) {
		ReturnValue oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, oasdPackage.FUNCTION_ITEM__RETURN_VALUE, oldReturnValue, newReturnValue);
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
	public void setReturnValue(ReturnValue newReturnValue) {
		if (newReturnValue != returnValue) {
			NotificationChain msgs = null;
			if (returnValue != null)
				msgs = ((InternalEObject)returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - oasdPackage.FUNCTION_ITEM__RETURN_VALUE, null, msgs);
			if (newReturnValue != null)
				msgs = ((InternalEObject)newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - oasdPackage.FUNCTION_ITEM__RETURN_VALUE, null, msgs);
			msgs = basicSetReturnValue(newReturnValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.FUNCTION_ITEM__RETURN_VALUE, newReturnValue, newReturnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case oasdPackage.FUNCTION_ITEM__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case oasdPackage.FUNCTION_ITEM__RETURN_VALUE:
				return basicSetReturnValue(null, msgs);
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
			case oasdPackage.FUNCTION_ITEM__KIND:
				return getKind();
			case oasdPackage.FUNCTION_ITEM__BUDGET:
				return getBudget();
			case oasdPackage.FUNCTION_ITEM__EXEC_TW_LENGTH:
				return getExecTWLength();
			case oasdPackage.FUNCTION_ITEM__EXEC_TW_RHYTHM:
				return getExecTWRhythm();
			case oasdPackage.FUNCTION_ITEM__PARAMETERS:
				return getParameters();
			case oasdPackage.FUNCTION_ITEM__RETURN_VALUE:
				return getReturnValue();
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
			case oasdPackage.FUNCTION_ITEM__KIND:
				setKind((FunctionKind)newValue);
				return;
			case oasdPackage.FUNCTION_ITEM__BUDGET:
				setBudget((Long)newValue);
				return;
			case oasdPackage.FUNCTION_ITEM__EXEC_TW_LENGTH:
				setExecTWLength((Integer)newValue);
				return;
			case oasdPackage.FUNCTION_ITEM__EXEC_TW_RHYTHM:
				setExecTWRhythm((Integer)newValue);
				return;
			case oasdPackage.FUNCTION_ITEM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case oasdPackage.FUNCTION_ITEM__RETURN_VALUE:
				setReturnValue((ReturnValue)newValue);
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
			case oasdPackage.FUNCTION_ITEM__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case oasdPackage.FUNCTION_ITEM__BUDGET:
				setBudget(BUDGET_EDEFAULT);
				return;
			case oasdPackage.FUNCTION_ITEM__EXEC_TW_LENGTH:
				setExecTWLength(EXEC_TW_LENGTH_EDEFAULT);
				return;
			case oasdPackage.FUNCTION_ITEM__EXEC_TW_RHYTHM:
				setExecTWRhythm(EXEC_TW_RHYTHM_EDEFAULT);
				return;
			case oasdPackage.FUNCTION_ITEM__PARAMETERS:
				getParameters().clear();
				return;
			case oasdPackage.FUNCTION_ITEM__RETURN_VALUE:
				setReturnValue((ReturnValue)null);
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
			case oasdPackage.FUNCTION_ITEM__KIND:
				return kind != KIND_EDEFAULT;
			case oasdPackage.FUNCTION_ITEM__BUDGET:
				return BUDGET_EDEFAULT == null ? budget != null : !BUDGET_EDEFAULT.equals(budget);
			case oasdPackage.FUNCTION_ITEM__EXEC_TW_LENGTH:
				return EXEC_TW_LENGTH_EDEFAULT == null ? execTWLength != null : !EXEC_TW_LENGTH_EDEFAULT.equals(execTWLength);
			case oasdPackage.FUNCTION_ITEM__EXEC_TW_RHYTHM:
				return EXEC_TW_RHYTHM_EDEFAULT == null ? execTWRhythm != null : !EXEC_TW_RHYTHM_EDEFAULT.equals(execTWRhythm);
			case oasdPackage.FUNCTION_ITEM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case oasdPackage.FUNCTION_ITEM__RETURN_VALUE:
				return returnValue != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", budget: ");
		result.append(budget);
		result.append(", execTWLength: ");
		result.append(execTWLength);
		result.append(", execTWRhythm: ");
		result.append(execTWRhythm);
		result.append(')');
		return result.toString();
	}

} //FunctionItemImpl
