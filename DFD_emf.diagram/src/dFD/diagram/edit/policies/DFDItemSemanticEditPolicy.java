/*
* 
*/
package dFD.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class DFDItemSemanticEditPolicy extends dFD.diagram.edit.policies.DFDBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DFDItemSemanticEditPolicy() {
		super(dFD.diagram.providers.DFDElementTypes.DFD_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dFD.diagram.providers.DFDElementTypes.Almacen_2001 == req.getElementType()) {
			return getGEFWrapper(new dFD.diagram.edit.commands.AlmacenCreateCommand(req));
		}
		if (dFD.diagram.providers.DFDElementTypes.Proceso_2002 == req.getElementType()) {
			return getGEFWrapper(new dFD.diagram.edit.commands.ProcesoCreateCommand(req));
		}
		if (dFD.diagram.providers.DFDElementTypes.EntidadExterna_2003 == req.getElementType()) {
			return getGEFWrapper(new dFD.diagram.edit.commands.EntidadExternaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
