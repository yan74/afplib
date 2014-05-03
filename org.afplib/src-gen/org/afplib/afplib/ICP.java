/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>IM Image Cell Position</b><br>Describes an image cell</p><p>ID: 13872251</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ICP#getXCOset <em>XC Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.ICP#getYCOset <em>YC Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.ICP#getXCSize <em>XC Size</em>}</li>
 *   <li>{@link org.afplib.afplib.ICP#getYCSize <em>YC Size</em>}</li>
 *   <li>{@link org.afplib.afplib.ICP#getXFilSize <em>XFil Size</em>}</li>
 *   <li>{@link org.afplib.afplib.ICP#getYFilSize <em>YFil Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getICP()
 * @model
 * @generated
 */
public interface ICP extends SF {
	/**
	 * Returns the value of the '<em><b>XC Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XC Oset</em>' attribute.
	 * @see #setXCOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getICP_XCOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXCOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ICP#getXCOset <em>XC Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XC Oset</em>' attribute.
	 * @see #getXCOset()
	 * @generated
	 */
	void setXCOset(Integer value);

	/**
	 * Returns the value of the '<em><b>YC Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YC Oset</em>' attribute.
	 * @see #setYCOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getICP_YCOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYCOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ICP#getYCOset <em>YC Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YC Oset</em>' attribute.
	 * @see #getYCOset()
	 * @generated
	 */
	void setYCOset(Integer value);

	/**
	 * Returns the value of the '<em><b>XC Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XC Size</em>' attribute.
	 * @see #setXCSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getICP_XCSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getXCSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ICP#getXCSize <em>XC Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XC Size</em>' attribute.
	 * @see #getXCSize()
	 * @generated
	 */
	void setXCSize(Integer value);

	/**
	 * Returns the value of the '<em><b>YC Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YC Size</em>' attribute.
	 * @see #setYCSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getICP_YCSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getYCSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ICP#getYCSize <em>YC Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YC Size</em>' attribute.
	 * @see #getYCSize()
	 * @generated
	 */
	void setYCSize(Integer value);

	/**
	 * Returns the value of the '<em><b>XFil Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XFil Size</em>' attribute.
	 * @see #setXFilSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getICP_XFilSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getXFilSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ICP#getXFilSize <em>XFil Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XFil Size</em>' attribute.
	 * @see #getXFilSize()
	 * @generated
	 */
	void setXFilSize(Integer value);

	/**
	 * Returns the value of the '<em><b>YFil Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YFil Size</em>' attribute.
	 * @see #setYFilSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getICP_YFilSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getYFilSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ICP#getYFilSize <em>YFil Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YFil Size</em>' attribute.
	 * @see #getYFilSize()
	 * @generated
	 */
	void setYFilSize(Integer value);

} // ICP
