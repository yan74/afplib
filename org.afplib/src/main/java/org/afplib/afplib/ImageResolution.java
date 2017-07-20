/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ImageResolution#getXBase <em>XBase</em>}</li>
 *   <li>{@link org.afplib.afplib.ImageResolution#getYBase <em>YBase</em>}</li>
 *   <li>{@link org.afplib.afplib.ImageResolution#getXResol <em>XResol</em>}</li>
 *   <li>{@link org.afplib.afplib.ImageResolution#getYResol <em>YResol</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getImageResolution()
 * @model
 * @generated
 */
public interface ImageResolution extends Triplet {
	/**
     * Returns the value of the '<em><b>XBase</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>XBase</em>' attribute.
     * @see #setXBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getImageResolution_XBase()
     * @model required="true"
     * @generated
     */
	Integer getXBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ImageResolution#getXBase <em>XBase</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>XBase</em>' attribute.
     * @see #getXBase()
     * @generated
     */
	void setXBase(Integer value);

	/**
     * Returns the value of the '<em><b>YBase</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>YBase</em>' attribute.
     * @see #setYBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getImageResolution_YBase()
     * @model required="true"
     * @generated
     */
	Integer getYBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ImageResolution#getYBase <em>YBase</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>YBase</em>' attribute.
     * @see #getYBase()
     * @generated
     */
	void setYBase(Integer value);

	/**
     * Returns the value of the '<em><b>XResol</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>XResol</em>' attribute.
     * @see #setXResol(Integer)
     * @see org.afplib.afplib.AfplibPackage#getImageResolution_XResol()
     * @model required="true"
     * @generated
     */
	Integer getXResol();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ImageResolution#getXResol <em>XResol</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>XResol</em>' attribute.
     * @see #getXResol()
     * @generated
     */
	void setXResol(Integer value);

	/**
     * Returns the value of the '<em><b>YResol</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>YResol</em>' attribute.
     * @see #setYResol(Integer)
     * @see org.afplib.afplib.AfplibPackage#getImageResolution_YResol()
     * @model required="true"
     * @generated
     */
	Integer getYResol();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ImageResolution#getYResol <em>YResol</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>YResol</em>' attribute.
     * @see #getYResol()
     * @generated
     */
	void setYResol(Integer value);

} // ImageResolution
