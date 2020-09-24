/*
 * 
 */
package dFD.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @generated
 */
public class DFDInitDiagramFileAction implements IObjectActionDelegate {

	/**
	* @generated
	*/
	private IWorkbenchPart targetPart;

	/**
	* @generated
	*/
	private URI domainModelURI;

	/**
	* @generated
	*/
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	* @generated
	*/
	public void selectionChanged(IAction action, ISelection selection) {
		domainModelURI = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false || selection.isEmpty()) {
			return;
		}
		IFile file = (IFile) ((IStructuredSelection) selection).getFirstElement();
		domainModelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		action.setEnabled(true);
	}

	/**
	* @generated
	*/
	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	/**
	* @generated
	*/
	public void run(IAction action) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(domainModelURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().logError("Unable to load resource: " + domainModelURI, //$NON-NLS-1$
					ex);
		}
		if (diagramRoot == null) {
			MessageDialog.openError(getShell(), dFD.diagram.part.Messages.InitDiagramFile_ResourceErrorDialogTitle,
					dFD.diagram.part.Messages.InitDiagramFile_ResourceErrorDialogMessage);
			return;
		}
		Wizard wizard = new dFD.diagram.part.DFDNewDiagramFileWizard(domainModelURI, diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS.bind(dFD.diagram.part.Messages.InitDiagramFile_WizardTitle,
				dFD.diagram.edit.parts.DFDEditPart.MODEL_ID));
		dFD.diagram.part.DFDDiagramEditorUtil.runWizard(getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
	}
}
