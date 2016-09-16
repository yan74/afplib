/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ImageData#getDATA <em>DATA</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getImageData()
 * @model
 * @generated
 */
public interface ImageData extends Triplet {
	/**
	 * Returns the value of the '<em><b>DATA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DATA</em>' attribute.
	 * @see #setDATA(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getImageData_DATA()
	 * @model required="true"
	 * @generated
	 */
	byte[] getDATA();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ImageData#getDATA <em>DATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA</em>' attribute.
	 * @see #getDATA()
	 * @generated
	 */
	void setDATA(byte[] value);

} // ImageData
