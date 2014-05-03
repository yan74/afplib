/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Encoding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ImageEncoding#getCOMPRID <em>COMPRID</em>}</li>
 *   <li>{@link org.afplib.afplib.ImageEncoding#getRECID <em>RECID</em>}</li>
 *   <li>{@link org.afplib.afplib.ImageEncoding#getBITORDR <em>BITORDR</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getImageEncoding()
 * @model
 * @generated
 */
public interface ImageEncoding extends Triplet {
	/**
	 * Returns the value of the '<em><b>COMPRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COMPRID</em>' attribute.
	 * @see #setCOMPRID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getImageEncoding_COMPRID()
	 * @model required="true"
	 * @generated
	 */
	Integer getCOMPRID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ImageEncoding#getCOMPRID <em>COMPRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COMPRID</em>' attribute.
	 * @see #getCOMPRID()
	 * @generated
	 */
	void setCOMPRID(Integer value);

	/**
	 * Returns the value of the '<em><b>RECID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RECID</em>' attribute.
	 * @see #setRECID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getImageEncoding_RECID()
	 * @model required="true"
	 * @generated
	 */
	Integer getRECID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ImageEncoding#getRECID <em>RECID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RECID</em>' attribute.
	 * @see #getRECID()
	 * @generated
	 */
	void setRECID(Integer value);

	/**
	 * Returns the value of the '<em><b>BITORDR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BITORDR</em>' attribute.
	 * @see #setBITORDR(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getImageEncoding_BITORDR()
	 * @model
	 * @generated
	 */
	Integer getBITORDR();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ImageEncoding#getBITORDR <em>BITORDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BITORDR</em>' attribute.
	 * @see #getBITORDR()
	 * @generated
	 */
	void setBITORDR(Integer value);

} // ImageEncoding
