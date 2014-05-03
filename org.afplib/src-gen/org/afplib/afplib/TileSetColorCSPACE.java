/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tile Set Color CSPACE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getTileSetColorCSPACE()
 * @model
 * @generated
 */
public enum TileSetColorCSPACE implements Enumerator {
	/**
	 * The '<em><b>Const CMYK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CMYK_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CMYK(4, "ConstCMYK", "ConstCMYK"),

	/**
	 * The '<em><b>Const CIE Lab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CIE_LAB_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CIE_LAB(8, "ConstCIELab", "ConstCIELab");

	/**
	 * The '<em><b>Const CMYK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const CMYK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CMYK
	 * @model name="ConstCMYK"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CMYK_VALUE = 4;

	/**
	 * The '<em><b>Const CIE Lab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const CIE Lab</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CIE_LAB
	 * @model name="ConstCIELab"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CIE_LAB_VALUE = 8;

	/**
	 * An array of all the '<em><b>Tile Set Color CSPACE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TileSetColorCSPACE[] VALUES_ARRAY =
		new TileSetColorCSPACE[] {
			CONST_CMYK,
			CONST_CIE_LAB,
		};

	/**
	 * A public read-only list of all the '<em><b>Tile Set Color CSPACE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TileSetColorCSPACE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tile Set Color CSPACE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TileSetColorCSPACE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TileSetColorCSPACE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tile Set Color CSPACE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TileSetColorCSPACE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TileSetColorCSPACE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tile Set Color CSPACE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TileSetColorCSPACE get(int value) {
		switch (value) {
			case CONST_CMYK_VALUE: return CONST_CMYK;
			case CONST_CIE_LAB_VALUE: return CONST_CIE_LAB;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TileSetColorCSPACE(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TileSetColorCSPACE
