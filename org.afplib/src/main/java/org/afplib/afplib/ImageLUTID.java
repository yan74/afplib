/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image LUTID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ImageLUTID#getLUTID <em>LUTID</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getImageLUTID()
 * @model
 * @generated
 */
public interface ImageLUTID extends Triplet {
	/**
	 * Returns the value of the '<em><b>LUTID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LUTID</em>' attribute.
	 * @see #setLUTID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getImageLUTID_LUTID()
	 * @model required="true"
	 * @generated
	 */
	Integer getLUTID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ImageLUTID#getLUTID <em>LUTID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LUTID</em>' attribute.
	 * @see #getLUTID()
	 * @generated
	 */
	void setLUTID(Integer value);

} // ImageLUTID
