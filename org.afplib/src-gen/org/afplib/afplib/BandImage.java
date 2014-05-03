/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Band Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BandImage#getBCOUNT <em>BCOUNT</em>}</li>
 *   <li>{@link org.afplib.afplib.BandImage#getRg <em>Rg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBandImage()
 * @model
 * @generated
 */
public interface BandImage extends Triplet {
	/**
	 * Returns the value of the '<em><b>BCOUNT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BCOUNT</em>' attribute.
	 * @see #setBCOUNT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBandImage_BCOUNT()
	 * @model required="true"
	 * @generated
	 */
	Integer getBCOUNT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BandImage#getBCOUNT <em>BCOUNT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BCOUNT</em>' attribute.
	 * @see #getBCOUNT()
	 * @generated
	 */
	void setBCOUNT(Integer value);

	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.BandImageRG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBandImage_Rg()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<BandImageRG> getRg();

} // BandImage
