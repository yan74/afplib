/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Set Text Color</b><br>The Set Text Color control sequence specifies a color attribute for the foreground areas of the text presentation space.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.STC#getFRGCOLOR <em>FRGCOLOR</em>}</li>
 *   <li>{@link org.afplib.afplib.STC#getPRECSION <em>PRECSION</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getSTC()
 * @model
 * @generated
 */
public interface STC extends Triplet {
	/**
	 * Returns the value of the '<em><b>FRGCOLOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRGCOLOR</em>' attribute.
	 * @see #setFRGCOLOR(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSTC_FRGCOLOR()
	 * @model required="true"
	 * @generated
	 */
	Integer getFRGCOLOR();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.STC#getFRGCOLOR <em>FRGCOLOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRGCOLOR</em>' attribute.
	 * @see #getFRGCOLOR()
	 * @generated
	 */
	void setFRGCOLOR(Integer value);

	/**
	 * Returns the value of the '<em><b>PRECSION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PRECSION</em>' attribute.
	 * @see #setPRECSION(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSTC_PRECSION()
	 * @model
	 * @generated
	 */
	Integer getPRECSION();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.STC#getPRECSION <em>PRECSION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRECSION</em>' attribute.
	 * @see #getPRECSION()
	 * @generated
	 */
	void setPRECSION(Integer value);

} // STC
