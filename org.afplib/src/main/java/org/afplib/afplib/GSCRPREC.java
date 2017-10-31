/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSCRPREC</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getGSCRPREC()
 * @model
 * @generated
 */
public enum GSCRPREC implements Enumerator {
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
	 * The '<em><b>Const String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_STRING(1, "ConstString", "ConstString"),

	/**
	 * The '<em><b>Const Character</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CHARACTER(2, "ConstCharacter", "ConstCharacter"),

	/**
	 * The '<em><b>Const Stroke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_STROKE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_STROKE(3, "ConstStroke", "ConstStroke");

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
	 * The '<em><b>Const String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_STRING
	 * @model name="ConstString"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_STRING_VALUE = 1;

	/**
	 * The '<em><b>Const Character</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Character</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CHARACTER
	 * @model name="ConstCharacter"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CHARACTER_VALUE = 2;

	/**
	 * The '<em><b>Const Stroke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Stroke</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_STROKE
	 * @model name="ConstStroke"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_STROKE_VALUE = 3;

	/**
	 * An array of all the '<em><b>GSCRPREC</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSCRPREC[] VALUES_ARRAY =
		new GSCRPREC[] {
			CONST_DEFAULT,
			CONST_STRING,
			CONST_CHARACTER,
			CONST_STROKE,
		};

	/**
	 * A public read-only list of all the '<em><b>GSCRPREC</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSCRPREC> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSCRPREC</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSCRPREC get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSCRPREC result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSCRPREC</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSCRPREC getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSCRPREC result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSCRPREC</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSCRPREC get(int value) {
		switch (value) {
			case CONST_DEFAULT_VALUE: return CONST_DEFAULT;
			case CONST_STRING_VALUE: return CONST_STRING;
			case CONST_CHARACTER_VALUE: return CONST_CHARACTER;
			case CONST_STROKE_VALUE: return CONST_STROKE;
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
	private GSCRPREC(int value, String name, String literal) {
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
	
} //GSCRPREC
