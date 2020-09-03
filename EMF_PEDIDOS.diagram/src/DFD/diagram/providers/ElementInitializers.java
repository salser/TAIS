/*
 * 
 */
package DFD.diagram.providers;

import DFD.diagram.part.DFDDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DFDDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			DFDDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
