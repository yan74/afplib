/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CGCSGID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Coded Graphic Character Set Global Identifier</b><br>Definiert die codepage und die Zeichenmenge für CHAR Felder.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.CGCSGID#getGCSGID <em>GCSGID</em>}</li>
 *   <li>{@link org.afplib.afplib.CGCSGID#getCPGID <em>CPGID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getCGCSGID()
 * @model
 * @generated
 */
public interface CGCSGID extends Triplet {
	/**
	 * Returns the value of the '<em><b>GCSGID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GCSGID</em>' attribute.
	 * @see #setGCSGID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCGCSGID_GCSGID()
	 * @model required="true"
	 * @generated
	 */
	Integer getGCSGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CGCSGID#getGCSGID <em>GCSGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GCSGID</em>' attribute.
	 * @see #getGCSGID()
	 * @generated
	 */
	void setGCSGID(Integer value);

	/**
	 * Returns the value of the '<em><b>CPGID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CPGID</em>' attribute.
	 * @see #setCPGID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCGCSGID_CPGID()
	 * @model required="true"
	 * @generated
	 */
	Integer getCPGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CGCSGID#getCPGID <em>CPGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPGID</em>' attribute.
	 * @see #getCPGID()
	 * @generated
	 */
	void setCPGID(Integer value);

} // CGCSGID
