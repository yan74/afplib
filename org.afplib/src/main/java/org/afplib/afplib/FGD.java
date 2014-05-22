/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FGD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FGD#getConData <em>Con Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFGD()
 * @model
 * @generated
 */
public interface FGD extends SF {
	/**
	 * Returns the value of the '<em><b>Con Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Data</em>' attribute.
	 * @see #setConData(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getFGD_ConData()
	 * @model required="true"
	 * @generated
	 */
	byte[] getConData();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FGD#getConData <em>Con Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Data</em>' attribute.
	 * @see #getConData()
	 * @generated
	 */
	void setConData(byte[] value);

} // FGD
