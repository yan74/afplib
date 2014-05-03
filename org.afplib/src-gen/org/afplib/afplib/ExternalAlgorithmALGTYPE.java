/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>External Algorithm ALGTYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithmALGTYPE()
 * @model
 * @generated
 */
public enum ExternalAlgorithmALGTYPE implements Enumerator {
	/**
	 * The '<em><b>Const Recordingalgorithm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RECORDINGALGORITHM_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RECORDINGALGORITHM(0, "ConstRecordingalgorithm", "ConstRecordingalgorithm"),

	/**
	 * The '<em><b>Const Compressionalgorithm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_COMPRESSIONALGORITHM_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_COMPRESSIONALGORITHM(16, "ConstCompressionalgorithm", "ConstCompressionalgorithm");

	/**
	 * The '<em><b>Const Recordingalgorithm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Recordingalgorithm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_RECORDINGALGORITHM
	 * @model name="ConstRecordingalgorithm"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_RECORDINGALGORITHM_VALUE = 0;

	/**
	 * The '<em><b>Const Compressionalgorithm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Compressionalgorithm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_COMPRESSIONALGORITHM
	 * @model name="ConstCompressionalgorithm"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_COMPRESSIONALGORITHM_VALUE = 16;

	/**
	 * An array of all the '<em><b>External Algorithm ALGTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExternalAlgorithmALGTYPE[] VALUES_ARRAY =
		new ExternalAlgorithmALGTYPE[] {
			CONST_RECORDINGALGORITHM,
			CONST_COMPRESSIONALGORITHM,
		};

	/**
	 * A public read-only list of all the '<em><b>External Algorithm ALGTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExternalAlgorithmALGTYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>External Algorithm ALGTYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalAlgorithmALGTYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExternalAlgorithmALGTYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>External Algorithm ALGTYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalAlgorithmALGTYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExternalAlgorithmALGTYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>External Algorithm ALGTYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalAlgorithmALGTYPE get(int value) {
		switch (value) {
			case CONST_RECORDINGALGORITHM_VALUE: return CONST_RECORDINGALGORITHM;
			case CONST_COMPRESSIONALGORITHM_VALUE: return CONST_COMPRESSIONALGORITHM;
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
	private ExternalAlgorithmALGTYPE(int value, String name, String literal) {
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
	
} //ExternalAlgorithmALGTYPE
