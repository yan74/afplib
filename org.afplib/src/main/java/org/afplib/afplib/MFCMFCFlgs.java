/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MFCMFC Flgs</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getMFCMFCFlgs()
 * @model
 * @generated
 */
public enum MFCMFCFlgs implements Enumerator {
	/**
	 * The '<em><b>Activate Medium Finish Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE_MEDIUM_FINISH_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATE_MEDIUM_FINISH_CONTROL(1, "ActivateMediumFinishControl", "ActivateMediumFinishControl");

	/**
	 * The '<em><b>Activate Medium Finish Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Activate Medium Finish Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE_MEDIUM_FINISH_CONTROL
	 * @model name="ActivateMediumFinishControl"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATE_MEDIUM_FINISH_CONTROL_VALUE = 1;

	/**
	 * An array of all the '<em><b>MFCMFC Flgs</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MFCMFCFlgs[] VALUES_ARRAY =
		new MFCMFCFlgs[] {
			ACTIVATE_MEDIUM_FINISH_CONTROL,
		};

	/**
	 * A public read-only list of all the '<em><b>MFCMFC Flgs</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MFCMFCFlgs> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MFCMFC Flgs</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MFCMFCFlgs get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MFCMFCFlgs result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MFCMFC Flgs</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MFCMFCFlgs getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MFCMFCFlgs result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MFCMFC Flgs</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MFCMFCFlgs get(int value) {
		switch (value) {
			case ACTIVATE_MEDIUM_FINISH_CONTROL_VALUE: return ACTIVATE_MEDIUM_FINISH_CONTROL;
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
	private MFCMFCFlgs(int value, String name, String literal) {
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
	
} //MFCMFCFlgs
