/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Coded Graphic Character Set Global Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FontCodedGraphicCharacterSetGlobalIdentifier#getGCSGID <em>GCSGID</em>}</li>
 *   <li>{@link org.afplib.afplib.FontCodedGraphicCharacterSetGlobalIdentifier#getCPGID <em>CPGID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFontCodedGraphicCharacterSetGlobalIdentifier()
 * @model
 * @generated
 */
public interface FontCodedGraphicCharacterSetGlobalIdentifier extends Triplet {
	/**
	 * Returns the value of the '<em><b>GCSGID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GCSGID</em>' attribute.
	 * @see #setGCSGID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFontCodedGraphicCharacterSetGlobalIdentifier_GCSGID()
	 * @model required="true"
	 * @generated
	 */
	Integer getGCSGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FontCodedGraphicCharacterSetGlobalIdentifier#getGCSGID <em>GCSGID</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getFontCodedGraphicCharacterSetGlobalIdentifier_CPGID()
	 * @model required="true"
	 * @generated
	 */
	Integer getCPGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FontCodedGraphicCharacterSetGlobalIdentifier#getCPGID <em>CPGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPGID</em>' attribute.
	 * @see #getCPGID()
	 * @generated
	 */
	void setCPGID(Integer value);

} // FontCodedGraphicCharacterSetGlobalIdentifier
