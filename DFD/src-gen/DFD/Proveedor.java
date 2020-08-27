/**
 */
package DFD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proveedor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DFD.Proveedor#getId <em>Id</em>}</li>
 *   <li>{@link DFD.Proveedor#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see DFD.DFDPackage#getProveedor()
 * @model
 * @generated
 */
public interface Proveedor extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see DFD.DFDPackage#getProveedor_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" changeable="false" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see DFD.DFDPackage#getProveedor_Nombre()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" changeable="false" ordered="false"
	 * @generated
	 */
	String getNombre();

} // Proveedor
