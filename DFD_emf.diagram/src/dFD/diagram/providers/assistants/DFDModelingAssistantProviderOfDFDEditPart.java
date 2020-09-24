/*
 * 
 */
package dFD.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DFDModelingAssistantProviderOfDFDEditPart extends dFD.diagram.providers.DFDModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(dFD.diagram.providers.DFDElementTypes.Proceso_2001);
		types.add(dFD.diagram.providers.DFDElementTypes.EntidadExterna_2002);
		types.add(dFD.diagram.providers.DFDElementTypes.Almacen_2003);
		return types;
	}

}
