package com.kronosafe.osd.xml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;

import com.kronosafe.osd.core.IdentifiableElementReferencer;
import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.oad.oadPackage;
import com.kronosafe.osd.oad.util.oadResourceImpl;
import com.kronosafe.osd.oasd.oasdPackage;

public class XMLKsm3HandlerImpl extends SAXXMLHandler {


	/**
	 * For unresolved forward references.
	 */
	protected static class Ksm3IdReference {
		private EObject object;
		private EReference feature;
		private Integer id;

		public Ksm3IdReference(EObject object, EReference feature, Integer id) {
			this.object = object;
			this.feature = feature;
			this.id = id;
		}

		public EObject getObject() {
			return object;
		}

		public EReference getReference() {
			return feature;
		}

		public int getId() {
			return id;
		}
	}

	protected List<Ksm3IdReference> forwardIdReferences;

	public XMLKsm3HandlerImpl(XMLResource xmlResource, XMLHelper helper, Map<?, ?> options) {
		super(xmlResource, helper, options);
		forwardIdReferences = new ArrayList<Ksm3IdReference>();
	}

	/**
	 * Create an object based on the prefix and type name.
	 */
	@Override
	protected EObject createObjectByType(String prefix, String name, boolean top) {
		if (name == oasdPackage.eNAME)
			return super.createObjectByType(name, oasdPackage.Literals.SYSTEM_DESCRIPTION.getName(), top);

		if (name == oadPackage.eNAME)
			return super.createObjectByType(name, oadPackage.Literals.ALLOCATION_DESCRIPTION.getName(), top);

		return super.createObjectByType(prefix, name, top);
	}

	/**
	 * Get the referenced element.
	 * @param object the object referencing the element
	 * @param eReference the reference
	 * @param id the id to the element referenced
	 * @return the element or null if any
	 */
	protected IdentifiedElement getElement(EObject object, EReference eReference, Integer id) {
		IdentifiedElement element = null;
		if (xmlResource instanceof oadResourceImpl) {
			EcoreUtil.resolveAll(xmlResource);
			element = ((IdentifiableElementReferencer) object).findItemInResourceSet(id,
					eReference.getEReferenceType());
		} else {
			element = ((IdentifiableElementReferencer) object).findItem(id, eReference,
					xmlResource);
		}
		return element;
	}
	
	@Override
	protected void setValueFromId(EObject object, EReference eReference, String ids) {
		if (object instanceof IdentifiableElementReferencer) {
			try {
				Integer id = Integer.parseInt(ids);
				//Only one number for each reference
				IdentifiedElement element = getElement(object, eReference, id);
				//If no element retreived (i.e. null returned), it may be a forward reference, i.e. a reference to an element that is after in the model.
				//In that case, we store the reference that shall be resolved at the end of the document. 
				if (element == null) {
					Ksm3IdReference ref = new Ksm3IdReference(object, eReference, id);
					forwardIdReferences.add(ref);
				} else {
					setFeatureValue(object, eReference, element);
				}
			} catch (NumberFormatException e) {
				super.setValueFromId(object, eReference, ids);
			}
		} else {
			super.setValueFromId(object, eReference, ids);
		}
	}

	@Override
	protected void handleForwardReferences(boolean isEndDocument) {
		//handle ksm3 id references
		for (Iterator<Ksm3IdReference> i = forwardIdReferences.iterator(); i.hasNext(); )
	    {
			Ksm3IdReference ref = i.next();
			IdentifiedElement element = getElement(ref.getObject(), ref.getReference(), ref.getId());
			setFeatureValue(ref.getObject(),  ref.getReference(), element);
	    }
		forwardIdReferences.clear();
		//handle others references
		super.handleForwardReferences(isEndDocument);
	}

	@Override
	protected void handleUnknownFeature(String prefix, String name, boolean isElement, EObject peekObject,
			String value) {
		//When frontend and/or backend use ksM3, some attributes are added in the serialized xml by ksM3. 
		//We don't care for emf and we can remove them for a new serialization.
		//starttime is added by the frontend but it is not in the osd metamodel.
		if (name.equals("ksM3ID") || name.equals("ksM3Class") || name.equals("starttime")|| name.equals("opt"))
			return;
		super.handleUnknownFeature(prefix, name, isElement, peekObject, value);
	}
	
	@Override
	public void reset() {
		//clean the forward ksm3 references.
		forwardIdReferences.clear();
		super.reset();
	}


}
