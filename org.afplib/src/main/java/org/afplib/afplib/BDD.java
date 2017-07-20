/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BDD#getUBASE <em>UBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getXUPUB <em>XUPUB</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getYUPUB <em>YUPUB</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getXEXTENT <em>XEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getYEXTENT <em>YEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getMOD <em>MOD</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getLID <em>LID</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getCOLOR <em>COLOR</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getMODULEWIDTH <em>MODULEWIDTH</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getELEMENTHEIGHT <em>ELEMENTHEIGHT</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getMULT <em>MULT</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getWENE <em>WENE</em>}</li>
 *   <li>{@link org.afplib.afplib.BDD#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBDD()
 * @model
 * @generated
 */
public interface BDD extends SF {
	/**
     * Returns the value of the '<em><b>UBASE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>UBASE</em>' attribute.
     * @see #setUBASE(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_UBASE()
     * @model required="true"
     * @generated
     */
	Integer getUBASE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getUBASE <em>UBASE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>UBASE</em>' attribute.
     * @see #getUBASE()
     * @generated
     */
	void setUBASE(Integer value);

	/**
     * Returns the value of the '<em><b>Reserved</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reserved</em>' attribute.
     * @see #setReserved(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_Reserved()
     * @model required="true"
     * @generated
     */
	Integer getReserved();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getReserved <em>Reserved</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reserved</em>' attribute.
     * @see #getReserved()
     * @generated
     */
	void setReserved(Integer value);

	/**
     * Returns the value of the '<em><b>XUPUB</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>XUPUB</em>' attribute.
     * @see #setXUPUB(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_XUPUB()
     * @model required="true"
     * @generated
     */
	Integer getXUPUB();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getXUPUB <em>XUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>XUPUB</em>' attribute.
     * @see #getXUPUB()
     * @generated
     */
	void setXUPUB(Integer value);

	/**
     * Returns the value of the '<em><b>YUPUB</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>YUPUB</em>' attribute.
     * @see #setYUPUB(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_YUPUB()
     * @model required="true"
     * @generated
     */
	Integer getYUPUB();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getYUPUB <em>YUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>YUPUB</em>' attribute.
     * @see #getYUPUB()
     * @generated
     */
	void setYUPUB(Integer value);

	/**
     * Returns the value of the '<em><b>XEXTENT</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>XEXTENT</em>' attribute.
     * @see #setXEXTENT(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_XEXTENT()
     * @model required="true"
     * @generated
     */
	Integer getXEXTENT();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getXEXTENT <em>XEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>XEXTENT</em>' attribute.
     * @see #getXEXTENT()
     * @generated
     */
	void setXEXTENT(Integer value);

	/**
     * Returns the value of the '<em><b>YEXTENT</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>YEXTENT</em>' attribute.
     * @see #setYEXTENT(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_YEXTENT()
     * @model required="true"
     * @generated
     */
	Integer getYEXTENT();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getYEXTENT <em>YEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>YEXTENT</em>' attribute.
     * @see #getYEXTENT()
     * @generated
     */
	void setYEXTENT(Integer value);

	/**
     * Returns the value of the '<em><b>Reserved2</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reserved2</em>' attribute.
     * @see #setReserved2(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_Reserved2()
     * @model required="true"
     * @generated
     */
	Integer getReserved2();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getReserved2 <em>Reserved2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reserved2</em>' attribute.
     * @see #getReserved2()
     * @generated
     */
	void setReserved2(Integer value);

	/**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see #setTYPE(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_TYPE()
     * @model required="true"
     * @generated
     */
	Integer getTYPE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see #getTYPE()
     * @generated
     */
	void setTYPE(Integer value);

	/**
     * Returns the value of the '<em><b>MOD</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>MOD</em>' attribute.
     * @see #setMOD(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_MOD()
     * @model required="true"
     * @generated
     */
	Integer getMOD();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getMOD <em>MOD</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>MOD</em>' attribute.
     * @see #getMOD()
     * @generated
     */
	void setMOD(Integer value);

	/**
     * Returns the value of the '<em><b>LID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>LID</em>' attribute.
     * @see #setLID(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_LID()
     * @model required="true"
     * @generated
     */
	Integer getLID();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getLID <em>LID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>LID</em>' attribute.
     * @see #getLID()
     * @generated
     */
	void setLID(Integer value);

	/**
     * Returns the value of the '<em><b>COLOR</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>COLOR</em>' attribute.
     * @see #setCOLOR(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_COLOR()
     * @model required="true"
     * @generated
     */
	Integer getCOLOR();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getCOLOR <em>COLOR</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLOR</em>' attribute.
     * @see #getCOLOR()
     * @generated
     */
	void setCOLOR(Integer value);

	/**
     * Returns the value of the '<em><b>MODULEWIDTH</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>MODULEWIDTH</em>' attribute.
     * @see #setMODULEWIDTH(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_MODULEWIDTH()
     * @model required="true"
     * @generated
     */
	Integer getMODULEWIDTH();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getMODULEWIDTH <em>MODULEWIDTH</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>MODULEWIDTH</em>' attribute.
     * @see #getMODULEWIDTH()
     * @generated
     */
	void setMODULEWIDTH(Integer value);

	/**
     * Returns the value of the '<em><b>ELEMENTHEIGHT</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>ELEMENTHEIGHT</em>' attribute.
     * @see #setELEMENTHEIGHT(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_ELEMENTHEIGHT()
     * @model required="true"
     * @generated
     */
	Integer getELEMENTHEIGHT();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getELEMENTHEIGHT <em>ELEMENTHEIGHT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>ELEMENTHEIGHT</em>' attribute.
     * @see #getELEMENTHEIGHT()
     * @generated
     */
	void setELEMENTHEIGHT(Integer value);

	/**
     * Returns the value of the '<em><b>MULT</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>MULT</em>' attribute.
     * @see #setMULT(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_MULT()
     * @model required="true"
     * @generated
     */
	Integer getMULT();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getMULT <em>MULT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>MULT</em>' attribute.
     * @see #getMULT()
     * @generated
     */
	void setMULT(Integer value);

	/**
     * Returns the value of the '<em><b>WENE</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>WENE</em>' attribute.
     * @see #setWENE(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDD_WENE()
     * @model required="true"
     * @generated
     */
	Integer getWENE();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDD#getWENE <em>WENE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>WENE</em>' attribute.
     * @see #getWENE()
     * @generated
     */
	void setWENE(Integer value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getBDD_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // BDD
