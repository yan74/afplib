/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PGPRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.PGPRG#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.PGPRG#getXmOset <em>Xm Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.PGPRG#getYmOset <em>Ym Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.PGPRG#getPGorient <em>PGorient</em>}</li>
 *   <li>{@link org.afplib.afplib.PGPRG#getSHside <em>SHside</em>}</li>
 *   <li>{@link org.afplib.afplib.PGPRG#getPgFlgs <em>Pg Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.PGPRG#getPMCid <em>PM Cid</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getPGPRG()
 * @model
 * @generated
 */
public interface PGPRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>RG Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG Length</em>' attribute.
	 * @see #setRGLength(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGPRG_RGLength()
	 * @model required="true"
	 * @generated
	 */
	Integer getRGLength();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGPRG#getRGLength <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RG Length</em>' attribute.
	 * @see #getRGLength()
	 * @generated
	 */
	void setRGLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Xm Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xm Oset</em>' attribute.
	 * @see #setXmOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGPRG_XmOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXmOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGPRG#getXmOset <em>Xm Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xm Oset</em>' attribute.
	 * @see #getXmOset()
	 * @generated
	 */
	void setXmOset(Integer value);

	/**
	 * Returns the value of the '<em><b>Ym Oset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ym Oset</em>' attribute.
	 * @see #setYmOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGPRG_YmOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYmOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGPRG#getYmOset <em>Ym Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ym Oset</em>' attribute.
	 * @see #getYmOset()
	 * @generated
	 */
	void setYmOset(Integer value);

	/**
	 * Returns the value of the '<em><b>PGorient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PGorient</em>' attribute.
	 * @see #setPGorient(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGPRG_PGorient()
	 * @model required="true"
	 * @generated
	 */
	Integer getPGorient();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGPRG#getPGorient <em>PGorient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGorient</em>' attribute.
	 * @see #getPGorient()
	 * @generated
	 */
	void setPGorient(Integer value);

	/**
	 * Returns the value of the '<em><b>SHside</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SHside</em>' attribute.
	 * @see #setSHside(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGPRG_SHside()
	 * @model required="true"
	 * @generated
	 */
	Integer getSHside();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGPRG#getSHside <em>SHside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SHside</em>' attribute.
	 * @see #getSHside()
	 * @generated
	 */
	void setSHside(Integer value);

	/**
	 * Returns the value of the '<em><b>Pg Flgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pg Flgs</em>' attribute.
	 * @see #setPgFlgs(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGPRG_PgFlgs()
	 * @model
	 * @generated
	 */
	Integer getPgFlgs();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGPRG#getPgFlgs <em>Pg Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg Flgs</em>' attribute.
	 * @see #getPgFlgs()
	 * @generated
	 */
	void setPgFlgs(Integer value);

	/**
	 * Returns the value of the '<em><b>PM Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PM Cid</em>' attribute.
	 * @see #setPMCid(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGPRG_PMCid()
	 * @model
	 * @generated
	 */
	Integer getPMCid();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGPRG#getPMCid <em>PM Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PM Cid</em>' attribute.
	 * @see #getPMCid()
	 * @generated
	 */
	void setPMCid(Integer value);

} // PGPRG
