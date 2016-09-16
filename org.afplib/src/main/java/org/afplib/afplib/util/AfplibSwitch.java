/**
 */
package org.afplib.afplib.util;

import org.afplib.afplib.*;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage
 * @generated
 */
public class AfplibSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AfplibPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfplibSwitch() {
		if (modelPackage == null) {
			modelPackage = AfplibPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AfplibPackage.LINE_DATA: {
				LineData lineData = (LineData)theEObject;
				T result = caseLineData(lineData);
				if (result == null) result = caseSF(lineData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BAG: {
				BAG bag = (BAG)theEObject;
				T result = caseBAG(bag);
				if (result == null) result = caseSF(bag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BBC: {
				BBC bbc = (BBC)theEObject;
				T result = caseBBC(bbc);
				if (result == null) result = caseSF(bbc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BCA: {
				BCA bca = (BCA)theEObject;
				T result = caseBCA(bca);
				if (result == null) result = caseSF(bca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BCF: {
				BCF bcf = (BCF)theEObject;
				T result = caseBCF(bcf);
				if (result == null) result = caseSF(bcf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BCP: {
				BCP bcp = (BCP)theEObject;
				T result = caseBCP(bcp);
				if (result == null) result = caseSF(bcp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BDA: {
				BDA bda = (BDA)theEObject;
				T result = caseBDA(bda);
				if (result == null) result = caseSF(bda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BDD: {
				BDD bdd = (BDD)theEObject;
				T result = caseBDD(bdd);
				if (result == null) result = caseSF(bdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BDG: {
				BDG bdg = (BDG)theEObject;
				T result = caseBDG(bdg);
				if (result == null) result = caseSF(bdg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BDI: {
				BDI bdi = (BDI)theEObject;
				T result = caseBDI(bdi);
				if (result == null) result = caseSF(bdi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BDM: {
				BDM bdm = (BDM)theEObject;
				T result = caseBDM(bdm);
				if (result == null) result = caseSF(bdm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BDT: {
				BDT bdt = (BDT)theEObject;
				T result = caseBDT(bdt);
				if (result == null) result = caseSF(bdt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BDX: {
				BDX bdx = (BDX)theEObject;
				T result = caseBDX(bdx);
				if (result == null) result = caseSF(bdx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BFG: {
				BFG bfg = (BFG)theEObject;
				T result = caseBFG(bfg);
				if (result == null) result = caseSF(bfg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BFM: {
				BFM bfm = (BFM)theEObject;
				T result = caseBFM(bfm);
				if (result == null) result = caseSF(bfm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BFN: {
				BFN bfn = (BFN)theEObject;
				T result = caseBFN(bfn);
				if (result == null) result = caseSF(bfn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BGR: {
				BGR bgr = (BGR)theEObject;
				T result = caseBGR(bgr);
				if (result == null) result = caseSF(bgr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BII: {
				BII bii = (BII)theEObject;
				T result = caseBII(bii);
				if (result == null) result = caseSF(bii);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BIM: {
				BIM bim = (BIM)theEObject;
				T result = caseBIM(bim);
				if (result == null) result = caseSF(bim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BMM: {
				BMM bmm = (BMM)theEObject;
				T result = caseBMM(bmm);
				if (result == null) result = caseSF(bmm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BMO: {
				BMO bmo = (BMO)theEObject;
				T result = caseBMO(bmo);
				if (result == null) result = caseSF(bmo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BNG: {
				BNG bng = (BNG)theEObject;
				T result = caseBNG(bng);
				if (result == null) result = caseSF(bng);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BOC: {
				BOC boc = (BOC)theEObject;
				T result = caseBOC(boc);
				if (result == null) result = caseSF(boc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BOG: {
				BOG bog = (BOG)theEObject;
				T result = caseBOG(bog);
				if (result == null) result = caseSF(bog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BPF: {
				BPF bpf = (BPF)theEObject;
				T result = caseBPF(bpf);
				if (result == null) result = caseSF(bpf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BPG: {
				BPG bpg = (BPG)theEObject;
				T result = caseBPG(bpg);
				if (result == null) result = caseSF(bpg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BPM: {
				BPM bpm = (BPM)theEObject;
				T result = caseBPM(bpm);
				if (result == null) result = caseSF(bpm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BPS: {
				BPS bps = (BPS)theEObject;
				T result = caseBPS(bps);
				if (result == null) result = caseSF(bps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BPT: {
				BPT bpt = (BPT)theEObject;
				T result = caseBPT(bpt);
				if (result == null) result = caseSF(bpt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BRG: {
				BRG brg = (BRG)theEObject;
				T result = caseBRG(brg);
				if (result == null) result = caseSF(brg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BRS: {
				BRS brs = (BRS)theEObject;
				T result = caseBRS(brs);
				if (result == null) result = caseSF(brs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BSG: {
				BSG bsg = (BSG)theEObject;
				T result = caseBSG(bsg);
				if (result == null) result = caseSF(bsg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CAT: {
				CAT cat = (CAT)theEObject;
				T result = caseCAT(cat);
				if (result == null) result = caseSF(cat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CDD: {
				CDD cdd = (CDD)theEObject;
				T result = caseCDD(cdd);
				if (result == null) result = caseSF(cdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CFC: {
				CFC cfc = (CFC)theEObject;
				T result = caseCFC(cfc);
				if (result == null) result = caseSF(cfc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CFI: {
				CFI cfi = (CFI)theEObject;
				T result = caseCFI(cfi);
				if (result == null) result = caseSF(cfi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CPC: {
				CPC cpc = (CPC)theEObject;
				T result = caseCPC(cpc);
				if (result == null) result = caseSF(cpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CPD: {
				CPD cpd = (CPD)theEObject;
				T result = caseCPD(cpd);
				if (result == null) result = caseSF(cpd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CPI: {
				CPI cpi = (CPI)theEObject;
				T result = caseCPI(cpi);
				if (result == null) result = caseSF(cpi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CTC: {
				CTC ctc = (CTC)theEObject;
				T result = caseCTC(ctc);
				if (result == null) result = caseSF(ctc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.DXD: {
				DXD dxd = (DXD)theEObject;
				T result = caseDXD(dxd);
				if (result == null) result = caseSF(dxd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EAG: {
				EAG eag = (EAG)theEObject;
				T result = caseEAG(eag);
				if (result == null) result = caseSF(eag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EBC: {
				EBC ebc = (EBC)theEObject;
				T result = caseEBC(ebc);
				if (result == null) result = caseSF(ebc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ECA: {
				ECA eca = (ECA)theEObject;
				T result = caseECA(eca);
				if (result == null) result = caseSF(eca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ECF: {
				ECF ecf = (ECF)theEObject;
				T result = caseECF(ecf);
				if (result == null) result = caseSF(ecf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ECP: {
				ECP ecp = (ECP)theEObject;
				T result = caseECP(ecp);
				if (result == null) result = caseSF(ecp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EDG: {
				EDG edg = (EDG)theEObject;
				T result = caseEDG(edg);
				if (result == null) result = caseSF(edg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EDI: {
				EDI edi = (EDI)theEObject;
				T result = caseEDI(edi);
				if (result == null) result = caseSF(edi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EDM: {
				EDM edm = (EDM)theEObject;
				T result = caseEDM(edm);
				if (result == null) result = caseSF(edm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EDT: {
				EDT edt = (EDT)theEObject;
				T result = caseEDT(edt);
				if (result == null) result = caseSF(edt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EDX: {
				EDX edx = (EDX)theEObject;
				T result = caseEDX(edx);
				if (result == null) result = caseSF(edx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EFG: {
				EFG efg = (EFG)theEObject;
				T result = caseEFG(efg);
				if (result == null) result = caseSF(efg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EFM: {
				EFM efm = (EFM)theEObject;
				T result = caseEFM(efm);
				if (result == null) result = caseSF(efm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EFN: {
				EFN efn = (EFN)theEObject;
				T result = caseEFN(efn);
				if (result == null) result = caseSF(efn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EGR: {
				EGR egr = (EGR)theEObject;
				T result = caseEGR(egr);
				if (result == null) result = caseSF(egr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EII: {
				EII eii = (EII)theEObject;
				T result = caseEII(eii);
				if (result == null) result = caseSF(eii);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EIM: {
				EIM eim = (EIM)theEObject;
				T result = caseEIM(eim);
				if (result == null) result = caseSF(eim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EMM: {
				EMM emm = (EMM)theEObject;
				T result = caseEMM(emm);
				if (result == null) result = caseSF(emm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EMO: {
				EMO emo = (EMO)theEObject;
				T result = caseEMO(emo);
				if (result == null) result = caseSF(emo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ENG: {
				ENG eng = (ENG)theEObject;
				T result = caseENG(eng);
				if (result == null) result = caseSF(eng);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EOC: {
				EOC eoc = (EOC)theEObject;
				T result = caseEOC(eoc);
				if (result == null) result = caseSF(eoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EOG: {
				EOG eog = (EOG)theEObject;
				T result = caseEOG(eog);
				if (result == null) result = caseSF(eog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EPF: {
				EPF epf = (EPF)theEObject;
				T result = caseEPF(epf);
				if (result == null) result = caseSF(epf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EPG: {
				EPG epg = (EPG)theEObject;
				T result = caseEPG(epg);
				if (result == null) result = caseSF(epg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EPM: {
				EPM epm = (EPM)theEObject;
				T result = caseEPM(epm);
				if (result == null) result = caseSF(epm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EPS: {
				EPS eps = (EPS)theEObject;
				T result = caseEPS(eps);
				if (result == null) result = caseSF(eps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EPT: {
				EPT ept = (EPT)theEObject;
				T result = caseEPT(ept);
				if (result == null) result = caseSF(ept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ERG: {
				ERG erg = (ERG)theEObject;
				T result = caseERG(erg);
				if (result == null) result = caseSF(erg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ERS: {
				ERS ers = (ERS)theEObject;
				T result = caseERS(ers);
				if (result == null) result = caseSF(ers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ESG: {
				ESG esg = (ESG)theEObject;
				T result = caseESG(esg);
				if (result == null) result = caseSF(esg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNC: {
				FNC fnc = (FNC)theEObject;
				T result = caseFNC(fnc);
				if (result == null) result = caseSF(fnc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FND: {
				FND fnd = (FND)theEObject;
				T result = caseFND(fnd);
				if (result == null) result = caseSF(fnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNG: {
				FNG fng = (FNG)theEObject;
				T result = caseFNG(fng);
				if (result == null) result = caseSF(fng);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNI: {
				FNI fni = (FNI)theEObject;
				T result = caseFNI(fni);
				if (result == null) result = caseSF(fni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNN: {
				FNN fnn = (FNN)theEObject;
				T result = caseFNN(fnn);
				if (result == null) result = caseSF(fnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNM: {
				FNM fnm = (FNM)theEObject;
				T result = caseFNM(fnm);
				if (result == null) result = caseSF(fnm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNO: {
				FNO fno = (FNO)theEObject;
				T result = caseFNO(fno);
				if (result == null) result = caseSF(fno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNP: {
				FNP fnp = (FNP)theEObject;
				T result = caseFNP(fnp);
				if (result == null) result = caseSF(fnp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GAD: {
				GAD gad = (GAD)theEObject;
				T result = caseGAD(gad);
				if (result == null) result = caseSF(gad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GDD: {
				GDD gdd = (GDD)theEObject;
				T result = caseGDD(gdd);
				if (result == null) result = caseSF(gdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ICP: {
				ICP icp = (ICP)theEObject;
				T result = caseICP(icp);
				if (result == null) result = caseSF(icp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IDD: {
				IDD idd = (IDD)theEObject;
				T result = caseIDD(idd);
				if (result == null) result = caseSF(idd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IEL: {
				IEL iel = (IEL)theEObject;
				T result = caseIEL(iel);
				if (result == null) result = caseSF(iel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IID: {
				IID iid = (IID)theEObject;
				T result = caseIID(iid);
				if (result == null) result = caseSF(iid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IMM: {
				IMM imm = (IMM)theEObject;
				T result = caseIMM(imm);
				if (result == null) result = caseSF(imm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IOB: {
				IOB iob = (IOB)theEObject;
				T result = caseIOB(iob);
				if (result == null) result = caseSF(iob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IOC: {
				IOC ioc = (IOC)theEObject;
				T result = caseIOC(ioc);
				if (result == null) result = caseSF(ioc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IPD: {
				IPD ipd = (IPD)theEObject;
				T result = caseIPD(ipd);
				if (result == null) result = caseSF(ipd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IPG: {
				IPG ipg = (IPG)theEObject;
				T result = caseIPG(ipg);
				if (result == null) result = caseSF(ipg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IPO: {
				IPO ipo = (IPO)theEObject;
				T result = caseIPO(ipo);
				if (result == null) result = caseSF(ipo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IPS: {
				IPS ips = (IPS)theEObject;
				T result = caseIPS(ips);
				if (result == null) result = caseSF(ips);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IRD: {
				IRD ird = (IRD)theEObject;
				T result = caseIRD(ird);
				if (result == null) result = caseSF(ird);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.LLE: {
				LLE lle = (LLE)theEObject;
				T result = caseLLE(lle);
				if (result == null) result = caseSF(lle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.LNC: {
				LNC lnc = (LNC)theEObject;
				T result = caseLNC(lnc);
				if (result == null) result = caseSF(lnc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.LND: {
				LND lnd = (LND)theEObject;
				T result = caseLND(lnd);
				if (result == null) result = caseSF(lnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MBC: {
				MBC mbc = (MBC)theEObject;
				T result = caseMBC(mbc);
				if (result == null) result = caseSF(mbc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCA: {
				MCA mca = (MCA)theEObject;
				T result = caseMCA(mca);
				if (result == null) result = caseSF(mca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCC: {
				MCC mcc = (MCC)theEObject;
				T result = caseMCC(mcc);
				if (result == null) result = caseSF(mcc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCD: {
				MCD mcd = (MCD)theEObject;
				T result = caseMCD(mcd);
				if (result == null) result = caseSF(mcd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCF: {
				MCF mcf = (MCF)theEObject;
				T result = caseMCF(mcf);
				if (result == null) result = caseSF(mcf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCF1: {
				MCF1 mcf1 = (MCF1)theEObject;
				T result = caseMCF1(mcf1);
				if (result == null) result = caseSF(mcf1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MDD: {
				MDD mdd = (MDD)theEObject;
				T result = caseMDD(mdd);
				if (result == null) result = caseSF(mdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MDR: {
				MDR mdr = (MDR)theEObject;
				T result = caseMDR(mdr);
				if (result == null) result = caseSF(mdr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MFC: {
				MFC mfc = (MFC)theEObject;
				T result = caseMFC(mfc);
				if (result == null) result = caseSF(mfc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MGO: {
				MGO mgo = (MGO)theEObject;
				T result = caseMGO(mgo);
				if (result == null) result = caseSF(mgo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MIO: {
				MIO mio = (MIO)theEObject;
				T result = caseMIO(mio);
				if (result == null) result = caseSF(mio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MMC: {
				MMC mmc = (MMC)theEObject;
				T result = caseMMC(mmc);
				if (result == null) result = caseSF(mmc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MMD: {
				MMD mmd = (MMD)theEObject;
				T result = caseMMD(mmd);
				if (result == null) result = caseSF(mmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MMO: {
				MMO mmo = (MMO)theEObject;
				T result = caseMMO(mmo);
				if (result == null) result = caseSF(mmo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MMT: {
				MMT mmt = (MMT)theEObject;
				T result = caseMMT(mmt);
				if (result == null) result = caseSF(mmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MPG: {
				MPG mpg = (MPG)theEObject;
				T result = caseMPG(mpg);
				if (result == null) result = caseSF(mpg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MPO: {
				MPO mpo = (MPO)theEObject;
				T result = caseMPO(mpo);
				if (result == null) result = caseSF(mpo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MPS: {
				MPS mps = (MPS)theEObject;
				T result = caseMPS(mps);
				if (result == null) result = caseSF(mps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MSU: {
				MSU msu = (MSU)theEObject;
				T result = caseMSU(msu);
				if (result == null) result = caseSF(msu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.NOP: {
				NOP nop = (NOP)theEObject;
				T result = caseNOP(nop);
				if (result == null) result = caseSF(nop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBD: {
				OBD obd = (OBD)theEObject;
				T result = caseOBD(obd);
				if (result == null) result = caseSF(obd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBP: {
				OBP obp = (OBP)theEObject;
				T result = caseOBP(obp);
				if (result == null) result = caseSF(obp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OCD: {
				OCD ocd = (OCD)theEObject;
				T result = caseOCD(ocd);
				if (result == null) result = caseSF(ocd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PEC: {
				PEC pec = (PEC)theEObject;
				T result = casePEC(pec);
				if (result == null) result = caseSF(pec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PFC: {
				PFC pfc = (PFC)theEObject;
				T result = casePFC(pfc);
				if (result == null) result = caseSF(pfc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PGD: {
				PGD pgd = (PGD)theEObject;
				T result = casePGD(pgd);
				if (result == null) result = caseSF(pgd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PGP: {
				PGP pgp = (PGP)theEObject;
				T result = casePGP(pgp);
				if (result == null) result = caseSF(pgp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PGP1: {
				PGP1 pgp1 = (PGP1)theEObject;
				T result = casePGP1(pgp1);
				if (result == null) result = caseSF(pgp1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PMC: {
				PMC pmc = (PMC)theEObject;
				T result = casePMC(pmc);
				if (result == null) result = caseSF(pmc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PPO: {
				PPO ppo = (PPO)theEObject;
				T result = casePPO(ppo);
				if (result == null) result = caseSF(ppo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PTD: {
				PTD ptd = (PTD)theEObject;
				T result = casePTD(ptd);
				if (result == null) result = caseSF(ptd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PTD1: {
				PTD1 ptd1 = (PTD1)theEObject;
				T result = casePTD1(ptd1);
				if (result == null) result = caseSF(ptd1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PTX: {
				PTX ptx = (PTX)theEObject;
				T result = casePTX(ptx);
				if (result == null) result = caseSF(ptx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TLE: {
				TLE tle = (TLE)theEObject;
				T result = caseTLE(tle);
				if (result == null) result = caseSF(tle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FGD: {
				FGD fgd = (FGD)theEObject;
				T result = caseFGD(fgd);
				if (result == null) result = caseSF(fgd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.AMB: {
				AMB amb = (AMB)theEObject;
				T result = caseAMB(amb);
				if (result == null) result = caseTriplet(amb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.AMI: {
				AMI ami = (AMI)theEObject;
				T result = caseAMI(ami);
				if (result == null) result = caseTriplet(ami);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BLN: {
				BLN bln = (BLN)theEObject;
				T result = caseBLN(bln);
				if (result == null) result = caseTriplet(bln);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BSU: {
				BSU bsu = (BSU)theEObject;
				T result = caseBSU(bsu);
				if (result == null) result = caseTriplet(bsu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.DBR: {
				DBR dbr = (DBR)theEObject;
				T result = caseDBR(dbr);
				if (result == null) result = caseTriplet(dbr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.DIR: {
				DIR dir = (DIR)theEObject;
				T result = caseDIR(dir);
				if (result == null) result = caseTriplet(dir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ESU: {
				ESU esu = (ESU)theEObject;
				T result = caseESU(esu);
				if (result == null) result = caseTriplet(esu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.NOPCS: {
				NOPCS nopcs = (NOPCS)theEObject;
				T result = caseNOPCS(nopcs);
				if (result == null) result = caseTriplet(nopcs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OVS: {
				OVS ovs = (OVS)theEObject;
				T result = caseOVS(ovs);
				if (result == null) result = caseTriplet(ovs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.RMB: {
				RMB rmb = (RMB)theEObject;
				T result = caseRMB(rmb);
				if (result == null) result = caseTriplet(rmb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.RMI: {
				RMI rmi = (RMI)theEObject;
				T result = caseRMI(rmi);
				if (result == null) result = caseTriplet(rmi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.RPS: {
				RPS rps = (RPS)theEObject;
				T result = caseRPS(rps);
				if (result == null) result = caseTriplet(rps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.SBI: {
				SBI sbi = (SBI)theEObject;
				T result = caseSBI(sbi);
				if (result == null) result = caseTriplet(sbi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.SCFL: {
				SCFL scfl = (SCFL)theEObject;
				T result = caseSCFL(scfl);
				if (result == null) result = caseTriplet(scfl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.SEC: {
				SEC sec = (SEC)theEObject;
				T result = caseSEC(sec);
				if (result == null) result = caseTriplet(sec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.SIA: {
				SIA sia = (SIA)theEObject;
				T result = caseSIA(sia);
				if (result == null) result = caseTriplet(sia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.SIM: {
				SIM sim = (SIM)theEObject;
				T result = caseSIM(sim);
				if (result == null) result = caseTriplet(sim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.STC: {
				STC stc = (STC)theEObject;
				T result = caseSTC(stc);
				if (result == null) result = caseTriplet(stc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.STO: {
				STO sto = (STO)theEObject;
				T result = caseSTO(sto);
				if (result == null) result = caseTriplet(sto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.SVI: {
				SVI svi = (SVI)theEObject;
				T result = caseSVI(svi);
				if (result == null) result = caseTriplet(svi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TBM: {
				TBM tbm = (TBM)theEObject;
				T result = caseTBM(tbm);
				if (result == null) result = caseTriplet(tbm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TRN: {
				TRN trn = (TRN)theEObject;
				T result = caseTRN(trn);
				if (result == null) result = caseTriplet(trn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.USC: {
				USC usc = (USC)theEObject;
				T result = caseUSC(usc);
				if (result == null) result = caseTriplet(usc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ATTRIBUTE_QUALIFIER: {
				AttributeQualifier attributeQualifier = (AttributeQualifier)theEObject;
				T result = caseAttributeQualifier(attributeQualifier);
				if (result == null) result = caseTriplet(attributeQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				T result = caseAttributeValue(attributeValue);
				if (result == null) result = caseTriplet(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CGCSGID: {
				CGCSGID cgcsgid = (CGCSGID)theEObject;
				T result = caseCGCSGID(cgcsgid);
				if (result == null) result = caseTriplet(cgcsgid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT: {
				CRCResourceManagement crcResourceManagement = (CRCResourceManagement)theEObject;
				T result = caseCRCResourceManagement(crcResourceManagement);
				if (result == null) result = caseTriplet(crcResourceManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CHARACTER_ROTATION: {
				CharacterRotation characterRotation = (CharacterRotation)theEObject;
				T result = caseCharacterRotation(characterRotation);
				if (result == null) result = caseTriplet(characterRotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.COLOR_SPECIFICATION: {
				ColorSpecification colorSpecification = (ColorSpecification)theEObject;
				T result = caseColorSpecification(colorSpecification);
				if (result == null) result = caseTriplet(colorSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseTriplet(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR: {
				DataObjectFontDescriptor dataObjectFontDescriptor = (DataObjectFontDescriptor)theEObject;
				T result = caseDataObjectFontDescriptor(dataObjectFontDescriptor);
				if (result == null) result = caseTriplet(dataObjectFontDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.DESCRIPTOR_POSITION: {
				DescriptorPosition descriptorPosition = (DescriptorPosition)theEObject;
				T result = caseDescriptorPosition(descriptorPosition);
				if (result == null) result = caseTriplet(descriptorPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.ENCODING_SCHEME_ID: {
				EncodingSchemeID encodingSchemeID = (EncodingSchemeID)theEObject;
				T result = caseEncodingSchemeID(encodingSchemeID);
				if (result == null) result = caseTriplet(encodingSchemeID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FONT_RESOLUTION: {
				FontResolution fontResolution = (FontResolution)theEObject;
				T result = caseFontResolution(fontResolution);
				if (result == null) result = caseTriplet(fontResolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FULLY_QUALIFIED_NAME: {
				FullyQualifiedName fullyQualifiedName = (FullyQualifiedName)theEObject;
				T result = caseFullyQualifiedName(fullyQualifiedName);
				if (result == null) result = caseTriplet(fullyQualifiedName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP: {
				LocalDateAndTimeStamp localDateAndTimeStamp = (LocalDateAndTimeStamp)theEObject;
				T result = caseLocalDateAndTimeStamp(localDateAndTimeStamp);
				if (result == null) result = caseTriplet(localDateAndTimeStamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP: {
				UniversalDateAndTimeStamp universalDateAndTimeStamp = (UniversalDateAndTimeStamp)theEObject;
				T result = caseUniversalDateAndTimeStamp(universalDateAndTimeStamp);
				if (result == null) result = caseTriplet(universalDateAndTimeStamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MAPPING_OPTION: {
				MappingOption mappingOption = (MappingOption)theEObject;
				T result = caseMappingOption(mappingOption);
				if (result == null) result = caseTriplet(mappingOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MEDIA_EJECT_CONTROL: {
				MediaEjectControl mediaEjectControl = (MediaEjectControl)theEObject;
				T result = caseMediaEjectControl(mediaEjectControl);
				if (result == null) result = caseTriplet(mediaEjectControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MEDIUM_MAP_PAGE_NUMBER: {
				MediumMapPageNumber mediumMapPageNumber = (MediumMapPageNumber)theEObject;
				T result = caseMediumMapPageNumber(mediumMapPageNumber);
				if (result == null) result = caseTriplet(mediumMapPageNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MEDIUM_ORIENTATION: {
				MediumOrientation mediumOrientation = (MediumOrientation)theEObject;
				T result = caseMediumOrientation(mediumOrientation);
				if (result == null) result = caseTriplet(mediumOrientation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MEASUREMENT_UNITS: {
				MeasurementUnits measurementUnits = (MeasurementUnits)theEObject;
				T result = caseMeasurementUnits(measurementUnits);
				if (result == null) result = caseTriplet(measurementUnits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MODCA_INTERCHANGE_SET: {
				MODCAInterchangeSet modcaInterchangeSet = (MODCAInterchangeSet)theEObject;
				T result = caseMODCAInterchangeSet(modcaInterchangeSet);
				if (result == null) result = caseTriplet(modcaInterchangeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_AREA_SIZE: {
				ObjectAreaSize objectAreaSize = (ObjectAreaSize)theEObject;
				T result = caseObjectAreaSize(objectAreaSize);
				if (result == null) result = caseTriplet(objectAreaSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_CLASSIFICATION: {
				ObjectClassification objectClassification = (ObjectClassification)theEObject;
				T result = caseObjectClassification(objectClassification);
				if (result == null) result = caseTriplet(objectClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION: {
				ObjectFunctionSetSpecification objectFunctionSetSpecification = (ObjectFunctionSetSpecification)theEObject;
				T result = caseObjectFunctionSetSpecification(objectFunctionSetSpecification);
				if (result == null) result = caseTriplet(objectFunctionSetSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_OFFSET: {
				ObjectOffset objectOffset = (ObjectOffset)theEObject;
				T result = caseObjectOffset(objectOffset);
				if (result == null) result = caseTriplet(objectOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.RESOURCE_OBJECT_TYPE: {
				ResourceObjectType resourceObjectType = (ResourceObjectType)theEObject;
				T result = caseResourceObjectType(resourceObjectType);
				if (result == null) result = caseTriplet(resourceObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PAGE_POSITION_INFORMATION: {
				PagePositionInformation pagePositionInformation = (PagePositionInformation)theEObject;
				T result = casePagePositionInformation(pagePositionInformation);
				if (result == null) result = caseTriplet(pagePositionInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PRESENTATION_CONTROL: {
				PresentationControl presentationControl = (PresentationControl)theEObject;
				T result = casePresentationControl(presentationControl);
				if (result == null) result = caseTriplet(presentationControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PRESENTATION_SPACE_RESET_MIXING: {
				PresentationSpaceResetMixing presentationSpaceResetMixing = (PresentationSpaceResetMixing)theEObject;
				T result = casePresentationSpaceResetMixing(presentationSpaceResetMixing);
				if (result == null) result = caseTriplet(presentationSpaceResetMixing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PRESENTATION_SPACE_MIXING_RULES: {
				PresentationSpaceMixingRules presentationSpaceMixingRules = (PresentationSpaceMixingRules)theEObject;
				T result = casePresentationSpaceMixingRules(presentationSpaceMixingRules);
				if (result == null) result = caseTriplet(presentationSpaceMixingRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.RESOURCE_LOCAL_IDENTIFIER: {
				ResourceLocalIdentifier resourceLocalIdentifier = (ResourceLocalIdentifier)theEObject;
				T result = caseResourceLocalIdentifier(resourceLocalIdentifier);
				if (result == null) result = caseTriplet(resourceLocalIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.RESOURCE_SECTION_NUMBER: {
				ResourceSectionNumber resourceSectionNumber = (ResourceSectionNumber)theEObject;
				T result = caseResourceSectionNumber(resourceSectionNumber);
				if (result == null) result = caseTriplet(resourceSectionNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TEXT_ORIENTATION: {
				TextOrientation textOrientation = (TextOrientation)theEObject;
				T result = caseTextOrientation(textOrientation);
				if (result == null) result = caseTriplet(textOrientation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FONT_HORIZONTAL_SCALE_FACTOR: {
				FontHorizontalScaleFactor fontHorizontalScaleFactor = (FontHorizontalScaleFactor)theEObject;
				T result = caseFontHorizontalScaleFactor(fontHorizontalScaleFactor);
				if (result == null) result = caseTriplet(fontHorizontalScaleFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION: {
				FontDescriptorSpecification fontDescriptorSpecification = (FontDescriptorSpecification)theEObject;
				T result = caseFontDescriptorSpecification(fontDescriptorSpecification);
				if (result == null) result = caseTriplet(fontDescriptorSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BEGIN_SEGMENT: {
				BeginSegment beginSegment = (BeginSegment)theEObject;
				T result = caseBeginSegment(beginSegment);
				if (result == null) result = caseTriplet(beginSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.END_SEGMENT: {
				EndSegment endSegment = (EndSegment)theEObject;
				T result = caseEndSegment(endSegment);
				if (result == null) result = caseTriplet(endSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BEGIN_TILE: {
				BeginTile beginTile = (BeginTile)theEObject;
				T result = caseBeginTile(beginTile);
				if (result == null) result = caseTriplet(beginTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.END_TILE: {
				EndTile endTile = (EndTile)theEObject;
				T result = caseEndTile(endTile);
				if (result == null) result = caseTriplet(endTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BEGIN_TRANSPARENCY_MASK: {
				BeginTransparencyMask beginTransparencyMask = (BeginTransparencyMask)theEObject;
				T result = caseBeginTransparencyMask(beginTransparencyMask);
				if (result == null) result = caseTriplet(beginTransparencyMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.END_TRANSPARENCY_MASK: {
				EndTransparencyMask endTransparencyMask = (EndTransparencyMask)theEObject;
				T result = caseEndTransparencyMask(endTransparencyMask);
				if (result == null) result = caseTriplet(endTransparencyMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BEGIN_IMAGE: {
				BeginImage beginImage = (BeginImage)theEObject;
				T result = caseBeginImage(beginImage);
				if (result == null) result = caseTriplet(beginImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.END_IMAGE: {
				EndImage endImage = (EndImage)theEObject;
				T result = caseEndImage(endImage);
				if (result == null) result = caseTriplet(endImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IMAGE_SIZE: {
				ImageSize imageSize = (ImageSize)theEObject;
				T result = caseImageSize(imageSize);
				if (result == null) result = caseTriplet(imageSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IMAGE_ENCODING: {
				ImageEncoding imageEncoding = (ImageEncoding)theEObject;
				T result = caseImageEncoding(imageEncoding);
				if (result == null) result = caseTriplet(imageEncoding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IDE_SIZE: {
				IDESize ideSize = (IDESize)theEObject;
				T result = caseIDESize(ideSize);
				if (result == null) result = caseTriplet(ideSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IMAGE_LUTID: {
				ImageLUTID imageLUTID = (ImageLUTID)theEObject;
				T result = caseImageLUTID(imageLUTID);
				if (result == null) result = caseTriplet(imageLUTID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BAND_IMAGE: {
				BandImage bandImage = (BandImage)theEObject;
				T result = caseBandImage(bandImage);
				if (result == null) result = caseTriplet(bandImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IDE_STRUCTURE: {
				IDEStructure ideStructure = (IDEStructure)theEObject;
				T result = caseIDEStructure(ideStructure);
				if (result == null) result = caseTriplet(ideStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EXTERNAL_ALGORITHM: {
				ExternalAlgorithm externalAlgorithm = (ExternalAlgorithm)theEObject;
				T result = caseExternalAlgorithm(externalAlgorithm);
				if (result == null) result = caseTriplet(externalAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TILE_POSITION: {
				TilePosition tilePosition = (TilePosition)theEObject;
				T result = caseTilePosition(tilePosition);
				if (result == null) result = caseTriplet(tilePosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TILE_SIZE: {
				TileSize tileSize = (TileSize)theEObject;
				T result = caseTileSize(tileSize);
				if (result == null) result = caseTriplet(tileSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TILE_SET_COLOR: {
				TileSetColor tileSetColor = (TileSetColor)theEObject;
				T result = caseTileSetColor(tileSetColor);
				if (result == null) result = caseTriplet(tileSetColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR: {
				SetBiLevelImageColor setBiLevelImageColor = (SetBiLevelImageColor)theEObject;
				T result = caseSetBiLevelImageColor(setBiLevelImageColor);
				if (result == null) result = caseTriplet(setBiLevelImageColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION: {
				IOCAFunctionSetIdentification iocaFunctionSetIdentification = (IOCAFunctionSetIdentification)theEObject;
				T result = caseIOCAFunctionSetIdentification(iocaFunctionSetIdentification);
				if (result == null) result = caseTriplet(iocaFunctionSetIdentification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IMAGE_DATA: {
				ImageData imageData = (ImageData)theEObject;
				T result = caseImageData(imageData);
				if (result == null) result = caseTriplet(imageData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BAND_IMAGE_DATA: {
				BandImageData bandImageData = (BandImageData)theEObject;
				T result = caseBandImageData(bandImageData);
				if (result == null) result = caseTriplet(bandImageData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.INCLUDE_TILE: {
				IncludeTile includeTile = (IncludeTile)theEObject;
				T result = caseIncludeTile(includeTile);
				if (result == null) result = caseTriplet(includeTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IMAGE_SUBSAMPLING: {
				ImageSubsampling imageSubsampling = (ImageSubsampling)theEObject;
				T result = caseImageSubsampling(imageSubsampling);
				if (result == null) result = caseTriplet(imageSubsampling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.SAMPLING_RATIOS: {
				SamplingRatios samplingRatios = (SamplingRatios)theEObject;
				T result = caseSamplingRatios(samplingRatios);
				if (result == null) result = caseTriplet(samplingRatios);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TILE_TOC: {
				TileTOC tileTOC = (TileTOC)theEObject;
				T result = caseTileTOC(tileTOC);
				if (result == null) result = caseTriplet(tileTOC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CPIRG: {
				CPIRG cpirg = (CPIRG)theEObject;
				T result = caseCPIRG(cpirg);
				if (result == null) result = caseTriplet(cpirg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CFIRG: {
				CFIRG cfirg = (CFIRG)theEObject;
				T result = caseCFIRG(cfirg);
				if (result == null) result = caseTriplet(cfirg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNIRG: {
				FNIRG fnirg = (FNIRG)theEObject;
				T result = caseFNIRG(fnirg);
				if (result == null) result = caseTriplet(fnirg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNMRG: {
				FNMRG fnmrg = (FNMRG)theEObject;
				T result = caseFNMRG(fnmrg);
				if (result == null) result = caseTriplet(fnmrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.LLERG: {
				LLERG llerg = (LLERG)theEObject;
				T result = caseLLERG(llerg);
				if (result == null) result = caseTriplet(llerg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MPSRG: {
				MPSRG mpsrg = (MPSRG)theEObject;
				T result = caseMPSRG(mpsrg);
				if (result == null) result = caseTriplet(mpsrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCFRG: {
				MCFRG mcfrg = (MCFRG)theEObject;
				T result = caseMCFRG(mcfrg);
				if (result == null) result = caseTriplet(mcfrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MBCRG: {
				MBCRG mbcrg = (MBCRG)theEObject;
				T result = caseMBCRG(mbcrg);
				if (result == null) result = caseTriplet(mbcrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCARG: {
				MCARG mcarg = (MCARG)theEObject;
				T result = caseMCARG(mcarg);
				if (result == null) result = caseTriplet(mcarg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCDRG: {
				MCDRG mcdrg = (MCDRG)theEObject;
				T result = caseMCDRG(mcdrg);
				if (result == null) result = caseTriplet(mcdrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MDRRG: {
				MDRRG mdrrg = (MDRRG)theEObject;
				T result = caseMDRRG(mdrrg);
				if (result == null) result = caseTriplet(mdrrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MGORG: {
				MGORG mgorg = (MGORG)theEObject;
				T result = caseMGORG(mgorg);
				if (result == null) result = caseTriplet(mgorg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MIORG: {
				MIORG miorg = (MIORG)theEObject;
				T result = caseMIORG(miorg);
				if (result == null) result = caseTriplet(miorg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MMDRG: {
				MMDRG mmdrg = (MMDRG)theEObject;
				T result = caseMMDRG(mmdrg);
				if (result == null) result = caseTriplet(mmdrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MMTRG: {
				MMTRG mmtrg = (MMTRG)theEObject;
				T result = caseMMTRG(mmtrg);
				if (result == null) result = caseTriplet(mmtrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MPGRG: {
				MPGRG mpgrg = (MPGRG)theEObject;
				T result = caseMPGRG(mpgrg);
				if (result == null) result = caseTriplet(mpgrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MPORG: {
				MPORG mporg = (MPORG)theEObject;
				T result = caseMPORG(mporg);
				if (result == null) result = caseTriplet(mporg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PPORG: {
				PPORG pporg = (PPORG)theEObject;
				T result = casePPORG(pporg);
				if (result == null) result = caseTriplet(pporg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PGPRG: {
				PGPRG pgprg = (PGPRG)theEObject;
				T result = casePGPRG(pgprg);
				if (result == null) result = caseTriplet(pgprg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCCRG: {
				MCCRG mccrg = (MCCRG)theEObject;
				T result = caseMCCRG(mccrg);
				if (result == null) result = caseTriplet(mccrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MMORG: {
				MMORG mmorg = (MMORG)theEObject;
				T result = caseMMORG(mmorg);
				if (result == null) result = caseTriplet(mmorg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BAND_IMAGE_RG: {
				BandImageRG bandImageRG = (BandImageRG)theEObject;
				T result = caseBandImageRG(bandImageRG);
				if (result == null) result = caseTriplet(bandImageRG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MCF1RG: {
				MCF1RG mcf1RG = (MCF1RG)theEObject;
				T result = caseMCF1RG(mcf1RG);
				if (result == null) result = caseTriplet(mcf1RG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MMCRG: {
				MMCRG mmcrg = (MMCRG)theEObject;
				T result = caseMMCRG(mmcrg);
				if (result == null) result = caseTriplet(mmcrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNORG: {
				FNORG fnorg = (FNORG)theEObject;
				T result = caseFNORG(fnorg);
				if (result == null) result = caseTriplet(fnorg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNPRG: {
				FNPRG fnprg = (FNPRG)theEObject;
				T result = caseFNPRG(fnprg);
				if (result == null) result = caseTriplet(fnprg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TILE_TOCRG: {
				TileTOCRG tileTOCRG = (TileTOCRG)theEObject;
				T result = caseTileTOCRG(tileTOCRG);
				if (result == null) result = caseTriplet(tileTOCRG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.SAMPLING_RATIOS_RG: {
				SamplingRatiosRG samplingRatiosRG = (SamplingRatiosRG)theEObject;
				T result = caseSamplingRatiosRG(samplingRatiosRG);
				if (result == null) result = caseTriplet(samplingRatiosRG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EXTERNAL_ALGORITHM_RG: {
				ExternalAlgorithmRG externalAlgorithmRG = (ExternalAlgorithmRG)theEObject;
				T result = caseExternalAlgorithmRG(externalAlgorithmRG);
				if (result == null) result = caseTriplet(externalAlgorithmRG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNNRG: {
				FNNRG fnnrg = (FNNRG)theEObject;
				T result = caseFNNRG(fnnrg);
				if (result == null) result = caseTriplet(fnnrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FNNRG2: {
				FNNRG2 fnnrg2 = (FNNRG2)theEObject;
				T result = caseFNNRG2(fnnrg2);
				if (result == null) result = caseTriplet(fnnrg2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.BEGIN_SEGMENT_COMMAND: {
				BeginSegmentCommand beginSegmentCommand = (BeginSegmentCommand)theEObject;
				T result = caseBeginSegmentCommand(beginSegmentCommand);
				if (result == null) result = caseTriplet(beginSegmentCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.END_SEGMENT_COMMAND: {
				EndSegmentCommand endSegmentCommand = (EndSegmentCommand)theEObject;
				T result = caseEndSegmentCommand(endSegmentCommand);
				if (result == null) result = caseTriplet(endSegmentCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GBAR: {
				GBAR gbar = (GBAR)theEObject;
				T result = caseGBAR(gbar);
				if (result == null) result = caseTriplet(gbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GBIMG: {
				GBIMG gbimg = (GBIMG)theEObject;
				T result = caseGBIMG(gbimg);
				if (result == null) result = caseTriplet(gbimg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCBIMG: {
				GCBIMG gcbimg = (GCBIMG)theEObject;
				T result = caseGCBIMG(gcbimg);
				if (result == null) result = caseTriplet(gcbimg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GBOX: {
				GBOX gbox = (GBOX)theEObject;
				T result = caseGBOX(gbox);
				if (result == null) result = caseTriplet(gbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCBOX: {
				GCBOX gcbox = (GCBOX)theEObject;
				T result = caseGCBOX(gcbox);
				if (result == null) result = caseTriplet(gcbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCHST: {
				GCHST gchst = (GCHST)theEObject;
				T result = caseGCHST(gchst);
				if (result == null) result = caseTriplet(gchst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCCHST: {
				GCCHST gcchst = (GCCHST)theEObject;
				T result = caseGCCHST(gcchst);
				if (result == null) result = caseTriplet(gcchst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCOMT: {
				GCOMT gcomt = (GCOMT)theEObject;
				T result = caseGCOMT(gcomt);
				if (result == null) result = caseTriplet(gcomt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GEAR: {
				GEAR gear = (GEAR)theEObject;
				T result = caseGEAR(gear);
				if (result == null) result = caseTriplet(gear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GEIMG: {
				GEIMG geimg = (GEIMG)theEObject;
				T result = caseGEIMG(geimg);
				if (result == null) result = caseTriplet(geimg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GEPROL: {
				GEPROL geprol = (GEPROL)theEObject;
				T result = caseGEPROL(geprol);
				if (result == null) result = caseTriplet(geprol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GFLT: {
				GFLT gflt = (GFLT)theEObject;
				T result = caseGFLT(gflt);
				if (result == null) result = caseTriplet(gflt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCFLT: {
				GCFLT gcflt = (GCFLT)theEObject;
				T result = caseGCFLT(gcflt);
				if (result == null) result = caseTriplet(gcflt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GFARC: {
				GFARC gfarc = (GFARC)theEObject;
				T result = caseGFARC(gfarc);
				if (result == null) result = caseTriplet(gfarc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCFARC: {
				GCFARC gcfarc = (GCFARC)theEObject;
				T result = caseGCFARC(gcfarc);
				if (result == null) result = caseTriplet(gcfarc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GIMD: {
				GIMD gimd = (GIMD)theEObject;
				T result = caseGIMD(gimd);
				if (result == null) result = caseTriplet(gimd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GLINE: {
				GLINE gline = (GLINE)theEObject;
				T result = caseGLINE(gline);
				if (result == null) result = caseTriplet(gline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCLINE: {
				GCLINE gcline = (GCLINE)theEObject;
				T result = caseGCLINE(gcline);
				if (result == null) result = caseTriplet(gcline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GMRK: {
				GMRK gmrk = (GMRK)theEObject;
				T result = caseGMRK(gmrk);
				if (result == null) result = caseTriplet(gmrk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCMRK: {
				GCMRK gcmrk = (GCMRK)theEObject;
				T result = caseGCMRK(gcmrk);
				if (result == null) result = caseTriplet(gcmrk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GNOP1: {
				GNOP1 gnop1 = (GNOP1)theEObject;
				T result = caseGNOP1(gnop1);
				if (result == null) result = caseTriplet(gnop1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GPARC: {
				GPARC gparc = (GPARC)theEObject;
				T result = caseGPARC(gparc);
				if (result == null) result = caseTriplet(gparc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCPARC: {
				GCPARC gcparc = (GCPARC)theEObject;
				T result = caseGCPARC(gcparc);
				if (result == null) result = caseTriplet(gcparc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GRLINE: {
				GRLINE grline = (GRLINE)theEObject;
				T result = caseGRLINE(grline);
				if (result == null) result = caseTriplet(grline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCRLINE: {
				GCRLINE gcrline = (GCRLINE)theEObject;
				T result = caseGCRLINE(gcrline);
				if (result == null) result = caseTriplet(gcrline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSGCH: {
				GSGCH gsgch = (GSGCH)theEObject;
				T result = caseGSGCH(gsgch);
				if (result == null) result = caseTriplet(gsgch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSAP: {
				GSAP gsap = (GSAP)theEObject;
				T result = caseGSAP(gsap);
				if (result == null) result = caseTriplet(gsap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSBMX: {
				GSBMX gsbmx = (GSBMX)theEObject;
				T result = caseGSBMX(gsbmx);
				if (result == null) result = caseTriplet(gsbmx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSCA: {
				GSCA gsca = (GSCA)theEObject;
				T result = caseGSCA(gsca);
				if (result == null) result = caseTriplet(gsca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSCC: {
				GSCC gscc = (GSCC)theEObject;
				T result = caseGSCC(gscc);
				if (result == null) result = caseTriplet(gscc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSCD: {
				GSCD gscd = (GSCD)theEObject;
				T result = caseGSCD(gscd);
				if (result == null) result = caseTriplet(gscd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSCR: {
				GSCR gscr = (GSCR)theEObject;
				T result = caseGSCR(gscr);
				if (result == null) result = caseTriplet(gscr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSCS: {
				GSCS gscs = (GSCS)theEObject;
				T result = caseGSCS(gscs);
				if (result == null) result = caseTriplet(gscs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSCH: {
				GSCH gsch = (GSCH)theEObject;
				T result = caseGSCH(gsch);
				if (result == null) result = caseTriplet(gsch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSCOL: {
				GSCOL gscol = (GSCOL)theEObject;
				T result = caseGSCOL(gscol);
				if (result == null) result = caseTriplet(gscol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSCP: {
				GSCP gscp = (GSCP)theEObject;
				T result = caseGSCP(gscp);
				if (result == null) result = caseTriplet(gscp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSECOL: {
				GSECOL gsecol = (GSECOL)theEObject;
				T result = caseGSECOL(gsecol);
				if (result == null) result = caseTriplet(gsecol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSFLW: {
				GSFLW gsflw = (GSFLW)theEObject;
				T result = caseGSFLW(gsflw);
				if (result == null) result = caseTriplet(gsflw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSLT: {
				GSLT gslt = (GSLT)theEObject;
				T result = caseGSLT(gslt);
				if (result == null) result = caseTriplet(gslt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSLW: {
				GSLW gslw = (GSLW)theEObject;
				T result = caseGSLW(gslw);
				if (result == null) result = caseTriplet(gslw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSMC: {
				GSMC gsmc = (GSMC)theEObject;
				T result = caseGSMC(gsmc);
				if (result == null) result = caseTriplet(gsmc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSMP: {
				GSMP gsmp = (GSMP)theEObject;
				T result = caseGSMP(gsmp);
				if (result == null) result = caseTriplet(gsmp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSMS: {
				GSMS gsms = (GSMS)theEObject;
				T result = caseGSMS(gsms);
				if (result == null) result = caseTriplet(gsms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSMT: {
				GSMT gsmt = (GSMT)theEObject;
				T result = caseGSMT(gsmt);
				if (result == null) result = caseTriplet(gsmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSMX: {
				GSMX gsmx = (GSMX)theEObject;
				T result = caseGSMX(gsmx);
				if (result == null) result = caseTriplet(gsmx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSPS: {
				GSPS gsps = (GSPS)theEObject;
				T result = caseGSPS(gsps);
				if (result == null) result = caseTriplet(gsps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSPT: {
				GSPT gspt = (GSPT)theEObject;
				T result = caseGSPT(gspt);
				if (result == null) result = caseTriplet(gspt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSPCOL: {
				GSPCOL gspcol = (GSPCOL)theEObject;
				T result = caseGSPCOL(gspcol);
				if (result == null) result = caseTriplet(gspcol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSLE: {
				GSLE gsle = (GSLE)theEObject;
				T result = caseGSLE(gsle);
				if (result == null) result = caseTriplet(gsle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GSLJ: {
				GSLJ gslj = (GSLJ)theEObject;
				T result = caseGSLJ(gslj);
				if (result == null) result = caseTriplet(gslj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCBEZ: {
				GCBEZ gcbez = (GCBEZ)theEObject;
				T result = caseGCBEZ(gcbez);
				if (result == null) result = caseTriplet(gcbez);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCCBEZ: {
				GCCBEZ gccbez = (GCCBEZ)theEObject;
				T result = caseGCCBEZ(gccbez);
				if (result == null) result = caseTriplet(gccbez);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.WINDOW_SPECIFICATION: {
				WindowSpecification windowSpecification = (WindowSpecification)theEObject;
				T result = caseWindowSpecification(windowSpecification);
				if (result == null) result = caseTriplet(windowSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.DRAWING_ORDER_SUBSET: {
				DrawingOrderSubset drawingOrderSubset = (DrawingOrderSubset)theEObject;
				T result = caseDrawingOrderSubset(drawingOrderSubset);
				if (result == null) result = caseTriplet(drawingOrderSubset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCBEZRG: {
				GCBEZRG gcbezrg = (GCBEZRG)theEObject;
				T result = caseGCBEZRG(gcbezrg);
				if (result == null) result = caseTriplet(gcbezrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCCBEZRG: {
				GCCBEZRG gccbezrg = (GCCBEZRG)theEObject;
				T result = caseGCCBEZRG(gccbezrg);
				if (result == null) result = caseTriplet(gccbezrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GFLTRG: {
				GFLTRG gfltrg = (GFLTRG)theEObject;
				T result = caseGFLTRG(gfltrg);
				if (result == null) result = caseTriplet(gfltrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCFLTRG: {
				GCFLTRG gcfltrg = (GCFLTRG)theEObject;
				T result = caseGCFLTRG(gcfltrg);
				if (result == null) result = caseTriplet(gcfltrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GLINERG: {
				GLINERG glinerg = (GLINERG)theEObject;
				T result = caseGLINERG(glinerg);
				if (result == null) result = caseTriplet(glinerg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCLINERG: {
				GCLINERG gclinerg = (GCLINERG)theEObject;
				T result = caseGCLINERG(gclinerg);
				if (result == null) result = caseTriplet(gclinerg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GMRKRG: {
				GMRKRG gmrkrg = (GMRKRG)theEObject;
				T result = caseGMRKRG(gmrkrg);
				if (result == null) result = caseTriplet(gmrkrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCMRKRG: {
				GCMRKRG gcmrkrg = (GCMRKRG)theEObject;
				T result = caseGCMRKRG(gcmrkrg);
				if (result == null) result = caseTriplet(gcmrkrg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GRLINERG: {
				GRLINERG grlinerg = (GRLINERG)theEObject;
				T result = caseGRLINERG(grlinerg);
				if (result == null) result = caseTriplet(grlinerg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.GCRLINERG: {
				GCRLINERG gcrlinerg = (GCRLINERG)theEObject;
				T result = caseGCRLINERG(gcrlinerg);
				if (result == null) result = caseTriplet(gcrlinerg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TONER_SAVER: {
				TonerSaver tonerSaver = (TonerSaver)theEObject;
				T result = caseTonerSaver(tonerSaver);
				if (result == null) result = caseTriplet(tonerSaver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.COLOR_FIDELITY: {
				ColorFidelity colorFidelity = (ColorFidelity)theEObject;
				T result = caseColorFidelity(colorFidelity);
				if (result == null) result = caseTriplet(colorFidelity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FONT_FIDELITY: {
				FontFidelity fontFidelity = (FontFidelity)theEObject;
				T result = caseFontFidelity(fontFidelity);
				if (result == null) result = caseTriplet(fontFidelity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.TEXT_FIDELITY: {
				TextFidelity textFidelity = (TextFidelity)theEObject;
				T result = caseTextFidelity(textFidelity);
				if (result == null) result = caseTriplet(textFidelity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MEDIA_FIDELITY: {
				MediaFidelity mediaFidelity = (MediaFidelity)theEObject;
				T result = caseMediaFidelity(mediaFidelity);
				if (result == null) result = caseTriplet(mediaFidelity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FINISHING_FIDELITY: {
				FinishingFidelity finishingFidelity = (FinishingFidelity)theEObject;
				T result = caseFinishingFidelity(finishingFidelity);
				if (result == null) result = caseTriplet(finishingFidelity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.CMR_FIDELITY: {
				CMRFidelity cmrFidelity = (CMRFidelity)theEObject;
				T result = caseCMRFidelity(cmrFidelity);
				if (result == null) result = caseTriplet(cmrFidelity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_BYTE_EXTENT: {
				ObjectByteExtent objectByteExtent = (ObjectByteExtent)theEObject;
				T result = caseObjectByteExtent(objectByteExtent);
				if (result == null) result = caseTriplet(objectByteExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_BYTE_OFFSET: {
				ObjectByteOffset objectByteOffset = (ObjectByteOffset)theEObject;
				T result = caseObjectByteOffset(objectByteOffset);
				if (result == null) result = caseTriplet(objectByteOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT: {
				ObjectStructuredFieldExtent objectStructuredFieldExtent = (ObjectStructuredFieldExtent)theEObject;
				T result = caseObjectStructuredFieldExtent(objectStructuredFieldExtent);
				if (result == null) result = caseTriplet(objectStructuredFieldExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET: {
				ObjectStructuredFieldOffset objectStructuredFieldOffset = (ObjectStructuredFieldOffset)theEObject;
				T result = caseObjectStructuredFieldOffset(objectStructuredFieldOffset);
				if (result == null) result = caseTriplet(objectStructuredFieldOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_COUNT: {
				ObjectCount objectCount = (ObjectCount)theEObject;
				T result = caseObjectCount(objectCount);
				if (result == null) result = caseTriplet(objectCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER: {
				ObjectOriginIdentifier objectOriginIdentifier = (ObjectOriginIdentifier)theEObject;
				T result = caseObjectOriginIdentifier(objectOriginIdentifier);
				if (result == null) result = caseTriplet(objectOriginIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION: {
				LineDataObjectPositionMigration lineDataObjectPositionMigration = (LineDataObjectPositionMigration)theEObject;
				T result = caseLineDataObjectPositionMigration(lineDataObjectPositionMigration);
				if (result == null) result = caseTriplet(lineDataObjectPositionMigration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR: {
				ColorManagementResourceDescriptor colorManagementResourceDescriptor = (ColorManagementResourceDescriptor)theEObject;
				T result = caseColorManagementResourceDescriptor(colorManagementResourceDescriptor);
				if (result == null) result = caseTriplet(colorManagementResourceDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.MSURG: {
				MSURG msurg = (MSURG)theEObject;
				T result = caseMSURG(msurg);
				if (result == null) result = caseTriplet(msurg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.IMAGE_RESOLUTION: {
				ImageResolution imageResolution = (ImageResolution)theEObject;
				T result = caseImageResolution(imageResolution);
				if (result == null) result = caseTriplet(imageResolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE: {
				ObjectContainerPresentationSpaceSize objectContainerPresentationSpaceSize = (ObjectContainerPresentationSpaceSize)theEObject;
				T result = caseObjectContainerPresentationSpaceSize(objectContainerPresentationSpaceSize);
				if (result == null) result = caseTriplet(objectContainerPresentationSpaceSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER: {
				ExtendedResourceLocalIdentifier extendedResourceLocalIdentifier = (ExtendedResourceLocalIdentifier)theEObject;
				T result = caseExtendedResourceLocalIdentifier(extendedResourceLocalIdentifier);
				if (result == null) result = caseTriplet(extendedResourceLocalIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.METRIC_ADJUSTMENT: {
				MetricAdjustment metricAdjustment = (MetricAdjustment)theEObject;
				T result = caseMetricAdjustment(metricAdjustment);
				if (result == null) result = caseTriplet(metricAdjustment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.EXTENSION_FONT: {
				ExtensionFont extensionFont = (ExtensionFont)theEObject;
				T result = caseExtensionFont(extensionFont);
				if (result == null) result = caseTriplet(extensionFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.RENDERING_INTENT: {
				RenderingIntent renderingIntent = (RenderingIntent)theEObject;
				T result = caseRenderingIntent(renderingIntent);
				if (result == null) result = caseTriplet(renderingIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FONT_CODED_GRAPHIC_CHARACTER_SET_GLOBAL_IDENTIFIER: {
				FontCodedGraphicCharacterSetGlobalIdentifier fontCodedGraphicCharacterSetGlobalIdentifier = (FontCodedGraphicCharacterSetGlobalIdentifier)theEObject;
				T result = caseFontCodedGraphicCharacterSetGlobalIdentifier(fontCodedGraphicCharacterSetGlobalIdentifier);
				if (result == null) result = caseTriplet(fontCodedGraphicCharacterSetGlobalIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.LOCALE_SELECTOR: {
				LocaleSelector localeSelector = (LocaleSelector)theEObject;
				T result = caseLocaleSelector(localeSelector);
				if (result == null) result = caseTriplet(localeSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.FINISHING_OPERATION: {
				FinishingOperation finishingOperation = (FinishingOperation)theEObject;
				T result = caseFinishingOperation(finishingOperation);
				if (result == null) result = caseTriplet(finishingOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.UP_3I_FINISHING_OPERATION: {
				UP3iFinishingOperation up3iFinishingOperation = (UP3iFinishingOperation)theEObject;
				T result = caseUP3iFinishingOperation(up3iFinishingOperation);
				if (result == null) result = caseTriplet(up3iFinishingOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.DEVICE_APPEARANCE: {
				DeviceAppearance deviceAppearance = (DeviceAppearance)theEObject;
				T result = caseDeviceAppearance(deviceAppearance);
				if (result == null) result = caseTriplet(deviceAppearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.RESOURCE_OBJECT_INCLUDE: {
				ResourceObjectInclude resourceObjectInclude = (ResourceObjectInclude)theEObject;
				T result = caseResourceObjectInclude(resourceObjectInclude);
				if (result == null) result = caseTriplet(resourceObjectInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING: {
				PageOverlayConditionalProcessing pageOverlayConditionalProcessing = (PageOverlayConditionalProcessing)theEObject;
				T result = casePageOverlayConditionalProcessing(pageOverlayConditionalProcessing);
				if (result == null) result = caseTriplet(pageOverlayConditionalProcessing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AfplibPackage.RESOURCE_USAGE_ATTRIBUTE: {
				ResourceUsageAttribute resourceUsageAttribute = (ResourceUsageAttribute)theEObject;
				T result = caseResourceUsageAttribute(resourceUsageAttribute);
				if (result == null) result = caseTriplet(resourceUsageAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineData(LineData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAG(BAG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBBC(BBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCA(BCA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCF(BCF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCP(BCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDA(BDA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDD(BDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDG(BDG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDI(BDI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDM(BDM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDT(BDT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDX(BDX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFG(BFG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFM(BFM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFN(BFN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGR(BGR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BII</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BII</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBII(BII object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BIM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BIM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBIM(BIM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BMM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BMM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBMM(BMM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BMO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BMO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBMO(BMO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BNG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BNG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBNG(BNG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOC(BOC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOG(BOG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPF(BPF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPG(BPG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPM(BPM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPS(BPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPT(BPT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBRG(BRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BRS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BRS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBRS(BRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSG(BSG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAT(CAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDD(CDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFC(CFC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFI(CFI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPC(CPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPD(CPD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPI(CPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTC(CTC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DXD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DXD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDXD(DXD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAG(EAG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEBC(EBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECA(ECA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECF(ECF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECP(ECP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDG(EDG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDI(EDI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDM(EDM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDT(EDT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDX(EDX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFG(EFG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFM(EFM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFN(EFN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGR(EGR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EII</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EII</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEII(EII object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EIM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EIM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEIM(EIM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMM(EMM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMO(EMO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENG(ENG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EOC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EOC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEOC(EOC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EOG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EOG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEOG(EOG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPF(EPF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPG(EPG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPM(EPM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPS(EPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPT(EPT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERG(ERG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERS(ERS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESG(ESG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNC(FNC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFND(FND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNG(FNG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNI(FNI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNN(FNN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNM(FNM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNO(FNO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNP(FNP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GAD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GAD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGAD(GAD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GDD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GDD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGDD(GDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICP(ICP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDD(IDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEL(IEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIID(IID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMM(IMM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOB(IOB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOC(IOC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPD(IPD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPG(IPG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPO(IPO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPS(IPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRD(IRD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLLE(LLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LNC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LNC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLNC(LNC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLND(LND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBC(MBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCA(MCA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCC(MCC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCD(MCD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCF(MCF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCF1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCF1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCF1(MCF1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDD(MDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDR(MDR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFC(MFC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MGO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MGO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGO(MGO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIO(MIO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMC(MMC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMD(MMD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMO(MMO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMT(MMT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPG(MPG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPO(MPO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPS(MPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSU(MSU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOP(NOP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OBD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OBD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOBD(OBD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OBP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OBP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOBP(OBP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCD(OCD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PEC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PEC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEC(PEC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PFC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PFC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePFC(PFC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PGD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PGD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePGD(PGD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PGP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PGP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePGP(PGP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PGP1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PGP1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePGP1(PGP1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PMC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PMC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMC(PMC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPO(PPO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTD(PTD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTD1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTD1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTD1(PTD1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTX(PTX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLE(TLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FGD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FGD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFGD(FGD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMB(AMB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMI(AMI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLN(BLN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSU(BSU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBR(DBR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DIR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDIR(DIR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESU(ESU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOPCS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOPCS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOPCS(NOPCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OVS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OVS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOVS(OVS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RMB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RMB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMB(RMB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RMI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RMI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMI(RMI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPS(RPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SBI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SBI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSBI(SBI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SCFL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCFL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCFL(SCFL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEC(SEC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSIA(SIA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSIM(SIM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTC(STC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTO(STO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVI(SVI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBM(TBM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRN(TRN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>USC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>USC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUSC(USC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeQualifier(AttributeQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValue(AttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CGCSGID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CGCSGID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCGCSGID(CGCSGID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRC Resource Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRC Resource Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRCResourceManagement(CRCResourceManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterRotation(CharacterRotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorSpecification(ColorSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object Font Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object Font Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObjectFontDescriptor(DataObjectFontDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptorPosition(DescriptorPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding Scheme ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding Scheme ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncodingSchemeID(EncodingSchemeID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontResolution(FontResolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fully Qualified Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fully Qualified Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullyQualifiedName(FullyQualifiedName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Date And Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Date And Time Stamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalDateAndTimeStamp(LocalDateAndTimeStamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universal Date And Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universal Date And Time Stamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalDateAndTimeStamp(UniversalDateAndTimeStamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingOption(MappingOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Eject Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Eject Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaEjectControl(MediaEjectControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium Map Page Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium Map Page Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediumMapPageNumber(MediumMapPageNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium Orientation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium Orientation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediumOrientation(MediumOrientation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Units</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Units</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementUnits(MeasurementUnits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MODCA Interchange Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MODCA Interchange Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMODCAInterchangeSet(MODCAInterchangeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Area Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Area Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectAreaSize(ObjectAreaSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClassification(ObjectClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Function Set Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Function Set Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectFunctionSetSpecification(ObjectFunctionSetSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOffset(ObjectOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceObjectType(ResourceObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Position Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Position Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagePositionInformation(PagePositionInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationControl(PresentationControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Space Reset Mixing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Space Reset Mixing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationSpaceResetMixing(PresentationSpaceResetMixing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Space Mixing Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Space Mixing Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationSpaceMixingRules(PresentationSpaceMixingRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Local Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Local Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceLocalIdentifier(ResourceLocalIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Section Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Section Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceSectionNumber(ResourceSectionNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Orientation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Orientation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextOrientation(TextOrientation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Horizontal Scale Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Horizontal Scale Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontHorizontalScaleFactor(FontHorizontalScaleFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Descriptor Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Descriptor Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontDescriptorSpecification(FontDescriptorSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeginSegment(BeginSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndSegment(EndSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeginTile(BeginTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndTile(EndTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin Transparency Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin Transparency Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeginTransparencyMask(BeginTransparencyMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Transparency Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Transparency Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndTransparencyMask(EndTransparencyMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeginImage(BeginImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndImage(EndImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageSize(ImageSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Encoding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageEncoding(ImageEncoding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDE Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDE Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDESize(IDESize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image LUTID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image LUTID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageLUTID(ImageLUTID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Band Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Band Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandImage(BandImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDE Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDE Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDEStructure(IDEStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalAlgorithm(ExternalAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTilePosition(TilePosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTileSize(TileSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Set Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Set Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTileSetColor(TileSetColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Bi Level Image Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Bi Level Image Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetBiLevelImageColor(SetBiLevelImageColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOCA Function Set Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOCA Function Set Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOCAFunctionSetIdentification(IOCAFunctionSetIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageData(ImageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Band Image Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Band Image Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandImageData(BandImageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeTile(IncludeTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Subsampling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Subsampling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageSubsampling(ImageSubsampling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Ratios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Ratios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSamplingRatios(SamplingRatios object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile TOC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile TOC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTileTOC(TileTOC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPIRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPIRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPIRG(CPIRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFIRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFIRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFIRG(CFIRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNIRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNIRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNIRG(FNIRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNMRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNMRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNMRG(FNMRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LLERG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LLERG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLLERG(LLERG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPSRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPSRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPSRG(MPSRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCFRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCFRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCFRG(MCFRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBCRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBCRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBCRG(MBCRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCARG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCARG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCARG(MCARG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCDRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCDRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCDRG(MCDRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDRRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDRRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDRRG(MDRRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MGORG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MGORG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGORG(MGORG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIORG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIORG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIORG(MIORG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMDRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMDRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMDRG(MMDRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMTRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMTRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMTRG(MMTRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPGRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPGRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPGRG(MPGRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPORG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPORG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPORG(MPORG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPORG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPORG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPORG(PPORG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PGPRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PGPRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePGPRG(PGPRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCCRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCCRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCCRG(MCCRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMORG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMORG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMORG(MMORG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Band Image RG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Band Image RG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandImageRG(BandImageRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCF1RG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCF1RG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCF1RG(MCF1RG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCRG(MMCRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNORG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNORG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNORG(FNORG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNPRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNPRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNPRG(FNPRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile TOCRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile TOCRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTileTOCRG(TileTOCRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Ratios RG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Ratios RG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSamplingRatiosRG(SamplingRatiosRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Algorithm RG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Algorithm RG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalAlgorithmRG(ExternalAlgorithmRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNNRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNNRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNNRG(FNNRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FNNRG2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FNNRG2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFNNRG2(FNNRG2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin Segment Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin Segment Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeginSegmentCommand(BeginSegmentCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Segment Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Segment Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndSegmentCommand(EndSegmentCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GBAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GBAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGBAR(GBAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GBIMG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GBIMG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGBIMG(GBIMG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCBIMG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCBIMG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCBIMG(GCBIMG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GBOX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GBOX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGBOX(GBOX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCBOX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCBOX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCBOX(GCBOX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCHST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCHST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCHST(GCHST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCCHST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCCHST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCCHST(GCCHST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCOMT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCOMT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCOMT(GCOMT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEAR(GEAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEIMG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEIMG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEIMG(GEIMG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEPROL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEPROL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEPROL(GEPROL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFLT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFLT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFLT(GFLT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCFLT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCFLT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCFLT(GCFLT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFARC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFARC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFARC(GFARC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCFARC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCFARC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCFARC(GCFARC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GIMD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GIMD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGIMD(GIMD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GLINE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GLINE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGLINE(GLINE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCLINE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCLINE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCLINE(GCLINE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GMRK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GMRK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMRK(GMRK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCMRK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCMRK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCMRK(GCMRK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNOP1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNOP1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNOP1(GNOP1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPARC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPARC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPARC(GPARC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCPARC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCPARC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCPARC(GCPARC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRLINE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRLINE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLINE(GRLINE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCRLINE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCRLINE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCRLINE(GCRLINE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSGCH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSGCH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSGCH(GSGCH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSAP(GSAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSBMX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSBMX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSBMX(GSBMX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSCA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSCA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSCA(GSCA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSCC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSCC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSCC(GSCC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSCD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSCD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSCD(GSCD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSCR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSCR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSCR(GSCR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSCS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSCS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSCS(GSCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSCH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSCH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSCH(GSCH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSCOL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSCOL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSCOL(GSCOL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSCP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSCP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSCP(GSCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSECOL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSECOL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSECOL(GSECOL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSFLW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSFLW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSFLW(GSFLW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSLT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSLT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSLT(GSLT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSLW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSLW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSLW(GSLW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSMC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSMC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSMC(GSMC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSMP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSMP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSMP(GSMP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSMS(GSMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSMT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSMT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSMT(GSMT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSMX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSMX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSMX(GSMX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSPS(GSPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSPT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSPT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSPT(GSPT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSPCOL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSPCOL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSPCOL(GSPCOL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSLE(GSLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSLJ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSLJ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSLJ(GSLJ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCBEZ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCBEZ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCBEZ(GCBEZ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCCBEZ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCCBEZ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCCBEZ(GCCBEZ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowSpecification(WindowSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawing Order Subset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawing Order Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawingOrderSubset(DrawingOrderSubset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCBEZRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCBEZRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCBEZRG(GCBEZRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCCBEZRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCCBEZRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCCBEZRG(GCCBEZRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFLTRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFLTRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFLTRG(GFLTRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCFLTRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCFLTRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCFLTRG(GCFLTRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GLINERG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GLINERG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGLINERG(GLINERG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCLINERG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCLINERG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCLINERG(GCLINERG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GMRKRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GMRKRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMRKRG(GMRKRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCMRKRG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCMRKRG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCMRKRG(GCMRKRG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRLINERG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRLINERG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLINERG(GRLINERG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCRLINERG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCRLINERG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCRLINERG(GCRLINERG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toner Saver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toner Saver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTonerSaver(TonerSaver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Fidelity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Fidelity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorFidelity(ColorFidelity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Fidelity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Fidelity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontFidelity(FontFidelity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Fidelity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Fidelity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextFidelity(TextFidelity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Fidelity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Fidelity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaFidelity(MediaFidelity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finishing Fidelity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finishing Fidelity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinishingFidelity(FinishingFidelity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CMR Fidelity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMR Fidelity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMRFidelity(CMRFidelity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Byte Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Byte Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectByteExtent(ObjectByteExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Byte Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Byte Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectByteOffset(ObjectByteOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Structured Field Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Structured Field Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectStructuredFieldExtent(ObjectStructuredFieldExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Structured Field Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Structured Field Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectStructuredFieldOffset(ObjectStructuredFieldOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectCount(ObjectCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Origin Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Origin Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOriginIdentifier(ObjectOriginIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Data Object Position Migration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Data Object Position Migration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineDataObjectPositionMigration(LineDataObjectPositionMigration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Management Resource Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Management Resource Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorManagementResourceDescriptor(ColorManagementResourceDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSURG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSURG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSURG(MSURG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageResolution(ImageResolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Container Presentation Space Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Container Presentation Space Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectContainerPresentationSpaceSize(ObjectContainerPresentationSpaceSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Resource Local Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Resource Local Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedResourceLocalIdentifier(ExtendedResourceLocalIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Adjustment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricAdjustment(MetricAdjustment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionFont(ExtensionFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rendering Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rendering Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenderingIntent(RenderingIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Coded Graphic Character Set Global Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Coded Graphic Character Set Global Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontCodedGraphicCharacterSetGlobalIdentifier(FontCodedGraphicCharacterSetGlobalIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locale Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locale Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocaleSelector(LocaleSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finishing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finishing Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinishingOperation(FinishingOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UP 3i Finishing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UP 3i Finishing Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUP3iFinishingOperation(UP3iFinishingOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Appearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceAppearance(DeviceAppearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Object Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Object Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceObjectInclude(ResourceObjectInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Overlay Conditional Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Overlay Conditional Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageOverlayConditionalProcessing(PageOverlayConditionalProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Usage Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Usage Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceUsageAttribute(ResourceUsageAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSF(SF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triplet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triplet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriplet(Triplet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AfplibSwitch
