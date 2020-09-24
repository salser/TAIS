/*
 * 
 */
package dFD.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class DFDEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view)) {

			case dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID:
				return new dFD.diagram.edit.parts.DFDEditPart(view);

			case dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID:
				return new dFD.diagram.edit.parts.ProcesoEditPart(view);

			case dFD.diagram.edit.parts.ProcesoNombreEditPart.VISUAL_ID:
				return new dFD.diagram.edit.parts.ProcesoNombreEditPart(view);

			case dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID:
				return new dFD.diagram.edit.parts.EntidadExternaEditPart(view);

			case dFD.diagram.edit.parts.EntidadExternaNombreEditPart.VISUAL_ID:
				return new dFD.diagram.edit.parts.EntidadExternaNombreEditPart(view);

			case dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID:
				return new dFD.diagram.edit.parts.AlmacenEditPart(view);

			case dFD.diagram.edit.parts.AlmacenNombreEditPart.VISUAL_ID:
				return new dFD.diagram.edit.parts.AlmacenNombreEditPart(view);

			case dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID:
				return new dFD.diagram.edit.parts.FlujoEditPart(view);

			case dFD.diagram.edit.parts.FlujoNombreEditPart.VISUAL_ID:
				return new dFD.diagram.edit.parts.FlujoNombreEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
