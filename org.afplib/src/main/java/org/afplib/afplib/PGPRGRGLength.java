/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PGPRGRG Length</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getPGPRGRGLength()
 * @model
 * @generated
 */
public enum PGPRGRGLength implements Enumerator {
	/**
	 * The '<em><b>Const Length10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_LENGTH10_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_LENGTH10(10, "ConstLength10", "ConstLength10"),

	/**
	 * The '<em><b>Const Length12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_LENGTH12_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_LENGTH12(12, "ConstLength12", "ConstLength12");

	/**
	 * The '<em><b>Const Length10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Length10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_LENGTH10
	 * @model name="ConstLength10"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_LENGTH10_VALUE = 10;

	/**
	 * The '<em><b>Const Length12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Length12</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_LENGTH12
	 * @model name="ConstLength12"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_LENGTH12_VALUE = 12;

	/**
	 * An array of all the '<em><b>PGPRGRG Length</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PGPRGRGLength[] VALUES_ARRAY =
		new PGPRGRGLength[] {
			CONST_LENGTH10,
			CONST_LENGTH12,
		};

	/**
	 * A public read-only list of all the '<em><b>PGPRGRG Length</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PGPRGRGLength> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PGPRGRG Length</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PGPRGRGLength get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PGPRGRGLength result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PGPRGRG Length</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PGPRGRGLength getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PGPRGRGLength result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PGPRGRG Length</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PGPRGRGLength get(int value) {
		switch (value) {
			case CONST_LENGTH10_VALUE: return CONST_LENGTH10;
			case CONST_LENGTH12_VALUE: return CONST_LENGTH12;
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
	private PGPRGRGLength(int value, String name, String literal) {
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
	
} //PGPRGRGLength
