/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CPCVS Flags</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getCPCVSFlags()
 * @model
 * @generated
 */
public enum CPCVSFlags implements Enumerator {
	/**
	 * The '<em><b>Sort Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SORT_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	SORT_ORDER(1, "SortOrder", "SortOrder"),

	/**
	 * The '<em><b>Variable Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE_SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABLE_SPACE(16, "VariableSpace", "VariableSpace");

	/**
	 * The '<em><b>Sort Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sort Order</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SORT_ORDER
	 * @model name="SortOrder"
	 * @generated
	 * @ordered
	 */
	public static final int SORT_ORDER_VALUE = 1;

	/**
	 * The '<em><b>Variable Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variable Space</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIABLE_SPACE
	 * @model name="VariableSpace"
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_SPACE_VALUE = 16;

	/**
	 * An array of all the '<em><b>CPCVS Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CPCVSFlags[] VALUES_ARRAY =
		new CPCVSFlags[] {
			SORT_ORDER,
			VARIABLE_SPACE,
		};

	/**
	 * A public read-only list of all the '<em><b>CPCVS Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CPCVSFlags> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CPCVS Flags</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPCVSFlags get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPCVSFlags result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPCVS Flags</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPCVSFlags getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPCVSFlags result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPCVS Flags</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPCVSFlags get(int value) {
		switch (value) {
			case SORT_ORDER_VALUE: return SORT_ORDER;
			case VARIABLE_SPACE_VALUE: return VARIABLE_SPACE;
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
	private CPCVSFlags(int value, String name, String literal) {
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
	
} //CPCVSFlags
