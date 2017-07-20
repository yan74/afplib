/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Space Reset Mixing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.PresentationSpaceResetMixing#getBgMxFlag <em>Bg Mx Flag</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getPresentationSpaceResetMixing()
 * @model
 * @generated
 */
public interface PresentationSpaceResetMixing extends Triplet {
	/**
     * Returns the value of the '<em><b>Bg Mx Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bg Mx Flag</em>' attribute.
     * @see #setBgMxFlag(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPresentationSpaceResetMixing_BgMxFlag()
     * @model required="true"
     * @generated
     */
	Integer getBgMxFlag();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PresentationSpaceResetMixing#getBgMxFlag <em>Bg Mx Flag</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bg Mx Flag</em>' attribute.
     * @see #getBgMxFlag()
     * @generated
     */
	void setBgMxFlag(Integer value);

} // PresentationSpaceResetMixing
