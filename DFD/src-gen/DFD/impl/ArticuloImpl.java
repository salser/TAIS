/**
 */
package DFD.impl;

import DFD.Articulo;
import DFD.DFDPackage;
import DFD.Proveedor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Articulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DFD.impl.ArticuloImpl#getId <em>Id</em>}</li>
 *   <li>{@link DFD.impl.ArticuloImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link DFD.impl.ArticuloImpl#getProveedor <em>Proveedor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticuloImpl extends MinimalEObjectImpl.Container implements Articulo {
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
	 * The cached value of the '{@link #getProveedor() <em>Proveedor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProveedor()
	 * @generated
	 * @ordered
	 */
	protected Proveedor proveedor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticuloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFDPackage.Literals.ARTICULO;
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
	public Proveedor getProveedor() {
		if (proveedor != null && proveedor.eIsProxy()) {
			InternalEObject oldProveedor = (InternalEObject) proveedor;
			proveedor = (Proveedor) eResolveProxy(oldProveedor);
			if (proveedor != oldProveedor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DFDPackage.ARTICULO__PROVEEDOR,
							oldProveedor, proveedor));
			}
		}
		return proveedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proveedor basicGetProveedor() {
		return proveedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProveedor(Proveedor newProveedor) {
		Proveedor oldProveedor = proveedor;
		proveedor = newProveedor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DFDPackage.ARTICULO__PROVEEDOR, oldProveedor,
					proveedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DFDPackage.ARTICULO__ID:
			return getId();
		case DFDPackage.ARTICULO__DESCRIPCION:
			return getDescripcion();
		case DFDPackage.ARTICULO__PROVEEDOR:
			if (resolve)
				return getProveedor();
			return basicGetProveedor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DFDPackage.ARTICULO__PROVEEDOR:
			setProveedor((Proveedor) newValue);
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
		case DFDPackage.ARTICULO__PROVEEDOR:
			setProveedor((Proveedor) null);
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
		case DFDPackage.ARTICULO__ID:
			return id != ID_EDEFAULT;
		case DFDPackage.ARTICULO__DESCRIPCION:
			return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
		case DFDPackage.ARTICULO__PROVEEDOR:
			return proveedor != null;
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

} //ArticuloImpl
