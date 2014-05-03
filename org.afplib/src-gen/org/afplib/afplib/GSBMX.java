/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSBMX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSBMX#getMODE <em>MODE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSBMX()
 * @model
 * @generated
 */
public interface GSBMX extends Triplet {
	/**
	 * Returns the value of the '<em><b>MODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MODE</em>' attribute.
	 * @see #setMODE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSBMX_MODE()
	 * @model required="true"
	 * @generated
	 */
	Integer getMODE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSBMX#getMODE <em>MODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MODE</em>' attribute.
	 * @see #getMODE()
	 * @generated
	 */
	void setMODE(Integer value);

} // GSBMX
