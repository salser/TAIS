/**
 */
package dFD.impl;

import dFD.DFDPackage;
import dFD.Elemento;
import dFD.Flujo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flujo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dFD.impl.FlujoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dFD.impl.FlujoImpl#getAnterior <em>Anterior</em>}</li>
 *   <li>{@link dFD.impl.FlujoImpl#getSiguiente <em>Siguiente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlujoImpl extends EObjectImpl implements Flujo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnterior() <em>Anterior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnterior()
	 * @generated
	 * @ordered
	 */
	protected Elemento anterior;

	/**
	 * The cached value of the '{@link #getSiguiente() <em>Siguiente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguiente()
	 * @generated
	 * @ordered
	 */
	protected Elemento siguiente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlujoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFDPackage.Literals.FLUJO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DFDPackage.FLUJO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elemento getAnterior() {
		if (anterior != null && anterior.eIsProxy()) {
			InternalEObject oldAnterior = (InternalEObject)anterior;
			anterior = (Elemento)eResolveProxy(oldAnterior);
			if (anterior != oldAnterior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DFDPackage.FLUJO__ANTERIOR, oldAnterior, anterior));
			}
		}
		return anterior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento basicGetAnterior() {
		return anterior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnterior(Elemento newAnterior) {
		Elemento oldAnterior = anterior;
		anterior = newAnterior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DFDPackage.FLUJO__ANTERIOR, oldAnterior, anterior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elemento getSiguiente() {
		if (siguiente != null && siguiente.eIsProxy()) {
			InternalEObject oldSiguiente = (InternalEObject)siguiente;
			siguiente = (Elemento)eResolveProxy(oldSiguiente);
			if (siguiente != oldSiguiente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DFDPackage.FLUJO__SIGUIENTE, oldSiguiente, siguiente));
			}
		}
		return siguiente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento basicGetSiguiente() {
		return siguiente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiguiente(Elemento newSiguiente) {
		Elemento oldSiguiente = siguiente;
		siguiente = newSiguiente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DFDPackage.FLUJO__SIGUIENTE, oldSiguiente, siguiente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DFDPackage.FLUJO__NOMBRE:
				return getNombre();
			case DFDPackage.FLUJO__ANTERIOR:
				if (resolve) return getAnterior();
				return basicGetAnterior();
			case DFDPackage.FLUJO__SIGUIENTE:
				if (resolve) return getSiguiente();
				return basicGetSiguiente();
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
			case DFDPackage.FLUJO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DFDPackage.FLUJO__ANTERIOR:
				setAnterior((Elemento)newValue);
				return;
			case DFDPackage.FLUJO__SIGUIENTE:
				setSiguiente((Elemento)newValue);
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
			case DFDPackage.FLUJO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DFDPackage.FLUJO__ANTERIOR:
				setAnterior((Elemento)null);
				return;
			case DFDPackage.FLUJO__SIGUIENTE:
				setSiguiente((Elemento)null);
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
			case DFDPackage.FLUJO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DFDPackage.FLUJO__ANTERIOR:
				return anterior != null;
			case DFDPackage.FLUJO__SIGUIENTE:
				return siguiente != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //FlujoImpl
