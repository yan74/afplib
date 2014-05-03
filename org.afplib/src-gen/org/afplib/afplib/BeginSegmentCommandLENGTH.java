/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Begin Segment Command LENGTH</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getBeginSegmentCommandLENGTH()
 * @model
 * @generated
 */
public enum BeginSegmentCommandLENGTH implements Enumerator {
	/**
	 * The '<em><b>Const Length0 C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_LENGTH0_C_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_LENGTH0_C(12, "ConstLength0C", "ConstLength0C");

	/**
	 * The '<em><b>Const Length0 C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Length0 C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_LENGTH0_C
	 * @model name="ConstLength0C"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_LENGTH0_C_VALUE = 12;

	/**
	 * An array of all the '<em><b>Begin Segment Command LENGTH</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BeginSegmentCommandLENGTH[] VALUES_ARRAY =
		new BeginSegmentCommandLENGTH[] {
			CONST_LENGTH0_C,
		};

	/**
	 * A public read-only list of all the '<em><b>Begin Segment Command LENGTH</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BeginSegmentCommandLENGTH> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Begin Segment Command LENGTH</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BeginSegmentCommandLENGTH get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BeginSegmentCommandLENGTH result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Begin Segment Command LENGTH</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BeginSegmentCommandLENGTH getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BeginSegmentCommandLENGTH result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Begin Segment Command LENGTH</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BeginSegmentCommandLENGTH get(int value) {
		switch (value) {
			case CONST_LENGTH0_C_VALUE: return CONST_LENGTH0_C;
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
	private BeginSegmentCommandLENGTH(int value, String name, String literal) {
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
	
} //BeginSegmentCommandLENGTH
