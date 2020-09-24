/*
 * 
 */
package dFD.diagram.providers;

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
		ElementInitializers cached = dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			dFD.diagram.part.DFDDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
