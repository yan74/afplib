/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Date And Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.LocalDateAndTimeStamp#getStampType <em>Stamp Type</em>}</li>
 *   <li>{@link org.afplib.afplib.LocalDateAndTimeStamp#getTHunYear <em>THun Year</em>}</li>
 *   <li>{@link org.afplib.afplib.LocalDateAndTimeStamp#getTenYear <em>Ten Year</em>}</li>
 *   <li>{@link org.afplib.afplib.LocalDateAndTimeStamp#getDay <em>Day</em>}</li>
 *   <li>{@link org.afplib.afplib.LocalDateAndTimeStamp#getHour <em>Hour</em>}</li>
 *   <li>{@link org.afplib.afplib.LocalDateAndTimeStamp#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.afplib.afplib.LocalDateAndTimeStamp#getSecond <em>Second</em>}</li>
 *   <li>{@link org.afplib.afplib.LocalDateAndTimeStamp#getHundSec <em>Hund Sec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStamp()
 * @model
 * @generated
 */
public interface LocalDateAndTimeStamp extends Triplet {
	/**
	 * Returns the value of the '<em><b>Stamp Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stamp Type</em>' attribute.
	 * @see #setStampType(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStamp_StampType()
	 * @model required="true"
	 * @generated
	 */
	Integer getStampType();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocalDateAndTimeStamp#getStampType <em>Stamp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stamp Type</em>' attribute.
	 * @see #getStampType()
	 * @generated
	 */
	void setStampType(Integer value);

	/**
	 * Returns the value of the '<em><b>THun Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>THun Year</em>' attribute.
	 * @see #setTHunYear(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStamp_THunYear()
	 * @model required="true"
	 * @generated
	 */
	Integer getTHunYear();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocalDateAndTimeStamp#getTHunYear <em>THun Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THun Year</em>' attribute.
	 * @see #getTHunYear()
	 * @generated
	 */
	void setTHunYear(Integer value);

	/**
	 * Returns the value of the '<em><b>Ten Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ten Year</em>' attribute.
	 * @see #setTenYear(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStamp_TenYear()
	 * @model required="true"
	 * @generated
	 */
	Integer getTenYear();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocalDateAndTimeStamp#getTenYear <em>Ten Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ten Year</em>' attribute.
	 * @see #getTenYear()
	 * @generated
	 */
	void setTenYear(Integer value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStamp_Day()
	 * @model required="true"
	 * @generated
	 */
	Integer getDay();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocalDateAndTimeStamp#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(Integer value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStamp_Hour()
	 * @model required="true"
	 * @generated
	 */
	Integer getHour();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocalDateAndTimeStamp#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(Integer value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStamp_Minute()
	 * @model required="true"
	 * @generated
	 */
	Integer getMinute();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocalDateAndTimeStamp#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(Integer value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStamp_Second()
	 * @model required="true"
	 * @generated
	 */
	Integer getSecond();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocalDateAndTimeStamp#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Integer value);

	/**
	 * Returns the value of the '<em><b>Hund Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hund Sec</em>' attribute.
	 * @see #setHundSec(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStamp_HundSec()
	 * @model required="true"
	 * @generated
	 */
	Integer getHundSec();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocalDateAndTimeStamp#getHundSec <em>Hund Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hund Sec</em>' attribute.
	 * @see #getHundSec()
	 * @generated
	 */
	void setHundSec(Integer value);

} // LocalDateAndTimeStamp
