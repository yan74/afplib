/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRC Resource Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.CRCResourceManagement#getFmtQual <em>Fmt Qual</em>}</li>
 *   <li>{@link org.afplib.afplib.CRCResourceManagement#getRMValue <em>RM Value</em>}</li>
 *   <li>{@link org.afplib.afplib.CRCResourceManagement#getResClassFlg <em>Res Class Flg</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getCRCResourceManagement()
 * @model
 * @generated
 */
public interface CRCResourceManagement extends Triplet {
	/**
	 * Returns the value of the '<em><b>Fmt Qual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fmt Qual</em>' attribute.
	 * @see #setFmtQual(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCRCResourceManagement_FmtQual()
	 * @model required="true"
	 * @generated
	 */
	Integer getFmtQual();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CRCResourceManagement#getFmtQual <em>Fmt Qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmt Qual</em>' attribute.
	 * @see #getFmtQual()
	 * @generated
	 */
	void setFmtQual(Integer value);

	/**
	 * Returns the value of the '<em><b>RM Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RM Value</em>' attribute.
	 * @see #setRMValue(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCRCResourceManagement_RMValue()
	 * @model required="true"
	 * @generated
	 */
	Integer getRMValue();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CRCResourceManagement#getRMValue <em>RM Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RM Value</em>' attribute.
	 * @see #getRMValue()
	 * @generated
	 */
	void setRMValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Res Class Flg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Res Class Flg</em>' attribute.
	 * @see #setResClassFlg(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCRCResourceManagement_ResClassFlg()
	 * @model required="true"
	 * @generated
	 */
	Integer getResClassFlg();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CRCResourceManagement#getResClassFlg <em>Res Class Flg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Class Flg</em>' attribute.
	 * @see #getResClassFlg()
	 * @generated
	 */
	void setResClassFlg(Integer value);

} // CRCResourceManagement
