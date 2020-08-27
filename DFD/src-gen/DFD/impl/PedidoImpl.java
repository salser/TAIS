/**
 */
package DFD.impl;

import DFD.Articulo;
import DFD.DFDPackage;
import DFD.Estado;
import DFD.Pedido;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DFD.impl.PedidoImpl#getArticulo <em>Articulo</em>}</li>
 *   <li>{@link DFD.impl.PedidoImpl#getId <em>Id</em>}</li>
 *   <li>{@link DFD.impl.PedidoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link DFD.impl.PedidoImpl#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedidoImpl extends MinimalEObjectImpl.Container implements Pedido {
	/**
	 * The cached value of the '{@link #getArticulo() <em>Articulo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticulo()
	 * @generated
	 * @ordered
	 */
	protected EList<Articulo> articulo;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected EList<Estado> estado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFDPackage.Literals.PEDIDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Articulo> getArticulo() {
		if (articulo == null) {
			articulo = new EObjectContainmentEList<Articulo>(Articulo.class, this, DFDPackage.PEDIDO__ARTICULO);
		}
		return articulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Estado> getEstado() {
		if (estado == null) {
			estado = new EObjectResolvingEList<Estado>(Estado.class, this, DFDPackage.PEDIDO__ESTADO);
		}
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DFDPackage.PEDIDO__ARTICULO:
			return ((InternalEList<?>) getArticulo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DFDPackage.PEDIDO__ARTICULO:
			return getArticulo();
		case DFDPackage.PEDIDO__ID:
			return getId();
		case DFDPackage.PEDIDO__DESCRIPCION:
			return getDescripcion();
		case DFDPackage.PEDIDO__ESTADO:
			return getEstado();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DFDPackage.PEDIDO__ARTICULO:
			getArticulo().clear();
			getArticulo().addAll((Collection<? extends Articulo>) newValue);
			return;
		case DFDPackage.PEDIDO__ESTADO:
			getEstado().clear();
			getEstado().addAll((Collection<? extends Estado>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DFDPackage.PEDIDO__ARTICULO:
			getArticulo().clear();
			return;
		case DFDPackage.PEDIDO__ESTADO:
			getEstado().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DFDPackage.PEDIDO__ARTICULO:
			return articulo != null && !articulo.isEmpty();
		case DFDPackage.PEDIDO__ID:
			return id != ID_EDEFAULT;
		case DFDPackage.PEDIDO__DESCRIPCION:
			return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
		case DFDPackage.PEDIDO__ESTADO:
			return estado != null && !estado.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //PedidoImpl
