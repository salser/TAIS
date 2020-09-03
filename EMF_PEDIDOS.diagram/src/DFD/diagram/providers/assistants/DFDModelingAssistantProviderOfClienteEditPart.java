/*
 * 
 */
package DFD.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import DFD.diagram.providers.DFDElementTypes;
import DFD.diagram.providers.DFDModelingAssistantProvider;

/**
 * @generated
 */
public class DFDModelingAssistantProviderOfClienteEditPart extends DFDModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DFDElementTypes.Pedido_2001);
		return types;
	}

}
