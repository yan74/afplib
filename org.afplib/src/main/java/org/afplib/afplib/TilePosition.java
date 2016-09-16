/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.TilePosition#getXOFFSET <em>XOFFSET</em>}</li>
 *   <li>{@link org.afplib.afplib.TilePosition#getYOFFSET <em>YOFFSET</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getTilePosition()
 * @model
 * @generated
 */
public interface TilePosition extends Triplet {
	/**
	 * Returns the value of the '<em><b>XOFFSET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XOFFSET</em>' attribute.
	 * @see #setXOFFSET(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTilePosition_XOFFSET()
	 * @model required="true"
	 * @generated
	 */
	Integer getXOFFSET();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TilePosition#getXOFFSET <em>XOFFSET</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getTilePosition_YOFFSET()
	 * @model required="true"
	 * @generated
	 */
	Integer getYOFFSET();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TilePosition#getYOFFSET <em>YOFFSET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YOFFSET</em>' attribute.
	 * @see #getYOFFSET()
	 * @generated
	 */
	void setYOFFSET(Integer value);

} // TilePosition
