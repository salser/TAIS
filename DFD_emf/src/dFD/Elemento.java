/**
 */
package dFD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dFD.Elemento#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see dFD.DFDPackage#getElemento()
 * @model abstract="true"
 *        annotation="gmf.node label='nombre'"
 * @generated
 */
public interface Elemento extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dFD.DFDPackage#getElemento_Nombre()
	 * @model unique="false"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dFD.Elemento#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Elemento
