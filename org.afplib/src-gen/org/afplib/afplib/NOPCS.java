/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NOPCS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>No Operation</b><br>The No Operation control sequence has no effect on presentation.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.NOPCS#getIGNDATA <em>IGNDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getNOPCS()
 * @model
 * @generated
 */
public interface NOPCS extends Triplet {
	/**
	 * Returns the value of the '<em><b>IGNDATA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IGNDATA</em>' attribute.
	 * @see #setIGNDATA(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getNOPCS_IGNDATA()
	 * @model
	 * @generated
	 */
	byte[] getIGNDATA();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.NOPCS#getIGNDATA <em>IGNDATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IGNDATA</em>' attribute.
	 * @see #getIGNDATA()
	 * @generated
	 */
	void setIGNDATA(byte[] value);

} // NOPCS
