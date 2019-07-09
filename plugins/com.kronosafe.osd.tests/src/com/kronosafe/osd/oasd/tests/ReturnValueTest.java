/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.kronosafe.osd.core.tests.IdentifiableElementReferencerTest;
import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.FunctionItem;
import com.kronosafe.osd.oasd.Output;
import com.kronosafe.osd.oasd.ReturnType;
import com.kronosafe.osd.oasd.ReturnValue;
import com.kronosafe.osd.oasd.SystemDescription;
import com.kronosafe.osd.oasd.oasdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Return Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.ReturnValue#getDir() <em>Dir</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ReturnValueTest extends IdentifiableElementReferencerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReturnValueTest.class);
	}

	/**
	 * Constructs a new Return Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Return Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReturnValue getFixture() {
		return (ReturnValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(oasdFactory.eINSTANCE.createReturnValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link com.kronosafe.osd.oasd.ReturnValue#getDir() <em>Dir</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.ReturnValue#getDir()
	 * @not generated
	 */
	public void testGetDir() {
		ResourceSet rs = new ResourceSetImpl();
		URI uri = URI.createFileURI("./test.oasd");
	    Resource resource = rs.createResource(uri);
		SystemDescription s = oasdFactory.eINSTANCE.createSystemDescription();
		resource.getContents().add(s);
		//Tests null cases
		assertNull(s.findItem(0,(EReference)null,s.eResource()));
		assertNull(s.findItem(0,s.eContainmentFeature(),null));
		
		//Tests the case of multiple structural feature
		BehaviorItem b1 = oasdFactory.eINSTANCE.createBehaviorItem();
		BehaviorItem b2 = oasdFactory.eINSTANCE.createBehaviorItem();
		s.getBehaviors().add(b1);
		s.getBehaviors().add(b2);		
		FunctionItem f1 = oasdFactory.eINSTANCE.createFunctionItem();
		b1.getFunctions().add(f1);
		Output o1 = oasdFactory.eINSTANCE.createOutput();
		b1.getOutputs().add(o1);
		ReturnValue r1 = oasdFactory.eINSTANCE.createReturnValue();
		r1.setRef(o1);
		f1.setReturnValue(r1);		
		assertEquals(ReturnType.OUTPUT,r1.getDir());
	}

	/**
	 * Tests the '{@link com.kronosafe.osd.oasd.ReturnValue#setDir(com.kronosafe.osd.oasd.ReturnType) <em>Dir</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.ReturnValue#setDir(com.kronosafe.osd.oasd.ReturnType)
	 * @not generated
	 */
	public void testSetDir() {
		ResourceSet rs = new ResourceSetImpl();
		URI uri = URI.createFileURI("./test.oasd");
	    Resource resource = rs.createResource(uri);
		SystemDescription s = oasdFactory.eINSTANCE.createSystemDescription();
		resource.getContents().add(s);
		//Tests null cases
		assertNull(s.findItem(0,(EReference)null,s.eResource()));
		assertNull(s.findItem(0,s.eContainmentFeature(),null));
		
		//Tests the case of multiple structural feature
		BehaviorItem b1 = oasdFactory.eINSTANCE.createBehaviorItem();
		BehaviorItem b2 = oasdFactory.eINSTANCE.createBehaviorItem();
		s.getBehaviors().add(b1);
		s.getBehaviors().add(b2);		
		FunctionItem f1 = oasdFactory.eINSTANCE.createFunctionItem();
		b1.getFunctions().add(f1);
		Output o1 = oasdFactory.eINSTANCE.createOutput();
		b1.getOutputs().add(o1);
		ReturnValue r1 = oasdFactory.eINSTANCE.createReturnValue();
		r1.setRef(o1);
		f1.setReturnValue(r1);		
		assertEquals(ReturnType.OUTPUT,r1.getDir());
		r1.setDir(ReturnType.INTERN);
		assertEquals(ReturnType.INTERN,r1.getDir());
	}

} //ReturnValueTest
