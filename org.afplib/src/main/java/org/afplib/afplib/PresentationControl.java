/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.PresentationControl#getPRSFlg <em>PRS Flg</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getPresentationControl()
 * @model
 * @generated
 */
public interface PresentationControl extends Triplet {
	/**
     * Returns the value of the '<em><b>PRS Flg</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>PRS Flg</em>' attribute.
     * @see #setPRSFlg(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPresentationControl_PRSFlg()
     * @model required="true"
     * @generated
     */
	Integer getPRSFlg();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PresentationControl#getPRSFlg <em>PRS Flg</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>PRS Flg</em>' attribute.
     * @see #getPRSFlg()
     * @generated
     */
	void setPRSFlg(Integer value);

} // PresentationControl
