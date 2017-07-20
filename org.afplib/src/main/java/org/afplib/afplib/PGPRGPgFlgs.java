/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PGPRG Pg Flgs</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getPGPRGPgFlgs()
 * @model
 * @generated
 */
public enum PGPRGPgFlgs implements Enumerator {
	/**
     * The '<em><b>Variable Page Data</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #VARIABLE_PAGE_DATA_VALUE
     * @generated
     * @ordered
     */
	VARIABLE_PAGE_DATA(128, "VariablePageData", "VariablePageData"),

	/**
     * The '<em><b>PMC Overlays</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PMC_OVERLAYS_VALUE
     * @generated
     * @ordered
     */
	PMC_OVERLAYS(64, "PMCOverlays", "PMCOverlays"),

	/**
     * The '<em><b>PMC Overlay Position</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PMC_OVERLAY_POSITION_VALUE
     * @generated
     * @ordered
     */
	PMC_OVERLAY_POSITION(32, "PMCOverlayPosition", "PMCOverlayPosition"),

	/**
     * The '<em><b>Page View Control</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PAGE_VIEW_CONTROL_VALUE
     * @generated
     * @ordered
     */
	PAGE_VIEW_CONTROL(16, "PageViewControl", "PageViewControl");

	/**
     * The '<em><b>Variable Page Data</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variable Page Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #VARIABLE_PAGE_DATA
     * @model name="VariablePageData"
     * @generated
     * @ordered
     */
	public static final int VARIABLE_PAGE_DATA_VALUE = 128;

	/**
     * The '<em><b>PMC Overlays</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PMC Overlays</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PMC_OVERLAYS
     * @model name="PMCOverlays"
     * @generated
     * @ordered
     */
	public static final int PMC_OVERLAYS_VALUE = 64;

	/**
     * The '<em><b>PMC Overlay Position</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PMC Overlay Position</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PMC_OVERLAY_POSITION
     * @model name="PMCOverlayPosition"
     * @generated
     * @ordered
     */
	public static final int PMC_OVERLAY_POSITION_VALUE = 32;

	/**
     * The '<em><b>Page View Control</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page View Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PAGE_VIEW_CONTROL
     * @model name="PageViewControl"
     * @generated
     * @ordered
     */
	public static final int PAGE_VIEW_CONTROL_VALUE = 16;

	/**
     * An array of all the '<em><b>PGPRG Pg Flgs</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final PGPRGPgFlgs[] VALUES_ARRAY =
		new PGPRGPgFlgs[] {
            VARIABLE_PAGE_DATA,
            PMC_OVERLAYS,
            PMC_OVERLAY_POSITION,
            PAGE_VIEW_CONTROL,
        };

	/**
     * A public read-only list of all the '<em><b>PGPRG Pg Flgs</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<PGPRGPgFlgs> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>PGPRG Pg Flgs</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static PGPRGPgFlgs get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PGPRGPgFlgs result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>PGPRG Pg Flgs</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static PGPRGPgFlgs getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PGPRGPgFlgs result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>PGPRG Pg Flgs</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static PGPRGPgFlgs get(int value) {
        switch (value) {
            case VARIABLE_PAGE_DATA_VALUE: return VARIABLE_PAGE_DATA;
            case PMC_OVERLAYS_VALUE: return PMC_OVERLAYS;
            case PMC_OVERLAY_POSITION_VALUE: return PMC_OVERLAY_POSITION;
            case PAGE_VIEW_CONTROL_VALUE: return PAGE_VIEW_CONTROL;
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
	private PGPRGPgFlgs(int value, String name, String literal) {
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
	
} //PGPRGPgFlgs
