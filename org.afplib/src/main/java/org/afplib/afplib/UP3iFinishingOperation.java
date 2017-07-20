/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UP 3i Finishing Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.UP3iFinishingOperation#getSeqnum <em>Seqnum</em>}</li>
 *   <li>{@link org.afplib.afplib.UP3iFinishingOperation#getUP3iDat <em>UP 3i Dat</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getUP3iFinishingOperation()
 * @model
 * @generated
 */
public interface UP3iFinishingOperation extends Triplet {
	/**
     * Returns the value of the '<em><b>Seqnum</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Seqnum</em>' attribute.
     * @see #setSeqnum(Integer)
     * @see org.afplib.afplib.AfplibPackage#getUP3iFinishingOperation_Seqnum()
     * @model required="true"
     * @generated
     */
	Integer getSeqnum();

	/**
     * Sets the value of the '{@link org.afplib.afplib.UP3iFinishingOperation#getSeqnum <em>Seqnum</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Seqnum</em>' attribute.
     * @see #getSeqnum()
     * @generated
     */
	void setSeqnum(Integer value);

	/**
     * Returns the value of the '<em><b>UP 3i Dat</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>UP 3i Dat</em>' attribute.
     * @see #setUP3iDat(byte[])
     * @see org.afplib.afplib.AfplibPackage#getUP3iFinishingOperation_UP3iDat()
     * @model required="true"
     * @generated
     */
	byte[] getUP3iDat();

	/**
     * Sets the value of the '{@link org.afplib.afplib.UP3iFinishingOperation#getUP3iDat <em>UP 3i Dat</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>UP 3i Dat</em>' attribute.
     * @see #getUP3iDat()
     * @generated
     */
	void setUP3iDat(byte[] value);

} // UP3iFinishingOperation
