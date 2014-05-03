/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>IM Image Input Descriptor (Obsolete)</b><br>Defines an image.</p><p>ID: 13870715</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.IID#getConData1 <em>Con Data1</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getXBase <em>XBase</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getYBase <em>YBase</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getXUnits <em>XUnits</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getYUnits <em>YUnits</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getXSize <em>XSize</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getYSize <em>YSize</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getConData2 <em>Con Data2</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getXCSizeD <em>XC Size D</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getYCSizeD <em>YC Size D</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getConData3 <em>Con Data3</em>}</li>
 *   <li>{@link org.afplib.afplib.IID#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getIID()
 * @model
 * @generated
 */
public interface IID extends SF {
	/**
	 * Returns the value of the '<em><b>Con Data1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Data1</em>' attribute.
	 * @see #setConData1(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getIID_ConData1()
	 * @model required="true"
	 * @generated
	 */
	byte[] getConData1();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getConData1 <em>Con Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Data1</em>' attribute.
	 * @see #getConData1()
	 * @generated
	 */
	void setConData1(byte[] value);

	/**
	 * Returns the value of the '<em><b>XBase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XBase</em>' attribute.
	 * @see #setXBase(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIID_XBase()
	 * @model required="true"
	 * @generated
	 */
	Integer getXBase();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getXBase <em>XBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XBase</em>' attribute.
	 * @see #getXBase()
	 * @generated
	 */
	void setXBase(Integer value);

	/**
	 * Returns the value of the '<em><b>YBase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YBase</em>' attribute.
	 * @see #setYBase(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIID_YBase()
	 * @model required="true"
	 * @generated
	 */
	Integer getYBase();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getYBase <em>YBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YBase</em>' attribute.
	 * @see #getYBase()
	 * @generated
	 */
	void setYBase(Integer value);

	/**
	 * Returns the value of the '<em><b>XUnits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XUnits</em>' attribute.
	 * @see #setXUnits(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIID_XUnits()
	 * @model required="true"
	 * @generated
	 */
	Integer getXUnits();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getXUnits <em>XUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XUnits</em>' attribute.
	 * @see #getXUnits()
	 * @generated
	 */
	void setXUnits(Integer value);

	/**
	 * Returns the value of the '<em><b>YUnits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YUnits</em>' attribute.
	 * @see #setYUnits(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIID_YUnits()
	 * @model required="true"
	 * @generated
	 */
	Integer getYUnits();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getYUnits <em>YUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YUnits</em>' attribute.
	 * @see #getYUnits()
	 * @generated
	 */
	void setYUnits(Integer value);

	/**
	 * Returns the value of the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XSize</em>' attribute.
	 * @see #setXSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIID_XSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getXSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getXSize <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XSize</em>' attribute.
	 * @see #getXSize()
	 * @generated
	 */
	void setXSize(Integer value);

	/**
	 * Returns the value of the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YSize</em>' attribute.
	 * @see #setYSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIID_YSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getYSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getYSize <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YSize</em>' attribute.
	 * @see #getYSize()
	 * @generated
	 */
	void setYSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Con Data2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Data2</em>' attribute.
	 * @see #setConData2(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getIID_ConData2()
	 * @model required="true"
	 * @generated
	 */
	byte[] getConData2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getConData2 <em>Con Data2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Data2</em>' attribute.
	 * @see #getConData2()
	 * @generated
	 */
	void setConData2(byte[] value);

	/**
	 * Returns the value of the '<em><b>XC Size D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XC Size D</em>' attribute.
	 * @see #setXCSizeD(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIID_XCSizeD()
	 * @model required="true"
	 * @generated
	 */
	Integer getXCSizeD();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getXCSizeD <em>XC Size D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XC Size D</em>' attribute.
	 * @see #getXCSizeD()
	 * @generated
	 */
	void setXCSizeD(Integer value);

	/**
	 * Returns the value of the '<em><b>YC Size D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YC Size D</em>' attribute.
	 * @see #setYCSizeD(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIID_YCSizeD()
	 * @model required="true"
	 * @generated
	 */
	Integer getYCSizeD();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getYCSizeD <em>YC Size D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YC Size D</em>' attribute.
	 * @see #getYCSizeD()
	 * @generated
	 */
	void setYCSizeD(Integer value);

	/**
	 * Returns the value of the '<em><b>Con Data3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Data3</em>' attribute.
	 * @see #setConData3(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getIID_ConData3()
	 * @model required="true"
	 * @generated
	 */
	byte[] getConData3();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getConData3 <em>Con Data3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Data3</em>' attribute.
	 * @see #getConData3()
	 * @generated
	 */
	void setConData3(byte[] value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIID_Color()
	 * @model required="true"
	 * @generated
	 */
	Integer getColor();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IID#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Integer value);

} // IID
