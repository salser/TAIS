/*
 * 
 */
package dFD.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		dFD.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		dFD.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		dFD.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		dFD.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		dFD.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return dFD.diagram.part.DFDDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
