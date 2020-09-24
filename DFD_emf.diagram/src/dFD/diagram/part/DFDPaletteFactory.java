
/*
 * 
 */
package dFD.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class DFDPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(dFD.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAlmacen1CreationTool());
		paletteContainer.add(createEntidadExterna2CreationTool());
		paletteContainer.add(createProceso3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(dFD.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createFlujo1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAlmacen1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(dFD.diagram.part.Messages.Almacen1CreationTool_title,
				dFD.diagram.part.Messages.Almacen1CreationTool_desc,
				Collections.singletonList(dFD.diagram.providers.DFDElementTypes.Almacen_2003));
		entry.setId("createAlmacen1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dFD.diagram.providers.DFDElementTypes
				.getImageDescriptor(dFD.diagram.providers.DFDElementTypes.Almacen_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidadExterna2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dFD.diagram.part.Messages.EntidadExterna2CreationTool_title,
				dFD.diagram.part.Messages.EntidadExterna2CreationTool_desc,
				Collections.singletonList(dFD.diagram.providers.DFDElementTypes.EntidadExterna_2002));
		entry.setId("createEntidadExterna2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dFD.diagram.providers.DFDElementTypes
				.getImageDescriptor(dFD.diagram.providers.DFDElementTypes.EntidadExterna_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProceso3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(dFD.diagram.part.Messages.Proceso3CreationTool_title,
				dFD.diagram.part.Messages.Proceso3CreationTool_desc,
				Collections.singletonList(dFD.diagram.providers.DFDElementTypes.Proceso_2001));
		entry.setId("createProceso3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dFD.diagram.providers.DFDElementTypes
				.getImageDescriptor(dFD.diagram.providers.DFDElementTypes.Proceso_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFlujo1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(dFD.diagram.part.Messages.Flujo1CreationTool_title,
				dFD.diagram.part.Messages.Flujo1CreationTool_desc,
				Collections.singletonList(dFD.diagram.providers.DFDElementTypes.Flujo_4001));
		entry.setId("createFlujo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dFD.diagram.providers.DFDElementTypes
				.getImageDescriptor(dFD.diagram.providers.DFDElementTypes.Flujo_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
