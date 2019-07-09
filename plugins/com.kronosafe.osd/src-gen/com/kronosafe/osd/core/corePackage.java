/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * The open architecture system description core.
 * <!-- end-model-doc -->
 * @see com.kronosafe.osd.core.coreFactory
 * @model kind="package"
 * @generated
 */
public interface corePackage extends EPackage {
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
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.krono-safe.com/osd/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	corePackage eINSTANCE = com.kronosafe.osd.core.impl.corePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.core.impl.AnnotationMapEntryImpl <em>Annotation Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.core.impl.AnnotationMapEntryImpl
	 * @see com.kronosafe.osd.core.impl.corePackageImpl#getAnnotationMapEntry()
	 * @generated
	 */
	int ANNOTATION_MAP_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.core.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.core.impl.AnnotatedElementImpl
	 * @see com.kronosafe.osd.core.impl.corePackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.core.impl.VersionedElementImpl <em>Versioned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.core.impl.VersionedElementImpl
	 * @see com.kronosafe.osd.core.impl.corePackageImpl#getVersionedElement()
	 * @generated
	 */
	int VERSIONED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT__VERSION = 0;

	/**
	 * The number of structural features of the '<em>Versioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Versioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.core.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.core.impl.AnnotationImpl
	 * @see com.kronosafe.osd.core.impl.corePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DETAILS = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.core.impl.IdentifiableElementReferencerImpl <em>Identifiable Element Referencer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.core.impl.IdentifiableElementReferencerImpl
	 * @see com.kronosafe.osd.core.impl.corePackageImpl#getIdentifiableElementReferencer()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER__ANNOTATIONS = ANNOTATED_ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Identifiable Element Referencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = ANNOTATED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = ANNOTATED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE = ANNOTATED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = ANNOTATED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Identifiable Element Referencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.core.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.core.impl.IdentifiedElementImpl
	 * @see com.kronosafe.osd.core.impl.corePackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ANNOTATIONS = IDENTIFIABLE_ELEMENT_REFERENCER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.core.impl.NamedElementImpl
	 * @see com.kronosafe.osd.core.impl.corePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ANNOTATIONS = ANNOTATED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Id Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.kronosafe.osd.core.impl.corePackageImpl#getIdVal()
	 * @generated
	 */
	int ID_VAL = 7;

	/**
	 * The meta object id for the '<em>AString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.kronosafe.osd.core.impl.corePackageImpl#getAString()
	 * @generated
	 */
	int ASTRING = 8;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Annotation Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="com.kronosafe.osd.core.AString"
	 *        valueDataType="com.kronosafe.osd.core.AString"
	 * @generated
	 */
	EClass getAnnotationMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnnotationMapEntry()
	 * @generated
	 */
	EAttribute getAnnotationMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnnotationMapEntry()
	 * @generated
	 */
	EAttribute getAnnotationMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.core.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see com.kronosafe.osd.core.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.core.AnnotatedElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see com.kronosafe.osd.core.AnnotatedElement#getAnnotations()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EReference getAnnotatedElement_Annotations();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.core.VersionedElement <em>Versioned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Element</em>'.
	 * @see com.kronosafe.osd.core.VersionedElement
	 * @generated
	 */
	EClass getVersionedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.core.VersionedElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.kronosafe.osd.core.VersionedElement#getVersion()
	 * @see #getVersionedElement()
	 * @generated
	 */
	EAttribute getVersionedElement_Version();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.core.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see com.kronosafe.osd.core.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the map '{@link com.kronosafe.osd.core.Annotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Details</em>'.
	 * @see com.kronosafe.osd.core.Annotation#getDetails()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Details();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.core.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see com.kronosafe.osd.core.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.core.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.kronosafe.osd.core.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.core.IdentifiableElementReferencer <em>Identifiable Element Referencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element Referencer</em>'.
	 * @see com.kronosafe.osd.core.IdentifiableElementReferencer
	 * @generated
	 */
	EClass getIdentifiableElementReferencer();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.core.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Item</em>' operation.
	 * @see com.kronosafe.osd.core.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getIdentifiableElementReferencer__FindItem__Integer_EClass();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.core.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EStructuralFeature) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Item</em>' operation.
	 * @see com.kronosafe.osd.core.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EStructuralFeature)
	 * @generated
	 */
	EOperation getIdentifiableElementReferencer__FindItem__Integer_EStructuralFeature();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.core.IdentifiableElementReferencer#findItemInResourceSet(java.lang.Integer, org.eclipse.emf.ecore.EClass) <em>Find Item In Resource Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Item In Resource Set</em>' operation.
	 * @see com.kronosafe.osd.core.IdentifiableElementReferencer#findItemInResourceSet(java.lang.Integer, org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getIdentifiableElementReferencer__FindItemInResourceSet__Integer_EClass();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.core.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.resource.Resource) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Item</em>' operation.
	 * @see com.kronosafe.osd.core.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.resource.Resource)
	 * @generated
	 */
	EOperation getIdentifiableElementReferencer__FindItem__Integer_EClass_Resource();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.core.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.resource.Resource) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Item</em>' operation.
	 * @see com.kronosafe.osd.core.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.resource.Resource)
	 * @generated
	 */
	EOperation getIdentifiableElementReferencer__FindItem__Integer_EReference_Resource();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.kronosafe.osd.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.kronosafe.osd.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Id Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The IdVal type corresponds to an identity number. It is an integer comprised between 0 and the maximum number of element in the model minus 1.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Id Val</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getIdVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>AString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The AString type corresponds to an alphanumerical string between 1 and 100 characters.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>AString</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getAString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	coreFactory getcoreFactory();

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
		 * The meta object literal for the '{@link com.kronosafe.osd.core.impl.AnnotationMapEntryImpl <em>Annotation Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.core.impl.AnnotationMapEntryImpl
		 * @see com.kronosafe.osd.core.impl.corePackageImpl#getAnnotationMapEntry()
		 * @generated
		 */
		EClass ANNOTATION_MAP_ENTRY = eINSTANCE.getAnnotationMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MAP_ENTRY__KEY = eINSTANCE.getAnnotationMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MAP_ENTRY__VALUE = eINSTANCE.getAnnotationMapEntry_Value();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.core.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.core.impl.AnnotatedElementImpl
		 * @see com.kronosafe.osd.core.impl.corePackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_ELEMENT__ANNOTATIONS = eINSTANCE.getAnnotatedElement_Annotations();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.core.impl.VersionedElementImpl <em>Versioned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.core.impl.VersionedElementImpl
		 * @see com.kronosafe.osd.core.impl.corePackageImpl#getVersionedElement()
		 * @generated
		 */
		EClass VERSIONED_ELEMENT = eINSTANCE.getVersionedElement();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_ELEMENT__VERSION = eINSTANCE.getVersionedElement_Version();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.core.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.core.impl.AnnotationImpl
		 * @see com.kronosafe.osd.core.impl.corePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__DETAILS = eINSTANCE.getAnnotation_Details();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.core.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.core.impl.IdentifiedElementImpl
		 * @see com.kronosafe.osd.core.impl.corePackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.core.impl.IdentifiableElementReferencerImpl <em>Identifiable Element Referencer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.core.impl.IdentifiableElementReferencerImpl
		 * @see com.kronosafe.osd.core.impl.corePackageImpl#getIdentifiableElementReferencer()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT_REFERENCER = eINSTANCE.getIdentifiableElementReferencer();

		/**
		 * The meta object literal for the '<em><b>Find Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS = eINSTANCE.getIdentifiableElementReferencer__FindItem__Integer_EClass();

		/**
		 * The meta object literal for the '<em><b>Find Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = eINSTANCE.getIdentifiableElementReferencer__FindItem__Integer_EStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Find Item In Resource Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = eINSTANCE.getIdentifiableElementReferencer__FindItemInResourceSet__Integer_EClass();

		/**
		 * The meta object literal for the '<em><b>Find Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE = eINSTANCE.getIdentifiableElementReferencer__FindItem__Integer_EClass_Resource();

		/**
		 * The meta object literal for the '<em><b>Find Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = eINSTANCE.getIdentifiableElementReferencer__FindItem__Integer_EReference_Resource();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.core.impl.NamedElementImpl
		 * @see com.kronosafe.osd.core.impl.corePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em>Id Val</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.kronosafe.osd.core.impl.corePackageImpl#getIdVal()
		 * @generated
		 */
		EDataType ID_VAL = eINSTANCE.getIdVal();

		/**
		 * The meta object literal for the '<em>AString</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.kronosafe.osd.core.impl.corePackageImpl#getAString()
		 * @generated
		 */
		EDataType ASTRING = eINSTANCE.getAString();

	}

} //corePackage
