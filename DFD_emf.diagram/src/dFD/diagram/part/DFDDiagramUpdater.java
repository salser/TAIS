/*
* 
*/
package dFD.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class DFDDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<dFD.diagram.part.DFDNodeDescriptor> getSemanticChildren(View view) {
		switch (dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view)) {
		case dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID:
			return getDFD_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dFD.diagram.part.DFDNodeDescriptor> getDFD_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		dFD.DFD modelElement = (dFD.DFD) view.getElement();
		LinkedList<dFD.diagram.part.DFDNodeDescriptor> result = new LinkedList<dFD.diagram.part.DFDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElemento().iterator(); it.hasNext();) {
			dFD.Elemento childElement = (dFD.Elemento) it.next();
			int visualID = dFD.diagram.part.DFDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID) {
				result.add(new dFD.diagram.part.DFDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID) {
				result.add(new dFD.diagram.part.DFDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID) {
				result.add(new dFD.diagram.part.DFDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dFD.diagram.part.DFDLinkDescriptor> getContainedLinks(View view) {
		switch (dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view)) {
		case dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID:
			return getDFD_1000ContainedLinks(view);
		case dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID:
			return getAlmacen_2001ContainedLinks(view);
		case dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID:
			return getProceso_2002ContainedLinks(view);
		case dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID:
			return getEntidadExterna_2003ContainedLinks(view);
		case dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID:
			return getFlujo_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dFD.diagram.part.DFDLinkDescriptor> getIncomingLinks(View view) {
		switch (dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view)) {
		case dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID:
			return getAlmacen_2001IncomingLinks(view);
		case dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID:
			return getProceso_2002IncomingLinks(view);
		case dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID:
			return getEntidadExterna_2003IncomingLinks(view);
		case dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID:
			return getFlujo_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dFD.diagram.part.DFDLinkDescriptor> getOutgoingLinks(View view) {
		switch (dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view)) {
		case dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID:
			return getAlmacen_2001OutgoingLinks(view);
		case dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID:
			return getProceso_2002OutgoingLinks(view);
		case dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID:
			return getEntidadExterna_2003OutgoingLinks(view);
		case dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID:
			return getFlujo_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getDFD_1000ContainedLinks(View view) {
		dFD.DFD modelElement = (dFD.DFD) view.getElement();
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Flujo_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getAlmacen_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getProceso_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getEntidadExterna_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getFlujo_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getAlmacen_2001IncomingLinks(View view) {
		dFD.Almacen modelElement = (dFD.Almacen) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Flujo_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getProceso_2002IncomingLinks(View view) {
		dFD.Proceso modelElement = (dFD.Proceso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Flujo_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getEntidadExterna_2003IncomingLinks(View view) {
		dFD.EntidadExterna modelElement = (dFD.EntidadExterna) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Flujo_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getFlujo_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getAlmacen_2001OutgoingLinks(View view) {
		dFD.Almacen modelElement = (dFD.Almacen) view.getElement();
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Flujo_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getProceso_2002OutgoingLinks(View view) {
		dFD.Proceso modelElement = (dFD.Proceso) view.getElement();
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Flujo_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getEntidadExterna_2003OutgoingLinks(View view) {
		dFD.EntidadExterna modelElement = (dFD.EntidadExterna) view.getElement();
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Flujo_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dFD.diagram.part.DFDLinkDescriptor> getFlujo_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<dFD.diagram.part.DFDLinkDescriptor> getContainedTypeModelFacetLinks_Flujo_4001(
			dFD.DFD container) {
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		for (Iterator<?> links = container.getFlujo().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof dFD.Flujo) {
				continue;
			}
			dFD.Flujo link = (dFD.Flujo) linkObject;
			if (dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID != dFD.diagram.part.DFDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			dFD.Elemento dst = link.getSiguiente();
			dFD.Elemento src = link.getAnterior();
			result.add(new dFD.diagram.part.DFDLinkDescriptor(src, dst, link,
					dFD.diagram.providers.DFDElementTypes.Flujo_4001, dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dFD.diagram.part.DFDLinkDescriptor> getIncomingTypeModelFacetLinks_Flujo_4001(
			dFD.Elemento target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != dFD.DFDPackage.eINSTANCE.getFlujo_Siguiente()
					|| false == setting.getEObject() instanceof dFD.Flujo) {
				continue;
			}
			dFD.Flujo link = (dFD.Flujo) setting.getEObject();
			if (dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID != dFD.diagram.part.DFDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			dFD.Elemento src = link.getAnterior();
			result.add(new dFD.diagram.part.DFDLinkDescriptor(src, target, link,
					dFD.diagram.providers.DFDElementTypes.Flujo_4001, dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dFD.diagram.part.DFDLinkDescriptor> getOutgoingTypeModelFacetLinks_Flujo_4001(
			dFD.Elemento source) {
		dFD.DFD container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof dFD.DFD) {
				container = (dFD.DFD) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<dFD.diagram.part.DFDLinkDescriptor> result = new LinkedList<dFD.diagram.part.DFDLinkDescriptor>();
		for (Iterator<?> links = container.getFlujo().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof dFD.Flujo) {
				continue;
			}
			dFD.Flujo link = (dFD.Flujo) linkObject;
			if (dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID != dFD.diagram.part.DFDVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			dFD.Elemento dst = link.getSiguiente();
			dFD.Elemento src = link.getAnterior();
			if (src != source) {
				continue;
			}
			result.add(new dFD.diagram.part.DFDLinkDescriptor(src, dst, link,
					dFD.diagram.providers.DFDElementTypes.Flujo_4001, dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<dFD.diagram.part.DFDNodeDescriptor> getSemanticChildren(View view) {
			return DFDDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<dFD.diagram.part.DFDLinkDescriptor> getContainedLinks(View view) {
			return DFDDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<dFD.diagram.part.DFDLinkDescriptor> getIncomingLinks(View view) {
			return DFDDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<dFD.diagram.part.DFDLinkDescriptor> getOutgoingLinks(View view) {
			return DFDDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
