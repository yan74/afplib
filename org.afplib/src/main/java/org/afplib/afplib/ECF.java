/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ECF#getRSName <em>RS Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getECF()
 * @model
 * @generated
 */
public interface ECF extends SF {
	/**
	 * Returns the value of the '<em><b>RS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RS Name</em>' attribute.
	 * @see #setRSName(String)
	 * @see org.afplib.afplib.AfplibPackage#getECF_RSName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getRSName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ECF#getRSName <em>RS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RS Name</em>' attribute.
	 * @see #getRSName()
	 * @generated
	 */
	void setRSName(String value);

} // ECF
