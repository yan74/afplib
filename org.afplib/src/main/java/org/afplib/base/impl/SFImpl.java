/**
 */
package org.afplib.base.impl;

import java.nio.charset.Charset;

import java.util.Collection;

import org.afplib.base.BasePackage;
import org.afplib.base.SF;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.base.impl.SFImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.afplib.base.impl.SFImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.afplib.base.impl.SFImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.afplib.base.impl.SFImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.afplib.base.impl.SFImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.afplib.base.impl.SFImpl#getRawData <em>Raw Data</em>}</li>
 *   <li>{@link org.afplib.base.impl.SFImpl#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SFImpl extends EObjectImpl implements SF {
	/**
     * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
	protected static final long NUMBER_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
	protected long number = NUMBER_EDEFAULT;

	/**
     * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
	protected static final long OFFSET_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
	protected long offset = OFFSET_EDEFAULT;

	/**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
	protected static final int ID_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
	protected int id = ID_EDEFAULT;

	/**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
	protected int length = LENGTH_EDEFAULT;

	/**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getChildren()
     * @generated
     * @ordered
     */
	protected EList<SF> children;

	/**
     * The default value of the '{@link #getRawData() <em>Raw Data</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRawData()
     * @generated
     * @ordered
     */
	protected static final byte[] RAW_DATA_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRawData() <em>Raw Data</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRawData()
     * @generated
     * @ordered
     */
	protected byte[] rawData = RAW_DATA_EDEFAULT;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SFImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BasePackage.Literals.SF;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getNumber() {
        return number;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNumber(long newNumber) {
        long oldNumber = number;
        number = newNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SF__NUMBER, oldNumber, number));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getOffset() {
        return offset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOffset(long newOffset) {
        long oldOffset = offset;
        offset = newOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SF__OFFSET, oldOffset, offset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getId() {
        return id;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SF__ID, oldId, id));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getLength() {
        return length;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLength(int newLength) {
        int oldLength = length;
        length = newLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SF__LENGTH, oldLength, length));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SF> getChildren() {
        if (children == null) {
            children = new EObjectContainmentEList.Resolving<SF>(SF.class, this, BasePackage.SF__CHILDREN);
        }
        return children;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public byte[] getRawData() {
        return rawData;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRawData(byte[] newRawData) {
        byte[] oldRawData = rawData;
        rawData = newRawData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SF__RAW_DATA, oldRawData, rawData));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SF__CHARSET, oldCharset, charset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isBegin() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isEnd() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isDefault(String value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BasePackage.SF__CHILDREN:
                return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BasePackage.SF__NUMBER:
                return getNumber();
            case BasePackage.SF__OFFSET:
                return getOffset();
            case BasePackage.SF__ID:
                return getId();
            case BasePackage.SF__LENGTH:
                return getLength();
            case BasePackage.SF__CHILDREN:
                return getChildren();
            case BasePackage.SF__RAW_DATA:
                return getRawData();
            case BasePackage.SF__CHARSET:
                return getCharset();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BasePackage.SF__NUMBER:
                setNumber((Long)newValue);
                return;
            case BasePackage.SF__OFFSET:
                setOffset((Long)newValue);
                return;
            case BasePackage.SF__ID:
                setId((Integer)newValue);
                return;
            case BasePackage.SF__LENGTH:
                setLength((Integer)newValue);
                return;
            case BasePackage.SF__CHILDREN:
                getChildren().clear();
                getChildren().addAll((Collection<? extends SF>)newValue);
                return;
            case BasePackage.SF__RAW_DATA:
                setRawData((byte[])newValue);
                return;
            case BasePackage.SF__CHARSET:
                setCharset((Charset)newValue);
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
            case BasePackage.SF__NUMBER:
                setNumber(NUMBER_EDEFAULT);
                return;
            case BasePackage.SF__OFFSET:
                setOffset(OFFSET_EDEFAULT);
                return;
            case BasePackage.SF__ID:
                setId(ID_EDEFAULT);
                return;
            case BasePackage.SF__LENGTH:
                setLength(LENGTH_EDEFAULT);
                return;
            case BasePackage.SF__CHILDREN:
                getChildren().clear();
                return;
            case BasePackage.SF__RAW_DATA:
                setRawData(RAW_DATA_EDEFAULT);
                return;
            case BasePackage.SF__CHARSET:
                setCharset(CHARSET_EDEFAULT);
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
            case BasePackage.SF__NUMBER:
                return number != NUMBER_EDEFAULT;
            case BasePackage.SF__OFFSET:
                return offset != OFFSET_EDEFAULT;
            case BasePackage.SF__ID:
                return id != ID_EDEFAULT;
            case BasePackage.SF__LENGTH:
                return length != LENGTH_EDEFAULT;
            case BasePackage.SF__CHILDREN:
                return children != null && !children.isEmpty();
            case BasePackage.SF__RAW_DATA:
                return RAW_DATA_EDEFAULT == null ? rawData != null : !RAW_DATA_EDEFAULT.equals(rawData);
            case BasePackage.SF__CHARSET:
                return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
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
        result.append(" (number: ");
        result.append(number);
        result.append(", offset: ");
        result.append(offset);
        result.append(", id: ");
        result.append(id);
        result.append(", length: ");
        result.append(length);
        result.append(", rawData: ");
        result.append(rawData);
        result.append(", charset: ");
        result.append(charset);
        result.append(')');
        return result.toString();
    }

} //SFImpl
