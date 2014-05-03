/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Begin Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BeginImage#getOBJTYPE <em>OBJTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBeginImage()
 * @model
 * @generated
 */
public interface BeginImage extends Triplet {
	/**
	 * Returns the value of the '<em><b>OBJTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OBJTYPE</em>' attribute.
	 * @see #setOBJTYPE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBeginImage_OBJTYPE()
	 * @model required="true"
	 * @generated
	 */
	Integer getOBJTYPE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BeginImage#getOBJTYPE <em>OBJTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OBJTYPE</em>' attribute.
	 * @see #getOBJTYPE()
	 * @generated
	 */
	void setOBJTYPE(Integer value);

} // BeginImage
