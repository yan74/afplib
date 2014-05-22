/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Bi Level Image Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.SetBiLevelImageColor#getAREA <em>AREA</em>}</li>
 *   <li>{@link org.afplib.afplib.SetBiLevelImageColor#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.SetBiLevelImageColor#getNAMECOLR <em>NAMECOLR</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getSetBiLevelImageColor()
 * @model
 * @generated
 */
public interface SetBiLevelImageColor extends Triplet {
	/**
	 * Returns the value of the '<em><b>AREA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AREA</em>' attribute.
	 * @see #setAREA(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSetBiLevelImageColor_AREA()
	 * @model required="true"
	 * @generated
	 */
	Integer getAREA();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SetBiLevelImageColor#getAREA <em>AREA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AREA</em>' attribute.
	 * @see #getAREA()
	 * @generated
	 */
	void setAREA(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getSetBiLevelImageColor_Reserved()
	 * @model required="true"
	 * @generated
	 */
	byte[] getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SetBiLevelImageColor#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(byte[] value);

	/**
	 * Returns the value of the '<em><b>NAMECOLR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NAMECOLR</em>' attribute.
	 * @see #setNAMECOLR(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSetBiLevelImageColor_NAMECOLR()
	 * @model required="true"
	 * @generated
	 */
	Integer getNAMECOLR();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SetBiLevelImageColor#getNAMECOLR <em>NAMECOLR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NAMECOLR</em>' attribute.
	 * @see #getNAMECOLR()
	 * @generated
	 */
	void setNAMECOLR(Integer value);

} // SetBiLevelImageColor
