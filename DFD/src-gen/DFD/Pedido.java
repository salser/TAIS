/**
 */
package DFD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DFD.Pedido#getArticulo <em>Articulo</em>}</li>
 *   <li>{@link DFD.Pedido#getId <em>Id</em>}</li>
 *   <li>{@link DFD.Pedido#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link DFD.Pedido#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @see DFD.DFDPackage#getPedido()
 * @model
 * @generated
 */
public interface Pedido extends EObject {
	/**
	 * Returns the value of the '<em><b>Articulo</b></em>' containment reference list.
	 * The list contents are of type {@link DFD.Articulo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articulo</em>' containment reference list.
	 * @see DFD.DFDPackage#getPedido_Articulo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Articulo> getArticulo();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see DFD.DFDPackage#getPedido_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" changeable="false" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see DFD.DFDPackage#getPedido_Descripcion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" changeable="false" ordered="false"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' reference list.
	 * The list contents are of type {@link DFD.Estado}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' reference list.
	 * @see DFD.DFDPackage#getPedido_Estado()
	 * @model upper="3"
	 * @generated
	 */
	EList<Estado> getEstado();

} // Pedido
