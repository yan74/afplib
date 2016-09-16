/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Byte Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectByteExtent#getByteExt <em>Byte Ext</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectByteExtent#getByteExtHi <em>Byte Ext Hi</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectByteExtent()
 * @model
 * @generated
 */
public interface ObjectByteExtent extends Triplet {
	/**
	 * Returns the value of the '<em><b>Byte Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Byte Ext</em>' attribute.
	 * @see #setByteExt(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectByteExtent_ByteExt()
	 * @model required="true"
	 * @generated
	 */
	Integer getByteExt();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectByteExtent#getByteExt <em>Byte Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Ext</em>' attribute.
	 * @see #getByteExt()
	 * @generated
	 */
	void setByteExt(Integer value);

	/**
	 * Returns the value of the '<em><b>Byte Ext Hi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Byte Ext Hi</em>' attribute.
	 * @see #setByteExtHi(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectByteExtent_ByteExtHi()
	 * @model
	 * @generated
	 */
	Integer getByteExtHi();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectByteExtent#getByteExtHi <em>Byte Ext Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Ext Hi</em>' attribute.
	 * @see #getByteExtHi()
	 * @generated
	 */
	void setByteExtHi(Integer value);

} // ObjectByteExtent
