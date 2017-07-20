/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GAD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GAD#getGOCAdat <em>GOC Adat</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGAD()
 * @model
 * @generated
 */
public interface GAD extends SF {
	/**
     * Returns the value of the '<em><b>GOC Adat</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>GOC Adat</em>' attribute.
     * @see #setGOCAdat(byte[])
     * @see org.afplib.afplib.AfplibPackage#getGAD_GOCAdat()
     * @model
     * @generated
     */
	byte[] getGOCAdat();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GAD#getGOCAdat <em>GOC Adat</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>GOC Adat</em>' attribute.
     * @see #getGOCAdat()
     * @generated
     */
	void setGOCAdat(byte[] value);

} // GAD
