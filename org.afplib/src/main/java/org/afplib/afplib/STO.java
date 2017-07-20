/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.STO#getIORNTION <em>IORNTION</em>}</li>
 *   <li>{@link org.afplib.afplib.STO#getBORNTION <em>BORNTION</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getSTO()
 * @model
 * @generated
 */
public interface STO extends Triplet {
	/**
     * Returns the value of the '<em><b>IORNTION</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>IORNTION</em>' attribute.
     * @see #setIORNTION(Integer)
     * @see org.afplib.afplib.AfplibPackage#getSTO_IORNTION()
     * @model required="true"
     * @generated
     */
	Integer getIORNTION();

	/**
     * Sets the value of the '{@link org.afplib.afplib.STO#getIORNTION <em>IORNTION</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>IORNTION</em>' attribute.
     * @see #getIORNTION()
     * @generated
     */
	void setIORNTION(Integer value);

	/**
     * Returns the value of the '<em><b>BORNTION</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>BORNTION</em>' attribute.
     * @see #setBORNTION(Integer)
     * @see org.afplib.afplib.AfplibPackage#getSTO_BORNTION()
     * @model required="true"
     * @generated
     */
	Integer getBORNTION();

	/**
     * Sets the value of the '{@link org.afplib.afplib.STO#getBORNTION <em>BORNTION</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>BORNTION</em>' attribute.
     * @see #getBORNTION()
     * @generated
     */
	void setBORNTION(Integer value);

} // STO
