/**
 */
package DFD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DFD.DFDFactory
 * @model kind="package"
 * @generated
 */
public interface DFDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DFD";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/DFD";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DFD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DFDPackage eINSTANCE = DFD.impl.DFDPackageImpl.init();

	/**
	 * The meta object id for the '{@link DFD.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFD.impl.ClienteImpl
	 * @see DFD.impl.DFDPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Pedido</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__PEDIDO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ID = 2;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link DFD.impl.PedidoImpl <em>Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFD.impl.PedidoImpl
	 * @see DFD.impl.DFDPackageImpl#getPedido()
	 * @generated
	 */
	int PEDIDO = 1;

	/**
	 * The feature id for the '<em><b>Articulo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__ARTICULO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__ID = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__DESCRIPCION = 2;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__ESTADO = 3;

	/**
	 * The number of structural features of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link DFD.impl.ArticuloImpl <em>Articulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFD.impl.ArticuloImpl
	 * @see DFD.impl.DFDPackageImpl#getArticulo()
	 * @generated
	 */
	int ARTICULO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICULO__ID = 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICULO__DESCRIPCION = 1;

	/**
	 * The feature id for the '<em><b>Proveedor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICULO__PROVEEDOR = 2;

	/**
	 * The number of structural features of the '<em>Articulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICULO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link DFD.impl.ProveedorImpl <em>Proveedor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFD.impl.ProveedorImpl
	 * @see DFD.impl.DFDPackageImpl#getProveedor()
	 * @generated
	 */
	int PROVEEDOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Proveedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link DFD.impl.EstadoImpl <em>Estado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFD.impl.EstadoImpl
	 * @see DFD.impl.DFDPackageImpl#getEstado()
	 * @generated
	 */
	int ESTADO = 4;

	/**
	 * The number of structural features of the '<em>Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link DFD.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see DFD.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the containment reference list '{@link DFD.Cliente#getPedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pedido</em>'.
	 * @see DFD.Cliente#getPedido()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_Pedido();

	/**
	 * Returns the meta object for the attribute '{@link DFD.Cliente#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see DFD.Cliente#getNombre()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link DFD.Cliente#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see DFD.Cliente#getId()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Id();

	/**
	 * Returns the meta object for class '{@link DFD.Pedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedido</em>'.
	 * @see DFD.Pedido
	 * @generated
	 */
	EClass getPedido();

	/**
	 * Returns the meta object for the containment reference list '{@link DFD.Pedido#getArticulo <em>Articulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Articulo</em>'.
	 * @see DFD.Pedido#getArticulo()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_Articulo();

	/**
	 * Returns the meta object for the attribute '{@link DFD.Pedido#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see DFD.Pedido#getId()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Id();

	/**
	 * Returns the meta object for the attribute '{@link DFD.Pedido#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see DFD.Pedido#getDescripcion()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Descripcion();

	/**
	 * Returns the meta object for the reference list '{@link DFD.Pedido#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estado</em>'.
	 * @see DFD.Pedido#getEstado()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_Estado();

	/**
	 * Returns the meta object for class '{@link DFD.Articulo <em>Articulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Articulo</em>'.
	 * @see DFD.Articulo
	 * @generated
	 */
	EClass getArticulo();

	/**
	 * Returns the meta object for the attribute '{@link DFD.Articulo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see DFD.Articulo#getId()
	 * @see #getArticulo()
	 * @generated
	 */
	EAttribute getArticulo_Id();

	/**
	 * Returns the meta object for the attribute '{@link DFD.Articulo#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see DFD.Articulo#getDescripcion()
	 * @see #getArticulo()
	 * @generated
	 */
	EAttribute getArticulo_Descripcion();

	/**
	 * Returns the meta object for the reference '{@link DFD.Articulo#getProveedor <em>Proveedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proveedor</em>'.
	 * @see DFD.Articulo#getProveedor()
	 * @see #getArticulo()
	 * @generated
	 */
	EReference getArticulo_Proveedor();

	/**
	 * Returns the meta object for class '{@link DFD.Proveedor <em>Proveedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proveedor</em>'.
	 * @see DFD.Proveedor
	 * @generated
	 */
	EClass getProveedor();

	/**
	 * Returns the meta object for the attribute '{@link DFD.Proveedor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see DFD.Proveedor#getId()
	 * @see #getProveedor()
	 * @generated
	 */
	EAttribute getProveedor_Id();

	/**
	 * Returns the meta object for the attribute '{@link DFD.Proveedor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see DFD.Proveedor#getNombre()
	 * @see #getProveedor()
	 * @generated
	 */
	EAttribute getProveedor_Nombre();

	/**
	 * Returns the meta object for class '{@link DFD.Estado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estado</em>'.
	 * @see DFD.Estado
	 * @generated
	 */
	EClass getEstado();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DFDFactory getDFDFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DFD.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFD.impl.ClienteImpl
		 * @see DFD.impl.DFDPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Pedido</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__PEDIDO = eINSTANCE.getCliente_Pedido();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__NOMBRE = eINSTANCE.getCliente_Nombre();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__ID = eINSTANCE.getCliente_Id();

		/**
		 * The meta object literal for the '{@link DFD.impl.PedidoImpl <em>Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFD.impl.PedidoImpl
		 * @see DFD.impl.DFDPackageImpl#getPedido()
		 * @generated
		 */
		EClass PEDIDO = eINSTANCE.getPedido();

		/**
		 * The meta object literal for the '<em><b>Articulo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__ARTICULO = eINSTANCE.getPedido_Articulo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__ID = eINSTANCE.getPedido_Id();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__DESCRIPCION = eINSTANCE.getPedido_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__ESTADO = eINSTANCE.getPedido_Estado();

		/**
		 * The meta object literal for the '{@link DFD.impl.ArticuloImpl <em>Articulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFD.impl.ArticuloImpl
		 * @see DFD.impl.DFDPackageImpl#getArticulo()
		 * @generated
		 */
		EClass ARTICULO = eINSTANCE.getArticulo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICULO__ID = eINSTANCE.getArticulo_Id();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICULO__DESCRIPCION = eINSTANCE.getArticulo_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Proveedor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICULO__PROVEEDOR = eINSTANCE.getArticulo_Proveedor();

		/**
		 * The meta object literal for the '{@link DFD.impl.ProveedorImpl <em>Proveedor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFD.impl.ProveedorImpl
		 * @see DFD.impl.DFDPackageImpl#getProveedor()
		 * @generated
		 */
		EClass PROVEEDOR = eINSTANCE.getProveedor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVEEDOR__ID = eINSTANCE.getProveedor_Id();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVEEDOR__NOMBRE = eINSTANCE.getProveedor_Nombre();

		/**
		 * The meta object literal for the '{@link DFD.impl.EstadoImpl <em>Estado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFD.impl.EstadoImpl
		 * @see DFD.impl.DFDPackageImpl#getEstado()
		 * @generated
		 */
		EClass ESTADO = eINSTANCE.getEstado();

	}

} //DFDPackage
