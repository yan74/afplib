/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Begin Segment Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Begin Segment Command</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BeginSegmentCommand#getLENGTH <em>LENGTH</em>}</li>
 *   <li>{@link org.afplib.afplib.BeginSegmentCommand#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.afplib.afplib.BeginSegmentCommand#getFLAG1 <em>FLAG1</em>}</li>
 *   <li>{@link org.afplib.afplib.BeginSegmentCommand#getFLAG2 <em>FLAG2</em>}</li>
 *   <li>{@link org.afplib.afplib.BeginSegmentCommand#getSEGL <em>SEGL</em>}</li>
 *   <li>{@link org.afplib.afplib.BeginSegmentCommand#getPSNAME <em>PSNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBeginSegmentCommand()
 * @model
 * @generated
 */
public interface BeginSegmentCommand extends Triplet {
	/**
	 * Returns the value of the '<em><b>LENGTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LENGTH</em>' attribute.
	 * @see #setLENGTH(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBeginSegmentCommand_LENGTH()
	 * @model required="true"
	 * @generated
	 */
	Integer getLENGTH();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BeginSegmentCommand#getLENGTH <em>LENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LENGTH</em>' attribute.
	 * @see #getLENGTH()
	 * @generated
	 */
	void setLENGTH(Integer value);

	/**
	 * Returns the value of the '<em><b>NAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NAME</em>' attribute.
	 * @see #setNAME(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBeginSegmentCommand_NAME()
	 * @model required="true"
	 * @generated
	 */
	Integer getNAME();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BeginSegmentCommand#getNAME <em>NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NAME</em>' attribute.
	 * @see #getNAME()
	 * @generated
	 */
	void setNAME(Integer value);

	/**
	 * Returns the value of the '<em><b>FLAG1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FLAG1</em>' attribute.
	 * @see #setFLAG1(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBeginSegmentCommand_FLAG1()
	 * @model required="true"
	 * @generated
	 */
	Integer getFLAG1();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BeginSegmentCommand#getFLAG1 <em>FLAG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FLAG1</em>' attribute.
	 * @see #getFLAG1()
	 * @generated
	 */
	void setFLAG1(Integer value);

	/**
	 * Returns the value of the '<em><b>FLAG2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FLAG2</em>' attribute.
	 * @see #setFLAG2(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBeginSegmentCommand_FLAG2()
	 * @model required="true"
	 * @generated
	 */
	Integer getFLAG2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BeginSegmentCommand#getFLAG2 <em>FLAG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FLAG2</em>' attribute.
	 * @see #getFLAG2()
	 * @generated
	 */
	void setFLAG2(Integer value);

	/**
	 * Returns the value of the '<em><b>SEGL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SEGL</em>' attribute.
	 * @see #setSEGL(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getBeginSegmentCommand_SEGL()
	 * @model required="true"
	 * @generated
	 */
	Integer getSEGL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BeginSegmentCommand#getSEGL <em>SEGL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SEGL</em>' attribute.
	 * @see #getSEGL()
	 * @generated
	 */
	void setSEGL(Integer value);

	/**
	 * Returns the value of the '<em><b>PSNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PSNAME</em>' attribute.
	 * @see #setPSNAME(String)
	 * @see org.afplib.afplib.AfplibPackage#getBeginSegmentCommand_PSNAME()
	 * @model dataType="org.afplib.base.ModcaString4" required="true"
	 * @generated
	 */
	String getPSNAME();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BeginSegmentCommand#getPSNAME <em>PSNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSNAME</em>' attribute.
	 * @see #getPSNAME()
	 * @generated
	 */
	void setPSNAME(String value);

} // BeginSegmentCommand
