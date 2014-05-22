/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GBARFLAGS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getGBARFLAGS()
 * @model
 * @generated
 */
public enum GBARFLAGS implements Enumerator {
	/**
	 * The '<em><b>RES1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES1_VALUE
	 * @generated
	 * @ordered
	 */
	RES1(1, "RES1", "RES1"),

	/**
	 * The '<em><b>BOUNDARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUNDARY_VALUE
	 * @generated
	 * @ordered
	 */
	BOUNDARY(2, "BOUNDARY", "BOUNDARY"),

	/**
	 * The '<em><b>INSIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE(4, "INSIDE", "INSIDE");

	/**
	 * The '<em><b>RES1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RES1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RES1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RES1_VALUE = 1;

	/**
	 * The '<em><b>BOUNDARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOUNDARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOUNDARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOUNDARY_VALUE = 2;

	/**
	 * The '<em><b>INSIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_VALUE = 4;

	/**
	 * An array of all the '<em><b>GBARFLAGS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GBARFLAGS[] VALUES_ARRAY =
		new GBARFLAGS[] {
			RES1,
			BOUNDARY,
			INSIDE,
		};

	/**
	 * A public read-only list of all the '<em><b>GBARFLAGS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GBARFLAGS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GBARFLAGS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GBARFLAGS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GBARFLAGS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GBARFLAGS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GBARFLAGS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GBARFLAGS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GBARFLAGS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GBARFLAGS get(int value) {
		switch (value) {
			case RES1_VALUE: return RES1;
			case BOUNDARY_VALUE: return BOUNDARY;
			case INSIDE_VALUE: return INSIDE;
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
	private GBARFLAGS(int value, String name, String literal) {
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
	
} //GBARFLAGS
