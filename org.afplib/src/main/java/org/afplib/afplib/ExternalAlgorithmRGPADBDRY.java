/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>External Algorithm RGPADBDRY</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithmRGPADBDRY()
 * @model
 * @generated
 */
public enum ExternalAlgorithmRGPADBDRY implements Enumerator {
	/**
     * The '<em><b>Const32bitboundary</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST32BITBOUNDARY_VALUE
     * @generated
     * @ordered
     */
	CONST32BITBOUNDARY(3, "Const32bitboundary", "Const32bitboundary");

	/**
     * The '<em><b>Const32bitboundary</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const32bitboundary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST32BITBOUNDARY
     * @model name="Const32bitboundary"
     * @generated
     * @ordered
     */
	public static final int CONST32BITBOUNDARY_VALUE = 3;

	/**
     * An array of all the '<em><b>External Algorithm RGPADBDRY</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ExternalAlgorithmRGPADBDRY[] VALUES_ARRAY =
		new ExternalAlgorithmRGPADBDRY[] {
            CONST32BITBOUNDARY,
        };

	/**
     * A public read-only list of all the '<em><b>External Algorithm RGPADBDRY</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ExternalAlgorithmRGPADBDRY> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>External Algorithm RGPADBDRY</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ExternalAlgorithmRGPADBDRY get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ExternalAlgorithmRGPADBDRY result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>External Algorithm RGPADBDRY</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ExternalAlgorithmRGPADBDRY getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ExternalAlgorithmRGPADBDRY result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>External Algorithm RGPADBDRY</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ExternalAlgorithmRGPADBDRY get(int value) {
        switch (value) {
            case CONST32BITBOUNDARY_VALUE: return CONST32BITBOUNDARY;
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
	private ExternalAlgorithmRGPADBDRY(int value, String name, String literal) {
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
	
} //ExternalAlgorithmRGPADBDRY
