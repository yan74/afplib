/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSLT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GSLT#getLINETYPE <em>LINETYPE</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSLT()
 * @model
 * @generated
 */
public interface GSLT extends Triplet {
	/**
     * Returns the value of the '<em><b>LINETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>LINETYPE</em>' attribute.
     * @see #setLINETYPE(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSLT_LINETYPE()
     * @model required="true"
     * @generated
     */
	Integer getLINETYPE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSLT#getLINETYPE <em>LINETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>LINETYPE</em>' attribute.
     * @see #getLINETYPE()
     * @generated
     */
	void setLINETYPE(Integer value);

} // GSLT
