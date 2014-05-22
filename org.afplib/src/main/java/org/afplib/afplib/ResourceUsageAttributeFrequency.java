/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Usage Attribute Frequency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getResourceUsageAttributeFrequency()
 * @model
 * @generated
 */
public enum ResourceUsageAttributeFrequency implements Enumerator {
	/**
	 * The '<em><b>Const Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_LOW_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_LOW(0, "ConstLow", "ConstLow"),

	/**
	 * The '<em><b>Const High</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_HIGH(255, "ConstHigh", "ConstHigh");

	/**
	 * The '<em><b>Const Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Low</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_LOW
	 * @model name="ConstLow"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_LOW_VALUE = 0;

	/**
	 * The '<em><b>Const High</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const High</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_HIGH
	 * @model name="ConstHigh"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_HIGH_VALUE = 255;

	/**
	 * An array of all the '<em><b>Resource Usage Attribute Frequency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceUsageAttributeFrequency[] VALUES_ARRAY =
		new ResourceUsageAttributeFrequency[] {
			CONST_LOW,
			CONST_HIGH,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Usage Attribute Frequency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceUsageAttributeFrequency> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Usage Attribute Frequency</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceUsageAttributeFrequency get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceUsageAttributeFrequency result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Usage Attribute Frequency</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceUsageAttributeFrequency getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceUsageAttributeFrequency result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Usage Attribute Frequency</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceUsageAttributeFrequency get(int value) {
		switch (value) {
			case CONST_LOW_VALUE: return CONST_LOW;
			case CONST_HIGH_VALUE: return CONST_HIGH;
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
	private ResourceUsageAttributeFrequency(int value, String name, String literal) {
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
	
} //ResourceUsageAttributeFrequency
