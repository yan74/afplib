/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ExtensionFont#getGCSGID <em>GCSGID</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getExtensionFont()
 * @model
 * @generated
 */
public interface ExtensionFont extends Triplet {
	/**
     * Returns the value of the '<em><b>GCSGID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>GCSGID</em>' attribute.
     * @see #setGCSGID(Integer)
     * @see org.afplib.afplib.AfplibPackage#getExtensionFont_GCSGID()
     * @model required="true"
     * @generated
     */
	Integer getGCSGID();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ExtensionFont#getGCSGID <em>GCSGID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>GCSGID</em>' attribute.
     * @see #getGCSGID()
     * @generated
     */
	void setGCSGID(Integer value);

} // ExtensionFont
