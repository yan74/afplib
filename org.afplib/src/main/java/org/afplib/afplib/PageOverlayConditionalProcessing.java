/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Overlay Conditional Processing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.PageOverlayConditionalProcessing#getPgOvType <em>Pg Ov Type</em>}</li>
 *   <li>{@link org.afplib.afplib.PageOverlayConditionalProcessing#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getPageOverlayConditionalProcessing()
 * @model
 * @generated
 */
public interface PageOverlayConditionalProcessing extends Triplet {
	/**
	 * Returns the value of the '<em><b>Pg Ov Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pg Ov Type</em>' attribute.
	 * @see #setPgOvType(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPageOverlayConditionalProcessing_PgOvType()
	 * @model required="true"
	 * @generated
	 */
	Integer getPgOvType();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PageOverlayConditionalProcessing#getPgOvType <em>Pg Ov Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg Ov Type</em>' attribute.
	 * @see #getPgOvType()
	 * @generated
	 */
	void setPgOvType(Integer value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPageOverlayConditionalProcessing_Level()
	 * @model
	 * @generated
	 */
	Integer getLevel();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PageOverlayConditionalProcessing#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Integer value);

} // PageOverlayConditionalProcessing
