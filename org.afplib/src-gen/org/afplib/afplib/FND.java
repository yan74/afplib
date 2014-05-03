/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FND</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Font Descriptor</b><br>The Font Descriptor (FND) specifies the overall characteristics of a font character set.</p><p>ID: 13870729</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FND#getTypeFcDesc <em>Type Fc Desc</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getFtWtClass <em>Ft Wt Class</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getFtWdClass <em>Ft Wd Class</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getMaxPtSize <em>Max Pt Size</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getNomPtSize <em>Nom Pt Size</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getMinPtSize <em>Min Pt Size</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getMaxHSize <em>Max HSize</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getNomHSize <em>Nom HSize</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getMinHSize <em>Min HSize</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getDsnGenCls <em>Dsn Gen Cls</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getDsnSubCls <em>Dsn Sub Cls</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getDsnSpcGrp <em>Dsn Spc Grp</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getReserved1 <em>Reserved1</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getFtDsFlags <em>Ft Ds Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getGCSID <em>GCSID</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getFGID <em>FGID</em>}</li>
 *   <li>{@link org.afplib.afplib.FND#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFND()
 * @model
 * @generated
 */
public interface FND extends SF {
	/**
	 * Returns the value of the '<em><b>Type Fc Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Fc Desc</em>' attribute.
	 * @see #setTypeFcDesc(String)
	 * @see org.afplib.afplib.AfplibPackage#getFND_TypeFcDesc()
	 * @model dataType="org.afplib.base.ModcaString32" required="true"
	 * @generated
	 */
	String getTypeFcDesc();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getTypeFcDesc <em>Type Fc Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Fc Desc</em>' attribute.
	 * @see #getTypeFcDesc()
	 * @generated
	 */
	void setTypeFcDesc(String value);

	/**
	 * Returns the value of the '<em><b>Ft Wt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ft Wt Class</em>' attribute.
	 * @see #setFtWtClass(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_FtWtClass()
	 * @model required="true"
	 * @generated
	 */
	Integer getFtWtClass();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getFtWtClass <em>Ft Wt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Wt Class</em>' attribute.
	 * @see #getFtWtClass()
	 * @generated
	 */
	void setFtWtClass(Integer value);

	/**
	 * Returns the value of the '<em><b>Ft Wd Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ft Wd Class</em>' attribute.
	 * @see #setFtWdClass(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_FtWdClass()
	 * @model required="true"
	 * @generated
	 */
	Integer getFtWdClass();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getFtWdClass <em>Ft Wd Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Wd Class</em>' attribute.
	 * @see #getFtWdClass()
	 * @generated
	 */
	void setFtWdClass(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Pt Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Pt Size</em>' attribute.
	 * @see #setMaxPtSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_MaxPtSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getMaxPtSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getMaxPtSize <em>Max Pt Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pt Size</em>' attribute.
	 * @see #getMaxPtSize()
	 * @generated
	 */
	void setMaxPtSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Nom Pt Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nom Pt Size</em>' attribute.
	 * @see #setNomPtSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_NomPtSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getNomPtSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getNomPtSize <em>Nom Pt Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Pt Size</em>' attribute.
	 * @see #getNomPtSize()
	 * @generated
	 */
	void setNomPtSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Pt Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Pt Size</em>' attribute.
	 * @see #setMinPtSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_MinPtSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getMinPtSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getMinPtSize <em>Min Pt Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Pt Size</em>' attribute.
	 * @see #getMinPtSize()
	 * @generated
	 */
	void setMinPtSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Max HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max HSize</em>' attribute.
	 * @see #setMaxHSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_MaxHSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getMaxHSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getMaxHSize <em>Max HSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max HSize</em>' attribute.
	 * @see #getMaxHSize()
	 * @generated
	 */
	void setMaxHSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Nom HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nom HSize</em>' attribute.
	 * @see #setNomHSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_NomHSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getNomHSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getNomHSize <em>Nom HSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom HSize</em>' attribute.
	 * @see #getNomHSize()
	 * @generated
	 */
	void setNomHSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Min HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min HSize</em>' attribute.
	 * @see #setMinHSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_MinHSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getMinHSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getMinHSize <em>Min HSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min HSize</em>' attribute.
	 * @see #getMinHSize()
	 * @generated
	 */
	void setMinHSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Dsn Gen Cls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsn Gen Cls</em>' attribute.
	 * @see #setDsnGenCls(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_DsnGenCls()
	 * @model required="true"
	 * @generated
	 */
	Integer getDsnGenCls();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getDsnGenCls <em>Dsn Gen Cls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsn Gen Cls</em>' attribute.
	 * @see #getDsnGenCls()
	 * @generated
	 */
	void setDsnGenCls(Integer value);

	/**
	 * Returns the value of the '<em><b>Dsn Sub Cls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsn Sub Cls</em>' attribute.
	 * @see #setDsnSubCls(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_DsnSubCls()
	 * @model required="true"
	 * @generated
	 */
	Integer getDsnSubCls();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getDsnSubCls <em>Dsn Sub Cls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsn Sub Cls</em>' attribute.
	 * @see #getDsnSubCls()
	 * @generated
	 */
	void setDsnSubCls(Integer value);

	/**
	 * Returns the value of the '<em><b>Dsn Spc Grp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsn Spc Grp</em>' attribute.
	 * @see #setDsnSpcGrp(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_DsnSpcGrp()
	 * @model required="true"
	 * @generated
	 */
	Integer getDsnSpcGrp();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getDsnSpcGrp <em>Dsn Spc Grp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsn Spc Grp</em>' attribute.
	 * @see #getDsnSpcGrp()
	 * @generated
	 */
	void setDsnSpcGrp(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved1</em>' attribute.
	 * @see #setReserved1(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getFND_Reserved1()
	 * @model required="true"
	 * @generated
	 */
	byte[] getReserved1();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getReserved1 <em>Reserved1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved1</em>' attribute.
	 * @see #getReserved1()
	 * @generated
	 */
	void setReserved1(byte[] value);

	/**
	 * Returns the value of the '<em><b>Ft Ds Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ft Ds Flags</em>' attribute.
	 * @see #setFtDsFlags(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_FtDsFlags()
	 * @model required="true"
	 * @generated
	 */
	Integer getFtDsFlags();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getFtDsFlags <em>Ft Ds Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Ds Flags</em>' attribute.
	 * @see #getFtDsFlags()
	 * @generated
	 */
	void setFtDsFlags(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved2</em>' attribute.
	 * @see #setReserved2(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getFND_Reserved2()
	 * @model required="true"
	 * @generated
	 */
	byte[] getReserved2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getReserved2 <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved2</em>' attribute.
	 * @see #getReserved2()
	 * @generated
	 */
	void setReserved2(byte[] value);

	/**
	 * Returns the value of the '<em><b>GCSID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GCSID</em>' attribute.
	 * @see #setGCSID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_GCSID()
	 * @model required="true"
	 * @generated
	 */
	Integer getGCSID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getGCSID <em>GCSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GCSID</em>' attribute.
	 * @see #getGCSID()
	 * @generated
	 */
	void setGCSID(Integer value);

	/**
	 * Returns the value of the '<em><b>FGID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FGID</em>' attribute.
	 * @see #setFGID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFND_FGID()
	 * @model required="true"
	 * @generated
	 */
	Integer getFGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FND#getFGID <em>FGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FGID</em>' attribute.
	 * @see #getFGID()
	 * @generated
	 */
	void setFGID(Integer value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getFND_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // FND
