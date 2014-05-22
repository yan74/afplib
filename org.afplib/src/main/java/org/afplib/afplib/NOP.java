/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NOP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.NOP#getUndfData <em>Undf Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getNOP()
 * @model
 * @generated
 */
public interface NOP extends SF {
	/**
	 * Returns the value of the '<em><b>Undf Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undf Data</em>' attribute.
	 * @see #setUndfData(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getNOP_UndfData()
	 * @model
	 * @generated
	 */
	byte[] getUndfData();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.NOP#getUndfData <em>Undf Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undf Data</em>' attribute.
	 * @see #getUndfData()
	 * @generated
	 */
	void setUndfData(byte[] value);

} // NOP
