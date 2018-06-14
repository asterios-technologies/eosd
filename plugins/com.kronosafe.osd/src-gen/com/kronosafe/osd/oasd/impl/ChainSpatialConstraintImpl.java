/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.impl;

import com.kronosafe.osd.oasd.ChainSpatialConstraint;
import com.kronosafe.osd.oasd.FunctionalChain;
import com.kronosafe.osd.oasd.oasdPackage;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain Spatial Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl#getLItems <em>LItems</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl#getRItems <em>RItems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChainSpatialConstraintImpl extends SpatialConstraintImpl implements ChainSpatialConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The cached value of the '{@link #getLItems() <em>LItems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLItems()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChain> lItems;
	/**
	 * The cached value of the '{@link #getRItems() <em>RItems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRItems()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChain> rItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainSpatialConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.CHAIN_SPATIAL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalChain> getLItems() {
		if (lItems == null) {
			lItems = new EObjectEList<FunctionalChain>(FunctionalChain.class, this, oasdPackage.CHAIN_SPATIAL_CONSTRAINT__LITEMS);
		}
		return lItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalChain> getRItems() {
		if (rItems == null) {
			rItems = new EObjectEList<FunctionalChain>(FunctionalChain.class, this, oasdPackage.CHAIN_SPATIAL_CONSTRAINT__RITEMS);
		}
		return rItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT__LITEMS:
				return getLItems();
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT__RITEMS:
				return getRItems();
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
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT__LITEMS:
				getLItems().clear();
				getLItems().addAll((Collection<? extends FunctionalChain>)newValue);
				return;
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT__RITEMS:
				getRItems().clear();
				getRItems().addAll((Collection<? extends FunctionalChain>)newValue);
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
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT__LITEMS:
				getLItems().clear();
				return;
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT__RITEMS:
				getRItems().clear();
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
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT__LITEMS:
				return lItems != null && !lItems.isEmpty();
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT__RITEMS:
				return rItems != null && !rItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}


} //ChainSpatialConstraintImpl
