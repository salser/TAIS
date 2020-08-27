/**
 */
package DFD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DFD.Cliente#getPedido <em>Pedido</em>}</li>
 *   <li>{@link DFD.Cliente#getNombre <em>Nombre</em>}</li>
 *   <li>{@link DFD.Cliente#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see DFD.DFDPackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends EObject {
	/**
	 * Returns the value of the '<em><b>Pedido</b></em>' containment reference list.
	 * The list contents are of type {@link DFD.Pedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido</em>' containment reference list.
	 * @see DFD.DFDPackage#getCliente_Pedido()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pedido> getPedido();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see DFD.DFDPackage#getCliente_Nombre()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" changeable="false" ordered="false"
	 * @generated
	 */
	String getNombre();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see DFD.DFDPackage#getCliente_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" changeable="false" ordered="false"
	 * @generated
	 */
	int getId();

} // Cliente
