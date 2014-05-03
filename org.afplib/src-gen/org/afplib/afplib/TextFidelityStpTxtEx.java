/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text Fidelity Stp Txt Ex</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getTextFidelityStpTxtEx()
 * @model
 * @generated
 */
public enum TextFidelityStpTxtEx implements Enumerator {
	/**
	 * The '<em><b>Const Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_STOP(1, "ConstStop", "ConstStop"),

	/**
	 * The '<em><b>Const Do Not Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DO_NOT_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DO_NOT_STOP(2, "ConstDoNotStop", "ConstDoNotStop");

	/**
	 * The '<em><b>Const Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_STOP
	 * @model name="ConstStop"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_STOP_VALUE = 1;

	/**
	 * The '<em><b>Const Do Not Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Do Not Stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DO_NOT_STOP
	 * @model name="ConstDoNotStop"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DO_NOT_STOP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Text Fidelity Stp Txt Ex</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextFidelityStpTxtEx[] VALUES_ARRAY =
		new TextFidelityStpTxtEx[] {
			CONST_STOP,
			CONST_DO_NOT_STOP,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Fidelity Stp Txt Ex</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextFidelityStpTxtEx> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Fidelity Stp Txt Ex</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFidelityStpTxtEx get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextFidelityStpTxtEx result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Fidelity Stp Txt Ex</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFidelityStpTxtEx getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextFidelityStpTxtEx result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Fidelity Stp Txt Ex</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFidelityStpTxtEx get(int value) {
		switch (value) {
			case CONST_STOP_VALUE: return CONST_STOP;
			case CONST_DO_NOT_STOP_VALUE: return CONST_DO_NOT_STOP;
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
	private TextFidelityStpTxtEx(int value, String name, String literal) {
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
	
} //TextFidelityStpTxtEx
