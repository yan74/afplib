/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTD1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.PTD1#getXPBASE <em>XPBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD1#getYPBASE <em>YPBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD1#getXPUNITVL <em>XPUNITVL</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD1#getYPUNITVL <em>YPUNITVL</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD1#getXPEXTENT <em>XPEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD1#getYPEXTENT <em>YPEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD1#getRESERVED <em>RESERVED</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getPTD1()
 * @model
 * @generated
 */
public interface PTD1 extends SF {
	/**
	 * Returns the value of the '<em><b>XPBASE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPBASE</em>' attribute.
	 * @see #setXPBASE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPTD1_XPBASE()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPBASE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD1#getXPBASE <em>XPBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPBASE</em>' attribute.
	 * @see #getXPBASE()
	 * @generated
	 */
	void setXPBASE(Integer value);

	/**
	 * Returns the value of the '<em><b>YPBASE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YPBASE</em>' attribute.
	 * @see #setYPBASE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPTD1_YPBASE()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPBASE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD1#getYPBASE <em>YPBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPBASE</em>' attribute.
	 * @see #getYPBASE()
	 * @generated
	 */
	void setYPBASE(Integer value);

	/**
	 * Returns the value of the '<em><b>XPUNITVL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPUNITVL</em>' attribute.
	 * @see #setXPUNITVL(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPTD1_XPUNITVL()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPUNITVL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD1#getXPUNITVL <em>XPUNITVL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPUNITVL</em>' attribute.
	 * @see #getXPUNITVL()
	 * @generated
	 */
	void setXPUNITVL(Integer value);

	/**
	 * Returns the value of the '<em><b>YPUNITVL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YPUNITVL</em>' attribute.
	 * @see #setYPUNITVL(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPTD1_YPUNITVL()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPUNITVL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD1#getYPUNITVL <em>YPUNITVL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPUNITVL</em>' attribute.
	 * @see #getYPUNITVL()
	 * @generated
	 */
	void setYPUNITVL(Integer value);

	/**
	 * Returns the value of the '<em><b>XPEXTENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPEXTENT</em>' attribute.
	 * @see #setXPEXTENT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPTD1_XPEXTENT()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPEXTENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD1#getXPEXTENT <em>XPEXTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPEXTENT</em>' attribute.
	 * @see #getXPEXTENT()
	 * @generated
	 */
	void setXPEXTENT(Integer value);

	/**
	 * Returns the value of the '<em><b>YPEXTENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YPEXTENT</em>' attribute.
	 * @see #setYPEXTENT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPTD1_YPEXTENT()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPEXTENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD1#getYPEXTENT <em>YPEXTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPEXTENT</em>' attribute.
	 * @see #getYPEXTENT()
	 * @generated
	 */
	void setYPEXTENT(Integer value);

	/**
	 * Returns the value of the '<em><b>RESERVED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RESERVED</em>' attribute.
	 * @see #setRESERVED(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPTD1_RESERVED()
	 * @model
	 * @generated
	 */
	Integer getRESERVED();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD1#getRESERVED <em>RESERVED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RESERVED</em>' attribute.
	 * @see #getRESERVED()
	 * @generated
	 */
	void setRESERVED(Integer value);

} // PTD1
