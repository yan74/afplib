/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNPRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.FNPRG#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getLcHeight <em>Lc Height</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getCapMHt <em>Cap MHt</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getMaxAscHt <em>Max Asc Ht</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getMaxDesDp <em>Max Des Dp</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getRetired <em>Retired</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getReserved3 <em>Reserved3</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getUscoreWd <em>Uscore Wd</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getUscoreWdf <em>Uscore Wdf</em>}</li>
 *   <li>{@link org.afplib.afplib.FNPRG#getUscorePos <em>Uscore Pos</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNPRG()
 * @model
 * @generated
 */
public interface FNPRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_Reserved()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Integer value);

	/**
	 * Returns the value of the '<em><b>Lc Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lc Height</em>' attribute.
	 * @see #setLcHeight(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_LcHeight()
	 * @model required="true"
	 * @generated
	 */
	Integer getLcHeight();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getLcHeight <em>Lc Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lc Height</em>' attribute.
	 * @see #getLcHeight()
	 * @generated
	 */
	void setLcHeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Cap MHt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cap MHt</em>' attribute.
	 * @see #setCapMHt(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_CapMHt()
	 * @model required="true"
	 * @generated
	 */
	Integer getCapMHt();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getCapMHt <em>Cap MHt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap MHt</em>' attribute.
	 * @see #getCapMHt()
	 * @generated
	 */
	void setCapMHt(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Asc Ht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Asc Ht</em>' attribute.
	 * @see #setMaxAscHt(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_MaxAscHt()
	 * @model required="true"
	 * @generated
	 */
	Integer getMaxAscHt();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getMaxAscHt <em>Max Asc Ht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Asc Ht</em>' attribute.
	 * @see #getMaxAscHt()
	 * @generated
	 */
	void setMaxAscHt(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Des Dp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Des Dp</em>' attribute.
	 * @see #setMaxDesDp(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_MaxDesDp()
	 * @model required="true"
	 * @generated
	 */
	Integer getMaxDesDp();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getMaxDesDp <em>Max Des Dp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Des Dp</em>' attribute.
	 * @see #getMaxDesDp()
	 * @generated
	 */
	void setMaxDesDp(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved2</em>' attribute.
	 * @see #setReserved2(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_Reserved2()
	 * @model required="true"
	 * @generated
	 */
	byte[] getReserved2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getReserved2 <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved2</em>' attribute.
	 * @see #getReserved2()
	 * @generated
	 */
	void setReserved2(byte[] value);

	/**
	 * Returns the value of the '<em><b>Retired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retired</em>' attribute.
	 * @see #setRetired(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_Retired()
	 * @model required="true"
	 * @generated
	 */
	Integer getRetired();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getRetired <em>Retired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retired</em>' attribute.
	 * @see #getRetired()
	 * @generated
	 */
	void setRetired(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved3</em>' attribute.
	 * @see #setReserved3(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_Reserved3()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved3();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getReserved3 <em>Reserved3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved3</em>' attribute.
	 * @see #getReserved3()
	 * @generated
	 */
	void setReserved3(Integer value);

	/**
	 * Returns the value of the '<em><b>Uscore Wd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uscore Wd</em>' attribute.
	 * @see #setUscoreWd(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_UscoreWd()
	 * @model required="true"
	 * @generated
	 */
	Integer getUscoreWd();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getUscoreWd <em>Uscore Wd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uscore Wd</em>' attribute.
	 * @see #getUscoreWd()
	 * @generated
	 */
	void setUscoreWd(Integer value);

	/**
	 * Returns the value of the '<em><b>Uscore Wdf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uscore Wdf</em>' attribute.
	 * @see #setUscoreWdf(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_UscoreWdf()
	 * @model required="true"
	 * @generated
	 */
	Integer getUscoreWdf();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getUscoreWdf <em>Uscore Wdf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uscore Wdf</em>' attribute.
	 * @see #getUscoreWdf()
	 * @generated
	 */
	void setUscoreWdf(Integer value);

	/**
	 * Returns the value of the '<em><b>Uscore Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uscore Pos</em>' attribute.
	 * @see #setUscorePos(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNPRG_UscorePos()
	 * @model required="true"
	 * @generated
	 */
	Integer getUscorePos();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNPRG#getUscorePos <em>Uscore Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uscore Pos</em>' attribute.
	 * @see #getUscorePos()
	 * @generated
	 */
	void setUscorePos(Integer value);

} // FNPRG
