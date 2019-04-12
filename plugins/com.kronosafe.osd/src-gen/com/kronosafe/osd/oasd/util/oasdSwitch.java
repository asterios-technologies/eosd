/**
 */
package com.kronosafe.osd.oasd.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import com.kronosafe.osd.oasd.*;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.kronosafe.osd.oasd.oasdPackage
 * @generated
 */
public class oasdSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static oasdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oasdSwitch() {
		if (modelPackage == null) {
			modelPackage = oasdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case oasdPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.SYSTEM_DESCRIPTION: {
				SystemDescription systemDescription = (SystemDescription)theEObject;
				T result = caseSystemDescription(systemDescription);
				if (result == null) result = caseIdentifiableElementReferencer(systemDescription);
				if (result == null) result = caseNamedElement(systemDescription);
				if (result == null) result = caseVersionedElement(systemDescription);
				if (result == null) result = caseAnnotatedElement(systemDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseIdentifiedElement(input);
				if (result == null) result = caseNamedElement(input);
				if (result == null) result = caseIdentifiableElementReferencer(input);
				if (result == null) result = caseAnnotatedElement(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.GLOBAL: {
				Global global = (Global)theEObject;
				T result = caseGlobal(global);
				if (result == null) result = caseIdentifiableElementReferencer(global);
				if (result == null) result = caseNamedElement(global);
				if (result == null) result = caseAnnotatedElement(global);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseIdentifiedElement(output);
				if (result == null) result = caseNamedElement(output);
				if (result == null) result = caseIdentifiableElementReferencer(output);
				if (result == null) result = caseAnnotatedElement(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseAnnotatedElement(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = caseIdentifiedElement(code);
				if (result == null) result = caseIdentifiableElementReferencer(code);
				if (result == null) result = caseAnnotatedElement(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.BEHAVIOR_ITEM: {
				BehaviorItem behaviorItem = (BehaviorItem)theEObject;
				T result = caseBehaviorItem(behaviorItem);
				if (result == null) result = caseIdentifiedElement(behaviorItem);
				if (result == null) result = caseNamedElement(behaviorItem);
				if (result == null) result = caseIdentifiableElementReferencer(behaviorItem);
				if (result == null) result = caseAnnotatedElement(behaviorItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.FUNCTION_ITEM: {
				FunctionItem functionItem = (FunctionItem)theEObject;
				T result = caseFunctionItem(functionItem);
				if (result == null) result = caseNamedElement(functionItem);
				if (result == null) result = caseAnnotatedElement(functionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.TYPE_ITEM: {
				TypeItem typeItem = (TypeItem)theEObject;
				T result = caseTypeItem(typeItem);
				if (result == null) result = caseIdentifiedElement(typeItem);
				if (result == null) result = caseNamedElement(typeItem);
				if (result == null) result = caseIdentifiableElementReferencer(typeItem);
				if (result == null) result = caseAnnotatedElement(typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.COMMUNICATION_ITEM: {
				CommunicationItem communicationItem = (CommunicationItem)theEObject;
				T result = caseCommunicationItem(communicationItem);
				if (result == null) result = caseIdentifiedElement(communicationItem);
				if (result == null) result = caseIdentifiableElementReferencer(communicationItem);
				if (result == null) result = caseAnnotatedElement(communicationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = caseIdentifiableElementReferencer(source);
				if (result == null) result = caseAnnotatedElement(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = caseIdentifiableElementReferencer(identifiedElement);
				if (result == null) result = caseAnnotatedElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.IDENTIFIABLE_ELEMENT_REFERENCER: {
				IdentifiableElementReferencer identifiableElementReferencer = (IdentifiableElementReferencer)theEObject;
				T result = caseIdentifiableElementReferencer(identifiableElementReferencer);
				if (result == null) result = caseAnnotatedElement(identifiableElementReferencer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseAnnotatedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.VERSIONED_ELEMENT: {
				VersionedElement versionedElement = (VersionedElement)theEObject;
				T result = caseVersionedElement(versionedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.TEMPORAL: {
				Temporal temporal = (Temporal)theEObject;
				T result = caseTemporal(temporal);
				if (result == null) result = caseAnnotatedElement(temporal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.TIMING_CONSTRAINT: {
				TimingConstraint timingConstraint = (TimingConstraint)theEObject;
				T result = caseTimingConstraint(timingConstraint);
				if (result == null) result = caseAnnotatedElement(timingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.FUNCTIONAL_CHAIN: {
				FunctionalChain functionalChain = (FunctionalChain)theEObject;
				T result = caseFunctionalChain(functionalChain);
				if (result == null) result = caseIdentifiedElement(functionalChain);
				if (result == null) result = caseNamedElement(functionalChain);
				if (result == null) result = caseIdentifiableElementReferencer(functionalChain);
				if (result == null) result = caseAnnotatedElement(functionalChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT: {
				BlockSpatialConstraint blockSpatialConstraint = (BlockSpatialConstraint)theEObject;
				T result = caseBlockSpatialConstraint(blockSpatialConstraint);
				if (result == null) result = caseSpatialConstraint(blockSpatialConstraint);
				if (result == null) result = caseIdentifiedElement(blockSpatialConstraint);
				if (result == null) result = caseNamedElement(blockSpatialConstraint);
				if (result == null) result = caseIdentifiableElementReferencer(blockSpatialConstraint);
				if (result == null) result = caseAnnotatedElement(blockSpatialConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT: {
				ChainSpatialConstraint chainSpatialConstraint = (ChainSpatialConstraint)theEObject;
				T result = caseChainSpatialConstraint(chainSpatialConstraint);
				if (result == null) result = caseSpatialConstraint(chainSpatialConstraint);
				if (result == null) result = caseIdentifiedElement(chainSpatialConstraint);
				if (result == null) result = caseNamedElement(chainSpatialConstraint);
				if (result == null) result = caseIdentifiableElementReferencer(chainSpatialConstraint);
				if (result == null) result = caseAnnotatedElement(chainSpatialConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.SPATIAL_CONSTRAINT: {
				SpatialConstraint spatialConstraint = (SpatialConstraint)theEObject;
				T result = caseSpatialConstraint(spatialConstraint);
				if (result == null) result = caseIdentifiedElement(spatialConstraint);
				if (result == null) result = caseNamedElement(spatialConstraint);
				if (result == null) result = caseIdentifiableElementReferencer(spatialConstraint);
				if (result == null) result = caseAnnotatedElement(spatialConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.COM_SPATIAL_CONSTRAINT: {
				ComSpatialConstraint comSpatialConstraint = (ComSpatialConstraint)theEObject;
				T result = caseComSpatialConstraint(comSpatialConstraint);
				if (result == null) result = caseSpatialConstraint(comSpatialConstraint);
				if (result == null) result = caseIdentifiedElement(comSpatialConstraint);
				if (result == null) result = caseNamedElement(comSpatialConstraint);
				if (result == null) result = caseIdentifiableElementReferencer(comSpatialConstraint);
				if (result == null) result = caseAnnotatedElement(comSpatialConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.TIMING_PATH: {
				TimingPath timingPath = (TimingPath)theEObject;
				T result = caseTimingPath(timingPath);
				if (result == null) result = caseIdentifiableElementReferencer(timingPath);
				if (result == null) result = caseAnnotatedElement(timingPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.ANNOTATION_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> annotationMapEntry = (Map.Entry<String, String>)theEObject;
				T result = caseAnnotationMapEntry(annotationMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case oasdPackage.ANNOTATED_ELEMENT: {
				AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
				T result = caseAnnotatedElement(annotatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDescription(SystemDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobal(Global object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorItem(BehaviorItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionItem(FunctionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeItem(TypeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationItem(CommunicationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Element Referencer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Element Referencer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiableElementReferencer(IdentifiableElementReferencer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedElement(VersionedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporal(Temporal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingConstraint(TimingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalChain(FunctionalChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Spatial Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Spatial Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockSpatialConstraint(BlockSpatialConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Spatial Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Spatial Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainSpatialConstraint(ChainSpatialConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialConstraint(SpatialConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Spatial Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Spatial Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSpatialConstraint(ComSpatialConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingPath(TimingPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatedElement(AnnotatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //oasdSwitch
