/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CPC Prt Flags</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getCPCPrtFlags()
 * @model
 * @generated
 */
public enum CPCPrtFlags implements Enumerator {
	/**
	 * The '<em><b>Invalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID(1, "Invalid", "Invalid"),

	/**
	 * The '<em><b>Presentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRESENTATION(2, "Presentation", "Presentation"),

	/**
	 * The '<em><b>Increment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	INCREMENT(4, "Increment", "Increment");

	/**
	 * The '<em><b>Invalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invalid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVALID
	 * @model name="Invalid"
	 * @generated
	 * @ordered
	 */
	public static final int INVALID_VALUE = 1;

	/**
	 * The '<em><b>Presentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Presentation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESENTATION
	 * @model name="Presentation"
	 * @generated
	 * @ordered
	 */
	public static final int PRESENTATION_VALUE = 2;

	/**
	 * The '<em><b>Increment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Increment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCREMENT
	 * @model name="Increment"
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>CPC Prt Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CPCPrtFlags[] VALUES_ARRAY =
		new CPCPrtFlags[] {
			INVALID,
			PRESENTATION,
			INCREMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>CPC Prt Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CPCPrtFlags> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CPC Prt Flags</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPCPrtFlags get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPCPrtFlags result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPC Prt Flags</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPCPrtFlags getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPCPrtFlags result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPC Prt Flags</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPCPrtFlags get(int value) {
		switch (value) {
			case INVALID_VALUE: return INVALID;
			case PRESENTATION_VALUE: return PRESENTATION;
			case INCREMENT_VALUE: return INCREMENT;
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
	private CPCPrtFlags(int value, String name, String literal) {
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
	
} //CPCPrtFlags
