/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCBOX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GCBOX#getRES <em>RES</em>}</li>
 *   <li>{@link org.afplib.afplib.GCBOX#getXPOS1 <em>XPOS1</em>}</li>
 *   <li>{@link org.afplib.afplib.GCBOX#getYPOS1 <em>YPOS1</em>}</li>
 *   <li>{@link org.afplib.afplib.GCBOX#getHAXIS <em>HAXIS</em>}</li>
 *   <li>{@link org.afplib.afplib.GCBOX#getVAXIS <em>VAXIS</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGCBOX()
 * @model
 * @generated
 */
public interface GCBOX extends Triplet {
	/**
     * Returns the value of the '<em><b>RES</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RES</em>' attribute.
     * @see #setRES(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCBOX_RES()
     * @model required="true"
     * @generated
     */
	Integer getRES();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCBOX#getRES <em>RES</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RES</em>' attribute.
     * @see #getRES()
     * @generated
     */
	void setRES(Integer value);

	/**
     * Returns the value of the '<em><b>XPOS1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>XPOS1</em>' attribute.
     * @see #setXPOS1(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCBOX_XPOS1()
     * @model required="true"
     * @generated
     */
	Integer getXPOS1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCBOX#getXPOS1 <em>XPOS1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>XPOS1</em>' attribute.
     * @see #getXPOS1()
     * @generated
     */
	void setXPOS1(Integer value);

	/**
     * Returns the value of the '<em><b>YPOS1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>YPOS1</em>' attribute.
     * @see #setYPOS1(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCBOX_YPOS1()
     * @model required="true"
     * @generated
     */
	Integer getYPOS1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCBOX#getYPOS1 <em>YPOS1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>YPOS1</em>' attribute.
     * @see #getYPOS1()
     * @generated
     */
	void setYPOS1(Integer value);

	/**
     * Returns the value of the '<em><b>HAXIS</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>HAXIS</em>' attribute.
     * @see #setHAXIS(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCBOX_HAXIS()
     * @model
     * @generated
     */
	Integer getHAXIS();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCBOX#getHAXIS <em>HAXIS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>HAXIS</em>' attribute.
     * @see #getHAXIS()
     * @generated
     */
	void setHAXIS(Integer value);

	/**
     * Returns the value of the '<em><b>VAXIS</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>VAXIS</em>' attribute.
     * @see #setVAXIS(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCBOX_VAXIS()
     * @model
     * @generated
     */
	Integer getVAXIS();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCBOX#getVAXIS <em>VAXIS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>VAXIS</em>' attribute.
     * @see #getVAXIS()
     * @generated
     */
	void setVAXIS(Integer value);

} // GCBOX
