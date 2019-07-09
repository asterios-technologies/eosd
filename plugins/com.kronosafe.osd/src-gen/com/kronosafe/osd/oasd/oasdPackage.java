/**
 */
package com.kronosafe.osd.oasd;

import com.kronosafe.osd.core.corePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * The open architecture system description used to describe the system and functional design.
 * <!-- end-model-doc -->
 * @see com.kronosafe.osd.oasd.oasdFactory
 * @model kind="package"
 * @generated
 */
public interface oasdPackage extends EPackage {
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
	String eNAME = "oasd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.krono-safe.com/oasd";

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
	oasdPackage eINSTANCE = com.kronosafe.osd.oasd.impl.oasdPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl <em>System Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.SystemDescriptionImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSystemDescription()
	 * @generated
	 */
	int SYSTEM_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__ANNOTATIONS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__NAME = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__VERSION = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__TYPES = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__BEHAVIORS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__CODES = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__TIME_UNIT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__SOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time Unit Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Communications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__COMMUNICATIONS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Chain Spatial Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Block Spatial Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Com Spatial Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__GENERATION = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>System Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_FEATURE_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>System Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_OPERATION_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.InputImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ANNOTATIONS = corePackage.IDENTIFIED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = corePackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INNER = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.GlobalImpl <em>Global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.GlobalImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getGlobal()
	 * @generated
	 */
	int GLOBAL = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__ANNOTATIONS = corePackage.IDENTIFIED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__ID = corePackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__NAME = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__TYPE = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FEATURE_COUNT = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OPERATION_COUNT = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.OutputImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ANNOTATIONS = corePackage.IDENTIFIED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = corePackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__INNER = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.FileImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ANNOTATIONS = corePackage.ANNOTATED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = corePackage.ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = corePackage.ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = corePackage.ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.CodeImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ANNOTATIONS = corePackage.IDENTIFIED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = corePackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__FILES = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl <em>Behavior Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.BehaviorItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBehaviorItem()
	 * @generated
	 */
	int BEHAVIOR_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__ANNOTATIONS = corePackage.IDENTIFIED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__ID = corePackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__NAME = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__KIND = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__ORDER = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__FUNCTIONS = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__OUTPUTS = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Globals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__GLOBALS = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__INPUTS = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__SOURCE = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Behavior Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_FEATURE_COUNT = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Behavior Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_OPERATION_COUNT = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl <em>Function Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.FunctionItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionItem()
	 * @generated
	 */
	int FUNCTION_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__ANNOTATIONS = corePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__NAME = corePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__KIND = corePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__BUDGET = corePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exec TW Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__EXEC_TW_LENGTH = corePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exec TW Rhythm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__EXEC_TW_RHYTHM = corePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__PARAMETERS = corePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__RETURN_VALUE = corePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Function Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM_FEATURE_COUNT = corePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Function Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM_OPERATION_COUNT = corePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.TypeItemImpl <em>Type Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.TypeItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTypeItem()
	 * @generated
	 */
	int TYPE_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM__ANNOTATIONS = corePackage.IDENTIFIED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM__ID = corePackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM__NAME = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copy Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM__COPY_FUNCTION = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM_FEATURE_COUNT = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Type Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM_OPERATION_COUNT = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl <em>Communication Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.CommunicationItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getCommunicationItem()
	 * @generated
	 */
	int COMMUNICATION_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__ANNOTATIONS = corePackage.IDENTIFIED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__ID = corePackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>PValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__PVALUE = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__IMMEDIATE = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__TEMPORAL = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__DST = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__SRC = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__TYPE = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Communication Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM_FEATURE_COUNT = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The operation id for the '<em>Get Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___GET_PORTS = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM_OPERATION_COUNT = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.SourceImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANNOTATIONS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__HEADERS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CODE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.TemporalImpl <em>Temporal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.TemporalImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__ANNOTATIONS = corePackage.ANNOTATED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__KIND = corePackage.ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__RATE = corePackage.ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__OFFSET = corePackage.ANNOTATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FEATURE_COUNT = corePackage.ANNOTATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATION_COUNT = corePackage.ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.TimingConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimingConstraint()
	 * @generated
	 */
	int TIMING_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__ANNOTATIONS = corePackage.ANNOTATED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__OPERATOR = corePackage.ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__VALUE = corePackage.ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_FEATURE_COUNT = corePackage.ANNOTATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Constraint Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT___GET_CONSTRAINT_EXPRESSION = corePackage.ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_OPERATION_COUNT = corePackage.ANNOTATED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.FunctionalChainItemImpl <em>Functional Chain Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.FunctionalChainItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionalChainItem()
	 * @generated
	 */
	int FUNCTIONAL_CHAIN_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM__ANNOTATIONS = corePackage.IDENTIFIED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM__ID = corePackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM__NAME = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM__CONSTRAINTS = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timingpaths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM__TIMINGPATHS = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Communication Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM__COMMUNICATION_ITEMS = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Functional Chain Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM_FEATURE_COUNT = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Functional Chain Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_ITEM_OPERATION_COUNT = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl <em>Block Spatial Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBlockSpatialConstraint()
	 * @generated
	 */
	int BLOCK_SPATIAL_CONSTRAINT = 14;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.SpatialConstraintImpl <em>Spatial Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.SpatialConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSpatialConstraint()
	 * @generated
	 */
	int SPATIAL_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT__ANNOTATIONS = corePackage.IDENTIFIED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT__ID = corePackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT__NAME = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spatial Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT_FEATURE_COUNT = corePackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT_OPERATION_COUNT = corePackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__ANNOTATIONS = SPATIAL_CONSTRAINT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__ID = SPATIAL_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__NAME = SPATIAL_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Spatial Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = SPATIAL_CONSTRAINT__SPATIAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>LItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__LITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__RITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT_FEATURE_COUNT = SPATIAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Block Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT_OPERATION_COUNT = SPATIAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl <em>Chain Spatial Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getChainSpatialConstraint()
	 * @generated
	 */
	int CHAIN_SPATIAL_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__ANNOTATIONS = SPATIAL_CONSTRAINT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__ID = SPATIAL_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__NAME = SPATIAL_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Spatial Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = SPATIAL_CONSTRAINT__SPATIAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>LItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__LITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__RITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chain Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT_FEATURE_COUNT = SPATIAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Chain Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT_OPERATION_COUNT = SPATIAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.ComSpatialConstraintImpl <em>Com Spatial Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.ComSpatialConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getComSpatialConstraint()
	 * @generated
	 */
	int COM_SPATIAL_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__ANNOTATIONS = SPATIAL_CONSTRAINT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__ID = SPATIAL_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__NAME = SPATIAL_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Spatial Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = SPATIAL_CONSTRAINT__SPATIAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>LItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__LITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__RITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT_FEATURE_COUNT = SPATIAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Com Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT_OPERATION_COUNT = SPATIAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.TimingPathItemImpl <em>Timing Path Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.TimingPathItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimingPathItem()
	 * @generated
	 */
	int TIMING_PATH_ITEM = 18;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM__ANNOTATIONS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM__DATE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM__BEHAVIOR_ITEM = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timing Path Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM_FEATURE_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Timing Path Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_ITEM_OPERATION_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.ParameterImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ANNOTATIONS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIR = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__POINTER = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ORDER = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REF = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.ParameterReferenceImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getParameterReference()
	 * @generated
	 */
	int PARAMETER_REFERENCE = 20;

	/**
	 * The number of structural features of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.ReturnValueImpl <em>Return Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.ReturnValueImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getReturnValue()
	 * @generated
	 */
	int RETURN_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE__ANNOTATIONS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE__REF = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE__DIR = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_FEATURE_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE___FIND_ITEM__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE___FIND_ITEM__INTEGER_ECLASS_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_EREFERENCE_RESOURCE;

	/**
	 * The number of operations of the '<em>Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_OPERATION_COUNT = corePackage.IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.ReturnValueReferenceImpl <em>Return Value Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.ReturnValueReferenceImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getReturnValueReference()
	 * @generated
	 */
	int RETURN_VALUE_REFERENCE = 22;

	/**
	 * The number of structural features of the '<em>Return Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Return Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.BehaviorItemKind <em>Behavior Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.BehaviorItemKind
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBehaviorItemKind()
	 * @generated
	 */
	int BEHAVIOR_ITEM_KIND = 23;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.FunctionKind <em>Function Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.FunctionKind
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionKind()
	 * @generated
	 */
	int FUNCTION_KIND = 24;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.GenerationMode <em>Generation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.GenerationMode
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getGenerationMode()
	 * @generated
	 */
	int GENERATION_MODE = 25;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.ParameterDir <em>Parameter Dir</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.ParameterDir
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getParameterDir()
	 * @generated
	 */
	int PARAMETER_DIR = 26;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.TemporalKind <em>Temporal Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.TemporalKind
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTemporalKind()
	 * @generated
	 */
	int TEMPORAL_KIND = 27;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.ConstraintOperator <em>Constraint Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.ConstraintOperator
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getConstraintOperator()
	 * @generated
	 */
	int CONSTRAINT_OPERATOR = 28;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.SpatialOperator <em>Spatial Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.SpatialOperator
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSpatialOperator()
	 * @generated
	 */
	int SPATIAL_OPERATOR = 29;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.ReturnType <em>Return Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.ReturnType
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 30;

	/**
	 * The meta object id for the '<em>Order Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getOrderVal()
	 * @generated
	 */
	int ORDER_VAL = 31;

	/**
	 * The meta object id for the '<em>Time Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 32;

	/**
	 * The meta object id for the '<em>Nano Sec</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getNanoSec()
	 * @generated
	 */
	int NANO_SEC = 33;


	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.SystemDescription <em>System Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Description</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription
	 * @generated
	 */
	EClass getSystemDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getTypes()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getBehaviors()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_Behaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getCodes <em>Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codes</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getCodes()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_Codes();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.SystemDescription#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getTimeUnit()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EAttribute getSystemDescription_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.SystemDescription#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getSource()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EAttribute getSystemDescription_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.SystemDescription#getTimeUnitDeclaration <em>Time Unit Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit Declaration</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getTimeUnitDeclaration()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EAttribute getSystemDescription_TimeUnitDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getCommunications <em>Communications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communications</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getCommunications()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_Communications();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getFunctionalChains <em>Functional Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Chains</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getFunctionalChains()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_FunctionalChains();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getChainSpatialConstraints <em>Chain Spatial Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chain Spatial Constraints</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getChainSpatialConstraints()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_ChainSpatialConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getBlockSpatialConstraints <em>Block Spatial Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Spatial Constraints</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getBlockSpatialConstraints()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_BlockSpatialConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getComSpatialConstraints <em>Com Spatial Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Spatial Constraints</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getComSpatialConstraints()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_ComSpatialConstraints();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.SystemDescription#getGeneration <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getGeneration()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EAttribute getSystemDescription_Generation();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see com.kronosafe.osd.oasd.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Input#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner</em>'.
	 * @see com.kronosafe.osd.oasd.Input#getInner()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Inner();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.kronosafe.osd.oasd.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Type();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Global <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global</em>'.
	 * @see com.kronosafe.osd.oasd.Global
	 * @generated
	 */
	EClass getGlobal();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.Global#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.kronosafe.osd.oasd.Global#getType()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_Type();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see com.kronosafe.osd.oasd.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Output#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner</em>'.
	 * @see com.kronosafe.osd.oasd.Output#getInner()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Inner();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.Output#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.kronosafe.osd.oasd.Output#getType()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Type();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see com.kronosafe.osd.oasd.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.kronosafe.osd.oasd.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see com.kronosafe.osd.oasd.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.Code#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see com.kronosafe.osd.oasd.Code#getFiles()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Files();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.BehaviorItem <em>Behavior Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Item</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem
	 * @generated
	 */
	EClass getBehaviorItem();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.BehaviorItem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getKind()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EAttribute getBehaviorItem_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.BehaviorItem#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getOrder()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EAttribute getBehaviorItem_Order();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.BehaviorItem#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getFunctions()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.BehaviorItem#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getOutputs()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.BehaviorItem#getGlobals <em>Globals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Globals</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getGlobals()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Globals();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.BehaviorItem#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getInputs()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link com.kronosafe.osd.oasd.BehaviorItem#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getSource()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Source();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.FunctionItem <em>Function Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Item</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem
	 * @generated
	 */
	EClass getFunctionItem();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.FunctionItem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getKind()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EAttribute getFunctionItem_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.FunctionItem#getBudget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getBudget()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EAttribute getFunctionItem_Budget();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.FunctionItem#getExecTWLength <em>Exec TW Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exec TW Length</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getExecTWLength()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EAttribute getFunctionItem_ExecTWLength();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.FunctionItem#getExecTWRhythm <em>Exec TW Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exec TW Rhythm</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getExecTWRhythm()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EAttribute getFunctionItem_ExecTWRhythm();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.FunctionItem#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getParameters()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EReference getFunctionItem_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link com.kronosafe.osd.oasd.FunctionItem#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getReturnValue()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EReference getFunctionItem_ReturnValue();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.TypeItem <em>Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Item</em>'.
	 * @see com.kronosafe.osd.oasd.TypeItem
	 * @generated
	 */
	EClass getTypeItem();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.TypeItem#getCopyFunction <em>Copy Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Function</em>'.
	 * @see com.kronosafe.osd.oasd.TypeItem#getCopyFunction()
	 * @see #getTypeItem()
	 * @generated
	 */
	EAttribute getTypeItem_CopyFunction();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.CommunicationItem <em>Communication Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Item</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem
	 * @generated
	 */
	EClass getCommunicationItem();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.CommunicationItem#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getSrc()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EReference getCommunicationItem_Src();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.CommunicationItem#getDst <em>Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getDst()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EReference getCommunicationItem_Dst();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.CommunicationItem#getPValue <em>PValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PValue</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getPValue()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EAttribute getCommunicationItem_PValue();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.CommunicationItem#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#isImmediate()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EAttribute getCommunicationItem_Immediate();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.CommunicationItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getType()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EReference getCommunicationItem_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.kronosafe.osd.oasd.CommunicationItem#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getTemporal()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EReference getCommunicationItem_Temporal();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.oasd.CommunicationItem#getPorts() <em>Get Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ports</em>' operation.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getPorts()
	 * @generated
	 */
	EOperation getCommunicationItem__GetPorts();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see com.kronosafe.osd.oasd.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.Source#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see com.kronosafe.osd.oasd.Source#getCode()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.Source#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see com.kronosafe.osd.oasd.Source#getHeaders()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Headers();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Temporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal</em>'.
	 * @see com.kronosafe.osd.oasd.Temporal
	 * @generated
	 */
	EClass getTemporal();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Temporal#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.kronosafe.osd.oasd.Temporal#getKind()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Temporal#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see com.kronosafe.osd.oasd.Temporal#getRate()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Rate();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Temporal#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.kronosafe.osd.oasd.Temporal#getOffset()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Offset();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.TimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.TimingConstraint
	 * @generated
	 */
	EClass getTimingConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.TimingConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.kronosafe.osd.oasd.TimingConstraint#getOperator()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EAttribute getTimingConstraint_Operator();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.TimingConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.kronosafe.osd.oasd.TimingConstraint#getValue()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EAttribute getTimingConstraint_Value();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.oasd.TimingConstraint#getConstraintExpression() <em>Get Constraint Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Constraint Expression</em>' operation.
	 * @see com.kronosafe.osd.oasd.TimingConstraint#getConstraintExpression()
	 * @generated
	 */
	EOperation getTimingConstraint__GetConstraintExpression();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.FunctionalChainItem <em>Functional Chain Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Chain Item</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionalChainItem
	 * @generated
	 */
	EClass getFunctionalChainItem();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.FunctionalChainItem#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionalChainItem#getConstraints()
	 * @see #getFunctionalChainItem()
	 * @generated
	 */
	EReference getFunctionalChainItem_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.FunctionalChainItem#getTimingpaths <em>Timingpaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timingpaths</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionalChainItem#getTimingpaths()
	 * @see #getFunctionalChainItem()
	 * @generated
	 */
	EReference getFunctionalChainItem_Timingpaths();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.FunctionalChainItem#getCommunicationItems <em>Communication Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Items</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionalChainItem#getCommunicationItems()
	 * @see #getFunctionalChainItem()
	 * @generated
	 */
	EReference getFunctionalChainItem_CommunicationItems();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.BlockSpatialConstraint <em>Block Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Spatial Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.BlockSpatialConstraint
	 * @generated
	 */
	EClass getBlockSpatialConstraint();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.BlockSpatialConstraint#getLItems <em>LItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LItems</em>'.
	 * @see com.kronosafe.osd.oasd.BlockSpatialConstraint#getLItems()
	 * @see #getBlockSpatialConstraint()
	 * @generated
	 */
	EReference getBlockSpatialConstraint_LItems();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.BlockSpatialConstraint#getRItems <em>RItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RItems</em>'.
	 * @see com.kronosafe.osd.oasd.BlockSpatialConstraint#getRItems()
	 * @see #getBlockSpatialConstraint()
	 * @generated
	 */
	EReference getBlockSpatialConstraint_RItems();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.ChainSpatialConstraint <em>Chain Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Spatial Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.ChainSpatialConstraint
	 * @generated
	 */
	EClass getChainSpatialConstraint();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.ChainSpatialConstraint#getLItems <em>LItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LItems</em>'.
	 * @see com.kronosafe.osd.oasd.ChainSpatialConstraint#getLItems()
	 * @see #getChainSpatialConstraint()
	 * @generated
	 */
	EReference getChainSpatialConstraint_LItems();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.ChainSpatialConstraint#getRItems <em>RItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RItems</em>'.
	 * @see com.kronosafe.osd.oasd.ChainSpatialConstraint#getRItems()
	 * @see #getChainSpatialConstraint()
	 * @generated
	 */
	EReference getChainSpatialConstraint_RItems();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.SpatialConstraint <em>Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.SpatialConstraint
	 * @generated
	 */
	EClass getSpatialConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.SpatialConstraint#getSpatialOperator <em>Spatial Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spatial Operator</em>'.
	 * @see com.kronosafe.osd.oasd.SpatialConstraint#getSpatialOperator()
	 * @see #getSpatialConstraint()
	 * @generated
	 */
	EAttribute getSpatialConstraint_SpatialOperator();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.ComSpatialConstraint <em>Com Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Spatial Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.ComSpatialConstraint
	 * @generated
	 */
	EClass getComSpatialConstraint();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.ComSpatialConstraint#getLItems <em>LItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LItems</em>'.
	 * @see com.kronosafe.osd.oasd.ComSpatialConstraint#getLItems()
	 * @see #getComSpatialConstraint()
	 * @generated
	 */
	EReference getComSpatialConstraint_LItems();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.ComSpatialConstraint#getRItems <em>RItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RItems</em>'.
	 * @see com.kronosafe.osd.oasd.ComSpatialConstraint#getRItems()
	 * @see #getComSpatialConstraint()
	 * @generated
	 */
	EReference getComSpatialConstraint_RItems();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.TimingPathItem <em>Timing Path Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Path Item</em>'.
	 * @see com.kronosafe.osd.oasd.TimingPathItem
	 * @generated
	 */
	EClass getTimingPathItem();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.TimingPathItem#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.kronosafe.osd.oasd.TimingPathItem#getDate()
	 * @see #getTimingPathItem()
	 * @generated
	 */
	EAttribute getTimingPathItem_Date();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.TimingPathItem#getBehaviorItem <em>Behavior Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior Item</em>'.
	 * @see com.kronosafe.osd.oasd.TimingPathItem#getBehaviorItem()
	 * @see #getTimingPathItem()
	 * @generated
	 */
	EReference getTimingPathItem_BehaviorItem();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.kronosafe.osd.oasd.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Parameter#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see com.kronosafe.osd.oasd.Parameter#getDir()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Dir();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Parameter#isPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pointer</em>'.
	 * @see com.kronosafe.osd.oasd.Parameter#isPointer()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Pointer();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Parameter#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see com.kronosafe.osd.oasd.Parameter#getOrder()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Order();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.Parameter#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see com.kronosafe.osd.oasd.Parameter#getRef()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Ref();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.kronosafe.osd.oasd.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.ParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Reference</em>'.
	 * @see com.kronosafe.osd.oasd.ParameterReference
	 * @generated
	 */
	EClass getParameterReference();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.ReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Value</em>'.
	 * @see com.kronosafe.osd.oasd.ReturnValue
	 * @generated
	 */
	EClass getReturnValue();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.ReturnValue#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see com.kronosafe.osd.oasd.ReturnValue#getRef()
	 * @see #getReturnValue()
	 * @generated
	 */
	EReference getReturnValue_Ref();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.ReturnValue#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see com.kronosafe.osd.oasd.ReturnValue#getDir()
	 * @see #getReturnValue()
	 * @generated
	 */
	EAttribute getReturnValue_Dir();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.ReturnValueReference <em>Return Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Value Reference</em>'.
	 * @see com.kronosafe.osd.oasd.ReturnValueReference
	 * @generated
	 */
	EClass getReturnValueReference();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.BehaviorItemKind <em>Behavior Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior Item Kind</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItemKind
	 * @generated
	 */
	EEnum getBehaviorItemKind();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.FunctionKind <em>Function Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Kind</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionKind
	 * @generated
	 */
	EEnum getFunctionKind();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.GenerationMode <em>Generation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Mode</em>'.
	 * @see com.kronosafe.osd.oasd.GenerationMode
	 * @generated
	 */
	EEnum getGenerationMode();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.ParameterDir <em>Parameter Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Dir</em>'.
	 * @see com.kronosafe.osd.oasd.ParameterDir
	 * @generated
	 */
	EEnum getParameterDir();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.TemporalKind <em>Temporal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Kind</em>'.
	 * @see com.kronosafe.osd.oasd.TemporalKind
	 * @generated
	 */
	EEnum getTemporalKind();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.ConstraintOperator <em>Constraint Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Operator</em>'.
	 * @see com.kronosafe.osd.oasd.ConstraintOperator
	 * @generated
	 */
	EEnum getConstraintOperator();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.SpatialOperator <em>Spatial Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spatial Operator</em>'.
	 * @see com.kronosafe.osd.oasd.SpatialOperator
	 * @generated
	 */
	EEnum getSpatialOperator();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Type</em>'.
	 * @see com.kronosafe.osd.oasd.ReturnType
	 * @generated
	 */
	EEnum getReturnType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Order Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An unsigned integer
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Order Val</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getOrderVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Unit</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getTimeUnit();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Nano Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A datatype to model the nanosecond unit.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Nano Sec</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getNanoSec();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	oasdFactory getoasdFactory();

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
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl <em>System Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.SystemDescriptionImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSystemDescription()
		 * @generated
		 */
		EClass SYSTEM_DESCRIPTION = eINSTANCE.getSystemDescription();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__TYPES = eINSTANCE.getSystemDescription_Types();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__BEHAVIORS = eINSTANCE.getSystemDescription_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__CODES = eINSTANCE.getSystemDescription_Codes();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DESCRIPTION__TIME_UNIT = eINSTANCE.getSystemDescription_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DESCRIPTION__SOURCE = eINSTANCE.getSystemDescription_Source();

		/**
		 * The meta object literal for the '<em><b>Time Unit Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION = eINSTANCE.getSystemDescription_TimeUnitDeclaration();

		/**
		 * The meta object literal for the '<em><b>Communications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__COMMUNICATIONS = eINSTANCE.getSystemDescription_Communications();

		/**
		 * The meta object literal for the '<em><b>Functional Chains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS = eINSTANCE.getSystemDescription_FunctionalChains();

		/**
		 * The meta object literal for the '<em><b>Chain Spatial Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS = eINSTANCE.getSystemDescription_ChainSpatialConstraints();

		/**
		 * The meta object literal for the '<em><b>Block Spatial Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS = eINSTANCE.getSystemDescription_BlockSpatialConstraints();

		/**
		 * The meta object literal for the '<em><b>Com Spatial Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS = eINSTANCE.getSystemDescription_ComSpatialConstraints();

		/**
		 * The meta object literal for the '<em><b>Generation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DESCRIPTION__GENERATION = eINSTANCE.getSystemDescription_Generation();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.InputImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__INNER = eINSTANCE.getInput_Inner();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.GlobalImpl <em>Global</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.GlobalImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getGlobal()
		 * @generated
		 */
		EClass GLOBAL = eINSTANCE.getGlobal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__TYPE = eINSTANCE.getGlobal_Type();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.OutputImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__INNER = eINSTANCE.getOutput_Inner();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__TYPE = eINSTANCE.getOutput_Type();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.FileImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.CodeImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__FILES = eINSTANCE.getCode_Files();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl <em>Behavior Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.BehaviorItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBehaviorItem()
		 * @generated
		 */
		EClass BEHAVIOR_ITEM = eINSTANCE.getBehaviorItem();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_ITEM__KIND = eINSTANCE.getBehaviorItem_Kind();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_ITEM__ORDER = eINSTANCE.getBehaviorItem_Order();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__FUNCTIONS = eINSTANCE.getBehaviorItem_Functions();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__OUTPUTS = eINSTANCE.getBehaviorItem_Outputs();

		/**
		 * The meta object literal for the '<em><b>Globals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__GLOBALS = eINSTANCE.getBehaviorItem_Globals();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__INPUTS = eINSTANCE.getBehaviorItem_Inputs();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__SOURCE = eINSTANCE.getBehaviorItem_Source();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl <em>Function Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.FunctionItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionItem()
		 * @generated
		 */
		EClass FUNCTION_ITEM = eINSTANCE.getFunctionItem();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ITEM__KIND = eINSTANCE.getFunctionItem_Kind();

		/**
		 * The meta object literal for the '<em><b>Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ITEM__BUDGET = eINSTANCE.getFunctionItem_Budget();

		/**
		 * The meta object literal for the '<em><b>Exec TW Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ITEM__EXEC_TW_LENGTH = eINSTANCE.getFunctionItem_ExecTWLength();

		/**
		 * The meta object literal for the '<em><b>Exec TW Rhythm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ITEM__EXEC_TW_RHYTHM = eINSTANCE.getFunctionItem_ExecTWRhythm();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ITEM__PARAMETERS = eINSTANCE.getFunctionItem_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ITEM__RETURN_VALUE = eINSTANCE.getFunctionItem_ReturnValue();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.TypeItemImpl <em>Type Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.TypeItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTypeItem()
		 * @generated
		 */
		EClass TYPE_ITEM = eINSTANCE.getTypeItem();

		/**
		 * The meta object literal for the '<em><b>Copy Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ITEM__COPY_FUNCTION = eINSTANCE.getTypeItem_CopyFunction();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl <em>Communication Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.CommunicationItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getCommunicationItem()
		 * @generated
		 */
		EClass COMMUNICATION_ITEM = eINSTANCE.getCommunicationItem();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_ITEM__SRC = eINSTANCE.getCommunicationItem_Src();

		/**
		 * The meta object literal for the '<em><b>Dst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_ITEM__DST = eINSTANCE.getCommunicationItem_Dst();

		/**
		 * The meta object literal for the '<em><b>PValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_ITEM__PVALUE = eINSTANCE.getCommunicationItem_PValue();

		/**
		 * The meta object literal for the '<em><b>Immediate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_ITEM__IMMEDIATE = eINSTANCE.getCommunicationItem_Immediate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_ITEM__TYPE = eINSTANCE.getCommunicationItem_Type();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_ITEM__TEMPORAL = eINSTANCE.getCommunicationItem_Temporal();

		/**
		 * The meta object literal for the '<em><b>Get Ports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_ITEM___GET_PORTS = eINSTANCE.getCommunicationItem__GetPorts();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.SourceImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__CODE = eINSTANCE.getSource_Code();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__HEADERS = eINSTANCE.getSource_Headers();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.TemporalImpl <em>Temporal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.TemporalImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTemporal()
		 * @generated
		 */
		EClass TEMPORAL = eINSTANCE.getTemporal();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__KIND = eINSTANCE.getTemporal_Kind();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__RATE = eINSTANCE.getTemporal_Rate();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__OFFSET = eINSTANCE.getTemporal_Offset();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.TimingConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimingConstraint()
		 * @generated
		 */
		EClass TIMING_CONSTRAINT = eINSTANCE.getTimingConstraint();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_CONSTRAINT__OPERATOR = eINSTANCE.getTimingConstraint_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_CONSTRAINT__VALUE = eINSTANCE.getTimingConstraint_Value();

		/**
		 * The meta object literal for the '<em><b>Get Constraint Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMING_CONSTRAINT___GET_CONSTRAINT_EXPRESSION = eINSTANCE.getTimingConstraint__GetConstraintExpression();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.FunctionalChainItemImpl <em>Functional Chain Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.FunctionalChainItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionalChainItem()
		 * @generated
		 */
		EClass FUNCTIONAL_CHAIN_ITEM = eINSTANCE.getFunctionalChainItem();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN_ITEM__CONSTRAINTS = eINSTANCE.getFunctionalChainItem_Constraints();

		/**
		 * The meta object literal for the '<em><b>Timingpaths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN_ITEM__TIMINGPATHS = eINSTANCE.getFunctionalChainItem_Timingpaths();

		/**
		 * The meta object literal for the '<em><b>Communication Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN_ITEM__COMMUNICATION_ITEMS = eINSTANCE.getFunctionalChainItem_CommunicationItems();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl <em>Block Spatial Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBlockSpatialConstraint()
		 * @generated
		 */
		EClass BLOCK_SPATIAL_CONSTRAINT = eINSTANCE.getBlockSpatialConstraint();

		/**
		 * The meta object literal for the '<em><b>LItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_SPATIAL_CONSTRAINT__LITEMS = eINSTANCE.getBlockSpatialConstraint_LItems();

		/**
		 * The meta object literal for the '<em><b>RItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_SPATIAL_CONSTRAINT__RITEMS = eINSTANCE.getBlockSpatialConstraint_RItems();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl <em>Chain Spatial Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getChainSpatialConstraint()
		 * @generated
		 */
		EClass CHAIN_SPATIAL_CONSTRAINT = eINSTANCE.getChainSpatialConstraint();

		/**
		 * The meta object literal for the '<em><b>LItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_SPATIAL_CONSTRAINT__LITEMS = eINSTANCE.getChainSpatialConstraint_LItems();

		/**
		 * The meta object literal for the '<em><b>RItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_SPATIAL_CONSTRAINT__RITEMS = eINSTANCE.getChainSpatialConstraint_RItems();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.SpatialConstraintImpl <em>Spatial Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.SpatialConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSpatialConstraint()
		 * @generated
		 */
		EClass SPATIAL_CONSTRAINT = eINSTANCE.getSpatialConstraint();

		/**
		 * The meta object literal for the '<em><b>Spatial Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = eINSTANCE.getSpatialConstraint_SpatialOperator();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.ComSpatialConstraintImpl <em>Com Spatial Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.ComSpatialConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getComSpatialConstraint()
		 * @generated
		 */
		EClass COM_SPATIAL_CONSTRAINT = eINSTANCE.getComSpatialConstraint();

		/**
		 * The meta object literal for the '<em><b>LItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SPATIAL_CONSTRAINT__LITEMS = eINSTANCE.getComSpatialConstraint_LItems();

		/**
		 * The meta object literal for the '<em><b>RItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SPATIAL_CONSTRAINT__RITEMS = eINSTANCE.getComSpatialConstraint_RItems();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.TimingPathItemImpl <em>Timing Path Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.TimingPathItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimingPathItem()
		 * @generated
		 */
		EClass TIMING_PATH_ITEM = eINSTANCE.getTimingPathItem();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_PATH_ITEM__DATE = eINSTANCE.getTimingPathItem_Date();

		/**
		 * The meta object literal for the '<em><b>Behavior Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_PATH_ITEM__BEHAVIOR_ITEM = eINSTANCE.getTimingPathItem_BehaviorItem();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.ParameterImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DIR = eINSTANCE.getParameter_Dir();

		/**
		 * The meta object literal for the '<em><b>Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__POINTER = eINSTANCE.getParameter_Pointer();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ORDER = eINSTANCE.getParameter_Order();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__REF = eINSTANCE.getParameter_Ref();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.ParameterReferenceImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getParameterReference()
		 * @generated
		 */
		EClass PARAMETER_REFERENCE = eINSTANCE.getParameterReference();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.ReturnValueImpl <em>Return Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.ReturnValueImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getReturnValue()
		 * @generated
		 */
		EClass RETURN_VALUE = eINSTANCE.getReturnValue();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_VALUE__REF = eINSTANCE.getReturnValue_Ref();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALUE__DIR = eINSTANCE.getReturnValue_Dir();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.ReturnValueReferenceImpl <em>Return Value Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.ReturnValueReferenceImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getReturnValueReference()
		 * @generated
		 */
		EClass RETURN_VALUE_REFERENCE = eINSTANCE.getReturnValueReference();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.BehaviorItemKind <em>Behavior Item Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.BehaviorItemKind
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBehaviorItemKind()
		 * @generated
		 */
		EEnum BEHAVIOR_ITEM_KIND = eINSTANCE.getBehaviorItemKind();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.FunctionKind <em>Function Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.FunctionKind
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionKind()
		 * @generated
		 */
		EEnum FUNCTION_KIND = eINSTANCE.getFunctionKind();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.GenerationMode <em>Generation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.GenerationMode
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getGenerationMode()
		 * @generated
		 */
		EEnum GENERATION_MODE = eINSTANCE.getGenerationMode();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.ParameterDir <em>Parameter Dir</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.ParameterDir
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getParameterDir()
		 * @generated
		 */
		EEnum PARAMETER_DIR = eINSTANCE.getParameterDir();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.TemporalKind <em>Temporal Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.TemporalKind
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTemporalKind()
		 * @generated
		 */
		EEnum TEMPORAL_KIND = eINSTANCE.getTemporalKind();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.ConstraintOperator <em>Constraint Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.ConstraintOperator
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getConstraintOperator()
		 * @generated
		 */
		EEnum CONSTRAINT_OPERATOR = eINSTANCE.getConstraintOperator();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.SpatialOperator <em>Spatial Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.SpatialOperator
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSpatialOperator()
		 * @generated
		 */
		EEnum SPATIAL_OPERATOR = eINSTANCE.getSpatialOperator();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.ReturnType <em>Return Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.ReturnType
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getReturnType()
		 * @generated
		 */
		EEnum RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em>Order Val</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getOrderVal()
		 * @generated
		 */
		EDataType ORDER_VAL = eINSTANCE.getOrderVal();

		/**
		 * The meta object literal for the '<em>Time Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimeUnit()
		 * @generated
		 */
		EDataType TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '<em>Nano Sec</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getNanoSec()
		 * @generated
		 */
		EDataType NANO_SEC = eINSTANCE.getNanoSec();

	}

} //oasdPackage
