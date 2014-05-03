/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Code Page Control</b><br>The Code Page Control (CPC) contains information about the code page.</p><p>ID: 13870983</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.CPC#getDefCharID <em>Def Char ID</em>}</li>
 *   <li>{@link org.afplib.afplib.CPC#getPrtFlags <em>Prt Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.CPC#getCPIRGLen <em>CPIRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.CPC#getVSCharSN <em>VS Char SN</em>}</li>
 *   <li>{@link org.afplib.afplib.CPC#getVSChar <em>VS Char</em>}</li>
 *   <li>{@link org.afplib.afplib.CPC#getVSFlags <em>VS Flags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getCPC()
 * @model
 * @generated
 */
public interface CPC extends SF {
	/**
	 * Returns the value of the '<em><b>Def Char ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def Char ID</em>' attribute.
	 * @see #setDefCharID(String)
	 * @see org.afplib.afplib.AfplibPackage#getCPC_DefCharID()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getDefCharID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPC#getDefCharID <em>Def Char ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Char ID</em>' attribute.
	 * @see #getDefCharID()
	 * @generated
	 */
	void setDefCharID(String value);

	/**
	 * Returns the value of the '<em><b>Prt Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prt Flags</em>' attribute.
	 * @see #setPrtFlags(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPC_PrtFlags()
	 * @model required="true"
	 * @generated
	 */
	Integer getPrtFlags();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPC#getPrtFlags <em>Prt Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prt Flags</em>' attribute.
	 * @see #getPrtFlags()
	 * @generated
	 */
	void setPrtFlags(Integer value);

	/**
	 * Returns the value of the '<em><b>CPIRG Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CPIRG Len</em>' attribute.
	 * @see #setCPIRGLen(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPC_CPIRGLen()
	 * @model required="true"
	 * @generated
	 */
	Integer getCPIRGLen();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPC#getCPIRGLen <em>CPIRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPIRG Len</em>' attribute.
	 * @see #getCPIRGLen()
	 * @generated
	 */
	void setCPIRGLen(Integer value);

	/**
	 * Returns the value of the '<em><b>VS Char SN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VS Char SN</em>' attribute.
	 * @see #setVSCharSN(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPC_VSCharSN()
	 * @model required="true"
	 * @generated
	 */
	Integer getVSCharSN();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPC#getVSCharSN <em>VS Char SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VS Char SN</em>' attribute.
	 * @see #getVSCharSN()
	 * @generated
	 */
	void setVSCharSN(Integer value);

	/**
	 * Returns the value of the '<em><b>VS Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VS Char</em>' attribute.
	 * @see #setVSChar(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPC_VSChar()
	 * @model required="true"
	 * @generated
	 */
	Integer getVSChar();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPC#getVSChar <em>VS Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VS Char</em>' attribute.
	 * @see #getVSChar()
	 * @generated
	 */
	void setVSChar(Integer value);

	/**
	 * Returns the value of the '<em><b>VS Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VS Flags</em>' attribute.
	 * @see #setVSFlags(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPC_VSFlags()
	 * @model required="true"
	 * @generated
	 */
	Integer getVSFlags();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPC#getVSFlags <em>VS Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VS Flags</em>' attribute.
	 * @see #getVSFlags()
	 * @generated
	 */
	void setVSFlags(Integer value);

} // CPC
