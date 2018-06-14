/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oad.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.kronosafe.osd.oad.Allocation;
import com.kronosafe.osd.oad.AllocationDescription;
import com.kronosafe.osd.oad.BehaviorItemReference;
import com.kronosafe.osd.oad.oadFactory;
import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.SystemDescription;
import com.kronosafe.osd.oasd.oasdFactory;
import com.kronosafe.osd.oasd.tests.IdentifiableElementReferencerTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavior Item Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItem() <em>Behavior Item</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BehaviorItemReferenceTest extends IdentifiableElementReferencerTest {

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
		TestRunner.run(BehaviorItemReferenceTest.class);
	}

	/**
	 * Constructs a new Behavior Item Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorItemReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behavior Item Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BehaviorItemReference getFixture() {
		return (BehaviorItemReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(oadFactory.eINSTANCE.createBehaviorItemReference());
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
	 * Tests the '{@link com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItem() <em>Behavior Item</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1911
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oad.BehaviorItemReference#getBehaviorItem()
	 * @not generated
	 */
	public void testGetBehaviorItem() {
		ResourceSet rs = new ResourceSetImpl();
		URI uriOasd = URI.createFileURI("./test.oasd");
	    Resource resourceOasd = rs.createResource(uriOasd);
		SystemDescription s1 = oasdFactory.eINSTANCE.createSystemDescription();
		resourceOasd.getContents().add(s1);
		
		URI uriOad = URI.createFileURI("C:\test.oad");
	    Resource resourceOad = rs.createResource(uriOad);
		AllocationDescription ad1 = oadFactory.eINSTANCE.createAllocationDescription();
		resourceOad.getContents().add(ad1);
		
		Allocation a1 = oadFactory.eINSTANCE.createAllocation();
		ad1.getAllocations().add(a1);
		
		BehaviorItem b1 = oasdFactory.eINSTANCE.createBehaviorItem();
		BehaviorItem b2 = oasdFactory.eINSTANCE.createBehaviorItem();
		s1.getBehaviors().add(b1);
		s1.getBehaviors().add(b2);
		
		BehaviorItemReference br1 = oadFactory.eINSTANCE.createBehaviorItemReference();
		BehaviorItemReference br2 = oadFactory.eINSTANCE.createBehaviorItemReference();
		a1.getBehaviorItemReferences().add(br1);
		a1.getBehaviorItemReferences().add(br2);
		
		assertNull(br1.getBehaviorItem());
		
		br2.setBehaviorItemElement(b2);
		assertEquals(b2.getId(),br2.getBehaviorItem());

	}

	/**
	 * Tests the '{@link com.kronosafe.osd.oad.BehaviorItemReference#setBehaviorItem(java.lang.Integer) <em>Behavior Item</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1911
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oad.BehaviorItemReference#setBehaviorItem(java.lang.Integer)
	 * @not generated
	 */
	public void testSetBehaviorItem() {
		ResourceSet rs = new ResourceSetImpl();
		URI uriOasd = URI.createFileURI("./test.oasd");
	    Resource resourceOasd = rs.createResource(uriOasd);
		SystemDescription s1 = oasdFactory.eINSTANCE.createSystemDescription();
		resourceOasd.getContents().add(s1);
		
		URI uriOad = URI.createFileURI("C:\test.oad");
	    Resource resourceOad = rs.createResource(uriOad);
		AllocationDescription ad1 = oadFactory.eINSTANCE.createAllocationDescription();
		resourceOad.getContents().add(ad1);
		
		Allocation a1 = oadFactory.eINSTANCE.createAllocation();
		ad1.getAllocations().add(a1);
		
		BehaviorItem b1 = oasdFactory.eINSTANCE.createBehaviorItem();
		BehaviorItem b2 = oasdFactory.eINSTANCE.createBehaviorItem();
		s1.getBehaviors().add(b1);
		s1.getBehaviors().add(b2);
		
		BehaviorItemReference br1 = oadFactory.eINSTANCE.createBehaviorItemReference();
		BehaviorItemReference br2 = oadFactory.eINSTANCE.createBehaviorItemReference();
		a1.getBehaviorItemReferences().add(br1);
		a1.getBehaviorItemReferences().add(br2);
		
		assertNull(br1.getBehaviorItemElement());
		
		br2.setBehaviorItem(b2.getId());
		assertEquals(b2,br2.getBehaviorItemElement());
	}

} //BehaviorItemReferenceTest
