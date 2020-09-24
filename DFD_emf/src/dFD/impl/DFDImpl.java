/**
 */
package dFD.impl;

import dFD.DFD;
import dFD.DFDPackage;
import dFD.Elemento;
import dFD.Flujo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DFD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dFD.impl.DFDImpl#getFlujo <em>Flujo</em>}</li>
 *   <li>{@link dFD.impl.DFDImpl#getElemento <em>Elemento</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DFDImpl extends EObjectImpl implements DFD {
	/**
	 * The cached value of the '{@link #getFlujo() <em>Flujo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujo()
	 * @generated
	 * @ordered
	 */
	protected EList<Flujo> flujo;

	/**
	 * The cached value of the '{@link #getElemento() <em>Elemento</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento()
	 * @generated
	 * @ordered
	 */
	protected EList<Elemento> elemento;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DFDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFDPackage.Literals.DFD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Flujo> getFlujo() {
		if (flujo == null) {
			flujo = new EObjectContainmentEList<Flujo>(Flujo.class, this, DFDPackage.DFD__FLUJO);
		}
		return flujo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Elemento> getElemento() {
		if (elemento == null) {
			elemento = new EObjectContainmentEList<Elemento>(Elemento.class, this, DFDPackage.DFD__ELEMENTO);
		}
		return elemento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DFDPackage.DFD__FLUJO:
				return ((InternalEList<?>)getFlujo()).basicRemove(otherEnd, msgs);
			case DFDPackage.DFD__ELEMENTO:
				return ((InternalEList<?>)getElemento()).basicRemove(otherEnd, msgs);
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
			case DFDPackage.DFD__FLUJO:
				return getFlujo();
			case DFDPackage.DFD__ELEMENTO:
				return getElemento();
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
			case DFDPackage.DFD__FLUJO:
				getFlujo().clear();
				getFlujo().addAll((Collection<? extends Flujo>)newValue);
				return;
			case DFDPackage.DFD__ELEMENTO:
				getElemento().clear();
				getElemento().addAll((Collection<? extends Elemento>)newValue);
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
			case DFDPackage.DFD__FLUJO:
				getFlujo().clear();
				return;
			case DFDPackage.DFD__ELEMENTO:
				getElemento().clear();
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
			case DFDPackage.DFD__FLUJO:
				return flujo != null && !flujo.isEmpty();
			case DFDPackage.DFD__ELEMENTO:
				return elemento != null && !elemento.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DFDImpl
