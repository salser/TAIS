/*
 * 
 */
package dFD.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class FlujoReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public FlujoReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof dFD.Flujo) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof dFD.Elemento && newEnd instanceof dFD.Elemento)) {
			return false;
		}
		dFD.Elemento target = getLink().getSiguiente();
		if (!(getLink().eContainer() instanceof dFD.DFD)) {
			return false;
		}
		dFD.DFD container = (dFD.DFD) getLink().eContainer();
		return dFD.diagram.edit.policies.DFDBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistFlujo_4001(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof dFD.Elemento && newEnd instanceof dFD.Elemento)) {
			return false;
		}
		dFD.Elemento source = getLink().getAnterior();
		if (!(getLink().eContainer() instanceof dFD.DFD)) {
			return false;
		}
		dFD.DFD container = (dFD.DFD) getLink().eContainer();
		return dFD.diagram.edit.policies.DFDBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistFlujo_4001(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setAnterior(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSiguiente(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected dFD.Flujo getLink() {
		return (dFD.Flujo) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected dFD.Elemento getOldSource() {
		return (dFD.Elemento) oldEnd;
	}

	/**
	* @generated
	*/
	protected dFD.Elemento getNewSource() {
		return (dFD.Elemento) newEnd;
	}

	/**
	* @generated
	*/
	protected dFD.Elemento getOldTarget() {
		return (dFD.Elemento) oldEnd;
	}

	/**
	* @generated
	*/
	protected dFD.Elemento getNewTarget() {
		return (dFD.Elemento) newEnd;
	}
}
