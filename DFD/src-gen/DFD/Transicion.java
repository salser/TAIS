/**
 */
package DFD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DFD.Transicion#getAnterior <em>Anterior</em>}</li>
 *   <li>{@link DFD.Transicion#getSiguirnte <em>Siguirnte</em>}</li>
 * </ul>
 *
 * @see DFD.DFDPackage#getTransicion()
 * @model
 * @generated
 */
public interface Transicion extends EObject {
	/**
	 * Returns the value of the '<em><b>Anterior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anterior</em>' reference.
	 * @see #setAnterior(Estado)
	 * @see DFD.DFDPackage#getTransicion_Anterior()
	 * @model
	 * @generated
	 */
	Estado getAnterior();

	/**
	 * Sets the value of the '{@link DFD.Transicion#getAnterior <em>Anterior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anterior</em>' reference.
	 * @see #getAnterior()
	 * @generated
	 */
	void setAnterior(Estado value);

	/**
	 * Returns the value of the '<em><b>Siguirnte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siguirnte</em>' reference.
	 * @see #setSiguirnte(Estado)
	 * @see DFD.DFDPackage#getTransicion_Siguirnte()
	 * @model
	 * @generated
	 */
	Estado getSiguirnte();

	/**
	 * Sets the value of the '{@link DFD.Transicion#getSiguirnte <em>Siguirnte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siguirnte</em>' reference.
	 * @see #getSiguirnte()
	 * @generated
	 */
	void setSiguirnte(Estado value);

} // Transicion
