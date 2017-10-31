/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Fidelity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MediaFidelity#getStpMedEx <em>Stp Med Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.MediaFidelity#getReserved <em>Reserved</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMediaFidelity()
 * @model
 * @generated
 */
public interface MediaFidelity extends Triplet {
	/**
	 * Returns the value of the '<em><b>Stp Med Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stp Med Ex</em>' attribute.
	 * @see #setStpMedEx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMediaFidelity_StpMedEx()
	 * @model required="true"
	 * @generated
	 */
	Integer getStpMedEx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MediaFidelity#getStpMedEx <em>Stp Med Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stp Med Ex</em>' attribute.
	 * @see #getStpMedEx()
	 * @generated
	 */
	void setStpMedEx(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getMediaFidelity_Reserved()
	 * @model required="true"
	 * @generated
	 */
	byte[] getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MediaFidelity#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(byte[] value);

} // MediaFidelity
