/*
 * 
 */
package dFD.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DFDParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser procesoNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getProcesoNombre_5001Parser() {
		if (procesoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { dFD.DFDPackage.eINSTANCE.getElemento_Nombre() };
			dFD.diagram.parsers.MessageFormatParser parser = new dFD.diagram.parsers.MessageFormatParser(features);
			procesoNombre_5001Parser = parser;
		}
		return procesoNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadExternaNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getEntidadExternaNombre_5002Parser() {
		if (entidadExternaNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { dFD.DFDPackage.eINSTANCE.getElemento_Nombre() };
			dFD.diagram.parsers.MessageFormatParser parser = new dFD.diagram.parsers.MessageFormatParser(features);
			entidadExternaNombre_5002Parser = parser;
		}
		return entidadExternaNombre_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser almacenNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getAlmacenNombre_5003Parser() {
		if (almacenNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { dFD.DFDPackage.eINSTANCE.getElemento_Nombre() };
			dFD.diagram.parsers.MessageFormatParser parser = new dFD.diagram.parsers.MessageFormatParser(features);
			almacenNombre_5003Parser = parser;
		}
		return almacenNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser flujoNombre_6001Parser;

	/**
	* @generated
	*/
	private IParser getFlujoNombre_6001Parser() {
		if (flujoNombre_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { dFD.DFDPackage.eINSTANCE.getFlujo_Nombre() };
			dFD.diagram.parsers.MessageFormatParser parser = new dFD.diagram.parsers.MessageFormatParser(features);
			flujoNombre_6001Parser = parser;
		}
		return flujoNombre_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case dFD.diagram.edit.parts.ProcesoNombreEditPart.VISUAL_ID:
			return getProcesoNombre_5001Parser();
		case dFD.diagram.edit.parts.EntidadExternaNombreEditPart.VISUAL_ID:
			return getEntidadExternaNombre_5002Parser();
		case dFD.diagram.edit.parts.AlmacenNombreEditPart.VISUAL_ID:
			return getAlmacenNombre_5003Parser();
		case dFD.diagram.edit.parts.FlujoNombreEditPart.VISUAL_ID:
			return getFlujoNombre_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(dFD.diagram.part.DFDVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (dFD.diagram.providers.DFDElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
