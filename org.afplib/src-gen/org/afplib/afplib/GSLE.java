/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSLE#getLINEEND <em>LINEEND</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSLE()
 * @model
 * @generated
 */
public interface GSLE extends Triplet {
	/**
	 * Returns the value of the '<em><b>LINEEND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LINEEND</em>' attribute.
	 * @see #setLINEEND(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSLE_LINEEND()
	 * @model required="true"
	 * @generated
	 */
	Integer getLINEEND();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSLE#getLINEEND <em>LINEEND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LINEEND</em>' attribute.
	 * @see #getLINEEND()
	 * @generated
	 */
	void setLINEEND(Integer value);

} // GSLE
