/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universal Date And Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getYearAD <em>Year AD</em>}</li>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getMonth <em>Month</em>}</li>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getDay <em>Day</em>}</li>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getHour <em>Hour</em>}</li>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getSecond <em>Second</em>}</li>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getUTCDiffH <em>UTC Diff H</em>}</li>
 *   <li>{@link org.afplib.afplib.UniversalDateAndTimeStamp#getUTCDiffM <em>UTC Diff M</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp()
 * @model
 * @generated
 */
public interface UniversalDateAndTimeStamp extends Triplet {
	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_Reserved()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Integer value);

	/**
	 * Returns the value of the '<em><b>Year AD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Year AD</em>' attribute.
	 * @see #setYearAD(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_YearAD()
	 * @model required="true"
	 * @generated
	 */
	Integer getYearAD();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getYearAD <em>Year AD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year AD</em>' attribute.
	 * @see #getYearAD()
	 * @generated
	 */
	void setYearAD(Integer value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_Month()
	 * @model required="true"
	 * @generated
	 */
	Integer getMonth();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(Integer value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_Day()
	 * @model required="true"
	 * @generated
	 */
	Integer getDay();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getDay <em>Day</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_Hour()
	 * @model required="true"
	 * @generated
	 */
	Integer getHour();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getHour <em>Hour</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_Minute()
	 * @model required="true"
	 * @generated
	 */
	Integer getMinute();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getMinute <em>Minute</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_Second()
	 * @model required="true"
	 * @generated
	 */
	Integer getSecond();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Zone</em>' attribute.
	 * @see #setTimeZone(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_TimeZone()
	 * @model required="true"
	 * @generated
	 */
	Integer getTimeZone();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getTimeZone <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone</em>' attribute.
	 * @see #getTimeZone()
	 * @generated
	 */
	void setTimeZone(Integer value);

	/**
	 * Returns the value of the '<em><b>UTC Diff H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTC Diff H</em>' attribute.
	 * @see #setUTCDiffH(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_UTCDiffH()
	 * @model required="true"
	 * @generated
	 */
	Integer getUTCDiffH();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getUTCDiffH <em>UTC Diff H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UTC Diff H</em>' attribute.
	 * @see #getUTCDiffH()
	 * @generated
	 */
	void setUTCDiffH(Integer value);

	/**
	 * Returns the value of the '<em><b>UTC Diff M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTC Diff M</em>' attribute.
	 * @see #setUTCDiffM(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getUniversalDateAndTimeStamp_UTCDiffM()
	 * @model required="true"
	 * @generated
	 */
	Integer getUTCDiffM();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.UniversalDateAndTimeStamp#getUTCDiffM <em>UTC Diff M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UTC Diff M</em>' attribute.
	 * @see #getUTCDiffM()
	 * @generated
	 */
	void setUTCDiffM(Integer value);

} // UniversalDateAndTimeStamp
