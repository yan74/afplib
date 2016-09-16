/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PPORG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.PPORG#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.PPORG#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.PPORG#getProcFlgs <em>Proc Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.PPORG#getXocaOset <em>Xoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.PPORG#getYocaOset <em>Yoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.PPORG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getPPORG()
 * @model
 * @generated
 */
public interface PPORG extends Triplet {
	/**
	 * Returns the value of the '<em><b>RG Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG Length</em>' attribute.
	 * @see #setRGLength(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPPORG_RGLength()
	 * @model required="true"
	 * @generated
	 */
	Integer getRGLength();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PPORG#getRGLength <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RG Length</em>' attribute.
	 * @see #getRGLength()
	 * @generated
	 */
	void setRGLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Obj Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj Type</em>' attribute.
	 * @see #setObjType(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPPORG_ObjType()
	 * @model required="true"
	 * @generated
	 */
	Integer getObjType();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PPORG#getObjType <em>Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Type</em>' attribute.
	 * @see #getObjType()
	 * @generated
	 */
	void setObjType(Integer value);

	/**
	 * Returns the value of the '<em><b>Proc Flgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proc Flgs</em>' attribute.
	 * @see #setProcFlgs(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPPORG_ProcFlgs()
	 * @model required="true"
	 * @generated
	 */
	Integer getProcFlgs();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PPORG#getProcFlgs <em>Proc Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proc Flgs</em>' attribute.
	 * @see #getProcFlgs()
	 * @generated
	 */
	void setProcFlgs(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoca Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoca Oset</em>' attribute.
	 * @see #setXocaOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPPORG_XocaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXocaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PPORG#getXocaOset <em>Xoca Oset</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getPPORG_YocaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYocaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PPORG#getYocaOset <em>Yoca Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoca Oset</em>' attribute.
	 * @see #getYocaOset()
	 * @generated
	 */
	void setYocaOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getPPORG_Triplets()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // PPORG
