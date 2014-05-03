/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.IDD#getUNITBASE <em>UNITBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.IDD#getXRESOL <em>XRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.IDD#getYRESOL <em>YRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.IDD#getXSIZE <em>XSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.IDD#getYSIZE <em>YSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.IDD#getSDFS <em>SDFS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getIDD()
 * @model
 * @generated
 */
public interface IDD extends SF {
	/**
	 * Returns the value of the '<em><b>UNITBASE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UNITBASE</em>' attribute.
	 * @see #setUNITBASE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIDD_UNITBASE()
	 * @model required="true"
	 * @generated
	 */
	Integer getUNITBASE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IDD#getUNITBASE <em>UNITBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UNITBASE</em>' attribute.
	 * @see #getUNITBASE()
	 * @generated
	 */
	void setUNITBASE(Integer value);

	/**
	 * Returns the value of the '<em><b>XRESOL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XRESOL</em>' attribute.
	 * @see #setXRESOL(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIDD_XRESOL()
	 * @model required="true"
	 * @generated
	 */
	Integer getXRESOL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IDD#getXRESOL <em>XRESOL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRESOL</em>' attribute.
	 * @see #getXRESOL()
	 * @generated
	 */
	void setXRESOL(Integer value);

	/**
	 * Returns the value of the '<em><b>YRESOL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YRESOL</em>' attribute.
	 * @see #setYRESOL(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIDD_YRESOL()
	 * @model required="true"
	 * @generated
	 */
	Integer getYRESOL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IDD#getYRESOL <em>YRESOL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YRESOL</em>' attribute.
	 * @see #getYRESOL()
	 * @generated
	 */
	void setYRESOL(Integer value);

	/**
	 * Returns the value of the '<em><b>XSIZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XSIZE</em>' attribute.
	 * @see #setXSIZE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIDD_XSIZE()
	 * @model required="true"
	 * @generated
	 */
	Integer getXSIZE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IDD#getXSIZE <em>XSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XSIZE</em>' attribute.
	 * @see #getXSIZE()
	 * @generated
	 */
	void setXSIZE(Integer value);

	/**
	 * Returns the value of the '<em><b>YSIZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YSIZE</em>' attribute.
	 * @see #setYSIZE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIDD_YSIZE()
	 * @model required="true"
	 * @generated
	 */
	Integer getYSIZE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IDD#getYSIZE <em>YSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YSIZE</em>' attribute.
	 * @see #getYSIZE()
	 * @generated
	 */
	void setYSIZE(Integer value);

	/**
	 * Returns the value of the '<em><b>SDFS</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SDFS</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getIDD_SDFS()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getSDFS();

} // IDD
