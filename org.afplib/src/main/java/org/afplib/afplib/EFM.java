/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.EFM#getFMName <em>FM Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getEFM()
 * @model
 * @generated
 */
public interface EFM extends SF {
	/**
	 * Returns the value of the '<em><b>FM Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FM Name</em>' attribute.
	 * @see #setFMName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEFM_FMName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getFMName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EFM#getFMName <em>FM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FM Name</em>' attribute.
	 * @see #getFMName()
	 * @generated
	 */
	void setFMName(String value);

} // EFM
