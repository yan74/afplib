/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Device Appearance Dev App</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getDeviceAppearanceDevApp()
 * @model
 * @generated
 */
public enum DeviceAppearanceDevApp implements Enumerator {
	/**
	 * The '<em><b>Const Device Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DEVICE_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DEVICE_DEFAULT(0, "ConstDeviceDefault", "ConstDeviceDefault"),

	/**
	 * The '<em><b>Const Device Default Monochrome</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DEVICE_DEFAULT_MONOCHROME_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DEVICE_DEFAULT_MONOCHROME(1, "ConstDeviceDefaultMonochrome", "ConstDeviceDefaultMonochrome");

	/**
	 * The '<em><b>Const Device Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Device Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DEVICE_DEFAULT
	 * @model name="ConstDeviceDefault"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DEVICE_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Const Device Default Monochrome</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Device Default Monochrome</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DEVICE_DEFAULT_MONOCHROME
	 * @model name="ConstDeviceDefaultMonochrome"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DEVICE_DEFAULT_MONOCHROME_VALUE = 1;

	/**
	 * An array of all the '<em><b>Device Appearance Dev App</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceAppearanceDevApp[] VALUES_ARRAY =
		new DeviceAppearanceDevApp[] {
			CONST_DEVICE_DEFAULT,
			CONST_DEVICE_DEFAULT_MONOCHROME,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Appearance Dev App</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceAppearanceDevApp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Appearance Dev App</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviceAppearanceDevApp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceAppearanceDevApp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Appearance Dev App</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviceAppearanceDevApp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceAppearanceDevApp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Appearance Dev App</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviceAppearanceDevApp get(int value) {
		switch (value) {
			case CONST_DEVICE_DEFAULT_VALUE: return CONST_DEVICE_DEFAULT;
			case CONST_DEVICE_DEFAULT_MONOCHROME_VALUE: return CONST_DEVICE_DEFAULT_MONOCHROME;
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
	private DeviceAppearanceDevApp(int value, String name, String literal) {
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
	
} //DeviceAppearanceDevApp
