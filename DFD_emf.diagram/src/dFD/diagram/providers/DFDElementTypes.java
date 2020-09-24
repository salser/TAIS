/*
 * 
 */
package dFD.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class DFDElementTypes {

	/**
	* @generated
	*/
	private DFDElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType DFD_1000 = getElementType("DFD_emf.diagram.DFD_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Almacen_2001 = getElementType("DFD_emf.diagram.Almacen_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Proceso_2002 = getElementType("DFD_emf.diagram.Proceso_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadExterna_2003 = getElementType("DFD_emf.diagram.EntidadExterna_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Flujo_4001 = getElementType("DFD_emf.diagram.Flujo_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DFD_1000, dFD.DFDPackage.eINSTANCE.getDFD());

			elements.put(Almacen_2001, dFD.DFDPackage.eINSTANCE.getAlmacen());

			elements.put(Proceso_2002, dFD.DFDPackage.eINSTANCE.getProceso());

			elements.put(EntidadExterna_2003, dFD.DFDPackage.eINSTANCE.getEntidadExterna());

			elements.put(Flujo_4001, dFD.DFDPackage.eINSTANCE.getFlujo());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DFD_1000);
			KNOWN_ELEMENT_TYPES.add(Almacen_2001);
			KNOWN_ELEMENT_TYPES.add(Proceso_2002);
			KNOWN_ELEMENT_TYPES.add(EntidadExterna_2003);
			KNOWN_ELEMENT_TYPES.add(Flujo_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID:
			return DFD_1000;
		case dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID:
			return Almacen_2001;
		case dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID:
			return Proceso_2002;
		case dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID:
			return EntidadExterna_2003;
		case dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID:
			return Flujo_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return dFD.diagram.providers.DFDElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return dFD.diagram.providers.DFDElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return dFD.diagram.providers.DFDElementTypes.getElement(elementTypeAdapter);
		}
	};

}
