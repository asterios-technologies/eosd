package com.kronosafe.osd.xml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;

public class XMLKsm3SaveImpl extends XMLSaveImpl {

	public XMLKsm3SaveImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected boolean shouldSaveFeature(EObject o, EStructuralFeature f) {
		if (o.eIsSet(f))
			return true;

		if (keepDefaults && f.getDefaultValueLiteral() != null)
			return true;

		if (f instanceof EAttribute) {
			Object value = helper.getValue(o, f);
			if (value != null) {
				return true;
			}
		}
		return false;
	}	

}
