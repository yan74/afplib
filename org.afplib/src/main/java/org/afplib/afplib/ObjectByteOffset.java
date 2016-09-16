/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Byte Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectByteOffset#getDirByOff <em>Dir By Off</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectByteOffset#getDirByHi <em>Dir By Hi</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectByteOffset()
 * @model
 * @generated
 */
public interface ObjectByteOffset extends Triplet {
	/**
	 * Returns the value of the '<em><b>Dir By Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dir By Off</em>' attribute.
	 * @see #setDirByOff(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectByteOffset_DirByOff()
	 * @model required="true"
	 * @generated
	 */
	Integer getDirByOff();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectByteOffset#getDirByOff <em>Dir By Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir By Off</em>' attribute.
	 * @see #getDirByOff()
	 * @generated
	 */
	void setDirByOff(Integer value);

	/**
	 * Returns the value of the '<em><b>Dir By Hi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dir By Hi</em>' attribute.
	 * @see #setDirByHi(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectByteOffset_DirByHi()
	 * @model
	 * @generated
	 */
	Integer getDirByHi();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectByteOffset#getDirByHi <em>Dir By Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir By Hi</em>' attribute.
	 * @see #getDirByHi()
	 * @generated
	 */
	void setDirByHi(Integer value);

} // ObjectByteOffset
