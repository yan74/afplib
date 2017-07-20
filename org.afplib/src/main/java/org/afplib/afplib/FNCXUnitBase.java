/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNCX Unit Base</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNCXUnitBase()
 * @model
 * @generated
 */
public enum FNCXUnitBase implements Enumerator {
	/**
     * The '<em><b>Const Fixed Metric10inches</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_FIXED_METRIC10INCHES_VALUE
     * @generated
     * @ordered
     */
	CONST_FIXED_METRIC10INCHES(0, "ConstFixedMetric10inches", "ConstFixedMetric10inches"),

	/**
     * The '<em><b>Const Relative Metrics</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_RELATIVE_METRICS_VALUE
     * @generated
     * @ordered
     */
	CONST_RELATIVE_METRICS(2, "ConstRelativeMetrics", "ConstRelativeMetrics");

	/**
     * The '<em><b>Const Fixed Metric10inches</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Fixed Metric10inches</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_FIXED_METRIC10INCHES
     * @model name="ConstFixedMetric10inches"
     * @generated
     * @ordered
     */
	public static final int CONST_FIXED_METRIC10INCHES_VALUE = 0;

	/**
     * The '<em><b>Const Relative Metrics</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Relative Metrics</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_RELATIVE_METRICS
     * @model name="ConstRelativeMetrics"
     * @generated
     * @ordered
     */
	public static final int CONST_RELATIVE_METRICS_VALUE = 2;

	/**
     * An array of all the '<em><b>FNCX Unit Base</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final FNCXUnitBase[] VALUES_ARRAY =
		new FNCXUnitBase[] {
            CONST_FIXED_METRIC10INCHES,
            CONST_RELATIVE_METRICS,
        };

	/**
     * A public read-only list of all the '<em><b>FNCX Unit Base</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<FNCXUnitBase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>FNCX Unit Base</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FNCXUnitBase get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FNCXUnitBase result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>FNCX Unit Base</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FNCXUnitBase getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FNCXUnitBase result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>FNCX Unit Base</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FNCXUnitBase get(int value) {
        switch (value) {
            case CONST_FIXED_METRIC10INCHES_VALUE: return CONST_FIXED_METRIC10INCHES;
            case CONST_RELATIVE_METRICS_VALUE: return CONST_RELATIVE_METRICS;
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
	private FNCXUnitBase(int value, String name, String literal) {
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
	
} //FNCXUnitBase
