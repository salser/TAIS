/**
 * generated by Xtext 2.23.0
 */
package co.edu.javeriana.dfd.dFD.impl;

import co.edu.javeriana.dfd.dFD.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DFDFactoryImpl extends EFactoryImpl implements DFDFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DFDFactory init()
  {
    try
    {
      DFDFactory theDFDFactory = (DFDFactory)EPackage.Registry.INSTANCE.getEFactory(DFDPackage.eNS_URI);
      if (theDFDFactory != null)
      {
        return theDFDFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DFDFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DFDFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DFDPackage.DFD: return createDFD();
      case DFDPackage.ELEMENTO: return createElemento();
      case DFDPackage.FLUJO: return createFlujo();
      case DFDPackage.ESTRING: return createEString();
      case DFDPackage.PROCESO: return createProceso();
      case DFDPackage.ENTIDAD_EXTERNA: return createEntidadExterna();
      case DFDPackage.ALMACEN: return createAlmacen();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DFD createDFD()
  {
    DFDImpl dfd = new DFDImpl();
    return dfd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Elemento createElemento()
  {
    ElementoImpl elemento = new ElementoImpl();
    return elemento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Flujo createFlujo()
  {
    FlujoImpl flujo = new FlujoImpl();
    return flujo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EString createEString()
  {
    EStringImpl eString = new EStringImpl();
    return eString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Proceso createProceso()
  {
    ProcesoImpl proceso = new ProcesoImpl();
    return proceso;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntidadExterna createEntidadExterna()
  {
    EntidadExternaImpl entidadExterna = new EntidadExternaImpl();
    return entidadExterna;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Almacen createAlmacen()
  {
    AlmacenImpl almacen = new AlmacenImpl();
    return almacen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DFDPackage getDFDPackage()
  {
    return (DFDPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DFDPackage getPackage()
  {
    return DFDPackage.eINSTANCE;
  }

} //DFDFactoryImpl
