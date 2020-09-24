/*
* 
*/
package dFD.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class FlujoItemSemanticEditPolicy extends dFD.diagram.edit.policies.DFDBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FlujoItemSemanticEditPolicy() {
		super(dFD.diagram.providers.DFDElementTypes.Flujo_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
