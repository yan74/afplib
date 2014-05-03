/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNNRG2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FNNRG2#getTSIDLen <em>TSID Len</em>}</li>
 *   <li>{@link org.afplib.afplib.FNNRG2#getTSID <em>TSID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNNRG2()
 * @model
 * @generated
 */
public interface FNNRG2 extends Triplet {
	/**
	 * Returns the value of the '<em><b>TSID Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TSID Len</em>' attribute.
	 * @see #setTSIDLen(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNNRG2_TSIDLen()
	 * @model
	 * @generated
	 */
	Integer getTSIDLen();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNNRG2#getTSIDLen <em>TSID Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSID Len</em>' attribute.
	 * @see #getTSIDLen()
	 * @generated
	 */
	void setTSIDLen(Integer value);

	/**
	 * Returns the value of the '<em><b>TSID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TSID</em>' attribute.
	 * @see #setTSID(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getFNNRG2_TSID()
	 * @model
	 * @generated
	 */
	byte[] getTSID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNNRG2#getTSID <em>TSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSID</em>' attribute.
	 * @see #getTSID()
	 * @generated
	 */
	void setTSID(byte[] value);

} // FNNRG2
