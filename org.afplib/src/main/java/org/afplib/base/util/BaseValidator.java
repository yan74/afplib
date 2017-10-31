/**
 */
package org.afplib.base.util;

import java.nio.charset.Charset;

import java.util.Map;

import org.afplib.base.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.afplib.base.BasePackage
 * @generated
 */
public class BaseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BaseValidator INSTANCE = new BaseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.afplib.base";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BasePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BasePackage.AFP:
				return validateAFP((AFP)value, diagnostics, context);
			case BasePackage.SF:
				return validateSF((SF)value, diagnostics, context);
			case BasePackage.UNKNSF:
				return validateUNKNSF((UNKNSF)value, diagnostics, context);
			case BasePackage.SF_GROUPER:
				return validateSFGrouper((SFGrouper)value, diagnostics, context);
			case BasePackage.TRIPLET:
				return validateTriplet((Triplet)value, diagnostics, context);
			case BasePackage.MODCA_STRING:
				return validateModcaString((String)value, diagnostics, context);
			case BasePackage.MODCA_STRING4:
				return validateModcaString4((String)value, diagnostics, context);
			case BasePackage.MODCA_STRING8:
				return validateModcaString8((String)value, diagnostics, context);
			case BasePackage.MODCA_STRING32:
				return validateModcaString32((String)value, diagnostics, context);
			case BasePackage.CHARSET:
				return validateCharset((Charset)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAFP(AFP afp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSF(SF sf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUNKNSF(UNKNSF unknsf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unknsf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSFGrouper(SFGrouper sfGrouper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sfGrouper, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriplet(Triplet triplet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triplet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString(String modcaString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString4(String modcaString4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModcaString4_MinLength(modcaString4, diagnostics, context);
		if (result || diagnostics != null) result &= validateModcaString4_MaxLength(modcaString4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Modca String4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString4_MinLength(String modcaString4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = modcaString4.length();
		boolean result = length >= 4;
		if (!result && diagnostics != null)
			reportMinLengthViolation(BasePackage.Literals.MODCA_STRING4, modcaString4, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Modca String4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString4_MaxLength(String modcaString4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = modcaString4.length();
		boolean result = length <= 4;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(BasePackage.Literals.MODCA_STRING4, modcaString4, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString8(String modcaString8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModcaString8_MinLength(modcaString8, diagnostics, context);
		if (result || diagnostics != null) result &= validateModcaString8_MaxLength(modcaString8, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Modca String8</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString8_MinLength(String modcaString8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = modcaString8.length();
		boolean result = length >= 8;
		if (!result && diagnostics != null)
			reportMinLengthViolation(BasePackage.Literals.MODCA_STRING8, modcaString8, length, 8, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Modca String8</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString8_MaxLength(String modcaString8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = modcaString8.length();
		boolean result = length <= 8;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(BasePackage.Literals.MODCA_STRING8, modcaString8, length, 8, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString32(String modcaString32, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModcaString32_MinLength(modcaString32, diagnostics, context);
		if (result || diagnostics != null) result &= validateModcaString32_MaxLength(modcaString32, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Modca String32</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString32_MinLength(String modcaString32, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = modcaString32.length();
		boolean result = length >= 32;
		if (!result && diagnostics != null)
			reportMinLengthViolation(BasePackage.Literals.MODCA_STRING32, modcaString32, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Modca String32</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModcaString32_MaxLength(String modcaString32, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = modcaString32.length();
		boolean result = length <= 32;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(BasePackage.Literals.MODCA_STRING32, modcaString32, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharset(Charset charset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BaseValidator
