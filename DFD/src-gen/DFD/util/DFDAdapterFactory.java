/**
 */
package DFD.util;

import DFD.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DFD.DFDPackage
 * @generated
 */
public class DFDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DFDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DFDPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DFDSwitch<Adapter> modelSwitch = new DFDSwitch<Adapter>() {
		@Override
		public Adapter caseCliente(Cliente object) {
			return createClienteAdapter();
		}

		@Override
		public Adapter casePedido(Pedido object) {
			return createPedidoAdapter();
		}

		@Override
		public Adapter caseArticulo(Articulo object) {
			return createArticuloAdapter();
		}

		@Override
		public Adapter caseProveedor(Proveedor object) {
			return createProveedorAdapter();
		}

		@Override
		public Adapter caseEstado(Estado object) {
			return createEstadoAdapter();
		}

		@Override
		public Adapter caseTransicion(Transicion object) {
			return createTransicionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link DFD.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DFD.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DFD.Pedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DFD.Pedido
	 * @generated
	 */
	public Adapter createPedidoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DFD.Articulo <em>Articulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DFD.Articulo
	 * @generated
	 */
	public Adapter createArticuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DFD.Proveedor <em>Proveedor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DFD.Proveedor
	 * @generated
	 */
	public Adapter createProveedorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DFD.Estado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DFD.Estado
	 * @generated
	 */
	public Adapter createEstadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DFD.Transicion <em>Transicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DFD.Transicion
	 * @generated
	 */
	public Adapter createTransicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DFDAdapterFactory
