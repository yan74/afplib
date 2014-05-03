/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Rotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.CharacterRotation#getCharRot <em>Char Rot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getCharacterRotation()
 * @model
 * @generated
 */
public interface CharacterRotation extends Triplet {
	/**
	 * Returns the value of the '<em><b>Char Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Char Rot</em>' attribute.
	 * @see #setCharRot(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCharacterRotation_CharRot()
	 * @model required="true"
	 * @generated
	 */
	Integer getCharRot();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CharacterRotation#getCharRot <em>Char Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Rot</em>' attribute.
	 * @see #getCharRot()
	 * @generated
	 */
	void setCharRot(Integer value);

} // CharacterRotation
