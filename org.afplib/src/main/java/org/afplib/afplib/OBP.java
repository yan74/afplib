/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OBP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.OBP#getOAPosID <em>OA Pos ID</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getXoaOset <em>Xoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getYoaOset <em>Yoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getXoaOrent <em>Xoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getYoaOrent <em>Yoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getXocaOset <em>Xoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getYocaOset <em>Yoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getXocaOrent <em>Xoca Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getYocaOrent <em>Yoca Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.OBP#getRefCSys <em>Ref CSys</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getOBP()
 * @model
 * @generated
 */
public interface OBP extends SF {
	/**
	 * Returns the value of the '<em><b>OA Pos ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OA Pos ID</em>' attribute.
	 * @see #setOAPosID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getOBP_OAPosID()
	 * @model required="true"
	 * @generated
	 */
	Integer getOAPosID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getOAPosID <em>OA Pos ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OA Pos ID</em>' attribute.
	 * @see #getOAPosID()
	 * @generated
	 */
	void setOAPosID(Integer value);

	/**
	 * Returns the value of the '<em><b>RG Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG Length</em>' attribute.
	 * @see #setRGLength(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getOBP_RGLength()
	 * @model required="true"
	 * @generated
	 */
	Integer getRGLength();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getRGLength <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RG Length</em>' attribute.
	 * @see #getRGLength()
	 * @generated
	 */
	void setRGLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoa Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoa Oset</em>' attribute.
	 * @see #setXoaOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getOBP_XoaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getXoaOset <em>Xoa Oset</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getOBP_YoaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getYoaOset <em>Yoa Oset</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getOBP_XoaOrent()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoaOrent();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getXoaOrent <em>Xoa Orent</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getOBP_YoaOrent()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoaOrent();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getYoaOrent <em>Yoa Orent</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getOBP_XocaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXocaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getXocaOset <em>Xoca Oset</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getOBP_YocaOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYocaOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getYocaOset <em>Yoca Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoca Oset</em>' attribute.
	 * @see #getYocaOset()
	 * @generated
	 */
	void setYocaOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoca Orent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoca Orent</em>' attribute.
	 * @see #setXocaOrent(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getOBP_XocaOrent()
	 * @model required="true"
	 * @generated
	 */
	Integer getXocaOrent();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getXocaOrent <em>Xoca Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoca Orent</em>' attribute.
	 * @see #getXocaOrent()
	 * @generated
	 */
	void setXocaOrent(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoca Orent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoca Orent</em>' attribute.
	 * @see #setYocaOrent(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getOBP_YocaOrent()
	 * @model required="true"
	 * @generated
	 */
	Integer getYocaOrent();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getYocaOrent <em>Yoca Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoca Orent</em>' attribute.
	 * @see #getYocaOrent()
	 * @generated
	 */
	void setYocaOrent(Integer value);

	/**
	 * Returns the value of the '<em><b>Ref CSys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref CSys</em>' attribute.
	 * @see #setRefCSys(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getOBP_RefCSys()
	 * @model required="true"
	 * @generated
	 */
	Integer getRefCSys();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OBP#getRefCSys <em>Ref CSys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref CSys</em>' attribute.
	 * @see #getRefCSys()
	 * @generated
	 */
	void setRefCSys(Integer value);

} // OBP
