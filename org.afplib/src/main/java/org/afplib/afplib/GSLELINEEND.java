/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSLELINEEND</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getGSLELINEEND()
 * @model
 * @generated
 */
public enum GSLELINEEND implements Enumerator {
	/**
	 * The '<em><b>Const Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DEFAULT(0, "ConstDefault", "ConstDefault"),

	/**
	 * The '<em><b>Const Flat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_FLAT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_FLAT(1, "ConstFlat", "ConstFlat"),

	/**
	 * The '<em><b>Const Square</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_SQUARE(2, "ConstSquare", "ConstSquare"),

	/**
	 * The '<em><b>Const Round</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_ROUND_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_ROUND(3, "ConstRound", "ConstRound");

	/**
	 * The '<em><b>Const Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DEFAULT
	 * @model name="ConstDefault"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Const Flat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Flat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_FLAT
	 * @model name="ConstFlat"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_FLAT_VALUE = 1;

	/**
	 * The '<em><b>Const Square</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Square</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_SQUARE
	 * @model name="ConstSquare"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_SQUARE_VALUE = 2;

	/**
	 * The '<em><b>Const Round</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Round</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_ROUND
	 * @model name="ConstRound"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_ROUND_VALUE = 3;

	/**
	 * An array of all the '<em><b>GSLELINEEND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSLELINEEND[] VALUES_ARRAY =
		new GSLELINEEND[] {
			CONST_DEFAULT,
			CONST_FLAT,
			CONST_SQUARE,
			CONST_ROUND,
		};

	/**
	 * A public read-only list of all the '<em><b>GSLELINEEND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSLELINEEND> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSLELINEEND</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSLELINEEND get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSLELINEEND result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSLELINEEND</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSLELINEEND getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSLELINEEND result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSLELINEEND</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSLELINEEND get(int value) {
		switch (value) {
			case CONST_DEFAULT_VALUE: return CONST_DEFAULT;
			case CONST_FLAT_VALUE: return CONST_FLAT;
			case CONST_SQUARE_VALUE: return CONST_SQUARE;
			case CONST_ROUND_VALUE: return CONST_ROUND;
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
	private GSLELINEEND(int value, String name, String literal) {
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
	
} //GSLELINEEND
