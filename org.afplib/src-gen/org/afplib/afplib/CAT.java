/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Color Attribute Table</b><br>only used in MOD:CA-L.</p><p>ID: 13873271</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.CAT#getCATData <em>CAT Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getCAT()
 * @model
 * @generated
 */
public interface CAT extends SF {
	/**
	 * Returns the value of the '<em><b>CAT Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CAT Data</em>' attribute.
	 * @see #setCATData(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getCAT_CATData()
	 * @model
	 * @generated
	 */
	byte[] getCATData();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CAT#getCATData <em>CAT Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAT Data</em>' attribute.
	 * @see #getCATData()
	 * @generated
	 */
	void setCATData(byte[] value);

} // CAT
