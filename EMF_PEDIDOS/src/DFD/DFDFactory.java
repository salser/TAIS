/**
 */
package DFD;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DFD.DFDPackage
 * @generated
 */
public interface DFDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DFDFactory eINSTANCE = DFD.impl.DFDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliente</em>'.
	 * @generated
	 */
	Cliente createCliente();

	/**
	 * Returns a new object of class '<em>Pedido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pedido</em>'.
	 * @generated
	 */
	Pedido createPedido();

	/**
	 * Returns a new object of class '<em>Articulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Articulo</em>'.
	 * @generated
	 */
	Articulo createArticulo();

	/**
	 * Returns a new object of class '<em>Proveedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proveedor</em>'.
	 * @generated
	 */
	Proveedor createProveedor();

	/**
	 * Returns a new object of class '<em>Estado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estado</em>'.
	 * @generated
	 */
	Estado createEstado();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DFDPackage getDFDPackage();

} //DFDFactory
