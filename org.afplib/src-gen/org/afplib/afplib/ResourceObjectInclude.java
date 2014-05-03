/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Object Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ResourceObjectInclude#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.ResourceObjectInclude#getObjName <em>Obj Name</em>}</li>
 *   <li>{@link org.afplib.afplib.ResourceObjectInclude#getXobjOset <em>Xobj Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.ResourceObjectInclude#getYobjOset <em>Yobj Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.ResourceObjectInclude#getObOrent <em>Ob Orent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getResourceObjectInclude()
 * @model
 * @generated
 */
public interface ResourceObjectInclude extends Triplet {
	/**
	 * Returns the value of the '<em><b>Obj Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Type</em>' attribute.
	 * @see #setObjType(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getResourceObjectInclude_ObjType()
	 * @model required="true"
	 * @generated
	 */
	Integer getObjType();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ResourceObjectInclude#getObjType <em>Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Type</em>' attribute.
	 * @see #getObjType()
	 * @generated
	 */
	void setObjType(Integer value);

	/**
	 * Returns the value of the '<em><b>Obj Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Name</em>' attribute.
	 * @see #setObjName(String)
	 * @see org.afplib.afplib.AfplibPackage#getResourceObjectInclude_ObjName()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getObjName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ResourceObjectInclude#getObjName <em>Obj Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Name</em>' attribute.
	 * @see #getObjName()
	 * @generated
	 */
	void setObjName(String value);

	/**
	 * Returns the value of the '<em><b>Xobj Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xobj Oset</em>' attribute.
	 * @see #setXobjOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getResourceObjectInclude_XobjOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXobjOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ResourceObjectInclude#getXobjOset <em>Xobj Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xobj Oset</em>' attribute.
	 * @see #getXobjOset()
	 * @generated
	 */
	void setXobjOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Yobj Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yobj Oset</em>' attribute.
	 * @see #setYobjOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getResourceObjectInclude_YobjOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYobjOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ResourceObjectInclude#getYobjOset <em>Yobj Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yobj Oset</em>' attribute.
	 * @see #getYobjOset()
	 * @generated
	 */
	void setYobjOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Ob Orent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ob Orent</em>' attribute.
	 * @see #setObOrent(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getResourceObjectInclude_ObOrent()
	 * @model
	 * @generated
	 */
	Integer getObOrent();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ResourceObjectInclude#getObOrent <em>Ob Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ob Orent</em>' attribute.
	 * @see #getObOrent()
	 * @generated
	 */
	void setObOrent(Integer value);

} // ResourceObjectInclude
