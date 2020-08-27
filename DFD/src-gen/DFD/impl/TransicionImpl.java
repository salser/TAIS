/**
 */
package DFD.impl;

import DFD.DFDPackage;
import DFD.Estado;
import DFD.Transicion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transicion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DFD.impl.TransicionImpl#getAnterior <em>Anterior</em>}</li>
 *   <li>{@link DFD.impl.TransicionImpl#getSiguirnte <em>Siguirnte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransicionImpl extends MinimalEObjectImpl.Container implements Transicion {
	/**
	 * The cached value of the '{@link #getAnterior() <em>Anterior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnterior()
	 * @generated
	 * @ordered
	 */
	protected Estado anterior;

	/**
	 * The cached value of the '{@link #getSiguirnte() <em>Siguirnte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguirnte()
	 * @generated
	 * @ordered
	 */
	protected Estado siguirnte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransicionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFDPackage.Literals.TRANSICION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Estado getAnterior() {
		if (anterior != null && anterior.eIsProxy()) {
			InternalEObject oldAnterior = (InternalEObject) anterior;
			anterior = (Estado) eResolveProxy(oldAnterior);
			if (anterior != oldAnterior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DFDPackage.TRANSICION__ANTERIOR,
							oldAnterior, anterior));
			}
		}
		return anterior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estado basicGetAnterior() {
		return anterior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnterior(Estado newAnterior) {
		Estado oldAnterior = anterior;
		anterior = newAnterior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DFDPackage.TRANSICION__ANTERIOR, oldAnterior,
					anterior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Estado getSiguirnte() {
		if (siguirnte != null && siguirnte.eIsProxy()) {
			InternalEObject oldSiguirnte = (InternalEObject) siguirnte;
			siguirnte = (Estado) eResolveProxy(oldSiguirnte);
			if (siguirnte != oldSiguirnte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DFDPackage.TRANSICION__SIGUIRNTE,
							oldSiguirnte, siguirnte));
			}
		}
		return siguirnte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estado basicGetSiguirnte() {
		return siguirnte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiguirnte(Estado newSiguirnte) {
		Estado oldSiguirnte = siguirnte;
		siguirnte = newSiguirnte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DFDPackage.TRANSICION__SIGUIRNTE, oldSiguirnte,
					siguirnte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DFDPackage.TRANSICION__ANTERIOR:
			if (resolve)
				return getAnterior();
			return basicGetAnterior();
		case DFDPackage.TRANSICION__SIGUIRNTE:
			if (resolve)
				return getSiguirnte();
			return basicGetSiguirnte();
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
		case DFDPackage.TRANSICION__ANTERIOR:
			setAnterior((Estado) newValue);
			return;
		case DFDPackage.TRANSICION__SIGUIRNTE:
			setSiguirnte((Estado) newValue);
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
		case DFDPackage.TRANSICION__ANTERIOR:
			setAnterior((Estado) null);
			return;
		case DFDPackage.TRANSICION__SIGUIRNTE:
			setSiguirnte((Estado) null);
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
		case DFDPackage.TRANSICION__ANTERIOR:
			return anterior != null;
		case DFDPackage.TRANSICION__SIGUIRNTE:
			return siguirnte != null;
		}
		return super.eIsSet(featureID);
	}

} //TransicionImpl
