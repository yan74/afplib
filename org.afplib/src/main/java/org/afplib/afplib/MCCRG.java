/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCCRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MCCRG#getStartnum <em>Startnum</em>}</li>
 *   <li>{@link org.afplib.afplib.MCCRG#getStopnum <em>Stopnum</em>}</li>
 *   <li>{@link org.afplib.afplib.MCCRG#getMMCid <em>MM Cid</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMCCRG()
 * @model
 * @generated
 */
public interface MCCRG extends Triplet {
	/**
     * Returns the value of the '<em><b>Startnum</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Startnum</em>' attribute.
     * @see #setStartnum(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMCCRG_Startnum()
     * @model required="true"
     * @generated
     */
	Integer getStartnum();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MCCRG#getStartnum <em>Startnum</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startnum</em>' attribute.
     * @see #getStartnum()
     * @generated
     */
	void setStartnum(Integer value);

	/**
     * Returns the value of the '<em><b>Stopnum</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Stopnum</em>' attribute.
     * @see #setStopnum(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMCCRG_Stopnum()
     * @model required="true"
     * @generated
     */
	Integer getStopnum();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MCCRG#getStopnum <em>Stopnum</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stopnum</em>' attribute.
     * @see #getStopnum()
     * @generated
     */
	void setStopnum(Integer value);

	/**
     * Returns the value of the '<em><b>MM Cid</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>MM Cid</em>' attribute.
     * @see #setMMCid(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMCCRG_MMCid()
     * @model required="true"
     * @generated
     */
	Integer getMMCid();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MCCRG#getMMCid <em>MM Cid</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>MM Cid</em>' attribute.
     * @see #getMMCid()
     * @generated
     */
	void setMMCid(Integer value);

} // MCCRG
