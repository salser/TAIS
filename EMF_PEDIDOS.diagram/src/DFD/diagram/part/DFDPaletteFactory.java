
/*
 * 
 */
package DFD.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import DFD.diagram.providers.DFDElementTypes;

/**
 * @generated
 */
public class DFDPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createArticulo1CreationTool());
		paletteContainer.add(createPedido2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createArticulo1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Articulo1CreationTool_title, Messages.Articulo1CreationTool_desc, null,
				null) {
		};
		entry.setId("createArticulo1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPedido2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Pedido2CreationTool_title,
				Messages.Pedido2CreationTool_desc, Collections.singletonList(DFDElementTypes.Pedido_2001));
		entry.setId("createPedido2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DFDElementTypes.getImageDescriptor(DFDElementTypes.Pedido_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
