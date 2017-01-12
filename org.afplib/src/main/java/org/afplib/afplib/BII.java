/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BII</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BII#getImoName <em>Imo Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBII()
 * @model
 * @generated
 */
public interface BII extends SF {
	/**
	 * Returns the value of the '<em><b>Imo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imo Name</em>' attribute.
	 * @see #setImoName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBII_ImoName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getImoName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BII#getImoName <em>Imo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imo Name</em>' attribute.
	 * @see #getImoName()
	 * @generated
	 */
	void setImoName(String value);

} // BII
