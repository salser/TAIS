/**
 */
package dFD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flujo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dFD.Flujo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dFD.Flujo#getAnterior <em>Anterior</em>}</li>
 *   <li>{@link dFD.Flujo#getSiguiente <em>Siguiente</em>}</li>
 * </ul>
 *
 * @see dFD.DFDPackage#getFlujo()
 * @model annotation="gmf.link source='anterior' target='siguiente' label='nombre'"
 * @generated
 */
public interface Flujo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dFD.DFDPackage#getFlujo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dFD.Flujo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Anterior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anterior</em>' reference.
	 * @see #setAnterior(Elemento)
	 * @see dFD.DFDPackage#getFlujo_Anterior()
	 * @model
	 * @generated
	 */
	Elemento getAnterior();

	/**
	 * Sets the value of the '{@link dFD.Flujo#getAnterior <em>Anterior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anterior</em>' reference.
	 * @see #getAnterior()
	 * @generated
	 */
	void setAnterior(Elemento value);

	/**
	 * Returns the value of the '<em><b>Siguiente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siguiente</em>' reference.
	 * @see #setSiguiente(Elemento)
	 * @see dFD.DFDPackage#getFlujo_Siguiente()
	 * @model
	 * @generated
	 */
	Elemento getSiguiente();

	/**
	 * Sets the value of the '{@link dFD.Flujo#getSiguiente <em>Siguiente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siguiente</em>' reference.
	 * @see #getSiguiente()
	 * @generated
	 */
	void setSiguiente(Elemento value);

} // Flujo
