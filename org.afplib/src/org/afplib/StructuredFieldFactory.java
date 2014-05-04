package org.afplib;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.afplib.base.BaseFactory;
import org.afplib.base.SF;
import org.afplib.base.Triplet;
import org.afplib.afplib.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

class StructuredFieldFactory {

	Charset charset = CodepageHelper.CHARSET_IBM500;

	SF sf(byte[] buffer, int pos, int stop) {
		int id = Data.toUnsigned(buffer, pos + 3, pos + 5);
		SF sf;
		switch (id) {

			case 13871305 : {
				BAG obj = AfplibFactory.eINSTANCE.createBAG();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setAEGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871339 : {
				BBC obj = AfplibFactory.eINSTANCE.createBBC();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setBCdoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871223 : {
				BCA obj = AfplibFactory.eINSTANCE.createBCA();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setCATName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871242 : {
				BCF obj = AfplibFactory.eINSTANCE.createBCF();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871239 : {
				BCP obj = AfplibFactory.eINSTANCE.createBCP();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13889259 : {
				BDA obj = AfplibFactory.eINSTANCE.createBDA();

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setFlags(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 11;

					if (sstop <= stop)

						obj.setXoffset(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 13;

					if (sstop <= stop)

						obj.setYoffset(Data.toUnsigned(buffer, pos + 12, sstop));

				}

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 14)

						obj.setData(Arrays.copyOfRange(buffer, pos + 14,
								sstop + 1));

				}

				sf = obj;
				break;
			}
			case 13870827 : {
				BDD obj = AfplibFactory.eINSTANCE.createBDD();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 32) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 32, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setUBASE(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setReserved(Data
								.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setXUPUB(Data.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYUPUB(Data.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setXEXTENT(Data.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setYEXTENT(Data.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setReserved2(Data.toUnsigned(buffer, pos + 19,
								sstop));

				}

				{
					int sstop = pos + 21;

					if (sstop <= stop)

						obj.setTYPE(Data.toUnsigned(buffer, pos + 21, sstop));

				}

				{
					int sstop = pos + 22;

					if (sstop <= stop)

						obj.setMOD(Data.toUnsigned(buffer, pos + 22, sstop));

				}

				{
					int sstop = pos + 23;

					if (sstop <= stop)

						obj.setLID(Data.toUnsigned(buffer, pos + 23, sstop));

				}

				{
					int sstop = pos + 25;

					if (sstop <= stop)

						obj.setCOLOR(Data.toUnsigned(buffer, pos + 24, sstop));

				}

				{
					int sstop = pos + 26;

					if (sstop <= stop)

						obj.setMODULEWIDTH(Data.toUnsigned(buffer, pos + 26,
								sstop));

				}

				{
					int sstop = pos + 28;

					if (sstop <= stop)

						obj.setELEMENTHEIGHT(Data.toUnsigned(buffer, pos + 27,
								sstop));

				}

				{
					int sstop = pos + 29;

					if (sstop <= stop)

						obj.setMULT(Data.toUnsigned(buffer, pos + 29, sstop));

				}

				{
					int sstop = pos + 31;

					if (sstop <= stop)

						obj.setWENE(Data.toUnsigned(buffer, pos + 30, sstop));

				}

				sf = obj;
				break;
			}
			case 13871300 : {
				BDG obj = AfplibFactory.eINSTANCE.createBDG();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setDEGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871271 : {
				BDI obj = AfplibFactory.eINSTANCE.createBDI();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setIndxName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871306 : {
				BDM obj = AfplibFactory.eINSTANCE.createBDM();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 18) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 18, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setDMName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 17;

					if (sstop <= stop)

						obj.setDatFmt(Data.toUnsigned(buffer, pos + 17, sstop));

				}

				sf = obj;
				break;
			}
			case 13871272 : {
				BDT obj = AfplibFactory.eINSTANCE.createBDT();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 19) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 19, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setDocName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setReserved(Data
								.toUnsigned(buffer, pos + 17, sstop));

				}

				sf = obj;
				break;
			}
			case 13871331 : {
				BDX obj = AfplibFactory.eINSTANCE.createBDX();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setDMXName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871301 : {
				BFG obj = AfplibFactory.eINSTANCE.createBFG();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setFEGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871309 : {
				BFM obj = AfplibFactory.eINSTANCE.createBFM();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setFMName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871241 : {
				BFN obj = AfplibFactory.eINSTANCE.createBFN();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871291 : {
				BGR obj = AfplibFactory.eINSTANCE.createBGR();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setGdoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871227 : {
				BII obj = AfplibFactory.eINSTANCE.createBII();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setImoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871355 : {
				BIM obj = AfplibFactory.eINSTANCE.createBIM();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setIdoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871308 : {
				BMM obj = AfplibFactory.eINSTANCE.createBMM();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setMMName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871327 : {
				BMO obj = AfplibFactory.eINSTANCE.createBMO();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setOvlyName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871277 : {
				BNG obj = AfplibFactory.eINSTANCE.createBNG();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setPGrpName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871250 : {
				BOC obj = AfplibFactory.eINSTANCE.createBOC();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 17)

					{

						triplet(obj.getTriplets(), buffer, pos + 17, sstop);

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setObjCName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871303 : {
				BOG obj = AfplibFactory.eINSTANCE.createBOG();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setOEGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871269 : {
				BPF obj = AfplibFactory.eINSTANCE.createBPF();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setPFName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871279 : {
				BPG obj = AfplibFactory.eINSTANCE.createBPG();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setPageName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871307 : {
				BPM obj = AfplibFactory.eINSTANCE.createBPM();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setPMName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871199 : {
				BPS obj = AfplibFactory.eINSTANCE.createBPS();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setPsegName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871259 : {
				BPT obj = AfplibFactory.eINSTANCE.createBPT();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setPTdoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871302 : {
				BRG obj = AfplibFactory.eINSTANCE.createBRG();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRGrpName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871310 : {
				BRS obj = AfplibFactory.eINSTANCE.createBRS();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 19)

					{

						triplet(obj.getTriplets(), buffer, pos + 19, sstop);

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setRSName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871321 : {
				BSG obj = AfplibFactory.eINSTANCE.createBSG();
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setREGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13873271 : {
				CAT obj = AfplibFactory.eINSTANCE.createCAT();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 9) {
						sstop = stop;

						obj.setCATData(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

					}

				}

				sf = obj;
				break;
			}
			case 13870738 : {
				CDD obj = AfplibFactory.eINSTANCE.createCDD();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 21) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 21, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setXocBase(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setYocBase(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setXocUnits(Data
								.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYocUnits(Data
								.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 17;

					if (sstop <= stop)

						obj.setXocSize(Data.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setYocSize(Data.toUnsigned(buffer, pos + 18, sstop));

				}

				sf = obj;
				break;
			}
			case 13870986 : {
				CFC obj = AfplibFactory.eINSTANCE.createCFC();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 11) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 11, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setCFIRGLen(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setRetired1(Data
								.toUnsigned(buffer, pos + 10, sstop));

				}

				sf = obj;
				break;
			}
			case 13864074 : {
				CFI obj = AfplibFactory.eINSTANCE.createCFI();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						CFIRG(obj.getFixedLengthRG(), buffer, pos + 9, sstop,
								25);

					}

				}

				sf = obj;
				break;
			}
			case 13870983 : {
				CPC obj = AfplibFactory.eINSTANCE.createCPC();

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setDefCharID(new String(buffer, pos + 9, sstop
								- pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 17;

					if (sstop <= stop)

						obj.setPrtFlags(Data
								.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setCPIRGLen(Data
								.toUnsigned(buffer, pos + 18, sstop));

				}

				{
					int sstop = pos + 19;

					if (sstop <= stop)

						obj.setVSCharSN(Data
								.toUnsigned(buffer, pos + 19, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setVSChar(Data.toUnsigned(buffer, pos + 20, sstop));

				}

				{
					int sstop = pos + 21;

					if (sstop <= stop)

						obj.setVSFlags(Data.toUnsigned(buffer, pos + 21, sstop));

				}

				sf = obj;
				break;
			}
			case 13870727 : {
				CPD obj = AfplibFactory.eINSTANCE.createCPD();

				{
					int sstop = pos + 40;

					if (sstop <= stop)

						obj.setCPDesc(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 42;

					if (sstop <= stop)

						obj.setGCGIDLen(Data
								.toUnsigned(buffer, pos + 41, sstop));

				}

				{
					int sstop = pos + 46;

					if (sstop <= stop)

						obj.setNumCdPts(Data
								.toUnsigned(buffer, pos + 43, sstop));

				}

				{
					int sstop = pos + 48;

					if (sstop <= stop)

						obj.setGCSGID(Data.toUnsigned(buffer, pos + 47, sstop));

				}

				{
					int sstop = pos + 50;

					if (sstop <= stop)

						obj.setCPGID(Data.toUnsigned(buffer, pos + 49, sstop));

				}

				{
					int sstop = pos + 52;

					if (stop >= pos + 52) {

						obj.setEncScheme(Data.toUnsigned(buffer, pos + 51,
								sstop));

					}

				}

				sf = obj;
				break;
			}
			case 13864071 : {
				CPI obj = AfplibFactory.eINSTANCE.createCPI();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						CPIRG(obj.getRg(), buffer, pos + 9, sstop, 10);

					}

				}

				sf = obj;
				break;
			}
			case 13871003 : {
				CTC obj = AfplibFactory.eINSTANCE.createCTC();

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setConData(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

				}

				sf = obj;
				break;
			}
			case 13870819 : {
				DXD obj = AfplibFactory.eINSTANCE.createDXD();

				sf = obj;
				break;
			}
			case 13871561 : {
				EAG obj = AfplibFactory.eINSTANCE.createEAG();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setAEGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871595 : {
				EBC obj = AfplibFactory.eINSTANCE.createEBC();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setBCdoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871479 : {
				ECA obj = AfplibFactory.eINSTANCE.createECA();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setCATName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871498 : {
				ECF obj = AfplibFactory.eINSTANCE.createECF();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871495 : {
				ECP obj = AfplibFactory.eINSTANCE.createECP();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871556 : {
				EDG obj = AfplibFactory.eINSTANCE.createEDG();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setDEGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871527 : {
				EDI obj = AfplibFactory.eINSTANCE.createEDI();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setIndxName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871562 : {
				EDM obj = AfplibFactory.eINSTANCE.createEDM();

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setDMName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871528 : {
				EDT obj = AfplibFactory.eINSTANCE.createEDT();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setDocName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871587 : {
				EDX obj = AfplibFactory.eINSTANCE.createEDX();

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setDMXName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871557 : {
				EFG obj = AfplibFactory.eINSTANCE.createEFG();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setFEGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871565 : {
				EFM obj = AfplibFactory.eINSTANCE.createEFM();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setFMName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871497 : {
				EFN obj = AfplibFactory.eINSTANCE.createEFN();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871547 : {
				EGR obj = AfplibFactory.eINSTANCE.createEGR();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setGdoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871483 : {
				EII obj = AfplibFactory.eINSTANCE.createEII();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setImoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871611 : {
				EIM obj = AfplibFactory.eINSTANCE.createEIM();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setIdoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871564 : {
				EMM obj = AfplibFactory.eINSTANCE.createEMM();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setMMName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871583 : {
				EMO obj = AfplibFactory.eINSTANCE.createEMO();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setOvlyName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871533 : {
				ENG obj = AfplibFactory.eINSTANCE.createENG();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setPGrpName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871506 : {
				EOC obj = AfplibFactory.eINSTANCE.createEOC();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setObjCName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871559 : {
				EOG obj = AfplibFactory.eINSTANCE.createEOG();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setOEGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871525 : {
				EPF obj = AfplibFactory.eINSTANCE.createEPF();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setPFName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871535 : {
				EPG obj = AfplibFactory.eINSTANCE.createEPG();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setPageName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871563 : {
				EPM obj = AfplibFactory.eINSTANCE.createEPM();

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setPMName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871455 : {
				EPS obj = AfplibFactory.eINSTANCE.createEPS();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setPsegName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871515 : {
				EPT obj = AfplibFactory.eINSTANCE.createEPT();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setPTdoName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871558 : {
				ERG obj = AfplibFactory.eINSTANCE.createERG();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRGrpName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871566 : {
				ERS obj = AfplibFactory.eINSTANCE.createERS();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871577 : {
				ESG obj = AfplibFactory.eINSTANCE.createESG();

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setREGName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13870985 : {
				FNC obj = AfplibFactory.eINSTANCE.createFNC();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 51) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 51, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setRetired(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setPatTech(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 11;

					if (sstop <= stop)

						obj.setReserved1(Arrays.copyOfRange(buffer, pos + 11,
								sstop + 1));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setFntFlags(Data
								.toUnsigned(buffer, pos + 12, sstop));

				}

				{
					int sstop = pos + 13;

					if (sstop <= stop)

						obj.setXUnitBase(Data.toUnsigned(buffer, pos + 13,
								sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYUnitBase(Data.toUnsigned(buffer, pos + 14,
								sstop));

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setXftUnits(Data
								.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setYftUnits(Data
								.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setMaxBoxWd(Data
								.toUnsigned(buffer, pos + 19, sstop));

				}

				{
					int sstop = pos + 22;

					if (sstop <= stop)

						obj.setMaxBoxHt(Data
								.toUnsigned(buffer, pos + 21, sstop));

				}

				{
					int sstop = pos + 23;

					if (sstop <= stop)

						obj.setFNORGLen(Data
								.toUnsigned(buffer, pos + 23, sstop));

				}

				{
					int sstop = pos + 24;

					if (sstop <= stop)

						obj.setFNIRGLen(Data
								.toUnsigned(buffer, pos + 24, sstop));

				}

				{
					int sstop = pos + 25;

					if (sstop <= stop)

						obj.setPatAlign(Data
								.toUnsigned(buffer, pos + 25, sstop));

				}

				{
					int sstop = pos + 28;

					if (sstop <= stop)

						obj.setRPatDCnt(Data
								.toUnsigned(buffer, pos + 26, sstop));

				}

				{
					int sstop = pos + 29;

					if (sstop <= stop)

						obj.setFNPRGLen(Data
								.toUnsigned(buffer, pos + 29, sstop));

				}

				{
					int sstop = pos + 30;

					if (sstop <= stop)

						obj.setFNMRGLen(Data
								.toUnsigned(buffer, pos + 30, sstop));

				}

				{
					int sstop = pos + 31;

					if (stop >= pos + 31) {

						obj.setResXUBase(Data.toUnsigned(buffer, pos + 31,
								sstop));

					}

				}

				{
					int sstop = pos + 32;

					if (stop >= pos + 32) {

						obj.setResYUBase(Data.toUnsigned(buffer, pos + 32,
								sstop));

					}

				}

				{
					int sstop = pos + 34;

					if (stop >= pos + 34) {

						obj.setXfrUnits(Data
								.toUnsigned(buffer, pos + 33, sstop));

					}

				}

				{
					int sstop = pos + 36;

					if (stop >= pos + 36) {

						obj.setYfrUnits(Data
								.toUnsigned(buffer, pos + 35, sstop));

					}

				}

				{
					int sstop = pos + 40;

					if (stop >= pos + 40) {

						obj.setOPatDCnt(Data
								.toUnsigned(buffer, pos + 37, sstop));

					}

				}

				{
					int sstop = pos + 43;

					if (stop >= pos + 41) {
						sstop = stop;

						obj.setReserved2(Arrays.copyOfRange(buffer, pos + 41,
								sstop + 1));

					}

				}

				{
					int sstop = pos + 44;

					if (stop >= pos + 44) {

						obj.setFNNRGLen(Data
								.toUnsigned(buffer, pos + 44, sstop));

					}

				}

				{
					int sstop = pos + 48;

					if (stop >= pos + 48) {

						obj.setFNNDCnt(Data.toUnsigned(buffer, pos + 45, sstop));

					}

				}

				{
					int sstop = pos + 50;

					if (stop >= pos + 50) {

						obj.setFNNMapCnt(Data.toUnsigned(buffer, pos + 49,
								sstop));

					}

				}

				sf = obj;
				break;
			}
			case 13870729 : {
				FND obj = AfplibFactory.eINSTANCE.createFND();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 89) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 89, sstop);

						}

					}

				}

				{
					int sstop = pos + 40;

					if (sstop <= stop)

						obj.setTypeFcDesc(new String(buffer, pos + 9, sstop
								- pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 41;

					if (sstop <= stop)

						obj.setFtWtClass(Data.toUnsigned(buffer, pos + 41,
								sstop));

				}

				{
					int sstop = pos + 42;

					if (sstop <= stop)

						obj.setFtWdClass(Data.toUnsigned(buffer, pos + 42,
								sstop));

				}

				{
					int sstop = pos + 44;

					if (sstop <= stop)

						obj.setMaxPtSize(Data.toUnsigned(buffer, pos + 43,
								sstop));

				}

				{
					int sstop = pos + 46;

					if (sstop <= stop)

						obj.setNomPtSize(Data.toUnsigned(buffer, pos + 45,
								sstop));

				}

				{
					int sstop = pos + 48;

					if (sstop <= stop)

						obj.setMinPtSize(Data.toUnsigned(buffer, pos + 47,
								sstop));

				}

				{
					int sstop = pos + 50;

					if (sstop <= stop)

						obj.setMaxHSize(Data
								.toUnsigned(buffer, pos + 49, sstop));

				}

				{
					int sstop = pos + 52;

					if (sstop <= stop)

						obj.setNomHSize(Data
								.toUnsigned(buffer, pos + 51, sstop));

				}

				{
					int sstop = pos + 54;

					if (sstop <= stop)

						obj.setMinHSize(Data
								.toUnsigned(buffer, pos + 53, sstop));

				}

				{
					int sstop = pos + 55;

					if (sstop <= stop)

						obj.setDsnGenCls(Data.toUnsigned(buffer, pos + 55,
								sstop));

				}

				{
					int sstop = pos + 56;

					if (sstop <= stop)

						obj.setDsnSubCls(Data.toUnsigned(buffer, pos + 56,
								sstop));

				}

				{
					int sstop = pos + 57;

					if (sstop <= stop)

						obj.setDsnSpcGrp(Data.toUnsigned(buffer, pos + 57,
								sstop));

				}

				{
					int sstop = pos + 72;

					if (sstop <= stop)

						obj.setReserved1(Arrays.copyOfRange(buffer, pos + 58,
								sstop + 1));

				}

				{
					int sstop = pos + 74;

					if (sstop <= stop)

						obj.setFtDsFlags(Data.toUnsigned(buffer, pos + 73,
								sstop));

				}

				{
					int sstop = pos + 84;

					if (sstop <= stop)

						obj.setReserved2(Arrays.copyOfRange(buffer, pos + 75,
								sstop + 1));

				}

				{
					int sstop = pos + 86;

					if (sstop <= stop)

						obj.setGCSID(Data.toUnsigned(buffer, pos + 85, sstop));

				}

				{
					int sstop = pos + 88;

					if (sstop <= stop)

						obj.setFGID(Data.toUnsigned(buffer, pos + 87, sstop));

				}

				sf = obj;
				break;
			}
			case 13889161 : {
				FNG obj = AfplibFactory.eINSTANCE.createFNG();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 9) {
						sstop = stop;

						obj.setPatData(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

					}

				}

				sf = obj;
				break;
			}
			case 13864073 : {
				FNI obj = AfplibFactory.eINSTANCE.createFNI();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						FNIRG(obj.getRg(), buffer, pos + 9, sstop, 28);

					}

				}

				sf = obj;
				break;
			}
			case 13872009 : {
				FNN obj = AfplibFactory.eINSTANCE.createFNN();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 11) {
						sstop = stop;

						{

							FNNRG(obj.getRg(), buffer, pos + 11, sstop, 12);

						}

					}

				}

				{
					int sstop = pos + 65537;

					if (stop >= pos + 65537) {
						sstop = stop;

						{

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setIBMFormat(Data
								.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setTechnologyFormat(Data.toUnsigned(buffer,
								pos + 10, sstop));

				}

				sf = obj;
				break;
			}
			case 13869705 : {
				FNM obj = AfplibFactory.eINSTANCE.createFNM();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						FNMRG(obj.getRg(), buffer, pos + 9, sstop, 8);

					}

				}

				sf = obj;
				break;
			}
			case 13872777 : {
				FNO obj = AfplibFactory.eINSTANCE.createFNO();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						FNORG(obj.getRg(), buffer, pos + 9, sstop, 26);

					}

				}

				sf = obj;
				break;
			}
			case 13872265 : {
				FNP obj = AfplibFactory.eINSTANCE.createFNP();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						FNPRG(obj.getRg(), buffer, pos + 9, sstop, 22);

					}

				}

				sf = obj;
				break;
			}
			case 13889211 : {
				GAD obj = AfplibFactory.eINSTANCE.createGAD();

				{
					int sstop = pos + 16;

					if (stop >= pos + 9) {
						sstop = stop;

						obj.setGOCAdat(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

					}

				}

				sf = obj;
				break;
			}
			case 13870779 : {
				GDD obj = AfplibFactory.eINSTANCE.createGDD();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 9) {
						sstop = stop;

						{

						}

					}

				}

				{
					int sstop = pos + 32768;

					if (stop >= pos + 9) {
						sstop = stop;

						obj.setGOCAdes(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

					}

				}

				sf = obj;
				break;
			}
			case 13872251 : {
				ICP obj = AfplibFactory.eINSTANCE.createICP();

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setXCOset(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setYCOset(Data.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setXCSize(Data.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setYCSize(Data.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setXFilSize(Data
								.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setYFilSize(Data
								.toUnsigned(buffer, pos + 19, sstop));

				}

				sf = obj;
				break;
			}
			case 13870843 : {
				IDD obj = AfplibFactory.eINSTANCE.createIDD();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 18) {
						sstop = stop;

						{

							sdf(obj.getSDFS(), buffer, pos + 18, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setUNITBASE(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 11;

					if (sstop <= stop)

						obj.setXRESOL(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 13;

					if (sstop <= stop)

						obj.setYRESOL(Data.toUnsigned(buffer, pos + 12, sstop));

				}

				{
					int sstop = pos + 15;

					if (sstop <= stop)

						obj.setXSIZE(Data.toUnsigned(buffer, pos + 14, sstop));

				}

				{
					int sstop = pos + 17;

					if (sstop <= stop)

						obj.setYSIZE(Data.toUnsigned(buffer, pos + 16, sstop));

				}

				sf = obj;
				break;
			}
			case 13873831 : {
				IEL obj = AfplibFactory.eINSTANCE.createIEL();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						triplet(obj.getTriplets(), buffer, pos + 9, sstop);

					}

				}

				sf = obj;
				break;
			}
			case 13870715 : {
				IID obj = AfplibFactory.eINSTANCE.createIID();

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setConData1(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

				}

				{
					int sstop = pos + 21;

					if (sstop <= stop)

						obj.setXBase(Data.toUnsigned(buffer, pos + 21, sstop));

				}

				{
					int sstop = pos + 22;

					if (sstop <= stop)

						obj.setYBase(Data.toUnsigned(buffer, pos + 22, sstop));

				}

				{
					int sstop = pos + 24;

					if (sstop <= stop)

						obj.setXUnits(Data.toUnsigned(buffer, pos + 23, sstop));

				}

				{
					int sstop = pos + 26;

					if (sstop <= stop)

						obj.setYUnits(Data.toUnsigned(buffer, pos + 25, sstop));

				}

				{
					int sstop = pos + 28;

					if (sstop <= stop)

						obj.setXSize(Data.toUnsigned(buffer, pos + 27, sstop));

				}

				{
					int sstop = pos + 30;

					if (sstop <= stop)

						obj.setYSize(Data.toUnsigned(buffer, pos + 29, sstop));

				}

				{
					int sstop = pos + 36;

					if (sstop <= stop)

						obj.setConData2(Arrays.copyOfRange(buffer, pos + 31,
								sstop + 1));

				}

				{
					int sstop = pos + 38;

					if (sstop <= stop)

						obj.setXCSizeD(Data.toUnsigned(buffer, pos + 37, sstop));

				}

				{
					int sstop = pos + 40;

					if (sstop <= stop)

						obj.setYCSizeD(Data.toUnsigned(buffer, pos + 39, sstop));

				}

				{
					int sstop = pos + 42;

					if (sstop <= stop)

						obj.setConData3(Arrays.copyOfRange(buffer, pos + 41,
								sstop + 1));

				}

				{
					int sstop = pos + 44;

					if (sstop <= stop)

						obj.setColor(Data.toUnsigned(buffer, pos + 43, sstop));

				}

				sf = obj;
				break;
			}
			case 13872076 : {
				IMM obj = AfplibFactory.eINSTANCE.createIMM();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 17) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 17, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setMMPName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13873091 : {
				IOB obj = AfplibFactory.eINSTANCE.createIOB();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 36)

					{

						triplet(obj.getTriplets(), buffer, pos + 36, sstop);

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setObjName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setObjType(Data.toUnsigned(buffer, pos + 18, sstop));

				}

				{
					int sstop = pos + 21;

					if (sstop <= stop)

						obj.setXoaOset(Data.toSigned(buffer, pos + 19, sstop));

				}

				{
					int sstop = pos + 24;

					if (sstop <= stop)

						obj.setYoaOset(Data.toSigned(buffer, pos + 22, sstop));

				}

				{
					int sstop = pos + 26;

					if (sstop <= stop)

						obj.setXoaOrent(Data
								.toUnsigned(buffer, pos + 25, sstop));

				}

				{
					int sstop = pos + 28;

					if (sstop <= stop)

						obj.setYoaOrent(Data
								.toUnsigned(buffer, pos + 27, sstop));

				}

				{
					int sstop = pos + 31;

					if (sstop <= stop)

						obj.setXocaOset(Data.toSigned(buffer, pos + 29, sstop));

				}

				{
					int sstop = pos + 34;

					if (sstop <= stop)

						obj.setYocaOset(Data.toSigned(buffer, pos + 32, sstop));

				}

				{
					int sstop = pos + 35;

					if (sstop <= stop)

						obj.setRefCSys(Data.toUnsigned(buffer, pos + 35, sstop));

				}

				sf = obj;
				break;
			}
			case 13870971 : {
				IOC obj = AfplibFactory.eINSTANCE.createIOC();

				{
					int sstop = pos + 11;

					if (sstop <= stop)

						obj.setXoaOset(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYoaOset(Data.toUnsigned(buffer, pos + 12, sstop));

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setXoaOrent(Data
								.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setYoaOrent(Data
								.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 26;

					if (sstop <= stop)

						obj.setConData1(Arrays.copyOfRange(buffer, pos + 19,
								sstop + 1));

				}

				{
					int sstop = pos + 28;

					if (sstop <= stop)

						obj.setXMap(Data.toUnsigned(buffer, pos + 27, sstop));

				}

				{
					int sstop = pos + 30;

					if (sstop <= stop)

						obj.setYMap(Data.toUnsigned(buffer, pos + 29, sstop));

				}

				{
					int sstop = pos + 32;

					if (sstop <= stop)

						obj.setConData2(Arrays.copyOfRange(buffer, pos + 31,
								sstop + 1));

				}

				sf = obj;
				break;
			}
			case 13889275 : {
				IPD obj = AfplibFactory.eINSTANCE.createIPD();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 9) {
						sstop = stop;

						{

							sdf(obj.getSdfs(), buffer, pos + 9, sstop);

						}

					}

				}

				sf = obj;
				break;
			}
			case 13873071 : {
				IPG obj = AfplibFactory.eINSTANCE.createIPG();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 26)

					{

						triplet(obj.getTriplets(), buffer, pos + 26, sstop);

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setPgName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 25;

					if (sstop <= stop)

						obj.setIPgFlgs(Data.toUnsigned(buffer, pos + 25, sstop));

				}

				sf = obj;
				break;
			}
			case 13873112 : {
				IPO obj = AfplibFactory.eINSTANCE.createIPO();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 25) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 25, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setOvlyName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 19;

					if (sstop <= stop)

						obj.setXolOset(Data.toSigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 22;

					if (sstop <= stop)

						obj.setYolOset(Data.toSigned(buffer, pos + 20, sstop));

				}

				{
					int sstop = pos + 24;

					if (stop >= pos + 24) {

						obj.setOvlyOrent(Data.toUnsigned(buffer, pos + 23,
								sstop));

					}

				}

				sf = obj;
				break;
			}
			case 13872991 : {
				IPS obj = AfplibFactory.eINSTANCE.createIPS();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 23) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 23, sstop);

						}

					}

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setPsegName(new String(buffer, pos + 9, sstop - pos
								- 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 19;

					if (sstop <= stop)

						obj.setXpsOset(Data.toSigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 22;

					if (sstop <= stop)

						obj.setYpsOset(Data.toSigned(buffer, pos + 20, sstop));

				}

				sf = obj;
				break;
			}
			case 13889147 : {
				IRD obj = AfplibFactory.eINSTANCE.createIRD();

				{
					int sstop = pos + 32759;

					sstop = stop;
					if (sstop >= pos + 9)

						obj.setIMdata(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

				}

				sf = obj;
				break;
			}
			case 13874320 : {
				LLE obj = AfplibFactory.eINSTANCE.createLLE();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 11)

					{

						LLERG(obj.getRG(), buffer, pos + 11, sstop, 0, 2);

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setLnkType(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				sf = obj;
				break;
			}
			case 13871847 : {
				LNC obj = AfplibFactory.eINSTANCE.createLNC();

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setNumDSC(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				sf = obj;
				break;
			}
			case 13870823 : {
				LND obj = AfplibFactory.eINSTANCE.createLND();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 49) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 49, sstop);

						}

					}

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setLNDFlgs(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setIPos(Data.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setBPos(Data.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setTxtOrent(Data
								.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 19;

					if (sstop <= stop)

						obj.setFntLID(Data.toUnsigned(buffer, pos + 19, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setChnlCde(Data.toUnsigned(buffer, pos + 20, sstop));

				}

				{
					int sstop = pos + 22;

					if (sstop <= stop)

						obj.setNLNDskp(Data.toUnsigned(buffer, pos + 21, sstop));

				}

				{
					int sstop = pos + 24;

					if (sstop <= stop)

						obj.setNLNDsp(Data.toUnsigned(buffer, pos + 23, sstop));

				}

				{
					int sstop = pos + 26;

					if (sstop <= stop)

						obj.setNLNDreu(Data.toUnsigned(buffer, pos + 25, sstop));

				}

				{
					int sstop = pos + 34;

					if (sstop <= stop)

						obj.setSupName(new String(buffer, pos + 27, sstop - pos
								- 27 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 35;

					if (sstop <= stop)

						obj.setSOLid(Data.toUnsigned(buffer, pos + 35, sstop));

				}

				{
					int sstop = pos + 39;

					if (sstop <= stop)

						obj.setDataStrt(Data
								.toUnsigned(buffer, pos + 36, sstop));

				}

				{
					int sstop = pos + 41;

					if (sstop <= stop)

						obj.setDataLgth(Data
								.toUnsigned(buffer, pos + 40, sstop));

				}

				{
					int sstop = pos + 43;

					if (sstop <= stop)

						obj.setTxtColor(Data
								.toUnsigned(buffer, pos + 42, sstop));

				}

				{
					int sstop = pos + 45;

					if (sstop <= stop)

						obj.setNLNDccp(Data.toUnsigned(buffer, pos + 44, sstop));

				}

				{
					int sstop = pos + 46;

					if (sstop <= stop)

						obj.setSubpgID(Data.toUnsigned(buffer, pos + 46, sstop));

				}

				{
					int sstop = pos + 48;

					if (sstop <= stop)

						obj.setCCPID(Data.toUnsigned(buffer, pos + 47, sstop));

				}

				sf = obj;
				break;
			}
			case 13872107 : {
				MBC obj = AfplibFactory.eINSTANCE.createMBC();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MBCRG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13871991 : {
				MCA obj = AfplibFactory.eINSTANCE.createMCA();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MCARG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13869704 : {
				MCC obj = AfplibFactory.eINSTANCE.createMCC();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MCCRG(obj.getRg(), buffer, pos + 9, sstop, 6);

					}

				}

				sf = obj;
				break;
			}
			case 13872018 : {
				MCD obj = AfplibFactory.eINSTANCE.createMCD();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MCDRG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13872010 : {
				MCF obj = AfplibFactory.eINSTANCE.createMCF();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MCFRG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13873546 : {
				MCF1 obj = AfplibFactory.eINSTANCE.createMCF1();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 13)

					{

						int length = Data.toUnsigned(buffer, pos + 13 + -4, pos
								+ 13 + -4 - 1 + 1);
						MCF1RG(obj.getRG(), buffer, pos + 13, sstop, length);

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setRGLength(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				sf = obj;
				break;
			}
			case 13870728 : {
				MDD obj = AfplibFactory.eINSTANCE.createMDD();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 22) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 22, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setXmBase(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setYmBase(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setXmUnits(Data.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYmUnits(Data.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 17;

					if (sstop <= stop)

						obj.setXmSize(Data.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setYmSize(Data.toUnsigned(buffer, pos + 18, sstop));

				}

				{
					int sstop = pos + 21;

					if (sstop <= stop)

						obj.setMDDFlgs(Data.toUnsigned(buffer, pos + 21, sstop));

				}

				sf = obj;
				break;
			}
			case 13872067 : {
				MDR obj = AfplibFactory.eINSTANCE.createMDR();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MDRRG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13869192 : {
				MFC obj = AfplibFactory.eINSTANCE.createMFC();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 13) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 13, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setMFCFlgs(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 11;

					if (sstop <= stop)

						obj.setMedColl(Data.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setMFCScpe(Data.toUnsigned(buffer, pos + 12, sstop));

				}

				sf = obj;
				break;
			}
			case 13872059 : {
				MGO obj = AfplibFactory.eINSTANCE.createMGO();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MGORG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13872123 : {
				MIO obj = AfplibFactory.eINSTANCE.createMIO();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MIORG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13870984 : {
				MMC obj = AfplibFactory.eINSTANCE.createMMC();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 11) {
						sstop = stop;

						{

							MMCRG(obj.getRg(), buffer, pos + 11, sstop, 2);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setMMCid(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setPARAMETER1(Data.toUnsigned(buffer, pos + 10,
								sstop));

				}

				sf = obj;
				break;
			}
			case 13872077 : {
				MMD obj = AfplibFactory.eINSTANCE.createMMD();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MMDRG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13873631 : {
				MMO obj = AfplibFactory.eINSTANCE.createMMO();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 13)

					{

						MMORG(obj.getRg(), buffer, pos + 13, sstop, 12);

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setRGLength(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				sf = obj;
				break;
			}
			case 13872008 : {
				MMT obj = AfplibFactory.eINSTANCE.createMMT();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MMTRG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13872047 : {
				MPG obj = AfplibFactory.eINSTANCE.createMPG();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MPGRG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13872088 : {
				MPO obj = AfplibFactory.eINSTANCE.createMPO();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MPORG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13873503 : {
				MPS obj = AfplibFactory.eINSTANCE.createMPS();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 13)

					{

						MPSRG(obj.getFixedLengthRG(), buffer, pos + 13, sstop,
								-4, 1);

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setRGLength(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setReserved(Arrays.copyOfRange(buffer, pos + 10,
								sstop + 1));

				}

				sf = obj;
				break;
			}
			case 13872106 : {
				MSU obj = AfplibFactory.eINSTANCE.createMSU();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						MSURG(obj.getRg(), buffer, pos + 9, sstop, 10);

					}

				}

				sf = obj;
				break;
			}
			case 13889262 : {
				NOP obj = AfplibFactory.eINSTANCE.createNOP();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 9) {
						sstop = stop;

						obj.setUndfData(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

					}

				}

				sf = obj;
				break;
			}
			case 13870699 : {
				OBD obj = AfplibFactory.eINSTANCE.createOBD();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						triplet(obj.getTriplets(), buffer, pos + 9, sstop);

					}

				}

				sf = obj;
				break;
			}
			case 13872235 : {
				OBP obj = AfplibFactory.eINSTANCE.createOBP();

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setOAPosID(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setRGLength(Data
								.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 13;

					if (sstop <= stop)

						obj.setXoaOset(Data.toSigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setYoaOset(Data.toSigned(buffer, pos + 14, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setXoaOrent(Data
								.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setYoaOrent(Data
								.toUnsigned(buffer, pos + 19, sstop));

				}

				{
					int sstop = pos + 24;

					if (sstop <= stop)

						obj.setXocaOset(Data.toSigned(buffer, pos + 22, sstop));

				}

				{
					int sstop = pos + 27;

					if (sstop <= stop)

						obj.setYocaOset(Data.toSigned(buffer, pos + 25, sstop));

				}

				{
					int sstop = pos + 29;

					if (sstop <= stop)

						obj.setXocaOrent(Data.toUnsigned(buffer, pos + 28,
								sstop));

				}

				{
					int sstop = pos + 31;

					if (sstop <= stop)

						obj.setYocaOrent(Data.toUnsigned(buffer, pos + 30,
								sstop));

				}

				{
					int sstop = pos + 32;

					if (sstop <= stop)

						obj.setRefCSys(Data.toUnsigned(buffer, pos + 32, sstop));

				}

				sf = obj;
				break;
			}
			case 13889170 : {
				OCD obj = AfplibFactory.eINSTANCE.createOCD();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 9) {
						sstop = stop;

						obj.setObjCdat(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

					}

				}

				sf = obj;
				break;
			}
			case 13871016 : {
				PEC obj = AfplibFactory.eINSTANCE.createPEC();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 11) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 11, sstop);

						}

					}

				}

				sf = obj;
				break;
			}
			case 13873800 : {
				PFC obj = AfplibFactory.eINSTANCE.createPFC();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 13) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 13, sstop);

						}

					}

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setPFCFlgs(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				sf = obj;
				break;
			}
			case 13870767 : {
				PGD obj = AfplibFactory.eINSTANCE.createPGD();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 24) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 24, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setXpgBase(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setYpgBase(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setXpgUnits(Data
								.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYpgUnits(Data
								.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 17;

					if (sstop <= stop)

						obj.setXpgSize(Data.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setYpgSize(Data.toUnsigned(buffer, pos + 18, sstop));

				}

				{
					int sstop = pos + 23;

					if (sstop <= stop)

						obj.setReserved(Data
								.toUnsigned(buffer, pos + 21, sstop));

				}

				sf = obj;
				break;
			}
			case 13873583 : {
				PGP obj = AfplibFactory.eINSTANCE.createPGP();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 10)

					{

						PGPRG(obj.getRG(), buffer, pos + 10, sstop, 0, 1);

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setConstant(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				sf = obj;
				break;
			}
			case 13872303 : {
				PGP1 obj = AfplibFactory.eINSTANCE.createPGP1();

				{
					int sstop = pos + 11;

					if (sstop <= stop)

						obj.setXOset(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYOset(Data.toUnsigned(buffer, pos + 12, sstop));

				}

				sf = obj;
				break;
			}
			case 13871023 : {
				PMC obj = AfplibFactory.eINSTANCE.createPMC();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 11) {
						sstop = stop;

						{

							triplet(obj.getTriplets(), buffer, pos + 11, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setPMCid(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				sf = obj;
				break;
			}
			case 13872579 : {
				PPO obj = AfplibFactory.eINSTANCE.createPPO();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						PPORG(obj.getRG(), buffer, pos + 9, sstop, 0, 2);

					}

				}

				sf = obj;
				break;
			}
			case 13873563 : {
				PTD obj = AfplibFactory.eINSTANCE.createPTD();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 23) {
						sstop = stop;

						{

							cs(obj.getCS(), buffer, pos + 23, sstop);

						}

					}

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setXPBASE(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setYPBASE(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setXPUNITVL(Data
								.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYPUNITVL(Data
								.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 17;

					if (sstop <= stop)

						obj.setXPEXTENT(Data
								.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setYPEXTENT(Data
								.toUnsigned(buffer, pos + 18, sstop));

				}

				{
					int sstop = pos + 22;

					if (stop >= pos + 22) {

						obj.setRESERVED(Data
								.toUnsigned(buffer, pos + 21, sstop));

					}

				}

				sf = obj;
				break;
			}
			case 13870747 : {
				PTD1 obj = AfplibFactory.eINSTANCE.createPTD1();

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setXPBASE(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setYPBASE(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setXPUNITVL(Data
								.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYPUNITVL(Data
								.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setXPEXTENT(Data
								.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setYPEXTENT(Data
								.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 20;

					if (stop >= pos + 20) {

						obj.setRESERVED(Data
								.toUnsigned(buffer, pos + 19, sstop));

					}

				}

				sf = obj;
				break;
			}
			case 13889179 : {
				PTX obj = AfplibFactory.eINSTANCE.createPTX();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						cs(obj.getCS(), buffer, pos + 9, sstop);

					}

				}

				sf = obj;
				break;
			}
			case 13869200 : {
				TLE obj = AfplibFactory.eINSTANCE.createTLE();

				{
					int sstop = pos + 32768;

					sstop = stop;
					if (sstop >= pos + 9)

					{

						triplet(obj.getTriplets(), buffer, pos + 9, sstop);

					}

				}

				sf = obj;
				break;
			}
			case 13870789 : {
				FGD obj = AfplibFactory.eINSTANCE.createFGD();

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setConData(Arrays.copyOfRange(buffer, pos + 9,
								sstop + 1));

				}

				sf = obj;
				break;
			}
			default :
				sf = BaseFactory.eINSTANCE.createUNKNSF();
		}
		sf.setId(id);
		return sf;
	}

	void triplet(List<Triplet> triplets, byte[] buffer, int start, int bufstop) {
		int pos = start;
		while (pos + 1 <= bufstop) {
			int length = buffer[pos] & 0xff;
			int id = buffer[pos + 1] & 0xff;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;

			switch (id) {

				case 128 : {
					AttributeQualifier obj = AfplibFactory.eINSTANCE
							.createAttributeQualifier();

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setSeqNum(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setLevNum(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 54 : {
					AttributeValue obj = AfplibFactory.eINSTANCE
							.createAttributeValue();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setReserved0(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 4)

							obj.setAttVal(new String(buffer, pos + 4, sstop
									- pos - 4 + 1, charset));

					}

					triplets.add(obj);

					break;
				}

				case 1 : {
					CGCSGID obj = AfplibFactory.eINSTANCE.createCGCSGID();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setGCSGID(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setCPGID(Data
									.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					charset = CodepageHelper.getCharset(obj.getCPGID(),
							obj.getGCSGID());

					break;
				}

				case 99 : {
					CRCResourceManagement obj = AfplibFactory.eINSTANCE
							.createCRCResourceManagement();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFmtQual(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setRMValue(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setResClassFlg(Data.toUnsigned(buffer, pos + 5,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 38 : {
					CharacterRotation obj = AfplibFactory.eINSTANCE
							.createCharacterRotation();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setCharRot(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 78 : {
					ColorSpecification obj = AfplibFactory.eINSTANCE
							.createColorSpecification();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setColSpce(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setColSize1(Data.toUnsigned(buffer, pos + 8,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setColSize2(Data.toUnsigned(buffer, pos + 9,
									sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setColSize3(Data.toUnsigned(buffer, pos + 10,
									sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setColSize4(Data.toUnsigned(buffer, pos + 11,
									sstop));

					}

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 12)

							obj.setColor(Arrays.copyOfRange(buffer, pos + 12,
									sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 101 : {
					Comment obj = AfplibFactory.eINSTANCE.createComment();

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

							obj.setComment(new String(buffer, pos + 2, sstop
									- pos - 2 + 1, charset));

					}

					triplets.add(obj);

					break;
				}

				case 139 : {
					DataObjectFontDescriptor obj = AfplibFactory.eINSTANCE
							.createDataObjectFontDescriptor();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setDOFtFlgs(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFontTech(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setVFS(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setHFS(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setCharRot(Data.toUnsigned(buffer, pos + 8,
									sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setEncEnv(Data.toUnsigned(buffer, pos + 10,
									sstop));

					}

					{
						int sstop = pos + 13;

						if (sstop <= stop)

							obj.setEncID(Data.toUnsigned(buffer, pos + 12,
									sstop));

					}

					{
						int sstop = pos + 15;

						if (sstop <= stop)

							obj.setReserved(Arrays.copyOfRange(buffer,
									pos + 14, sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 67 : {
					DescriptorPosition obj = AfplibFactory.eINSTANCE
							.createDescriptorPosition();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setDesPosID(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 80 : {
					EncodingSchemeID obj = AfplibFactory.eINSTANCE
							.createEncodingSchemeID();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setESidCP(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (stop >= pos + 5) {

							obj.setESidUD(Data.toUnsigned(buffer, pos + 4,
									sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 132 : {
					FontResolution obj = AfplibFactory.eINSTANCE
							.createFontResolution();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setMetTech(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setRPuBase(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setRPUnits(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 2 : {
					FullyQualifiedName obj = AfplibFactory.eINSTANCE
							.createFullyQualifiedName();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFQNType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFQNFormat(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 4)

							obj.setFQName(new String(buffer, pos + 4, sstop
									- pos - 4 + 1, charset));

					}

					triplets.add(obj);

					break;
				}

				case 98 : {
					LocalDateAndTimeStamp obj = AfplibFactory.eINSTANCE
							.createLocalDateAndTimeStamp();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStampType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setTHunYear(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setTenYear(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setDay(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setHour(Data.toUnsigned(buffer, pos + 9, sstop));

					}

					{
						int sstop = pos + 12;

						if (sstop <= stop)

							obj.setMinute(Data.toUnsigned(buffer, pos + 11,
									sstop));

					}

					{
						int sstop = pos + 14;

						if (sstop <= stop)

							obj.setSecond(Data.toUnsigned(buffer, pos + 13,
									sstop));

					}

					{
						int sstop = pos + 16;

						if (sstop <= stop)

							obj.setHundSec(Data.toUnsigned(buffer, pos + 15,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 114 : {
					UniversalDateAndTimeStamp obj = AfplibFactory.eINSTANCE
							.createUniversalDateAndTimeStamp();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setReserved(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setYearAD(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setMonth(Data
									.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setDay(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setHour(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setMinute(Data.toUnsigned(buffer, pos + 8,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setSecond(Data.toUnsigned(buffer, pos + 9,
									sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setTimeZone(Data.toUnsigned(buffer, pos + 10,
									sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setUTCDiffH(Data.toUnsigned(buffer, pos + 11,
									sstop));

					}

					{
						int sstop = pos + 12;

						if (sstop <= stop)

							obj.setUTCDiffM(Data.toUnsigned(buffer, pos + 12,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 4 : {
					MappingOption obj = AfplibFactory.eINSTANCE
							.createMappingOption();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setMapValue(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 69 : {
					MediaEjectControl obj = AfplibFactory.eINSTANCE
							.createMediaEjectControl();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setReserved(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setEjCtrl(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 86 : {
					MediumMapPageNumber obj = AfplibFactory.eINSTANCE
							.createMediumMapPageNumber();

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setPageNum(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 104 : {
					MediumOrientation obj = AfplibFactory.eINSTANCE
							.createMediumOrientation();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setMedOrient(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 75 : {
					MeasurementUnits obj = AfplibFactory.eINSTANCE
							.createMeasurementUnits();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setXoaBase(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setYoaBase(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setXoaUnits(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setYoaUnits(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 24 : {
					MODCAInterchangeSet obj = AfplibFactory.eINSTANCE
							.createMODCAInterchangeSet();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setIStype(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setISid(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 76 : {
					ObjectAreaSize obj = AfplibFactory.eINSTANCE
							.createObjectAreaSize();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setSizeType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setXoaSize(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setYoaSize(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 16 : {
					ObjectClassification obj = AfplibFactory.eINSTANCE
							.createObjectClassification();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setObjClass(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setStrucFlgs(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					{
						int sstop = pos + 23;

						if (sstop <= stop)

							obj.setRegObjId(Arrays.copyOfRange(buffer, pos + 8,
									sstop + 1));

					}

					{
						int sstop = pos + 55;

						if (stop >= pos + 55) {

							obj.setObjTpName(new String(buffer, pos + 24, sstop
									- pos - 24 + 1, charset));

						}

					}

					{
						int sstop = pos + 63;

						if (stop >= pos + 63) {

							obj.setObjLev(new String(buffer, pos + 56, sstop
									- pos - 56 + 1, charset));

						}

					}

					{
						int sstop = pos + 95;

						if (stop >= pos + 95) {

							obj.setCompName(new String(buffer, pos + 64, sstop
									- pos - 64 + 1, charset));

						}

					}

					triplets.add(obj);

					break;
				}

				case -33 : {
					ObjectFunctionSetSpecification obj = AfplibFactory.eINSTANCE
							.createObjectFunctionSetSpecification();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setObjType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setArchVrsn(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setDCAFnSet(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setOCAFnSet(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 90 : {
					ObjectOffset obj = AfplibFactory.eINSTANCE
							.createObjectOffset();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setObjTpe(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setObjOset(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					{
						int sstop = pos + 11;

						if (stop >= pos + 11) {

							obj.setObjOstHi(Data.toUnsigned(buffer, pos + 8,
									sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 33 : {
					ResourceObjectType obj = AfplibFactory.eINSTANCE
							.createResourceObjectType();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setObjType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setConData(Arrays.copyOfRange(buffer, pos + 3,
									sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 129 : {
					PagePositionInformation obj = AfplibFactory.eINSTANCE
							.createPagePositionInformation();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setPGPRG(Data
									.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 131 : {
					PresentationControl obj = AfplibFactory.eINSTANCE
							.createPresentationControl();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setPRSFlg(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 112 : {
					PresentationSpaceResetMixing obj = AfplibFactory.eINSTANCE
							.createPresentationSpaceResetMixing();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setBgMxFlag(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 113 : {
					PresentationSpaceMixingRules obj = AfplibFactory.eINSTANCE
							.createPresentationSpaceMixingRules();

					triplets.add(obj);

					break;
				}

				case 36 : {
					ResourceLocalIdentifier obj = AfplibFactory.eINSTANCE
							.createResourceLocalIdentifier();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setResType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setResLID(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 37 : {
					ResourceSectionNumber obj = AfplibFactory.eINSTANCE
							.createResourceSectionNumber();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setResSNum(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 29 : {
					TextOrientation obj = AfplibFactory.eINSTANCE
							.createTextOrientation();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setIAxis(Data
									.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setBAxis(Data
									.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 93 : {
					FontHorizontalScaleFactor obj = AfplibFactory.eINSTANCE
							.createFontHorizontalScaleFactor();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setHscale(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 31 : {
					FontDescriptorSpecification obj = AfplibFactory.eINSTANCE
							.createFontDescriptorSpecification();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFtWtClass(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFtWdClass(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setFtHeight(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setFtWidth(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setFtDsFlags(Data.toUnsigned(buffer, pos + 8,
									sstop));

					}

					{
						int sstop = pos + 19;

						if (stop >= pos + 19) {

							obj.setFtUsFlags(Data.toUnsigned(buffer, pos + 19,
									sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 116 : {
					TonerSaver obj = AfplibFactory.eINSTANCE.createTonerSaver();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setTSvCtrl(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 117 : {
					ColorFidelity obj = AfplibFactory.eINSTANCE
							.createColorFidelity();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpCoEx(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setRepCoEx(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setColSub(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 120 : {
					FontFidelity obj = AfplibFactory.eINSTANCE
							.createFontFidelity();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpFntEx(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 134 : {
					TextFidelity obj = AfplibFactory.eINSTANCE
							.createTextFidelity();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpTxtEx(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setRepTxtEx(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 135 : {
					MediaFidelity obj = AfplibFactory.eINSTANCE
							.createMediaFidelity();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpMedEx(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 136 : {
					FinishingFidelity obj = AfplibFactory.eINSTANCE
							.createFinishingFidelity();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpFinEx(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setRepFinEx(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 150 : {
					CMRFidelity obj = AfplibFactory.eINSTANCE
							.createCMRFidelity();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpCMREx(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setRepCMREx(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 87 : {
					ObjectByteExtent obj = AfplibFactory.eINSTANCE
							.createObjectByteExtent();

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setByteExt(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setByteExtHi(Data.toUnsigned(buffer, pos + 6,
									sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 45 : {
					ObjectByteOffset obj = AfplibFactory.eINSTANCE
							.createObjectByteOffset();

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setDirByOff(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setDirByHi(Data.toUnsigned(buffer, pos + 6,
									sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 89 : {
					ObjectStructuredFieldExtent obj = AfplibFactory.eINSTANCE
							.createObjectStructuredFieldExtent();

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setSFExt(Data
									.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setSFExtHi(Data.toUnsigned(buffer, pos + 6,
									sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 88 : {
					ObjectStructuredFieldOffset obj = AfplibFactory.eINSTANCE
							.createObjectStructuredFieldOffset();

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setSFOff(Data
									.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setSFOffHi(Data.toUnsigned(buffer, pos + 6,
									sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 94 : {
					ObjectCount obj = AfplibFactory.eINSTANCE
							.createObjectCount();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setSubObj(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setSObjNum(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					{
						int sstop = pos + 11;

						if (stop >= pos + 11) {

							obj.setSobjNmHi(Data.toUnsigned(buffer, pos + 8,
									sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 100 : {
					ObjectOriginIdentifier obj = AfplibFactory.eINSTANCE
							.createObjectOriginIdentifier();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setSystem(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setSysID(Arrays.copyOfRange(buffer, pos + 3,
									sstop + 1));

					}

					{
						int sstop = pos + 16;

						if (sstop <= stop)

							obj.setMedID(Arrays.copyOfRange(buffer, pos + 11,
									sstop + 1));

					}

					{
						int sstop = pos + 60;

						if (sstop <= stop)

							obj.setDSID(Arrays.copyOfRange(buffer, pos + 17,
									sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 39 : {
					LineDataObjectPositionMigration obj = AfplibFactory.eINSTANCE
							.createLineDataObjectPositionMigration();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setTempOrient(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 145 : {
					ColorManagementResourceDescriptor obj = AfplibFactory.eINSTANCE
							.createColorManagementResourceDescriptor();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setProcMode(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setCMRScpe(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 154 : {
					ImageResolution obj = AfplibFactory.eINSTANCE
							.createImageResolution();

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setXBase(Data
									.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYBase(Data
									.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setXResol(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setYResol(Data.toUnsigned(buffer, pos + 8,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 156 : {
					ObjectContainerPresentationSpaceSize obj = AfplibFactory.eINSTANCE
							.createObjectContainerPresentationSpaceSize();

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setPDFSize(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 34 : {
					ExtendedResourceLocalIdentifier obj = AfplibFactory.eINSTANCE
							.createExtendedResourceLocalIdentifier();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setResType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setResLID(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 121 : {
					MetricAdjustment obj = AfplibFactory.eINSTANCE
							.createMetricAdjustment();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setUnitBase(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setXUPUB(Data
									.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setYUPUB(Data
									.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setHUniformIncrement(Data.toSigned(buffer,
									pos + 7, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setVUniformIncrement(Data.toSigned(buffer,
									pos + 9, sstop));

					}

					{
						int sstop = pos + 12;

						if (sstop <= stop)

							obj.setHBaselineIncrement(Data.toSigned(buffer,
									pos + 11, sstop));

					}

					{
						int sstop = pos + 14;

						if (sstop <= stop)

							obj.setVBaselineIncrement(Data.toSigned(buffer,
									pos + 13, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 109 : {
					ExtensionFont obj = AfplibFactory.eINSTANCE
							.createExtensionFont();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setGCSGID(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 149 : {
					RenderingIntent obj = AfplibFactory.eINSTANCE
							.createRenderingIntent();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setReserved(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setIOCARI(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setOCRI(Data.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setPTOCRI(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setGOCARI(Data.toUnsigned(buffer, pos + 7,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setReserved2(Data.toUnsigned(buffer, pos + 8,
									sstop));

					}

					triplets.add(obj);

					break;
				}

				case 32 : {
					FontCodedGraphicCharacterSetGlobalIdentifier obj = AfplibFactory.eINSTANCE
							.createFontCodedGraphicCharacterSetGlobalIdentifier();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setGCSGID(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setCPGID(Data
									.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 140 : {
					LocaleSelector obj = AfplibFactory.eINSTANCE
							.createLocaleSelector();

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setLocFlgs(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setLangCode(new String(buffer, pos + 4, sstop
									- pos - 4 + 1, charset));

					}

					{
						int sstop = pos + 19;

						if (sstop <= stop)

							obj.setScrptCde(new String(buffer, pos + 12, sstop
									- pos - 12 + 1, charset));

					}

					{
						int sstop = pos + 27;

						if (sstop <= stop)

							obj.setRegCde(new String(buffer, pos + 20, sstop
									- pos - 20 + 1, charset));

					}

					{
						int sstop = pos + 35;

						if (sstop <= stop)

							obj.setReserved(Arrays.copyOfRange(buffer,
									pos + 28, sstop + 1));

					}

					{
						int sstop = pos + 32768;

						if (stop >= pos + 36) {
							sstop = stop;

							obj.setVarCde(new String(buffer, pos + 36, sstop
									- pos - 36 + 1, charset));

						}

					}

					triplets.add(obj);

					break;
				}

				case 133 : {
					FinishingOperation obj = AfplibFactory.eINSTANCE
							.createFinishingOperation();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFOpType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setRefEdge(Data.toUnsigned(buffer, pos + 5,
									sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setFOpCnt(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setAxOffst(Data.toUnsigned(buffer, pos + 7,
									sstop));

					}

					{
						int sstop = pos + 32768;

						if (stop >= pos + 9) {
							sstop = stop;

							obj.setOpPos(Arrays.copyOfRange(buffer, pos + 9,
									sstop + 1));

						}

					}

					triplets.add(obj);

					break;
				}

				case 142 : {
					UP3iFinishingOperation obj = AfplibFactory.eINSTANCE
							.createUP3iFinishingOperation();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setSeqnum(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 256;

						sstop = stop;
						if (sstop >= pos + 4)

							obj.setUP3iDat(Arrays.copyOfRange(buffer, pos + 4,
									sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 151 : {
					DeviceAppearance obj = AfplibFactory.eINSTANCE
							.createDeviceAppearance();

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setDevApp(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setReserved(Arrays.copyOfRange(buffer, pos + 5,
									sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 108 : {
					ResourceObjectInclude obj = AfplibFactory.eINSTANCE
							.createResourceObjectInclude();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setObjType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setObjName(new String(buffer, pos + 3, sstop
									- pos - 3 + 1, charset));

					}

					{
						int sstop = pos + 13;

						if (sstop <= stop)

							obj.setXobjOset(Data.toSigned(buffer, pos + 11,
									sstop));

					}

					{
						int sstop = pos + 16;

						if (sstop <= stop)

							obj.setYobjOset(Data.toSigned(buffer, pos + 14,
									sstop));

					}

					{
						int sstop = pos + 18;

						if (stop >= pos + 18) {

							obj.setObOrent(Data.toUnsigned(buffer, pos + 17,
									sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 70 : {
					PageOverlayConditionalProcessing obj = AfplibFactory.eINSTANCE
							.createPageOverlayConditionalProcessing();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setPgOvType(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (stop >= pos + 3) {

							obj.setLevel(Data
									.toUnsigned(buffer, pos + 3, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 71 : {
					ResourceUsageAttribute obj = AfplibFactory.eINSTANCE
							.createResourceUsageAttribute();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFrequency(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);

					break;
				}

			}
			pos += length;
		}
	}

	void sdf(List<Triplet> triplets, byte[] buffer, int start, int bufstop) {
		int pos = start;
		int lengthSize, lengthOffset, idSize, lengthAddition;

		while (pos + 1 <= bufstop) {

			if (0xfe == Integer.valueOf(Data.toHex(buffer, pos, 1), 16)) {
				lengthSize = 2;
				lengthOffset = 2;
				idSize = 2;
				lengthAddition = 4;
			} else {
				lengthSize = 1;
				lengthOffset = 1;
				idSize = 1;
				lengthAddition = 2;
			}

			int id = Integer.valueOf(Data.toHex(buffer, pos, idSize), 16);

			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			length += lengthAddition;

			int stop = pos + length - 1;
			if (stop > bufstop)
				break;

			switch (id) {

				case 112 : {
					BeginSegment obj = AfplibFactory.eINSTANCE
							.createBeginSegment();

					{
						int sstop = pos + 5;

						if (stop >= pos + 5) {

							obj.setSEGNAME(Data.toUnsigned(buffer, pos + 2,
									sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 113 : {
					EndSegment obj = AfplibFactory.eINSTANCE.createEndSegment();

					triplets.add(obj);
					break;
				}

				case 140 : {
					BeginTile obj = AfplibFactory.eINSTANCE.createBeginTile();

					triplets.add(obj);
					break;
				}

				case 141 : {
					EndTile obj = AfplibFactory.eINSTANCE.createEndTile();

					triplets.add(obj);
					break;
				}

				case 142 : {
					BeginTransparencyMask obj = AfplibFactory.eINSTANCE
							.createBeginTransparencyMask();

					triplets.add(obj);
					break;
				}

				case 143 : {
					EndTransparencyMask obj = AfplibFactory.eINSTANCE
							.createEndTransparencyMask();

					triplets.add(obj);
					break;
				}

				case 145 : {
					BeginImage obj = AfplibFactory.eINSTANCE.createBeginImage();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setOBJTYPE(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);
					break;
				}

				case 147 : {
					EndImage obj = AfplibFactory.eINSTANCE.createEndImage();

					triplets.add(obj);
					break;
				}

				case 148 : {
					ImageSize obj = AfplibFactory.eINSTANCE.createImageSize();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setUNITBASE(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setHRESOL(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setVRESOL(Data.toUnsigned(buffer, pos + 5,
									sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setHSIZE(Data
									.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setVSIZE(Data
									.toUnsigned(buffer, pos + 9, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 149 : {
					ImageEncoding obj = AfplibFactory.eINSTANCE
							.createImageEncoding();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setCOMPRID(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setRECID(Data
									.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 4;

						if (stop >= pos + 4) {

							obj.setBITORDR(Data.toUnsigned(buffer, pos + 4,
									sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 150 : {
					IDESize obj = AfplibFactory.eINSTANCE.createIDESize();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setIDESZ(Data
									.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 151 : {
					ImageLUTID obj = AfplibFactory.eINSTANCE.createImageLUTID();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setLUTID(Data
									.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 152 : {
					BandImage obj = AfplibFactory.eINSTANCE.createBandImage();

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 3)

						{

							BandImageRG(obj.getRg(), buffer, pos + 3, sstop, 1);

						}

					}

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setBCOUNT(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);
					break;
				}

				case 155 : {
					IDEStructure obj = AfplibFactory.eINSTANCE
							.createIDEStructure();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFLAGS(Data
									.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFORMAT(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setSIZE1(Data
									.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 8;

						if (stop >= pos + 8) {

							obj.setSIZE2(Data
									.toUnsigned(buffer, pos + 8, sstop));

						}

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setSIZE3(Data
									.toUnsigned(buffer, pos + 9, sstop));

						}

					}

					{
						int sstop = pos + 10;

						if (stop >= pos + 10) {

							obj.setSIZE4(Data.toUnsigned(buffer, pos + 10,
									sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 159 : {
					ExternalAlgorithm obj = AfplibFactory.eINSTANCE
							.createExternalAlgorithm();

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 4)

						{

							ExternalAlgorithmRG(obj.getRg(), buffer, pos + 4,
									sstop, 3);

						}

					}

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setALGTYPE(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					triplets.add(obj);
					break;
				}

				case 181 : {
					TilePosition obj = AfplibFactory.eINSTANCE
							.createTilePosition();

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setXOFFSET(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setYOFFSET(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					triplets.add(obj);
					break;
				}

				case 182 : {
					TileSize obj = AfplibFactory.eINSTANCE.createTileSize();

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setTHSIZE(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setTVSIZE(Data.toUnsigned(buffer, pos + 6,
									sstop));

					}

					{
						int sstop = pos + 10;

						if (stop >= pos + 10) {

							obj.setRELRES(Data.toUnsigned(buffer, pos + 10,
									sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 183 : {
					TileSetColor obj = AfplibFactory.eINSTANCE
							.createTileSetColor();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setCSPACE(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setRESERVED(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setSIZE1(Data
									.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setSIZE2(Data
									.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setSIZE3(Data
									.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setSIZE4(Data
									.toUnsigned(buffer, pos + 9, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setCVAL1(Data.toUnsigned(buffer, pos + 10,
									sstop));

					}

					{
						int sstop = pos + 13;

						if (sstop <= stop)

							obj.setCVAL2(Data.toUnsigned(buffer, pos + 12,
									sstop));

					}

					{
						int sstop = pos + 15;

						if (sstop <= stop)

							obj.setCVAL3(Data.toUnsigned(buffer, pos + 14,
									sstop));

					}

					{
						int sstop = pos + 17;

						if (sstop <= stop)

							obj.setCVAL4(Data.toUnsigned(buffer, pos + 16,
									sstop));

					}

					triplets.add(obj);
					break;
				}

				case 246 : {
					SetBiLevelImageColor obj = AfplibFactory.eINSTANCE
							.createSetBiLevelImageColor();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setAREA(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						sstop = stop;
						if (sstop >= pos + 3)

							obj.setReserved(Arrays.copyOfRange(buffer, pos + 3,
									sstop + 1));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setNAMECOLR(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					triplets.add(obj);
					break;
				}

				case 247 : {
					IOCAFunctionSetIdentification obj = AfplibFactory.eINSTANCE
							.createIOCAFunctionSetIdentification();

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setCATEGORY(Data.toUnsigned(buffer, pos + 2,
									sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFCNSET(Data.toUnsigned(buffer, pos + 3,
									sstop));

					}

					triplets.add(obj);
					break;
				}

				case 65170 : {
					ImageData obj = AfplibFactory.eINSTANCE.createImageData();

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 4)

							obj.setDATA(Arrays.copyOfRange(buffer, pos + 4,
									sstop + 1));

					}

					triplets.add(obj);
					break;
				}

				case 65180 : {
					BandImageData obj = AfplibFactory.eINSTANCE
							.createBandImageData();

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setBANDNUM(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setRESERVED(Data.toUnsigned(buffer, pos + 5,
									sstop));

					}

					{
						int sstop = pos + 32768;

						if (stop >= pos + 7) {
							sstop = stop;

							obj.setDATA(Arrays.copyOfRange(buffer, pos + 7,
									sstop + 1));

						}

					}

					triplets.add(obj);
					break;
				}

				case 65208 : {
					IncludeTile obj = AfplibFactory.eINSTANCE
							.createIncludeTile();

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setTIRID(Data
									.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 65230 : {
					ImageSubsampling obj = AfplibFactory.eINSTANCE
							.createImageSubsampling();

					{
						int sstop = pos + 32768;

						if (stop >= pos + 4) {
							sstop = stop;

							{

								sdf(obj.getSdfs(), buffer, pos + 4, sstop);

							}

						}

					}

					triplets.add(obj);
					break;
				}

				case 1 : {
					SamplingRatios obj = AfplibFactory.eINSTANCE
							.createSamplingRatios();

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							SamplingRatiosRG(obj.getRg(), buffer, pos + 2,
									sstop, 2);

						}

					}

					triplets.add(obj);
					break;
				}

				case 65211 : {
					TileTOC obj = AfplibFactory.eINSTANCE.createTileTOC();

					{
						int sstop = pos + 32768;

						if (stop >= pos + 6) {
							sstop = stop;

							{

								TileTOCRG(obj.getRg(), buffer, pos + 6, sstop,
										26);

							}

						}

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setReserved(Data.toUnsigned(buffer, pos + 4,
									sstop));

					}

					triplets.add(obj);
					break;
				}

			}
			pos += length;
		}
	}

	private enum State {
		READ_PREFIX_AND_CLASS, READ_LENGTH, READ_TYPE, READ_CHAINED, READ_UNCHAINED, TERMINATE
	};

	private final boolean isChained(int functionType) {
		return (functionType & 0x01) == 1;
	}

	private final int unchain(int functionType) {
		return functionType &= 0xfe;
	}

	void cs(List<Triplet> triplets, byte[] buffer, int start, int bufstop) {
		int number = 0;
		int length = 0;
		State state = State.READ_PREFIX_AND_CLASS;
		boolean isChainedTo = false;

		while (state != State.TERMINATE && start <= bufstop) {
			int functionType;
			switch (state) {
				case READ_UNCHAINED :
					isChainedTo = false;
					state = State.READ_PREFIX_AND_CLASS;
					break;
				case READ_PREFIX_AND_CLASS :
					if (Data.toUnsignedByte(buffer[start]) != 0x2B
							|| Data.toUnsignedByte(buffer[start + 1]) != 0xD3) {

						//rest are code points

						Triplet m = cs(buffer, start, bufstop, 0xda);
						number++;
						if (m != null) {
							m.setTripletId(0xda);
							m.setTripletNumber(number);
							m.setTripletLength(length + 1);
							m.setFileOffset(start);
							triplets.add(m);
						} else
							System.out.println("failed CS construction."); // FIXME
						start += buffer.length;

						state = State.TERMINATE;
						break;
					}
					state = State.READ_LENGTH;
					start += 2;
					break;
				case READ_CHAINED :
					isChainedTo = true;
					state = State.READ_LENGTH;
					break;
				case READ_LENGTH :
					length = Data.toUnsignedByte(buffer[start]);
					state = State.READ_TYPE;
					length--; // don't include length byte in length because we
								// increment offset (so it doesn't point to length)
					start++;
					break;
				case READ_TYPE :
					functionType = Data.toUnsignedByte(buffer[start]);
					if (isChained(functionType)) {
						state = State.READ_CHAINED;
						functionType = unchain(functionType);
					} else {
						state = State.READ_UNCHAINED;
					}
					Triplet m = cs(buffer, start, start + length - 1,
							functionType);
					if (m != null) {
						m.setTripletId(functionType);
						m.setTripletNumber(number);
						m.setTripletLength(length + 1);
						m.setFileOffset(start);
						triplets.add(m);
					} else
						System.out.println("failed CS construction."); // FIXME
					number++;
					start += length;
					if (start == buffer.length) {
						state = State.TERMINATE;
					}
					break;
				case TERMINATE :
					break;
			}
		}
	}

	Triplet cs(byte[] buffer, int pos, int stop, int id) {
		switch (id) {

			case 210 : {
				AMB obj = AfplibFactory.eINSTANCE.createAMB();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setDSPLCMNT(Data.toSigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 198 : {
				AMI obj = AfplibFactory.eINSTANCE.createAMI();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setDSPLCMNT(Data.toSigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 216 : {
				BLN obj = AfplibFactory.eINSTANCE.createBLN();

				return obj;
			}

			case 242 : {
				BSU obj = AfplibFactory.eINSTANCE.createBSU();

				{
					int sstop = pos + 1;

					if (sstop <= stop)

						obj.setLID(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 230 : {
				DBR obj = AfplibFactory.eINSTANCE.createDBR();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setRLENGTH(Data.toSigned(buffer, pos + 1, sstop));

				}

				{
					int sstop = pos + 4;

					if (stop >= pos + 4) {

						obj.setRWIDTH(Data.toSigned(buffer, pos + 3, sstop));

					}

				}

				{
					int sstop = pos + 5;

					if (stop >= pos + 5) {

						obj.setRWIDTHFRACTION(Data.toSigned(buffer, pos + 5,
								sstop));

					}

				}

				return obj;
			}

			case 228 : {
				DIR obj = AfplibFactory.eINSTANCE.createDIR();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setRLENGTH(Data.toSigned(buffer, pos + 1, sstop));

				}

				{
					int sstop = pos + 4;

					if (stop >= pos + 4) {

						obj.setRWIDTH(Data.toSigned(buffer, pos + 3, sstop));

					}

				}

				{
					int sstop = pos + 5;

					if (stop >= pos + 5) {

						obj.setRWIDTHFRACTION(Data.toSigned(buffer, pos + 5,
								sstop));

					}

				}

				return obj;
			}

			case 244 : {
				ESU obj = AfplibFactory.eINSTANCE.createESU();

				{
					int sstop = pos + 1;

					if (sstop <= stop)

						obj.setLID(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 248 : {
				NOPCS obj = AfplibFactory.eINSTANCE.createNOPCS();

				{
					int sstop = pos + 253;

					if (stop >= pos + 1) {
						sstop = stop;

						obj.setIGNDATA(Arrays.copyOfRange(buffer, pos + 1,
								sstop + 1));

					}

				}

				return obj;
			}

			case 114 : {
				OVS obj = AfplibFactory.eINSTANCE.createOVS();

				{
					int sstop = pos + 1;

					if (sstop <= stop)

						obj.setBYPSIDEN(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				{
					int sstop = pos + 3;

					if (sstop <= stop)

						obj.setOVERCHAR(Data.toUnsigned(buffer, pos + 2, sstop));

				}

				return obj;
			}

			case 212 : {
				RMB obj = AfplibFactory.eINSTANCE.createRMB();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setINCRMENT(Data.toSigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 200 : {
				RMI obj = AfplibFactory.eINSTANCE.createRMI();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setINCRMENT(Data.toSigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 238 : {
				RPS obj = AfplibFactory.eINSTANCE.createRPS();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setRLENGTH(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				{
					int sstop = pos + 253;

					if (stop >= pos + 3) {
						sstop = stop;

						obj.setRPTDATA(new String(buffer, pos + 3, sstop - pos
								- 3 + 1, charset));

					}

				}

				return obj;
			}

			case 208 : {
				SBI obj = AfplibFactory.eINSTANCE.createSBI();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setINCRMENT(Data.toSigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 240 : {
				SCFL obj = AfplibFactory.eINSTANCE.createSCFL();

				{
					int sstop = pos + 1;

					if (sstop <= stop)

						obj.setLID(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 128 : {
				SEC obj = AfplibFactory.eINSTANCE.createSEC();

				{
					int sstop = pos + 1;

					if (sstop <= stop)

						obj.setRESERVED(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setCOLSPCE(Data.toUnsigned(buffer, pos + 2, sstop));

				}

				{
					int sstop = pos + 7;

					if (sstop <= stop)

						obj.setCOLSIZE1(Data.toUnsigned(buffer, pos + 7, sstop));

				}

				{
					int sstop = pos + 8;

					if (sstop <= stop)

						obj.setCOLSIZE2(Data.toUnsigned(buffer, pos + 8, sstop));

				}

				{
					int sstop = pos + 9;

					if (sstop <= stop)

						obj.setCOLSIZE3(Data.toUnsigned(buffer, pos + 9, sstop));

				}

				{
					int sstop = pos + 10;

					if (sstop <= stop)

						obj.setCOLSIZE4(Data
								.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 14;

					if (stop >= pos + 11) {
						sstop = stop;

						obj.setCOLVALUE(Arrays.copyOfRange(buffer, pos + 11,
								sstop + 1));

					}

				}

				return obj;
			}

			case 194 : {
				SIA obj = AfplibFactory.eINSTANCE.createSIA();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setADJSTMNT(Data.toSigned(buffer, pos + 1, sstop));

				}

				{
					int sstop = pos + 3;

					if (stop >= pos + 3) {

						obj.setDIRCTION(Data.toUnsigned(buffer, pos + 3, sstop));

					}

				}

				return obj;
			}

			case 192 : {
				SIM obj = AfplibFactory.eINSTANCE.createSIM();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setDSPLCMNT(Data.toSigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 116 : {
				STC obj = AfplibFactory.eINSTANCE.createSTC();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setFRGCOLOR(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				{
					int sstop = pos + 3;

					if (stop >= pos + 3) {

						obj.setPRECSION(Data.toUnsigned(buffer, pos + 3, sstop));

					}

				}

				return obj;
			}

			case 246 : {
				STO obj = AfplibFactory.eINSTANCE.createSTO();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setIORNTION(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				{
					int sstop = pos + 4;

					if (sstop <= stop)

						obj.setBORNTION(Data.toUnsigned(buffer, pos + 3, sstop));

				}

				return obj;
			}

			case 196 : {
				SVI obj = AfplibFactory.eINSTANCE.createSVI();

				{
					int sstop = pos + 2;

					if (sstop <= stop)

						obj.setINCRMENT(Data.toSigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

			case 120 : {
				TBM obj = AfplibFactory.eINSTANCE.createTBM();

				{
					int sstop = pos + 1;

					if (sstop <= stop)

						obj.setDIRCTION(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				{
					int sstop = pos + 2;

					if (stop >= pos + 2) {

						obj.setPRECSION(Data.toUnsigned(buffer, pos + 2, sstop));

					}

				}

				{
					int sstop = pos + 4;

					if (stop >= pos + 4) {

						obj.setINCRMENT(Data.toSigned(buffer, pos + 3, sstop));

					}

				}

				return obj;
			}

			case 218 : {
				TRN obj = AfplibFactory.eINSTANCE.createTRN();

				{
					int sstop = pos + 253;

					sstop = stop;
					if (sstop >= pos + 1)

						obj.setTRNDATA(Arrays.copyOfRange(buffer, pos + 1,
								sstop + 1));

				}

				return obj;
			}

			case 118 : {
				USC obj = AfplibFactory.eINSTANCE.createUSC();

				{
					int sstop = pos + 1;

					if (sstop <= stop)

						obj.setBYPSIDEN(Data.toUnsigned(buffer, pos + 1, sstop));

				}

				return obj;
			}

		}
		return null;
	}

	void CFIRG(List<CFIRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_CFIRG(buffer, pos, stop));
			pos += length;
		}
	}

	void CPIRG(List<CPIRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_CPIRG(buffer, pos, stop));
			pos += length;
		}
	}

	void FNIRG(List<FNIRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_FNIRG(buffer, pos, stop));
			pos += length;
		}
	}

	void FNNRG(List<FNNRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_FNNRG(buffer, pos, stop));
			pos += length;
		}
	}

	void FNMRG(List<FNMRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_FNMRG(buffer, pos, stop));
			pos += length;
		}
	}

	void FNORG(List<FNORG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_FNORG(buffer, pos, stop));
			pos += length;
		}
	}

	void FNPRG(List<FNPRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_FNPRG(buffer, pos, stop));
			pos += length;
		}
	}

	void LLERG(List<LLERG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_LLERG(buffer, pos, stop));
			pos += length;
		}
	}

	void MBCRG(List<MBCRG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MBCRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MCARG(List<MCARG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MCARG(buffer, pos, stop));
			pos += length;
		}
	}

	void MCCRG(List<MCCRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MCCRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MCDRG(List<MCDRG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MCDRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MCFRG(List<MCFRG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MCFRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MCF1RG(List<MCF1RG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MCF1RG(buffer, pos, stop));
			pos += length;
		}
	}

	void MDRRG(List<MDRRG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MDRRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MGORG(List<MGORG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MGORG(buffer, pos, stop));
			pos += length;
		}
	}

	void MIORG(List<MIORG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MIORG(buffer, pos, stop));
			pos += length;
		}
	}

	void MMCRG(List<MMCRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MMCRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MMDRG(List<MMDRG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MMDRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MMORG(List<MMORG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MMORG(buffer, pos, stop));
			pos += length;
		}
	}

	void MMTRG(List<MMTRG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MMTRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MPGRG(List<MPGRG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MPGRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MPORG(List<MPORG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MPORG(buffer, pos, stop));
			pos += length;
		}
	}

	void MPSRG(List<MPSRG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MPSRG(buffer, pos, stop));
			pos += length;
		}
	}

	void MSURG(List<MSURG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MSURG(buffer, pos, stop));
			pos += length;
		}
	}

	void PGPRG(List<PGPRG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_PGPRG(buffer, pos, stop));
			pos += length;
		}
	}

	void PPORG(List<PPORG> objs, byte[] buffer, int start, int bufstop,
			int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos
					+ lengthOffset - 1 + lengthSize);
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_PPORG(buffer, pos, stop));
			pos += length;
		}
	}

	void BandImageRG(List<BandImageRG> objs, byte[] buffer, int start,
			int bufstop, int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_BandImageRG(buffer, pos, stop));
			pos += length;
		}
	}

	void ExternalAlgorithmRG(List<ExternalAlgorithmRG> objs, byte[] buffer,
			int start, int bufstop, int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_ExternalAlgorithmRG(buffer, pos, stop));
			pos += length;
		}
	}

	void SamplingRatiosRG(List<SamplingRatiosRG> objs, byte[] buffer,
			int start, int bufstop, int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_SamplingRatiosRG(buffer, pos, stop));
			pos += length;
		}
	}

	void TileTOCRG(List<TileTOCRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_TileTOCRG(buffer, pos, stop));
			pos += length;
		}
	}

	void GFLTRG(List<GFLTRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GFLTRG(buffer, pos, stop));
			pos += length;
		}
	}

	void GCFLTRG(List<GCFLTRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCFLTRG(buffer, pos, stop));
			pos += length;
		}
	}

	void GLINERG(List<GLINERG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GLINERG(buffer, pos, stop));
			pos += length;
		}
	}

	void GCLINERG(List<GCLINERG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCLINERG(buffer, pos, stop));
			pos += length;
		}
	}

	void GMRKRG(List<GMRKRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GMRKRG(buffer, pos, stop));
			pos += length;
		}
	}

	void GCMRKRG(List<GCMRKRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCMRKRG(buffer, pos, stop));
			pos += length;
		}
	}

	void GRLINERG(List<GRLINERG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GRLINERG(buffer, pos, stop));
			pos += length;
		}
	}

	void GCRLINERG(List<GCRLINERG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCRLINERG(buffer, pos, stop));
			pos += length;
		}
	}

	void GCBEZRG(List<GCBEZRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCBEZRG(buffer, pos, stop));
			pos += length;
		}
	}

	void GCCBEZRG(List<GCCBEZRG> objs, byte[] buffer, int start, int bufstop,
			int length) {
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCCBEZRG(buffer, pos, stop));
			pos += length;
		}
	}

	CPIRG _CPIRG(byte[] buffer, int pos, int stop) {
		CPIRG obj = AfplibFactory.eINSTANCE.createCPIRG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setGCGID(new String(buffer, pos + 0, sstop - pos - 0 + 1,
						charset));

		}

		{
			int sstop = pos + 8;

			if (sstop <= stop)

				obj.setPrtFlags(Data.toUnsigned(buffer, pos + 8, sstop));

		}

		{
			int sstop = pos + 9;

			if (sstop <= stop)

				obj.setCodePoint(Data.toUnsigned(buffer, pos + 9, sstop));

		}

		{
			int sstop = pos + 10;

			if (stop >= pos + 10) {

				obj.setCount(Data.toUnsigned(buffer, pos + 10, sstop));

			}

		}

		return obj;
	}

	CFIRG _CFIRG(byte[] buffer, int pos, int stop) {
		CFIRG obj = AfplibFactory.eINSTANCE.createCFIRG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setFCSName(new String(buffer, pos + 0, sstop - pos - 0 + 1,
						charset));

		}

		{
			int sstop = pos + 15;

			if (sstop <= stop)

				obj.setCPName(new String(buffer, pos + 8, sstop - pos - 8 + 1,
						charset));

		}

		{
			int sstop = pos + 17;

			if (sstop <= stop)

				obj.setSVSize(Data.toUnsigned(buffer, pos + 16, sstop));

		}

		{
			int sstop = pos + 19;

			if (sstop <= stop)

				obj.setSHScale(Data.toUnsigned(buffer, pos + 18, sstop));

		}

		{
			int sstop = pos + 23;

			sstop = stop;
			if (sstop >= pos + 20)

				obj.setReserved(Arrays.copyOfRange(buffer, pos + 20, sstop + 1));

		}

		{
			int sstop = pos + 24;

			if (sstop <= stop)

				obj.setSection(Data.toUnsigned(buffer, pos + 24, sstop));

		}

		return obj;
	}

	FNIRG _FNIRG(byte[] buffer, int pos, int stop) {
		FNIRG obj = AfplibFactory.eINSTANCE.createFNIRG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setGCGID(new String(buffer, pos + 0, sstop - pos - 0 + 1,
						charset));

		}

		{
			int sstop = pos + 9;

			if (sstop <= stop)

				obj.setCharInc(Data.toUnsigned(buffer, pos + 8, sstop));

		}

		{
			int sstop = pos + 11;

			if (sstop <= stop)

				obj.setAscendHt(Data.toSigned(buffer, pos + 10, sstop));

		}

		{
			int sstop = pos + 13;

			if (sstop <= stop)

				obj.setDescendDp(Data.toSigned(buffer, pos + 12, sstop));

		}

		{
			int sstop = pos + 15;

			if (sstop <= stop)

				obj.setReserved(Data.toUnsigned(buffer, pos + 14, sstop));

		}

		{
			int sstop = pos + 17;

			if (sstop <= stop)

				obj.setFNMCnt(Data.toUnsigned(buffer, pos + 16, sstop));

		}

		{
			int sstop = pos + 19;

			if (sstop <= stop)

				obj.setASpace(Data.toSigned(buffer, pos + 18, sstop));

		}

		{
			int sstop = pos + 21;

			if (sstop <= stop)

				obj.setBSpace(Data.toUnsigned(buffer, pos + 20, sstop));

		}

		{
			int sstop = pos + 23;

			if (sstop <= stop)

				obj.setCSpace(Data.toSigned(buffer, pos + 22, sstop));

		}

		{
			int sstop = pos + 25;

			if (sstop <= stop)

				obj.setReserved2(Data.toUnsigned(buffer, pos + 24, sstop));

		}

		{
			int sstop = pos + 27;

			if (sstop <= stop)

				obj.setBaseOset(Data.toSigned(buffer, pos + 26, sstop));

		}

		return obj;
	}

	FNMRG _FNMRG(byte[] buffer, int pos, int stop) {
		FNMRG obj = AfplibFactory.eINSTANCE.createFNMRG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setCharBoxWd(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setCharBoxHt(Data.toUnsigned(buffer, pos + 2, sstop));

		}

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setPatDOset(Data.toUnsigned(buffer, pos + 4, sstop));

		}

		return obj;
	}

	LLERG _LLERG(byte[] buffer, int pos, int stop) {
		LLERG obj = AfplibFactory.eINSTANCE.createLLERG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 3)

			{

				triplet(obj.getTriplets(), buffer, pos + 3, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 2;

			if (sstop <= stop)

				obj.setRGFunct(Data.toUnsigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	MPSRG _MPSRG(byte[] buffer, int pos, int stop) {
		MPSRG obj = AfplibFactory.eINSTANCE.createMPSRG();

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setReserved(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 11;

			if (sstop <= stop)

				obj.setPsegName(new String(buffer, pos + 4,
						sstop - pos - 4 + 1, charset));

		}

		return obj;
	}

	MCFRG _MCFRG(byte[] buffer, int pos, int stop) {
		MCFRG obj = AfplibFactory.eINSTANCE.createMCFRG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 2)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MBCRG _MBCRG(byte[] buffer, int pos, int stop) {
		MBCRG obj = AfplibFactory.eINSTANCE.createMBCRG();

		{
			int sstop = pos + 4;

			if (sstop <= stop)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MCARG _MCARG(byte[] buffer, int pos, int stop) {
		MCARG obj = AfplibFactory.eINSTANCE.createMCARG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 2)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MCDRG _MCDRG(byte[] buffer, int pos, int stop) {
		MCDRG obj = AfplibFactory.eINSTANCE.createMCDRG();

		{
			int sstop = pos + 4;

			if (sstop <= stop)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MDRRG _MDRRG(byte[] buffer, int pos, int stop) {
		MDRRG obj = AfplibFactory.eINSTANCE.createMDRRG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 2)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MGORG _MGORG(byte[] buffer, int pos, int stop) {
		MGORG obj = AfplibFactory.eINSTANCE.createMGORG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 2)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MIORG _MIORG(byte[] buffer, int pos, int stop) {
		MIORG obj = AfplibFactory.eINSTANCE.createMIORG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 2)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MMDRG _MMDRG(byte[] buffer, int pos, int stop) {
		MMDRG obj = AfplibFactory.eINSTANCE.createMMDRG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 2)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MMTRG _MMTRG(byte[] buffer, int pos, int stop) {
		MMTRG obj = AfplibFactory.eINSTANCE.createMMTRG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 2)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MPGRG _MPGRG(byte[] buffer, int pos, int stop) {
		MPGRG obj = AfplibFactory.eINSTANCE.createMPGRG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 2)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MPORG _MPORG(byte[] buffer, int pos, int stop) {
		MPORG obj = AfplibFactory.eINSTANCE.createMPORG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 2)

			{

				triplet(obj.getTriplets(), buffer, pos + 2, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	PPORG _PPORG(byte[] buffer, int pos, int stop) {
		PPORG obj = AfplibFactory.eINSTANCE.createPPORG();

		{
			int sstop = pos + 32768;

			sstop = stop;
			if (sstop >= pos + 12)

			{

				triplet(obj.getTriplets(), buffer, pos + 12, sstop);

			}

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 2;

			if (sstop <= stop)

				obj.setObjType(Data.toUnsigned(buffer, pos + 2, sstop));

		}

		{
			int sstop = pos + 5;

			if (sstop <= stop)

				obj.setProcFlgs(Data.toUnsigned(buffer, pos + 5, sstop));

		}

		{
			int sstop = pos + 8;

			if (sstop <= stop)

				obj.setXocaOset(Data.toSigned(buffer, pos + 6, sstop));

		}

		{
			int sstop = pos + 11;

			if (sstop <= stop)

				obj.setYocaOset(Data.toSigned(buffer, pos + 9, sstop));

		}

		return obj;
	}

	PGPRG _PGPRG(byte[] buffer, int pos, int stop) {
		PGPRG obj = AfplibFactory.eINSTANCE.createPGPRG();

		{
			int sstop = pos + 0;

			if (sstop <= stop)

				obj.setRGLength(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setXmOset(Data.toSigned(buffer, pos + 1, sstop));

		}

		{
			int sstop = pos + 6;

			if (sstop <= stop)

				obj.setYmOset(Data.toSigned(buffer, pos + 4, sstop));

		}

		{
			int sstop = pos + 8;

			if (sstop <= stop)

				obj.setPGorient(Data.toUnsigned(buffer, pos + 7, sstop));

		}

		{
			int sstop = pos + 9;

			if (sstop <= stop)

				obj.setSHside(Data.toUnsigned(buffer, pos + 9, sstop));

		}

		{
			int sstop = pos + 10;

			if (stop >= pos + 10) {

				obj.setPgFlgs(Data.toUnsigned(buffer, pos + 10, sstop));

			}

		}

		{
			int sstop = pos + 11;

			if (stop >= pos + 11) {

				obj.setPMCid(Data.toUnsigned(buffer, pos + 11, sstop));

			}

		}

		return obj;
	}

	MCCRG _MCCRG(byte[] buffer, int pos, int stop) {
		MCCRG obj = AfplibFactory.eINSTANCE.createMCCRG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setStartnum(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setStopnum(Data.toUnsigned(buffer, pos + 2, sstop));

		}

		{
			int sstop = pos + 5;

			if (sstop <= stop)

				obj.setMMCid(Data.toUnsigned(buffer, pos + 5, sstop));

		}

		return obj;
	}

	MMORG _MMORG(byte[] buffer, int pos, int stop) {
		MMORG obj = AfplibFactory.eINSTANCE.createMMORG();

		{
			int sstop = pos + 0;

			if (sstop <= stop)

				obj.setOVLid(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setFlags(Data.toUnsigned(buffer, pos + 1, sstop));

		}

		{
			int sstop = pos + 11;

			if (sstop <= stop)

				obj.setOVLname(new String(buffer, pos + 4, sstop - pos - 4 + 1,
						charset));

		}

		return obj;
	}

	BandImageRG _BandImageRG(byte[] buffer, int pos, int stop) {
		BandImageRG obj = AfplibFactory.eINSTANCE.createBandImageRG();

		{
			int sstop = pos + 0;

			if (sstop <= stop)

				obj.setBITCNT(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		return obj;
	}

	MCF1RG _MCF1RG(byte[] buffer, int pos, int stop) {
		MCF1RG obj = AfplibFactory.eINSTANCE.createMCF1RG();

		{
			int sstop = pos + 0;

			if (sstop <= stop)

				obj.setCFLid(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 2;

			if (sstop <= stop)

				obj.setSectid(Data.toUnsigned(buffer, pos + 2, sstop));

		}

		{
			int sstop = pos + 11;

			if (sstop <= stop)

				obj.setCFName(new String(buffer, pos + 4, sstop - pos - 4 + 1,
						charset));

		}

		{
			int sstop = pos + 19;

			if (sstop <= stop)

				obj.setCPName(new String(buffer, pos + 12,
						sstop - pos - 12 + 1, charset));

		}

		{
			int sstop = pos + 27;

			if (sstop <= stop)

				obj.setFCSName(new String(buffer, pos + 20, sstop - pos - 20
						+ 1, charset));

		}

		{
			int sstop = pos + 29;

			if (stop >= pos + 29) {

				obj.setCharRot(Data.toUnsigned(buffer, pos + 28, sstop));

			}

		}

		return obj;
	}

	MMCRG _MMCRG(byte[] buffer, int pos, int stop) {
		MMCRG obj = AfplibFactory.eINSTANCE.createMMCRG();

		{
			int sstop = pos + 0;

			if (sstop <= stop)

				obj.setKey(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setValue(Data.toUnsigned(buffer, pos + 1, sstop));

		}

		return obj;
	}

	FNORG _FNORG(byte[] buffer, int pos, int stop) {
		FNORG obj = AfplibFactory.eINSTANCE.createFNORG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setReserved(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setCharRot(Data.toUnsigned(buffer, pos + 2, sstop));

		}

		{
			int sstop = pos + 5;

			if (sstop <= stop)

				obj.setMaxBOset(Data.toSigned(buffer, pos + 4, sstop));

		}

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setMaxCharInc(Data.toUnsigned(buffer, pos + 6, sstop));

		}

		{
			int sstop = pos + 9;

			if (sstop <= stop)

				obj.setSpCharInc(Data.toUnsigned(buffer, pos + 8, sstop));

		}

		{
			int sstop = pos + 11;

			if (sstop <= stop)

				obj.setMaxBExt(Data.toUnsigned(buffer, pos + 10, sstop));

		}

		{
			int sstop = pos + 12;

			if (sstop <= stop)

				obj.setOrntFlgs(Data.toUnsigned(buffer, pos + 12, sstop));

		}

		{
			int sstop = pos + 13;

			if (sstop <= stop)

				obj.setReserved2(Data.toUnsigned(buffer, pos + 13, sstop));

		}

		{
			int sstop = pos + 15;

			if (sstop <= stop)

				obj.setEmSpInc(Data.toUnsigned(buffer, pos + 14, sstop));

		}

		{
			int sstop = pos + 17;

			if (sstop <= stop)

				obj.setReserved3(Data.toUnsigned(buffer, pos + 16, sstop));

		}

		{
			int sstop = pos + 19;

			if (sstop <= stop)

				obj.setFigSpInc(Data.toUnsigned(buffer, pos + 18, sstop));

		}

		{
			int sstop = pos + 21;

			if (sstop <= stop)

				obj.setNomCharInc(Data.toUnsigned(buffer, pos + 20, sstop));

		}

		{
			int sstop = pos + 23;

			if (sstop <= stop)

				obj.setDefBInc(Data.toUnsigned(buffer, pos + 22, sstop));

		}

		{
			int sstop = pos + 25;

			if (sstop <= stop)

				obj.setMinASp(Data.toUnsigned(buffer, pos + 24, sstop));

		}

		return obj;
	}

	FNPRG _FNPRG(byte[] buffer, int pos, int stop) {
		FNPRG obj = AfplibFactory.eINSTANCE.createFNPRG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setReserved(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setLcHeight(Data.toSigned(buffer, pos + 2, sstop));

		}

		{
			int sstop = pos + 5;

			if (sstop <= stop)

				obj.setCapMHt(Data.toSigned(buffer, pos + 4, sstop));

		}

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setMaxAscHt(Data.toSigned(buffer, pos + 6, sstop));

		}

		{
			int sstop = pos + 9;

			if (sstop <= stop)

				obj.setMaxDesDp(Data.toSigned(buffer, pos + 8, sstop));

		}

		{
			int sstop = pos + 14;

			if (sstop <= stop)

				obj.setReserved2(Arrays
						.copyOfRange(buffer, pos + 10, sstop + 1));

		}

		{
			int sstop = pos + 15;

			if (sstop <= stop)

				obj.setRetired(Data.toUnsigned(buffer, pos + 15, sstop));

		}

		{
			int sstop = pos + 16;

			if (sstop <= stop)

				obj.setReserved3(Data.toUnsigned(buffer, pos + 16, sstop));

		}

		{
			int sstop = pos + 18;

			if (sstop <= stop)

				obj.setUscoreWd(Data.toUnsigned(buffer, pos + 17, sstop));

		}

		{
			int sstop = pos + 19;

			if (sstop <= stop)

				obj.setUscoreWdf(Data.toUnsigned(buffer, pos + 19, sstop));

		}

		{
			int sstop = pos + 21;

			if (sstop <= stop)

				obj.setUscorePos(Data.toSigned(buffer, pos + 20, sstop));

		}

		return obj;
	}

	TileTOCRG _TileTOCRG(byte[] buffer, int pos, int stop) {
		TileTOCRG obj = AfplibFactory.eINSTANCE.createTileTOCRG();

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setXOFFSET(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setYOFFSET(Data.toUnsigned(buffer, pos + 4, sstop));

		}

		{
			int sstop = pos + 11;

			if (sstop <= stop)

				obj.setTHSIZE(Data.toUnsigned(buffer, pos + 8, sstop));

		}

		{
			int sstop = pos + 15;

			if (sstop <= stop)

				obj.setTVSIZE(Data.toUnsigned(buffer, pos + 12, sstop));

		}

		{
			int sstop = pos + 16;

			if (sstop <= stop)

				obj.setRELRES(Data.toUnsigned(buffer, pos + 16, sstop));

		}

		{
			int sstop = pos + 17;

			if (sstop <= stop)

				obj.setCOMPR(Data.toUnsigned(buffer, pos + 17, sstop));

		}

		{
			int sstop = pos + 25;

			if (sstop <= stop)

				obj.setDATAPOS(Data.toUnsigned(buffer, pos + 18, sstop));

		}

		return obj;
	}

	SamplingRatiosRG _SamplingRatiosRG(byte[] buffer, int pos, int stop) {
		SamplingRatiosRG obj = AfplibFactory.eINSTANCE.createSamplingRatiosRG();

		{
			int sstop = pos + 0;

			if (sstop <= stop)

				obj.setHSAMPLE(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setVSAMPLE(Data.toUnsigned(buffer, pos + 1, sstop));

		}

		return obj;
	}

	ExternalAlgorithmRG _ExternalAlgorithmRG(byte[] buffer, int pos, int stop) {
		ExternalAlgorithmRG obj = AfplibFactory.eINSTANCE
				.createExternalAlgorithmRG();

		{
			int sstop = pos + 0;

			if (sstop <= stop)

				obj.setDIRCTN(Data.toUnsigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setPADBDRY(Data.toUnsigned(buffer, pos + 1, sstop));

		}

		{
			int sstop = pos + 2;

			if (sstop <= stop)

				obj.setPADALMT(Data.toUnsigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	FNNRG _FNNRG(byte[] buffer, int pos, int stop) {
		FNNRG obj = AfplibFactory.eINSTANCE.createFNNRG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setGCGID(new String(buffer, pos + 0, sstop - pos - 0 + 1,
						charset));

		}

		{
			int sstop = pos + 11;

			if (sstop <= stop)

				obj.setTSOffset(Data.toUnsigned(buffer, pos + 8, sstop));

		}

		return obj;
	}

	FNNRG2 _FNNRG2(byte[] buffer, int pos, int stop) {
		FNNRG2 obj = AfplibFactory.eINSTANCE.createFNNRG2();

		{
			int sstop = pos + 0;

			if (stop >= pos + 0) {

				obj.setTSIDLen(Data.toUnsigned(buffer, pos + 0, sstop));

			}

		}

		{
			int sstop = pos + 32768;

			if (stop >= pos + 1) {
				sstop = stop;

				obj.setTSID(Arrays.copyOfRange(buffer, pos + 1, sstop + 1));

			}

		}

		return obj;
	}

	GCBEZRG _GCBEZRG(byte[] buffer, int pos, int stop) {
		GCBEZRG obj = AfplibFactory.eINSTANCE.createGCBEZRG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setXPOS(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setYPOS(Data.toSigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	GCCBEZRG _GCCBEZRG(byte[] buffer, int pos, int stop) {
		GCCBEZRG obj = AfplibFactory.eINSTANCE.createGCCBEZRG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setXPOS(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setYPOS(Data.toSigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	GFLTRG _GFLTRG(byte[] buffer, int pos, int stop) {
		GFLTRG obj = AfplibFactory.eINSTANCE.createGFLTRG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setXPOS(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setYPOS(Data.toSigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	GCFLTRG _GCFLTRG(byte[] buffer, int pos, int stop) {
		GCFLTRG obj = AfplibFactory.eINSTANCE.createGCFLTRG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setXPOS(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setYPOS(Data.toSigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	GLINERG _GLINERG(byte[] buffer, int pos, int stop) {
		GLINERG obj = AfplibFactory.eINSTANCE.createGLINERG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setXPOS(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setYPOS(Data.toSigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	GCLINERG _GCLINERG(byte[] buffer, int pos, int stop) {
		GCLINERG obj = AfplibFactory.eINSTANCE.createGCLINERG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setXPOS(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setYPOS(Data.toSigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	GMRKRG _GMRKRG(byte[] buffer, int pos, int stop) {
		GMRKRG obj = AfplibFactory.eINSTANCE.createGMRKRG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setXPOS(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setYPOS(Data.toSigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	GCMRKRG _GCMRKRG(byte[] buffer, int pos, int stop) {
		GCMRKRG obj = AfplibFactory.eINSTANCE.createGCMRKRG();

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setXPOS(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 3;

			if (sstop <= stop)

				obj.setYPOS(Data.toSigned(buffer, pos + 2, sstop));

		}

		return obj;
	}

	GRLINERG _GRLINERG(byte[] buffer, int pos, int stop) {
		GRLINERG obj = AfplibFactory.eINSTANCE.createGRLINERG();

		{
			int sstop = pos + 0;

			if (sstop <= stop)

				obj.setXOSSF(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setYOFFS(Data.toSigned(buffer, pos + 1, sstop));

		}

		return obj;
	}

	GCRLINERG _GCRLINERG(byte[] buffer, int pos, int stop) {
		GCRLINERG obj = AfplibFactory.eINSTANCE.createGCRLINERG();

		{
			int sstop = pos + 0;

			if (sstop <= stop)

				obj.setXOSSF(Data.toSigned(buffer, pos + 0, sstop));

		}

		{
			int sstop = pos + 1;

			if (sstop <= stop)

				obj.setYOFFS(Data.toSigned(buffer, pos + 1, sstop));

		}

		return obj;
	}

	MSURG _MSURG(byte[] buffer, int pos, int stop) {
		MSURG obj = AfplibFactory.eINSTANCE.createMSURG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setSUPname(new String(buffer, pos + 0, sstop - pos - 0 + 1,
						charset));

		}

		{
			int sstop = pos + 8;

			if (sstop <= stop)

				obj.setReserved(Arrays.copyOfRange(buffer, pos + 8, sstop + 1));

		}

		{
			int sstop = pos + 9;

			if (sstop <= stop)

				obj.setSUPid(Data.toUnsigned(buffer, pos + 9, sstop));

		}

		return obj;
	}

}
