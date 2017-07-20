/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.EMM#getMMName <em>MM Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getEMM()
 * @model
 * @generated
 */
public interface EMM extends SF {
	/**
     * Returns the value of the '<em><b>MM Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>MM Name</em>' attribute.
     * @see #setMMName(String)
     * @see org.afplib.afplib.AfplibPackage#getEMM_MMName()
     * @model dataType="org.afplib.base.ModcaString8"
     * @generated
     */
	String getMMName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.EMM#getMMName <em>MM Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>MM Name</em>' attribute.
     * @see #getMMName()
     * @generated
     */
	void setMMName(String value);

} // EMM
