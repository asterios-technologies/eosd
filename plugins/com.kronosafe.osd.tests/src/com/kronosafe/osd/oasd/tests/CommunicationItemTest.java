/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.tests;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.tests.IdentifiedElementTest;
import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.CommunicationItem;
import com.kronosafe.osd.oasd.Input;
import com.kronosafe.osd.oasd.Output;
import com.kronosafe.osd.oasd.SystemDescription;
import com.kronosafe.osd.oasd.oasdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.CommunicationItem#getPorts() <em>Get Ports</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CommunicationItemTest extends IdentifiedElementTest {

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
		TestRunner.run(CommunicationItemTest.class);
	}

	/**
	 * Constructs a new Communication Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Communication Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CommunicationItem getFixture() {
		return (CommunicationItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(oasdFactory.eINSTANCE.createCommunicationItem());
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
	 * Tests the '{@link com.kronosafe.osd.oasd.CommunicationItem#getPorts() <em>Get Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1814
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1815
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getPorts()
	 * @not generated
	 */
	public void testGetPorts() {
		ResourceSet rs = new ResourceSetImpl();
		URI uri = URI.createFileURI("./test.oasd");
	    Resource resource = rs.createResource(uri);	
		SystemDescription s1 = oasdFactory.eINSTANCE.createSystemDescription();
		resource.getContents().add(s1);
			
		BehaviorItem b1 = oasdFactory.eINSTANCE.createBehaviorItem();
		Input i1_b1 = oasdFactory.eINSTANCE.createInput();
		b1.getInputs().add(i1_b1);
		Output o1_b1 = oasdFactory.eINSTANCE.createOutput();
		b1.getOutputs().add(o1_b1);

		BehaviorItem b2 = oasdFactory.eINSTANCE.createBehaviorItem();
		Input i1_b2 = oasdFactory.eINSTANCE.createInput();
		Input i2_b2 = oasdFactory.eINSTANCE.createInput();
		b2.getInputs().add(i1_b2);
		b2.getInputs().add(i2_b2);
		Output o1_b2 = oasdFactory.eINSTANCE.createOutput();
		Output o2_b2 = oasdFactory.eINSTANCE.createOutput();
		b1.getOutputs().add(o1_b2);
		b1.getOutputs().add(o2_b2);

		s1.getBehaviors().add(b1);
		s1.getBehaviors().add(b2);
				
		CommunicationItem c1 = oasdFactory.eINSTANCE.createCommunicationItem();
		CommunicationItem c2 = oasdFactory.eINSTANCE.createCommunicationItem();
		s1.getCommunications().add(c1);
		s1.getCommunications().add(c2);

		c1.setDst(i2_b2);
		c1.setSrc(o1_b1);
		assertEquals(2,c1.getPorts().size());
		Iterator<IdentifiedElement> it = c1.getPorts().iterator();
		assertEquals(o1_b1,it.next());
		assertEquals(i2_b2,it.next());
		
		assertTrue(c2.getPorts().isEmpty());
	}


} //CommunicationItemTest
