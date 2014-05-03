/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile TOCRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.TileTOCRG#getXOFFSET <em>XOFFSET</em>}</li>
 *   <li>{@link org.afplib.afplib.TileTOCRG#getYOFFSET <em>YOFFSET</em>}</li>
 *   <li>{@link org.afplib.afplib.TileTOCRG#getTHSIZE <em>THSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.TileTOCRG#getTVSIZE <em>TVSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.TileTOCRG#getRELRES <em>RELRES</em>}</li>
 *   <li>{@link org.afplib.afplib.TileTOCRG#getCOMPR <em>COMPR</em>}</li>
 *   <li>{@link org.afplib.afplib.TileTOCRG#getDATAPOS <em>DATAPOS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getTileTOCRG()
 * @model
 * @generated
 */
public interface TileTOCRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>XOFFSET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XOFFSET</em>' attribute.
	 * @see #setXOFFSET(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileTOCRG_XOFFSET()
	 * @model required="true"
	 * @generated
	 */
	Integer getXOFFSET();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileTOCRG#getXOFFSET <em>XOFFSET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XOFFSET</em>' attribute.
	 * @see #getXOFFSET()
	 * @generated
	 */
	void setXOFFSET(Integer value);

	/**
	 * Returns the value of the '<em><b>YOFFSET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YOFFSET</em>' attribute.
	 * @see #setYOFFSET(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileTOCRG_YOFFSET()
	 * @model required="true"
	 * @generated
	 */
	Integer getYOFFSET();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileTOCRG#getYOFFSET <em>YOFFSET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YOFFSET</em>' attribute.
	 * @see #getYOFFSET()
	 * @generated
	 */
	void setYOFFSET(Integer value);

	/**
	 * Returns the value of the '<em><b>THSIZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>THSIZE</em>' attribute.
	 * @see #setTHSIZE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileTOCRG_THSIZE()
	 * @model required="true"
	 * @generated
	 */
	Integer getTHSIZE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileTOCRG#getTHSIZE <em>THSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THSIZE</em>' attribute.
	 * @see #getTHSIZE()
	 * @generated
	 */
	void setTHSIZE(Integer value);

	/**
	 * Returns the value of the '<em><b>TVSIZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TVSIZE</em>' attribute.
	 * @see #setTVSIZE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileTOCRG_TVSIZE()
	 * @model required="true"
	 * @generated
	 */
	Integer getTVSIZE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileTOCRG#getTVSIZE <em>TVSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TVSIZE</em>' attribute.
	 * @see #getTVSIZE()
	 * @generated
	 */
	void setTVSIZE(Integer value);

	/**
	 * Returns the value of the '<em><b>RELRES</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RELRES</em>' attribute.
	 * @see #setRELRES(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileTOCRG_RELRES()
	 * @model required="true"
	 * @generated
	 */
	Integer getRELRES();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileTOCRG#getRELRES <em>RELRES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RELRES</em>' attribute.
	 * @see #getRELRES()
	 * @generated
	 */
	void setRELRES(Integer value);

	/**
	 * Returns the value of the '<em><b>COMPR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COMPR</em>' attribute.
	 * @see #setCOMPR(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileTOCRG_COMPR()
	 * @model required="true"
	 * @generated
	 */
	Integer getCOMPR();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileTOCRG#getCOMPR <em>COMPR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COMPR</em>' attribute.
	 * @see #getCOMPR()
	 * @generated
	 */
	void setCOMPR(Integer value);

	/**
	 * Returns the value of the '<em><b>DATAPOS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DATAPOS</em>' attribute.
	 * @see #setDATAPOS(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileTOCRG_DATAPOS()
	 * @model required="true"
	 * @generated
	 */
	Integer getDATAPOS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileTOCRG#getDATAPOS <em>DATAPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATAPOS</em>' attribute.
	 * @see #getDATAPOS()
	 * @generated
	 */
	void setDATAPOS(Integer value);

} // TileTOCRG
