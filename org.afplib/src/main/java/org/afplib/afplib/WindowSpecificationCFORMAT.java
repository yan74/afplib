/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Window Specification CFORMAT</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getWindowSpecificationCFORMAT()
 * @model
 * @generated
 */
public enum WindowSpecificationCFORMAT implements Enumerator {
	/**
	 * The '<em><b>Const16 Bit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST16_BIT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST16_BIT(0, "Const16Bit", "Const16Bit");

	/**
	 * The '<em><b>Const16 Bit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const16 Bit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST16_BIT
	 * @model name="Const16Bit"
	 * @generated
	 * @ordered
	 */
	public static final int CONST16_BIT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Window Specification CFORMAT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WindowSpecificationCFORMAT[] VALUES_ARRAY =
		new WindowSpecificationCFORMAT[] {
			CONST16_BIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Window Specification CFORMAT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WindowSpecificationCFORMAT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Window Specification CFORMAT</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WindowSpecificationCFORMAT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WindowSpecificationCFORMAT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Window Specification CFORMAT</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WindowSpecificationCFORMAT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WindowSpecificationCFORMAT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Window Specification CFORMAT</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WindowSpecificationCFORMAT get(int value) {
		switch (value) {
			case CONST16_BIT_VALUE: return CONST16_BIT;
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
	private WindowSpecificationCFORMAT(int value, String name, String literal) {
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
	
} //WindowSpecificationCFORMAT
