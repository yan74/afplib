/**
 */
package org.afplib.afplib.impl;

import java.io.IOException;

import java.net.URL;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.AfplibPackage;

import org.afplib.base.BasePackage;

import org.afplib.base.impl.BasePackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AfplibPackageImpl extends EPackageImpl implements AfplibPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected String packageFilename = "afplib.ecore";

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass lineDataEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bagEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bbcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bcaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bcfEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bcpEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bdaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bddEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bdgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bdiEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bdmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bdtEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bdxEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bfgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bfmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bfnEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bgrEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass biiEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bimEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bmmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bmoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bngEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bocEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bogEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bpfEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bpgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bpmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bpsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bptEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass brgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass brsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bsgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass catEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cddEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cfcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cfiEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cpcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cpdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cpiEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ctcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dxdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass eagEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ebcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ecaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ecfEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ecpEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass edgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ediEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass edmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass edtEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass edxEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass efgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass efmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass efnEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass egrEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass eiiEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass eimEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass emmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass emoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass engEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass eocEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass eogEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass epfEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass epgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass epmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass epsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass eptEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ergEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ersEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass esgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fncEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fndEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fngEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fniEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnnEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnpEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gadEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gddEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass icpEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass iddEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ielEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass iidEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass immEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass iobEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass iocEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ipdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ipgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ipoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ipsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass irdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass lleEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass lncEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass lndEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mbcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mcaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mccEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mcdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mcfEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mcf1EClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mddEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mdrEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mfcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mgoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mioEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mmcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mmdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mmoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mmtEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mpgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mpoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mpsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass msuEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass nopEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass obdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass obpEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ocdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pecEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pfcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pgdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pgpEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pgp1EClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pmcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ppoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ptdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ptd1EClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ptxEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tleEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fgdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ambEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass amiEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass blnEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bsuEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dbrEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dirEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass esuEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass nopcsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ovsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass rmbEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass rmiEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass rpsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sbiEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass scflEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass secEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass siaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass simEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass stcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass stoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sviEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tbmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass trnEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass uscEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass attributeQualifierEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass attributeValueEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cgcsgidEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass crcResourceManagementEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass characterRotationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass colorSpecificationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass commentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dataObjectFontDescriptorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass descriptorPositionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass encodingSchemeIDEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fontResolutionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fullyQualifiedNameEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass localDateAndTimeStampEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass universalDateAndTimeStampEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mappingOptionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mediaEjectControlEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mediumMapPageNumberEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mediumOrientationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass measurementUnitsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass modcaInterchangeSetEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectAreaSizeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectClassificationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectFunctionSetSpecificationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectOffsetEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resourceObjectTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pagePositionInformationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass presentationControlEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass presentationSpaceResetMixingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass presentationSpaceMixingRulesEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resourceLocalIdentifierEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resourceSectionNumberEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass textOrientationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fontHorizontalScaleFactorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fontDescriptorSpecificationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass beginSegmentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass endSegmentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass beginTileEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass endTileEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass beginTransparencyMaskEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass endTransparencyMaskEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass beginImageEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass endImageEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass imageSizeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass imageEncodingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ideSizeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass imageLUTIDEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bandImageEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ideStructureEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass externalAlgorithmEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tilePositionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tileSizeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tileSetColorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass setBiLevelImageColorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass iocaFunctionSetIdentificationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass imageDataEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bandImageDataEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass includeTileEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass imageSubsamplingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass samplingRatiosEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tileTOCEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cpirgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cfirgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnirgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnmrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass llergEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mpsrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mcfrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mbcrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mcargEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mcdrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mdrrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mgorgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass miorgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mmdrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mmtrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mpgrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mporgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pporgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pgprgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mccrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mmorgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bandImageRGEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mcf1RGEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mmcrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnorgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnprgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tileTOCRGEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass samplingRatiosRGEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass externalAlgorithmRGEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnnrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fnnrg2EClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass beginSegmentCommandEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass endSegmentCommandEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gbarEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gbimgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcbimgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gboxEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcboxEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gchstEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcchstEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcomtEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gearEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass geimgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass geprolEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gfltEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcfltEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gfarcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcfarcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gimdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass glineEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gclineEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gmrkEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcmrkEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gnop1EClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gparcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcparcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass grlineEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcrlineEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsgchEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsapEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsbmxEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gscaEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsccEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gscdEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gscrEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gscsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gschEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gscolEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gscpEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsecolEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsflwEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsltEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gslwEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsmcEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsmpEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsmsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsmtEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsmxEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gspsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsptEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gspcolEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsleEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gsljEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcbezEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gccbezEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass windowSpecificationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass drawingOrderSubsetEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcbezrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gccbezrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gfltrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcfltrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass glinergEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gclinergEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gmrkrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcmrkrgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass grlinergEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gcrlinergEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tonerSaverEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass colorFidelityEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fontFidelityEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass textFidelityEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mediaFidelityEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass finishingFidelityEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cmrFidelityEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectByteExtentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectByteOffsetEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectStructuredFieldExtentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectStructuredFieldOffsetEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectCountEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectOriginIdentifierEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass lineDataObjectPositionMigrationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass colorManagementResourceDescriptorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass msurgEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass imageResolutionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass objectContainerPresentationSpaceSizeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass extendedResourceLocalIdentifierEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass metricAdjustmentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass extensionFontEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass renderingIntentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fontCodedGraphicCharacterSetGlobalIdentifierEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass localeSelectorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass finishingOperationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass up3iFinishingOperationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass deviceAppearanceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resourceObjectIncludeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pageOverlayConditionalProcessingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resourceUsageAttributeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum bdaFlagsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum bddubaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum bddReservedEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum bddReserved2EEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum bddtypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum bddcolorEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum bdmDatFmtEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cddXocBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cddYocBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cfccfirgLenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cfcRetired1EEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cpcPrtFlagsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cpccpirgLenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cpcvsFlagsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cpdgcgidLenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cpdEncSchemeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncRetiredEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncPatTechEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncFntFlagsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncxUnitBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncyUnitBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncXftUnitsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncYftUnitsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncfnorgLenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncfnirgLenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncPatAlignEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncfnprgLenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncfnmrgLenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncResXUBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncResYUBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncXfrUnitsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncYfrUnitsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fncfnnrgLenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fndFtWtClassEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fndFtWdClassEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fndFtDsFlagsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum iddunitbaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum iobObjTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum iobXoaOrentEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum iobYoaOrentEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum iobRefCSysEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum ipgiPgFlgsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum ipoOvlyOrentEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mddXmBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mddYmBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mddmddFlgsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mfcmfcFlgsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mfcMedCollEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mfcmfcScpeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mmcparameter1EEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mmorgLengthEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mpsrgLengthEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum obprgLengthEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum obpXoaOrentEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum obpYoaOrentEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum obpXocaOrentEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum obpYocaOrentEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum obpRefCSysEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pfcpfcFlgsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pgdXpgBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pgdYpgBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pgpConstantEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum ptdxpbaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum ptdypbaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum ptd1XPBASEEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum ptd1YPBASEEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum ovsbypsidenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum seccolspceEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum siadirctionEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum stcfrgcolorEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum stcprecsionEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum stoiorntionEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum stoborntionEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum tbmdirctionEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum tbmprecsionEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum uscbypsidenEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum crcResourceManagementFmtQualEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum colorSpecificationColSpceEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum dataObjectFontDescriptorFontTechEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum dataObjectFontDescriptorCharRotEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum dataObjectFontDescriptorEncEnvEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum dataObjectFontDescriptorEncIDEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum encodingSchemeIDESidCPEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum encodingSchemeIDESidUDEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fontResolutionMetTechEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fontResolutionRPuBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fontResolutionRPUnitsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fullyQualifiedNameFQNTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fullyQualifiedNameFQNFormatEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum localDateAndTimeStampStampTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mappingOptionMapValueEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mediaEjectControlReservedEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mediaEjectControlEjCtrlEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mediumOrientationMedOrientEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum measurementUnitsXoaBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum measurementUnitsYoaBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum modcaInterchangeSetIStypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum modcaInterchangeSetISidEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectAreaSizeSizeTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectClassificationObjClassEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectClassificationStrucFlgsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectFunctionSetSpecificationObjTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectFunctionSetSpecificationArchVrsnEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectFunctionSetSpecificationDCAFnSetEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectFunctionSetSpecificationOCAFnSetEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectOffsetObjTpeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum resourceObjectTypeObjTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum presentationControlPRSFlgEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum resourceLocalIdentifierResTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum textOrientationIAxisEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum textOrientationBAxisEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fontDescriptorSpecificationFtWtClassEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fontDescriptorSpecificationFtWdClassEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fontDescriptorSpecificationFtDsFlagsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fontDescriptorSpecificationFtUsFlagsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum imageEncodingCOMPRIDEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum imageEncodingRECIDEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum imageEncodingBITORDREEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum ideStructureFLAGSEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum externalAlgorithmALGTYPEEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum tileSetColorCSPACEEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pporgObjTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pporgProcFlgsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pgprgrgLengthEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pgprgpGorientEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pgprgsHsideEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pgprgPgFlgsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mmcrGkeyEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum externalAlgorithmRGPADBDRYEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum externalAlgorithmRGPADALMTEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum beginSegmentCommandLENGTHEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum beginSegmentCommandFLAG2EEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gbarflagsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gbimgformatEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gbimgresEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gcbimgformatEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gcbimgresEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gboxresEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gcboxresEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum geprolresEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gsbmxmodeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gscddirectionEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gscrprecEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gscolcolEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gsltlinetypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gsmpprecEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gsmtmcptEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gsmxmodeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gspslcidEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gsptpattEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gspcolcolspceEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gslelineendEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum gsljlinejoinEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum windowSpecificationFLAGSEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum windowSpecificationRES3EEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum windowSpecificationCFORMATEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum windowSpecificationUBASEEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum tonerSaverTSvCtrlEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum colorFidelityStpCoExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum colorFidelityRepCoExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum colorFidelityColSubEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum fontFidelityStpFntExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum textFidelityStpTxtExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum textFidelityRepTxtExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum mediaFidelityStpMedExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum finishingFidelityStpFinExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum finishingFidelityRepFinExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cmrFidelityStpCMRExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cmrFidelityRepCMRExEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectCountSubObjEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectOriginIdentifierSystemEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum lineDataObjectPositionMigrationTempOrientEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum colorManagementResourceDescriptorProcModeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum colorManagementResourceDescriptorCMRScpeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum imageResolutionXBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum imageResolutionYBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum objectContainerPresentationSpaceSizePDFSizeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum extendedResourceLocalIdentifierResTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum metricAdjustmentUnitBaseEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum renderingIntentReservedEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum renderingIntentIOCARIEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum renderingIntentOCRIEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum renderingIntentPTOCRIEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum renderingIntentGOCARIEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum renderingIntentReserved2EEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum finishingOperationFOpTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum finishingOperationRefEdgeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum deviceAppearanceDevAppEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum resourceObjectIncludeObjTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum resourceObjectIncludeObOrentEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum pageOverlayConditionalProcessingPgOvTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum resourceUsageAttributeFrequencyEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum sfNameEEnum = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.afplib.afplib.AfplibPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private AfplibPackageImpl() {
        super(eNS_URI, AfplibFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link AfplibPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
	public static AfplibPackage init() {
        if (isInited) return (AfplibPackage)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI);

        // Obtain or create and register package
        AfplibPackageImpl theAfplibPackage = (AfplibPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AfplibPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AfplibPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);

        // Load packages
        theAfplibPackage.loadPackage();

        // Create package meta-data objects
        theBasePackage.createPackageContents();

        // Initialize created meta-data
        theBasePackage.initializePackageContents();

        // Fix loaded packages
        theAfplibPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theAfplibPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(AfplibPackage.eNS_URI, theAfplibPackage);
        return theAfplibPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLineData() {
        if (lineDataEClass == null) {
            lineDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(0);
        }
        return lineDataEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLineData_Linedata() {
        return (EAttribute)getLineData().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBAG() {
        if (bagEClass == null) {
            bagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(193);
        }
        return bagEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBAG_AEGName() {
        return (EAttribute)getBAG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBAG_Triplets() {
        return (EReference)getBAG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBBC() {
        if (bbcEClass == null) {
            bbcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(194);
        }
        return bbcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBBC_BCdoName() {
        return (EAttribute)getBBC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBBC_Triplets() {
        return (EReference)getBBC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBCA() {
        if (bcaEClass == null) {
            bcaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(195);
        }
        return bcaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBCA_CATName() {
        return (EAttribute)getBCA().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBCA_Triplets() {
        return (EReference)getBCA().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBCF() {
        if (bcfEClass == null) {
            bcfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(196);
        }
        return bcfEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBCF_RSName() {
        return (EAttribute)getBCF().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBCP() {
        if (bcpEClass == null) {
            bcpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(197);
        }
        return bcpEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBCP_RSName() {
        return (EAttribute)getBCP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBCP_Triplets() {
        return (EReference)getBCP().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBDA() {
        if (bdaEClass == null) {
            bdaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(198);
        }
        return bdaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDA_Flags() {
        return (EAttribute)getBDA().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDA_Xoffset() {
        return (EAttribute)getBDA().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDA_Yoffset() {
        return (EAttribute)getBDA().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDA_Data() {
        return (EAttribute)getBDA().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBDD() {
        if (bddEClass == null) {
            bddEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(199);
        }
        return bddEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_UBASE() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_Reserved() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_XUPUB() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_YUPUB() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_XEXTENT() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_YEXTENT() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_Reserved2() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_TYPE() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_MOD() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_LID() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_COLOR() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_MODULEWIDTH() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_ELEMENTHEIGHT() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_MULT() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDD_WENE() {
        return (EAttribute)getBDD().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBDD_Triplets() {
        return (EReference)getBDD().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBDG() {
        if (bdgEClass == null) {
            bdgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(200);
        }
        return bdgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDG_DEGName() {
        return (EAttribute)getBDG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBDG_Triplets() {
        return (EReference)getBDG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBDI() {
        if (bdiEClass == null) {
            bdiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(201);
        }
        return bdiEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDI_IndxName() {
        return (EAttribute)getBDI().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBDI_Triplets() {
        return (EReference)getBDI().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBDM() {
        if (bdmEClass == null) {
            bdmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(202);
        }
        return bdmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDM_DMName() {
        return (EAttribute)getBDM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDM_DatFmt() {
        return (EAttribute)getBDM().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBDM_Triplets() {
        return (EReference)getBDM().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBDT() {
        if (bdtEClass == null) {
            bdtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(203);
        }
        return bdtEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDT_DocName() {
        return (EAttribute)getBDT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDT_Reserved() {
        return (EAttribute)getBDT().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBDT_Triplets() {
        return (EReference)getBDT().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBDX() {
        if (bdxEClass == null) {
            bdxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(204);
        }
        return bdxEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBDX_DMXName() {
        return (EAttribute)getBDX().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBFG() {
        if (bfgEClass == null) {
            bfgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(205);
        }
        return bfgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBFG_FEGName() {
        return (EAttribute)getBFG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBFM() {
        if (bfmEClass == null) {
            bfmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(206);
        }
        return bfmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBFM_FMName() {
        return (EAttribute)getBFM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBFM_Triplets() {
        return (EReference)getBFM().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBFN() {
        if (bfnEClass == null) {
            bfnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(207);
        }
        return bfnEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBFN_RSName() {
        return (EAttribute)getBFN().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBFN_Triplets() {
        return (EReference)getBFN().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBGR() {
        if (bgrEClass == null) {
            bgrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(208);
        }
        return bgrEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBGR_GdoName() {
        return (EAttribute)getBGR().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBGR_Triplets() {
        return (EReference)getBGR().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBII() {
        if (biiEClass == null) {
            biiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(209);
        }
        return biiEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBII_ImoName() {
        return (EAttribute)getBII().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBIM() {
        if (bimEClass == null) {
            bimEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(210);
        }
        return bimEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBIM_IdoName() {
        return (EAttribute)getBIM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBIM_Triplets() {
        return (EReference)getBIM().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBMM() {
        if (bmmEClass == null) {
            bmmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(211);
        }
        return bmmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBMM_MMName() {
        return (EAttribute)getBMM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBMM_Triplets() {
        return (EReference)getBMM().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBMO() {
        if (bmoEClass == null) {
            bmoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(212);
        }
        return bmoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBMO_OvlyName() {
        return (EAttribute)getBMO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBMO_Triplets() {
        return (EReference)getBMO().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBNG() {
        if (bngEClass == null) {
            bngEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(213);
        }
        return bngEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBNG_PGrpName() {
        return (EAttribute)getBNG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBNG_Triplets() {
        return (EReference)getBNG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBOC() {
        if (bocEClass == null) {
            bocEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(214);
        }
        return bocEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBOC_ObjCName() {
        return (EAttribute)getBOC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBOC_Triplets() {
        return (EReference)getBOC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBOG() {
        if (bogEClass == null) {
            bogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(215);
        }
        return bogEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBOG_OEGName() {
        return (EAttribute)getBOG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBOG_Triplets() {
        return (EReference)getBOG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBPF() {
        if (bpfEClass == null) {
            bpfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(216);
        }
        return bpfEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBPF_PFName() {
        return (EAttribute)getBPF().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBPF_Triplets() {
        return (EReference)getBPF().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBPG() {
        if (bpgEClass == null) {
            bpgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(217);
        }
        return bpgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBPG_PageName() {
        return (EAttribute)getBPG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBPG_Triplets() {
        return (EReference)getBPG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBPM() {
        if (bpmEClass == null) {
            bpmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(218);
        }
        return bpmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBPM_PMName() {
        return (EAttribute)getBPM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBPS() {
        if (bpsEClass == null) {
            bpsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(219);
        }
        return bpsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBPS_PsegName() {
        return (EAttribute)getBPS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBPS_Triplets() {
        return (EReference)getBPS().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBPT() {
        if (bptEClass == null) {
            bptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(220);
        }
        return bptEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBPT_PTdoName() {
        return (EAttribute)getBPT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBPT_Triplets() {
        return (EReference)getBPT().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBRG() {
        if (brgEClass == null) {
            brgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(221);
        }
        return brgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBRG_RGrpName() {
        return (EAttribute)getBRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBRG_Triplets() {
        return (EReference)getBRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBRS() {
        if (brsEClass == null) {
            brsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(222);
        }
        return brsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBRS_RSName() {
        return (EAttribute)getBRS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBRS_Triplets() {
        return (EReference)getBRS().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBSG() {
        if (bsgEClass == null) {
            bsgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(223);
        }
        return bsgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBSG_REGName() {
        return (EAttribute)getBSG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBSG_Triplets() {
        return (EReference)getBSG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCAT() {
        if (catEClass == null) {
            catEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(224);
        }
        return catEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCAT_CATData() {
        return (EAttribute)getCAT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCDD() {
        if (cddEClass == null) {
            cddEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(225);
        }
        return cddEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCDD_XocBase() {
        return (EAttribute)getCDD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCDD_YocBase() {
        return (EAttribute)getCDD().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCDD_XocUnits() {
        return (EAttribute)getCDD().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCDD_YocUnits() {
        return (EAttribute)getCDD().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCDD_XocSize() {
        return (EAttribute)getCDD().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCDD_YocSize() {
        return (EAttribute)getCDD().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCDD_Triplets() {
        return (EReference)getCDD().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCFC() {
        if (cfcEClass == null) {
            cfcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(226);
        }
        return cfcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFC_CFIRGLen() {
        return (EAttribute)getCFC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFC_Retired1() {
        return (EAttribute)getCFC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCFC_Triplets() {
        return (EReference)getCFC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCFI() {
        if (cfiEClass == null) {
            cfiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(227);
        }
        return cfiEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCFI_FixedLengthRG() {
        return (EReference)getCFI().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPC() {
        if (cpcEClass == null) {
            cpcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(228);
        }
        return cpcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPC_DefCharID() {
        return (EAttribute)getCPC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPC_PrtFlags() {
        return (EAttribute)getCPC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPC_CPIRGLen() {
        return (EAttribute)getCPC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPC_VSCharSN() {
        return (EAttribute)getCPC().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPC_VSChar() {
        return (EAttribute)getCPC().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPC_VSFlags() {
        return (EAttribute)getCPC().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPD() {
        if (cpdEClass == null) {
            cpdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(229);
        }
        return cpdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPD_CPDesc() {
        return (EAttribute)getCPD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPD_GCGIDLen() {
        return (EAttribute)getCPD().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPD_NumCdPts() {
        return (EAttribute)getCPD().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPD_GCSGID() {
        return (EAttribute)getCPD().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPD_CPGID() {
        return (EAttribute)getCPD().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPD_EncScheme() {
        return (EAttribute)getCPD().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPI() {
        if (cpiEClass == null) {
            cpiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(230);
        }
        return cpiEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCPI_Rg() {
        return (EReference)getCPI().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCTC() {
        if (ctcEClass == null) {
            ctcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(231);
        }
        return ctcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCTC_ConData() {
        return (EAttribute)getCTC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDXD() {
        if (dxdEClass == null) {
            dxdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(232);
        }
        return dxdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEAG() {
        if (eagEClass == null) {
            eagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(233);
        }
        return eagEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEAG_AEGName() {
        return (EAttribute)getEAG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEBC() {
        if (ebcEClass == null) {
            ebcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(234);
        }
        return ebcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEBC_BCdoName() {
        return (EAttribute)getEBC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEBC_Triplets() {
        return (EReference)getEBC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getECA() {
        if (ecaEClass == null) {
            ecaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(235);
        }
        return ecaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getECA_CATName() {
        return (EAttribute)getECA().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getECA_Triplets() {
        return (EReference)getECA().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getECF() {
        if (ecfEClass == null) {
            ecfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(236);
        }
        return ecfEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getECF_RSName() {
        return (EAttribute)getECF().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getECP() {
        if (ecpEClass == null) {
            ecpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(237);
        }
        return ecpEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getECP_RSName() {
        return (EAttribute)getECP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEDG() {
        if (edgEClass == null) {
            edgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(238);
        }
        return edgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEDG_DEGName() {
        return (EAttribute)getEDG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEDI() {
        if (ediEClass == null) {
            ediEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(239);
        }
        return ediEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEDI_IndxName() {
        return (EAttribute)getEDI().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEDI_Triplets() {
        return (EReference)getEDI().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEDM() {
        if (edmEClass == null) {
            edmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(240);
        }
        return edmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEDM_DMName() {
        return (EAttribute)getEDM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEDT() {
        if (edtEClass == null) {
            edtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(241);
        }
        return edtEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEDT_DocName() {
        return (EAttribute)getEDT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEDT_Triplets() {
        return (EReference)getEDT().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEDX() {
        if (edxEClass == null) {
            edxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(242);
        }
        return edxEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEDX_DMXName() {
        return (EAttribute)getEDX().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEFG() {
        if (efgEClass == null) {
            efgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(243);
        }
        return efgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEFG_FEGName() {
        return (EAttribute)getEFG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEFM() {
        if (efmEClass == null) {
            efmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(244);
        }
        return efmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEFM_FMName() {
        return (EAttribute)getEFM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEFN() {
        if (efnEClass == null) {
            efnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(245);
        }
        return efnEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEFN_RSName() {
        return (EAttribute)getEFN().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEGR() {
        if (egrEClass == null) {
            egrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(246);
        }
        return egrEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEGR_GdoName() {
        return (EAttribute)getEGR().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEGR_Triplets() {
        return (EReference)getEGR().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEII() {
        if (eiiEClass == null) {
            eiiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(247);
        }
        return eiiEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEII_ImoName() {
        return (EAttribute)getEII().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEIM() {
        if (eimEClass == null) {
            eimEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(248);
        }
        return eimEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEIM_IdoName() {
        return (EAttribute)getEIM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEIM_Triplets() {
        return (EReference)getEIM().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEMM() {
        if (emmEClass == null) {
            emmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(249);
        }
        return emmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEMM_MMName() {
        return (EAttribute)getEMM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEMO() {
        if (emoEClass == null) {
            emoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(250);
        }
        return emoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEMO_OvlyName() {
        return (EAttribute)getEMO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEMO_Triplets() {
        return (EReference)getEMO().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getENG() {
        if (engEClass == null) {
            engEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(251);
        }
        return engEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getENG_PGrpName() {
        return (EAttribute)getENG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getENG_Triplets() {
        return (EReference)getENG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEOC() {
        if (eocEClass == null) {
            eocEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(252);
        }
        return eocEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEOC_ObjCName() {
        return (EAttribute)getEOC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEOC_Triplets() {
        return (EReference)getEOC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEOG() {
        if (eogEClass == null) {
            eogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(253);
        }
        return eogEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEOG_OEGName() {
        return (EAttribute)getEOG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEPF() {
        if (epfEClass == null) {
            epfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(254);
        }
        return epfEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEPF_PFName() {
        return (EAttribute)getEPF().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEPF_Triplets() {
        return (EReference)getEPF().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEPG() {
        if (epgEClass == null) {
            epgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(255);
        }
        return epgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEPG_PageName() {
        return (EAttribute)getEPG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEPG_Triplets() {
        return (EReference)getEPG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEPM() {
        if (epmEClass == null) {
            epmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(256);
        }
        return epmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEPM_PMName() {
        return (EAttribute)getEPM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEPS() {
        if (epsEClass == null) {
            epsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(257);
        }
        return epsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEPS_PsegName() {
        return (EAttribute)getEPS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEPT() {
        if (eptEClass == null) {
            eptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(258);
        }
        return eptEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEPT_PTdoName() {
        return (EAttribute)getEPT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEPT_Triplets() {
        return (EReference)getEPT().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getERG() {
        if (ergEClass == null) {
            ergEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(259);
        }
        return ergEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getERG_RGrpName() {
        return (EAttribute)getERG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getERG_Triplets() {
        return (EReference)getERG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getERS() {
        if (ersEClass == null) {
            ersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(260);
        }
        return ersEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getERS_RSName() {
        return (EAttribute)getERS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getESG() {
        if (esgEClass == null) {
            esgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(261);
        }
        return esgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getESG_REGName() {
        return (EAttribute)getESG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNC() {
        if (fncEClass == null) {
            fncEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(262);
        }
        return fncEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_Retired() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_PatTech() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_Reserved1() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_FntFlags() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_XUnitBase() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_YUnitBase() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_XftUnits() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_YftUnits() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_MaxBoxWd() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_MaxBoxHt() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_FNORGLen() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_FNIRGLen() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_PatAlign() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_RPatDCnt() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_FNPRGLen() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_FNMRGLen() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_ResXUBase() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_ResYUBase() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_XfrUnits() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_YfrUnits() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_OPatDCnt() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_Reserved2() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_FNNRGLen() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_FNNDCnt() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNC_FNNMapCnt() {
        return (EAttribute)getFNC().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFNC_Triplets() {
        return (EReference)getFNC().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFND() {
        if (fndEClass == null) {
            fndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(263);
        }
        return fndEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_TypeFcDesc() {
        return (EAttribute)getFND().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_FtWtClass() {
        return (EAttribute)getFND().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_FtWdClass() {
        return (EAttribute)getFND().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_MaxPtSize() {
        return (EAttribute)getFND().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_NomPtSize() {
        return (EAttribute)getFND().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_MinPtSize() {
        return (EAttribute)getFND().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_MaxHSize() {
        return (EAttribute)getFND().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_NomHSize() {
        return (EAttribute)getFND().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_MinHSize() {
        return (EAttribute)getFND().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_DsnGenCls() {
        return (EAttribute)getFND().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_DsnSubCls() {
        return (EAttribute)getFND().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_DsnSpcGrp() {
        return (EAttribute)getFND().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_Reserved1() {
        return (EAttribute)getFND().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_FtDsFlags() {
        return (EAttribute)getFND().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_Reserved2() {
        return (EAttribute)getFND().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_GCSID() {
        return (EAttribute)getFND().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFND_FGID() {
        return (EAttribute)getFND().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFND_Triplets() {
        return (EReference)getFND().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNG() {
        if (fngEClass == null) {
            fngEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(264);
        }
        return fngEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNG_PatData() {
        return (EAttribute)getFNG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNI() {
        if (fniEClass == null) {
            fniEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(265);
        }
        return fniEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFNI_Rg() {
        return (EReference)getFNI().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNN() {
        if (fnnEClass == null) {
            fnnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(266);
        }
        return fnnEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNN_FNNData() {
        return (EAttribute)getFNN().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNM() {
        if (fnmEClass == null) {
            fnmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(267);
        }
        return fnmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFNM_Rg() {
        return (EReference)getFNM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNO() {
        if (fnoEClass == null) {
            fnoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(268);
        }
        return fnoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFNO_Rg() {
        return (EReference)getFNO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNP() {
        if (fnpEClass == null) {
            fnpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(269);
        }
        return fnpEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFNP_Rg() {
        return (EReference)getFNP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGAD() {
        if (gadEClass == null) {
            gadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(270);
        }
        return gadEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGAD_GOCAdat() {
        return (EAttribute)getGAD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGDD() {
        if (gddEClass == null) {
            gddEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(271);
        }
        return gddEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGDD_GOCAdes() {
        return (EAttribute)getGDD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGDD_Commands() {
        return (EReference)getGDD().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getICP() {
        if (icpEClass == null) {
            icpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(272);
        }
        return icpEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getICP_XCOset() {
        return (EAttribute)getICP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getICP_YCOset() {
        return (EAttribute)getICP().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getICP_XCSize() {
        return (EAttribute)getICP().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getICP_YCSize() {
        return (EAttribute)getICP().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getICP_XFilSize() {
        return (EAttribute)getICP().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getICP_YFilSize() {
        return (EAttribute)getICP().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIDD() {
        if (iddEClass == null) {
            iddEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(273);
        }
        return iddEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDD_UNITBASE() {
        return (EAttribute)getIDD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDD_XRESOL() {
        return (EAttribute)getIDD().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDD_YRESOL() {
        return (EAttribute)getIDD().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDD_XSIZE() {
        return (EAttribute)getIDD().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDD_YSIZE() {
        return (EAttribute)getIDD().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIDD_SDFS() {
        return (EReference)getIDD().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIEL() {
        if (ielEClass == null) {
            ielEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(274);
        }
        return ielEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIEL_Triplets() {
        return (EReference)getIEL().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIID() {
        if (iidEClass == null) {
            iidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(275);
        }
        return iidEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_ConData1() {
        return (EAttribute)getIID().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_XBase() {
        return (EAttribute)getIID().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_YBase() {
        return (EAttribute)getIID().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_XUnits() {
        return (EAttribute)getIID().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_YUnits() {
        return (EAttribute)getIID().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_XSize() {
        return (EAttribute)getIID().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_YSize() {
        return (EAttribute)getIID().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_ConData2() {
        return (EAttribute)getIID().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_XCSizeD() {
        return (EAttribute)getIID().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_YCSizeD() {
        return (EAttribute)getIID().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_ConData3() {
        return (EAttribute)getIID().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIID_Color() {
        return (EAttribute)getIID().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIMM() {
        if (immEClass == null) {
            immEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(276);
        }
        return immEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIMM_MMPName() {
        return (EAttribute)getIMM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIMM_Triplets() {
        return (EReference)getIMM().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIOB() {
        if (iobEClass == null) {
            iobEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(277);
        }
        return iobEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOB_ObjName() {
        return (EAttribute)getIOB().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOB_ObjType() {
        return (EAttribute)getIOB().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOB_XoaOset() {
        return (EAttribute)getIOB().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOB_YoaOset() {
        return (EAttribute)getIOB().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOB_XoaOrent() {
        return (EAttribute)getIOB().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOB_YoaOrent() {
        return (EAttribute)getIOB().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOB_XocaOset() {
        return (EAttribute)getIOB().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOB_YocaOset() {
        return (EAttribute)getIOB().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOB_RefCSys() {
        return (EAttribute)getIOB().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIOB_Triplets() {
        return (EReference)getIOB().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIOC() {
        if (iocEClass == null) {
            iocEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(278);
        }
        return iocEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOC_XoaOset() {
        return (EAttribute)getIOC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOC_YoaOset() {
        return (EAttribute)getIOC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOC_XoaOrent() {
        return (EAttribute)getIOC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOC_YoaOrent() {
        return (EAttribute)getIOC().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOC_ConData1() {
        return (EAttribute)getIOC().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOC_XMap() {
        return (EAttribute)getIOC().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOC_YMap() {
        return (EAttribute)getIOC().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOC_ConData2() {
        return (EAttribute)getIOC().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIPD() {
        if (ipdEClass == null) {
            ipdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(279);
        }
        return ipdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPD_IOCAdat() {
        return (EAttribute)getIPD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPD_ImageData() {
        return (EAttribute)getIPD().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIPG() {
        if (ipgEClass == null) {
            ipgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(280);
        }
        return ipgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPG_PgName() {
        return (EAttribute)getIPG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPG_IPgFlgs() {
        return (EAttribute)getIPG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIPG_Triplets() {
        return (EReference)getIPG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIPO() {
        if (ipoEClass == null) {
            ipoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(281);
        }
        return ipoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPO_OvlyName() {
        return (EAttribute)getIPO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPO_XolOset() {
        return (EAttribute)getIPO().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPO_YolOset() {
        return (EAttribute)getIPO().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPO_OvlyOrent() {
        return (EAttribute)getIPO().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIPO_Triplets() {
        return (EReference)getIPO().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIPS() {
        if (ipsEClass == null) {
            ipsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(282);
        }
        return ipsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPS_PsegName() {
        return (EAttribute)getIPS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPS_XpsOset() {
        return (EAttribute)getIPS().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIPS_YpsOset() {
        return (EAttribute)getIPS().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIPS_Triplets() {
        return (EReference)getIPS().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIRD() {
        if (irdEClass == null) {
            irdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(283);
        }
        return irdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIRD_IMdata() {
        return (EAttribute)getIRD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLLE() {
        if (lleEClass == null) {
            lleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(284);
        }
        return lleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLLE_LnkType() {
        return (EAttribute)getLLE().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLLE_RG() {
        return (EReference)getLLE().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLNC() {
        if (lncEClass == null) {
            lncEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(285);
        }
        return lncEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLNC_NumDSC() {
        return (EAttribute)getLNC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLND() {
        if (lndEClass == null) {
            lndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(286);
        }
        return lndEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_LNDFlgs() {
        return (EAttribute)getLND().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_IPos() {
        return (EAttribute)getLND().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_BPos() {
        return (EAttribute)getLND().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_TxtOrent() {
        return (EAttribute)getLND().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_FntLID() {
        return (EAttribute)getLND().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_ChnlCde() {
        return (EAttribute)getLND().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_NLNDskp() {
        return (EAttribute)getLND().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_NLNDsp() {
        return (EAttribute)getLND().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_NLNDreu() {
        return (EAttribute)getLND().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_SupName() {
        return (EAttribute)getLND().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_SOLid() {
        return (EAttribute)getLND().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_DataStrt() {
        return (EAttribute)getLND().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_DataLgth() {
        return (EAttribute)getLND().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_TxtColor() {
        return (EAttribute)getLND().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_NLNDccp() {
        return (EAttribute)getLND().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_SubpgID() {
        return (EAttribute)getLND().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLND_CCPID() {
        return (EAttribute)getLND().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLND_Triplets() {
        return (EReference)getLND().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMBC() {
        if (mbcEClass == null) {
            mbcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(287);
        }
        return mbcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMBC_RG() {
        return (EReference)getMBC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCA() {
        if (mcaEClass == null) {
            mcaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(288);
        }
        return mcaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMCA_RG() {
        return (EReference)getMCA().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCC() {
        if (mccEClass == null) {
            mccEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(289);
        }
        return mccEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMCC_Rg() {
        return (EReference)getMCC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCD() {
        if (mcdEClass == null) {
            mcdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(290);
        }
        return mcdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMCD_RG() {
        return (EReference)getMCD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCF() {
        if (mcfEClass == null) {
            mcfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(291);
        }
        return mcfEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMCF_RG() {
        return (EReference)getMCF().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCF1() {
        if (mcf1EClass == null) {
            mcf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(292);
        }
        return mcf1EClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCF1_RGLength() {
        return (EAttribute)getMCF1().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMCF1_RG() {
        return (EReference)getMCF1().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMDD() {
        if (mddEClass == null) {
            mddEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(293);
        }
        return mddEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMDD_XmBase() {
        return (EAttribute)getMDD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMDD_YmBase() {
        return (EAttribute)getMDD().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMDD_XmUnits() {
        return (EAttribute)getMDD().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMDD_YmUnits() {
        return (EAttribute)getMDD().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMDD_XmSize() {
        return (EAttribute)getMDD().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMDD_YmSize() {
        return (EAttribute)getMDD().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMDD_MDDFlgs() {
        return (EAttribute)getMDD().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMDD_Triplets() {
        return (EReference)getMDD().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMDR() {
        if (mdrEClass == null) {
            mdrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(294);
        }
        return mdrEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMDR_RG() {
        return (EReference)getMDR().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMFC() {
        if (mfcEClass == null) {
            mfcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(295);
        }
        return mfcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMFC_MFCFlgs() {
        return (EAttribute)getMFC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMFC_MedColl() {
        return (EAttribute)getMFC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMFC_MFCScpe() {
        return (EAttribute)getMFC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMFC_Triplets() {
        return (EReference)getMFC().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMGO() {
        if (mgoEClass == null) {
            mgoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(296);
        }
        return mgoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMGO_RG() {
        return (EReference)getMGO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMIO() {
        if (mioEClass == null) {
            mioEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(297);
        }
        return mioEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMIO_RG() {
        return (EReference)getMIO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMMC() {
        if (mmcEClass == null) {
            mmcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(298);
        }
        return mmcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMC_MMCid() {
        return (EAttribute)getMMC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMC_PARAMETER1() {
        return (EAttribute)getMMC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMMC_Rg() {
        return (EReference)getMMC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMMD() {
        if (mmdEClass == null) {
            mmdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(299);
        }
        return mmdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMMD_RG() {
        return (EReference)getMMD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMMO() {
        if (mmoEClass == null) {
            mmoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(300);
        }
        return mmoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMO_RGLength() {
        return (EAttribute)getMMO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMMO_Rg() {
        return (EReference)getMMO().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMMT() {
        if (mmtEClass == null) {
            mmtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(301);
        }
        return mmtEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMMT_RG() {
        return (EReference)getMMT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMPG() {
        if (mpgEClass == null) {
            mpgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(302);
        }
        return mpgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMPG_RG() {
        return (EReference)getMPG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMPO() {
        if (mpoEClass == null) {
            mpoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(303);
        }
        return mpoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMPO_RG() {
        return (EReference)getMPO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMPS() {
        if (mpsEClass == null) {
            mpsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(304);
        }
        return mpsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMPS_RGLength() {
        return (EAttribute)getMPS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMPS_Reserved() {
        return (EAttribute)getMPS().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMPS_FixedLengthRG() {
        return (EReference)getMPS().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMSU() {
        if (msuEClass == null) {
            msuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(305);
        }
        return msuEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMSU_Rg() {
        return (EReference)getMSU().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNOP() {
        if (nopEClass == null) {
            nopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(306);
        }
        return nopEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNOP_UndfData() {
        return (EAttribute)getNOP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOBD() {
        if (obdEClass == null) {
            obdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(307);
        }
        return obdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOBD_Triplets() {
        return (EReference)getOBD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOBP() {
        if (obpEClass == null) {
            obpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(308);
        }
        return obpEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_OAPosID() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_RGLength() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_XoaOset() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_YoaOset() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_XoaOrent() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_YoaOrent() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_XocaOset() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_YocaOset() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_XocaOrent() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_YocaOrent() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOBP_RefCSys() {
        return (EAttribute)getOBP().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOCD() {
        if (ocdEClass == null) {
            ocdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(309);
        }
        return ocdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOCD_ObjCdat() {
        return (EAttribute)getOCD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPEC() {
        if (pecEClass == null) {
            pecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(310);
        }
        return pecEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPEC_Triplets() {
        return (EReference)getPEC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPFC() {
        if (pfcEClass == null) {
            pfcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(311);
        }
        return pfcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPFC_PFCFlgs() {
        return (EAttribute)getPFC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPFC_Triplets() {
        return (EReference)getPFC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPGD() {
        if (pgdEClass == null) {
            pgdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(312);
        }
        return pgdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGD_XpgBase() {
        return (EAttribute)getPGD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGD_YpgBase() {
        return (EAttribute)getPGD().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGD_XpgUnits() {
        return (EAttribute)getPGD().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGD_YpgUnits() {
        return (EAttribute)getPGD().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGD_XpgSize() {
        return (EAttribute)getPGD().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGD_YpgSize() {
        return (EAttribute)getPGD().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGD_Reserved() {
        return (EAttribute)getPGD().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPGD_Triplets() {
        return (EReference)getPGD().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPGP() {
        if (pgpEClass == null) {
            pgpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(313);
        }
        return pgpEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGP_Constant() {
        return (EAttribute)getPGP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPGP_RG() {
        return (EReference)getPGP().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPGP1() {
        if (pgp1EClass == null) {
            pgp1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(314);
        }
        return pgp1EClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGP1_XOset() {
        return (EAttribute)getPGP1().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGP1_YOset() {
        return (EAttribute)getPGP1().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPMC() {
        if (pmcEClass == null) {
            pmcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(315);
        }
        return pmcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPMC_PMCid() {
        return (EAttribute)getPMC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPMC_Triplets() {
        return (EReference)getPMC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPPO() {
        if (ppoEClass == null) {
            ppoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(316);
        }
        return ppoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPPO_RG() {
        return (EReference)getPPO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPTD() {
        if (ptdEClass == null) {
            ptdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(317);
        }
        return ptdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD_XPBASE() {
        return (EAttribute)getPTD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD_YPBASE() {
        return (EAttribute)getPTD().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD_XPUNITVL() {
        return (EAttribute)getPTD().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD_YPUNITVL() {
        return (EAttribute)getPTD().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD_XPEXTENT() {
        return (EAttribute)getPTD().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD_YPEXTENT() {
        return (EAttribute)getPTD().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD_RESERVED() {
        return (EAttribute)getPTD().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPTD_CS() {
        return (EReference)getPTD().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPTD1() {
        if (ptd1EClass == null) {
            ptd1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(318);
        }
        return ptd1EClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD1_XPBASE() {
        return (EAttribute)getPTD1().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD1_YPBASE() {
        return (EAttribute)getPTD1().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD1_XPUNITVL() {
        return (EAttribute)getPTD1().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD1_YPUNITVL() {
        return (EAttribute)getPTD1().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD1_XPEXTENT() {
        return (EAttribute)getPTD1().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD1_YPEXTENT() {
        return (EAttribute)getPTD1().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPTD1_RESERVED() {
        return (EAttribute)getPTD1().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPTX() {
        if (ptxEClass == null) {
            ptxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(319);
        }
        return ptxEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPTX_CS() {
        return (EReference)getPTX().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTLE() {
        if (tleEClass == null) {
            tleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(320);
        }
        return tleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTLE_Triplets() {
        return (EReference)getTLE().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFGD() {
        if (fgdEClass == null) {
            fgdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(321);
        }
        return fgdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFGD_ConData() {
        return (EAttribute)getFGD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAMB() {
        if (ambEClass == null) {
            ambEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(322);
        }
        return ambEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAMB_DSPLCMNT() {
        return (EAttribute)getAMB().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAMI() {
        if (amiEClass == null) {
            amiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(323);
        }
        return amiEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAMI_DSPLCMNT() {
        return (EAttribute)getAMI().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBLN() {
        if (blnEClass == null) {
            blnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(324);
        }
        return blnEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBSU() {
        if (bsuEClass == null) {
            bsuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(325);
        }
        return bsuEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBSU_LID() {
        return (EAttribute)getBSU().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDBR() {
        if (dbrEClass == null) {
            dbrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(326);
        }
        return dbrEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDBR_RLENGTH() {
        return (EAttribute)getDBR().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDBR_RWIDTH() {
        return (EAttribute)getDBR().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDBR_RWIDTHFRACTION() {
        return (EAttribute)getDBR().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDIR() {
        if (dirEClass == null) {
            dirEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(327);
        }
        return dirEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDIR_RLENGTH() {
        return (EAttribute)getDIR().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDIR_RWIDTH() {
        return (EAttribute)getDIR().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDIR_RWIDTHFRACTION() {
        return (EAttribute)getDIR().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getESU() {
        if (esuEClass == null) {
            esuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(328);
        }
        return esuEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getESU_LID() {
        return (EAttribute)getESU().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNOPCS() {
        if (nopcsEClass == null) {
            nopcsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(329);
        }
        return nopcsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNOPCS_IGNDATA() {
        return (EAttribute)getNOPCS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOVS() {
        if (ovsEClass == null) {
            ovsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(330);
        }
        return ovsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOVS_BYPSIDEN() {
        return (EAttribute)getOVS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOVS_OVERCHAR() {
        return (EAttribute)getOVS().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRMB() {
        if (rmbEClass == null) {
            rmbEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(331);
        }
        return rmbEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRMB_INCRMENT() {
        return (EAttribute)getRMB().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRMI() {
        if (rmiEClass == null) {
            rmiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(332);
        }
        return rmiEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRMI_INCRMENT() {
        return (EAttribute)getRMI().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRPS() {
        if (rpsEClass == null) {
            rpsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(333);
        }
        return rpsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRPS_RLENGTH() {
        return (EAttribute)getRPS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRPS_RPTDATA() {
        return (EAttribute)getRPS().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSBI() {
        if (sbiEClass == null) {
            sbiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(334);
        }
        return sbiEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSBI_INCRMENT() {
        return (EAttribute)getSBI().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSCFL() {
        if (scflEClass == null) {
            scflEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(335);
        }
        return scflEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSCFL_LID() {
        return (EAttribute)getSCFL().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSEC() {
        if (secEClass == null) {
            secEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(336);
        }
        return secEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSEC_RESERVED() {
        return (EAttribute)getSEC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSEC_COLSPCE() {
        return (EAttribute)getSEC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSEC_COLSIZE1() {
        return (EAttribute)getSEC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSEC_COLSIZE2() {
        return (EAttribute)getSEC().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSEC_COLSIZE3() {
        return (EAttribute)getSEC().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSEC_COLSIZE4() {
        return (EAttribute)getSEC().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSEC_COLVALUE() {
        return (EAttribute)getSEC().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSIA() {
        if (siaEClass == null) {
            siaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(337);
        }
        return siaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSIA_ADJSTMNT() {
        return (EAttribute)getSIA().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSIA_DIRCTION() {
        return (EAttribute)getSIA().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSIM() {
        if (simEClass == null) {
            simEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(338);
        }
        return simEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSIM_DSPLCMNT() {
        return (EAttribute)getSIM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSTC() {
        if (stcEClass == null) {
            stcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(339);
        }
        return stcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSTC_FRGCOLOR() {
        return (EAttribute)getSTC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSTC_PRECSION() {
        return (EAttribute)getSTC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSTO() {
        if (stoEClass == null) {
            stoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(340);
        }
        return stoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSTO_IORNTION() {
        return (EAttribute)getSTO().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSTO_BORNTION() {
        return (EAttribute)getSTO().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSVI() {
        if (sviEClass == null) {
            sviEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(341);
        }
        return sviEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSVI_INCRMENT() {
        return (EAttribute)getSVI().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTBM() {
        if (tbmEClass == null) {
            tbmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(342);
        }
        return tbmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTBM_DIRCTION() {
        return (EAttribute)getTBM().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTBM_PRECSION() {
        return (EAttribute)getTBM().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTBM_INCRMENT() {
        return (EAttribute)getTBM().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTRN() {
        if (trnEClass == null) {
            trnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(343);
        }
        return trnEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTRN_TRNDATA() {
        return (EAttribute)getTRN().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getUSC() {
        if (uscEClass == null) {
            uscEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(344);
        }
        return uscEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUSC_BYPSIDEN() {
        return (EAttribute)getUSC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAttributeQualifier() {
        if (attributeQualifierEClass == null) {
            attributeQualifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(345);
        }
        return attributeQualifierEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAttributeQualifier_SeqNum() {
        return (EAttribute)getAttributeQualifier().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAttributeQualifier_LevNum() {
        return (EAttribute)getAttributeQualifier().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAttributeValue() {
        if (attributeValueEClass == null) {
            attributeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(346);
        }
        return attributeValueEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAttributeValue_Reserved0() {
        return (EAttribute)getAttributeValue().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAttributeValue_AttVal() {
        return (EAttribute)getAttributeValue().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCGCSGID() {
        if (cgcsgidEClass == null) {
            cgcsgidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(347);
        }
        return cgcsgidEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCGCSGID_GCSGID() {
        return (EAttribute)getCGCSGID().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCGCSGID_CPGID() {
        return (EAttribute)getCGCSGID().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCRCResourceManagement() {
        if (crcResourceManagementEClass == null) {
            crcResourceManagementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(348);
        }
        return crcResourceManagementEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCRCResourceManagement_FmtQual() {
        return (EAttribute)getCRCResourceManagement().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCRCResourceManagement_RMValue() {
        return (EAttribute)getCRCResourceManagement().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCRCResourceManagement_ResClassFlg() {
        return (EAttribute)getCRCResourceManagement().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCharacterRotation() {
        if (characterRotationEClass == null) {
            characterRotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(349);
        }
        return characterRotationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCharacterRotation_CharRot() {
        return (EAttribute)getCharacterRotation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getColorSpecification() {
        if (colorSpecificationEClass == null) {
            colorSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(350);
        }
        return colorSpecificationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorSpecification_ColSpce() {
        return (EAttribute)getColorSpecification().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorSpecification_ColSize1() {
        return (EAttribute)getColorSpecification().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorSpecification_ColSize2() {
        return (EAttribute)getColorSpecification().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorSpecification_ColSize3() {
        return (EAttribute)getColorSpecification().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorSpecification_ColSize4() {
        return (EAttribute)getColorSpecification().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorSpecification_Color() {
        return (EAttribute)getColorSpecification().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getComment() {
        if (commentEClass == null) {
            commentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(351);
        }
        return commentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComment_Comment() {
        return (EAttribute)getComment().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDataObjectFontDescriptor() {
        if (dataObjectFontDescriptorEClass == null) {
            dataObjectFontDescriptorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(352);
        }
        return dataObjectFontDescriptorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataObjectFontDescriptor_DOFtFlgs() {
        return (EAttribute)getDataObjectFontDescriptor().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataObjectFontDescriptor_FontTech() {
        return (EAttribute)getDataObjectFontDescriptor().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataObjectFontDescriptor_VFS() {
        return (EAttribute)getDataObjectFontDescriptor().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataObjectFontDescriptor_HFS() {
        return (EAttribute)getDataObjectFontDescriptor().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataObjectFontDescriptor_CharRot() {
        return (EAttribute)getDataObjectFontDescriptor().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataObjectFontDescriptor_EncEnv() {
        return (EAttribute)getDataObjectFontDescriptor().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataObjectFontDescriptor_EncID() {
        return (EAttribute)getDataObjectFontDescriptor().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataObjectFontDescriptor_Reserved() {
        return (EAttribute)getDataObjectFontDescriptor().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDescriptorPosition() {
        if (descriptorPositionEClass == null) {
            descriptorPositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(353);
        }
        return descriptorPositionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDescriptorPosition_DesPosID() {
        return (EAttribute)getDescriptorPosition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEncodingSchemeID() {
        if (encodingSchemeIDEClass == null) {
            encodingSchemeIDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(354);
        }
        return encodingSchemeIDEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEncodingSchemeID_ESidCP() {
        return (EAttribute)getEncodingSchemeID().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEncodingSchemeID_ESidUD() {
        return (EAttribute)getEncodingSchemeID().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFontResolution() {
        if (fontResolutionEClass == null) {
            fontResolutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(355);
        }
        return fontResolutionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontResolution_MetTech() {
        return (EAttribute)getFontResolution().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontResolution_RPuBase() {
        return (EAttribute)getFontResolution().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontResolution_RPUnits() {
        return (EAttribute)getFontResolution().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFullyQualifiedName() {
        if (fullyQualifiedNameEClass == null) {
            fullyQualifiedNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(356);
        }
        return fullyQualifiedNameEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFullyQualifiedName_FQNType() {
        return (EAttribute)getFullyQualifiedName().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFullyQualifiedName_FQNFormat() {
        return (EAttribute)getFullyQualifiedName().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFullyQualifiedName_FQName() {
        return (EAttribute)getFullyQualifiedName().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLocalDateAndTimeStamp() {
        if (localDateAndTimeStampEClass == null) {
            localDateAndTimeStampEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(357);
        }
        return localDateAndTimeStampEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocalDateAndTimeStamp_StampType() {
        return (EAttribute)getLocalDateAndTimeStamp().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocalDateAndTimeStamp_THunYear() {
        return (EAttribute)getLocalDateAndTimeStamp().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocalDateAndTimeStamp_TenYear() {
        return (EAttribute)getLocalDateAndTimeStamp().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocalDateAndTimeStamp_Day() {
        return (EAttribute)getLocalDateAndTimeStamp().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocalDateAndTimeStamp_Hour() {
        return (EAttribute)getLocalDateAndTimeStamp().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocalDateAndTimeStamp_Minute() {
        return (EAttribute)getLocalDateAndTimeStamp().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocalDateAndTimeStamp_Second() {
        return (EAttribute)getLocalDateAndTimeStamp().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocalDateAndTimeStamp_HundSec() {
        return (EAttribute)getLocalDateAndTimeStamp().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getUniversalDateAndTimeStamp() {
        if (universalDateAndTimeStampEClass == null) {
            universalDateAndTimeStampEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(358);
        }
        return universalDateAndTimeStampEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_Reserved() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_YearAD() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_Month() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_Day() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_Hour() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_Minute() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_Second() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_TimeZone() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_UTCDiffH() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUniversalDateAndTimeStamp_UTCDiffM() {
        return (EAttribute)getUniversalDateAndTimeStamp().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMappingOption() {
        if (mappingOptionEClass == null) {
            mappingOptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(359);
        }
        return mappingOptionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMappingOption_MapValue() {
        return (EAttribute)getMappingOption().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMediaEjectControl() {
        if (mediaEjectControlEClass == null) {
            mediaEjectControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(360);
        }
        return mediaEjectControlEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMediaEjectControl_Reserved() {
        return (EAttribute)getMediaEjectControl().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMediaEjectControl_EjCtrl() {
        return (EAttribute)getMediaEjectControl().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMediumMapPageNumber() {
        if (mediumMapPageNumberEClass == null) {
            mediumMapPageNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(361);
        }
        return mediumMapPageNumberEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMediumMapPageNumber_PageNum() {
        return (EAttribute)getMediumMapPageNumber().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMediumOrientation() {
        if (mediumOrientationEClass == null) {
            mediumOrientationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(362);
        }
        return mediumOrientationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMediumOrientation_MedOrient() {
        return (EAttribute)getMediumOrientation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMeasurementUnits() {
        if (measurementUnitsEClass == null) {
            measurementUnitsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(363);
        }
        return measurementUnitsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMeasurementUnits_XoaBase() {
        return (EAttribute)getMeasurementUnits().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMeasurementUnits_YoaBase() {
        return (EAttribute)getMeasurementUnits().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMeasurementUnits_XoaUnits() {
        return (EAttribute)getMeasurementUnits().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMeasurementUnits_YoaUnits() {
        return (EAttribute)getMeasurementUnits().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMODCAInterchangeSet() {
        if (modcaInterchangeSetEClass == null) {
            modcaInterchangeSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(364);
        }
        return modcaInterchangeSetEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMODCAInterchangeSet_IStype() {
        return (EAttribute)getMODCAInterchangeSet().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMODCAInterchangeSet_ISid() {
        return (EAttribute)getMODCAInterchangeSet().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectAreaSize() {
        if (objectAreaSizeEClass == null) {
            objectAreaSizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(365);
        }
        return objectAreaSizeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectAreaSize_SizeType() {
        return (EAttribute)getObjectAreaSize().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectAreaSize_XoaSize() {
        return (EAttribute)getObjectAreaSize().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectAreaSize_YoaSize() {
        return (EAttribute)getObjectAreaSize().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectClassification() {
        if (objectClassificationEClass == null) {
            objectClassificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(366);
        }
        return objectClassificationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectClassification_ObjClass() {
        return (EAttribute)getObjectClassification().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectClassification_StrucFlgs() {
        return (EAttribute)getObjectClassification().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectClassification_RegObjId() {
        return (EAttribute)getObjectClassification().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectClassification_ObjTpName() {
        return (EAttribute)getObjectClassification().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectClassification_ObjLev() {
        return (EAttribute)getObjectClassification().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectClassification_CompName() {
        return (EAttribute)getObjectClassification().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectFunctionSetSpecification() {
        if (objectFunctionSetSpecificationEClass == null) {
            objectFunctionSetSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(367);
        }
        return objectFunctionSetSpecificationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectFunctionSetSpecification_ObjType() {
        return (EAttribute)getObjectFunctionSetSpecification().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectFunctionSetSpecification_ArchVrsn() {
        return (EAttribute)getObjectFunctionSetSpecification().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectFunctionSetSpecification_DCAFnSet() {
        return (EAttribute)getObjectFunctionSetSpecification().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectFunctionSetSpecification_OCAFnSet() {
        return (EAttribute)getObjectFunctionSetSpecification().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectOffset() {
        if (objectOffsetEClass == null) {
            objectOffsetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(368);
        }
        return objectOffsetEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectOffset_ObjTpe() {
        return (EAttribute)getObjectOffset().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectOffset_ObjOset() {
        return (EAttribute)getObjectOffset().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectOffset_ObjOstHi() {
        return (EAttribute)getObjectOffset().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResourceObjectType() {
        if (resourceObjectTypeEClass == null) {
            resourceObjectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(369);
        }
        return resourceObjectTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceObjectType_ObjType() {
        return (EAttribute)getResourceObjectType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceObjectType_ConData() {
        return (EAttribute)getResourceObjectType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPagePositionInformation() {
        if (pagePositionInformationEClass == null) {
            pagePositionInformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(370);
        }
        return pagePositionInformationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPagePositionInformation_PGPRG() {
        return (EAttribute)getPagePositionInformation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPresentationControl() {
        if (presentationControlEClass == null) {
            presentationControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(371);
        }
        return presentationControlEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPresentationControl_PRSFlg() {
        return (EAttribute)getPresentationControl().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPresentationSpaceResetMixing() {
        if (presentationSpaceResetMixingEClass == null) {
            presentationSpaceResetMixingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(372);
        }
        return presentationSpaceResetMixingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPresentationSpaceResetMixing_BgMxFlag() {
        return (EAttribute)getPresentationSpaceResetMixing().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPresentationSpaceMixingRules() {
        if (presentationSpaceMixingRulesEClass == null) {
            presentationSpaceMixingRulesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(373);
        }
        return presentationSpaceMixingRulesEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResourceLocalIdentifier() {
        if (resourceLocalIdentifierEClass == null) {
            resourceLocalIdentifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(374);
        }
        return resourceLocalIdentifierEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceLocalIdentifier_ResType() {
        return (EAttribute)getResourceLocalIdentifier().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceLocalIdentifier_ResLID() {
        return (EAttribute)getResourceLocalIdentifier().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResourceSectionNumber() {
        if (resourceSectionNumberEClass == null) {
            resourceSectionNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(375);
        }
        return resourceSectionNumberEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceSectionNumber_ResSNum() {
        return (EAttribute)getResourceSectionNumber().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTextOrientation() {
        if (textOrientationEClass == null) {
            textOrientationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(376);
        }
        return textOrientationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTextOrientation_IAxis() {
        return (EAttribute)getTextOrientation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTextOrientation_BAxis() {
        return (EAttribute)getTextOrientation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFontHorizontalScaleFactor() {
        if (fontHorizontalScaleFactorEClass == null) {
            fontHorizontalScaleFactorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(377);
        }
        return fontHorizontalScaleFactorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontHorizontalScaleFactor_Hscale() {
        return (EAttribute)getFontHorizontalScaleFactor().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFontDescriptorSpecification() {
        if (fontDescriptorSpecificationEClass == null) {
            fontDescriptorSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(378);
        }
        return fontDescriptorSpecificationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontDescriptorSpecification_FtWtClass() {
        return (EAttribute)getFontDescriptorSpecification().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontDescriptorSpecification_FtWdClass() {
        return (EAttribute)getFontDescriptorSpecification().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontDescriptorSpecification_FtHeight() {
        return (EAttribute)getFontDescriptorSpecification().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontDescriptorSpecification_FtWidth() {
        return (EAttribute)getFontDescriptorSpecification().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontDescriptorSpecification_FtDsFlags() {
        return (EAttribute)getFontDescriptorSpecification().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontDescriptorSpecification_FtUsFlags() {
        return (EAttribute)getFontDescriptorSpecification().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBeginSegment() {
        if (beginSegmentEClass == null) {
            beginSegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(379);
        }
        return beginSegmentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeginSegment_SEGNAME() {
        return (EAttribute)getBeginSegment().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEndSegment() {
        if (endSegmentEClass == null) {
            endSegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(380);
        }
        return endSegmentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBeginTile() {
        if (beginTileEClass == null) {
            beginTileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(381);
        }
        return beginTileEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEndTile() {
        if (endTileEClass == null) {
            endTileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(382);
        }
        return endTileEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBeginTransparencyMask() {
        if (beginTransparencyMaskEClass == null) {
            beginTransparencyMaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(383);
        }
        return beginTransparencyMaskEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEndTransparencyMask() {
        if (endTransparencyMaskEClass == null) {
            endTransparencyMaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(384);
        }
        return endTransparencyMaskEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBeginImage() {
        if (beginImageEClass == null) {
            beginImageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(385);
        }
        return beginImageEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeginImage_OBJTYPE() {
        return (EAttribute)getBeginImage().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEndImage() {
        if (endImageEClass == null) {
            endImageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(386);
        }
        return endImageEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImageSize() {
        if (imageSizeEClass == null) {
            imageSizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(387);
        }
        return imageSizeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageSize_UNITBASE() {
        return (EAttribute)getImageSize().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageSize_HRESOL() {
        return (EAttribute)getImageSize().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageSize_VRESOL() {
        return (EAttribute)getImageSize().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageSize_HSIZE() {
        return (EAttribute)getImageSize().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageSize_VSIZE() {
        return (EAttribute)getImageSize().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImageEncoding() {
        if (imageEncodingEClass == null) {
            imageEncodingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(388);
        }
        return imageEncodingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageEncoding_COMPRID() {
        return (EAttribute)getImageEncoding().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageEncoding_RECID() {
        return (EAttribute)getImageEncoding().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageEncoding_BITORDR() {
        return (EAttribute)getImageEncoding().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIDESize() {
        if (ideSizeEClass == null) {
            ideSizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(389);
        }
        return ideSizeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDESize_IDESZ() {
        return (EAttribute)getIDESize().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImageLUTID() {
        if (imageLUTIDEClass == null) {
            imageLUTIDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(390);
        }
        return imageLUTIDEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageLUTID_LUTID() {
        return (EAttribute)getImageLUTID().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBandImage() {
        if (bandImageEClass == null) {
            bandImageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(391);
        }
        return bandImageEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBandImage_BCOUNT() {
        return (EAttribute)getBandImage().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBandImage_Rg() {
        return (EReference)getBandImage().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIDEStructure() {
        if (ideStructureEClass == null) {
            ideStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(392);
        }
        return ideStructureEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDEStructure_FLAGS() {
        return (EAttribute)getIDEStructure().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDEStructure_FORMAT() {
        return (EAttribute)getIDEStructure().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDEStructure_SIZE1() {
        return (EAttribute)getIDEStructure().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDEStructure_SIZE2() {
        return (EAttribute)getIDEStructure().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDEStructure_SIZE3() {
        return (EAttribute)getIDEStructure().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIDEStructure_SIZE4() {
        return (EAttribute)getIDEStructure().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExternalAlgorithm() {
        if (externalAlgorithmEClass == null) {
            externalAlgorithmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(393);
        }
        return externalAlgorithmEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExternalAlgorithm_ALGTYPE() {
        return (EAttribute)getExternalAlgorithm().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExternalAlgorithm_Rg() {
        return (EReference)getExternalAlgorithm().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTilePosition() {
        if (tilePositionEClass == null) {
            tilePositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(394);
        }
        return tilePositionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTilePosition_XOFFSET() {
        return (EAttribute)getTilePosition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTilePosition_YOFFSET() {
        return (EAttribute)getTilePosition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTileSize() {
        if (tileSizeEClass == null) {
            tileSizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(395);
        }
        return tileSizeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSize_THSIZE() {
        return (EAttribute)getTileSize().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSize_TVSIZE() {
        return (EAttribute)getTileSize().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSize_RELRES() {
        return (EAttribute)getTileSize().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTileSetColor() {
        if (tileSetColorEClass == null) {
            tileSetColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(396);
        }
        return tileSetColorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_CSPACE() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_RESERVED() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_SIZE1() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_SIZE2() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_SIZE3() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_SIZE4() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_CVAL1() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_CVAL2() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_CVAL3() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileSetColor_CVAL4() {
        return (EAttribute)getTileSetColor().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSetBiLevelImageColor() {
        if (setBiLevelImageColorEClass == null) {
            setBiLevelImageColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(397);
        }
        return setBiLevelImageColorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetBiLevelImageColor_AREA() {
        return (EAttribute)getSetBiLevelImageColor().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetBiLevelImageColor_Reserved() {
        return (EAttribute)getSetBiLevelImageColor().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetBiLevelImageColor_NAMECOLR() {
        return (EAttribute)getSetBiLevelImageColor().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIOCAFunctionSetIdentification() {
        if (iocaFunctionSetIdentificationEClass == null) {
            iocaFunctionSetIdentificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(398);
        }
        return iocaFunctionSetIdentificationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOCAFunctionSetIdentification_CATEGORY() {
        return (EAttribute)getIOCAFunctionSetIdentification().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIOCAFunctionSetIdentification_FCNSET() {
        return (EAttribute)getIOCAFunctionSetIdentification().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImageData() {
        if (imageDataEClass == null) {
            imageDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(399);
        }
        return imageDataEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageData_DATA() {
        return (EAttribute)getImageData().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBandImageData() {
        if (bandImageDataEClass == null) {
            bandImageDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(400);
        }
        return bandImageDataEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBandImageData_BANDNUM() {
        return (EAttribute)getBandImageData().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBandImageData_RESERVED() {
        return (EAttribute)getBandImageData().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBandImageData_DATA() {
        return (EAttribute)getBandImageData().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIncludeTile() {
        if (includeTileEClass == null) {
            includeTileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(401);
        }
        return includeTileEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIncludeTile_TIRID() {
        return (EAttribute)getIncludeTile().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImageSubsampling() {
        if (imageSubsamplingEClass == null) {
            imageSubsamplingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(402);
        }
        return imageSubsamplingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getImageSubsampling_Sdfs() {
        return (EReference)getImageSubsampling().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSamplingRatios() {
        if (samplingRatiosEClass == null) {
            samplingRatiosEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(403);
        }
        return samplingRatiosEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSamplingRatios_Rg() {
        return (EReference)getSamplingRatios().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTileTOC() {
        if (tileTOCEClass == null) {
            tileTOCEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(404);
        }
        return tileTOCEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileTOC_Reserved() {
        return (EAttribute)getTileTOC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTileTOC_Rg() {
        return (EReference)getTileTOC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPIRG() {
        if (cpirgEClass == null) {
            cpirgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(405);
        }
        return cpirgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPIRG_GCGID() {
        return (EAttribute)getCPIRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPIRG_PrtFlags() {
        return (EAttribute)getCPIRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPIRG_CodePoint() {
        return (EAttribute)getCPIRG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPIRG_Count() {
        return (EAttribute)getCPIRG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCFIRG() {
        if (cfirgEClass == null) {
            cfirgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(406);
        }
        return cfirgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFIRG_FCSName() {
        return (EAttribute)getCFIRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFIRG_CPName() {
        return (EAttribute)getCFIRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFIRG_SVSize() {
        return (EAttribute)getCFIRG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFIRG_SHScale() {
        return (EAttribute)getCFIRG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFIRG_Reserved() {
        return (EAttribute)getCFIRG().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFIRG_Section() {
        return (EAttribute)getCFIRG().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNIRG() {
        if (fnirgEClass == null) {
            fnirgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(407);
        }
        return fnirgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_GCGID() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_CharInc() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_AscendHt() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_DescendDp() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_Reserved() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_FNMCnt() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_ASpace() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_BSpace() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_CSpace() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_Reserved2() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNIRG_BaseOset() {
        return (EAttribute)getFNIRG().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNMRG() {
        if (fnmrgEClass == null) {
            fnmrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(408);
        }
        return fnmrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNMRG_CharBoxWd() {
        return (EAttribute)getFNMRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNMRG_CharBoxHt() {
        return (EAttribute)getFNMRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNMRG_PatDOset() {
        return (EAttribute)getFNMRG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLLERG() {
        if (llergEClass == null) {
            llergEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(409);
        }
        return llergEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLLERG_RGLength() {
        return (EAttribute)getLLERG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLLERG_RGFunct() {
        return (EAttribute)getLLERG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLLERG_Triplets() {
        return (EReference)getLLERG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMPSRG() {
        if (mpsrgEClass == null) {
            mpsrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(410);
        }
        return mpsrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMPSRG_Reserved() {
        return (EAttribute)getMPSRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMPSRG_PsegName() {
        return (EAttribute)getMPSRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCFRG() {
        if (mcfrgEClass == null) {
            mcfrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(411);
        }
        return mcfrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCFRG_RGLength() {
        return (EAttribute)getMCFRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMCFRG_Triplets() {
        return (EReference)getMCFRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMBCRG() {
        if (mbcrgEClass == null) {
            mbcrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(412);
        }
        return mbcrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMBCRG_RGLength() {
        return (EAttribute)getMBCRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMBCRG_Triplets() {
        return (EReference)getMBCRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCARG() {
        if (mcargEClass == null) {
            mcargEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(413);
        }
        return mcargEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCARG_RGLength() {
        return (EAttribute)getMCARG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMCARG_Triplets() {
        return (EReference)getMCARG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCDRG() {
        if (mcdrgEClass == null) {
            mcdrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(414);
        }
        return mcdrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCDRG_RGLength() {
        return (EAttribute)getMCDRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMCDRG_Triplets() {
        return (EReference)getMCDRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMDRRG() {
        if (mdrrgEClass == null) {
            mdrrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(415);
        }
        return mdrrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMDRRG_RGLength() {
        return (EAttribute)getMDRRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMDRRG_Triplets() {
        return (EReference)getMDRRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMGORG() {
        if (mgorgEClass == null) {
            mgorgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(416);
        }
        return mgorgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMGORG_RGLength() {
        return (EAttribute)getMGORG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMGORG_Triplets() {
        return (EReference)getMGORG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMIORG() {
        if (miorgEClass == null) {
            miorgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(417);
        }
        return miorgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMIORG_RGLength() {
        return (EAttribute)getMIORG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMIORG_Triplets() {
        return (EReference)getMIORG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMMDRG() {
        if (mmdrgEClass == null) {
            mmdrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(418);
        }
        return mmdrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMDRG_RGLength() {
        return (EAttribute)getMMDRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMMDRG_Triplets() {
        return (EReference)getMMDRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMMTRG() {
        if (mmtrgEClass == null) {
            mmtrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(419);
        }
        return mmtrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMTRG_RGLength() {
        return (EAttribute)getMMTRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMMTRG_Triplets() {
        return (EReference)getMMTRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMPGRG() {
        if (mpgrgEClass == null) {
            mpgrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(420);
        }
        return mpgrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMPGRG_RGLength() {
        return (EAttribute)getMPGRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMPGRG_Triplets() {
        return (EReference)getMPGRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMPORG() {
        if (mporgEClass == null) {
            mporgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(421);
        }
        return mporgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMPORG_RGLength() {
        return (EAttribute)getMPORG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMPORG_Triplets() {
        return (EReference)getMPORG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPPORG() {
        if (pporgEClass == null) {
            pporgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(422);
        }
        return pporgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPPORG_RGLength() {
        return (EAttribute)getPPORG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPPORG_ObjType() {
        return (EAttribute)getPPORG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPPORG_ProcFlgs() {
        return (EAttribute)getPPORG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPPORG_XocaOset() {
        return (EAttribute)getPPORG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPPORG_YocaOset() {
        return (EAttribute)getPPORG().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPPORG_Triplets() {
        return (EReference)getPPORG().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPGPRG() {
        if (pgprgEClass == null) {
            pgprgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(423);
        }
        return pgprgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGPRG_RGLength() {
        return (EAttribute)getPGPRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGPRG_XmOset() {
        return (EAttribute)getPGPRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGPRG_YmOset() {
        return (EAttribute)getPGPRG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGPRG_PGorient() {
        return (EAttribute)getPGPRG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGPRG_SHside() {
        return (EAttribute)getPGPRG().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGPRG_PgFlgs() {
        return (EAttribute)getPGPRG().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPGPRG_PMCid() {
        return (EAttribute)getPGPRG().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCCRG() {
        if (mccrgEClass == null) {
            mccrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(424);
        }
        return mccrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCCRG_Startnum() {
        return (EAttribute)getMCCRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCCRG_Stopnum() {
        return (EAttribute)getMCCRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCCRG_MMCid() {
        return (EAttribute)getMCCRG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMMORG() {
        if (mmorgEClass == null) {
            mmorgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(425);
        }
        return mmorgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMORG_OVLid() {
        return (EAttribute)getMMORG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMORG_Flags() {
        return (EAttribute)getMMORG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMORG_OVLname() {
        return (EAttribute)getMMORG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBandImageRG() {
        if (bandImageRGEClass == null) {
            bandImageRGEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(426);
        }
        return bandImageRGEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBandImageRG_BITCNT() {
        return (EAttribute)getBandImageRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMCF1RG() {
        if (mcf1RGEClass == null) {
            mcf1RGEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(427);
        }
        return mcf1RGEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCF1RG_CFLid() {
        return (EAttribute)getMCF1RG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCF1RG_Sectid() {
        return (EAttribute)getMCF1RG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCF1RG_CFName() {
        return (EAttribute)getMCF1RG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCF1RG_CPName() {
        return (EAttribute)getMCF1RG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCF1RG_FCSName() {
        return (EAttribute)getMCF1RG().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMCF1RG_CharRot() {
        return (EAttribute)getMCF1RG().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMMCRG() {
        if (mmcrgEClass == null) {
            mmcrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(428);
        }
        return mmcrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMCRG_Key() {
        return (EAttribute)getMMCRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMMCRG_Value() {
        return (EAttribute)getMMCRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNORG() {
        if (fnorgEClass == null) {
            fnorgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(429);
        }
        return fnorgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_Reserved() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_CharRot() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_MaxBOset() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_MaxCharInc() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_SpCharInc() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_MaxBExt() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_OrntFlgs() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_Reserved2() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_EmSpInc() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_Reserved3() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_FigSpInc() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_NomCharInc() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_DefBInc() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNORG_MinASp() {
        return (EAttribute)getFNORG().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNPRG() {
        if (fnprgEClass == null) {
            fnprgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(430);
        }
        return fnprgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_Reserved() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_LcHeight() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_CapMHt() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_MaxAscHt() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_MaxDesDp() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_Reserved2() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_Retired() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_Reserved3() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_UscoreWd() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_UscoreWdf() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNPRG_UscorePos() {
        return (EAttribute)getFNPRG().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTileTOCRG() {
        if (tileTOCRGEClass == null) {
            tileTOCRGEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(431);
        }
        return tileTOCRGEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileTOCRG_XOFFSET() {
        return (EAttribute)getTileTOCRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileTOCRG_YOFFSET() {
        return (EAttribute)getTileTOCRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileTOCRG_THSIZE() {
        return (EAttribute)getTileTOCRG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileTOCRG_TVSIZE() {
        return (EAttribute)getTileTOCRG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileTOCRG_RELRES() {
        return (EAttribute)getTileTOCRG().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileTOCRG_COMPR() {
        return (EAttribute)getTileTOCRG().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTileTOCRG_DATAPOS() {
        return (EAttribute)getTileTOCRG().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSamplingRatiosRG() {
        if (samplingRatiosRGEClass == null) {
            samplingRatiosRGEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(432);
        }
        return samplingRatiosRGEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSamplingRatiosRG_HSAMPLE() {
        return (EAttribute)getSamplingRatiosRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSamplingRatiosRG_VSAMPLE() {
        return (EAttribute)getSamplingRatiosRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExternalAlgorithmRG() {
        if (externalAlgorithmRGEClass == null) {
            externalAlgorithmRGEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(433);
        }
        return externalAlgorithmRGEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExternalAlgorithmRG_DIRCTN() {
        return (EAttribute)getExternalAlgorithmRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExternalAlgorithmRG_PADBDRY() {
        return (EAttribute)getExternalAlgorithmRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExternalAlgorithmRG_PADALMT() {
        return (EAttribute)getExternalAlgorithmRG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNNRG() {
        if (fnnrgEClass == null) {
            fnnrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(434);
        }
        return fnnrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNNRG_GCGID() {
        return (EAttribute)getFNNRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNNRG_TSOffset() {
        return (EAttribute)getFNNRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFNNRG2() {
        if (fnnrg2EClass == null) {
            fnnrg2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(435);
        }
        return fnnrg2EClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNNRG2_TSIDLen() {
        return (EAttribute)getFNNRG2().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFNNRG2_TSID() {
        return (EAttribute)getFNNRG2().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBeginSegmentCommand() {
        if (beginSegmentCommandEClass == null) {
            beginSegmentCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(436);
        }
        return beginSegmentCommandEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeginSegmentCommand_LENGTH() {
        return (EAttribute)getBeginSegmentCommand().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeginSegmentCommand_NAME() {
        return (EAttribute)getBeginSegmentCommand().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeginSegmentCommand_FLAG1() {
        return (EAttribute)getBeginSegmentCommand().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeginSegmentCommand_FLAG2() {
        return (EAttribute)getBeginSegmentCommand().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeginSegmentCommand_SEGL() {
        return (EAttribute)getBeginSegmentCommand().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeginSegmentCommand_PSNAME() {
        return (EAttribute)getBeginSegmentCommand().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEndSegmentCommand() {
        if (endSegmentCommandEClass == null) {
            endSegmentCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(437);
        }
        return endSegmentCommandEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGBAR() {
        if (gbarEClass == null) {
            gbarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(438);
        }
        return gbarEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBAR_FLAGS() {
        return (EAttribute)getGBAR().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGBIMG() {
        if (gbimgEClass == null) {
            gbimgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(439);
        }
        return gbimgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBIMG_XPOS() {
        return (EAttribute)getGBIMG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBIMG_YPOS() {
        return (EAttribute)getGBIMG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBIMG_FORMAT() {
        return (EAttribute)getGBIMG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBIMG_RES() {
        return (EAttribute)getGBIMG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBIMG_WIDTH() {
        return (EAttribute)getGBIMG().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBIMG_HEIGHT() {
        return (EAttribute)getGBIMG().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCBIMG() {
        if (gcbimgEClass == null) {
            gcbimgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(440);
        }
        return gcbimgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBIMG_FORMAT() {
        return (EAttribute)getGCBIMG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBIMG_RES() {
        return (EAttribute)getGCBIMG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBIMG_WIDTH() {
        return (EAttribute)getGCBIMG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBIMG_HEIGHT() {
        return (EAttribute)getGCBIMG().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGBOX() {
        if (gboxEClass == null) {
            gboxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(441);
        }
        return gboxEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBOX_RES() {
        return (EAttribute)getGBOX().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBOX_XPOS0() {
        return (EAttribute)getGBOX().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBOX_YPOS0() {
        return (EAttribute)getGBOX().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBOX_XPOS1() {
        return (EAttribute)getGBOX().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBOX_YPOS1() {
        return (EAttribute)getGBOX().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBOX_HAXIS() {
        return (EAttribute)getGBOX().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGBOX_VAXIS() {
        return (EAttribute)getGBOX().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCBOX() {
        if (gcboxEClass == null) {
            gcboxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(442);
        }
        return gcboxEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBOX_RES() {
        return (EAttribute)getGCBOX().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBOX_XPOS1() {
        return (EAttribute)getGCBOX().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBOX_YPOS1() {
        return (EAttribute)getGCBOX().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBOX_HAXIS() {
        return (EAttribute)getGCBOX().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBOX_VAXIS() {
        return (EAttribute)getGCBOX().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCHST() {
        if (gchstEClass == null) {
            gchstEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(443);
        }
        return gchstEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCHST_XPOS() {
        return (EAttribute)getGCHST().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCHST_YPOS() {
        return (EAttribute)getGCHST().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCHST_CP() {
        return (EAttribute)getGCHST().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCCHST() {
        if (gcchstEClass == null) {
            gcchstEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(444);
        }
        return gcchstEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCCHST_CP() {
        return (EAttribute)getGCCHST().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCOMT() {
        if (gcomtEClass == null) {
            gcomtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(445);
        }
        return gcomtEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCOMT_DATA() {
        return (EAttribute)getGCOMT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGEAR() {
        if (gearEClass == null) {
            gearEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(446);
        }
        return gearEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGEAR_DATA() {
        return (EAttribute)getGEAR().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGEIMG() {
        if (geimgEClass == null) {
            geimgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(447);
        }
        return geimgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGEIMG_DATA() {
        return (EAttribute)getGEIMG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGEPROL() {
        if (geprolEClass == null) {
            geprolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(448);
        }
        return geprolEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGEPROL_RES() {
        return (EAttribute)getGEPROL().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGFLT() {
        if (gfltEClass == null) {
            gfltEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(449);
        }
        return gfltEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGFLT_Rg() {
        return (EReference)getGFLT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCFLT() {
        if (gcfltEClass == null) {
            gcfltEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(450);
        }
        return gcfltEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGCFLT_Rg() {
        return (EReference)getGCFLT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGFARC() {
        if (gfarcEClass == null) {
            gfarcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(451);
        }
        return gfarcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGFARC_XPOS() {
        return (EAttribute)getGFARC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGFARC_YPOS() {
        return (EAttribute)getGFARC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGFARC_MH() {
        return (EAttribute)getGFARC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGFARC_MFR() {
        return (EAttribute)getGFARC().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCFARC() {
        if (gcfarcEClass == null) {
            gcfarcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(452);
        }
        return gcfarcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCFARC_MH() {
        return (EAttribute)getGCFARC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCFARC_MFR() {
        return (EAttribute)getGCFARC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGIMD() {
        if (gimdEClass == null) {
            gimdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(453);
        }
        return gimdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGIMD_DATA() {
        return (EAttribute)getGIMD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGLINE() {
        if (glineEClass == null) {
            glineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(454);
        }
        return glineEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGLINE_Rg() {
        return (EReference)getGLINE().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCLINE() {
        if (gclineEClass == null) {
            gclineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(455);
        }
        return gclineEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGCLINE_Rg() {
        return (EReference)getGCLINE().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGMRK() {
        if (gmrkEClass == null) {
            gmrkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(456);
        }
        return gmrkEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGMRK_Rg() {
        return (EReference)getGMRK().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCMRK() {
        if (gcmrkEClass == null) {
            gcmrkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(457);
        }
        return gcmrkEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGCMRK_Rg() {
        return (EReference)getGCMRK().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGNOP1() {
        if (gnop1EClass == null) {
            gnop1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(458);
        }
        return gnop1EClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGPARC() {
        if (gparcEClass == null) {
            gparcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(459);
        }
        return gparcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGPARC_XPOS() {
        return (EAttribute)getGPARC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGPARC_YPOS() {
        return (EAttribute)getGPARC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGPARC_XCENT() {
        return (EAttribute)getGPARC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGPARC_YCENT() {
        return (EAttribute)getGPARC().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGPARC_MH() {
        return (EAttribute)getGPARC().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGPARC_MFR() {
        return (EAttribute)getGPARC().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGPARC_START() {
        return (EAttribute)getGPARC().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGPARC_SWEEP() {
        return (EAttribute)getGPARC().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCPARC() {
        if (gcparcEClass == null) {
            gcparcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(460);
        }
        return gcparcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCPARC_XCENT() {
        return (EAttribute)getGCPARC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCPARC_YCENT() {
        return (EAttribute)getGCPARC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCPARC_MH() {
        return (EAttribute)getGCPARC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCPARC_MFR() {
        return (EAttribute)getGCPARC().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCPARC_START() {
        return (EAttribute)getGCPARC().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCPARC_SWEEP() {
        return (EAttribute)getGCPARC().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGRLINE() {
        if (grlineEClass == null) {
            grlineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(461);
        }
        return grlineEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGRLINE_XPOS() {
        return (EAttribute)getGRLINE().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGRLINE_YPOS() {
        return (EAttribute)getGRLINE().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGRLINE_Rg() {
        return (EReference)getGRLINE().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCRLINE() {
        if (gcrlineEClass == null) {
            gcrlineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(462);
        }
        return gcrlineEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGCRLINE_Rg() {
        return (EReference)getGCRLINE().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSGCH() {
        if (gsgchEClass == null) {
            gsgchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(463);
        }
        return gsgchEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSAP() {
        if (gsapEClass == null) {
            gsapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(464);
        }
        return gsapEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSAP_P() {
        return (EAttribute)getGSAP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSAP_Q() {
        return (EAttribute)getGSAP().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSAP_R() {
        return (EAttribute)getGSAP().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSAP_S() {
        return (EAttribute)getGSAP().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSBMX() {
        if (gsbmxEClass == null) {
            gsbmxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(465);
        }
        return gsbmxEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSBMX_MODE() {
        return (EAttribute)getGSBMX().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSCA() {
        if (gscaEClass == null) {
            gscaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(466);
        }
        return gscaEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCA_XPOS() {
        return (EAttribute)getGSCA().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCA_YPOS() {
        return (EAttribute)getGSCA().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSCC() {
        if (gsccEClass == null) {
            gsccEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(467);
        }
        return gsccEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCC_CELLWI() {
        return (EAttribute)getGSCC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCC_CELLHI() {
        return (EAttribute)getGSCC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCC_CELLWFR() {
        return (EAttribute)getGSCC().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCC_CELLHFR() {
        return (EAttribute)getGSCC().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSCD() {
        if (gscdEClass == null) {
            gscdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(468);
        }
        return gscdEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCD_DIRECTION() {
        return (EAttribute)getGSCD().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSCR() {
        if (gscrEClass == null) {
            gscrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(469);
        }
        return gscrEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCR_PREC() {
        return (EAttribute)getGSCR().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSCS() {
        if (gscsEClass == null) {
            gscsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(470);
        }
        return gscsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCS_LCID() {
        return (EAttribute)getGSCS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSCH() {
        if (gschEClass == null) {
            gschEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(471);
        }
        return gschEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCH_HX() {
        return (EAttribute)getGSCH().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCH_HY() {
        return (EAttribute)getGSCH().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSCOL() {
        if (gscolEClass == null) {
            gscolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(472);
        }
        return gscolEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCOL_COL() {
        return (EAttribute)getGSCOL().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSCP() {
        if (gscpEClass == null) {
            gscpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(473);
        }
        return gscpEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCP_XPOS() {
        return (EAttribute)getGSCP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSCP_YPOS() {
        return (EAttribute)getGSCP().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSECOL() {
        if (gsecolEClass == null) {
            gsecolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(474);
        }
        return gsecolEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSECOL_COLOR() {
        return (EAttribute)getGSECOL().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSFLW() {
        if (gsflwEClass == null) {
            gsflwEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(475);
        }
        return gsflwEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSFLW_MH() {
        return (EAttribute)getGSFLW().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSFLW_MFR() {
        return (EAttribute)getGSFLW().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSLT() {
        if (gsltEClass == null) {
            gsltEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(476);
        }
        return gsltEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSLT_LINETYPE() {
        return (EAttribute)getGSLT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSLW() {
        if (gslwEClass == null) {
            gslwEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(477);
        }
        return gslwEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSLW_MH() {
        return (EAttribute)getGSLW().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSMC() {
        if (gsmcEClass == null) {
            gsmcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(478);
        }
        return gsmcEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSMC_CELLWI() {
        return (EAttribute)getGSMC().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSMC_CELLHI() {
        return (EAttribute)getGSMC().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSMP() {
        if (gsmpEClass == null) {
            gsmpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(479);
        }
        return gsmpEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSMP_PREC() {
        return (EAttribute)getGSMP().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSMS() {
        if (gsmsEClass == null) {
            gsmsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(480);
        }
        return gsmsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSMS_LCID() {
        return (EAttribute)getGSMS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSMT() {
        if (gsmtEClass == null) {
            gsmtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(481);
        }
        return gsmtEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSMT_MCPT() {
        return (EAttribute)getGSMT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSMX() {
        if (gsmxEClass == null) {
            gsmxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(482);
        }
        return gsmxEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSMX_MODE() {
        return (EAttribute)getGSMX().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSPS() {
        if (gspsEClass == null) {
            gspsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(483);
        }
        return gspsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPS_LCID() {
        return (EAttribute)getGSPS().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSPT() {
        if (gsptEClass == null) {
            gsptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(484);
        }
        return gsptEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPT_PATT() {
        return (EAttribute)getGSPT().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSPCOL() {
        if (gspcolEClass == null) {
            gspcolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(485);
        }
        return gspcolEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPCOL_RES1() {
        return (EAttribute)getGSPCOL().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPCOL_COLSPCE() {
        return (EAttribute)getGSPCOL().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPCOL_RES2() {
        return (EAttribute)getGSPCOL().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPCOL_COLSIZE1() {
        return (EAttribute)getGSPCOL().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPCOL_COLSIZE2() {
        return (EAttribute)getGSPCOL().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPCOL_COLSIZE3() {
        return (EAttribute)getGSPCOL().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPCOL_COLSIZE4() {
        return (EAttribute)getGSPCOL().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSPCOL_COLVALUE() {
        return (EAttribute)getGSPCOL().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSLE() {
        if (gsleEClass == null) {
            gsleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(486);
        }
        return gsleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSLE_LINEEND() {
        return (EAttribute)getGSLE().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGSLJ() {
        if (gsljEClass == null) {
            gsljEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(487);
        }
        return gsljEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGSLJ_LINEJOIN() {
        return (EAttribute)getGSLJ().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCBEZ() {
        if (gcbezEClass == null) {
            gcbezEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(488);
        }
        return gcbezEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGCBEZ_Rg() {
        return (EReference)getGCBEZ().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCCBEZ() {
        if (gccbezEClass == null) {
            gccbezEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(489);
        }
        return gccbezEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getGCCBEZ_Rg() {
        return (EReference)getGCCBEZ().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWindowSpecification() {
        if (windowSpecificationEClass == null) {
            windowSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(490);
        }
        return windowSpecificationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_FLAGS() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_RES3() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_CFORMAT() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_UBASE() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_XRESOL() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_YRESOL() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_IMGXYRES() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_XLWIND() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_XRWIND() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_YBWIND() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWindowSpecification_YTWIND() {
        return (EAttribute)getWindowSpecification().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDrawingOrderSubset() {
        if (drawingOrderSubsetEClass == null) {
            drawingOrderSubsetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(491);
        }
        return drawingOrderSubsetEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCBEZRG() {
        if (gcbezrgEClass == null) {
            gcbezrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(492);
        }
        return gcbezrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBEZRG_XPOS() {
        return (EAttribute)getGCBEZRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCBEZRG_YPOS() {
        return (EAttribute)getGCBEZRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCCBEZRG() {
        if (gccbezrgEClass == null) {
            gccbezrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(493);
        }
        return gccbezrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCCBEZRG_XPOS() {
        return (EAttribute)getGCCBEZRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCCBEZRG_YPOS() {
        return (EAttribute)getGCCBEZRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGFLTRG() {
        if (gfltrgEClass == null) {
            gfltrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(494);
        }
        return gfltrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGFLTRG_XPOS() {
        return (EAttribute)getGFLTRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGFLTRG_YPOS() {
        return (EAttribute)getGFLTRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCFLTRG() {
        if (gcfltrgEClass == null) {
            gcfltrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(495);
        }
        return gcfltrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCFLTRG_XPOS() {
        return (EAttribute)getGCFLTRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCFLTRG_YPOS() {
        return (EAttribute)getGCFLTRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGLINERG() {
        if (glinergEClass == null) {
            glinergEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(496);
        }
        return glinergEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGLINERG_XPOS() {
        return (EAttribute)getGLINERG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGLINERG_YPOS() {
        return (EAttribute)getGLINERG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCLINERG() {
        if (gclinergEClass == null) {
            gclinergEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(497);
        }
        return gclinergEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCLINERG_XPOS() {
        return (EAttribute)getGCLINERG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCLINERG_YPOS() {
        return (EAttribute)getGCLINERG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGMRKRG() {
        if (gmrkrgEClass == null) {
            gmrkrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(498);
        }
        return gmrkrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGMRKRG_XPOS() {
        return (EAttribute)getGMRKRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGMRKRG_YPOS() {
        return (EAttribute)getGMRKRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCMRKRG() {
        if (gcmrkrgEClass == null) {
            gcmrkrgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(499);
        }
        return gcmrkrgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCMRKRG_XPOS() {
        return (EAttribute)getGCMRKRG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCMRKRG_YPOS() {
        return (EAttribute)getGCMRKRG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGRLINERG() {
        if (grlinergEClass == null) {
            grlinergEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(500);
        }
        return grlinergEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGRLINERG_XOSSF() {
        return (EAttribute)getGRLINERG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGRLINERG_YOFFS() {
        return (EAttribute)getGRLINERG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGCRLINERG() {
        if (gcrlinergEClass == null) {
            gcrlinergEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(501);
        }
        return gcrlinergEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCRLINERG_XOSSF() {
        return (EAttribute)getGCRLINERG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGCRLINERG_YOFFS() {
        return (EAttribute)getGCRLINERG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTonerSaver() {
        if (tonerSaverEClass == null) {
            tonerSaverEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(502);
        }
        return tonerSaverEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTonerSaver_TSvCtrl() {
        return (EAttribute)getTonerSaver().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getColorFidelity() {
        if (colorFidelityEClass == null) {
            colorFidelityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(503);
        }
        return colorFidelityEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorFidelity_StpCoEx() {
        return (EAttribute)getColorFidelity().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorFidelity_RepCoEx() {
        return (EAttribute)getColorFidelity().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorFidelity_ColSub() {
        return (EAttribute)getColorFidelity().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFontFidelity() {
        if (fontFidelityEClass == null) {
            fontFidelityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(504);
        }
        return fontFidelityEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontFidelity_StpFntEx() {
        return (EAttribute)getFontFidelity().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTextFidelity() {
        if (textFidelityEClass == null) {
            textFidelityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(505);
        }
        return textFidelityEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTextFidelity_StpTxtEx() {
        return (EAttribute)getTextFidelity().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTextFidelity_RepTxtEx() {
        return (EAttribute)getTextFidelity().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMediaFidelity() {
        if (mediaFidelityEClass == null) {
            mediaFidelityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(506);
        }
        return mediaFidelityEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMediaFidelity_StpMedEx() {
        return (EAttribute)getMediaFidelity().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFinishingFidelity() {
        if (finishingFidelityEClass == null) {
            finishingFidelityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(507);
        }
        return finishingFidelityEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFinishingFidelity_StpFinEx() {
        return (EAttribute)getFinishingFidelity().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFinishingFidelity_RepFinEx() {
        return (EAttribute)getFinishingFidelity().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCMRFidelity() {
        if (cmrFidelityEClass == null) {
            cmrFidelityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(508);
        }
        return cmrFidelityEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCMRFidelity_StpCMREx() {
        return (EAttribute)getCMRFidelity().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCMRFidelity_RepCMREx() {
        return (EAttribute)getCMRFidelity().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectByteExtent() {
        if (objectByteExtentEClass == null) {
            objectByteExtentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(509);
        }
        return objectByteExtentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectByteExtent_ByteExt() {
        return (EAttribute)getObjectByteExtent().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectByteExtent_ByteExtHi() {
        return (EAttribute)getObjectByteExtent().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectByteOffset() {
        if (objectByteOffsetEClass == null) {
            objectByteOffsetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(510);
        }
        return objectByteOffsetEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectByteOffset_DirByOff() {
        return (EAttribute)getObjectByteOffset().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectByteOffset_DirByHi() {
        return (EAttribute)getObjectByteOffset().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectStructuredFieldExtent() {
        if (objectStructuredFieldExtentEClass == null) {
            objectStructuredFieldExtentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(511);
        }
        return objectStructuredFieldExtentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectStructuredFieldExtent_SFExt() {
        return (EAttribute)getObjectStructuredFieldExtent().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectStructuredFieldExtent_SFExtHi() {
        return (EAttribute)getObjectStructuredFieldExtent().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectStructuredFieldOffset() {
        if (objectStructuredFieldOffsetEClass == null) {
            objectStructuredFieldOffsetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(512);
        }
        return objectStructuredFieldOffsetEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectStructuredFieldOffset_SFOff() {
        return (EAttribute)getObjectStructuredFieldOffset().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectStructuredFieldOffset_SFOffHi() {
        return (EAttribute)getObjectStructuredFieldOffset().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectCount() {
        if (objectCountEClass == null) {
            objectCountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(513);
        }
        return objectCountEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectCount_SubObj() {
        return (EAttribute)getObjectCount().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectCount_SObjNum() {
        return (EAttribute)getObjectCount().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectCount_SobjNmHi() {
        return (EAttribute)getObjectCount().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectOriginIdentifier() {
        if (objectOriginIdentifierEClass == null) {
            objectOriginIdentifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(514);
        }
        return objectOriginIdentifierEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectOriginIdentifier_System() {
        return (EAttribute)getObjectOriginIdentifier().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectOriginIdentifier_SysID() {
        return (EAttribute)getObjectOriginIdentifier().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectOriginIdentifier_MedID() {
        return (EAttribute)getObjectOriginIdentifier().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectOriginIdentifier_DSID() {
        return (EAttribute)getObjectOriginIdentifier().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLineDataObjectPositionMigration() {
        if (lineDataObjectPositionMigrationEClass == null) {
            lineDataObjectPositionMigrationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(515);
        }
        return lineDataObjectPositionMigrationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLineDataObjectPositionMigration_TempOrient() {
        return (EAttribute)getLineDataObjectPositionMigration().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getColorManagementResourceDescriptor() {
        if (colorManagementResourceDescriptorEClass == null) {
            colorManagementResourceDescriptorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(516);
        }
        return colorManagementResourceDescriptorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorManagementResourceDescriptor_ProcMode() {
        return (EAttribute)getColorManagementResourceDescriptor().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getColorManagementResourceDescriptor_CMRScpe() {
        return (EAttribute)getColorManagementResourceDescriptor().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMSURG() {
        if (msurgEClass == null) {
            msurgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(517);
        }
        return msurgEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMSURG_SUPname() {
        return (EAttribute)getMSURG().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMSURG_Reserved() {
        return (EAttribute)getMSURG().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMSURG_SUPid() {
        return (EAttribute)getMSURG().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImageResolution() {
        if (imageResolutionEClass == null) {
            imageResolutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(518);
        }
        return imageResolutionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageResolution_XBase() {
        return (EAttribute)getImageResolution().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageResolution_YBase() {
        return (EAttribute)getImageResolution().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageResolution_XResol() {
        return (EAttribute)getImageResolution().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImageResolution_YResol() {
        return (EAttribute)getImageResolution().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObjectContainerPresentationSpaceSize() {
        if (objectContainerPresentationSpaceSizeEClass == null) {
            objectContainerPresentationSpaceSizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(519);
        }
        return objectContainerPresentationSpaceSizeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getObjectContainerPresentationSpaceSize_PDFSize() {
        return (EAttribute)getObjectContainerPresentationSpaceSize().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExtendedResourceLocalIdentifier() {
        if (extendedResourceLocalIdentifierEClass == null) {
            extendedResourceLocalIdentifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(520);
        }
        return extendedResourceLocalIdentifierEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExtendedResourceLocalIdentifier_ResType() {
        return (EAttribute)getExtendedResourceLocalIdentifier().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExtendedResourceLocalIdentifier_ResLID() {
        return (EAttribute)getExtendedResourceLocalIdentifier().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMetricAdjustment() {
        if (metricAdjustmentEClass == null) {
            metricAdjustmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(521);
        }
        return metricAdjustmentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMetricAdjustment_UnitBase() {
        return (EAttribute)getMetricAdjustment().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMetricAdjustment_XUPUB() {
        return (EAttribute)getMetricAdjustment().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMetricAdjustment_YUPUB() {
        return (EAttribute)getMetricAdjustment().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMetricAdjustment_HUniformIncrement() {
        return (EAttribute)getMetricAdjustment().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMetricAdjustment_VUniformIncrement() {
        return (EAttribute)getMetricAdjustment().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMetricAdjustment_HBaselineIncrement() {
        return (EAttribute)getMetricAdjustment().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMetricAdjustment_VBaselineIncrement() {
        return (EAttribute)getMetricAdjustment().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExtensionFont() {
        if (extensionFontEClass == null) {
            extensionFontEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(522);
        }
        return extensionFontEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExtensionFont_GCSGID() {
        return (EAttribute)getExtensionFont().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRenderingIntent() {
        if (renderingIntentEClass == null) {
            renderingIntentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(523);
        }
        return renderingIntentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRenderingIntent_Reserved() {
        return (EAttribute)getRenderingIntent().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRenderingIntent_IOCARI() {
        return (EAttribute)getRenderingIntent().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRenderingIntent_OCRI() {
        return (EAttribute)getRenderingIntent().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRenderingIntent_PTOCRI() {
        return (EAttribute)getRenderingIntent().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRenderingIntent_GOCARI() {
        return (EAttribute)getRenderingIntent().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRenderingIntent_Reserved2() {
        return (EAttribute)getRenderingIntent().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFontCodedGraphicCharacterSetGlobalIdentifier() {
        if (fontCodedGraphicCharacterSetGlobalIdentifierEClass == null) {
            fontCodedGraphicCharacterSetGlobalIdentifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(524);
        }
        return fontCodedGraphicCharacterSetGlobalIdentifierEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontCodedGraphicCharacterSetGlobalIdentifier_GCSGID() {
        return (EAttribute)getFontCodedGraphicCharacterSetGlobalIdentifier().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFontCodedGraphicCharacterSetGlobalIdentifier_CPGID() {
        return (EAttribute)getFontCodedGraphicCharacterSetGlobalIdentifier().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLocaleSelector() {
        if (localeSelectorEClass == null) {
            localeSelectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(525);
        }
        return localeSelectorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocaleSelector_LocFlgs() {
        return (EAttribute)getLocaleSelector().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocaleSelector_LangCode() {
        return (EAttribute)getLocaleSelector().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocaleSelector_ScrptCde() {
        return (EAttribute)getLocaleSelector().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocaleSelector_RegCde() {
        return (EAttribute)getLocaleSelector().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocaleSelector_Reserved() {
        return (EAttribute)getLocaleSelector().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLocaleSelector_VarCde() {
        return (EAttribute)getLocaleSelector().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFinishingOperation() {
        if (finishingOperationEClass == null) {
            finishingOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(526);
        }
        return finishingOperationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFinishingOperation_FOpType() {
        return (EAttribute)getFinishingOperation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFinishingOperation_RefEdge() {
        return (EAttribute)getFinishingOperation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFinishingOperation_FOpCnt() {
        return (EAttribute)getFinishingOperation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFinishingOperation_AxOffst() {
        return (EAttribute)getFinishingOperation().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFinishingOperation_OpPos() {
        return (EAttribute)getFinishingOperation().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getUP3iFinishingOperation() {
        if (up3iFinishingOperationEClass == null) {
            up3iFinishingOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(527);
        }
        return up3iFinishingOperationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUP3iFinishingOperation_Seqnum() {
        return (EAttribute)getUP3iFinishingOperation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUP3iFinishingOperation_UP3iDat() {
        return (EAttribute)getUP3iFinishingOperation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDeviceAppearance() {
        if (deviceAppearanceEClass == null) {
            deviceAppearanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(528);
        }
        return deviceAppearanceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDeviceAppearance_DevApp() {
        return (EAttribute)getDeviceAppearance().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDeviceAppearance_Reserved() {
        return (EAttribute)getDeviceAppearance().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResourceObjectInclude() {
        if (resourceObjectIncludeEClass == null) {
            resourceObjectIncludeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(529);
        }
        return resourceObjectIncludeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceObjectInclude_ObjType() {
        return (EAttribute)getResourceObjectInclude().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceObjectInclude_ObjName() {
        return (EAttribute)getResourceObjectInclude().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceObjectInclude_XobjOset() {
        return (EAttribute)getResourceObjectInclude().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceObjectInclude_YobjOset() {
        return (EAttribute)getResourceObjectInclude().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceObjectInclude_ObOrent() {
        return (EAttribute)getResourceObjectInclude().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPageOverlayConditionalProcessing() {
        if (pageOverlayConditionalProcessingEClass == null) {
            pageOverlayConditionalProcessingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(530);
        }
        return pageOverlayConditionalProcessingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPageOverlayConditionalProcessing_PgOvType() {
        return (EAttribute)getPageOverlayConditionalProcessing().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPageOverlayConditionalProcessing_Level() {
        return (EAttribute)getPageOverlayConditionalProcessing().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResourceUsageAttribute() {
        if (resourceUsageAttributeEClass == null) {
            resourceUsageAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(531);
        }
        return resourceUsageAttributeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceUsageAttribute_Frequency() {
        return (EAttribute)getResourceUsageAttribute().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBDAFlags() {
        if (bdaFlagsEEnum == null) {
            bdaFlagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(1);
        }
        return bdaFlagsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBDDUBASE() {
        if (bddubaseEEnum == null) {
            bddubaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(2);
        }
        return bddubaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBDDReserved() {
        if (bddReservedEEnum == null) {
            bddReservedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(3);
        }
        return bddReservedEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBDDReserved2() {
        if (bddReserved2EEnum == null) {
            bddReserved2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(4);
        }
        return bddReserved2EEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBDDTYPE() {
        if (bddtypeEEnum == null) {
            bddtypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(5);
        }
        return bddtypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBDDCOLOR() {
        if (bddcolorEEnum == null) {
            bddcolorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(6);
        }
        return bddcolorEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBDMDatFmt() {
        if (bdmDatFmtEEnum == null) {
            bdmDatFmtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(7);
        }
        return bdmDatFmtEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCDDXocBase() {
        if (cddXocBaseEEnum == null) {
            cddXocBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(8);
        }
        return cddXocBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCDDYocBase() {
        if (cddYocBaseEEnum == null) {
            cddYocBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(9);
        }
        return cddYocBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCFCCFIRGLen() {
        if (cfccfirgLenEEnum == null) {
            cfccfirgLenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(10);
        }
        return cfccfirgLenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCFCRetired1() {
        if (cfcRetired1EEnum == null) {
            cfcRetired1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(11);
        }
        return cfcRetired1EEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCPCPrtFlags() {
        if (cpcPrtFlagsEEnum == null) {
            cpcPrtFlagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(12);
        }
        return cpcPrtFlagsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCPCCPIRGLen() {
        if (cpccpirgLenEEnum == null) {
            cpccpirgLenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(13);
        }
        return cpccpirgLenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCPCVSFlags() {
        if (cpcvsFlagsEEnum == null) {
            cpcvsFlagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(14);
        }
        return cpcvsFlagsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCPDGCGIDLen() {
        if (cpdgcgidLenEEnum == null) {
            cpdgcgidLenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(15);
        }
        return cpdgcgidLenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCPDEncScheme() {
        if (cpdEncSchemeEEnum == null) {
            cpdEncSchemeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(16);
        }
        return cpdEncSchemeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCRetired() {
        if (fncRetiredEEnum == null) {
            fncRetiredEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(17);
        }
        return fncRetiredEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCPatTech() {
        if (fncPatTechEEnum == null) {
            fncPatTechEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(18);
        }
        return fncPatTechEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCFntFlags() {
        if (fncFntFlagsEEnum == null) {
            fncFntFlagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(19);
        }
        return fncFntFlagsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCXUnitBase() {
        if (fncxUnitBaseEEnum == null) {
            fncxUnitBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(20);
        }
        return fncxUnitBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCYUnitBase() {
        if (fncyUnitBaseEEnum == null) {
            fncyUnitBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(21);
        }
        return fncyUnitBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCXftUnits() {
        if (fncXftUnitsEEnum == null) {
            fncXftUnitsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(22);
        }
        return fncXftUnitsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCYftUnits() {
        if (fncYftUnitsEEnum == null) {
            fncYftUnitsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(23);
        }
        return fncYftUnitsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCFNORGLen() {
        if (fncfnorgLenEEnum == null) {
            fncfnorgLenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(24);
        }
        return fncfnorgLenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCFNIRGLen() {
        if (fncfnirgLenEEnum == null) {
            fncfnirgLenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(25);
        }
        return fncfnirgLenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCPatAlign() {
        if (fncPatAlignEEnum == null) {
            fncPatAlignEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(26);
        }
        return fncPatAlignEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCFNPRGLen() {
        if (fncfnprgLenEEnum == null) {
            fncfnprgLenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(27);
        }
        return fncfnprgLenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCFNMRGLen() {
        if (fncfnmrgLenEEnum == null) {
            fncfnmrgLenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(28);
        }
        return fncfnmrgLenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCResXUBase() {
        if (fncResXUBaseEEnum == null) {
            fncResXUBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(29);
        }
        return fncResXUBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCResYUBase() {
        if (fncResYUBaseEEnum == null) {
            fncResYUBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(30);
        }
        return fncResYUBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCXfrUnits() {
        if (fncXfrUnitsEEnum == null) {
            fncXfrUnitsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(31);
        }
        return fncXfrUnitsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCYfrUnits() {
        if (fncYfrUnitsEEnum == null) {
            fncYfrUnitsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(32);
        }
        return fncYfrUnitsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNCFNNRGLen() {
        if (fncfnnrgLenEEnum == null) {
            fncfnnrgLenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(33);
        }
        return fncfnnrgLenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNDFtWtClass() {
        if (fndFtWtClassEEnum == null) {
            fndFtWtClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(34);
        }
        return fndFtWtClassEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNDFtWdClass() {
        if (fndFtWdClassEEnum == null) {
            fndFtWdClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(35);
        }
        return fndFtWdClassEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFNDFtDsFlags() {
        if (fndFtDsFlagsEEnum == null) {
            fndFtDsFlagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(36);
        }
        return fndFtDsFlagsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getIDDUNITBASE() {
        if (iddunitbaseEEnum == null) {
            iddunitbaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(37);
        }
        return iddunitbaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getIOBObjType() {
        if (iobObjTypeEEnum == null) {
            iobObjTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(38);
        }
        return iobObjTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getIOBXoaOrent() {
        if (iobXoaOrentEEnum == null) {
            iobXoaOrentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(39);
        }
        return iobXoaOrentEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getIOBYoaOrent() {
        if (iobYoaOrentEEnum == null) {
            iobYoaOrentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(40);
        }
        return iobYoaOrentEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getIOBRefCSys() {
        if (iobRefCSysEEnum == null) {
            iobRefCSysEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(41);
        }
        return iobRefCSysEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getIPGIPgFlgs() {
        if (ipgiPgFlgsEEnum == null) {
            ipgiPgFlgsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(42);
        }
        return ipgiPgFlgsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getIPOOvlyOrent() {
        if (ipoOvlyOrentEEnum == null) {
            ipoOvlyOrentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(43);
        }
        return ipoOvlyOrentEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMDDXmBase() {
        if (mddXmBaseEEnum == null) {
            mddXmBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(44);
        }
        return mddXmBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMDDYmBase() {
        if (mddYmBaseEEnum == null) {
            mddYmBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(45);
        }
        return mddYmBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMDDMDDFlgs() {
        if (mddmddFlgsEEnum == null) {
            mddmddFlgsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(46);
        }
        return mddmddFlgsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMFCMFCFlgs() {
        if (mfcmfcFlgsEEnum == null) {
            mfcmfcFlgsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(47);
        }
        return mfcmfcFlgsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMFCMedColl() {
        if (mfcMedCollEEnum == null) {
            mfcMedCollEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(48);
        }
        return mfcMedCollEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMFCMFCScpe() {
        if (mfcmfcScpeEEnum == null) {
            mfcmfcScpeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(49);
        }
        return mfcmfcScpeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMMCPARAMETER1() {
        if (mmcparameter1EEnum == null) {
            mmcparameter1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(50);
        }
        return mmcparameter1EEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMMORGLength() {
        if (mmorgLengthEEnum == null) {
            mmorgLengthEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(51);
        }
        return mmorgLengthEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMPSRGLength() {
        if (mpsrgLengthEEnum == null) {
            mpsrgLengthEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(52);
        }
        return mpsrgLengthEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getOBPRGLength() {
        if (obprgLengthEEnum == null) {
            obprgLengthEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(53);
        }
        return obprgLengthEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getOBPXoaOrent() {
        if (obpXoaOrentEEnum == null) {
            obpXoaOrentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(54);
        }
        return obpXoaOrentEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getOBPYoaOrent() {
        if (obpYoaOrentEEnum == null) {
            obpYoaOrentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(55);
        }
        return obpYoaOrentEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getOBPXocaOrent() {
        if (obpXocaOrentEEnum == null) {
            obpXocaOrentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(56);
        }
        return obpXocaOrentEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getOBPYocaOrent() {
        if (obpYocaOrentEEnum == null) {
            obpYocaOrentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(57);
        }
        return obpYocaOrentEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getOBPRefCSys() {
        if (obpRefCSysEEnum == null) {
            obpRefCSysEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(58);
        }
        return obpRefCSysEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPFCPFCFlgs() {
        if (pfcpfcFlgsEEnum == null) {
            pfcpfcFlgsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(59);
        }
        return pfcpfcFlgsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPGDXpgBase() {
        if (pgdXpgBaseEEnum == null) {
            pgdXpgBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(60);
        }
        return pgdXpgBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPGDYpgBase() {
        if (pgdYpgBaseEEnum == null) {
            pgdYpgBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(61);
        }
        return pgdYpgBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPGPConstant() {
        if (pgpConstantEEnum == null) {
            pgpConstantEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(62);
        }
        return pgpConstantEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPTDXPBASE() {
        if (ptdxpbaseEEnum == null) {
            ptdxpbaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(63);
        }
        return ptdxpbaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPTDYPBASE() {
        if (ptdypbaseEEnum == null) {
            ptdypbaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(64);
        }
        return ptdypbaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPTD1XPBASE() {
        if (ptd1XPBASEEEnum == null) {
            ptd1XPBASEEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(65);
        }
        return ptd1XPBASEEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPTD1YPBASE() {
        if (ptd1YPBASEEEnum == null) {
            ptd1YPBASEEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(66);
        }
        return ptd1YPBASEEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getOVSBYPSIDEN() {
        if (ovsbypsidenEEnum == null) {
            ovsbypsidenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(67);
        }
        return ovsbypsidenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSECCOLSPCE() {
        if (seccolspceEEnum == null) {
            seccolspceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(68);
        }
        return seccolspceEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSIADIRCTION() {
        if (siadirctionEEnum == null) {
            siadirctionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(69);
        }
        return siadirctionEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSTCFRGCOLOR() {
        if (stcfrgcolorEEnum == null) {
            stcfrgcolorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(70);
        }
        return stcfrgcolorEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSTCPRECSION() {
        if (stcprecsionEEnum == null) {
            stcprecsionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(71);
        }
        return stcprecsionEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSTOIORNTION() {
        if (stoiorntionEEnum == null) {
            stoiorntionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(72);
        }
        return stoiorntionEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSTOBORNTION() {
        if (stoborntionEEnum == null) {
            stoborntionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(73);
        }
        return stoborntionEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTBMDIRCTION() {
        if (tbmdirctionEEnum == null) {
            tbmdirctionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(74);
        }
        return tbmdirctionEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTBMPRECSION() {
        if (tbmprecsionEEnum == null) {
            tbmprecsionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(75);
        }
        return tbmprecsionEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getUSCBYPSIDEN() {
        if (uscbypsidenEEnum == null) {
            uscbypsidenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(76);
        }
        return uscbypsidenEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCRCResourceManagementFmtQual() {
        if (crcResourceManagementFmtQualEEnum == null) {
            crcResourceManagementFmtQualEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(77);
        }
        return crcResourceManagementFmtQualEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getColorSpecificationColSpce() {
        if (colorSpecificationColSpceEEnum == null) {
            colorSpecificationColSpceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(78);
        }
        return colorSpecificationColSpceEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getDataObjectFontDescriptorFontTech() {
        if (dataObjectFontDescriptorFontTechEEnum == null) {
            dataObjectFontDescriptorFontTechEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(79);
        }
        return dataObjectFontDescriptorFontTechEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getDataObjectFontDescriptorCharRot() {
        if (dataObjectFontDescriptorCharRotEEnum == null) {
            dataObjectFontDescriptorCharRotEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(80);
        }
        return dataObjectFontDescriptorCharRotEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getDataObjectFontDescriptorEncEnv() {
        if (dataObjectFontDescriptorEncEnvEEnum == null) {
            dataObjectFontDescriptorEncEnvEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(81);
        }
        return dataObjectFontDescriptorEncEnvEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getDataObjectFontDescriptorEncID() {
        if (dataObjectFontDescriptorEncIDEEnum == null) {
            dataObjectFontDescriptorEncIDEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(82);
        }
        return dataObjectFontDescriptorEncIDEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getEncodingSchemeIDESidCP() {
        if (encodingSchemeIDESidCPEEnum == null) {
            encodingSchemeIDESidCPEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(83);
        }
        return encodingSchemeIDESidCPEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getEncodingSchemeIDESidUD() {
        if (encodingSchemeIDESidUDEEnum == null) {
            encodingSchemeIDESidUDEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(84);
        }
        return encodingSchemeIDESidUDEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFontResolutionMetTech() {
        if (fontResolutionMetTechEEnum == null) {
            fontResolutionMetTechEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(85);
        }
        return fontResolutionMetTechEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFontResolutionRPuBase() {
        if (fontResolutionRPuBaseEEnum == null) {
            fontResolutionRPuBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(86);
        }
        return fontResolutionRPuBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFontResolutionRPUnits() {
        if (fontResolutionRPUnitsEEnum == null) {
            fontResolutionRPUnitsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(87);
        }
        return fontResolutionRPUnitsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFullyQualifiedNameFQNType() {
        if (fullyQualifiedNameFQNTypeEEnum == null) {
            fullyQualifiedNameFQNTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(88);
        }
        return fullyQualifiedNameFQNTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFullyQualifiedNameFQNFormat() {
        if (fullyQualifiedNameFQNFormatEEnum == null) {
            fullyQualifiedNameFQNFormatEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(89);
        }
        return fullyQualifiedNameFQNFormatEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getLocalDateAndTimeStampStampType() {
        if (localDateAndTimeStampStampTypeEEnum == null) {
            localDateAndTimeStampStampTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(90);
        }
        return localDateAndTimeStampStampTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMappingOptionMapValue() {
        if (mappingOptionMapValueEEnum == null) {
            mappingOptionMapValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(91);
        }
        return mappingOptionMapValueEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMediaEjectControlReserved() {
        if (mediaEjectControlReservedEEnum == null) {
            mediaEjectControlReservedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(92);
        }
        return mediaEjectControlReservedEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMediaEjectControlEjCtrl() {
        if (mediaEjectControlEjCtrlEEnum == null) {
            mediaEjectControlEjCtrlEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(93);
        }
        return mediaEjectControlEjCtrlEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMediumOrientationMedOrient() {
        if (mediumOrientationMedOrientEEnum == null) {
            mediumOrientationMedOrientEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(94);
        }
        return mediumOrientationMedOrientEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMeasurementUnitsXoaBase() {
        if (measurementUnitsXoaBaseEEnum == null) {
            measurementUnitsXoaBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(95);
        }
        return measurementUnitsXoaBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMeasurementUnitsYoaBase() {
        if (measurementUnitsYoaBaseEEnum == null) {
            measurementUnitsYoaBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(96);
        }
        return measurementUnitsYoaBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMODCAInterchangeSetIStype() {
        if (modcaInterchangeSetIStypeEEnum == null) {
            modcaInterchangeSetIStypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(97);
        }
        return modcaInterchangeSetIStypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMODCAInterchangeSetISid() {
        if (modcaInterchangeSetISidEEnum == null) {
            modcaInterchangeSetISidEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(98);
        }
        return modcaInterchangeSetISidEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectAreaSizeSizeType() {
        if (objectAreaSizeSizeTypeEEnum == null) {
            objectAreaSizeSizeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(99);
        }
        return objectAreaSizeSizeTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectClassificationObjClass() {
        if (objectClassificationObjClassEEnum == null) {
            objectClassificationObjClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(100);
        }
        return objectClassificationObjClassEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectClassificationStrucFlgs() {
        if (objectClassificationStrucFlgsEEnum == null) {
            objectClassificationStrucFlgsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(101);
        }
        return objectClassificationStrucFlgsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectFunctionSetSpecificationObjType() {
        if (objectFunctionSetSpecificationObjTypeEEnum == null) {
            objectFunctionSetSpecificationObjTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(102);
        }
        return objectFunctionSetSpecificationObjTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectFunctionSetSpecificationArchVrsn() {
        if (objectFunctionSetSpecificationArchVrsnEEnum == null) {
            objectFunctionSetSpecificationArchVrsnEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(103);
        }
        return objectFunctionSetSpecificationArchVrsnEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectFunctionSetSpecificationDCAFnSet() {
        if (objectFunctionSetSpecificationDCAFnSetEEnum == null) {
            objectFunctionSetSpecificationDCAFnSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(104);
        }
        return objectFunctionSetSpecificationDCAFnSetEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectFunctionSetSpecificationOCAFnSet() {
        if (objectFunctionSetSpecificationOCAFnSetEEnum == null) {
            objectFunctionSetSpecificationOCAFnSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(105);
        }
        return objectFunctionSetSpecificationOCAFnSetEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectOffsetObjTpe() {
        if (objectOffsetObjTpeEEnum == null) {
            objectOffsetObjTpeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(106);
        }
        return objectOffsetObjTpeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getResourceObjectTypeObjType() {
        if (resourceObjectTypeObjTypeEEnum == null) {
            resourceObjectTypeObjTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(107);
        }
        return resourceObjectTypeObjTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPresentationControlPRSFlg() {
        if (presentationControlPRSFlgEEnum == null) {
            presentationControlPRSFlgEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(108);
        }
        return presentationControlPRSFlgEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getResourceLocalIdentifierResType() {
        if (resourceLocalIdentifierResTypeEEnum == null) {
            resourceLocalIdentifierResTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(109);
        }
        return resourceLocalIdentifierResTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTextOrientationIAxis() {
        if (textOrientationIAxisEEnum == null) {
            textOrientationIAxisEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(110);
        }
        return textOrientationIAxisEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTextOrientationBAxis() {
        if (textOrientationBAxisEEnum == null) {
            textOrientationBAxisEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(111);
        }
        return textOrientationBAxisEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFontDescriptorSpecificationFtWtClass() {
        if (fontDescriptorSpecificationFtWtClassEEnum == null) {
            fontDescriptorSpecificationFtWtClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(112);
        }
        return fontDescriptorSpecificationFtWtClassEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFontDescriptorSpecificationFtWdClass() {
        if (fontDescriptorSpecificationFtWdClassEEnum == null) {
            fontDescriptorSpecificationFtWdClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(113);
        }
        return fontDescriptorSpecificationFtWdClassEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFontDescriptorSpecificationFtDsFlags() {
        if (fontDescriptorSpecificationFtDsFlagsEEnum == null) {
            fontDescriptorSpecificationFtDsFlagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(114);
        }
        return fontDescriptorSpecificationFtDsFlagsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFontDescriptorSpecificationFtUsFlags() {
        if (fontDescriptorSpecificationFtUsFlagsEEnum == null) {
            fontDescriptorSpecificationFtUsFlagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(115);
        }
        return fontDescriptorSpecificationFtUsFlagsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getImageEncodingCOMPRID() {
        if (imageEncodingCOMPRIDEEnum == null) {
            imageEncodingCOMPRIDEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(116);
        }
        return imageEncodingCOMPRIDEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getImageEncodingRECID() {
        if (imageEncodingRECIDEEnum == null) {
            imageEncodingRECIDEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(117);
        }
        return imageEncodingRECIDEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getImageEncodingBITORDR() {
        if (imageEncodingBITORDREEnum == null) {
            imageEncodingBITORDREEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(118);
        }
        return imageEncodingBITORDREEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getIDEStructureFLAGS() {
        if (ideStructureFLAGSEEnum == null) {
            ideStructureFLAGSEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(119);
        }
        return ideStructureFLAGSEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getExternalAlgorithmALGTYPE() {
        if (externalAlgorithmALGTYPEEEnum == null) {
            externalAlgorithmALGTYPEEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(120);
        }
        return externalAlgorithmALGTYPEEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTileSetColorCSPACE() {
        if (tileSetColorCSPACEEEnum == null) {
            tileSetColorCSPACEEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(121);
        }
        return tileSetColorCSPACEEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPPORGObjType() {
        if (pporgObjTypeEEnum == null) {
            pporgObjTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(122);
        }
        return pporgObjTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPPORGProcFlgs() {
        if (pporgProcFlgsEEnum == null) {
            pporgProcFlgsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(123);
        }
        return pporgProcFlgsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPGPRGRGLength() {
        if (pgprgrgLengthEEnum == null) {
            pgprgrgLengthEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(124);
        }
        return pgprgrgLengthEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPGPRGPGorient() {
        if (pgprgpGorientEEnum == null) {
            pgprgpGorientEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(125);
        }
        return pgprgpGorientEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPGPRGSHside() {
        if (pgprgsHsideEEnum == null) {
            pgprgsHsideEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(126);
        }
        return pgprgsHsideEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPGPRGPgFlgs() {
        if (pgprgPgFlgsEEnum == null) {
            pgprgPgFlgsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(127);
        }
        return pgprgPgFlgsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMMCRGkey() {
        if (mmcrGkeyEEnum == null) {
            mmcrGkeyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(128);
        }
        return mmcrGkeyEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getExternalAlgorithmRGPADBDRY() {
        if (externalAlgorithmRGPADBDRYEEnum == null) {
            externalAlgorithmRGPADBDRYEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(129);
        }
        return externalAlgorithmRGPADBDRYEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getExternalAlgorithmRGPADALMT() {
        if (externalAlgorithmRGPADALMTEEnum == null) {
            externalAlgorithmRGPADALMTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(130);
        }
        return externalAlgorithmRGPADALMTEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBeginSegmentCommandLENGTH() {
        if (beginSegmentCommandLENGTHEEnum == null) {
            beginSegmentCommandLENGTHEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(131);
        }
        return beginSegmentCommandLENGTHEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBeginSegmentCommandFLAG2() {
        if (beginSegmentCommandFLAG2EEnum == null) {
            beginSegmentCommandFLAG2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(132);
        }
        return beginSegmentCommandFLAG2EEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGBARFLAGS() {
        if (gbarflagsEEnum == null) {
            gbarflagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(133);
        }
        return gbarflagsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGBIMGFORMAT() {
        if (gbimgformatEEnum == null) {
            gbimgformatEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(134);
        }
        return gbimgformatEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGBIMGRES() {
        if (gbimgresEEnum == null) {
            gbimgresEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(135);
        }
        return gbimgresEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGCBIMGFORMAT() {
        if (gcbimgformatEEnum == null) {
            gcbimgformatEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(136);
        }
        return gcbimgformatEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGCBIMGRES() {
        if (gcbimgresEEnum == null) {
            gcbimgresEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(137);
        }
        return gcbimgresEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGBOXRES() {
        if (gboxresEEnum == null) {
            gboxresEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(138);
        }
        return gboxresEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGCBOXRES() {
        if (gcboxresEEnum == null) {
            gcboxresEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(139);
        }
        return gcboxresEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGEPROLRES() {
        if (geprolresEEnum == null) {
            geprolresEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(140);
        }
        return geprolresEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSBMXMODE() {
        if (gsbmxmodeEEnum == null) {
            gsbmxmodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(141);
        }
        return gsbmxmodeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSCDDIRECTION() {
        if (gscddirectionEEnum == null) {
            gscddirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(142);
        }
        return gscddirectionEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSCRPREC() {
        if (gscrprecEEnum == null) {
            gscrprecEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(143);
        }
        return gscrprecEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSCOLCOL() {
        if (gscolcolEEnum == null) {
            gscolcolEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(144);
        }
        return gscolcolEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSLTLINETYPE() {
        if (gsltlinetypeEEnum == null) {
            gsltlinetypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(145);
        }
        return gsltlinetypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSMPPREC() {
        if (gsmpprecEEnum == null) {
            gsmpprecEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(146);
        }
        return gsmpprecEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSMTMCPT() {
        if (gsmtmcptEEnum == null) {
            gsmtmcptEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(147);
        }
        return gsmtmcptEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSMXMODE() {
        if (gsmxmodeEEnum == null) {
            gsmxmodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(148);
        }
        return gsmxmodeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSPSLCID() {
        if (gspslcidEEnum == null) {
            gspslcidEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(149);
        }
        return gspslcidEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSPTPATT() {
        if (gsptpattEEnum == null) {
            gsptpattEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(150);
        }
        return gsptpattEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSPCOLCOLSPCE() {
        if (gspcolcolspceEEnum == null) {
            gspcolcolspceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(151);
        }
        return gspcolcolspceEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSLELINEEND() {
        if (gslelineendEEnum == null) {
            gslelineendEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(152);
        }
        return gslelineendEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGSLJLINEJOIN() {
        if (gsljlinejoinEEnum == null) {
            gsljlinejoinEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(153);
        }
        return gsljlinejoinEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getWindowSpecificationFLAGS() {
        if (windowSpecificationFLAGSEEnum == null) {
            windowSpecificationFLAGSEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(154);
        }
        return windowSpecificationFLAGSEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getWindowSpecificationRES3() {
        if (windowSpecificationRES3EEnum == null) {
            windowSpecificationRES3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(155);
        }
        return windowSpecificationRES3EEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getWindowSpecificationCFORMAT() {
        if (windowSpecificationCFORMATEEnum == null) {
            windowSpecificationCFORMATEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(156);
        }
        return windowSpecificationCFORMATEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getWindowSpecificationUBASE() {
        if (windowSpecificationUBASEEEnum == null) {
            windowSpecificationUBASEEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(157);
        }
        return windowSpecificationUBASEEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTonerSaverTSvCtrl() {
        if (tonerSaverTSvCtrlEEnum == null) {
            tonerSaverTSvCtrlEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(158);
        }
        return tonerSaverTSvCtrlEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getColorFidelityStpCoEx() {
        if (colorFidelityStpCoExEEnum == null) {
            colorFidelityStpCoExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(159);
        }
        return colorFidelityStpCoExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getColorFidelityRepCoEx() {
        if (colorFidelityRepCoExEEnum == null) {
            colorFidelityRepCoExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(160);
        }
        return colorFidelityRepCoExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getColorFidelityColSub() {
        if (colorFidelityColSubEEnum == null) {
            colorFidelityColSubEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(161);
        }
        return colorFidelityColSubEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFontFidelityStpFntEx() {
        if (fontFidelityStpFntExEEnum == null) {
            fontFidelityStpFntExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(162);
        }
        return fontFidelityStpFntExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTextFidelityStpTxtEx() {
        if (textFidelityStpTxtExEEnum == null) {
            textFidelityStpTxtExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(163);
        }
        return textFidelityStpTxtExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTextFidelityRepTxtEx() {
        if (textFidelityRepTxtExEEnum == null) {
            textFidelityRepTxtExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(164);
        }
        return textFidelityRepTxtExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMediaFidelityStpMedEx() {
        if (mediaFidelityStpMedExEEnum == null) {
            mediaFidelityStpMedExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(165);
        }
        return mediaFidelityStpMedExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFinishingFidelityStpFinEx() {
        if (finishingFidelityStpFinExEEnum == null) {
            finishingFidelityStpFinExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(166);
        }
        return finishingFidelityStpFinExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFinishingFidelityRepFinEx() {
        if (finishingFidelityRepFinExEEnum == null) {
            finishingFidelityRepFinExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(167);
        }
        return finishingFidelityRepFinExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCMRFidelityStpCMREx() {
        if (cmrFidelityStpCMRExEEnum == null) {
            cmrFidelityStpCMRExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(168);
        }
        return cmrFidelityStpCMRExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCMRFidelityRepCMREx() {
        if (cmrFidelityRepCMRExEEnum == null) {
            cmrFidelityRepCMRExEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(169);
        }
        return cmrFidelityRepCMRExEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectCountSubObj() {
        if (objectCountSubObjEEnum == null) {
            objectCountSubObjEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(170);
        }
        return objectCountSubObjEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectOriginIdentifierSystem() {
        if (objectOriginIdentifierSystemEEnum == null) {
            objectOriginIdentifierSystemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(171);
        }
        return objectOriginIdentifierSystemEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getLineDataObjectPositionMigrationTempOrient() {
        if (lineDataObjectPositionMigrationTempOrientEEnum == null) {
            lineDataObjectPositionMigrationTempOrientEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(172);
        }
        return lineDataObjectPositionMigrationTempOrientEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getColorManagementResourceDescriptorProcMode() {
        if (colorManagementResourceDescriptorProcModeEEnum == null) {
            colorManagementResourceDescriptorProcModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(173);
        }
        return colorManagementResourceDescriptorProcModeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getColorManagementResourceDescriptorCMRScpe() {
        if (colorManagementResourceDescriptorCMRScpeEEnum == null) {
            colorManagementResourceDescriptorCMRScpeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(174);
        }
        return colorManagementResourceDescriptorCMRScpeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getImageResolutionXBase() {
        if (imageResolutionXBaseEEnum == null) {
            imageResolutionXBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(175);
        }
        return imageResolutionXBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getImageResolutionYBase() {
        if (imageResolutionYBaseEEnum == null) {
            imageResolutionYBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(176);
        }
        return imageResolutionYBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getObjectContainerPresentationSpaceSizePDFSize() {
        if (objectContainerPresentationSpaceSizePDFSizeEEnum == null) {
            objectContainerPresentationSpaceSizePDFSizeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(177);
        }
        return objectContainerPresentationSpaceSizePDFSizeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getExtendedResourceLocalIdentifierResType() {
        if (extendedResourceLocalIdentifierResTypeEEnum == null) {
            extendedResourceLocalIdentifierResTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(178);
        }
        return extendedResourceLocalIdentifierResTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMetricAdjustmentUnitBase() {
        if (metricAdjustmentUnitBaseEEnum == null) {
            metricAdjustmentUnitBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(179);
        }
        return metricAdjustmentUnitBaseEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getRenderingIntentReserved() {
        if (renderingIntentReservedEEnum == null) {
            renderingIntentReservedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(180);
        }
        return renderingIntentReservedEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getRenderingIntentIOCARI() {
        if (renderingIntentIOCARIEEnum == null) {
            renderingIntentIOCARIEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(181);
        }
        return renderingIntentIOCARIEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getRenderingIntentOCRI() {
        if (renderingIntentOCRIEEnum == null) {
            renderingIntentOCRIEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(182);
        }
        return renderingIntentOCRIEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getRenderingIntentPTOCRI() {
        if (renderingIntentPTOCRIEEnum == null) {
            renderingIntentPTOCRIEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(183);
        }
        return renderingIntentPTOCRIEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getRenderingIntentGOCARI() {
        if (renderingIntentGOCARIEEnum == null) {
            renderingIntentGOCARIEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(184);
        }
        return renderingIntentGOCARIEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getRenderingIntentReserved2() {
        if (renderingIntentReserved2EEnum == null) {
            renderingIntentReserved2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(185);
        }
        return renderingIntentReserved2EEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFinishingOperationFOpType() {
        if (finishingOperationFOpTypeEEnum == null) {
            finishingOperationFOpTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(186);
        }
        return finishingOperationFOpTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFinishingOperationRefEdge() {
        if (finishingOperationRefEdgeEEnum == null) {
            finishingOperationRefEdgeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(187);
        }
        return finishingOperationRefEdgeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getDeviceAppearanceDevApp() {
        if (deviceAppearanceDevAppEEnum == null) {
            deviceAppearanceDevAppEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(188);
        }
        return deviceAppearanceDevAppEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getResourceObjectIncludeObjType() {
        if (resourceObjectIncludeObjTypeEEnum == null) {
            resourceObjectIncludeObjTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(189);
        }
        return resourceObjectIncludeObjTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getResourceObjectIncludeObOrent() {
        if (resourceObjectIncludeObOrentEEnum == null) {
            resourceObjectIncludeObOrentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(190);
        }
        return resourceObjectIncludeObOrentEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPageOverlayConditionalProcessingPgOvType() {
        if (pageOverlayConditionalProcessingPgOvTypeEEnum == null) {
            pageOverlayConditionalProcessingPgOvTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(191);
        }
        return pageOverlayConditionalProcessingPgOvTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getResourceUsageAttributeFrequency() {
        if (resourceUsageAttributeFrequencyEEnum == null) {
            resourceUsageAttributeFrequencyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(192);
        }
        return resourceUsageAttributeFrequencyEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSFName() {
        if (sfNameEEnum == null) {
            sfNameEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI).getEClassifiers().get(532);
        }
        return sfNameEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AfplibFactory getAfplibFactory() {
        return (AfplibFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isLoaded = false;

	/**
     * Laods the package and any sub-packages from their serialized form.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void loadPackage() {
        if (isLoaded) return;
        isLoaded = true;

        URL url = getClass().getResource(packageFilename);
        if (url == null) {
            throw new RuntimeException("Missing serialized package: " + packageFilename);
        }
        URI uri = URI.createURI(url.toString());
        Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
        try {
            resource.load(null);
        }
        catch (IOException exception) {
            throw new WrappedException(exception);
        }
        initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
        createResource(eNS_URI);
    }


	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isFixed = false;

	/**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void fixPackageContents() {
        if (isFixed) return;
        isFixed = true;
        fixEClassifiers();
    }

	/**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
        if (eClassifier.getInstanceClassName() == null) {
            eClassifier.setInstanceClassName("org.afplib.afplib." + eClassifier.getName());
            setGeneratedClassName(eClassifier);
        }
    }

} //AfplibPackageImpl
