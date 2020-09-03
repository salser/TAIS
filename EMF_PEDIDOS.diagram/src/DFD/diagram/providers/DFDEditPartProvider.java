/*
 * 
 */
package DFD.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import DFD.diagram.edit.parts.ClienteEditPart;
import DFD.diagram.edit.parts.DFDEditPartFactory;
import DFD.diagram.part.DFDVisualIDRegistry;

/**
 * @generated
 */
public class DFDEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DFDEditPartProvider() {
		super(new DFDEditPartFactory(), DFDVisualIDRegistry.TYPED_INSTANCE, ClienteEditPart.MODEL_ID);
	}

}
