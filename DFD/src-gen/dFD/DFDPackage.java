/**
 */
package dFD;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dFD.DFDFactory
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
	String eNAME = "dFD";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dFD";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dFD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DFDPackage eINSTANCE = dFD.impl.DFDPackageImpl.init();

	/**
	 * The meta object id for the '{@link dFD.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dFD.impl.ElementoImpl
	 * @see dFD.impl.DFDPackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dFD.impl.AlmacenImpl <em>Almacen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dFD.impl.AlmacenImpl
	 * @see dFD.impl.DFDPackageImpl#getAlmacen()
	 * @generated
	 */
	int ALMACEN = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACEN__NOMBRE = ELEMENTO__NOMBRE;

	/**
	 * The number of structural features of the '<em>Almacen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACEN_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Almacen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACEN_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dFD.impl.FlujoImpl <em>Flujo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dFD.impl.FlujoImpl
	 * @see dFD.impl.DFDPackageImpl#getFlujo()
	 * @generated
	 */
	int FLUJO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Anterior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__ANTERIOR = 1;

	/**
	 * The feature id for the '<em><b>Siguiente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__SIGUIENTE = 2;

	/**
	 * The number of structural features of the '<em>Flujo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Flujo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dFD.impl.ProcesoImpl <em>Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dFD.impl.ProcesoImpl
	 * @see dFD.impl.DFDPackageImpl#getProceso()
	 * @generated
	 */
	int PROCESO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__NOMBRE = ELEMENTO__NOMBRE;

	/**
	 * The number of structural features of the '<em>Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dFD.impl.EntidadExternaImpl <em>Entidad Externa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dFD.impl.EntidadExternaImpl
	 * @see dFD.impl.DFDPackageImpl#getEntidadExterna()
	 * @generated
	 */
	int ENTIDAD_EXTERNA = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_EXTERNA__NOMBRE = ELEMENTO__NOMBRE;

	/**
	 * The number of structural features of the '<em>Entidad Externa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_EXTERNA_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entidad Externa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_EXTERNA_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dFD.impl.DFDImpl <em>DFD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dFD.impl.DFDImpl
	 * @see dFD.impl.DFDPackageImpl#getDFD()
	 * @generated
	 */
	int DFD = 4;

	/**
	 * The feature id for the '<em><b>Flujo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFD__FLUJO = 0;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFD__ELEMENTO = 1;

	/**
	 * The number of structural features of the '<em>DFD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DFD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFD_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link dFD.Almacen <em>Almacen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Almacen</em>'.
	 * @see dFD.Almacen
	 * @generated
	 */
	EClass getAlmacen();

	/**
	 * Returns the meta object for class '{@link dFD.Flujo <em>Flujo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flujo</em>'.
	 * @see dFD.Flujo
	 * @generated
	 */
	EClass getFlujo();

	/**
	 * Returns the meta object for the attribute '{@link dFD.Flujo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dFD.Flujo#getNombre()
	 * @see #getFlujo()
	 * @generated
	 */
	EAttribute getFlujo_Nombre();

	/**
	 * Returns the meta object for the reference '{@link dFD.Flujo#getAnterior <em>Anterior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anterior</em>'.
	 * @see dFD.Flujo#getAnterior()
	 * @see #getFlujo()
	 * @generated
	 */
	EReference getFlujo_Anterior();

	/**
	 * Returns the meta object for the reference '{@link dFD.Flujo#getSiguiente <em>Siguiente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Siguiente</em>'.
	 * @see dFD.Flujo#getSiguiente()
	 * @see #getFlujo()
	 * @generated
	 */
	EReference getFlujo_Siguiente();

	/**
	 * Returns the meta object for class '{@link dFD.Proceso <em>Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceso</em>'.
	 * @see dFD.Proceso
	 * @generated
	 */
	EClass getProceso();

	/**
	 * Returns the meta object for class '{@link dFD.EntidadExterna <em>Entidad Externa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Externa</em>'.
	 * @see dFD.EntidadExterna
	 * @generated
	 */
	EClass getEntidadExterna();

	/**
	 * Returns the meta object for class '{@link dFD.DFD <em>DFD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFD</em>'.
	 * @see dFD.DFD
	 * @generated
	 */
	EClass getDFD();

	/**
	 * Returns the meta object for the containment reference list '{@link dFD.DFD#getFlujo <em>Flujo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flujo</em>'.
	 * @see dFD.DFD#getFlujo()
	 * @see #getDFD()
	 * @generated
	 */
	EReference getDFD_Flujo();

	/**
	 * Returns the meta object for the containment reference list '{@link dFD.DFD#getElemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elemento</em>'.
	 * @see dFD.DFD#getElemento()
	 * @see #getDFD()
	 * @generated
	 */
	EReference getDFD_Elemento();

	/**
	 * Returns the meta object for class '{@link dFD.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see dFD.Elemento
	 * @generated
	 */
	EClass getElemento();

	/**
	 * Returns the meta object for the attribute '{@link dFD.Elemento#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dFD.Elemento#getNombre()
	 * @see #getElemento()
	 * @generated
	 */
	EAttribute getElemento_Nombre();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dFD.impl.AlmacenImpl <em>Almacen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dFD.impl.AlmacenImpl
		 * @see dFD.impl.DFDPackageImpl#getAlmacen()
		 * @generated
		 */
		EClass ALMACEN = eINSTANCE.getAlmacen();

		/**
		 * The meta object literal for the '{@link dFD.impl.FlujoImpl <em>Flujo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dFD.impl.FlujoImpl
		 * @see dFD.impl.DFDPackageImpl#getFlujo()
		 * @generated
		 */
		EClass FLUJO = eINSTANCE.getFlujo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUJO__NOMBRE = eINSTANCE.getFlujo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Anterior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLUJO__ANTERIOR = eINSTANCE.getFlujo_Anterior();

		/**
		 * The meta object literal for the '<em><b>Siguiente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLUJO__SIGUIENTE = eINSTANCE.getFlujo_Siguiente();

		/**
		 * The meta object literal for the '{@link dFD.impl.ProcesoImpl <em>Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dFD.impl.ProcesoImpl
		 * @see dFD.impl.DFDPackageImpl#getProceso()
		 * @generated
		 */
		EClass PROCESO = eINSTANCE.getProceso();

		/**
		 * The meta object literal for the '{@link dFD.impl.EntidadExternaImpl <em>Entidad Externa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dFD.impl.EntidadExternaImpl
		 * @see dFD.impl.DFDPackageImpl#getEntidadExterna()
		 * @generated
		 */
		EClass ENTIDAD_EXTERNA = eINSTANCE.getEntidadExterna();

		/**
		 * The meta object literal for the '{@link dFD.impl.DFDImpl <em>DFD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dFD.impl.DFDImpl
		 * @see dFD.impl.DFDPackageImpl#getDFD()
		 * @generated
		 */
		EClass DFD = eINSTANCE.getDFD();

		/**
		 * The meta object literal for the '<em><b>Flujo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFD__FLUJO = eINSTANCE.getDFD_Flujo();

		/**
		 * The meta object literal for the '<em><b>Elemento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFD__ELEMENTO = eINSTANCE.getDFD_Elemento();

		/**
		 * The meta object literal for the '{@link dFD.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dFD.impl.ElementoImpl
		 * @see dFD.impl.DFDPackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO__NOMBRE = eINSTANCE.getElemento_Nombre();

	}

} //DFDPackage
