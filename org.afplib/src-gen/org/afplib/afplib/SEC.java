/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.SEC#getRESERVED <em>RESERVED</em>}</li>
 *   <li>{@link org.afplib.afplib.SEC#getCOLSPCE <em>COLSPCE</em>}</li>
 *   <li>{@link org.afplib.afplib.SEC#getCOLSIZE1 <em>COLSIZE1</em>}</li>
 *   <li>{@link org.afplib.afplib.SEC#getCOLSIZE2 <em>COLSIZE2</em>}</li>
 *   <li>{@link org.afplib.afplib.SEC#getCOLSIZE3 <em>COLSIZE3</em>}</li>
 *   <li>{@link org.afplib.afplib.SEC#getCOLSIZE4 <em>COLSIZE4</em>}</li>
 *   <li>{@link org.afplib.afplib.SEC#getCOLVALUE <em>COLVALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getSEC()
 * @model
 * @generated
 */
public interface SEC extends Triplet {
	/**
	 * Returns the value of the '<em><b>RESERVED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RESERVED</em>' attribute.
	 * @see #setRESERVED(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSEC_RESERVED()
	 * @model required="true"
	 * @generated
	 */
	Integer getRESERVED();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SEC#getRESERVED <em>RESERVED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RESERVED</em>' attribute.
	 * @see #getRESERVED()
	 * @generated
	 */
	void setRESERVED(Integer value);

	/**
	 * Returns the value of the '<em><b>COLSPCE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COLSPCE</em>' attribute.
	 * @see #setCOLSPCE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSEC_COLSPCE()
	 * @model required="true"
	 * @generated
	 */
	Integer getCOLSPCE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SEC#getCOLSPCE <em>COLSPCE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COLSPCE</em>' attribute.
	 * @see #getCOLSPCE()
	 * @generated
	 */
	void setCOLSPCE(Integer value);

	/**
	 * Returns the value of the '<em><b>COLSIZE1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COLSIZE1</em>' attribute.
	 * @see #setCOLSIZE1(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSEC_COLSIZE1()
	 * @model required="true"
	 * @generated
	 */
	Integer getCOLSIZE1();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SEC#getCOLSIZE1 <em>COLSIZE1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COLSIZE1</em>' attribute.
	 * @see #getCOLSIZE1()
	 * @generated
	 */
	void setCOLSIZE1(Integer value);

	/**
	 * Returns the value of the '<em><b>COLSIZE2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COLSIZE2</em>' attribute.
	 * @see #setCOLSIZE2(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSEC_COLSIZE2()
	 * @model required="true"
	 * @generated
	 */
	Integer getCOLSIZE2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SEC#getCOLSIZE2 <em>COLSIZE2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COLSIZE2</em>' attribute.
	 * @see #getCOLSIZE2()
	 * @generated
	 */
	void setCOLSIZE2(Integer value);

	/**
	 * Returns the value of the '<em><b>COLSIZE3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COLSIZE3</em>' attribute.
	 * @see #setCOLSIZE3(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSEC_COLSIZE3()
	 * @model required="true"
	 * @generated
	 */
	Integer getCOLSIZE3();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SEC#getCOLSIZE3 <em>COLSIZE3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COLSIZE3</em>' attribute.
	 * @see #getCOLSIZE3()
	 * @generated
	 */
	void setCOLSIZE3(Integer value);

	/**
	 * Returns the value of the '<em><b>COLSIZE4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COLSIZE4</em>' attribute.
	 * @see #setCOLSIZE4(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSEC_COLSIZE4()
	 * @model required="true"
	 * @generated
	 */
	Integer getCOLSIZE4();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SEC#getCOLSIZE4 <em>COLSIZE4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COLSIZE4</em>' attribute.
	 * @see #getCOLSIZE4()
	 * @generated
	 */
	void setCOLSIZE4(Integer value);

	/**
	 * Returns the value of the '<em><b>COLVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COLVALUE</em>' attribute.
	 * @see #setCOLVALUE(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getSEC_COLVALUE()
	 * @model
	 * @generated
	 */
	byte[] getCOLVALUE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SEC#getCOLVALUE <em>COLVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COLVALUE</em>' attribute.
	 * @see #getCOLVALUE()
	 * @generated
	 */
	void setCOLVALUE(byte[] value);

} // SEC
