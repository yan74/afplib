/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Media Fidelity Stp Med Ex</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getMediaFidelityStpMedEx()
 * @model
 * @generated
 */
public enum MediaFidelityStpMedEx implements Enumerator {
	/**
	 * The '<em><b>Const Terminate And Hold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_TERMINATE_AND_HOLD_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_TERMINATE_AND_HOLD(1, "ConstTerminateAndHold", "ConstTerminateAndHold"),

	/**
	 * The '<em><b>Const Continue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CONTINUE(2, "ConstContinue", "ConstContinue");

	/**
	 * The '<em><b>Const Terminate And Hold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Terminate And Hold</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_TERMINATE_AND_HOLD
	 * @model name="ConstTerminateAndHold"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_TERMINATE_AND_HOLD_VALUE = 1;

	/**
	 * The '<em><b>Const Continue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Continue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CONTINUE
	 * @model name="ConstContinue"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CONTINUE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Media Fidelity Stp Med Ex</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MediaFidelityStpMedEx[] VALUES_ARRAY =
		new MediaFidelityStpMedEx[] {
			CONST_TERMINATE_AND_HOLD,
			CONST_CONTINUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Media Fidelity Stp Med Ex</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MediaFidelityStpMedEx> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Media Fidelity Stp Med Ex</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaFidelityStpMedEx get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaFidelityStpMedEx result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Fidelity Stp Med Ex</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaFidelityStpMedEx getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaFidelityStpMedEx result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Fidelity Stp Med Ex</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaFidelityStpMedEx get(int value) {
		switch (value) {
			case CONST_TERMINATE_AND_HOLD_VALUE: return CONST_TERMINATE_AND_HOLD;
			case CONST_CONTINUE_VALUE: return CONST_CONTINUE;
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
	private MediaFidelityStpMedEx(int value, String name, String literal) {
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
	
} //MediaFidelityStpMedEx
