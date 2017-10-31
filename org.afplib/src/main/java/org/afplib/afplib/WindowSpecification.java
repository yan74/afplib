/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getFLAGS <em>FLAGS</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getRES3 <em>RES3</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getCFORMAT <em>CFORMAT</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getUBASE <em>UBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getXRESOL <em>XRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getYRESOL <em>YRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getIMGXYRES <em>IMGXYRES</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getXLWIND <em>XLWIND</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getXRWIND <em>XRWIND</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getYBWIND <em>YBWIND</em>}</li>
 *   <li>{@link org.afplib.afplib.WindowSpecification#getYTWIND <em>YTWIND</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification()
 * @model
 * @generated
 */
public interface WindowSpecification extends Triplet {
	/**
	 * Returns the value of the '<em><b>FLAGS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FLAGS</em>' attribute.
	 * @see #setFLAGS(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_FLAGS()
	 * @model required="true"
	 * @generated
	 */
	Integer getFLAGS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getFLAGS <em>FLAGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FLAGS</em>' attribute.
	 * @see #getFLAGS()
	 * @generated
	 */
	void setFLAGS(Integer value);

	/**
	 * Returns the value of the '<em><b>RES3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RES3</em>' attribute.
	 * @see #setRES3(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_RES3()
	 * @model required="true"
	 * @generated
	 */
	Integer getRES3();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getRES3 <em>RES3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RES3</em>' attribute.
	 * @see #getRES3()
	 * @generated
	 */
	void setRES3(Integer value);

	/**
	 * Returns the value of the '<em><b>CFORMAT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CFORMAT</em>' attribute.
	 * @see #setCFORMAT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_CFORMAT()
	 * @model required="true"
	 * @generated
	 */
	Integer getCFORMAT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getCFORMAT <em>CFORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CFORMAT</em>' attribute.
	 * @see #getCFORMAT()
	 * @generated
	 */
	void setCFORMAT(Integer value);

	/**
	 * Returns the value of the '<em><b>UBASE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UBASE</em>' attribute.
	 * @see #setUBASE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_UBASE()
	 * @model required="true"
	 * @generated
	 */
	Integer getUBASE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getUBASE <em>UBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UBASE</em>' attribute.
	 * @see #getUBASE()
	 * @generated
	 */
	void setUBASE(Integer value);

	/**
	 * Returns the value of the '<em><b>XRESOL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XRESOL</em>' attribute.
	 * @see #setXRESOL(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_XRESOL()
	 * @model required="true"
	 * @generated
	 */
	Integer getXRESOL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getXRESOL <em>XRESOL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRESOL</em>' attribute.
	 * @see #getXRESOL()
	 * @generated
	 */
	void setXRESOL(Integer value);

	/**
	 * Returns the value of the '<em><b>YRESOL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YRESOL</em>' attribute.
	 * @see #setYRESOL(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_YRESOL()
	 * @model required="true"
	 * @generated
	 */
	Integer getYRESOL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getYRESOL <em>YRESOL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YRESOL</em>' attribute.
	 * @see #getYRESOL()
	 * @generated
	 */
	void setYRESOL(Integer value);

	/**
	 * Returns the value of the '<em><b>IMGXYRES</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IMGXYRES</em>' attribute.
	 * @see #setIMGXYRES(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_IMGXYRES()
	 * @model required="true"
	 * @generated
	 */
	Integer getIMGXYRES();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getIMGXYRES <em>IMGXYRES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IMGXYRES</em>' attribute.
	 * @see #getIMGXYRES()
	 * @generated
	 */
	void setIMGXYRES(Integer value);

	/**
	 * Returns the value of the '<em><b>XLWIND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XLWIND</em>' attribute.
	 * @see #setXLWIND(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_XLWIND()
	 * @model required="true"
	 * @generated
	 */
	Integer getXLWIND();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getXLWIND <em>XLWIND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XLWIND</em>' attribute.
	 * @see #getXLWIND()
	 * @generated
	 */
	void setXLWIND(Integer value);

	/**
	 * Returns the value of the '<em><b>XRWIND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XRWIND</em>' attribute.
	 * @see #setXRWIND(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_XRWIND()
	 * @model required="true"
	 * @generated
	 */
	Integer getXRWIND();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getXRWIND <em>XRWIND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRWIND</em>' attribute.
	 * @see #getXRWIND()
	 * @generated
	 */
	void setXRWIND(Integer value);

	/**
	 * Returns the value of the '<em><b>YBWIND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YBWIND</em>' attribute.
	 * @see #setYBWIND(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_YBWIND()
	 * @model required="true"
	 * @generated
	 */
	Integer getYBWIND();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getYBWIND <em>YBWIND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YBWIND</em>' attribute.
	 * @see #getYBWIND()
	 * @generated
	 */
	void setYBWIND(Integer value);

	/**
	 * Returns the value of the '<em><b>YTWIND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YTWIND</em>' attribute.
	 * @see #setYTWIND(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getWindowSpecification_YTWIND()
	 * @model required="true"
	 * @generated
	 */
	Integer getYTWIND();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.WindowSpecification#getYTWIND <em>YTWIND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YTWIND</em>' attribute.
	 * @see #getYTWIND()
	 * @generated
	 */
	void setYTWIND(Integer value);

} // WindowSpecification
