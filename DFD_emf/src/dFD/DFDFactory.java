/**
 */
package dFD;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dFD.DFDPackage
 * @generated
 */
public interface DFDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DFDFactory eINSTANCE = dFD.impl.DFDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Almacen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Almacen</em>'.
	 * @generated
	 */
	Almacen createAlmacen();

	/**
	 * Returns a new object of class '<em>Flujo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flujo</em>'.
	 * @generated
	 */
	Flujo createFlujo();

	/**
	 * Returns a new object of class '<em>Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proceso</em>'.
	 * @generated
	 */
	Proceso createProceso();

	/**
	 * Returns a new object of class '<em>Entidad Externa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad Externa</em>'.
	 * @generated
	 */
	EntidadExterna createEntidadExterna();

	/**
	 * Returns a new object of class '<em>DFD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFD</em>'.
	 * @generated
	 */
	DFD createDFD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DFDPackage getDFDPackage();

} //DFDFactory
