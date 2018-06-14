/**
 */
package com.kronosafe.osd.oasd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.BehaviorItemKind;
import com.kronosafe.osd.oasd.FunctionItem;
import com.kronosafe.osd.oasd.Global;
import com.kronosafe.osd.oasd.Input;
import com.kronosafe.osd.oasd.NamedElement;
import com.kronosafe.osd.oasd.Output;
import com.kronosafe.osd.oasd.Source;
import com.kronosafe.osd.oasd.oasdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl#getGlobals <em>Globals</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorItemImpl extends IdentifiedElementImpl implements BehaviorItem {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final BehaviorItemKind KIND_EDEFAULT = BehaviorItemKind.INTERNAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected BehaviorItemKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDER_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Integer order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionItem> functions;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getGlobals() <em>Globals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobals()
	 * @generated
	 * @ordered
	 */
	protected EList<Global> globals;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.BEHAVIOR_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.BEHAVIOR_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorItemKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(BehaviorItemKind newKind) {
		BehaviorItemKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.BEHAVIOR_ITEM__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKind() {
		BehaviorItemKind oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, oasdPackage.BEHAVIOR_ITEM__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(Integer newOrder) {
		Integer oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.BEHAVIOR_ITEM__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionItem> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<FunctionItem>(FunctionItem.class, this, oasdPackage.BEHAVIOR_ITEM__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, oasdPackage.BEHAVIOR_ITEM__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Global> getGlobals() {
		if (globals == null) {
			globals = new EObjectContainmentEList<Global>(Global.class, this, oasdPackage.BEHAVIOR_ITEM__GLOBALS);
		}
		return globals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, oasdPackage.BEHAVIOR_ITEM__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, oasdPackage.BEHAVIOR_ITEM__SOURCE, oldSource, newSource);
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
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - oasdPackage.BEHAVIOR_ITEM__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - oasdPackage.BEHAVIOR_ITEM__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.BEHAVIOR_ITEM__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case oasdPackage.BEHAVIOR_ITEM__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case oasdPackage.BEHAVIOR_ITEM__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case oasdPackage.BEHAVIOR_ITEM__GLOBALS:
				return ((InternalEList<?>)getGlobals()).basicRemove(otherEnd, msgs);
			case oasdPackage.BEHAVIOR_ITEM__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case oasdPackage.BEHAVIOR_ITEM__SOURCE:
				return basicSetSource(null, msgs);
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
			case oasdPackage.BEHAVIOR_ITEM__NAME:
				return getName();
			case oasdPackage.BEHAVIOR_ITEM__KIND:
				return getKind();
			case oasdPackage.BEHAVIOR_ITEM__ORDER:
				return getOrder();
			case oasdPackage.BEHAVIOR_ITEM__FUNCTIONS:
				return getFunctions();
			case oasdPackage.BEHAVIOR_ITEM__OUTPUTS:
				return getOutputs();
			case oasdPackage.BEHAVIOR_ITEM__GLOBALS:
				return getGlobals();
			case oasdPackage.BEHAVIOR_ITEM__INPUTS:
				return getInputs();
			case oasdPackage.BEHAVIOR_ITEM__SOURCE:
				return getSource();
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
			case oasdPackage.BEHAVIOR_ITEM__NAME:
				setName((String)newValue);
				return;
			case oasdPackage.BEHAVIOR_ITEM__KIND:
				setKind((BehaviorItemKind)newValue);
				return;
			case oasdPackage.BEHAVIOR_ITEM__ORDER:
				setOrder((Integer)newValue);
				return;
			case oasdPackage.BEHAVIOR_ITEM__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends FunctionItem>)newValue);
				return;
			case oasdPackage.BEHAVIOR_ITEM__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Output>)newValue);
				return;
			case oasdPackage.BEHAVIOR_ITEM__GLOBALS:
				getGlobals().clear();
				getGlobals().addAll((Collection<? extends Global>)newValue);
				return;
			case oasdPackage.BEHAVIOR_ITEM__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Input>)newValue);
				return;
			case oasdPackage.BEHAVIOR_ITEM__SOURCE:
				setSource((Source)newValue);
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
			case oasdPackage.BEHAVIOR_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case oasdPackage.BEHAVIOR_ITEM__KIND:
				unsetKind();
				return;
			case oasdPackage.BEHAVIOR_ITEM__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case oasdPackage.BEHAVIOR_ITEM__FUNCTIONS:
				getFunctions().clear();
				return;
			case oasdPackage.BEHAVIOR_ITEM__OUTPUTS:
				getOutputs().clear();
				return;
			case oasdPackage.BEHAVIOR_ITEM__GLOBALS:
				getGlobals().clear();
				return;
			case oasdPackage.BEHAVIOR_ITEM__INPUTS:
				getInputs().clear();
				return;
			case oasdPackage.BEHAVIOR_ITEM__SOURCE:
				setSource((Source)null);
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
			case oasdPackage.BEHAVIOR_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case oasdPackage.BEHAVIOR_ITEM__KIND:
				return isSetKind();
			case oasdPackage.BEHAVIOR_ITEM__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case oasdPackage.BEHAVIOR_ITEM__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case oasdPackage.BEHAVIOR_ITEM__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case oasdPackage.BEHAVIOR_ITEM__GLOBALS:
				return globals != null && !globals.isEmpty();
			case oasdPackage.BEHAVIOR_ITEM__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case oasdPackage.BEHAVIOR_ITEM__SOURCE:
				return source != null;
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
				case oasdPackage.BEHAVIOR_ITEM__NAME: return oasdPackage.NAMED_ELEMENT__NAME;
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
				case oasdPackage.NAMED_ELEMENT__NAME: return oasdPackage.BEHAVIOR_ITEM__NAME;
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
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //BehaviorItemImpl
