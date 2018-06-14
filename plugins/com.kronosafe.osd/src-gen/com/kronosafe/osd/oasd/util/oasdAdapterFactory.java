/**
 */
package com.kronosafe.osd.oasd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import com.kronosafe.osd.oasd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.kronosafe.osd.oasd.oasdPackage
 * @generated
 */
public class oasdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static oasdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oasdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = oasdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected oasdSwitch<Adapter> modelSwitch =
		new oasdSwitch<Adapter>() {
			@Override
			public Adapter caseSystemDescription(SystemDescription object) {
				return createSystemDescriptionAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseGlobal(Global object) {
				return createGlobalAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseBehaviorItem(BehaviorItem object) {
				return createBehaviorItemAdapter();
			}
			@Override
			public Adapter caseFunctionItem(FunctionItem object) {
				return createFunctionItemAdapter();
			}
			@Override
			public Adapter caseTypeItem(TypeItem object) {
				return createTypeItemAdapter();
			}
			@Override
			public Adapter caseCommunicationItem(CommunicationItem object) {
				return createCommunicationItemAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseIdentifiedElement(IdentifiedElement object) {
				return createIdentifiedElementAdapter();
			}
			@Override
			public Adapter caseIdentifiableElementReferencer(IdentifiableElementReferencer object) {
				return createIdentifiableElementReferencerAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseVersionedElement(VersionedElement object) {
				return createVersionedElementAdapter();
			}
			@Override
			public Adapter caseTemporal(Temporal object) {
				return createTemporalAdapter();
			}
			@Override
			public Adapter caseTimingConstraint(TimingConstraint object) {
				return createTimingConstraintAdapter();
			}
			@Override
			public Adapter caseFunctionalChain(FunctionalChain object) {
				return createFunctionalChainAdapter();
			}
			@Override
			public Adapter caseBlockSpatialConstraint(BlockSpatialConstraint object) {
				return createBlockSpatialConstraintAdapter();
			}
			@Override
			public Adapter caseChainSpatialConstraint(ChainSpatialConstraint object) {
				return createChainSpatialConstraintAdapter();
			}
			@Override
			public Adapter caseSpatialConstraint(SpatialConstraint object) {
				return createSpatialConstraintAdapter();
			}
			@Override
			public Adapter caseComSpatialConstraint(ComSpatialConstraint object) {
				return createComSpatialConstraintAdapter();
			}
			@Override
			public Adapter caseTimingPath(TimingPath object) {
				return createTimingPathAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.SystemDescription <em>System Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.SystemDescription
	 * @generated
	 */
	public Adapter createSystemDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.Global <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.Global
	 * @generated
	 */
	public Adapter createGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.BehaviorItem <em>Behavior Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.BehaviorItem
	 * @generated
	 */
	public Adapter createBehaviorItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.FunctionItem <em>Function Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.FunctionItem
	 * @generated
	 */
	public Adapter createFunctionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.TypeItem <em>Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.TypeItem
	 * @generated
	 */
	public Adapter createTypeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.CommunicationItem <em>Communication Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.CommunicationItem
	 * @generated
	 */
	public Adapter createCommunicationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer <em>Identifiable Element Referencer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer
	 * @generated
	 */
	public Adapter createIdentifiableElementReferencerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.VersionedElement <em>Versioned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.VersionedElement
	 * @generated
	 */
	public Adapter createVersionedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.Temporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.Temporal
	 * @generated
	 */
	public Adapter createTemporalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.TimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.TimingConstraint
	 * @generated
	 */
	public Adapter createTimingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.FunctionalChain <em>Functional Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.FunctionalChain
	 * @generated
	 */
	public Adapter createFunctionalChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.BlockSpatialConstraint <em>Block Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.BlockSpatialConstraint
	 * @generated
	 */
	public Adapter createBlockSpatialConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.ChainSpatialConstraint <em>Chain Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.ChainSpatialConstraint
	 * @generated
	 */
	public Adapter createChainSpatialConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.SpatialConstraint <em>Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.SpatialConstraint
	 * @generated
	 */
	public Adapter createSpatialConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.ComSpatialConstraint <em>Com Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.ComSpatialConstraint
	 * @generated
	 */
	public Adapter createComSpatialConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.kronosafe.osd.oasd.TimingPath <em>Timing Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.kronosafe.osd.oasd.TimingPath
	 * @generated
	 */
	public Adapter createTimingPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //oasdAdapterFactory
