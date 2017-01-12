/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Toner Saver TSv Ctrl</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getTonerSaverTSvCtrl()
 * @model
 * @generated
 */
public enum TonerSaverTSvCtrl implements Enumerator {
	/**
	 * The '<em><b>Const Deactivate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DEACTIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DEACTIVATE(0, "ConstDeactivate", "ConstDeactivate"),

	/**
	 * The '<em><b>Const Activate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_ACTIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_ACTIVATE(1, "ConstActivate", "ConstActivate"),

	/**
	 * The '<em><b>Const Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DEFAULT(255, "ConstDefault", "ConstDefault");

	/**
	 * The '<em><b>Const Deactivate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Deactivate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DEACTIVATE
	 * @model name="ConstDeactivate"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DEACTIVATE_VALUE = 0;

	/**
	 * The '<em><b>Const Activate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Activate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_ACTIVATE
	 * @model name="ConstActivate"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_ACTIVATE_VALUE = 1;

	/**
	 * The '<em><b>Const Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DEFAULT
	 * @model name="ConstDefault"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DEFAULT_VALUE = 255;

	/**
	 * An array of all the '<em><b>Toner Saver TSv Ctrl</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TonerSaverTSvCtrl[] VALUES_ARRAY =
		new TonerSaverTSvCtrl[] {
			CONST_DEACTIVATE,
			CONST_ACTIVATE,
			CONST_DEFAULT,
		};

	/**
	 * A public read-only list of all the '<em><b>Toner Saver TSv Ctrl</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TonerSaverTSvCtrl> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Toner Saver TSv Ctrl</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TonerSaverTSvCtrl get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TonerSaverTSvCtrl result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Toner Saver TSv Ctrl</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TonerSaverTSvCtrl getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TonerSaverTSvCtrl result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Toner Saver TSv Ctrl</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TonerSaverTSvCtrl get(int value) {
		switch (value) {
			case CONST_DEACTIVATE_VALUE: return CONST_DEACTIVATE;
			case CONST_ACTIVATE_VALUE: return CONST_ACTIVATE;
			case CONST_DEFAULT_VALUE: return CONST_DEFAULT;
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
	private TonerSaverTSvCtrl(int value, String name, String literal) {
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
	
} //TonerSaverTSvCtrl
