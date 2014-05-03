/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCCHST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Character String (Current Position)</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GCCHST#getCP <em>CP</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGCCHST()
 * @model
 * @generated
 */
public interface GCCHST extends Triplet {
	/**
	 * Returns the value of the '<em><b>CP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CP</em>' attribute.
	 * @see #setCP(String)
	 * @see org.afplib.afplib.AfplibPackage#getGCCHST_CP()
	 * @model dataType="org.afplib.base.ModcaString" required="true"
	 * @generated
	 */
	String getCP();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GCCHST#getCP <em>CP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CP</em>' attribute.
	 * @see #getCP()
	 * @generated
	 */
	void setCP(String value);

} // GCCHST
