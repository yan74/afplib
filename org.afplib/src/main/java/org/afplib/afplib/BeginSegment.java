/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Begin Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BeginSegment#getSEGNAME <em>SEGNAME</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBeginSegment()
 * @model
 * @generated
 */
public interface BeginSegment extends Triplet {
	/**
     * Returns the value of the '<em><b>SEGNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SEGNAME</em>' attribute.
     * @see #setSEGNAME(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBeginSegment_SEGNAME()
     * @model
     * @generated
     */
	Integer getSEGNAME();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BeginSegment#getSEGNAME <em>SEGNAME</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SEGNAME</em>' attribute.
     * @see #getSEGNAME()
     * @generated
     */
	void setSEGNAME(Integer value);

} // BeginSegment
