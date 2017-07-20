/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.FNC#getRetired <em>Retired</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getPatTech <em>Pat Tech</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getReserved1 <em>Reserved1</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getFntFlags <em>Fnt Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getXUnitBase <em>XUnit Base</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getYUnitBase <em>YUnit Base</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getXftUnits <em>Xft Units</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getYftUnits <em>Yft Units</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getMaxBoxWd <em>Max Box Wd</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getMaxBoxHt <em>Max Box Ht</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getFNORGLen <em>FNORG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getFNIRGLen <em>FNIRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getPatAlign <em>Pat Align</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getRPatDCnt <em>RPat DCnt</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getFNPRGLen <em>FNPRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getFNMRGLen <em>FNMRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getResXUBase <em>Res XU Base</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getResYUBase <em>Res YU Base</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getXfrUnits <em>Xfr Units</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getYfrUnits <em>Yfr Units</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getOPatDCnt <em>OPat DCnt</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getFNNRGLen <em>FNNRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getFNNDCnt <em>FNND Cnt</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getFNNMapCnt <em>FNN Map Cnt</em>}</li>
 *   <li>{@link org.afplib.afplib.FNC#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNC()
 * @model
 * @generated
 */
public interface FNC extends SF {
	/**
     * Returns the value of the '<em><b>Retired</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Retired</em>' attribute.
     * @see #setRetired(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_Retired()
     * @model required="true"
     * @generated
     */
	Integer getRetired();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getRetired <em>Retired</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retired</em>' attribute.
     * @see #getRetired()
     * @generated
     */
	void setRetired(Integer value);

	/**
     * Returns the value of the '<em><b>Pat Tech</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pat Tech</em>' attribute.
     * @see #setPatTech(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_PatTech()
     * @model required="true"
     * @generated
     */
	Integer getPatTech();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getPatTech <em>Pat Tech</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pat Tech</em>' attribute.
     * @see #getPatTech()
     * @generated
     */
	void setPatTech(Integer value);

	/**
     * Returns the value of the '<em><b>Reserved1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reserved1</em>' attribute.
     * @see #setReserved1(byte[])
     * @see org.afplib.afplib.AfplibPackage#getFNC_Reserved1()
     * @model required="true"
     * @generated
     */
	byte[] getReserved1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getReserved1 <em>Reserved1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reserved1</em>' attribute.
     * @see #getReserved1()
     * @generated
     */
	void setReserved1(byte[] value);

	/**
     * Returns the value of the '<em><b>Fnt Flags</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fnt Flags</em>' attribute.
     * @see #setFntFlags(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_FntFlags()
     * @model required="true"
     * @generated
     */
	Integer getFntFlags();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getFntFlags <em>Fnt Flags</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fnt Flags</em>' attribute.
     * @see #getFntFlags()
     * @generated
     */
	void setFntFlags(Integer value);

	/**
     * Returns the value of the '<em><b>XUnit Base</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>XUnit Base</em>' attribute.
     * @see #setXUnitBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_XUnitBase()
     * @model required="true"
     * @generated
     */
	Integer getXUnitBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getXUnitBase <em>XUnit Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>XUnit Base</em>' attribute.
     * @see #getXUnitBase()
     * @generated
     */
	void setXUnitBase(Integer value);

	/**
     * Returns the value of the '<em><b>YUnit Base</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>YUnit Base</em>' attribute.
     * @see #setYUnitBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_YUnitBase()
     * @model required="true"
     * @generated
     */
	Integer getYUnitBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getYUnitBase <em>YUnit Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>YUnit Base</em>' attribute.
     * @see #getYUnitBase()
     * @generated
     */
	void setYUnitBase(Integer value);

	/**
     * Returns the value of the '<em><b>Xft Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xft Units</em>' attribute.
     * @see #setXftUnits(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_XftUnits()
     * @model required="true"
     * @generated
     */
	Integer getXftUnits();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getXftUnits <em>Xft Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xft Units</em>' attribute.
     * @see #getXftUnits()
     * @generated
     */
	void setXftUnits(Integer value);

	/**
     * Returns the value of the '<em><b>Yft Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Yft Units</em>' attribute.
     * @see #setYftUnits(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_YftUnits()
     * @model required="true"
     * @generated
     */
	Integer getYftUnits();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getYftUnits <em>Yft Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Yft Units</em>' attribute.
     * @see #getYftUnits()
     * @generated
     */
	void setYftUnits(Integer value);

	/**
     * Returns the value of the '<em><b>Max Box Wd</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Box Wd</em>' attribute.
     * @see #setMaxBoxWd(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_MaxBoxWd()
     * @model required="true"
     * @generated
     */
	Integer getMaxBoxWd();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getMaxBoxWd <em>Max Box Wd</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Box Wd</em>' attribute.
     * @see #getMaxBoxWd()
     * @generated
     */
	void setMaxBoxWd(Integer value);

	/**
     * Returns the value of the '<em><b>Max Box Ht</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Box Ht</em>' attribute.
     * @see #setMaxBoxHt(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_MaxBoxHt()
     * @model required="true"
     * @generated
     */
	Integer getMaxBoxHt();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getMaxBoxHt <em>Max Box Ht</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Box Ht</em>' attribute.
     * @see #getMaxBoxHt()
     * @generated
     */
	void setMaxBoxHt(Integer value);

	/**
     * Returns the value of the '<em><b>FNORG Len</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FNORG Len</em>' attribute.
     * @see #setFNORGLen(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_FNORGLen()
     * @model required="true"
     * @generated
     */
	Integer getFNORGLen();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getFNORGLen <em>FNORG Len</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FNORG Len</em>' attribute.
     * @see #getFNORGLen()
     * @generated
     */
	void setFNORGLen(Integer value);

	/**
     * Returns the value of the '<em><b>FNIRG Len</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FNIRG Len</em>' attribute.
     * @see #setFNIRGLen(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_FNIRGLen()
     * @model required="true"
     * @generated
     */
	Integer getFNIRGLen();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getFNIRGLen <em>FNIRG Len</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FNIRG Len</em>' attribute.
     * @see #getFNIRGLen()
     * @generated
     */
	void setFNIRGLen(Integer value);

	/**
     * Returns the value of the '<em><b>Pat Align</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pat Align</em>' attribute.
     * @see #setPatAlign(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_PatAlign()
     * @model required="true"
     * @generated
     */
	Integer getPatAlign();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getPatAlign <em>Pat Align</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pat Align</em>' attribute.
     * @see #getPatAlign()
     * @generated
     */
	void setPatAlign(Integer value);

	/**
     * Returns the value of the '<em><b>RPat DCnt</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RPat DCnt</em>' attribute.
     * @see #setRPatDCnt(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_RPatDCnt()
     * @model required="true"
     * @generated
     */
	Integer getRPatDCnt();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getRPatDCnt <em>RPat DCnt</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RPat DCnt</em>' attribute.
     * @see #getRPatDCnt()
     * @generated
     */
	void setRPatDCnt(Integer value);

	/**
     * Returns the value of the '<em><b>FNPRG Len</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FNPRG Len</em>' attribute.
     * @see #setFNPRGLen(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_FNPRGLen()
     * @model required="true"
     * @generated
     */
	Integer getFNPRGLen();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getFNPRGLen <em>FNPRG Len</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FNPRG Len</em>' attribute.
     * @see #getFNPRGLen()
     * @generated
     */
	void setFNPRGLen(Integer value);

	/**
     * Returns the value of the '<em><b>FNMRG Len</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FNMRG Len</em>' attribute.
     * @see #setFNMRGLen(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_FNMRGLen()
     * @model required="true"
     * @generated
     */
	Integer getFNMRGLen();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getFNMRGLen <em>FNMRG Len</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FNMRG Len</em>' attribute.
     * @see #getFNMRGLen()
     * @generated
     */
	void setFNMRGLen(Integer value);

	/**
     * Returns the value of the '<em><b>Res XU Base</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Res XU Base</em>' attribute.
     * @see #setResXUBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_ResXUBase()
     * @model
     * @generated
     */
	Integer getResXUBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getResXUBase <em>Res XU Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Res XU Base</em>' attribute.
     * @see #getResXUBase()
     * @generated
     */
	void setResXUBase(Integer value);

	/**
     * Returns the value of the '<em><b>Res YU Base</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Res YU Base</em>' attribute.
     * @see #setResYUBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_ResYUBase()
     * @model
     * @generated
     */
	Integer getResYUBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getResYUBase <em>Res YU Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Res YU Base</em>' attribute.
     * @see #getResYUBase()
     * @generated
     */
	void setResYUBase(Integer value);

	/**
     * Returns the value of the '<em><b>Xfr Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xfr Units</em>' attribute.
     * @see #setXfrUnits(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_XfrUnits()
     * @model
     * @generated
     */
	Integer getXfrUnits();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getXfrUnits <em>Xfr Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xfr Units</em>' attribute.
     * @see #getXfrUnits()
     * @generated
     */
	void setXfrUnits(Integer value);

	/**
     * Returns the value of the '<em><b>Yfr Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Yfr Units</em>' attribute.
     * @see #setYfrUnits(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_YfrUnits()
     * @model
     * @generated
     */
	Integer getYfrUnits();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getYfrUnits <em>Yfr Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Yfr Units</em>' attribute.
     * @see #getYfrUnits()
     * @generated
     */
	void setYfrUnits(Integer value);

	/**
     * Returns the value of the '<em><b>OPat DCnt</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>OPat DCnt</em>' attribute.
     * @see #setOPatDCnt(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_OPatDCnt()
     * @model
     * @generated
     */
	Integer getOPatDCnt();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getOPatDCnt <em>OPat DCnt</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>OPat DCnt</em>' attribute.
     * @see #getOPatDCnt()
     * @generated
     */
	void setOPatDCnt(Integer value);

	/**
     * Returns the value of the '<em><b>Reserved2</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reserved2</em>' attribute.
     * @see #setReserved2(byte[])
     * @see org.afplib.afplib.AfplibPackage#getFNC_Reserved2()
     * @model
     * @generated
     */
	byte[] getReserved2();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getReserved2 <em>Reserved2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reserved2</em>' attribute.
     * @see #getReserved2()
     * @generated
     */
	void setReserved2(byte[] value);

	/**
     * Returns the value of the '<em><b>FNNRG Len</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FNNRG Len</em>' attribute.
     * @see #setFNNRGLen(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_FNNRGLen()
     * @model
     * @generated
     */
	Integer getFNNRGLen();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getFNNRGLen <em>FNNRG Len</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FNNRG Len</em>' attribute.
     * @see #getFNNRGLen()
     * @generated
     */
	void setFNNRGLen(Integer value);

	/**
     * Returns the value of the '<em><b>FNND Cnt</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FNND Cnt</em>' attribute.
     * @see #setFNNDCnt(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_FNNDCnt()
     * @model
     * @generated
     */
	Integer getFNNDCnt();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getFNNDCnt <em>FNND Cnt</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FNND Cnt</em>' attribute.
     * @see #getFNNDCnt()
     * @generated
     */
	void setFNNDCnt(Integer value);

	/**
     * Returns the value of the '<em><b>FNN Map Cnt</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FNN Map Cnt</em>' attribute.
     * @see #setFNNMapCnt(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFNC_FNNMapCnt()
     * @model
     * @generated
     */
	Integer getFNNMapCnt();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FNC#getFNNMapCnt <em>FNN Map Cnt</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FNN Map Cnt</em>' attribute.
     * @see #getFNNMapCnt()
     * @generated
     */
	void setFNNMapCnt(Integer value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getFNC_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // FNC
