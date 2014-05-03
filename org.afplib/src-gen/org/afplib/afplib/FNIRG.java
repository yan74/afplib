/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNIRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FNIRG#getGCGID <em>GCGID</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getCharInc <em>Char Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getAscendHt <em>Ascend Ht</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getDescendDp <em>Descend Dp</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getFNMCnt <em>FNM Cnt</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getASpace <em>ASpace</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getBSpace <em>BSpace</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getCSpace <em>CSpace</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.FNIRG#getBaseOset <em>Base Oset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNIRG()
 * @model
 * @generated
 */
public interface FNIRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>GCGID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GCGID</em>' attribute.
	 * @see #setGCGID(String)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_GCGID()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getGCGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getGCGID <em>GCGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GCGID</em>' attribute.
	 * @see #getGCGID()
	 * @generated
	 */
	void setGCGID(String value);

	/**
	 * Returns the value of the '<em><b>Char Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Char Inc</em>' attribute.
	 * @see #setCharInc(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_CharInc()
	 * @model required="true"
	 * @generated
	 */
	Integer getCharInc();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getCharInc <em>Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Inc</em>' attribute.
	 * @see #getCharInc()
	 * @generated
	 */
	void setCharInc(Integer value);

	/**
	 * Returns the value of the '<em><b>Ascend Ht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ascend Ht</em>' attribute.
	 * @see #setAscendHt(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_AscendHt()
	 * @model required="true"
	 * @generated
	 */
	Integer getAscendHt();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getAscendHt <em>Ascend Ht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascend Ht</em>' attribute.
	 * @see #getAscendHt()
	 * @generated
	 */
	void setAscendHt(Integer value);

	/**
	 * Returns the value of the '<em><b>Descend Dp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descend Dp</em>' attribute.
	 * @see #setDescendDp(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_DescendDp()
	 * @model required="true"
	 * @generated
	 */
	Integer getDescendDp();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getDescendDp <em>Descend Dp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descend Dp</em>' attribute.
	 * @see #getDescendDp()
	 * @generated
	 */
	void setDescendDp(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_Reserved()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Integer value);

	/**
	 * Returns the value of the '<em><b>FNM Cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FNM Cnt</em>' attribute.
	 * @see #setFNMCnt(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_FNMCnt()
	 * @model required="true"
	 * @generated
	 */
	Integer getFNMCnt();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getFNMCnt <em>FNM Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FNM Cnt</em>' attribute.
	 * @see #getFNMCnt()
	 * @generated
	 */
	void setFNMCnt(Integer value);

	/**
	 * Returns the value of the '<em><b>ASpace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ASpace</em>' attribute.
	 * @see #setASpace(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_ASpace()
	 * @model required="true"
	 * @generated
	 */
	Integer getASpace();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getASpace <em>ASpace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ASpace</em>' attribute.
	 * @see #getASpace()
	 * @generated
	 */
	void setASpace(Integer value);

	/**
	 * Returns the value of the '<em><b>BSpace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BSpace</em>' attribute.
	 * @see #setBSpace(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_BSpace()
	 * @model required="true"
	 * @generated
	 */
	Integer getBSpace();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getBSpace <em>BSpace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BSpace</em>' attribute.
	 * @see #getBSpace()
	 * @generated
	 */
	void setBSpace(Integer value);

	/**
	 * Returns the value of the '<em><b>CSpace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CSpace</em>' attribute.
	 * @see #setCSpace(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_CSpace()
	 * @model required="true"
	 * @generated
	 */
	Integer getCSpace();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getCSpace <em>CSpace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSpace</em>' attribute.
	 * @see #getCSpace()
	 * @generated
	 */
	void setCSpace(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved2</em>' attribute.
	 * @see #setReserved2(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_Reserved2()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getReserved2 <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved2</em>' attribute.
	 * @see #getReserved2()
	 * @generated
	 */
	void setReserved2(Integer value);

	/**
	 * Returns the value of the '<em><b>Base Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Oset</em>' attribute.
	 * @see #setBaseOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNIRG_BaseOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getBaseOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNIRG#getBaseOset <em>Base Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Oset</em>' attribute.
	 * @see #getBaseOset()
	 * @generated
	 */
	void setBaseOset(Integer value);

} // FNIRG
