/*
 * 
 */
package dFD.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DFDModelingAssistantProviderOfAlmacenEditPart extends dFD.diagram.providers.DFDModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((dFD.diagram.edit.parts.AlmacenEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(dFD.diagram.edit.parts.AlmacenEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dFD.diagram.providers.DFDElementTypes.Flujo_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((dFD.diagram.edit.parts.AlmacenEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(dFD.diagram.edit.parts.AlmacenEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof dFD.diagram.edit.parts.ProcesoEditPart) {
			types.add(dFD.diagram.providers.DFDElementTypes.Flujo_4001);
		}
		if (targetEditPart instanceof dFD.diagram.edit.parts.EntidadExternaEditPart) {
			types.add(dFD.diagram.providers.DFDElementTypes.Flujo_4001);
		}
		if (targetEditPart instanceof dFD.diagram.edit.parts.AlmacenEditPart) {
			types.add(dFD.diagram.providers.DFDElementTypes.Flujo_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((dFD.diagram.edit.parts.AlmacenEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(dFD.diagram.edit.parts.AlmacenEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dFD.diagram.providers.DFDElementTypes.Flujo_4001) {
			types.add(dFD.diagram.providers.DFDElementTypes.Proceso_2001);
			types.add(dFD.diagram.providers.DFDElementTypes.EntidadExterna_2002);
			types.add(dFD.diagram.providers.DFDElementTypes.Almacen_2003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((dFD.diagram.edit.parts.AlmacenEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dFD.diagram.edit.parts.AlmacenEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dFD.diagram.providers.DFDElementTypes.Flujo_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dFD.diagram.edit.parts.AlmacenEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dFD.diagram.edit.parts.AlmacenEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dFD.diagram.providers.DFDElementTypes.Flujo_4001) {
			types.add(dFD.diagram.providers.DFDElementTypes.Proceso_2001);
			types.add(dFD.diagram.providers.DFDElementTypes.EntidadExterna_2002);
			types.add(dFD.diagram.providers.DFDElementTypes.Almacen_2003);
		}
		return types;
	}

}
