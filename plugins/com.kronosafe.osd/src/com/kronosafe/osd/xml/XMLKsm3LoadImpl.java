package com.kronosafe.osd.xml;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.xml.sax.helpers.DefaultHandler;

public class XMLKsm3LoadImpl extends XMLLoadImpl {

	public XMLKsm3LoadImpl(XMLHelper helper) {
		super(helper);
	}

	protected DefaultHandler makeDefaultHandler() {
		return new XMLKsm3HandlerImpl(resource, helper, options);
	}

}
