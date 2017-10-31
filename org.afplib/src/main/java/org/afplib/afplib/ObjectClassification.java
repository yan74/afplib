/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectClassification#getObjClass <em>Obj Class</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectClassification#getStrucFlgs <em>Struc Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectClassification#getRegObjId <em>Reg Obj Id</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectClassification#getObjTpName <em>Obj Tp Name</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectClassification#getObjLev <em>Obj Lev</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectClassification#getCompName <em>Comp Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectClassification()
 * @model
 * @generated
 */
public interface ObjectClassification extends Triplet {
	/**
	 * Returns the value of the '<em><b>Obj Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Class</em>' attribute.
	 * @see #setObjClass(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectClassification_ObjClass()
	 * @model required="true"
	 * @generated
	 */
	Integer getObjClass();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectClassification#getObjClass <em>Obj Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Class</em>' attribute.
	 * @see #getObjClass()
	 * @generated
	 */
	void setObjClass(Integer value);

	/**
	 * Returns the value of the '<em><b>Struc Flgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Struc Flgs</em>' attribute.
	 * @see #setStrucFlgs(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectClassification_StrucFlgs()
	 * @model required="true"
	 * @generated
	 */
	Integer getStrucFlgs();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectClassification#getStrucFlgs <em>Struc Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struc Flgs</em>' attribute.
	 * @see #getStrucFlgs()
	 * @generated
	 */
	void setStrucFlgs(Integer value);

	/**
	 * Returns the value of the '<em><b>Reg Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reg Obj Id</em>' attribute.
	 * @see #setRegObjId(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getObjectClassification_RegObjId()
	 * @model required="true"
	 * @generated
	 */
	byte[] getRegObjId();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectClassification#getRegObjId <em>Reg Obj Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Obj Id</em>' attribute.
	 * @see #getRegObjId()
	 * @generated
	 */
	void setRegObjId(byte[] value);

	/**
	 * Returns the value of the '<em><b>Obj Tp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Tp Name</em>' attribute.
	 * @see #setObjTpName(String)
	 * @see org.afplib.afplib.AfplibPackage#getObjectClassification_ObjTpName()
	 * @model dataType="org.afplib.base.ModcaString32"
	 * @generated
	 */
	String getObjTpName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectClassification#getObjTpName <em>Obj Tp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Tp Name</em>' attribute.
	 * @see #getObjTpName()
	 * @generated
	 */
	void setObjTpName(String value);

	/**
	 * Returns the value of the '<em><b>Obj Lev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Lev</em>' attribute.
	 * @see #setObjLev(String)
	 * @see org.afplib.afplib.AfplibPackage#getObjectClassification_ObjLev()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getObjLev();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectClassification#getObjLev <em>Obj Lev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Lev</em>' attribute.
	 * @see #getObjLev()
	 * @generated
	 */
	void setObjLev(String value);

	/**
	 * Returns the value of the '<em><b>Comp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comp Name</em>' attribute.
	 * @see #setCompName(String)
	 * @see org.afplib.afplib.AfplibPackage#getObjectClassification_CompName()
	 * @model dataType="org.afplib.base.ModcaString32"
	 * @generated
	 */
	String getCompName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectClassification#getCompName <em>Comp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Name</em>' attribute.
	 * @see #getCompName()
	 * @generated
	 */
	void setCompName(String value);

} // ObjectClassification
