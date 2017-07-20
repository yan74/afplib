/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSCR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GSCR#getPREC <em>PREC</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSCR()
 * @model
 * @generated
 */
public interface GSCR extends Triplet {
	/**
     * Returns the value of the '<em><b>PREC</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>PREC</em>' attribute.
     * @see #setPREC(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSCR_PREC()
     * @model required="true"
     * @generated
     */
	Integer getPREC();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSCR#getPREC <em>PREC</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>PREC</em>' attribute.
     * @see #getPREC()
     * @generated
     */
	void setPREC(Integer value);

} // GSCR
