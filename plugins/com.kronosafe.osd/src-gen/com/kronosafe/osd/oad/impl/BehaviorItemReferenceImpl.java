/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oad.impl;

import com.kronosafe.osd.core.impl.IdentifiableElementReferencerImpl;
import com.kronosafe.osd.oad.BehaviorItemReference;
import com.kronosafe.osd.oad.oadPackage;

import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.oasdPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Behavior Item Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oad.impl.BehaviorItemReferenceImpl#getBehaviorItem <em>Behavior Item</em>}</li>
 *   <li>{@link com.kronosafe.osd.oad.impl.BehaviorItemReferenceImpl#getBehaviorItemElement <em>Behavior Item Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorItemReferenceImpl extends IdentifiableElementReferencerImpl implements BehaviorItemReference {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The default value of the '{@link #getBehaviorItem() <em>Behavior Item</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBehaviorItem()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BEHAVIOR_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehaviorItem() <em>Behavior Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorItem()
	 * @generated
	 * @ordered
	 */
	protected Integer behaviorItem = BEHAVIOR_ITEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehaviorItemElement() <em>Behavior Item Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBehaviorItemElement()
	 * @generated
	 * @ordered
	 */
	protected BehaviorItem behaviorItemElement;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorItemReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oadPackage.Literals.BEHAVIOR_ITEM_REFERENCE;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBehaviorItem() {
		return behaviorItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This function is override from generation to manage the model load. In that case, the element is set.
	 * @not generated
	 */
	public void setBehaviorItem(Integer newBehaviorItem) {
		Integer oldBehaviorItem = behaviorItem;
		behaviorItem = newBehaviorItem;
		
		if(newBehaviorItem == null)
			basicSetBehaviorItemElement(null);
		
		if(oldBehaviorItem != newBehaviorItem && eResource() != null) {
			EcoreUtil.resolveAll(this);
			BehaviorItem item = (BehaviorItem) this.findItemInResourceSet(newBehaviorItem, oasdPackage.eINSTANCE.getBehaviorItem());
			basicSetBehaviorItemElement(item);
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM, oldBehaviorItem, behaviorItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public void basicSetBehaviorItem(Integer newBehaviorItem) {
		behaviorItem = newBehaviorItem;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @not generated
	 */
	public void basicSetBehaviorItemElement(BehaviorItem newBehaviorItemElement) {
		behaviorItemElement = newBehaviorItemElement;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Need to override that function to take in account the case of a setBehaviorItem with an eRessource==null. In that case the behaviorItemElement is not yet set.
	 * @not generated
	 */
	public BehaviorItem getBehaviorItemElement() {
		//Need to override that function to take in account the case of a setBehaviorItem with an eRessource==null. In that case the behaviorItemElement is not yet set.
		if(behaviorItemElement == null && behaviorItem != null && eResource() != null){
			EcoreUtil.resolveAll(eResource());
			BehaviorItem item = (BehaviorItem) this.findItemInResourceSet(behaviorItem, oasdPackage.eINSTANCE.getBehaviorItem());
			basicSetBehaviorItemElement(item);
		}//no need to test the case of behaviorItem != behaviorItemElement.getID() because this is managed by the setBehaviorItem/setBehaviorItemElement
		
		if (behaviorItemElement != null && behaviorItemElement.eIsProxy()) {
			InternalEObject oldBehaviorItemElement = (InternalEObject)behaviorItemElement;
			behaviorItemElement = (BehaviorItem)eResolveProxy(oldBehaviorItemElement);
			if (behaviorItemElement != oldBehaviorItemElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM_ELEMENT, oldBehaviorItemElement, behaviorItemElement));
			}
		}
		
		return behaviorItemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorItem basicGetBehaviorItemElement() {
		return behaviorItemElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @not generated
	 */
	public void setBehaviorItemElement(BehaviorItem newBehaviorItemElement) {
		BehaviorItem oldBehaviorItemElement = behaviorItemElement;
		behaviorItemElement = newBehaviorItemElement;
		
		if(newBehaviorItemElement == null) {
			basicSetBehaviorItem(null);
		}else {
			basicSetBehaviorItem(newBehaviorItemElement.getId());
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM_ELEMENT, oldBehaviorItemElement, behaviorItemElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM:
				return getBehaviorItem();
			case oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM_ELEMENT:
				if (resolve) return getBehaviorItemElement();
				return basicGetBehaviorItemElement();
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
			case oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM:
				setBehaviorItem((Integer)newValue);
				return;
			case oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM_ELEMENT:
				setBehaviorItemElement((BehaviorItem)newValue);
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
			case oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM:
				setBehaviorItem(BEHAVIOR_ITEM_EDEFAULT);
				return;
			case oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM_ELEMENT:
				setBehaviorItemElement((BehaviorItem)null);
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
			case oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM:
				return BEHAVIOR_ITEM_EDEFAULT == null ? behaviorItem != null : !BEHAVIOR_ITEM_EDEFAULT.equals(behaviorItem);
			case oadPackage.BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM_ELEMENT:
				return behaviorItemElement != null;
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
		result.append(" (behaviorItem: ");
		result.append(behaviorItem);
		result.append(')');
		return result.toString();
	}

} // BehaviorItemReferenceImpl
