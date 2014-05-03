/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCOMT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Comment</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GCOMT#getDATA <em>DATA</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGCOMT()
 * @model
 * @generated
 */
public interface GCOMT extends Triplet {
	/**
	 * Returns the value of the '<em><b>DATA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DATA</em>' attribute.
	 * @see #setDATA(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getGCOMT_DATA()
	 * @model
	 * @generated
	 */
	byte[] getDATA();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GCOMT#getDATA <em>DATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA</em>' attribute.
	 * @see #getDATA()
	 * @generated
	 */
	void setDATA(byte[] value);

} // GCOMT
