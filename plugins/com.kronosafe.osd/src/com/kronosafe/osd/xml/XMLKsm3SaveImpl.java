package com.kronosafe.osd.xml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

import com.kronosafe.osd.core.IdentifiableElementReferencer;
import com.kronosafe.osd.core.IdentifiedElement;

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

	@Override
	protected void saveEObjectSingle(EObject o, EStructuralFeature f) {
		EObject value = (EObject) helper.getValue(o, f);
		if (value != null && value instanceof IdentifiedElement) {
			final StringBuffer buffer = new StringBuffer();
			String id = helper.getHREF(value);
			if (id != null) {
				buffer.append(id);
				if (!toDOM) {
					String name = helper.getQName(f);
					doc.startAttribute(name);
					doc.addAttributeContent(buffer.toString());
					doc.endAttribute();
				} else {
					helper.populateNameInfo(nameInfo, f);
					Attr attr = document.createAttributeNS(nameInfo.getNamespaceURI(), nameInfo.getQualifiedName());
					attr.setNodeValue(buffer.toString());
					((Element) currentNode).setAttributeNodeNS(attr);
					handler.recordValues(attr, o, f, value);
				}
			}

		} else {
			super.saveEObjectSingle(o, f);
		}
	}

}
