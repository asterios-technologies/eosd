/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.impl;

import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.BlockSpatialConstraint;
import com.kronosafe.osd.oasd.oasdPackage;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Block
 * Spatial Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl#getLItems <em>LItems</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl#getRItems <em>RItems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockSpatialConstraintImpl extends SpatialConstraintImpl implements BlockSpatialConstraint {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	protected EList<BehaviorItem> lItems;
	/**
	 * The cached value of the '{@link #getRItems() <em>RItems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRItems()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorItem> rItems;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockSpatialConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.BLOCK_SPATIAL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviorItem> getLItems() {
		if (lItems == null) {
			lItems = new EObjectEList<BehaviorItem>(BehaviorItem.class, this, oasdPackage.BLOCK_SPATIAL_CONSTRAINT__LITEMS);
		}
		return lItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviorItem> getRItems() {
		if (rItems == null) {
			rItems = new EObjectEList<BehaviorItem>(BehaviorItem.class, this, oasdPackage.BLOCK_SPATIAL_CONSTRAINT__RITEMS);
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
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT__LITEMS:
				return getLItems();
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT__RITEMS:
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
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT__LITEMS:
				getLItems().clear();
				getLItems().addAll((Collection<? extends BehaviorItem>)newValue);
				return;
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT__RITEMS:
				getRItems().clear();
				getRItems().addAll((Collection<? extends BehaviorItem>)newValue);
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
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT__LITEMS:
				getLItems().clear();
				return;
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT__RITEMS:
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
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT__LITEMS:
				return lItems != null && !lItems.isEmpty();
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT__RITEMS:
				return rItems != null && !rItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	

} // BlockSpatialConstraintImpl
