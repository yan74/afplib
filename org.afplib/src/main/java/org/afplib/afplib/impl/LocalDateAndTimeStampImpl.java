/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.LocalDateAndTimeStamp;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Date And Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.LocalDateAndTimeStampImpl#getStampType <em>Stamp Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocalDateAndTimeStampImpl#getTHunYear <em>THun Year</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocalDateAndTimeStampImpl#getTenYear <em>Ten Year</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocalDateAndTimeStampImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocalDateAndTimeStampImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocalDateAndTimeStampImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocalDateAndTimeStampImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocalDateAndTimeStampImpl#getHundSec <em>Hund Sec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalDateAndTimeStampImpl extends TripletImpl implements LocalDateAndTimeStamp {
	/**
	 * The default value of the '{@link #getStampType() <em>Stamp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStampType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STAMP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStampType() <em>Stamp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStampType()
	 * @generated
	 * @ordered
	 */
	protected Integer stampType = STAMP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTHunYear() <em>THun Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHunYear()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THUN_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTHunYear() <em>THun Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHunYear()
	 * @generated
	 * @ordered
	 */
	protected Integer tHunYear = THUN_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenYear() <em>Ten Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenYear()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEN_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenYear() <em>Ten Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenYear()
	 * @generated
	 * @ordered
	 */
	protected Integer tenYear = TEN_YEAR_EDEFAULT;

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
	 * The default value of the '{@link #getHundSec() <em>Hund Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHundSec()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HUND_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHundSec() <em>Hund Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHundSec()
	 * @generated
	 * @ordered
	 */
	protected Integer hundSec = HUND_SEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalDateAndTimeStampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getLocalDateAndTimeStamp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStampType() {
		return stampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStampType(Integer newStampType) {
		Integer oldStampType = stampType;
		stampType = newStampType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE, oldStampType, stampType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTHunYear() {
		return tHunYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTHunYear(Integer newTHunYear) {
		Integer oldTHunYear = tHunYear;
		tHunYear = newTHunYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR, oldTHunYear, tHunYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTenYear() {
		return tenYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenYear(Integer newTenYear) {
		Integer oldTenYear = tenYear;
		tenYear = newTenYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR, oldTenYear, tenYear));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__DAY, oldDay, day));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR, oldHour, hour));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE, oldMinute, minute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHundSec() {
		return hundSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHundSec(Integer newHundSec) {
		Integer oldHundSec = hundSec;
		hundSec = newHundSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC, oldHundSec, hundSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE:
				return getStampType();
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR:
				return getTHunYear();
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR:
				return getTenYear();
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__DAY:
				return getDay();
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR:
				return getHour();
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE:
				return getMinute();
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND:
				return getSecond();
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC:
				return getHundSec();
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
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE:
				setStampType((Integer)newValue);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR:
				setTHunYear((Integer)newValue);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR:
				setTenYear((Integer)newValue);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__DAY:
				setDay((Integer)newValue);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR:
				setHour((Integer)newValue);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE:
				setMinute((Integer)newValue);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND:
				setSecond((Integer)newValue);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC:
				setHundSec((Integer)newValue);
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
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE:
				setStampType(STAMP_TYPE_EDEFAULT);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR:
				setTHunYear(THUN_YEAR_EDEFAULT);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR:
				setTenYear(TEN_YEAR_EDEFAULT);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND:
				setSecond(SECOND_EDEFAULT);
				return;
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC:
				setHundSec(HUND_SEC_EDEFAULT);
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
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE:
				return STAMP_TYPE_EDEFAULT == null ? stampType != null : !STAMP_TYPE_EDEFAULT.equals(stampType);
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR:
				return THUN_YEAR_EDEFAULT == null ? tHunYear != null : !THUN_YEAR_EDEFAULT.equals(tHunYear);
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR:
				return TEN_YEAR_EDEFAULT == null ? tenYear != null : !TEN_YEAR_EDEFAULT.equals(tenYear);
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR:
				return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE:
				return MINUTE_EDEFAULT == null ? minute != null : !MINUTE_EDEFAULT.equals(minute);
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND:
				return SECOND_EDEFAULT == null ? second != null : !SECOND_EDEFAULT.equals(second);
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC:
				return HUND_SEC_EDEFAULT == null ? hundSec != null : !HUND_SEC_EDEFAULT.equals(hundSec);
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
		result.append(" (StampType: ");
		result.append(stampType);
		result.append(", THunYear: ");
		result.append(tHunYear);
		result.append(", TenYear: ");
		result.append(tenYear);
		result.append(", Day: ");
		result.append(day);
		result.append(", Hour: ");
		result.append(hour);
		result.append(", Minute: ");
		result.append(minute);
		result.append(", Second: ");
		result.append(second);
		result.append(", HundSec: ");
		result.append(hundSec);
		result.append(')');
		return result.toString();
	}

} //LocalDateAndTimeStampImpl
