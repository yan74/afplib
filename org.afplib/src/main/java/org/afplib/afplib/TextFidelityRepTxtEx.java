/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text Fidelity Rep Txt Ex</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getTextFidelityRepTxtEx()
 * @model
 * @generated
 */
public enum TextFidelityRepTxtEx implements Enumerator {
	/**
	 * The '<em><b>Const Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_REPORT(1, "ConstReport", "ConstReport"),

	/**
	 * The '<em><b>Const Do Not Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DO_NOT_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DO_NOT_REPORT(2, "ConstDoNotReport", "ConstDoNotReport");

	/**
	 * The '<em><b>Const Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Report</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_REPORT
	 * @model name="ConstReport"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_REPORT_VALUE = 1;

	/**
	 * The '<em><b>Const Do Not Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Do Not Report</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DO_NOT_REPORT
	 * @model name="ConstDoNotReport"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DO_NOT_REPORT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Text Fidelity Rep Txt Ex</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextFidelityRepTxtEx[] VALUES_ARRAY =
		new TextFidelityRepTxtEx[] {
			CONST_REPORT,
			CONST_DO_NOT_REPORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Fidelity Rep Txt Ex</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextFidelityRepTxtEx> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Fidelity Rep Txt Ex</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFidelityRepTxtEx get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextFidelityRepTxtEx result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Fidelity Rep Txt Ex</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFidelityRepTxtEx getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextFidelityRepTxtEx result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Fidelity Rep Txt Ex</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFidelityRepTxtEx get(int value) {
		switch (value) {
			case CONST_REPORT_VALUE: return CONST_REPORT;
			case CONST_DO_NOT_REPORT_VALUE: return CONST_DO_NOT_REPORT;
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
	private TextFidelityRepTxtEx(int value, String name, String literal) {
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
	
} //TextFidelityRepTxtEx
