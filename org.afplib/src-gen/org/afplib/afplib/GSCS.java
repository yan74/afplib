/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSCS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSCS#getLCID <em>LCID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSCS()
 * @model
 * @generated
 */
public interface GSCS extends Triplet {
	/**
	 * Returns the value of the '<em><b>LCID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LCID</em>' attribute.
	 * @see #setLCID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSCS_LCID()
	 * @model required="true"
	 * @generated
	 */
	Integer getLCID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSCS#getLCID <em>LCID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LCID</em>' attribute.
	 * @see #getLCID()
	 * @generated
	 */
	void setLCID(Integer value);

} // GSCS
