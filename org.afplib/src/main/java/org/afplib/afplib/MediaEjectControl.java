/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Eject Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MediaEjectControl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.MediaEjectControl#getEjCtrl <em>Ej Ctrl</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMediaEjectControl()
 * @model
 * @generated
 */
public interface MediaEjectControl extends Triplet {
	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMediaEjectControl_Reserved()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MediaEjectControl#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Integer value);

	/**
	 * Returns the value of the '<em><b>Ej Ctrl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ej Ctrl</em>' attribute.
	 * @see #setEjCtrl(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMediaEjectControl_EjCtrl()
	 * @model required="true"
	 * @generated
	 */
	Integer getEjCtrl();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MediaEjectControl#getEjCtrl <em>Ej Ctrl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ej Ctrl</em>' attribute.
	 * @see #getEjCtrl()
	 * @generated
	 */
	void setEjCtrl(Integer value);

} // MediaEjectControl
