/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Include Object</b><br>An Include Object structured field references an object on a page or overlay. It optionally contains parameters that identify the object and that specify presentation parameters such as object position, size, orientation, mapping, and default color. Where the presentation parameters conflict with parameters specified in the object's environment group (OEG), the parameters in the Include Object structured field override. If the referenced object is a page segment, the IOB parameters override the corresponding environment group parameters on all data objects in the page segment.</p><p>ID: 13873091</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.IOB#getObjName <em>Obj Name</em>}</li>
 *   <li>{@link org.afplib.afplib.IOB#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.IOB#getXoaOset <em>Xoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IOB#getYoaOset <em>Yoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IOB#getXoaOrent <em>Xoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.IOB#getYoaOrent <em>Yoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.IOB#getXocaOset <em>Xoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IOB#getYocaOset <em>Yoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IOB#getRefCSys <em>Ref CSys</em>}</li>
 *   <li>{@link org.afplib.afplib.IOB#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getIOB()
 * @model
 * @generated
 */
public interface IOB extends SF {
	/**
	 * Returns the value of the '<em><b>Obj Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Name</em>' attribute.
	 * @see #setObjName(String)
	 * @see org.afplib.afplib.AfplibPackage#getIOB_ObjName()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getObjName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOB#getObjName <em>Obj Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Name</em>' attribute.
	 * @see #getObjName()
	 * @generated
	 */
	void setObjName(String value);

	/**
	 * Returns the value of the '<em><b>Obj Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Type</em>' attribute.
	 * @see #setObjType(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOB_ObjType()
	 * @model required="true"
	 * @generated
	 */
	Integer getObjType();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOB#getObjType <em>Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Type</em>' attribute.
	 * @see #getObjType()
	 * @generated
	 */
	void setObjType(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoa Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoa Oset</em>' attribute.
	 * @see #setXoaOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOB_XoaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOB#getXoaOset <em>Xoa Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoa Oset</em>' attribute.
	 * @see #getXoaOset()
	 * @generated
	 */
	void setXoaOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoa Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoa Oset</em>' attribute.
	 * @see #setYoaOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOB_YoaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOB#getYoaOset <em>Yoa Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoa Oset</em>' attribute.
	 * @see #getYoaOset()
	 * @generated
	 */
	void setYoaOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoa Orent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoa Orent</em>' attribute.
	 * @see #setXoaOrent(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOB_XoaOrent()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoaOrent();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOB#getXoaOrent <em>Xoa Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoa Orent</em>' attribute.
	 * @see #getXoaOrent()
	 * @generated
	 */
	void setXoaOrent(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoa Orent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoa Orent</em>' attribute.
	 * @see #setYoaOrent(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOB_YoaOrent()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoaOrent();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOB#getYoaOrent <em>Yoa Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoa Orent</em>' attribute.
	 * @see #getYoaOrent()
	 * @generated
	 */
	void setYoaOrent(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoca Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoca Oset</em>' attribute.
	 * @see #setXocaOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOB_XocaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXocaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOB#getXocaOset <em>Xoca Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoca Oset</em>' attribute.
	 * @see #getXocaOset()
	 * @generated
	 */
	void setXocaOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoca Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoca Oset</em>' attribute.
	 * @see #setYocaOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOB_YocaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYocaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOB#getYocaOset <em>Yoca Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoca Oset</em>' attribute.
	 * @see #getYocaOset()
	 * @generated
	 */
	void setYocaOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Ref CSys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref CSys</em>' attribute.
	 * @see #setRefCSys(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOB_RefCSys()
	 * @model required="true"
	 * @generated
	 */
	Integer getRefCSys();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOB#getRefCSys <em>Ref CSys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref CSys</em>' attribute.
	 * @see #getRefCSys()
	 * @generated
	 */
	void setRefCSys(Integer value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getIOB_Triplets()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // IOB
