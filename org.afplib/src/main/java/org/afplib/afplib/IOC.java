/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.IOC#getXoaOset <em>Xoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IOC#getYoaOset <em>Yoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IOC#getXoaOrent <em>Xoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.IOC#getYoaOrent <em>Yoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.IOC#getConData1 <em>Con Data1</em>}</li>
 *   <li>{@link org.afplib.afplib.IOC#getXMap <em>XMap</em>}</li>
 *   <li>{@link org.afplib.afplib.IOC#getYMap <em>YMap</em>}</li>
 *   <li>{@link org.afplib.afplib.IOC#getConData2 <em>Con Data2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getIOC()
 * @model
 * @generated
 */
public interface IOC extends SF {
	/**
	 * Returns the value of the '<em><b>Xoa Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoa Oset</em>' attribute.
	 * @see #setXoaOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOC_XoaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOC#getXoaOset <em>Xoa Oset</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getIOC_YoaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOC#getYoaOset <em>Yoa Oset</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getIOC_XoaOrent()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoaOrent();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOC#getXoaOrent <em>Xoa Orent</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getIOC_YoaOrent()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoaOrent();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOC#getYoaOrent <em>Yoa Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoa Orent</em>' attribute.
	 * @see #getYoaOrent()
	 * @generated
	 */
	void setYoaOrent(Integer value);

	/**
	 * Returns the value of the '<em><b>Con Data1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Data1</em>' attribute.
	 * @see #setConData1(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getIOC_ConData1()
	 * @model required="true"
	 * @generated
	 */
	byte[] getConData1();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOC#getConData1 <em>Con Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Data1</em>' attribute.
	 * @see #getConData1()
	 * @generated
	 */
	void setConData1(byte[] value);

	/**
	 * Returns the value of the '<em><b>XMap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XMap</em>' attribute.
	 * @see #setXMap(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOC_XMap()
	 * @model required="true"
	 * @generated
	 */
	Integer getXMap();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOC#getXMap <em>XMap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMap</em>' attribute.
	 * @see #getXMap()
	 * @generated
	 */
	void setXMap(Integer value);

	/**
	 * Returns the value of the '<em><b>YMap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YMap</em>' attribute.
	 * @see #setYMap(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOC_YMap()
	 * @model required="true"
	 * @generated
	 */
	Integer getYMap();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOC#getYMap <em>YMap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMap</em>' attribute.
	 * @see #getYMap()
	 * @generated
	 */
	void setYMap(Integer value);

	/**
	 * Returns the value of the '<em><b>Con Data2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Data2</em>' attribute.
	 * @see #setConData2(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getIOC_ConData2()
	 * @model required="true"
	 * @generated
	 */
	byte[] getConData2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOC#getConData2 <em>Con Data2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Data2</em>' attribute.
	 * @see #getConData2()
	 * @generated
	 */
	void setConData2(byte[] value);

} // IOC
