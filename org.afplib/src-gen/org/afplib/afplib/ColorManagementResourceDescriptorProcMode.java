/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Management Resource Descriptor Proc Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getColorManagementResourceDescriptorProcMode()
 * @model
 * @generated
 */
public enum ColorManagementResourceDescriptorProcMode implements Enumerator {
	/**
	 * The '<em><b>Const Audit CMR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_AUDIT_CMR_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_AUDIT_CMR(1, "ConstAuditCMR", "ConstAuditCMR"),

	/**
	 * The '<em><b>Const Instruction CMR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_INSTRUCTION_CMR_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_INSTRUCTION_CMR(2, "ConstInstructionCMR", "ConstInstructionCMR"),

	/**
	 * The '<em><b>Const Link CMR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_LINK_CMR_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_LINK_CMR(3, "ConstLinkCMR", "ConstLinkCMR");

	/**
	 * The '<em><b>Const Audit CMR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Audit CMR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_AUDIT_CMR
	 * @model name="ConstAuditCMR"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_AUDIT_CMR_VALUE = 1;

	/**
	 * The '<em><b>Const Instruction CMR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Instruction CMR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_INSTRUCTION_CMR
	 * @model name="ConstInstructionCMR"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_INSTRUCTION_CMR_VALUE = 2;

	/**
	 * The '<em><b>Const Link CMR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Link CMR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_LINK_CMR
	 * @model name="ConstLinkCMR"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_LINK_CMR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Color Management Resource Descriptor Proc Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColorManagementResourceDescriptorProcMode[] VALUES_ARRAY =
		new ColorManagementResourceDescriptorProcMode[] {
			CONST_AUDIT_CMR,
			CONST_INSTRUCTION_CMR,
			CONST_LINK_CMR,
		};

	/**
	 * A public read-only list of all the '<em><b>Color Management Resource Descriptor Proc Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ColorManagementResourceDescriptorProcMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color Management Resource Descriptor Proc Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorManagementResourceDescriptorProcMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorManagementResourceDescriptorProcMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Management Resource Descriptor Proc Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorManagementResourceDescriptorProcMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorManagementResourceDescriptorProcMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Management Resource Descriptor Proc Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorManagementResourceDescriptorProcMode get(int value) {
		switch (value) {
			case CONST_AUDIT_CMR_VALUE: return CONST_AUDIT_CMR;
			case CONST_INSTRUCTION_CMR_VALUE: return CONST_INSTRUCTION_CMR;
			case CONST_LINK_CMR_VALUE: return CONST_LINK_CMR;
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
	private ColorManagementResourceDescriptorProcMode(int value, String name, String literal) {
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
	
} //ColorManagementResourceDescriptorProcMode
