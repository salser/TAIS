/*
* 
*/
package DFD.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import DFD.Cliente;
import DFD.Pedido;
import DFD.diagram.edit.parts.ClienteEditPart;
import DFD.diagram.edit.parts.PedidoEditPart;

/**
 * @generated
 */
public class DFDDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DFDNodeDescriptor> getSemanticChildren(View view) {
		switch (DFDVisualIDRegistry.getVisualID(view)) {
		case ClienteEditPart.VISUAL_ID:
			return getCliente_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DFDNodeDescriptor> getCliente_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Cliente modelElement = (Cliente) view.getElement();
		LinkedList<DFDNodeDescriptor> result = new LinkedList<DFDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPedido().iterator(); it.hasNext();) {
			Pedido childElement = (Pedido) it.next();
			int visualID = DFDVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PedidoEditPart.VISUAL_ID) {
				result.add(new DFDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DFDLinkDescriptor> getContainedLinks(View view) {
		switch (DFDVisualIDRegistry.getVisualID(view)) {
		case ClienteEditPart.VISUAL_ID:
			return getCliente_1000ContainedLinks(view);
		case PedidoEditPart.VISUAL_ID:
			return getPedido_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DFDLinkDescriptor> getIncomingLinks(View view) {
		switch (DFDVisualIDRegistry.getVisualID(view)) {
		case PedidoEditPart.VISUAL_ID:
			return getPedido_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DFDLinkDescriptor> getOutgoingLinks(View view) {
		switch (DFDVisualIDRegistry.getVisualID(view)) {
		case PedidoEditPart.VISUAL_ID:
			return getPedido_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DFDLinkDescriptor> getCliente_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DFDLinkDescriptor> getPedido_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DFDLinkDescriptor> getPedido_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DFDLinkDescriptor> getPedido_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<DFDNodeDescriptor> getSemanticChildren(View view) {
			return DFDDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DFDLinkDescriptor> getContainedLinks(View view) {
			return DFDDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DFDLinkDescriptor> getIncomingLinks(View view) {
			return DFDDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DFDLinkDescriptor> getOutgoingLinks(View view) {
			return DFDDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
