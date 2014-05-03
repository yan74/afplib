/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Resource Object Type</b><br>Definiert den Resource-Typ der in diesem BRS enthalten ist.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ResourceObjectType#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.ResourceObjectType#getConData <em>Con Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getResourceObjectType()
 * @model
 * @generated
 */
public interface ResourceObjectType extends Triplet {
	/**
	 * Returns the value of the '<em><b>Obj Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Type</em>' attribute.
	 * @see #setObjType(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getResourceObjectType_ObjType()
	 * @model required="true"
	 * @generated
	 */
	Integer getObjType();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ResourceObjectType#getObjType <em>Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Type</em>' attribute.
	 * @see #getObjType()
	 * @generated
	 */
	void setObjType(Integer value);

	/**
	 * Returns the value of the '<em><b>Con Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Data</em>' attribute.
	 * @see #setConData(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getResourceObjectType_ConData()
	 * @model required="true"
	 * @generated
	 */
	byte[] getConData();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ResourceObjectType#getConData <em>Con Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Data</em>' attribute.
	 * @see #getConData()
	 * @generated
	 */
	void setConData(byte[] value);

} // ResourceObjectType
