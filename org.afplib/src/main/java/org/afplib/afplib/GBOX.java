/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GBOX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GBOX#getRES <em>RES</em>}</li>
 *   <li>{@link org.afplib.afplib.GBOX#getXPOS0 <em>XPOS0</em>}</li>
 *   <li>{@link org.afplib.afplib.GBOX#getYPOS0 <em>YPOS0</em>}</li>
 *   <li>{@link org.afplib.afplib.GBOX#getXPOS1 <em>XPOS1</em>}</li>
 *   <li>{@link org.afplib.afplib.GBOX#getYPOS1 <em>YPOS1</em>}</li>
 *   <li>{@link org.afplib.afplib.GBOX#getHAXIS <em>HAXIS</em>}</li>
 *   <li>{@link org.afplib.afplib.GBOX#getVAXIS <em>VAXIS</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGBOX()
 * @model
 * @generated
 */
public interface GBOX extends Triplet {
	/**
     * Returns the value of the '<em><b>RES</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RES</em>' attribute.
     * @see #setRES(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGBOX_RES()
     * @model required="true"
     * @generated
     */
	Integer getRES();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GBOX#getRES <em>RES</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RES</em>' attribute.
     * @see #getRES()
     * @generated
     */
	void setRES(Integer value);

	/**
     * Returns the value of the '<em><b>XPOS0</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>XPOS0</em>' attribute.
     * @see #setXPOS0(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGBOX_XPOS0()
     * @model required="true"
     * @generated
     */
	Integer getXPOS0();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GBOX#getXPOS0 <em>XPOS0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>XPOS0</em>' attribute.
     * @see #getXPOS0()
     * @generated
     */
	void setXPOS0(Integer value);

	/**
     * Returns the value of the '<em><b>YPOS0</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>YPOS0</em>' attribute.
     * @see #setYPOS0(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGBOX_YPOS0()
     * @model required="true"
     * @generated
     */
	Integer getYPOS0();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GBOX#getYPOS0 <em>YPOS0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>YPOS0</em>' attribute.
     * @see #getYPOS0()
     * @generated
     */
	void setYPOS0(Integer value);

	/**
     * Returns the value of the '<em><b>XPOS1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>XPOS1</em>' attribute.
     * @see #setXPOS1(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGBOX_XPOS1()
     * @model required="true"
     * @generated
     */
	Integer getXPOS1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GBOX#getXPOS1 <em>XPOS1</em>}' attribute.
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
     * @see org.afplib.afplib.AfplibPackage#getGBOX_YPOS1()
     * @model required="true"
     * @generated
     */
	Integer getYPOS1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GBOX#getYPOS1 <em>YPOS1</em>}' attribute.
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
     * @see org.afplib.afplib.AfplibPackage#getGBOX_HAXIS()
     * @model
     * @generated
     */
	Integer getHAXIS();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GBOX#getHAXIS <em>HAXIS</em>}' attribute.
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
     * @see org.afplib.afplib.AfplibPackage#getGBOX_VAXIS()
     * @model
     * @generated
     */
	Integer getVAXIS();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GBOX#getVAXIS <em>VAXIS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>VAXIS</em>' attribute.
     * @see #getVAXIS()
     * @generated
     */
	void setVAXIS(Integer value);

} // GBOX
