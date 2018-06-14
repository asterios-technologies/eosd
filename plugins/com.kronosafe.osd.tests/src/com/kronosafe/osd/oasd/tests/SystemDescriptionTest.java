/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.tests;

import static org.junit.Assert.assertNotEquals;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.kronosafe.osd.oad.Allocation;
import com.kronosafe.osd.oad.AllocationDescription;
import com.kronosafe.osd.oad.BehaviorItemReference;
import com.kronosafe.osd.oad.oadFactory;
import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.BlockSpatialConstraint;
import com.kronosafe.osd.oasd.Code;
import com.kronosafe.osd.oasd.CommunicationItem;
import com.kronosafe.osd.oasd.Global;
import com.kronosafe.osd.oasd.Input;
import com.kronosafe.osd.oasd.Output;
import com.kronosafe.osd.oasd.Source;
import com.kronosafe.osd.oasd.SystemDescription;
import com.kronosafe.osd.oasd.TypeItem;
import com.kronosafe.osd.oasd.oasdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemDescriptionTest extends IdentifiableElementReferencerTest {

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
		TestRunner.run(SystemDescriptionTest.class);
	}

	/**
	 * Constructs a new System Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemDescription getFixture() {
		return (SystemDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(oasdFactory.eINSTANCE.createSystemDescription());
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
	 * <!-- begin-user-doc -->
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1806
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1807
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1804
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1805
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1803
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public void testIDByType() {
		
		SystemDescription s1 = (SystemDescription)this.fixture;
		BehaviorItem b1 = oasdFactory.eINSTANCE.createBehaviorItem();
		BehaviorItem b2 = oasdFactory.eINSTANCE.createBehaviorItem();
		CommunicationItem c1 = oasdFactory.eINSTANCE.createCommunicationItem();
		CommunicationItem c2 = oasdFactory.eINSTANCE.createCommunicationItem();
		s1.getBehaviors().add(b1);
		s1.getBehaviors().add(b2);
		s1.getCommunications().add(c1);
		s1.getCommunications().add(c2);
		
		//ASTD-1807 & ASTD-1804
		assertNotEquals(b1.getId(), b2.getId());
		assertNotEquals(c1.getId(), c2.getId());
		
		//ASTD-1806
		assertEquals(b1.getId(), c1.getId());
		assertEquals(b2.getId(), c2.getId());
		
		//ASTD-1805
		Integer prev = b2.getId();
		EcoreUtil.delete(b1);
		assertEquals(prev, b2.getId());
		
		//ASTD-1803
		BehaviorItem b3 = oasdFactory.eINSTANCE.createBehaviorItem();
		s1.getBehaviors().add(b3);
		assertEquals(b1.getId(), b3.getId());	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1802
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public void testIDWithDeletion() {
		//ASTD-1802
	
		ResourceSet rs = new ResourceSetImpl();
		URI uriOasd = URI.createFileURI("./test.oasd");
	    Resource resourceOasd = rs.createResource(uriOasd);
		SystemDescription s1 = oasdFactory.eINSTANCE.createSystemDescription();
		resourceOasd.getContents().add(s1);

		URI uriOad = URI.createFileURI("./test.oad");
	    Resource resourceOad = rs.createResource(uriOad);
		AllocationDescription ad1 = oadFactory.eINSTANCE.createAllocationDescription();
		resourceOad.getContents().add(ad1);
		
		BehaviorItem b1 = oasdFactory.eINSTANCE.createBehaviorItem();
		BehaviorItem b2 = oasdFactory.eINSTANCE.createBehaviorItem();
		CommunicationItem c1 = oasdFactory.eINSTANCE.createCommunicationItem();
		CommunicationItem c2 = oasdFactory.eINSTANCE.createCommunicationItem();
		s1.getBehaviors().add(b1);
		s1.getBehaviors().add(b2);
		s1.getCommunications().add(c1);
		s1.getCommunications().add(c2);
		
		Input i1_b1 = oasdFactory.eINSTANCE.createInput();
		i1_b1.setName("i1_b1");
		Input i1_b2 = oasdFactory.eINSTANCE.createInput();
		i1_b2.setName("i1_b2");
		Output o1_b1 = oasdFactory.eINSTANCE.createOutput();
		o1_b1.setName("o1_b1");
		Output o1_b2 = oasdFactory.eINSTANCE.createOutput();
		o1_b2.setName("o1_b2");
		b1.getInputs().add(i1_b1);
		b1.getOutputs().add(o1_b1);
		b2.getInputs().add(i1_b2);
		b2.getOutputs().add(o1_b2);
		
		c1.setSrc(o1_b1);
		c1.setDst(i1_b2);
		c2.setSrc(o1_b2);
		c2.setDst(i1_b1);
		
		BlockSpatialConstraint bs1 = oasdFactory.eINSTANCE.createBlockSpatialConstraint();
		s1.getBlockSpatialConstraints().add(bs1);
		bs1.getRItems().add(b1);
		bs1.getLItems().add(b2);
		
		Code code1 = oasdFactory.eINSTANCE.createCode();
		s1.getCodes().add(code1);
		
		Source source1 = oasdFactory.eINSTANCE.createSource();
		b2.setSource(source1);
		source1.setCode(code1);
		
		TypeItem t1 = oasdFactory.eINSTANCE.createTypeItem();
		s1.getTypes().add(t1);
		
		Global g1 = oasdFactory.eINSTANCE.createGlobal();
		b2.getGlobals().add(g1);
		g1.setType(t1);

		Allocation a1 = oadFactory.eINSTANCE.createAllocation();
		ad1.getAllocations().add(a1);
		
		BehaviorItemReference br1 = oadFactory.eINSTANCE.createBehaviorItemReference();
		BehaviorItemReference br2 = oadFactory.eINSTANCE.createBehaviorItemReference();
		a1.getBehaviorItemReferences().add(br1);
		a1.getBehaviorItemReferences().add(br2);
		
		br1.setBehaviorItemElement(b1);
		br2.setBehaviorItemElement(b2);
		
		//Deletion of b2
		EcoreUtil.delete(b1, true);
		//Deletion of the code
		EcoreUtil.delete(code1,true);
		//Deletion of the type
		EcoreUtil.delete(t1,true);
		
		
		assertEquals(1,s1.getBehaviors().size());
		
		assertNull(c1.getSrc());
		assertEquals(i1_b2,c1.getDst());
		
		assertNull(c2.getDst());
		assertEquals(o1_b2,c2.getSrc());
		
		assertEquals(0,bs1.getRItems().size());
		assertEquals(1,bs1.getLItems().size());
		assertEquals(b2,bs1.getLItems().get(0));
		
		assertEquals(0,s1.getCodes().size());
		assertNull(b2.getSource().getCode());	
		
		assertEquals(0,s1.getTypes().size());
		assertNull(g1.getType());
		
		assertNull(br1.getBehaviorItem());
		assertEquals(b2.getId(),br2.getBehaviorItem());
		
	}

} //SystemDescriptionTest
