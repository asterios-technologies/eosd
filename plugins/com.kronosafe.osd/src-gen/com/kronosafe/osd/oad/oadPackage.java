/**
 */
package com.kronosafe.osd.oad;

import com.kronosafe.osd.core.corePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The open allocation description used to describe the allocations of the behaviorItems to specific software execution units.
 * <!-- end-model-doc -->
 * @see com.kronosafe.osd.oad.oadFactory
 * @model kind="package"
 * @generated
 */
public interface oadPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oad";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.krono-safe.com/oad";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	oadPackage eINSTANCE = com.kronosafe.osd.oad.impl.oadPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oad.impl.BehaviorItemReferenceImpl <em>Behavior Item Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oad.impl.BehaviorItemReferenceImpl
	 * @see com.kronosafe.osd.oad.impl.oadPackageImpl#getBehaviorItemReference()
	 * @generated
	 */
	int BEHAVIOR_ITEM_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_REFERENCE__ANNOTATIONS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Behavior Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior Item Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM_ELEMENT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior Item Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_REFERENCE_FEATURE_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_REFERENCE___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_REFERENCE___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_REFERENCE___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_REFERENCE___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Behavior Item Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_REFERENCE_OPERATION_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oad.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oad.impl.AllocationImpl
	 * @see com.kronosafe.osd.oad.impl.oadPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 1;

	/**
	 * The feature id for the '<em><b>Sw Execution Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__SW_EXECUTION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Behavior Item References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__BEHAVIOR_ITEM_REFERENCES = 1;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oad.impl.AllocationDescriptionImpl <em>Allocation Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oad.impl.AllocationDescriptionImpl
	 * @see com.kronosafe.osd.oad.impl.oadPackageImpl#getAllocationDescription()
	 * @generated
	 */
	int ALLOCATION_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DESCRIPTION__VERSION = corePackage.VERSIONED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DESCRIPTION__ALLOCATIONS = corePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Description Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DESCRIPTION__SYSTEM_DESCRIPTION_REF = corePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocation Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DESCRIPTION_FEATURE_COUNT = corePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Allocation Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DESCRIPTION_OPERATION_COUNT = corePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oad.BehaviorItemReference <em>Behavior Item Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Item Reference</em>'.
	 * @see com.kronosafe.osd.oad.BehaviorItemReference
	 * @generated
	 */
	EClass getBehaviorItemReference();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItem <em>Behavior Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Item</em>'.
	 * @see com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItem()
	 * @see #getBehaviorItemReference()
	 * @generated
	 */
	EAttribute getBehaviorItemReference_BehaviorItem();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItemElement <em>Behavior Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior Item Element</em>'.
	 * @see com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItemElement()
	 * @see #getBehaviorItemReference()
	 * @generated
	 */
	EReference getBehaviorItemReference_BehaviorItemElement();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oad.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see com.kronosafe.osd.oad.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oad.Allocation#getSwExecutionUnit <em>Sw Execution Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Execution Unit</em>'.
	 * @see com.kronosafe.osd.oad.Allocation#getSwExecutionUnit()
	 * @see #getAllocation()
	 * @generated
	 */
	EAttribute getAllocation_SwExecutionUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oad.Allocation#getBehaviorItemReferences <em>Behavior Item References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior Item References</em>'.
	 * @see com.kronosafe.osd.oad.Allocation#getBehaviorItemReferences()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_BehaviorItemReferences();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oad.AllocationDescription <em>Allocation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Description</em>'.
	 * @see com.kronosafe.osd.oad.AllocationDescription
	 * @generated
	 */
	EClass getAllocationDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oad.AllocationDescription#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocations</em>'.
	 * @see com.kronosafe.osd.oad.AllocationDescription#getAllocations()
	 * @see #getAllocationDescription()
	 * @generated
	 */
	EReference getAllocationDescription_Allocations();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oad.AllocationDescription#getSystemDescriptionRef <em>System Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Description Ref</em>'.
	 * @see com.kronosafe.osd.oad.AllocationDescription#getSystemDescriptionRef()
	 * @see #getAllocationDescription()
	 * @generated
	 */
	EReference getAllocationDescription_SystemDescriptionRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	oadFactory getoadFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oad.impl.BehaviorItemReferenceImpl <em>Behavior Item Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oad.impl.BehaviorItemReferenceImpl
		 * @see com.kronosafe.osd.oad.impl.oadPackageImpl#getBehaviorItemReference()
		 * @generated
		 */
		EClass BEHAVIOR_ITEM_REFERENCE = eINSTANCE.getBehaviorItemReference();

		/**
		 * The meta object literal for the '<em><b>Behavior Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM = eINSTANCE.getBehaviorItemReference_BehaviorItem();

		/**
		 * The meta object literal for the '<em><b>Behavior Item Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM_ELEMENT = eINSTANCE.getBehaviorItemReference_BehaviorItemElement();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oad.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oad.impl.AllocationImpl
		 * @see com.kronosafe.osd.oad.impl.oadPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Sw Execution Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION__SW_EXECUTION_UNIT = eINSTANCE.getAllocation_SwExecutionUnit();

		/**
		 * The meta object literal for the '<em><b>Behavior Item References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__BEHAVIOR_ITEM_REFERENCES = eINSTANCE.getAllocation_BehaviorItemReferences();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oad.impl.AllocationDescriptionImpl <em>Allocation Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oad.impl.AllocationDescriptionImpl
		 * @see com.kronosafe.osd.oad.impl.oadPackageImpl#getAllocationDescription()
		 * @generated
		 */
		EClass ALLOCATION_DESCRIPTION = eINSTANCE.getAllocationDescription();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_DESCRIPTION__ALLOCATIONS = eINSTANCE.getAllocationDescription_Allocations();

		/**
		 * The meta object literal for the '<em><b>System Description Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_DESCRIPTION__SYSTEM_DESCRIPTION_REF = eINSTANCE.getAllocationDescription_SystemDescriptionRef();

	}

} //oadPackage
