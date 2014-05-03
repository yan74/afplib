/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locale Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.LocaleSelector#getLocFlgs <em>Loc Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.LocaleSelector#getLangCode <em>Lang Code</em>}</li>
 *   <li>{@link org.afplib.afplib.LocaleSelector#getScrptCde <em>Scrpt Cde</em>}</li>
 *   <li>{@link org.afplib.afplib.LocaleSelector#getRegCde <em>Reg Cde</em>}</li>
 *   <li>{@link org.afplib.afplib.LocaleSelector#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.LocaleSelector#getVarCde <em>Var Cde</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getLocaleSelector()
 * @model
 * @generated
 */
public interface LocaleSelector extends Triplet {
	/**
	 * Returns the value of the '<em><b>Loc Flgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Flgs</em>' attribute.
	 * @see #setLocFlgs(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLocaleSelector_LocFlgs()
	 * @model required="true"
	 * @generated
	 */
	Integer getLocFlgs();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocaleSelector#getLocFlgs <em>Loc Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Flgs</em>' attribute.
	 * @see #getLocFlgs()
	 * @generated
	 */
	void setLocFlgs(Integer value);

	/**
	 * Returns the value of the '<em><b>Lang Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Code</em>' attribute.
	 * @see #setLangCode(String)
	 * @see org.afplib.afplib.AfplibPackage#getLocaleSelector_LangCode()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getLangCode();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocaleSelector#getLangCode <em>Lang Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Code</em>' attribute.
	 * @see #getLangCode()
	 * @generated
	 */
	void setLangCode(String value);

	/**
	 * Returns the value of the '<em><b>Scrpt Cde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scrpt Cde</em>' attribute.
	 * @see #setScrptCde(String)
	 * @see org.afplib.afplib.AfplibPackage#getLocaleSelector_ScrptCde()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getScrptCde();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocaleSelector#getScrptCde <em>Scrpt Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrpt Cde</em>' attribute.
	 * @see #getScrptCde()
	 * @generated
	 */
	void setScrptCde(String value);

	/**
	 * Returns the value of the '<em><b>Reg Cde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reg Cde</em>' attribute.
	 * @see #setRegCde(String)
	 * @see org.afplib.afplib.AfplibPackage#getLocaleSelector_RegCde()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getRegCde();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocaleSelector#getRegCde <em>Reg Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Cde</em>' attribute.
	 * @see #getRegCde()
	 * @generated
	 */
	void setRegCde(String value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getLocaleSelector_Reserved()
	 * @model required="true"
	 * @generated
	 */
	byte[] getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocaleSelector#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(byte[] value);

	/**
	 * Returns the value of the '<em><b>Var Cde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var Cde</em>' attribute.
	 * @see #setVarCde(String)
	 * @see org.afplib.afplib.AfplibPackage#getLocaleSelector_VarCde()
	 * @model dataType="org.afplib.base.ModcaString"
	 * @generated
	 */
	String getVarCde();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LocaleSelector#getVarCde <em>Var Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Cde</em>' attribute.
	 * @see #getVarCde()
	 * @generated
	 */
	void setVarCde(String value);

} // LocaleSelector
