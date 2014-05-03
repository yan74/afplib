/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Measurement Units Xoa Base</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getMeasurementUnitsXoaBase()
 * @model
 * @generated
 */
public enum MeasurementUnitsXoaBase implements Enumerator {
	/**
	 * The '<em><b>Const10inches</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST10INCHES_VALUE
	 * @generated
	 * @ordered
	 */
	CONST10INCHES(0, "Const10inches", "Const10inches"),

	/**
	 * The '<em><b>Const10centimeters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST10CENTIMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	CONST10CENTIMETERS(1, "Const10centimeters", "Const10centimeters");

	/**
	 * The '<em><b>Const10inches</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const10inches</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST10INCHES
	 * @model name="Const10inches"
	 * @generated
	 * @ordered
	 */
	public static final int CONST10INCHES_VALUE = 0;

	/**
	 * The '<em><b>Const10centimeters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const10centimeters</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST10CENTIMETERS
	 * @model name="Const10centimeters"
	 * @generated
	 * @ordered
	 */
	public static final int CONST10CENTIMETERS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Measurement Units Xoa Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasurementUnitsXoaBase[] VALUES_ARRAY =
		new MeasurementUnitsXoaBase[] {
			CONST10INCHES,
			CONST10CENTIMETERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Measurement Units Xoa Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasurementUnitsXoaBase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measurement Units Xoa Base</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementUnitsXoaBase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurementUnitsXoaBase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Units Xoa Base</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementUnitsXoaBase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurementUnitsXoaBase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Units Xoa Base</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementUnitsXoaBase get(int value) {
		switch (value) {
			case CONST10INCHES_VALUE: return CONST10INCHES;
			case CONST10CENTIMETERS_VALUE: return CONST10CENTIMETERS;
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
	private MeasurementUnitsXoaBase(int value, String name, String literal) {
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
	
} //MeasurementUnitsXoaBase
