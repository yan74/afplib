/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectOffset#getObjTpe <em>Obj Tpe</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectOffset#getObjOset <em>Obj Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectOffset#getObjOstHi <em>Obj Ost Hi</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectOffset()
 * @model
 * @generated
 */
public interface ObjectOffset extends Triplet {
	/**
	 * Returns the value of the '<em><b>Obj Tpe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Tpe</em>' attribute.
	 * @see #setObjTpe(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectOffset_ObjTpe()
	 * @model required="true"
	 * @generated
	 */
	Integer getObjTpe();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectOffset#getObjTpe <em>Obj Tpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Tpe</em>' attribute.
	 * @see #getObjTpe()
	 * @generated
	 */
	void setObjTpe(Integer value);

	/**
	 * Returns the value of the '<em><b>Obj Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Oset</em>' attribute.
	 * @see #setObjOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectOffset_ObjOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getObjOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectOffset#getObjOset <em>Obj Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Oset</em>' attribute.
	 * @see #getObjOset()
	 * @generated
	 */
	void setObjOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Obj Ost Hi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Ost Hi</em>' attribute.
	 * @see #setObjOstHi(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectOffset_ObjOstHi()
	 * @model
	 * @generated
	 */
	Integer getObjOstHi();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectOffset#getObjOstHi <em>Obj Ost Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Ost Hi</em>' attribute.
	 * @see #getObjOstHi()
	 * @generated
	 */
	void setObjOstHi(Integer value);

} // ObjectOffset
