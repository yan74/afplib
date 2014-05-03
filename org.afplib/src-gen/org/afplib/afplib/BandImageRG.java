/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Band Image RG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BandImageRG#getBITCNT <em>BITCNT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBandImageRG()
 * @model
 * @generated
 */
public interface BandImageRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>BITCNT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BITCNT</em>' attribute.
	 * @see #setBITCNT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBandImageRG_BITCNT()
	 * @model required="true"
	 * @generated
	 */
	Integer getBITCNT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BandImageRG#getBITCNT <em>BITCNT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BITCNT</em>' attribute.
	 * @see #getBITCNT()
	 * @generated
	 */
	void setBITCNT(Integer value);

} // BandImageRG
