/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finishing Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.FinishingOperation#getFOpType <em>FOp Type</em>}</li>
 *   <li>{@link org.afplib.afplib.FinishingOperation#getRefEdge <em>Ref Edge</em>}</li>
 *   <li>{@link org.afplib.afplib.FinishingOperation#getFOpCnt <em>FOp Cnt</em>}</li>
 *   <li>{@link org.afplib.afplib.FinishingOperation#getAxOffst <em>Ax Offst</em>}</li>
 *   <li>{@link org.afplib.afplib.FinishingOperation#getOpPos <em>Op Pos</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getFinishingOperation()
 * @model
 * @generated
 */
public interface FinishingOperation extends Triplet {
	/**
     * Returns the value of the '<em><b>FOp Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FOp Type</em>' attribute.
     * @see #setFOpType(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFinishingOperation_FOpType()
     * @model required="true"
     * @generated
     */
	Integer getFOpType();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FinishingOperation#getFOpType <em>FOp Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FOp Type</em>' attribute.
     * @see #getFOpType()
     * @generated
     */
	void setFOpType(Integer value);

	/**
     * Returns the value of the '<em><b>Ref Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ref Edge</em>' attribute.
     * @see #setRefEdge(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFinishingOperation_RefEdge()
     * @model required="true"
     * @generated
     */
	Integer getRefEdge();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FinishingOperation#getRefEdge <em>Ref Edge</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref Edge</em>' attribute.
     * @see #getRefEdge()
     * @generated
     */
	void setRefEdge(Integer value);

	/**
     * Returns the value of the '<em><b>FOp Cnt</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FOp Cnt</em>' attribute.
     * @see #setFOpCnt(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFinishingOperation_FOpCnt()
     * @model required="true"
     * @generated
     */
	Integer getFOpCnt();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FinishingOperation#getFOpCnt <em>FOp Cnt</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FOp Cnt</em>' attribute.
     * @see #getFOpCnt()
     * @generated
     */
	void setFOpCnt(Integer value);

	/**
     * Returns the value of the '<em><b>Ax Offst</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ax Offst</em>' attribute.
     * @see #setAxOffst(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFinishingOperation_AxOffst()
     * @model required="true"
     * @generated
     */
	Integer getAxOffst();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FinishingOperation#getAxOffst <em>Ax Offst</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ax Offst</em>' attribute.
     * @see #getAxOffst()
     * @generated
     */
	void setAxOffst(Integer value);

	/**
     * Returns the value of the '<em><b>Op Pos</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Op Pos</em>' attribute.
     * @see #setOpPos(byte[])
     * @see org.afplib.afplib.AfplibPackage#getFinishingOperation_OpPos()
     * @model
     * @generated
     */
	byte[] getOpPos();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FinishingOperation#getOpPos <em>Op Pos</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Op Pos</em>' attribute.
     * @see #getOpPos()
     * @generated
     */
	void setOpPos(byte[] value);

} // FinishingOperation
