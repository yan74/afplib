/**
 */
package org.afplib.base;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.afplib.base.BasePackage
 * @generated
 */
public interface BaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaseFactory eINSTANCE = org.afplib.base.impl.BaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AFP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFP</em>'.
	 * @generated
	 */
	AFP createAFP();

	/**
	 * Returns a new object of class '<em>UNKNSF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UNKNSF</em>'.
	 * @generated
	 */
	UNKNSF createUNKNSF();

	/**
	 * Returns a new object of class '<em>SF Grouper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SF Grouper</em>'.
	 * @generated
	 */
	SFGrouper createSFGrouper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasePackage getBasePackage();

} //BaseFactory
