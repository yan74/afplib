/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoding Scheme ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.EncodingSchemeID#getESidCP <em>ESid CP</em>}</li>
 *   <li>{@link org.afplib.afplib.EncodingSchemeID#getESidUD <em>ESid UD</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getEncodingSchemeID()
 * @model
 * @generated
 */
public interface EncodingSchemeID extends Triplet {
	/**
	 * Returns the value of the '<em><b>ESid CP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESid CP</em>' attribute.
	 * @see #setESidCP(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getEncodingSchemeID_ESidCP()
	 * @model required="true"
	 * @generated
	 */
	Integer getESidCP();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EncodingSchemeID#getESidCP <em>ESid CP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESid CP</em>' attribute.
	 * @see #getESidCP()
	 * @generated
	 */
	void setESidCP(Integer value);

	/**
	 * Returns the value of the '<em><b>ESid UD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESid UD</em>' attribute.
	 * @see #setESidUD(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getEncodingSchemeID_ESidUD()
	 * @model
	 * @generated
	 */
	Integer getESidUD();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EncodingSchemeID#getESidUD <em>ESid UD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESid UD</em>' attribute.
	 * @see #getESidUD()
	 * @generated
	 */
	void setESidUD(Integer value);

} // EncodingSchemeID
