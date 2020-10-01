/**
 */
package dFD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dFD.DFD#getFlujo <em>Flujo</em>}</li>
 *   <li>{@link dFD.DFD#getElemento <em>Elemento</em>}</li>
 *   <li>{@link dFD.DFD#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see dFD.DFDPackage#getDFD()
 * @model
 * @generated
 */
public interface DFD extends EObject {
	/**
	 * Returns the value of the '<em><b>Flujo</b></em>' containment reference list.
	 * The list contents are of type {@link dFD.Flujo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujo</em>' containment reference list.
	 * @see dFD.DFDPackage#getDFD_Flujo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flujo> getFlujo();

	/**
	 * Returns the value of the '<em><b>Elemento</b></em>' containment reference list.
	 * The list contents are of type {@link dFD.Elemento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento</em>' containment reference list.
	 * @see dFD.DFDPackage#getDFD_Elemento()
	 * @model containment="true"
	 * @generated
	 */
	EList<Elemento> getElemento();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dFD.DFDPackage#getDFD_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dFD.DFD#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // DFD
