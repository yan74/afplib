/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.UniversalDateAndTimeStamp;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universal Date And Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getYearAD <em>Year AD</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getUTCDiffH <em>UTC Diff H</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UniversalDateAndTimeStampImpl#getUTCDiffM <em>UTC Diff M</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniversalDateAndTimeStampImpl extends TripletImpl implements UniversalDateAndTimeStamp {
	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearAD() <em>Year AD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearAD()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YEAR_AD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYearAD() <em>Year AD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearAD()
	 * @generated
	 * @ordered
	 */
	protected Integer yearAD = YEAR_AD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected Integer month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected Integer day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected Integer hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected Integer minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer second = SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TIME_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected Integer timeZone = TIME_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUTCDiffH() <em>UTC Diff H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTCDiffH()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UTC_DIFF_H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUTCDiffH() <em>UTC Diff H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTCDiffH()
	 * @generated
	 * @ordered
	 */
	protected Integer utcDiffH = UTC_DIFF_H_EDEFAULT;

	/**
	 * The default value of the '{@link #getUTCDiffM() <em>UTC Diff M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTCDiffM()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UTC_DIFF_M_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUTCDiffM() <em>UTC Diff M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTCDiffM()
	 * @generated
	 * @ordered
	 */
	protected Integer utcDiffM = UTC_DIFF_M_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversalDateAndTimeStampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getUniversalDateAndTimeStamp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Integer newReserved) {
		Integer oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYearAD() {
		return yearAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearAD(Integer newYearAD) {
		Integer oldYearAD = yearAD;
		yearAD = newYearAD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__YEAR_AD, oldYearAD, yearAD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(Integer newMonth) {
		Integer oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(Integer newDay) {
		Integer oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(Integer newHour) {
		Integer oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(Integer newMinute) {
		Integer oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(Integer newSecond) {
		Integer oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTimeZone() {
		return timeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeZone(Integer newTimeZone) {
		Integer oldTimeZone = timeZone;
		timeZone = newTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__TIME_ZONE, oldTimeZone, timeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUTCDiffH() {
		return utcDiffH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUTCDiffH(Integer newUTCDiffH) {
		Integer oldUTCDiffH = utcDiffH;
		utcDiffH = newUTCDiffH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_H, oldUTCDiffH, utcDiffH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUTCDiffM() {
		return utcDiffM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUTCDiffM(Integer newUTCDiffM) {
		Integer oldUTCDiffM = utcDiffM;
		utcDiffM = newUTCDiffM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_M, oldUTCDiffM, utcDiffM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__RESERVED:
				return getReserved();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__YEAR_AD:
				return getYearAD();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MONTH:
				return getMonth();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__DAY:
				return getDay();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__HOUR:
				return getHour();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MINUTE:
				return getMinute();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__SECOND:
				return getSecond();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__TIME_ZONE:
				return getTimeZone();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_H:
				return getUTCDiffH();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_M:
				return getUTCDiffM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__RESERVED:
				setReserved((Integer)newValue);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__YEAR_AD:
				setYearAD((Integer)newValue);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MONTH:
				setMonth((Integer)newValue);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__DAY:
				setDay((Integer)newValue);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__HOUR:
				setHour((Integer)newValue);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MINUTE:
				setMinute((Integer)newValue);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__SECOND:
				setSecond((Integer)newValue);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__TIME_ZONE:
				setTimeZone((Integer)newValue);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_H:
				setUTCDiffH((Integer)newValue);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_M:
				setUTCDiffM((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__YEAR_AD:
				setYearAD(YEAR_AD_EDEFAULT);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__SECOND:
				setSecond(SECOND_EDEFAULT);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__TIME_ZONE:
				setTimeZone(TIME_ZONE_EDEFAULT);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_H:
				setUTCDiffH(UTC_DIFF_H_EDEFAULT);
				return;
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_M:
				setUTCDiffM(UTC_DIFF_M_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__YEAR_AD:
				return YEAR_AD_EDEFAULT == null ? yearAD != null : !YEAR_AD_EDEFAULT.equals(yearAD);
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__HOUR:
				return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__MINUTE:
				return MINUTE_EDEFAULT == null ? minute != null : !MINUTE_EDEFAULT.equals(minute);
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__SECOND:
				return SECOND_EDEFAULT == null ? second != null : !SECOND_EDEFAULT.equals(second);
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__TIME_ZONE:
				return TIME_ZONE_EDEFAULT == null ? timeZone != null : !TIME_ZONE_EDEFAULT.equals(timeZone);
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_H:
				return UTC_DIFF_H_EDEFAULT == null ? utcDiffH != null : !UTC_DIFF_H_EDEFAULT.equals(utcDiffH);
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP__UTC_DIFF_M:
				return UTC_DIFF_M_EDEFAULT == null ? utcDiffM != null : !UTC_DIFF_M_EDEFAULT.equals(utcDiffM);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Reserved: ");
		result.append(reserved);
		result.append(", YearAD: ");
		result.append(yearAD);
		result.append(", Month: ");
		result.append(month);
		result.append(", Day: ");
		result.append(day);
		result.append(", Hour: ");
		result.append(hour);
		result.append(", Minute: ");
		result.append(minute);
		result.append(", Second: ");
		result.append(second);
		result.append(", TimeZone: ");
		result.append(timeZone);
		result.append(", UTCDiffH: ");
		result.append(utcDiffH);
		result.append(", UTCDiffM: ");
		result.append(utcDiffM);
		result.append(')');
		return result.toString();
	}

} //UniversalDateAndTimeStampImpl
