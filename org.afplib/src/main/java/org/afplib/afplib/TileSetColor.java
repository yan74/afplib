/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Set Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.TileSetColor#getCSPACE <em>CSPACE</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSetColor#getRESERVED <em>RESERVED</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSetColor#getSIZE1 <em>SIZE1</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSetColor#getSIZE2 <em>SIZE2</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSetColor#getSIZE3 <em>SIZE3</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSetColor#getSIZE4 <em>SIZE4</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSetColor#getCVAL1 <em>CVAL1</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSetColor#getCVAL2 <em>CVAL2</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSetColor#getCVAL3 <em>CVAL3</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSetColor#getCVAL4 <em>CVAL4</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getTileSetColor()
 * @model
 * @generated
 */
public interface TileSetColor extends Triplet {
	/**
     * Returns the value of the '<em><b>CSPACE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CSPACE</em>' attribute.
     * @see #setCSPACE(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_CSPACE()
     * @model required="true"
     * @generated
     */
	Integer getCSPACE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getCSPACE <em>CSPACE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CSPACE</em>' attribute.
     * @see #getCSPACE()
     * @generated
     */
	void setCSPACE(Integer value);

	/**
     * Returns the value of the '<em><b>RESERVED</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RESERVED</em>' attribute.
     * @see #setRESERVED(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_RESERVED()
     * @model required="true"
     * @generated
     */
	Integer getRESERVED();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getRESERVED <em>RESERVED</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RESERVED</em>' attribute.
     * @see #getRESERVED()
     * @generated
     */
	void setRESERVED(Integer value);

	/**
     * Returns the value of the '<em><b>SIZE1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SIZE1</em>' attribute.
     * @see #setSIZE1(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_SIZE1()
     * @model required="true"
     * @generated
     */
	Integer getSIZE1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getSIZE1 <em>SIZE1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIZE1</em>' attribute.
     * @see #getSIZE1()
     * @generated
     */
	void setSIZE1(Integer value);

	/**
     * Returns the value of the '<em><b>SIZE2</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SIZE2</em>' attribute.
     * @see #setSIZE2(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_SIZE2()
     * @model required="true"
     * @generated
     */
	Integer getSIZE2();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getSIZE2 <em>SIZE2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIZE2</em>' attribute.
     * @see #getSIZE2()
     * @generated
     */
	void setSIZE2(Integer value);

	/**
     * Returns the value of the '<em><b>SIZE3</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SIZE3</em>' attribute.
     * @see #setSIZE3(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_SIZE3()
     * @model required="true"
     * @generated
     */
	Integer getSIZE3();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getSIZE3 <em>SIZE3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIZE3</em>' attribute.
     * @see #getSIZE3()
     * @generated
     */
	void setSIZE3(Integer value);

	/**
     * Returns the value of the '<em><b>SIZE4</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SIZE4</em>' attribute.
     * @see #setSIZE4(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_SIZE4()
     * @model required="true"
     * @generated
     */
	Integer getSIZE4();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getSIZE4 <em>SIZE4</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIZE4</em>' attribute.
     * @see #getSIZE4()
     * @generated
     */
	void setSIZE4(Integer value);

	/**
     * Returns the value of the '<em><b>CVAL1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CVAL1</em>' attribute.
     * @see #setCVAL1(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_CVAL1()
     * @model required="true"
     * @generated
     */
	Integer getCVAL1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getCVAL1 <em>CVAL1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CVAL1</em>' attribute.
     * @see #getCVAL1()
     * @generated
     */
	void setCVAL1(Integer value);

	/**
     * Returns the value of the '<em><b>CVAL2</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CVAL2</em>' attribute.
     * @see #setCVAL2(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_CVAL2()
     * @model required="true"
     * @generated
     */
	Integer getCVAL2();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getCVAL2 <em>CVAL2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CVAL2</em>' attribute.
     * @see #getCVAL2()
     * @generated
     */
	void setCVAL2(Integer value);

	/**
     * Returns the value of the '<em><b>CVAL3</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CVAL3</em>' attribute.
     * @see #setCVAL3(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_CVAL3()
     * @model required="true"
     * @generated
     */
	Integer getCVAL3();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getCVAL3 <em>CVAL3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CVAL3</em>' attribute.
     * @see #getCVAL3()
     * @generated
     */
	void setCVAL3(Integer value);

	/**
     * Returns the value of the '<em><b>CVAL4</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CVAL4</em>' attribute.
     * @see #setCVAL4(Integer)
     * @see org.afplib.afplib.AfplibPackage#getTileSetColor_CVAL4()
     * @model required="true"
     * @generated
     */
	Integer getCVAL4();

	/**
     * Sets the value of the '{@link org.afplib.afplib.TileSetColor#getCVAL4 <em>CVAL4</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CVAL4</em>' attribute.
     * @see #getCVAL4()
     * @generated
     */
	void setCVAL4(Integer value);

} // TileSetColor
