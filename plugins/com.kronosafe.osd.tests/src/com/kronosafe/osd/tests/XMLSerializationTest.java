package com.kronosafe.osd.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import com.kronosafe.osd.oad.Allocation;
import com.kronosafe.osd.oad.AllocationDescription;
import com.kronosafe.osd.oad.BehaviorItemReference;
import com.kronosafe.osd.oad.oadFactory;
import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.BlockSpatialConstraint;
import com.kronosafe.osd.oasd.ChainSpatialConstraint;
import com.kronosafe.osd.oasd.Code;
import com.kronosafe.osd.oasd.ComSpatialConstraint;
import com.kronosafe.osd.oasd.CommunicationItem;
import com.kronosafe.osd.oasd.ConstraintOperator;
import com.kronosafe.osd.oasd.FunctionItem;
import com.kronosafe.osd.oasd.FunctionKind;
import com.kronosafe.osd.oasd.FunctionalChain;
import com.kronosafe.osd.oasd.Global;
import com.kronosafe.osd.oasd.Input;
import com.kronosafe.osd.oasd.Output;
import com.kronosafe.osd.oasd.Source;
import com.kronosafe.osd.oasd.SpatialOperator;
import com.kronosafe.osd.oasd.SystemDescription;
import com.kronosafe.osd.oasd.Temporal;
import com.kronosafe.osd.oasd.TemporalKind;
import com.kronosafe.osd.oasd.TimingConstraint;
import com.kronosafe.osd.oasd.TimingPath;
import com.kronosafe.osd.oasd.TypeItem;
import com.kronosafe.osd.oasd.oasdFactory;
import com.kronosafe.osd.oasd.util.oasdResourceFactoryImpl;
import com.kronosafe.osd.oasd.util.oasdResourceImpl;
import com.sun.prism.ResourceFactory;

import junit.framework.TestCase;

public class XMLSerializationTest extends TestCase {

	public XMLSerializationTest(String name) {
		super(name);
	}

	//Create a model for the oasd and the oad resource if they are provided. The first behavior own a global variable without a name to generate an error during model load in Designer.
	//This global is returned to be completed.
	public Global createModelWithoutGlobalName(Resource resourceOasd, Resource resourceOad) {
		Global g1 = null;
		BehaviorItem b1 = null;
		BehaviorItem b2 = null;
		
		if (resourceOasd != null) {
			SystemDescription s1 = oasdFactory.eINSTANCE.createSystemDescription();
			s1.setName("s1");
			resourceOasd.getContents().add(s1);

			b1 = oasdFactory.eINSTANCE.createBehaviorItem();
			b1.setName("b1");
			b2 = oasdFactory.eINSTANCE.createBehaviorItem();
			b2.setName("b2");
			CommunicationItem c1 = oasdFactory.eINSTANCE.createCommunicationItem();
			CommunicationItem c2 = oasdFactory.eINSTANCE.createCommunicationItem();
			s1.getBehaviors().add(b1);
			s1.getBehaviors().add(b2);
			s1.getCommunications().add(c1);
			s1.getCommunications().add(c2);

			Temporal temporal1 = oasdFactory.eINSTANCE.createTemporal();
			temporal1.setKind(TemporalKind.PERIODIC);
			temporal1.setOffset(0);
			temporal1.setRate(1);

			Temporal temporal2 = oasdFactory.eINSTANCE.createTemporal();
			temporal2.setKind(TemporalKind.PERIODIC);
			temporal2.setOffset(0);
			temporal2.setRate(1);

			c1.setTemporal(temporal1);
			c2.setTemporal(temporal2);

			FunctionItem f1_init = oasdFactory.eINSTANCE.createFunctionItem();
			f1_init.setName("f1_init");
			f1_init.setExecTWLength(10);
			f1_init.setExecTWRhythm(10);
			f1_init.setKind(FunctionKind.INIT);

			b1.getFunctions().add(f1_init);

			FunctionItem f1_cycle = oasdFactory.eINSTANCE.createFunctionItem();
			f1_cycle.setName("f1_cycle");
			f1_cycle.setExecTWLength(10);
			f1_cycle.setExecTWRhythm(10);
			f1_cycle.setKind(FunctionKind.CYCLE);

			b1.getFunctions().add(f1_cycle);

			FunctionItem f2_init = oasdFactory.eINSTANCE.createFunctionItem();
			f2_init.setName("f2_init");
			f2_init.setExecTWLength(10);
			f2_init.setExecTWRhythm(10);
			f2_init.setKind(FunctionKind.INIT);

			b2.getFunctions().add(f2_init);

			FunctionItem f2_cycle = oasdFactory.eINSTANCE.createFunctionItem();
			f2_cycle.setName("f1_cycle");
			f2_cycle.setExecTWLength(10);
			f2_cycle.setExecTWRhythm(10);
			f2_cycle.setKind(FunctionKind.CYCLE);

			b2.getFunctions().add(f2_cycle);

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
			bs1.setName("bs1");
			s1.getBlockSpatialConstraints().add(bs1);
			bs1.getRItems().add(b1);
			bs1.getLItems().add(b2);

			Code code1 = oasdFactory.eINSTANCE.createCode();
			s1.getCodes().add(code1);

			com.kronosafe.osd.oasd.File file1 = oasdFactory.eINSTANCE.createFile();
			file1.setPath("file1");
			code1.getFiles().add(file1);

			Source source1 = oasdFactory.eINSTANCE.createSource();
			b1.setSource(source1);
			source1.setCode(code1);

			com.kronosafe.osd.oasd.File file2 = oasdFactory.eINSTANCE.createFile();
			file2.setPath("file2");
			source1.getHeaders().add(file2);
			
			Code code2 = oasdFactory.eINSTANCE.createCode();
			s1.getCodes().add(code2);

			com.kronosafe.osd.oasd.File file3 = oasdFactory.eINSTANCE.createFile();
			file3.setPath("file3");
			code2.getFiles().add(file3);

			Source source2 = oasdFactory.eINSTANCE.createSource();
			b2.setSource(source2);
			source2.setCode(code2);

			com.kronosafe.osd.oasd.File file4 = oasdFactory.eINSTANCE.createFile();
			file4.setPath("file4");
			source2.getHeaders().add(file4);
			
			TypeItem t1 = oasdFactory.eINSTANCE.createTypeItem();
			t1.setName("t1");
			s1.getTypes().add(t1);

			g1 = oasdFactory.eINSTANCE.createGlobal();
			b1.getGlobals().add(g1);
			g1.setType(t1);
			
			Global g2 = oasdFactory.eINSTANCE.createGlobal();
			b2.getGlobals().add(g2);
			g2.setName("g2");
			g2.setType(t1);

			FunctionalChain ch1 = oasdFactory.eINSTANCE.createFunctionalChain();
			s1.getFunctionalChains().add(ch1);
			ch1.setName("ch1");
			ch1.getCommunicationItems().add(c1);
			ch1.getCommunicationItems().add(c2);

			TimingPath path = oasdFactory.eINSTANCE.createTimingPath();
			ch1.getTimingpaths().add(path);
			path.setDate(10);
			path.setBehaviorItem(b1);
			
			FunctionalChain ch2 = oasdFactory.eINSTANCE.createFunctionalChain();
			s1.getFunctionalChains().add(ch2);
			ch2.setName("ch2");
			ch2.getCommunicationItems().add(c1);
			ch2.getCommunicationItems().add(c2);

			TimingPath path2 = oasdFactory.eINSTANCE.createTimingPath();
			path2.setDate(10);
			path2.setBehaviorItem(b2);
			ch2.getTimingpaths().add(path2);

			TimingConstraint cst1 = oasdFactory.eINSTANCE.createTimingConstraint();
			cst1.setOperator(ConstraintOperator.LESSER_THAN);
			cst1.setValue(100);
			ch1.getConstraints().add(cst1);

			ComSpatialConstraint csc1 = oasdFactory.eINSTANCE.createComSpatialConstraint();
			s1.getComSpatialConstraints().add(csc1);
			csc1.setName("csc1");
			csc1.setSpatialOperator(SpatialOperator.INCLUDE);
			csc1.getLItems().add(c1);
			csc1.getRItems().add(c2);
			

			ChainSpatialConstraint csc2 = oasdFactory.eINSTANCE.createChainSpatialConstraint();
			s1.getChainSpatialConstraints().add(csc2);
			csc2.setName("csc2");
			csc2.setSpatialOperator(SpatialOperator.EXCLUDE);
			csc2.getRItems().add(ch1);
			csc2.getLItems().add(ch2);
		}

		if (resourceOad != null) {
			AllocationDescription ad1 = oadFactory.eINSTANCE.createAllocationDescription();
			resourceOad.getContents().add(ad1);

			Allocation a1 = oadFactory.eINSTANCE.createAllocation();
			a1.setSwExecutionUnit("task1");
			ad1.getAllocations().add(a1);

			BehaviorItemReference br1 = oadFactory.eINSTANCE.createBehaviorItemReference();
			BehaviorItemReference br2 = oadFactory.eINSTANCE.createBehaviorItemReference();
			a1.getBehaviorItemReferences().add(br1);
			a1.getBehaviorItemReferences().add(br2);
			
			br1.setBehaviorItemElement(b1);
			br2.setBehaviorItemElement(b2);
		}

		return g1;
	}

	@Test
	// http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1798
	public void testASTD1798() {
		String oasdFilePath = "./testASTD1798.oasd";
		String oadFilePath = "./testASTD1798.oad";
		String iasdFilePath = "./testASTD1798.iasd";

		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);

		ProcessBuilder pb = new ProcessBuilder();
		pb.command(".\\target\\dependency\\designerbackend\\bin\\allocator.exe", "-s", oasdFilePath, "-a", oadFilePath);
		pb.inheritIO();

		java.io.File oasdTestFile = new java.io.File(oasdFilePath);
		java.io.File oadTestFile = new java.io.File(oadFilePath);
		java.io.File iasdTestFile = new java.io.File(iasdFilePath);
		try {
			Files.deleteIfExists(oasdTestFile.toPath());
			Files.deleteIfExists(oadTestFile.toPath());
			Files.deleteIfExists(iasdTestFile.toPath());
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		ResourceSet rs = new ResourceSetImpl();
		URI uriOasd = URI.createFileURI(oasdFilePath);
		Resource resourceOasd = rs.createResource(uriOasd);

		URI uriOad = URI.createFileURI(oadFilePath);
		Resource resourceOad = rs.createResource(uriOad);

		Global g = createModelWithoutGlobalName(resourceOasd, resourceOad);

		try {
			resourceOad.save(saveOptions);
			resourceOasd.save(saveOptions);
			System.out.println("Allocator execution in progress...");
			Process p = pb.start();
			int waitFlag = p.waitFor();// Wait to finish application execution.
			System.out.println("Allocator executed");
			assertEquals(1, waitFlag);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

		g.setName("g1");

		try {
			resourceOasd.save(saveOptions);
			System.out.println("Allocator execution in progress...");
			Process p = pb.start();
			int waitFlag = p.waitFor();// Wait to finish application execution.
			System.out.println("Allocator executed");
			assertEquals(0, waitFlag);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Files.deleteIfExists(oasdTestFile.toPath());
			Files.deleteIfExists(oadTestFile.toPath());
			Files.deleteIfExists(iasdTestFile.toPath());
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	// http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1801
	@Test
	public void testASTD1801() {
		String oasdFilePath = "./testASTD1801.oasd";
		String oasdOutFilePath = "testASTD1801_out.oasd";

		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);

		ProcessBuilder pb = new ProcessBuilder();
		pb.command(".\\target\\dependency\\designerfrontend\\bin\\timingassistant.exe", "-s", oasdFilePath);
		pb.inheritIO();

		java.io.File oasdTestFile = new java.io.File(oasdFilePath);
		java.io.File oasdOutTestFile = new java.io.File(oasdOutFilePath);
		try {
			Files.deleteIfExists(oasdTestFile.toPath());
			Files.deleteIfExists(oasdOutTestFile.toPath());
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		ResourceSet rs = new ResourceSetImpl();
		URI uriOasd = URI.createFileURI(oasdFilePath);
		Resource resourceOasd = rs.createResource(uriOasd);

		Global g = createModelWithoutGlobalName(resourceOasd, null);
		g.setName("g1");

		try {
			resourceOasd.save(saveOptions);
			System.out.println("Timing Assistant execution in progress...");
			Process p = pb.start();
			int waitFlag = p.waitFor();// Wait to finish application execution.
			System.out.println("Timing Assistant executed");
			assertEquals(0, waitFlag);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

		URI uriOasdOut = URI.createFileURI(oasdOutTestFile.getAbsolutePath());
		Resource resourceOasdOut = rs.createResource(uriOasdOut);
		try {
			resourceOasdOut.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertNotNull(resourceOasdOut);
		assertEquals(1,resourceOasdOut.getContents().size());
		assertEquals(true, resourceOasdOut.getContents().get(0) instanceof SystemDescription);
		
		//Test case of forward references detected with bug [KDES-413]
		//Code for source are forward references because defined after the source definition when the model is loading. 
		//The source.code shall not be null and shall be the good one.
		//The bug appears when an existing model is loaded not created programmatically.
		SystemDescription s = (SystemDescription)resourceOasdOut.getContents().get(0);
		for (BehaviorItem b : s.getBehaviors()) {
			assertNotNull(b.getSource().getCode());
			Integer bIndex = s.getBehaviors().indexOf(b);
			assertEquals(s.getCodes().get(bIndex), b.getSource().getCode());
		}
		
		try {
			Files.deleteIfExists(oasdTestFile.toPath());
			Files.deleteIfExists(oasdOutTestFile.toPath());
		} catch (IOException e2) {
			e2.printStackTrace();
		}

	}
}
