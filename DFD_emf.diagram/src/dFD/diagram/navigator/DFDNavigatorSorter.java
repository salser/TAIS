/*
* 
*/
package dFD.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class DFDNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof dFD.diagram.navigator.DFDNavigatorItem) {
			dFD.diagram.navigator.DFDNavigatorItem item = (dFD.diagram.navigator.DFDNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return dFD.diagram.part.DFDVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
