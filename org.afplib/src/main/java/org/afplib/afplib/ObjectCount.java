/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectCount#getSubObj <em>Sub Obj</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectCount#getSObjNum <em>SObj Num</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectCount#getSobjNmHi <em>Sobj Nm Hi</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectCount()
 * @model
 * @generated
 */
public interface ObjectCount extends Triplet {
	/**
	 * Returns the value of the '<em><b>Sub Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Obj</em>' attribute.
	 * @see #setSubObj(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectCount_SubObj()
	 * @model required="true"
	 * @generated
	 */
	Integer getSubObj();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectCount#getSubObj <em>Sub Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Obj</em>' attribute.
	 * @see #getSubObj()
	 * @generated
	 */
	void setSubObj(Integer value);

	/**
	 * Returns the value of the '<em><b>SObj Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SObj Num</em>' attribute.
	 * @see #setSObjNum(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectCount_SObjNum()
	 * @model required="true"
	 * @generated
	 */
	Integer getSObjNum();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectCount#getSObjNum <em>SObj Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SObj Num</em>' attribute.
	 * @see #getSObjNum()
	 * @generated
	 */
	void setSObjNum(Integer value);

	/**
	 * Returns the value of the '<em><b>Sobj Nm Hi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sobj Nm Hi</em>' attribute.
	 * @see #setSobjNmHi(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectCount_SobjNmHi()
	 * @model
	 * @generated
	 */
	Integer getSobjNmHi();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectCount#getSobjNmHi <em>Sobj Nm Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sobj Nm Hi</em>' attribute.
	 * @see #getSobjNmHi()
	 * @generated
	 */
	void setSobjNmHi(Integer value);

} // ObjectCount
