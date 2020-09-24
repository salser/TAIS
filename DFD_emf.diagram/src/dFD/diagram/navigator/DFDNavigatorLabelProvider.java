/*
* 
*/
package dFD.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class DFDNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof dFD.diagram.navigator.DFDNavigatorItem
				&& !isOwnView(((dFD.diagram.navigator.DFDNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof dFD.diagram.navigator.DFDNavigatorGroup) {
			dFD.diagram.navigator.DFDNavigatorGroup group = (dFD.diagram.navigator.DFDNavigatorGroup) element;
			return dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof dFD.diagram.navigator.DFDNavigatorItem) {
			dFD.diagram.navigator.DFDNavigatorItem navigatorItem = (dFD.diagram.navigator.DFDNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view)) {
		case dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/dFD?DFD", //$NON-NLS-1$
					dFD.diagram.providers.DFDElementTypes.DFD_1000);
		case dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dFD?Almacen", //$NON-NLS-1$
					dFD.diagram.providers.DFDElementTypes.Almacen_2001);
		case dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dFD?Proceso", //$NON-NLS-1$
					dFD.diagram.providers.DFDElementTypes.Proceso_2002);
		case dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dFD?EntidadExterna", //$NON-NLS-1$
					dFD.diagram.providers.DFDElementTypes.EntidadExterna_2003);
		case dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dFD?Flujo", //$NON-NLS-1$
					dFD.diagram.providers.DFDElementTypes.Flujo_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& dFD.diagram.providers.DFDElementTypes.isKnownElementType(elementType)) {
			image = dFD.diagram.providers.DFDElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof dFD.diagram.navigator.DFDNavigatorGroup) {
			dFD.diagram.navigator.DFDNavigatorGroup group = (dFD.diagram.navigator.DFDNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof dFD.diagram.navigator.DFDNavigatorItem) {
			dFD.diagram.navigator.DFDNavigatorItem navigatorItem = (dFD.diagram.navigator.DFDNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (dFD.diagram.part.DFDVisualIDRegistry.getVisualID(view)) {
		case dFD.diagram.edit.parts.DFDEditPart.VISUAL_ID:
			return getDFD_1000Text(view);
		case dFD.diagram.edit.parts.AlmacenEditPart.VISUAL_ID:
			return getAlmacen_2001Text(view);
		case dFD.diagram.edit.parts.ProcesoEditPart.VISUAL_ID:
			return getProceso_2002Text(view);
		case dFD.diagram.edit.parts.EntidadExternaEditPart.VISUAL_ID:
			return getEntidadExterna_2003Text(view);
		case dFD.diagram.edit.parts.FlujoEditPart.VISUAL_ID:
			return getFlujo_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDFD_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAlmacen_2001Text(View view) {
		IParser parser = dFD.diagram.providers.DFDParserProvider.getParser(
				dFD.diagram.providers.DFDElementTypes.Almacen_2001,
				view.getElement() != null ? view.getElement() : view,
				dFD.diagram.part.DFDVisualIDRegistry.getType(dFD.diagram.edit.parts.AlmacenNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProceso_2002Text(View view) {
		IParser parser = dFD.diagram.providers.DFDParserProvider.getParser(
				dFD.diagram.providers.DFDElementTypes.Proceso_2002,
				view.getElement() != null ? view.getElement() : view,
				dFD.diagram.part.DFDVisualIDRegistry.getType(dFD.diagram.edit.parts.ProcesoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadExterna_2003Text(View view) {
		IParser parser = dFD.diagram.providers.DFDParserProvider.getParser(
				dFD.diagram.providers.DFDElementTypes.EntidadExterna_2003,
				view.getElement() != null ? view.getElement() : view, dFD.diagram.part.DFDVisualIDRegistry
						.getType(dFD.diagram.edit.parts.EntidadExternaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFlujo_4001Text(View view) {
		IParser parser = dFD.diagram.providers.DFDParserProvider.getParser(
				dFD.diagram.providers.DFDElementTypes.Flujo_4001, view.getElement() != null ? view.getElement() : view,
				dFD.diagram.part.DFDVisualIDRegistry.getType(dFD.diagram.edit.parts.FlujoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return dFD.diagram.edit.parts.DFDEditPart.MODEL_ID
				.equals(dFD.diagram.part.DFDVisualIDRegistry.getModelID(view));
	}

}
