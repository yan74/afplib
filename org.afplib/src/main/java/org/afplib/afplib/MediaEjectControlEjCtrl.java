/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Media Eject Control Ej Ctrl</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getMediaEjectControlEjCtrl()
 * @model
 * @generated
 */
public enum MediaEjectControlEjCtrl implements Enumerator {
	/**
	 * The '<em><b>Const Eject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_EJECT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_EJECT(1, "ConstEject", "ConstEject"),

	/**
	 * The '<em><b>Const Conditionalejecttonextpartition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CONDITIONALEJECTTONEXTPARTITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CONDITIONALEJECTTONEXTPARTITION(2, "ConstConditionalejecttonextpartition", "ConstConditionalejecttonextpartition"),

	/**
	 * The '<em><b>Const Conditionalejecttonextfrontsidepartition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CONDITIONALEJECTTONEXTFRONTSIDEPARTITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CONDITIONALEJECTTONEXTFRONTSIDEPARTITION(3, "ConstConditionalejecttonextfrontsidepartition", "ConstConditionalejecttonextfrontsidepartition"),

	/**
	 * The '<em><b>Const Conditionalejecttonextbacksidepartition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CONDITIONALEJECTTONEXTBACKSIDEPARTITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CONDITIONALEJECTTONEXTBACKSIDEPARTITION(4, "ConstConditionalejecttonextbacksidepartition", "ConstConditionalejecttonextbacksidepartition");

	/**
	 * The '<em><b>Const Eject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Eject</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_EJECT
	 * @model name="ConstEject"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_EJECT_VALUE = 1;

	/**
	 * The '<em><b>Const Conditionalejecttonextpartition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Conditionalejecttonextpartition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CONDITIONALEJECTTONEXTPARTITION
	 * @model name="ConstConditionalejecttonextpartition"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CONDITIONALEJECTTONEXTPARTITION_VALUE = 2;

	/**
	 * The '<em><b>Const Conditionalejecttonextfrontsidepartition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Conditionalejecttonextfrontsidepartition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CONDITIONALEJECTTONEXTFRONTSIDEPARTITION
	 * @model name="ConstConditionalejecttonextfrontsidepartition"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CONDITIONALEJECTTONEXTFRONTSIDEPARTITION_VALUE = 3;

	/**
	 * The '<em><b>Const Conditionalejecttonextbacksidepartition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Conditionalejecttonextbacksidepartition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CONDITIONALEJECTTONEXTBACKSIDEPARTITION
	 * @model name="ConstConditionalejecttonextbacksidepartition"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CONDITIONALEJECTTONEXTBACKSIDEPARTITION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Media Eject Control Ej Ctrl</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MediaEjectControlEjCtrl[] VALUES_ARRAY =
		new MediaEjectControlEjCtrl[] {
			CONST_EJECT,
			CONST_CONDITIONALEJECTTONEXTPARTITION,
			CONST_CONDITIONALEJECTTONEXTFRONTSIDEPARTITION,
			CONST_CONDITIONALEJECTTONEXTBACKSIDEPARTITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Media Eject Control Ej Ctrl</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MediaEjectControlEjCtrl> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Media Eject Control Ej Ctrl</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaEjectControlEjCtrl get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaEjectControlEjCtrl result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Eject Control Ej Ctrl</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaEjectControlEjCtrl getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaEjectControlEjCtrl result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Eject Control Ej Ctrl</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaEjectControlEjCtrl get(int value) {
		switch (value) {
			case CONST_EJECT_VALUE: return CONST_EJECT;
			case CONST_CONDITIONALEJECTTONEXTPARTITION_VALUE: return CONST_CONDITIONALEJECTTONEXTPARTITION;
			case CONST_CONDITIONALEJECTTONEXTFRONTSIDEPARTITION_VALUE: return CONST_CONDITIONALEJECTTONEXTFRONTSIDEPARTITION;
			case CONST_CONDITIONALEJECTTONEXTBACKSIDEPARTITION_VALUE: return CONST_CONDITIONALEJECTTONEXTBACKSIDEPARTITION;
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
	private MediaEjectControlEjCtrl(int value, String name, String literal) {
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
	
} //MediaEjectControlEjCtrl
