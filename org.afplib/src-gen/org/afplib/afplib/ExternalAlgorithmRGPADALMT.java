/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>External Algorithm RGPADALMT</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithmRGPADALMT()
 * @model
 * @generated
 */
public enum ExternalAlgorithmRGPADALMT implements Enumerator {
	/**
	 * The '<em><b>Const Dataleftaligned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DATALEFTALIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DATALEFTALIGNED(0, "ConstDataleftaligned", "ConstDataleftaligned");

	/**
	 * The '<em><b>Const Dataleftaligned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Dataleftaligned</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DATALEFTALIGNED
	 * @model name="ConstDataleftaligned"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DATALEFTALIGNED_VALUE = 0;

	/**
	 * An array of all the '<em><b>External Algorithm RGPADALMT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExternalAlgorithmRGPADALMT[] VALUES_ARRAY =
		new ExternalAlgorithmRGPADALMT[] {
			CONST_DATALEFTALIGNED,
		};

	/**
	 * A public read-only list of all the '<em><b>External Algorithm RGPADALMT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExternalAlgorithmRGPADALMT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>External Algorithm RGPADALMT</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalAlgorithmRGPADALMT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExternalAlgorithmRGPADALMT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>External Algorithm RGPADALMT</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalAlgorithmRGPADALMT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExternalAlgorithmRGPADALMT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>External Algorithm RGPADALMT</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalAlgorithmRGPADALMT get(int value) {
		switch (value) {
			case CONST_DATALEFTALIGNED_VALUE: return CONST_DATALEFTALIGNED;
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
	private ExternalAlgorithmRGPADALMT(int value, String name, String literal) {
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
	
} //ExternalAlgorithmRGPADALMT
