/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.FNN#getFNNData <em>FNN Data</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNN()
 * @model
 * @generated
 */
public interface FNN extends SF {
	/**
     * Returns the value of the '<em><b>FNN Data</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FNN Data</em>' attribute.
     * @see #setFNNData(byte[])
     * @see org.afplib.afplib.AfplibPackage#getFNN_FNNData()
     * @model
     * @generated
     */
	byte[] getFNNData();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNN#getFNNData <em>FNN Data</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FNN Data</em>' attribute.
     * @see #getFNNData()
     * @generated
     */
	void setFNNData(byte[] value);

} // FNN
