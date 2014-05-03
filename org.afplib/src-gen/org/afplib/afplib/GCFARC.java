/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCFARC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Full Arc (Current Position)</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GCFARC#getMH <em>MH</em>}</li>
 *   <li>{@link org.afplib.afplib.GCFARC#getMFR <em>MFR</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGCFARC()
 * @model
 * @generated
 */
public interface GCFARC extends Triplet {
	/**
	 * Returns the value of the '<em><b>MH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MH</em>' attribute.
	 * @see #setMH(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGCFARC_MH()
	 * @model required="true"
	 * @generated
	 */
	Integer getMH();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GCFARC#getMH <em>MH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MH</em>' attribute.
	 * @see #getMH()
	 * @generated
	 */
	void setMH(Integer value);

	/**
	 * Returns the value of the '<em><b>MFR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MFR</em>' attribute.
	 * @see #setMFR(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGCFARC_MFR()
	 * @model required="true"
	 * @generated
	 */
	Integer getMFR();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GCFARC#getMFR <em>MFR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFR</em>' attribute.
	 * @see #getMFR()
	 * @generated
	 */
	void setMFR(Integer value);

} // GCFARC
