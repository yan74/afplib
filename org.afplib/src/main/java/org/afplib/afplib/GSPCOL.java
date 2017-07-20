/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSPCOL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GSPCOL#getRES1 <em>RES1</em>}</li>
 *   <li>{@link org.afplib.afplib.GSPCOL#getCOLSPCE <em>COLSPCE</em>}</li>
 *   <li>{@link org.afplib.afplib.GSPCOL#getRES2 <em>RES2</em>}</li>
 *   <li>{@link org.afplib.afplib.GSPCOL#getCOLSIZE1 <em>COLSIZE1</em>}</li>
 *   <li>{@link org.afplib.afplib.GSPCOL#getCOLSIZE2 <em>COLSIZE2</em>}</li>
 *   <li>{@link org.afplib.afplib.GSPCOL#getCOLSIZE3 <em>COLSIZE3</em>}</li>
 *   <li>{@link org.afplib.afplib.GSPCOL#getCOLSIZE4 <em>COLSIZE4</em>}</li>
 *   <li>{@link org.afplib.afplib.GSPCOL#getCOLVALUE <em>COLVALUE</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSPCOL()
 * @model
 * @generated
 */
public interface GSPCOL extends Triplet {
	/**
     * Returns the value of the '<em><b>RES1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RES1</em>' attribute.
     * @see #setRES1(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSPCOL_RES1()
     * @model required="true"
     * @generated
     */
	Integer getRES1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSPCOL#getRES1 <em>RES1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RES1</em>' attribute.
     * @see #getRES1()
     * @generated
     */
	void setRES1(Integer value);

	/**
     * Returns the value of the '<em><b>COLSPCE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>COLSPCE</em>' attribute.
     * @see #setCOLSPCE(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSPCOL_COLSPCE()
     * @model required="true"
     * @generated
     */
	Integer getCOLSPCE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSPCOL#getCOLSPCE <em>COLSPCE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLSPCE</em>' attribute.
     * @see #getCOLSPCE()
     * @generated
     */
	void setCOLSPCE(Integer value);

	/**
     * Returns the value of the '<em><b>RES2</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RES2</em>' attribute.
     * @see #setRES2(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSPCOL_RES2()
     * @model required="true"
     * @generated
     */
	Integer getRES2();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSPCOL#getRES2 <em>RES2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RES2</em>' attribute.
     * @see #getRES2()
     * @generated
     */
	void setRES2(Integer value);

	/**
     * Returns the value of the '<em><b>COLSIZE1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>COLSIZE1</em>' attribute.
     * @see #setCOLSIZE1(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSPCOL_COLSIZE1()
     * @model required="true"
     * @generated
     */
	Integer getCOLSIZE1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSPCOL#getCOLSIZE1 <em>COLSIZE1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLSIZE1</em>' attribute.
     * @see #getCOLSIZE1()
     * @generated
     */
	void setCOLSIZE1(Integer value);

	/**
     * Returns the value of the '<em><b>COLSIZE2</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>COLSIZE2</em>' attribute.
     * @see #setCOLSIZE2(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSPCOL_COLSIZE2()
     * @model required="true"
     * @generated
     */
	Integer getCOLSIZE2();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSPCOL#getCOLSIZE2 <em>COLSIZE2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLSIZE2</em>' attribute.
     * @see #getCOLSIZE2()
     * @generated
     */
	void setCOLSIZE2(Integer value);

	/**
     * Returns the value of the '<em><b>COLSIZE3</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>COLSIZE3</em>' attribute.
     * @see #setCOLSIZE3(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSPCOL_COLSIZE3()
     * @model required="true"
     * @generated
     */
	Integer getCOLSIZE3();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSPCOL#getCOLSIZE3 <em>COLSIZE3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLSIZE3</em>' attribute.
     * @see #getCOLSIZE3()
     * @generated
     */
	void setCOLSIZE3(Integer value);

	/**
     * Returns the value of the '<em><b>COLSIZE4</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>COLSIZE4</em>' attribute.
     * @see #setCOLSIZE4(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSPCOL_COLSIZE4()
     * @model required="true"
     * @generated
     */
	Integer getCOLSIZE4();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSPCOL#getCOLSIZE4 <em>COLSIZE4</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLSIZE4</em>' attribute.
     * @see #getCOLSIZE4()
     * @generated
     */
	void setCOLSIZE4(Integer value);

	/**
     * Returns the value of the '<em><b>COLVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>COLVALUE</em>' attribute.
     * @see #setCOLVALUE(byte[])
     * @see org.afplib.afplib.AfplibPackage#getGSPCOL_COLVALUE()
     * @model required="true"
     * @generated
     */
	byte[] getCOLVALUE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSPCOL#getCOLVALUE <em>COLVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLVALUE</em>' attribute.
     * @see #getCOLVALUE()
     * @generated
     */
	void setCOLVALUE(byte[] value);

} // GSPCOL
