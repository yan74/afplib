/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IDE Structure FLAGS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getIDEStructureFLAGS()
 * @model
 * @generated
 */
public enum IDEStructureFLAGS implements Enumerator {
	/**
	 * The '<em><b>Subtractive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTRACTIVE(1, "Subtractive", "Subtractive"),

	/**
	 * The '<em><b>Gray Coding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY_CODING_VALUE
	 * @generated
	 * @ordered
	 */
	GRAY_CODING(2, "GrayCoding", "GrayCoding");

	/**
	 * The '<em><b>Subtractive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subtractive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBTRACTIVE
	 * @model name="Subtractive"
	 * @generated
	 * @ordered
	 */
	public static final int SUBTRACTIVE_VALUE = 1;

	/**
	 * The '<em><b>Gray Coding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gray Coding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAY_CODING
	 * @model name="GrayCoding"
	 * @generated
	 * @ordered
	 */
	public static final int GRAY_CODING_VALUE = 2;

	/**
	 * An array of all the '<em><b>IDE Structure FLAGS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IDEStructureFLAGS[] VALUES_ARRAY =
		new IDEStructureFLAGS[] {
			SUBTRACTIVE,
			GRAY_CODING,
		};

	/**
	 * A public read-only list of all the '<em><b>IDE Structure FLAGS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IDEStructureFLAGS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IDE Structure FLAGS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IDEStructureFLAGS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IDEStructureFLAGS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IDE Structure FLAGS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IDEStructureFLAGS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IDEStructureFLAGS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IDE Structure FLAGS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IDEStructureFLAGS get(int value) {
		switch (value) {
			case SUBTRACTIVE_VALUE: return SUBTRACTIVE;
			case GRAY_CODING_VALUE: return GRAY_CODING;
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
	private IDEStructureFLAGS(int value, String name, String literal) {
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
	
} //IDEStructureFLAGS
