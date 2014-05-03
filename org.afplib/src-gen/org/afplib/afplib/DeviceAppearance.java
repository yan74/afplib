/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.DeviceAppearance#getDevApp <em>Dev App</em>}</li>
 *   <li>{@link org.afplib.afplib.DeviceAppearance#getReserved <em>Reserved</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getDeviceAppearance()
 * @model
 * @generated
 */
public interface DeviceAppearance extends Triplet {
	/**
	 * Returns the value of the '<em><b>Dev App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dev App</em>' attribute.
	 * @see #setDevApp(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getDeviceAppearance_DevApp()
	 * @model required="true"
	 * @generated
	 */
	Integer getDevApp();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.DeviceAppearance#getDevApp <em>Dev App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev App</em>' attribute.
	 * @see #getDevApp()
	 * @generated
	 */
	void setDevApp(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getDeviceAppearance_Reserved()
	 * @model required="true"
	 * @generated
	 */
	byte[] getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.DeviceAppearance#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(byte[] value);

} // DeviceAppearance
