/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Bar Code Data</b><br>The BDA structured field contains parameters to position a single bar code symbol within a bar code presentation space, parameters to specify special functions for 2D bar codes, flags to specify attributes specific to the symbol, and the data to be encoded. The data is encoded according to the parameters specified in the Bar Code Data Descriptor (BDD) structured field.</p><p>ID: 13889259</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BDA#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.BDA#getXoffset <em>Xoffset</em>}</li>
 *   <li>{@link org.afplib.afplib.BDA#getYoffset <em>Yoffset</em>}</li>
 *   <li>{@link org.afplib.afplib.BDA#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBDA()
 * @model
 * @generated
 */
public interface BDA extends SF {
	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBDA_Flags()
	 * @model required="true"
	 * @generated
	 */
	Integer getFlags();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BDA#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoffset</em>' attribute.
	 * @see #setXoffset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBDA_Xoffset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoffset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BDA#getXoffset <em>Xoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoffset</em>' attribute.
	 * @see #getXoffset()
	 * @generated
	 */
	void setXoffset(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoffset</em>' attribute.
	 * @see #setYoffset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBDA_Yoffset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoffset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BDA#getYoffset <em>Yoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoffset</em>' attribute.
	 * @see #getYoffset()
	 * @generated
	 */
	void setYoffset(Integer value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getBDA_Data()
	 * @model required="true"
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BDA#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

} // BDA
