/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd.provider;


import com.kronosafe.osd.oasd.SystemDescription;
import com.kronosafe.osd.oasd.oasdFactory;
import com.kronosafe.osd.oasd.oasdPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.kronosafe.osd.oasd.SystemDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemDescriptionItemProvider extends IdentifiableElementReferencerItemProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDescriptionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addTimeUnitPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addTimeUnitDeclarationPropertyDescriptor(object);
			addCommunicationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 oasdPackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VersionedElement_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VersionedElement_version_feature", "_UI_VersionedElement_type"),
				 oasdPackage.Literals.VERSIONED_ELEMENT__VERSION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemDescription_timeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemDescription_timeUnit_feature", "_UI_SystemDescription_type"),
				 oasdPackage.Literals.SYSTEM_DESCRIPTION__TIME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemDescription_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemDescription_source_feature", "_UI_SystemDescription_type"),
				 oasdPackage.Literals.SYSTEM_DESCRIPTION__SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Unit Declaration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeUnitDeclarationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemDescription_timeUnitDeclaration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemDescription_timeUnitDeclaration_feature", "_UI_SystemDescription_type"),
				 oasdPackage.Literals.SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Communications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemDescription_communications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemDescription_communications_feature", "_UI_SystemDescription_type"),
				 oasdPackage.Literals.SYSTEM_DESCRIPTION__COMMUNICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(oasdPackage.Literals.SYSTEM_DESCRIPTION__TYPES);
			childrenFeatures.add(oasdPackage.Literals.SYSTEM_DESCRIPTION__BEHAVIORS);
			childrenFeatures.add(oasdPackage.Literals.SYSTEM_DESCRIPTION__CODES);
			childrenFeatures.add(oasdPackage.Literals.SYSTEM_DESCRIPTION__COMMUNICATIONS);
			childrenFeatures.add(oasdPackage.Literals.SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS);
			childrenFeatures.add(oasdPackage.Literals.SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS);
			childrenFeatures.add(oasdPackage.Literals.SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS);
			childrenFeatures.add(oasdPackage.Literals.SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SystemDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemDescription"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SystemDescription)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SystemDescription_type") :
			getString("_UI_SystemDescription_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SystemDescription.class)) {
			case oasdPackage.SYSTEM_DESCRIPTION__NAME:
			case oasdPackage.SYSTEM_DESCRIPTION__VERSION:
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT:
			case oasdPackage.SYSTEM_DESCRIPTION__SOURCE:
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__TYPES:
			case oasdPackage.SYSTEM_DESCRIPTION__BEHAVIORS:
			case oasdPackage.SYSTEM_DESCRIPTION__CODES:
			case oasdPackage.SYSTEM_DESCRIPTION__COMMUNICATIONS:
			case oasdPackage.SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS:
			case oasdPackage.SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS:
			case oasdPackage.SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS:
			case oasdPackage.SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(oasdPackage.Literals.SYSTEM_DESCRIPTION__TYPES,
				 oasdFactory.eINSTANCE.createTypeItem()));

		newChildDescriptors.add
			(createChildParameter
				(oasdPackage.Literals.SYSTEM_DESCRIPTION__BEHAVIORS,
				 oasdFactory.eINSTANCE.createBehaviorItem()));

		newChildDescriptors.add
			(createChildParameter
				(oasdPackage.Literals.SYSTEM_DESCRIPTION__CODES,
				 oasdFactory.eINSTANCE.createCode()));

		newChildDescriptors.add
			(createChildParameter
				(oasdPackage.Literals.SYSTEM_DESCRIPTION__COMMUNICATIONS,
				 oasdFactory.eINSTANCE.createCommunicationItem()));

		newChildDescriptors.add
			(createChildParameter
				(oasdPackage.Literals.SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS,
				 oasdFactory.eINSTANCE.createFunctionalChain()));

		newChildDescriptors.add
			(createChildParameter
				(oasdPackage.Literals.SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS,
				 oasdFactory.eINSTANCE.createChainSpatialConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(oasdPackage.Literals.SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS,
				 oasdFactory.eINSTANCE.createBlockSpatialConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(oasdPackage.Literals.SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS,
				 oasdFactory.eINSTANCE.createComSpatialConstraint()));
	}

}
