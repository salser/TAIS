/*
* 
*/
package dFD.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DFDVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "DFD_emf.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (dFD.diagram.edit.parts.DFDEditPart.MODEL_ID.equals(view.getType())) {
				return dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				dFD.diagram.part.DFDDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (dFD.DFDPackage.eINSTANCE.getDFD().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((dFD.DFD) domainElement)) {
			return dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = dFD.diagram.part.DFDVisualIDRegistry.getModelID(containerView);
		if (!dFD.diagram.edit.parts.DFDEditPart.MODEL_ID.equals(containerModelID) && !"dFD".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (dFD.diagram.edit.parts.DFDEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dFD.diagram.part.DFDVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID:
			if (dFD.DFDPackage.eINSTANCE.getAlmacen().isSuperTypeOf(domainElement.eClass())) {
				return dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID;
			}
			if (dFD.DFDPackage.eINSTANCE.getProceso().isSuperTypeOf(domainElement.eClass())) {
				return dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID;
			}
			if (dFD.DFDPackage.eINSTANCE.getEntidadExterna().isSuperTypeOf(domainElement.eClass())) {
				return dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = dFD.diagram.part.DFDVisualIDRegistry.getModelID(containerView);
		if (!dFD.diagram.edit.parts.DFDEditPart.MODEL_ID.equals(containerModelID) && !"dFD".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (dFD.diagram.edit.parts.DFDEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dFD.diagram.part.DFDVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID:
			if (dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID:
			if (dFD.diagram.edit.parts.AlmacenNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID:
			if (dFD.diagram.edit.parts.ProcesoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID:
			if (dFD.diagram.edit.parts.EntidadExternaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID:
			if (dFD.diagram.edit.parts.FlujoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (dFD.DFDPackage.eINSTANCE.getFlujo().isSuperTypeOf(domainElement.eClass())) {
			return dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(dFD.DFD element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID:
			return false;
		case dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID:
		case dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID:
		case dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return dFD.diagram.part.DFDVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return dFD.diagram.part.DFDVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return dFD.diagram.part.DFDVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return dFD.diagram.part.DFDVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return dFD.diagram.part.DFDVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
