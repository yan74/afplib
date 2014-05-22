/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNMRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FNMRG#getCharBoxWd <em>Char Box Wd</em>}</li>
 *   <li>{@link org.afplib.afplib.FNMRG#getCharBoxHt <em>Char Box Ht</em>}</li>
 *   <li>{@link org.afplib.afplib.FNMRG#getPatDOset <em>Pat DOset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNMRG()
 * @model
 * @generated
 */
public interface FNMRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>Char Box Wd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Char Box Wd</em>' attribute.
	 * @see #setCharBoxWd(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNMRG_CharBoxWd()
	 * @model required="true"
	 * @generated
	 */
	Integer getCharBoxWd();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNMRG#getCharBoxWd <em>Char Box Wd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Box Wd</em>' attribute.
	 * @see #getCharBoxWd()
	 * @generated
	 */
	void setCharBoxWd(Integer value);

	/**
	 * Returns the value of the '<em><b>Char Box Ht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Char Box Ht</em>' attribute.
	 * @see #setCharBoxHt(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNMRG_CharBoxHt()
	 * @model required="true"
	 * @generated
	 */
	Integer getCharBoxHt();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNMRG#getCharBoxHt <em>Char Box Ht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Box Ht</em>' attribute.
	 * @see #getCharBoxHt()
	 * @generated
	 */
	void setCharBoxHt(Integer value);

	/**
	 * Returns the value of the '<em><b>Pat DOset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pat DOset</em>' attribute.
	 * @see #setPatDOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNMRG_PatDOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getPatDOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNMRG#getPatDOset <em>Pat DOset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pat DOset</em>' attribute.
	 * @see #getPatDOset()
	 * @generated
	 */
	void setPatDOset(Integer value);

} // FNMRG
