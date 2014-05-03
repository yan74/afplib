/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Presentation Control PRS Flg</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getPresentationControlPRSFlg()
 * @model
 * @generated
 */
public enum PresentationControlPRSFlg implements Enumerator {
	/**
	 * The '<em><b>Objectviewcontrol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECTVIEWCONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECTVIEWCONTROL(1, "Objectviewcontrol", "Objectviewcontrol"),

	/**
	 * The '<em><b>Objectindexingcontrol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECTINDEXINGCONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECTINDEXINGCONTROL(2, "Objectindexingcontrol", "Objectindexingcontrol");

	/**
	 * The '<em><b>Objectviewcontrol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Objectviewcontrol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECTVIEWCONTROL
	 * @model name="Objectviewcontrol"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECTVIEWCONTROL_VALUE = 1;

	/**
	 * The '<em><b>Objectindexingcontrol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Objectindexingcontrol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECTINDEXINGCONTROL
	 * @model name="Objectindexingcontrol"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECTINDEXINGCONTROL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Presentation Control PRS Flg</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PresentationControlPRSFlg[] VALUES_ARRAY =
		new PresentationControlPRSFlg[] {
			OBJECTVIEWCONTROL,
			OBJECTINDEXINGCONTROL,
		};

	/**
	 * A public read-only list of all the '<em><b>Presentation Control PRS Flg</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PresentationControlPRSFlg> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Presentation Control PRS Flg</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationControlPRSFlg get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresentationControlPRSFlg result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presentation Control PRS Flg</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationControlPRSFlg getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresentationControlPRSFlg result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presentation Control PRS Flg</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationControlPRSFlg get(int value) {
		switch (value) {
			case OBJECTVIEWCONTROL_VALUE: return OBJECTVIEWCONTROL;
			case OBJECTINDEXINGCONTROL_VALUE: return OBJECTINDEXINGCONTROL;
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
	private PresentationControlPRSFlg(int value, String name, String literal) {
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
	
} //PresentationControlPRSFlg
