/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNORG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FNORG#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getCharRot <em>Char Rot</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getMaxBOset <em>Max BOset</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getMaxCharInc <em>Max Char Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getSpCharInc <em>Sp Char Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getMaxBExt <em>Max BExt</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getOrntFlgs <em>Ornt Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getEmSpInc <em>Em Sp Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getReserved3 <em>Reserved3</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getFigSpInc <em>Fig Sp Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getNomCharInc <em>Nom Char Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getDefBInc <em>Def BInc</em>}</li>
 *   <li>{@link org.afplib.afplib.FNORG#getMinASp <em>Min ASp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNORG()
 * @model
 * @generated
 */
public interface FNORG extends Triplet {
	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_Reserved()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Integer value);

	/**
	 * Returns the value of the '<em><b>Char Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Char Rot</em>' attribute.
	 * @see #setCharRot(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_CharRot()
	 * @model required="true"
	 * @generated
	 */
	Integer getCharRot();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getCharRot <em>Char Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Rot</em>' attribute.
	 * @see #getCharRot()
	 * @generated
	 */
	void setCharRot(Integer value);

	/**
	 * Returns the value of the '<em><b>Max BOset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max BOset</em>' attribute.
	 * @see #setMaxBOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_MaxBOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getMaxBOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getMaxBOset <em>Max BOset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max BOset</em>' attribute.
	 * @see #getMaxBOset()
	 * @generated
	 */
	void setMaxBOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Char Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Char Inc</em>' attribute.
	 * @see #setMaxCharInc(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_MaxCharInc()
	 * @model required="true"
	 * @generated
	 */
	Integer getMaxCharInc();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getMaxCharInc <em>Max Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Char Inc</em>' attribute.
	 * @see #getMaxCharInc()
	 * @generated
	 */
	void setMaxCharInc(Integer value);

	/**
	 * Returns the value of the '<em><b>Sp Char Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sp Char Inc</em>' attribute.
	 * @see #setSpCharInc(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_SpCharInc()
	 * @model required="true"
	 * @generated
	 */
	Integer getSpCharInc();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getSpCharInc <em>Sp Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sp Char Inc</em>' attribute.
	 * @see #getSpCharInc()
	 * @generated
	 */
	void setSpCharInc(Integer value);

	/**
	 * Returns the value of the '<em><b>Max BExt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max BExt</em>' attribute.
	 * @see #setMaxBExt(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_MaxBExt()
	 * @model required="true"
	 * @generated
	 */
	Integer getMaxBExt();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getMaxBExt <em>Max BExt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max BExt</em>' attribute.
	 * @see #getMaxBExt()
	 * @generated
	 */
	void setMaxBExt(Integer value);

	/**
	 * Returns the value of the '<em><b>Ornt Flgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ornt Flgs</em>' attribute.
	 * @see #setOrntFlgs(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_OrntFlgs()
	 * @model required="true"
	 * @generated
	 */
	Integer getOrntFlgs();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getOrntFlgs <em>Ornt Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ornt Flgs</em>' attribute.
	 * @see #getOrntFlgs()
	 * @generated
	 */
	void setOrntFlgs(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved2</em>' attribute.
	 * @see #setReserved2(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_Reserved2()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getReserved2 <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved2</em>' attribute.
	 * @see #getReserved2()
	 * @generated
	 */
	void setReserved2(Integer value);

	/**
	 * Returns the value of the '<em><b>Em Sp Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Em Sp Inc</em>' attribute.
	 * @see #setEmSpInc(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_EmSpInc()
	 * @model required="true"
	 * @generated
	 */
	Integer getEmSpInc();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getEmSpInc <em>Em Sp Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Em Sp Inc</em>' attribute.
	 * @see #getEmSpInc()
	 * @generated
	 */
	void setEmSpInc(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved3</em>' attribute.
	 * @see #setReserved3(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_Reserved3()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved3();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getReserved3 <em>Reserved3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved3</em>' attribute.
	 * @see #getReserved3()
	 * @generated
	 */
	void setReserved3(Integer value);

	/**
	 * Returns the value of the '<em><b>Fig Sp Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fig Sp Inc</em>' attribute.
	 * @see #setFigSpInc(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_FigSpInc()
	 * @model required="true"
	 * @generated
	 */
	Integer getFigSpInc();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getFigSpInc <em>Fig Sp Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fig Sp Inc</em>' attribute.
	 * @see #getFigSpInc()
	 * @generated
	 */
	void setFigSpInc(Integer value);

	/**
	 * Returns the value of the '<em><b>Nom Char Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nom Char Inc</em>' attribute.
	 * @see #setNomCharInc(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_NomCharInc()
	 * @model required="true"
	 * @generated
	 */
	Integer getNomCharInc();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getNomCharInc <em>Nom Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Char Inc</em>' attribute.
	 * @see #getNomCharInc()
	 * @generated
	 */
	void setNomCharInc(Integer value);

	/**
	 * Returns the value of the '<em><b>Def BInc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def BInc</em>' attribute.
	 * @see #setDefBInc(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_DefBInc()
	 * @model required="true"
	 * @generated
	 */
	Integer getDefBInc();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getDefBInc <em>Def BInc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def BInc</em>' attribute.
	 * @see #getDefBInc()
	 * @generated
	 */
	void setDefBInc(Integer value);

	/**
	 * Returns the value of the '<em><b>Min ASp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min ASp</em>' attribute.
	 * @see #setMinASp(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNORG_MinASp()
	 * @model required="true"
	 * @generated
	 */
	Integer getMinASp();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNORG#getMinASp <em>Min ASp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min ASp</em>' attribute.
	 * @see #getMinASp()
	 * @generated
	 */
	void setMinASp(Integer value);

} // FNORG
