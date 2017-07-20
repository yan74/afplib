/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ImageSize#getUNITBASE <em>UNITBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.ImageSize#getHRESOL <em>HRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.ImageSize#getVRESOL <em>VRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.ImageSize#getHSIZE <em>HSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.ImageSize#getVSIZE <em>VSIZE</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getImageSize()
 * @model
 * @generated
 */
public interface ImageSize extends Triplet {
	/**
     * Returns the value of the '<em><b>UNITBASE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>UNITBASE</em>' attribute.
     * @see #setUNITBASE(Integer)
     * @see org.afplib.afplib.AfplibPackage#getImageSize_UNITBASE()
     * @model required="true"
     * @generated
     */
	Integer getUNITBASE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ImageSize#getUNITBASE <em>UNITBASE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>UNITBASE</em>' attribute.
     * @see #getUNITBASE()
     * @generated
     */
	void setUNITBASE(Integer value);

	/**
     * Returns the value of the '<em><b>HRESOL</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>HRESOL</em>' attribute.
     * @see #setHRESOL(Integer)
     * @see org.afplib.afplib.AfplibPackage#getImageSize_HRESOL()
     * @model required="true"
     * @generated
     */
	Integer getHRESOL();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ImageSize#getHRESOL <em>HRESOL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>HRESOL</em>' attribute.
     * @see #getHRESOL()
     * @generated
     */
	void setHRESOL(Integer value);

	/**
     * Returns the value of the '<em><b>VRESOL</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>VRESOL</em>' attribute.
     * @see #setVRESOL(Integer)
     * @see org.afplib.afplib.AfplibPackage#getImageSize_VRESOL()
     * @model required="true"
     * @generated
     */
	Integer getVRESOL();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ImageSize#getVRESOL <em>VRESOL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>VRESOL</em>' attribute.
     * @see #getVRESOL()
     * @generated
     */
	void setVRESOL(Integer value);

	/**
     * Returns the value of the '<em><b>HSIZE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>HSIZE</em>' attribute.
     * @see #setHSIZE(Integer)
     * @see org.afplib.afplib.AfplibPackage#getImageSize_HSIZE()
     * @model required="true"
     * @generated
     */
	Integer getHSIZE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ImageSize#getHSIZE <em>HSIZE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>HSIZE</em>' attribute.
     * @see #getHSIZE()
     * @generated
     */
	void setHSIZE(Integer value);

	/**
     * Returns the value of the '<em><b>VSIZE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>VSIZE</em>' attribute.
     * @see #setVSIZE(Integer)
     * @see org.afplib.afplib.AfplibPackage#getImageSize_VSIZE()
     * @model required="true"
     * @generated
     */
	Integer getVSIZE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ImageSize#getVSIZE <em>VSIZE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>VSIZE</em>' attribute.
     * @see #getVSIZE()
     * @generated
     */
	void setVSIZE(Integer value);

} // ImageSize
