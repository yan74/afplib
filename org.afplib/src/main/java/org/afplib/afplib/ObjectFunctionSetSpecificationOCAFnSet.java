/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Function Set Specification OCA Fn Set</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getObjectFunctionSetSpecificationOCAFnSet()
 * @model
 * @generated
 */
public enum ObjectFunctionSetSpecificationOCAFnSet implements Enumerator {
	/**
	 * The '<em><b>Const PT1BCD1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PT1BCD1_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PT1BCD1(0, "ConstPT1BCD1", "ConstPT1BCD1"),

	/**
	 * The '<em><b>Const GRS2PT2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_GRS2PT2_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_GRS2PT2(16384, "ConstGRS2PT2", "ConstGRS2PT2"),

	/**
	 * The '<em><b>Const FS10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_FS10_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_FS10(32768, "ConstFS10", "ConstFS10");

	/**
	 * The '<em><b>Const PT1BCD1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const PT1BCD1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PT1BCD1
	 * @model name="ConstPT1BCD1"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PT1BCD1_VALUE = 0;

	/**
	 * The '<em><b>Const GRS2PT2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const GRS2PT2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_GRS2PT2
	 * @model name="ConstGRS2PT2"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_GRS2PT2_VALUE = 16384;

	/**
	 * The '<em><b>Const FS10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const FS10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_FS10
	 * @model name="ConstFS10"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_FS10_VALUE = 32768;

	/**
	 * An array of all the '<em><b>Object Function Set Specification OCA Fn Set</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectFunctionSetSpecificationOCAFnSet[] VALUES_ARRAY =
		new ObjectFunctionSetSpecificationOCAFnSet[] {
			CONST_PT1BCD1,
			CONST_GRS2PT2,
			CONST_FS10,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Function Set Specification OCA Fn Set</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectFunctionSetSpecificationOCAFnSet> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Function Set Specification OCA Fn Set</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFunctionSetSpecificationOCAFnSet get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectFunctionSetSpecificationOCAFnSet result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Function Set Specification OCA Fn Set</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFunctionSetSpecificationOCAFnSet getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectFunctionSetSpecificationOCAFnSet result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Function Set Specification OCA Fn Set</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFunctionSetSpecificationOCAFnSet get(int value) {
		switch (value) {
			case CONST_PT1BCD1_VALUE: return CONST_PT1BCD1;
			case CONST_GRS2PT2_VALUE: return CONST_GRS2PT2;
			case CONST_FS10_VALUE: return CONST_FS10;
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
	private ObjectFunctionSetSpecificationOCAFnSet(int value, String name, String literal) {
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
	
} //ObjectFunctionSetSpecificationOCAFnSet
