/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCBIMG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GCBIMG#getFORMAT <em>FORMAT</em>}</li>
 *   <li>{@link org.afplib.afplib.GCBIMG#getRES <em>RES</em>}</li>
 *   <li>{@link org.afplib.afplib.GCBIMG#getWIDTH <em>WIDTH</em>}</li>
 *   <li>{@link org.afplib.afplib.GCBIMG#getHEIGHT <em>HEIGHT</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGCBIMG()
 * @model
 * @generated
 */
public interface GCBIMG extends Triplet {
	/**
     * Returns the value of the '<em><b>FORMAT</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FORMAT</em>' attribute.
     * @see #setFORMAT(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCBIMG_FORMAT()
     * @model required="true"
     * @generated
     */
	Integer getFORMAT();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCBIMG#getFORMAT <em>FORMAT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FORMAT</em>' attribute.
     * @see #getFORMAT()
     * @generated
     */
	void setFORMAT(Integer value);

	/**
     * Returns the value of the '<em><b>RES</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RES</em>' attribute.
     * @see #setRES(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCBIMG_RES()
     * @model required="true"
     * @generated
     */
	Integer getRES();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCBIMG#getRES <em>RES</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RES</em>' attribute.
     * @see #getRES()
     * @generated
     */
	void setRES(Integer value);

	/**
     * Returns the value of the '<em><b>WIDTH</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>WIDTH</em>' attribute.
     * @see #setWIDTH(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCBIMG_WIDTH()
     * @model required="true"
     * @generated
     */
	Integer getWIDTH();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCBIMG#getWIDTH <em>WIDTH</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>WIDTH</em>' attribute.
     * @see #getWIDTH()
     * @generated
     */
	void setWIDTH(Integer value);

	/**
     * Returns the value of the '<em><b>HEIGHT</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>HEIGHT</em>' attribute.
     * @see #setHEIGHT(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCBIMG_HEIGHT()
     * @model required="true"
     * @generated
     */
	Integer getHEIGHT();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCBIMG#getHEIGHT <em>HEIGHT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>HEIGHT</em>' attribute.
     * @see #getHEIGHT()
     * @generated
     */
	void setHEIGHT(Integer value);

} // GCBIMG
