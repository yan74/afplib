/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TBM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.TBM#getDIRCTION <em>DIRCTION</em>}</li>
 *   <li>{@link org.afplib.afplib.TBM#getPRECSION <em>PRECSION</em>}</li>
 *   <li>{@link org.afplib.afplib.TBM#getINCRMENT <em>INCRMENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getTBM()
 * @model
 * @generated
 */
public interface TBM extends Triplet {
	/**
	 * Returns the value of the '<em><b>DIRCTION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DIRCTION</em>' attribute.
	 * @see #setDIRCTION(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTBM_DIRCTION()
	 * @model required="true"
	 * @generated
	 */
	Integer getDIRCTION();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TBM#getDIRCTION <em>DIRCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DIRCTION</em>' attribute.
	 * @see #getDIRCTION()
	 * @generated
	 */
	void setDIRCTION(Integer value);

	/**
	 * Returns the value of the '<em><b>PRECSION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PRECSION</em>' attribute.
	 * @see #setPRECSION(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTBM_PRECSION()
	 * @model
	 * @generated
	 */
	Integer getPRECSION();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TBM#getPRECSION <em>PRECSION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRECSION</em>' attribute.
	 * @see #getPRECSION()
	 * @generated
	 */
	void setPRECSION(Integer value);

	/**
	 * Returns the value of the '<em><b>INCRMENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>INCRMENT</em>' attribute.
	 * @see #setINCRMENT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTBM_INCRMENT()
	 * @model
	 * @generated
	 */
	Integer getINCRMENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TBM#getINCRMENT <em>INCRMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INCRMENT</em>' attribute.
	 * @see #getINCRMENT()
	 * @generated
	 */
	void setINCRMENT(Integer value);

} // TBM
