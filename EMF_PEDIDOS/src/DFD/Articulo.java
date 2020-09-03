/**
 */
package DFD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Articulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DFD.Articulo#getId <em>Id</em>}</li>
 *   <li>{@link DFD.Articulo#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link DFD.Articulo#getProveedor <em>Proveedor</em>}</li>
 * </ul>
 *
 * @see DFD.DFDPackage#getArticulo()
 * @model annotation="gmf.node label='descripcion'"
 * @generated
 */
public interface Articulo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see DFD.DFDPackage#getArticulo_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" changeable="false" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see DFD.DFDPackage#getArticulo_Descripcion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" changeable="false" ordered="false"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Returns the value of the '<em><b>Proveedor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proveedor</em>' reference.
	 * @see #setProveedor(Proveedor)
	 * @see DFD.DFDPackage#getArticulo_Proveedor()
	 * @model
	 * @generated
	 */
	Proveedor getProveedor();

	/**
	 * Sets the value of the '{@link DFD.Articulo#getProveedor <em>Proveedor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proveedor</em>' reference.
	 * @see #getProveedor()
	 * @generated
	 */
	void setProveedor(Proveedor value);

} // Articulo
