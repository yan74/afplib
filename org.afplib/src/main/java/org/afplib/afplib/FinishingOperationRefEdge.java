/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Finishing Operation Ref Edge</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFinishingOperationRefEdge()
 * @model
 * @generated
 */
public enum FinishingOperationRefEdge implements Enumerator {
	/**
     * The '<em><b>Const Bottom Right Corner Bottom Edge</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_BOTTOM_RIGHT_CORNER_BOTTOM_EDGE_VALUE
     * @generated
     * @ordered
     */
	CONST_BOTTOM_RIGHT_CORNER_BOTTOM_EDGE(0, "ConstBottomRightCornerBottomEdge", "ConstBottomRightCornerBottomEdge"),

	/**
     * The '<em><b>Const Top Right Corner Right Edge</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_TOP_RIGHT_CORNER_RIGHT_EDGE_VALUE
     * @generated
     * @ordered
     */
	CONST_TOP_RIGHT_CORNER_RIGHT_EDGE(1, "ConstTopRightCornerRightEdge", "ConstTopRightCornerRightEdge"),

	/**
     * The '<em><b>Const Top Left Corner Top Edge</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_TOP_LEFT_CORNER_TOP_EDGE_VALUE
     * @generated
     * @ordered
     */
	CONST_TOP_LEFT_CORNER_TOP_EDGE(2, "ConstTopLeftCornerTopEdge", "ConstTopLeftCornerTopEdge"),

	/**
     * The '<em><b>Const Bottom Left Corner Left Edge</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_BOTTOM_LEFT_CORNER_LEFT_EDGE_VALUE
     * @generated
     * @ordered
     */
	CONST_BOTTOM_LEFT_CORNER_LEFT_EDGE(3, "ConstBottomLeftCornerLeftEdge", "ConstBottomLeftCornerLeftEdge"),

	/**
     * The '<em><b>Const Device Default</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_DEVICE_DEFAULT_VALUE
     * @generated
     * @ordered
     */
	CONST_DEVICE_DEFAULT(255, "ConstDeviceDefault", "ConstDeviceDefault");

	/**
     * The '<em><b>Const Bottom Right Corner Bottom Edge</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Bottom Right Corner Bottom Edge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_BOTTOM_RIGHT_CORNER_BOTTOM_EDGE
     * @model name="ConstBottomRightCornerBottomEdge"
     * @generated
     * @ordered
     */
	public static final int CONST_BOTTOM_RIGHT_CORNER_BOTTOM_EDGE_VALUE = 0;

	/**
     * The '<em><b>Const Top Right Corner Right Edge</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Top Right Corner Right Edge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_TOP_RIGHT_CORNER_RIGHT_EDGE
     * @model name="ConstTopRightCornerRightEdge"
     * @generated
     * @ordered
     */
	public static final int CONST_TOP_RIGHT_CORNER_RIGHT_EDGE_VALUE = 1;

	/**
     * The '<em><b>Const Top Left Corner Top Edge</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Top Left Corner Top Edge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_TOP_LEFT_CORNER_TOP_EDGE
     * @model name="ConstTopLeftCornerTopEdge"
     * @generated
     * @ordered
     */
	public static final int CONST_TOP_LEFT_CORNER_TOP_EDGE_VALUE = 2;

	/**
     * The '<em><b>Const Bottom Left Corner Left Edge</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Bottom Left Corner Left Edge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_BOTTOM_LEFT_CORNER_LEFT_EDGE
     * @model name="ConstBottomLeftCornerLeftEdge"
     * @generated
     * @ordered
     */
	public static final int CONST_BOTTOM_LEFT_CORNER_LEFT_EDGE_VALUE = 3;

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
	public static final int CONST_DEVICE_DEFAULT_VALUE = 255;

	/**
     * An array of all the '<em><b>Finishing Operation Ref Edge</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final FinishingOperationRefEdge[] VALUES_ARRAY =
		new FinishingOperationRefEdge[] {
            CONST_BOTTOM_RIGHT_CORNER_BOTTOM_EDGE,
            CONST_TOP_RIGHT_CORNER_RIGHT_EDGE,
            CONST_TOP_LEFT_CORNER_TOP_EDGE,
            CONST_BOTTOM_LEFT_CORNER_LEFT_EDGE,
            CONST_DEVICE_DEFAULT,
        };

	/**
     * A public read-only list of all the '<em><b>Finishing Operation Ref Edge</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<FinishingOperationRefEdge> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Finishing Operation Ref Edge</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FinishingOperationRefEdge get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FinishingOperationRefEdge result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Finishing Operation Ref Edge</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FinishingOperationRefEdge getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FinishingOperationRefEdge result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Finishing Operation Ref Edge</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FinishingOperationRefEdge get(int value) {
        switch (value) {
            case CONST_BOTTOM_RIGHT_CORNER_BOTTOM_EDGE_VALUE: return CONST_BOTTOM_RIGHT_CORNER_BOTTOM_EDGE;
            case CONST_TOP_RIGHT_CORNER_RIGHT_EDGE_VALUE: return CONST_TOP_RIGHT_CORNER_RIGHT_EDGE;
            case CONST_TOP_LEFT_CORNER_TOP_EDGE_VALUE: return CONST_TOP_LEFT_CORNER_TOP_EDGE;
            case CONST_BOTTOM_LEFT_CORNER_LEFT_EDGE_VALUE: return CONST_BOTTOM_LEFT_CORNER_LEFT_EDGE;
            case CONST_DEVICE_DEFAULT_VALUE: return CONST_DEVICE_DEFAULT;
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
	private FinishingOperationRefEdge(int value, String name, String literal) {
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
	
} //FinishingOperationRefEdge
