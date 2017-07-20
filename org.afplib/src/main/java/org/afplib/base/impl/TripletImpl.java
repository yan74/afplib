/**
 */
package org.afplib.base.impl;

import java.nio.charset.Charset;

import org.afplib.base.BasePackage;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triplet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.base.impl.TripletImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.afplib.base.impl.TripletImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.afplib.base.impl.TripletImpl#getFileOffset <em>File Offset</em>}</li>
 *   <li>{@link org.afplib.base.impl.TripletImpl#getTripletLength <em>Triplet Length</em>}</li>
 *   <li>{@link org.afplib.base.impl.TripletImpl#getTripletId <em>Triplet Id</em>}</li>
 *   <li>{@link org.afplib.base.impl.TripletImpl#getTripletNumber <em>Triplet Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TripletImpl extends EObjectImpl implements Triplet {
	/**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
	protected static final String LABEL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
	protected String label = LABEL_EDEFAULT;

	/**
     * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharset()
     * @generated
     * @ordered
     */
	protected static final Charset CHARSET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharset()
     * @generated
     * @ordered
     */
	protected Charset charset = CHARSET_EDEFAULT;

	/**
     * The default value of the '{@link #getFileOffset() <em>File Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFileOffset()
     * @generated
     * @ordered
     */
	protected static final long FILE_OFFSET_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getFileOffset() <em>File Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFileOffset()
     * @generated
     * @ordered
     */
	protected long fileOffset = FILE_OFFSET_EDEFAULT;

	/**
     * The default value of the '{@link #getTripletLength() <em>Triplet Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTripletLength()
     * @generated
     * @ordered
     */
	protected static final int TRIPLET_LENGTH_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getTripletLength() <em>Triplet Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTripletLength()
     * @generated
     * @ordered
     */
	protected int tripletLength = TRIPLET_LENGTH_EDEFAULT;

	/**
     * The default value of the '{@link #getTripletId() <em>Triplet Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTripletId()
     * @generated
     * @ordered
     */
	protected static final int TRIPLET_ID_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getTripletId() <em>Triplet Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTripletId()
     * @generated
     * @ordered
     */
	protected int tripletId = TRIPLET_ID_EDEFAULT;

	/**
     * The default value of the '{@link #getTripletNumber() <em>Triplet Number</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTripletNumber()
     * @generated
     * @ordered
     */
	protected static final int TRIPLET_NUMBER_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getTripletNumber() <em>Triplet Number</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTripletNumber()
     * @generated
     * @ordered
     */
	protected int tripletNumber = TRIPLET_NUMBER_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TripletImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BasePackage.Literals.TRIPLET;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLabel() {
        return label;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TRIPLET__LABEL, oldLabel, label));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Charset getCharset() {
        return charset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCharset(Charset newCharset) {
        Charset oldCharset = charset;
        charset = newCharset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TRIPLET__CHARSET, oldCharset, charset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getFileOffset() {
        return fileOffset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFileOffset(long newFileOffset) {
        long oldFileOffset = fileOffset;
        fileOffset = newFileOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TRIPLET__FILE_OFFSET, oldFileOffset, fileOffset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getTripletLength() {
        return tripletLength;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTripletLength(int newTripletLength) {
        int oldTripletLength = tripletLength;
        tripletLength = newTripletLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TRIPLET__TRIPLET_LENGTH, oldTripletLength, tripletLength));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getTripletId() {
        return tripletId;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTripletId(int newTripletId) {
        int oldTripletId = tripletId;
        tripletId = newTripletId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TRIPLET__TRIPLET_ID, oldTripletId, tripletId));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getTripletNumber() {
        return tripletNumber;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTripletNumber(int newTripletNumber) {
        int oldTripletNumber = tripletNumber;
        tripletNumber = newTripletNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TRIPLET__TRIPLET_NUMBER, oldTripletNumber, tripletNumber));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BasePackage.TRIPLET__LABEL:
                return getLabel();
            case BasePackage.TRIPLET__CHARSET:
                return getCharset();
            case BasePackage.TRIPLET__FILE_OFFSET:
                return getFileOffset();
            case BasePackage.TRIPLET__TRIPLET_LENGTH:
                return getTripletLength();
            case BasePackage.TRIPLET__TRIPLET_ID:
                return getTripletId();
            case BasePackage.TRIPLET__TRIPLET_NUMBER:
                return getTripletNumber();
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
            case BasePackage.TRIPLET__LABEL:
                setLabel((String)newValue);
                return;
            case BasePackage.TRIPLET__CHARSET:
                setCharset((Charset)newValue);
                return;
            case BasePackage.TRIPLET__FILE_OFFSET:
                setFileOffset((Long)newValue);
                return;
            case BasePackage.TRIPLET__TRIPLET_LENGTH:
                setTripletLength((Integer)newValue);
                return;
            case BasePackage.TRIPLET__TRIPLET_ID:
                setTripletId((Integer)newValue);
                return;
            case BasePackage.TRIPLET__TRIPLET_NUMBER:
                setTripletNumber((Integer)newValue);
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
            case BasePackage.TRIPLET__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case BasePackage.TRIPLET__CHARSET:
                setCharset(CHARSET_EDEFAULT);
                return;
            case BasePackage.TRIPLET__FILE_OFFSET:
                setFileOffset(FILE_OFFSET_EDEFAULT);
                return;
            case BasePackage.TRIPLET__TRIPLET_LENGTH:
                setTripletLength(TRIPLET_LENGTH_EDEFAULT);
                return;
            case BasePackage.TRIPLET__TRIPLET_ID:
                setTripletId(TRIPLET_ID_EDEFAULT);
                return;
            case BasePackage.TRIPLET__TRIPLET_NUMBER:
                setTripletNumber(TRIPLET_NUMBER_EDEFAULT);
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
            case BasePackage.TRIPLET__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case BasePackage.TRIPLET__CHARSET:
                return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
            case BasePackage.TRIPLET__FILE_OFFSET:
                return fileOffset != FILE_OFFSET_EDEFAULT;
            case BasePackage.TRIPLET__TRIPLET_LENGTH:
                return tripletLength != TRIPLET_LENGTH_EDEFAULT;
            case BasePackage.TRIPLET__TRIPLET_ID:
                return tripletId != TRIPLET_ID_EDEFAULT;
            case BasePackage.TRIPLET__TRIPLET_NUMBER:
                return tripletNumber != TRIPLET_NUMBER_EDEFAULT;
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
        result.append(" (label: ");
        result.append(label);
        result.append(", charset: ");
        result.append(charset);
        result.append(", fileOffset: ");
        result.append(fileOffset);
        result.append(", tripletLength: ");
        result.append(tripletLength);
        result.append(", tripletId: ");
        result.append(tripletId);
        result.append(", tripletNumber: ");
        result.append(tripletNumber);
        result.append(')');
        return result.toString();
    }

} //TripletImpl
