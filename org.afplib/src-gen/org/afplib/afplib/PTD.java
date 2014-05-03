/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Presentation Text Data Descriptor Format 2</b><br>The Presentation Text Data Descriptor structured field contains the descriptor data for a presentation text data object.</p><p>ID: 13873563</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.PTD#getXPBASE <em>XPBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD#getYPBASE <em>YPBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD#getXPUNITVL <em>XPUNITVL</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD#getYPUNITVL <em>YPUNITVL</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD#getXPEXTENT <em>XPEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD#getYPEXTENT <em>YPEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD#getRESERVED <em>RESERVED</em>}</li>
 *   <li>{@link org.afplib.afplib.PTD#getCS <em>CS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getPTD()
 * @model
 * @generated
 */
public interface PTD extends SF {
	/**
	 * Returns the value of the '<em><b>XPBASE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPBASE</em>' attribute.
	 * @see #setXPBASE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPTD_XPBASE()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPBASE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD#getXPBASE <em>XPBASE</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getPTD_YPBASE()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPBASE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD#getYPBASE <em>YPBASE</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getPTD_XPUNITVL()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPUNITVL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD#getXPUNITVL <em>XPUNITVL</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getPTD_YPUNITVL()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPUNITVL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD#getYPUNITVL <em>YPUNITVL</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getPTD_XPEXTENT()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPEXTENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD#getXPEXTENT <em>XPEXTENT</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getPTD_YPEXTENT()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPEXTENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD#getYPEXTENT <em>YPEXTENT</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getPTD_RESERVED()
	 * @model
	 * @generated
	 */
	Integer getRESERVED();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PTD#getRESERVED <em>RESERVED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RESERVED</em>' attribute.
	 * @see #getRESERVED()
	 * @generated
	 */
	void setRESERVED(Integer value);

	/**
	 * Returns the value of the '<em><b>CS</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getPTD_CS()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getCS();

} // PTD
