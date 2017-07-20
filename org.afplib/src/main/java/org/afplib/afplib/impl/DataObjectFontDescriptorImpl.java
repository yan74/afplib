/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.DataObjectFontDescriptor;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object Font Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.DataObjectFontDescriptorImpl#getDOFtFlgs <em>DO Ft Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.DataObjectFontDescriptorImpl#getFontTech <em>Font Tech</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.DataObjectFontDescriptorImpl#getVFS <em>VFS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.DataObjectFontDescriptorImpl#getHFS <em>HFS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.DataObjectFontDescriptorImpl#getCharRot <em>Char Rot</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.DataObjectFontDescriptorImpl#getEncEnv <em>Enc Env</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.DataObjectFontDescriptorImpl#getEncID <em>Enc ID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.DataObjectFontDescriptorImpl#getReserved <em>Reserved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataObjectFontDescriptorImpl extends TripletImpl implements DataObjectFontDescriptor {
	/**
     * The default value of the '{@link #getDOFtFlgs() <em>DO Ft Flgs</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDOFtFlgs()
     * @generated
     * @ordered
     */
	protected static final Integer DO_FT_FLGS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDOFtFlgs() <em>DO Ft Flgs</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDOFtFlgs()
     * @generated
     * @ordered
     */
	protected Integer doFtFlgs = DO_FT_FLGS_EDEFAULT;

	/**
     * The default value of the '{@link #getFontTech() <em>Font Tech</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontTech()
     * @generated
     * @ordered
     */
	protected static final Integer FONT_TECH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFontTech() <em>Font Tech</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontTech()
     * @generated
     * @ordered
     */
	protected Integer fontTech = FONT_TECH_EDEFAULT;

	/**
     * The default value of the '{@link #getVFS() <em>VFS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVFS()
     * @generated
     * @ordered
     */
	protected static final Integer VFS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getVFS() <em>VFS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVFS()
     * @generated
     * @ordered
     */
	protected Integer vfs = VFS_EDEFAULT;

	/**
     * The default value of the '{@link #getHFS() <em>HFS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHFS()
     * @generated
     * @ordered
     */
	protected static final Integer HFS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHFS() <em>HFS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHFS()
     * @generated
     * @ordered
     */
	protected Integer hfs = HFS_EDEFAULT;

	/**
     * The default value of the '{@link #getCharRot() <em>Char Rot</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharRot()
     * @generated
     * @ordered
     */
	protected static final Integer CHAR_ROT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCharRot() <em>Char Rot</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharRot()
     * @generated
     * @ordered
     */
	protected Integer charRot = CHAR_ROT_EDEFAULT;

	/**
     * The default value of the '{@link #getEncEnv() <em>Enc Env</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEncEnv()
     * @generated
     * @ordered
     */
	protected static final Integer ENC_ENV_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getEncEnv() <em>Enc Env</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEncEnv()
     * @generated
     * @ordered
     */
	protected Integer encEnv = ENC_ENV_EDEFAULT;

	/**
     * The default value of the '{@link #getEncID() <em>Enc ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEncID()
     * @generated
     * @ordered
     */
	protected static final Integer ENC_ID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getEncID() <em>Enc ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEncID()
     * @generated
     * @ordered
     */
	protected Integer encID = ENC_ID_EDEFAULT;

	/**
     * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReserved()
     * @generated
     * @ordered
     */
	protected static final byte[] RESERVED_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReserved()
     * @generated
     * @ordered
     */
	protected byte[] reserved = RESERVED_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DataObjectFontDescriptorImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getDataObjectFontDescriptor();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getDOFtFlgs() {
        return doFtFlgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDOFtFlgs(Integer newDOFtFlgs) {
        Integer oldDOFtFlgs = doFtFlgs;
        doFtFlgs = newDOFtFlgs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__DO_FT_FLGS, oldDOFtFlgs, doFtFlgs));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getFontTech() {
        return fontTech;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFontTech(Integer newFontTech) {
        Integer oldFontTech = fontTech;
        fontTech = newFontTech;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__FONT_TECH, oldFontTech, fontTech));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getVFS() {
        return vfs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVFS(Integer newVFS) {
        Integer oldVFS = vfs;
        vfs = newVFS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__VFS, oldVFS, vfs));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getHFS() {
        return hfs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHFS(Integer newHFS) {
        Integer oldHFS = hfs;
        hfs = newHFS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__HFS, oldHFS, hfs));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCharRot() {
        return charRot;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCharRot(Integer newCharRot) {
        Integer oldCharRot = charRot;
        charRot = newCharRot;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__CHAR_ROT, oldCharRot, charRot));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getEncEnv() {
        return encEnv;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEncEnv(Integer newEncEnv) {
        Integer oldEncEnv = encEnv;
        encEnv = newEncEnv;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ENV, oldEncEnv, encEnv));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getEncID() {
        return encID;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEncID(Integer newEncID) {
        Integer oldEncID = encID;
        encID = newEncID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ID, oldEncID, encID));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public byte[] getReserved() {
        return reserved;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReserved(byte[] newReserved) {
        byte[] oldReserved = reserved;
        reserved = newReserved;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__RESERVED, oldReserved, reserved));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__DO_FT_FLGS:
                return getDOFtFlgs();
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__FONT_TECH:
                return getFontTech();
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__VFS:
                return getVFS();
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__HFS:
                return getHFS();
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__CHAR_ROT:
                return getCharRot();
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ENV:
                return getEncEnv();
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ID:
                return getEncID();
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__RESERVED:
                return getReserved();
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
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__DO_FT_FLGS:
                setDOFtFlgs((Integer)newValue);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__FONT_TECH:
                setFontTech((Integer)newValue);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__VFS:
                setVFS((Integer)newValue);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__HFS:
                setHFS((Integer)newValue);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__CHAR_ROT:
                setCharRot((Integer)newValue);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ENV:
                setEncEnv((Integer)newValue);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ID:
                setEncID((Integer)newValue);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__RESERVED:
                setReserved((byte[])newValue);
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
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__DO_FT_FLGS:
                setDOFtFlgs(DO_FT_FLGS_EDEFAULT);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__FONT_TECH:
                setFontTech(FONT_TECH_EDEFAULT);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__VFS:
                setVFS(VFS_EDEFAULT);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__HFS:
                setHFS(HFS_EDEFAULT);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__CHAR_ROT:
                setCharRot(CHAR_ROT_EDEFAULT);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ENV:
                setEncEnv(ENC_ENV_EDEFAULT);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ID:
                setEncID(ENC_ID_EDEFAULT);
                return;
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__RESERVED:
                setReserved(RESERVED_EDEFAULT);
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
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__DO_FT_FLGS:
                return DO_FT_FLGS_EDEFAULT == null ? doFtFlgs != null : !DO_FT_FLGS_EDEFAULT.equals(doFtFlgs);
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__FONT_TECH:
                return FONT_TECH_EDEFAULT == null ? fontTech != null : !FONT_TECH_EDEFAULT.equals(fontTech);
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__VFS:
                return VFS_EDEFAULT == null ? vfs != null : !VFS_EDEFAULT.equals(vfs);
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__HFS:
                return HFS_EDEFAULT == null ? hfs != null : !HFS_EDEFAULT.equals(hfs);
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__CHAR_ROT:
                return CHAR_ROT_EDEFAULT == null ? charRot != null : !CHAR_ROT_EDEFAULT.equals(charRot);
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ENV:
                return ENC_ENV_EDEFAULT == null ? encEnv != null : !ENC_ENV_EDEFAULT.equals(encEnv);
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__ENC_ID:
                return ENC_ID_EDEFAULT == null ? encID != null : !ENC_ID_EDEFAULT.equals(encID);
            case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR__RESERVED:
                return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
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
        result.append(" (DOFtFlgs: ");
        result.append(doFtFlgs);
        result.append(", FontTech: ");
        result.append(fontTech);
        result.append(", VFS: ");
        result.append(vfs);
        result.append(", HFS: ");
        result.append(hfs);
        result.append(", CharRot: ");
        result.append(charRot);
        result.append(", EncEnv: ");
        result.append(encEnv);
        result.append(", EncID: ");
        result.append(encID);
        result.append(", Reserved: ");
        result.append(reserved);
        result.append(')');
        return result.toString();
    }

} //DataObjectFontDescriptorImpl
