/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.impl;

import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.NamedElement;
import com.kronosafe.osd.core.corePackage;
import com.kronosafe.osd.core.impl.IdentifiedElementImpl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.kronosafe.osd.oasd.SpatialConstraint;
import com.kronosafe.osd.oasd.SpatialOperator;
import com.kronosafe.osd.oasd.oasdPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Spatial
 * Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SpatialConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SpatialConstraintImpl#getSpatialOperator <em>Spatial Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpatialConstraintImpl extends IdentifiedElementImpl implements SpatialConstraint {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The default value of the '{@link #getSpatialOperator() <em>Spatial Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSpatialOperator()
	 * @generated
	 * @ordered
	 */
	protected static final SpatialOperator SPATIAL_OPERATOR_EDEFAULT = SpatialOperator.EXCLUDE;

	/**
	 * The cached value of the '{@link #getSpatialOperator() <em>Spatial Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSpatialOperator()
	 * @generated
	 * @ordered
	 */
	protected SpatialOperator spatialOperator = SPATIAL_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SpatialConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.SPATIAL_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.SPATIAL_CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialOperator getSpatialOperator() {
		return spatialOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpatialOperator(SpatialOperator newSpatialOperator) {
		SpatialOperator oldSpatialOperator = spatialOperator;
		spatialOperator = newSpatialOperator == null ? SPATIAL_OPERATOR_EDEFAULT : newSpatialOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.SPATIAL_CONSTRAINT__SPATIAL_OPERATOR, oldSpatialOperator, spatialOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	abstract public EList<? extends IdentifiedElement> getRItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	abstract public EList<? extends IdentifiedElement> getLItems();
	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @not generated
	 */
	public String getConstraintExpression() {
		String result = "{";

		for (Iterator<? extends IdentifiedElement> iterator = this.getLItems().iterator(); iterator.hasNext();) {
			IdentifiedElement item = iterator.next();
			if (item instanceof NamedElement) {
				result += ((NamedElement) item).getName();
				if (iterator.hasNext())
					result += ", ";
			}
		}
		result += "}";

		switch (this.spatialOperator) {
		case INCLUDE:

			result += " \u022C3 ";
			break;
		case EXCLUDE:
			result += " \u02206 ";
			break;
		default:
			break;
		}

		for (Iterator<? extends IdentifiedElement> iterator = this.getRItems().iterator(); iterator.hasNext();) {
			IdentifiedElement item = iterator.next();
			if (item instanceof NamedElement) {
				result += ((NamedElement) item).getName();
				if (iterator.hasNext())
					result += ", ";
			}
		}
		result += "}";

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case oasdPackage.SPATIAL_CONSTRAINT__NAME:
				return getName();
			case oasdPackage.SPATIAL_CONSTRAINT__SPATIAL_OPERATOR:
				return getSpatialOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case oasdPackage.SPATIAL_CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case oasdPackage.SPATIAL_CONSTRAINT__SPATIAL_OPERATOR:
				setSpatialOperator((SpatialOperator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case oasdPackage.SPATIAL_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case oasdPackage.SPATIAL_CONSTRAINT__SPATIAL_OPERATOR:
				setSpatialOperator(SPATIAL_OPERATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case oasdPackage.SPATIAL_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case oasdPackage.SPATIAL_CONSTRAINT__SPATIAL_OPERATOR:
				return spatialOperator != SPATIAL_OPERATOR_EDEFAULT;
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
				case oasdPackage.SPATIAL_CONSTRAINT__NAME: return corePackage.NAMED_ELEMENT__NAME;
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
				case corePackage.NAMED_ELEMENT__NAME: return oasdPackage.SPATIAL_CONSTRAINT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", spatialOperator: ");
		result.append(spatialOperator);
		result.append(')');
		return result.toString();
	}

} // SpatialConstraintImpl
