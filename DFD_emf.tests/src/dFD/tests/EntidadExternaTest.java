/**
 */
package dFD.tests;

import dFD.DFDFactory;
import dFD.EntidadExterna;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entidad Externa</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntidadExternaTest extends ElementoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntidadExternaTest.class);
	}

	/**
	 * Constructs a new Entidad Externa test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadExternaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entidad Externa test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntidadExterna getFixture() {
		return (EntidadExterna)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DFDFactory.eINSTANCE.createEntidadExterna());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EntidadExternaTest
