
package org.afplib.io;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.afplib.CodepageHelper;
import org.afplib.Data;
import org.afplib.base.BaseFactory;
import org.afplib.base.SF;
import org.afplib.base.UNKNSF;
import org.afplib.base.Triplet;
import org.afplib.afplib.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

class StructuredFieldFactory extends AbstractStructuredFieldFactory {

	Charset charset = CodepageHelper.CHARSET_IBM500;
	Stack<Charset> charsets = new Stack<Charset>();
	FNC fnc;

	SF sf(byte[] buffer, int pos, int stop) {
		int id = Data.toUnsigned(buffer, pos + 3, pos + 5);
		SF sf;
		switch (id) {

			case 13871305 : {
				BAG obj = AfplibFactory.eINSTANCE.createBAG();

				charsets.push(charset);
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

						obj.setAEGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871339 : {
				BBC obj = AfplibFactory.eINSTANCE.createBBC();

				charsets.push(charset);
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

						obj.setBCdoName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871223 : {
				BCA obj = AfplibFactory.eINSTANCE.createBCA();

				charsets.push(charset);
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

						obj.setCATName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871242 : {
				BCF obj = AfplibFactory.eINSTANCE.createBCF();

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871239 : {
				BCP obj = AfplibFactory.eINSTANCE.createBCP();

				charsets.push(charset);
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

						obj.setRSName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

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

						obj.setData(Arrays.copyOfRange(buffer, pos + 14, sstop + 1));

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

						obj.setReserved(Data.toUnsigned(buffer, pos + 10, sstop));

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

						obj.setReserved2(Data.toUnsigned(buffer, pos + 19, sstop));

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

						obj.setMODULEWIDTH(Data.toUnsigned(buffer, pos + 26, sstop));

				}

				{
					int sstop = pos + 28;

					if (sstop <= stop)

						obj.setELEMENTHEIGHT(Data.toUnsigned(buffer, pos + 27, sstop));

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

				charsets.push(charset);
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

						obj.setDEGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871271 : {
				BDI obj = AfplibFactory.eINSTANCE.createBDI();

				charsets.push(charset);
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

						obj.setIndxName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871306 : {
				BDM obj = AfplibFactory.eINSTANCE.createBDM();

				charsets.push(charset);
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

						obj.setDMName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

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

				charsets.push(charset);
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

						obj.setDocName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setReserved(Data.toUnsigned(buffer, pos + 17, sstop));

				}

				sf = obj;
				break;
			}
			case 13871331 : {
				BDX obj = AfplibFactory.eINSTANCE.createBDX();

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setDMXName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871301 : {
				BFG obj = AfplibFactory.eINSTANCE.createBFG();

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setFEGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871309 : {
				BFM obj = AfplibFactory.eINSTANCE.createBFM();

				charsets.push(charset);
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

						obj.setFMName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871241 : {
				BFN obj = AfplibFactory.eINSTANCE.createBFN();

				charsets.push(charset);
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

						obj.setRSName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871291 : {
				BGR obj = AfplibFactory.eINSTANCE.createBGR();

				charsets.push(charset);
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

						obj.setGdoName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871227 : {
				BII obj = AfplibFactory.eINSTANCE.createBII();

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setImoName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871355 : {
				BIM obj = AfplibFactory.eINSTANCE.createBIM();

				charsets.push(charset);
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

						obj.setIdoName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871308 : {
				BMM obj = AfplibFactory.eINSTANCE.createBMM();

				charsets.push(charset);
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

						obj.setMMName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871327 : {
				BMO obj = AfplibFactory.eINSTANCE.createBMO();

				charsets.push(charset);
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

						obj.setOvlyName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871277 : {
				BNG obj = AfplibFactory.eINSTANCE.createBNG();

				charsets.push(charset);
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

						obj.setPGrpName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871250 : {
				BOC obj = AfplibFactory.eINSTANCE.createBOC();

				charsets.push(charset);
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

						obj.setObjCName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871303 : {
				BOG obj = AfplibFactory.eINSTANCE.createBOG();

				charsets.push(charset);
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

						obj.setOEGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871269 : {
				BPF obj = AfplibFactory.eINSTANCE.createBPF();

				charsets.push(charset);
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

						obj.setPFName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871279 : {
				BPG obj = AfplibFactory.eINSTANCE.createBPG();

				charsets.push(charset);
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

						obj.setPageName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871307 : {
				BPM obj = AfplibFactory.eINSTANCE.createBPM();

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setPMName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871199 : {
				BPS obj = AfplibFactory.eINSTANCE.createBPS();

				charsets.push(charset);
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

						obj.setPsegName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871259 : {
				BPT obj = AfplibFactory.eINSTANCE.createBPT();

				charsets.push(charset);
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

						obj.setPTdoName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871302 : {
				BRG obj = AfplibFactory.eINSTANCE.createBRG();

				charsets.push(charset);
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

						obj.setRGrpName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871310 : {
				BRS obj = AfplibFactory.eINSTANCE.createBRS();

				charsets.push(charset);
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

						obj.setRSName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871321 : {
				BSG obj = AfplibFactory.eINSTANCE.createBSG();

				charsets.push(charset);
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

						obj.setREGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

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

						obj.setCATData(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

						obj.setXocUnits(Data.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYocUnits(Data.toUnsigned(buffer, pos + 13, sstop));

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

						obj.setRetired1(Data.toUnsigned(buffer, pos + 10, sstop));

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

						CFIRG(obj.getFixedLengthRG(), buffer, pos + 9, sstop, 25);

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

						obj.setDefCharID(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 17;

					if (sstop <= stop)

						obj.setPrtFlags(Data.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setCPIRGLen(Data.toUnsigned(buffer, pos + 18, sstop));

				}

				{
					int sstop = pos + 19;

					if (sstop <= stop)

						obj.setVSCharSN(Data.toUnsigned(buffer, pos + 19, sstop));

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

						obj.setCPDesc(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 42;

					if (sstop <= stop)

						obj.setGCGIDLen(Data.toUnsigned(buffer, pos + 41, sstop));

				}

				{
					int sstop = pos + 46;

					if (sstop <= stop)

						obj.setNumCdPts(Data.toUnsigned(buffer, pos + 43, sstop));

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

						obj.setEncScheme(Data.toUnsigned(buffer, pos + 51, sstop));

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

						obj.setConData(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setAEGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871595 : {
				EBC obj = AfplibFactory.eINSTANCE.createEBC();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setBCdoName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871479 : {
				ECA obj = AfplibFactory.eINSTANCE.createECA();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setCATName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871498 : {
				ECF obj = AfplibFactory.eINSTANCE.createECF();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871495 : {
				ECP obj = AfplibFactory.eINSTANCE.createECP();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871556 : {
				EDG obj = AfplibFactory.eINSTANCE.createEDG();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setDEGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871527 : {
				EDI obj = AfplibFactory.eINSTANCE.createEDI();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setIndxName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871562 : {
				EDM obj = AfplibFactory.eINSTANCE.createEDM();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setDMName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871528 : {
				EDT obj = AfplibFactory.eINSTANCE.createEDT();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setDocName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871587 : {
				EDX obj = AfplibFactory.eINSTANCE.createEDX();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setDMXName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871557 : {
				EFG obj = AfplibFactory.eINSTANCE.createEFG();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setFEGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871565 : {
				EFM obj = AfplibFactory.eINSTANCE.createEFM();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setFMName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871497 : {
				EFN obj = AfplibFactory.eINSTANCE.createEFN();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				this.fnc = null;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871547 : {
				EGR obj = AfplibFactory.eINSTANCE.createEGR();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setGdoName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871483 : {
				EII obj = AfplibFactory.eINSTANCE.createEII();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setImoName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871611 : {
				EIM obj = AfplibFactory.eINSTANCE.createEIM();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setIdoName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871564 : {
				EMM obj = AfplibFactory.eINSTANCE.createEMM();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setMMName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871583 : {
				EMO obj = AfplibFactory.eINSTANCE.createEMO();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setOvlyName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871533 : {
				ENG obj = AfplibFactory.eINSTANCE.createENG();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setPGrpName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871506 : {
				EOC obj = AfplibFactory.eINSTANCE.createEOC();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setObjCName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871559 : {
				EOG obj = AfplibFactory.eINSTANCE.createEOG();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setOEGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871525 : {
				EPF obj = AfplibFactory.eINSTANCE.createEPF();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setPFName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871535 : {
				EPG obj = AfplibFactory.eINSTANCE.createEPG();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setPageName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871563 : {
				EPM obj = AfplibFactory.eINSTANCE.createEPM();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setPMName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				sf = obj;
				break;
			}
			case 13871455 : {
				EPS obj = AfplibFactory.eINSTANCE.createEPS();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setPsegName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871515 : {
				EPT obj = AfplibFactory.eINSTANCE.createEPT();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setPTdoName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871558 : {
				ERG obj = AfplibFactory.eINSTANCE.createERG();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
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

						obj.setRGrpName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871566 : {
				ERS obj = AfplibFactory.eINSTANCE.createERS();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setRSName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13871577 : {
				ESG obj = AfplibFactory.eINSTANCE.createESG();

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				{
					int sstop = pos + 16;

					if (stop >= pos + 16) {

						obj.setREGName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

					}

				}

				sf = obj;
				break;
			}
			case 13870985 : {
				FNC obj = AfplibFactory.eINSTANCE.createFNC();

				this.fnc = (FNC) obj;

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

						obj.setReserved1(Arrays.copyOfRange(buffer, pos + 11, sstop + 1));

				}

				{
					int sstop = pos + 12;

					if (sstop <= stop)

						obj.setFntFlags(Data.toUnsigned(buffer, pos + 12, sstop));

				}

				{
					int sstop = pos + 13;

					if (sstop <= stop)

						obj.setXUnitBase(Data.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYUnitBase(Data.toUnsigned(buffer, pos + 14, sstop));

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setXftUnits(Data.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setYftUnits(Data.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setMaxBoxWd(Data.toUnsigned(buffer, pos + 19, sstop));

				}

				{
					int sstop = pos + 22;

					if (sstop <= stop)

						obj.setMaxBoxHt(Data.toUnsigned(buffer, pos + 21, sstop));

				}

				{
					int sstop = pos + 23;

					if (sstop <= stop)

						obj.setFNORGLen(Data.toUnsigned(buffer, pos + 23, sstop));

				}

				{
					int sstop = pos + 24;

					if (sstop <= stop)

						obj.setFNIRGLen(Data.toUnsigned(buffer, pos + 24, sstop));

				}

				{
					int sstop = pos + 25;

					if (sstop <= stop)

						obj.setPatAlign(Data.toUnsigned(buffer, pos + 25, sstop));

				}

				{
					int sstop = pos + 28;

					if (sstop <= stop)

						obj.setRPatDCnt(Data.toUnsigned(buffer, pos + 26, sstop));

				}

				{
					int sstop = pos + 29;

					if (sstop <= stop)

						obj.setFNPRGLen(Data.toUnsigned(buffer, pos + 29, sstop));

				}

				{
					int sstop = pos + 30;

					if (sstop <= stop)

						obj.setFNMRGLen(Data.toUnsigned(buffer, pos + 30, sstop));

				}

				{
					int sstop = pos + 31;

					if (stop >= pos + 31) {

						obj.setResXUBase(Data.toUnsigned(buffer, pos + 31, sstop));

					}

				}

				{
					int sstop = pos + 32;

					if (stop >= pos + 32) {

						obj.setResYUBase(Data.toUnsigned(buffer, pos + 32, sstop));

					}

				}

				{
					int sstop = pos + 34;

					if (stop >= pos + 34) {

						obj.setXfrUnits(Data.toUnsigned(buffer, pos + 33, sstop));

					}

				}

				{
					int sstop = pos + 36;

					if (stop >= pos + 36) {

						obj.setYfrUnits(Data.toUnsigned(buffer, pos + 35, sstop));

					}

				}

				{
					int sstop = pos + 40;

					if (stop >= pos + 40) {

						obj.setOPatDCnt(Data.toUnsigned(buffer, pos + 37, sstop));

					}

				}

				{
					int sstop = pos + 43;

					if (stop >= pos + 43) {

						obj.setReserved2(Arrays.copyOfRange(buffer, pos + 41, sstop + 1));

					}

				}

				{
					int sstop = pos + 44;

					if (stop >= pos + 44) {

						obj.setFNNRGLen(Data.toUnsigned(buffer, pos + 44, sstop));

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

						obj.setFNNMapCnt(Data.toUnsigned(buffer, pos + 49, sstop));

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

						obj.setTypeFcDesc(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 41;

					if (sstop <= stop)

						obj.setFtWtClass(Data.toUnsigned(buffer, pos + 41, sstop));

				}

				{
					int sstop = pos + 42;

					if (sstop <= stop)

						obj.setFtWdClass(Data.toUnsigned(buffer, pos + 42, sstop));

				}

				{
					int sstop = pos + 44;

					if (sstop <= stop)

						obj.setMaxPtSize(Data.toUnsigned(buffer, pos + 43, sstop));

				}

				{
					int sstop = pos + 46;

					if (sstop <= stop)

						obj.setNomPtSize(Data.toUnsigned(buffer, pos + 45, sstop));

				}

				{
					int sstop = pos + 48;

					if (sstop <= stop)

						obj.setMinPtSize(Data.toUnsigned(buffer, pos + 47, sstop));

				}

				{
					int sstop = pos + 50;

					if (sstop <= stop)

						obj.setMaxHSize(Data.toUnsigned(buffer, pos + 49, sstop));

				}

				{
					int sstop = pos + 52;

					if (sstop <= stop)

						obj.setNomHSize(Data.toUnsigned(buffer, pos + 51, sstop));

				}

				{
					int sstop = pos + 54;

					if (sstop <= stop)

						obj.setMinHSize(Data.toUnsigned(buffer, pos + 53, sstop));

				}

				{
					int sstop = pos + 55;

					if (sstop <= stop)

						obj.setDsnGenCls(Data.toUnsigned(buffer, pos + 55, sstop));

				}

				{
					int sstop = pos + 56;

					if (sstop <= stop)

						obj.setDsnSubCls(Data.toUnsigned(buffer, pos + 56, sstop));

				}

				{
					int sstop = pos + 57;

					if (sstop <= stop)

						obj.setDsnSpcGrp(Data.toUnsigned(buffer, pos + 57, sstop));

				}

				{
					int sstop = pos + 72;

					if (sstop <= stop)

						obj.setReserved1(Arrays.copyOfRange(buffer, pos + 58, sstop + 1));

				}

				{
					int sstop = pos + 74;

					if (sstop <= stop)

						obj.setFtDsFlags(Data.toUnsigned(buffer, pos + 73, sstop));

				}

				{
					int sstop = pos + 84;

					if (sstop <= stop)

						obj.setReserved2(Arrays.copyOfRange(buffer, pos + 75, sstop + 1));

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

						obj.setPatData(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

						FNIRG(obj.getRg(), buffer, pos + 9, sstop,
								fnc == null || fnc.getFNIRGLen() == null ? 28 : fnc.getFNIRGLen());

					}

				}

				sf = obj;
				break;
			}
			case 13872009 : {
				FNN obj = AfplibFactory.eINSTANCE.createFNN();

				{
					int sstop = pos + 32768;

					if (stop >= pos + 9) {
						sstop = stop;

						obj.setFNNData(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

					}

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

						obj.setGOCAdat(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

						obj.setGOCAdes(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

						obj.setXFilSize(Data.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setYFilSize(Data.toUnsigned(buffer, pos + 19, sstop));

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

						obj.setConData1(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

						obj.setConData2(Arrays.copyOfRange(buffer, pos + 31, sstop + 1));

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

						obj.setConData3(Arrays.copyOfRange(buffer, pos + 41, sstop + 1));

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

						obj.setMMPName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

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

						obj.setObjName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

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

						obj.setXoaOrent(Data.toUnsigned(buffer, pos + 25, sstop));

				}

				{
					int sstop = pos + 28;

					if (sstop <= stop)

						obj.setYoaOrent(Data.toUnsigned(buffer, pos + 27, sstop));

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

						obj.setXoaOrent(Data.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setYoaOrent(Data.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 26;

					if (sstop <= stop)

						obj.setConData1(Arrays.copyOfRange(buffer, pos + 19, sstop + 1));

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

						obj.setConData2(Arrays.copyOfRange(buffer, pos + 31, sstop + 1));

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

						obj.setIOCAdat(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

						obj.setPgName(new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

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

						obj.setOvlyName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

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

						obj.setOvlyOrent(Data.toUnsigned(buffer, pos + 23, sstop));

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

						obj.setPsegName(
								new String(buffer, pos + 9, sstop - pos - 9 + 1, CodepageHelper.CHARSET_IBM500));

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

						obj.setIMdata(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

						obj.setTxtOrent(Data.toUnsigned(buffer, pos + 15, sstop));

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

						obj.setSupName(
								new String(buffer, pos + 27, sstop - pos - 27 + 1, CodepageHelper.CHARSET_IBM500));

				}

				{
					int sstop = pos + 35;

					if (sstop <= stop)

						obj.setSOLid(Data.toUnsigned(buffer, pos + 35, sstop));

				}

				{
					int sstop = pos + 39;

					if (sstop <= stop)

						obj.setDataStrt(Data.toUnsigned(buffer, pos + 36, sstop));

				}

				{
					int sstop = pos + 41;

					if (sstop <= stop)

						obj.setDataLgth(Data.toUnsigned(buffer, pos + 40, sstop));

				}

				{
					int sstop = pos + 43;

					if (sstop <= stop)

						obj.setTxtColor(Data.toUnsigned(buffer, pos + 42, sstop));

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

						int length = Data.toUnsigned(buffer, pos + 13 + -4, pos + 13 + -4 - 1 + 1);
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

						obj.setPARAMETER1(Data.toUnsigned(buffer, pos + 10, sstop));

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

						int length = Data.toUnsigned(buffer, pos + 13 + -4, pos + 13 + -4 - 1 + 1);
						MPSRG(obj.getFixedLengthRG(), buffer, pos + 13, sstop, length);

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

						obj.setReserved(Arrays.copyOfRange(buffer, pos + 10, sstop + 1));

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

						obj.setUndfData(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

						obj.setRGLength(Data.toUnsigned(buffer, pos + 10, sstop));

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

						obj.setXoaOrent(Data.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setYoaOrent(Data.toUnsigned(buffer, pos + 19, sstop));

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

						obj.setXocaOrent(Data.toUnsigned(buffer, pos + 28, sstop));

				}

				{
					int sstop = pos + 31;

					if (sstop <= stop)

						obj.setYocaOrent(Data.toUnsigned(buffer, pos + 30, sstop));

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

						obj.setObjCdat(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

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

						obj.setXpgUnits(Data.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYpgUnits(Data.toUnsigned(buffer, pos + 13, sstop));

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

						obj.setReserved(Data.toUnsigned(buffer, pos + 21, sstop));

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

						obj.setXPUNITVL(Data.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYPUNITVL(Data.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 17;

					if (sstop <= stop)

						obj.setXPEXTENT(Data.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 20;

					if (sstop <= stop)

						obj.setYPEXTENT(Data.toUnsigned(buffer, pos + 18, sstop));

				}

				{
					int sstop = pos + 22;

					if (stop >= pos + 22) {

						obj.setRESERVED(Data.toUnsigned(buffer, pos + 21, sstop));

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

						obj.setXPUNITVL(Data.toUnsigned(buffer, pos + 11, sstop));

				}

				{
					int sstop = pos + 14;

					if (sstop <= stop)

						obj.setYPUNITVL(Data.toUnsigned(buffer, pos + 13, sstop));

				}

				{
					int sstop = pos + 16;

					if (sstop <= stop)

						obj.setXPEXTENT(Data.toUnsigned(buffer, pos + 15, sstop));

				}

				{
					int sstop = pos + 18;

					if (sstop <= stop)

						obj.setYPEXTENT(Data.toUnsigned(buffer, pos + 17, sstop));

				}

				{
					int sstop = pos + 20;

					if (stop >= pos + 20) {

						obj.setRESERVED(Data.toUnsigned(buffer, pos + 19, sstop));

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

						obj.setConData(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

				}

				sf = obj;
				break;
			}
			default :
				sf = BaseFactory.eINSTANCE.createUNKNSF();
				byte[] data = new byte[stop - pos + 1 + 2];
				System.arraycopy(buffer, pos, data, 0, stop - pos + 1 + 2);
				((UNKNSF) sf).setRawData(data);
				break;
		}
		sf.setId(id);
		return sf;
	}

	void triplet(List<Triplet> triplets, byte[] buffer, int start, int bufstop) {
		int pos = start;
		int number = 0;
		while (pos + 1 <= bufstop) {
			int length = buffer[pos] & 0xff;
			if (length == 0)
				break;
			int id = buffer[pos + 1] & 0xff;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;

			switch (id) {

				case 128 : {
					AttributeQualifier obj = AfplibFactory.eINSTANCE.createAttributeQualifier();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setSeqNum(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setLevNum(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 54 : {
					AttributeValue obj = AfplibFactory.eINSTANCE.createAttributeValue();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setReserved0(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 4)

							obj.setAttVal(new String(buffer, pos + 4, sstop - pos - 4 + 1, charset));

					}

					triplets.add(obj);

					break;
				}

				case 1 : {
					CGCSGID obj = AfplibFactory.eINSTANCE.createCGCSGID();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setGCSGID(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setCPGID(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					charset = CodepageHelper.getCharset(obj.getCPGID(), obj.getGCSGID());

					break;
				}

				case 99 : {
					CRCResourceManagement obj = AfplibFactory.eINSTANCE.createCRCResourceManagement();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFmtQual(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setRMValue(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setResClassFlg(Data.toUnsigned(buffer, pos + 5, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 38 : {
					CharacterRotation obj = AfplibFactory.eINSTANCE.createCharacterRotation();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setCharRot(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 78 : {
					ColorSpecification obj = AfplibFactory.eINSTANCE.createColorSpecification();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setColSpce(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setColSize1(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setColSize2(Data.toUnsigned(buffer, pos + 9, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setColSize3(Data.toUnsigned(buffer, pos + 10, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setColSize4(Data.toUnsigned(buffer, pos + 11, sstop));

					}

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 12)

							obj.setColor(Arrays.copyOfRange(buffer, pos + 12, sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 101 : {
					Comment obj = AfplibFactory.eINSTANCE.createComment();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

							obj.setComment(new String(buffer, pos + 2, sstop - pos - 2 + 1, charset));

					}

					triplets.add(obj);

					break;
				}

				case 139 : {
					DataObjectFontDescriptor obj = AfplibFactory.eINSTANCE.createDataObjectFontDescriptor();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setDOFtFlgs(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFontTech(Data.toUnsigned(buffer, pos + 3, sstop));

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

							obj.setCharRot(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setEncEnv(Data.toUnsigned(buffer, pos + 10, sstop));

					}

					{
						int sstop = pos + 13;

						if (sstop <= stop)

							obj.setEncID(Data.toUnsigned(buffer, pos + 12, sstop));

					}

					{
						int sstop = pos + 15;

						if (sstop <= stop)

							obj.setReserved(Arrays.copyOfRange(buffer, pos + 14, sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 67 : {
					DescriptorPosition obj = AfplibFactory.eINSTANCE.createDescriptorPosition();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setDesPosID(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 80 : {
					EncodingSchemeID obj = AfplibFactory.eINSTANCE.createEncodingSchemeID();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setESidCP(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (stop >= pos + 5) {

							obj.setESidUD(Data.toUnsigned(buffer, pos + 4, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 132 : {
					FontResolution obj = AfplibFactory.eINSTANCE.createFontResolution();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setMetTech(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setRPuBase(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setRPUnits(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 2 : {
					FullyQualifiedName obj = AfplibFactory.eINSTANCE.createFullyQualifiedName();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFQNType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFQNFormat(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 4)

							obj.setFQName(new String(buffer, pos + 4, sstop - pos - 4 + 1, charset));

					}

					triplets.add(obj);

					if (obj.getFQNType() == FullyQualifiedNameFQNType.CONST_DATA_OBJECT_INTERNAL_RESOURCE_REFERENCE_VALUE) {

						if (stop >= pos + 4) {
							Integer lid = Data.toUnsigned(buffer, pos + 4, pos + 4);
							obj.setFQName(lid.toString());
						}

					}

					break;
				}

				case 98 : {
					LocalDateAndTimeStamp obj = AfplibFactory.eINSTANCE.createLocalDateAndTimeStamp();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStampType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setTHunYear(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setTenYear(Data.toUnsigned(buffer, pos + 4, sstop));

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

							obj.setMinute(Data.toUnsigned(buffer, pos + 11, sstop));

					}

					{
						int sstop = pos + 14;

						if (sstop <= stop)

							obj.setSecond(Data.toUnsigned(buffer, pos + 13, sstop));

					}

					{
						int sstop = pos + 16;

						if (sstop <= stop)

							obj.setHundSec(Data.toUnsigned(buffer, pos + 15, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 114 : {
					UniversalDateAndTimeStamp obj = AfplibFactory.eINSTANCE.createUniversalDateAndTimeStamp();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setReserved(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setYearAD(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setMonth(Data.toUnsigned(buffer, pos + 5, sstop));

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

							obj.setMinute(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setSecond(Data.toUnsigned(buffer, pos + 9, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setTimeZone(Data.toUnsigned(buffer, pos + 10, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setUTCDiffH(Data.toUnsigned(buffer, pos + 11, sstop));

					}

					{
						int sstop = pos + 12;

						if (sstop <= stop)

							obj.setUTCDiffM(Data.toUnsigned(buffer, pos + 12, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 4 : {
					MappingOption obj = AfplibFactory.eINSTANCE.createMappingOption();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setMapValue(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 69 : {
					MediaEjectControl obj = AfplibFactory.eINSTANCE.createMediaEjectControl();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setReserved(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setEjCtrl(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 86 : {
					MediumMapPageNumber obj = AfplibFactory.eINSTANCE.createMediumMapPageNumber();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setPageNum(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 104 : {
					MediumOrientation obj = AfplibFactory.eINSTANCE.createMediumOrientation();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setMedOrient(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 75 : {
					MeasurementUnits obj = AfplibFactory.eINSTANCE.createMeasurementUnits();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setXoaBase(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setYoaBase(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setXoaUnits(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setYoaUnits(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 24 : {
					MODCAInterchangeSet obj = AfplibFactory.eINSTANCE.createMODCAInterchangeSet();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setIStype(Data.toUnsigned(buffer, pos + 2, sstop));

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
					ObjectAreaSize obj = AfplibFactory.eINSTANCE.createObjectAreaSize();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setSizeType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setXoaSize(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setYoaSize(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 16 : {
					ObjectClassification obj = AfplibFactory.eINSTANCE.createObjectClassification();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setObjClass(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setStrucFlgs(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 23;

						if (sstop <= stop)

							obj.setRegObjId(Arrays.copyOfRange(buffer, pos + 8, sstop + 1));

					}

					{
						int sstop = pos + 55;

						if (stop >= pos + 55) {

							obj.setObjTpName(new String(buffer, pos + 24, sstop - pos - 24 + 1, charset));

						}

					}

					{
						int sstop = pos + 63;

						if (stop >= pos + 63) {

							obj.setObjLev(new String(buffer, pos + 56, sstop - pos - 56 + 1, charset));

						}

					}

					{
						int sstop = pos + 95;

						if (stop >= pos + 95) {

							obj.setCompName(new String(buffer, pos + 64, sstop - pos - 64 + 1, charset));

						}

					}

					triplets.add(obj);

					break;
				}

				case -33 : {
					ObjectFunctionSetSpecification obj = AfplibFactory.eINSTANCE.createObjectFunctionSetSpecification();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setObjType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setArchVrsn(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setDCAFnSet(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setOCAFnSet(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 90 : {
					ObjectOffset obj = AfplibFactory.eINSTANCE.createObjectOffset();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setObjTpe(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setObjOset(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 11;

						if (stop >= pos + 11) {

							obj.setObjOstHi(Data.toUnsigned(buffer, pos + 8, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 33 : {
					ResourceObjectType obj = AfplibFactory.eINSTANCE.createResourceObjectType();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setObjType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setConData(Arrays.copyOfRange(buffer, pos + 3, sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 129 : {
					PagePositionInformation obj = AfplibFactory.eINSTANCE.createPagePositionInformation();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setPGPRG(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 131 : {
					PresentationControl obj = AfplibFactory.eINSTANCE.createPresentationControl();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setPRSFlg(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 112 : {
					PresentationSpaceResetMixing obj = AfplibFactory.eINSTANCE.createPresentationSpaceResetMixing();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setBgMxFlag(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 113 : {
					PresentationSpaceMixingRules obj = AfplibFactory.eINSTANCE.createPresentationSpaceMixingRules();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);

					break;
				}

				case 36 : {
					ResourceLocalIdentifier obj = AfplibFactory.eINSTANCE.createResourceLocalIdentifier();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setResType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setResLID(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 37 : {
					ResourceSectionNumber obj = AfplibFactory.eINSTANCE.createResourceSectionNumber();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setResSNum(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 29 : {
					TextOrientation obj = AfplibFactory.eINSTANCE.createTextOrientation();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setIAxis(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setBAxis(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 93 : {
					FontHorizontalScaleFactor obj = AfplibFactory.eINSTANCE.createFontHorizontalScaleFactor();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setHscale(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 31 : {
					FontDescriptorSpecification obj = AfplibFactory.eINSTANCE.createFontDescriptorSpecification();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFtWtClass(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFtWdClass(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setFtHeight(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setFtWidth(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setFtDsFlags(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 19;

						if (stop >= pos + 19) {

							obj.setFtUsFlags(Data.toUnsigned(buffer, pos + 19, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 116 : {
					TonerSaver obj = AfplibFactory.eINSTANCE.createTonerSaver();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setTSvCtrl(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 117 : {
					ColorFidelity obj = AfplibFactory.eINSTANCE.createColorFidelity();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpCoEx(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setRepCoEx(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setColSub(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 120 : {
					FontFidelity obj = AfplibFactory.eINSTANCE.createFontFidelity();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpFntEx(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 134 : {
					TextFidelity obj = AfplibFactory.eINSTANCE.createTextFidelity();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpTxtEx(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setRepTxtEx(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 135 : {
					MediaFidelity obj = AfplibFactory.eINSTANCE.createMediaFidelity();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpMedEx(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setReserved(Arrays.copyOfRange(buffer, pos + 3, sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 136 : {
					FinishingFidelity obj = AfplibFactory.eINSTANCE.createFinishingFidelity();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpFinEx(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setRepFinEx(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 150 : {
					CMRFidelity obj = AfplibFactory.eINSTANCE.createCMRFidelity();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setStpCMREx(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setRepCMREx(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 87 : {
					ObjectByteExtent obj = AfplibFactory.eINSTANCE.createObjectByteExtent();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setByteExt(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setByteExtHi(Data.toUnsigned(buffer, pos + 6, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 45 : {
					ObjectByteOffset obj = AfplibFactory.eINSTANCE.createObjectByteOffset();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setDirByOff(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setDirByHi(Data.toUnsigned(buffer, pos + 6, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 89 : {
					ObjectStructuredFieldExtent obj = AfplibFactory.eINSTANCE.createObjectStructuredFieldExtent();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setSFExt(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setSFExtHi(Data.toUnsigned(buffer, pos + 6, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 88 : {
					ObjectStructuredFieldOffset obj = AfplibFactory.eINSTANCE.createObjectStructuredFieldOffset();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setSFOff(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setSFOffHi(Data.toUnsigned(buffer, pos + 6, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 94 : {
					ObjectCount obj = AfplibFactory.eINSTANCE.createObjectCount();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setSubObj(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setSObjNum(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 11;

						if (stop >= pos + 11) {

							obj.setSobjNmHi(Data.toUnsigned(buffer, pos + 8, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 100 : {
					ObjectOriginIdentifier obj = AfplibFactory.eINSTANCE.createObjectOriginIdentifier();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setSystem(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setSysID(Arrays.copyOfRange(buffer, pos + 3, sstop + 1));

					}

					{
						int sstop = pos + 16;

						if (sstop <= stop)

							obj.setMedID(Arrays.copyOfRange(buffer, pos + 11, sstop + 1));

					}

					{
						int sstop = pos + 60;

						if (sstop <= stop)

							obj.setDSID(Arrays.copyOfRange(buffer, pos + 17, sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 39 : {
					LineDataObjectPositionMigration obj = AfplibFactory.eINSTANCE
							.createLineDataObjectPositionMigration();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setTempOrient(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 145 : {
					ColorManagementResourceDescriptor obj = AfplibFactory.eINSTANCE
							.createColorManagementResourceDescriptor();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setProcMode(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setCMRScpe(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 154 : {
					ImageResolution obj = AfplibFactory.eINSTANCE.createImageResolution();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setXBase(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYBase(Data.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setXResol(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setYResol(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 156 : {
					ObjectContainerPresentationSpaceSize obj = AfplibFactory.eINSTANCE
							.createObjectContainerPresentationSpaceSize();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setPDFSize(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 34 : {
					ExtendedResourceLocalIdentifier obj = AfplibFactory.eINSTANCE
							.createExtendedResourceLocalIdentifier();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setResType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setResLID(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 121 : {
					MetricAdjustment obj = AfplibFactory.eINSTANCE.createMetricAdjustment();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setUnitBase(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setXUPUB(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setYUPUB(Data.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setHUniformIncrement(Data.toSigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setVUniformIncrement(Data.toSigned(buffer, pos + 9, sstop));

					}

					{
						int sstop = pos + 12;

						if (sstop <= stop)

							obj.setHBaselineIncrement(Data.toSigned(buffer, pos + 11, sstop));

					}

					{
						int sstop = pos + 14;

						if (sstop <= stop)

							obj.setVBaselineIncrement(Data.toSigned(buffer, pos + 13, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 109 : {
					ExtensionFont obj = AfplibFactory.eINSTANCE.createExtensionFont();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setGCSGID(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 149 : {
					RenderingIntent obj = AfplibFactory.eINSTANCE.createRenderingIntent();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setReserved(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setIOCARI(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setOCRI(Data.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setPTOCRI(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setGOCARI(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setReserved2(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 32 : {
					FontCodedGraphicCharacterSetGlobalIdentifier obj = AfplibFactory.eINSTANCE
							.createFontCodedGraphicCharacterSetGlobalIdentifier();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setGCSGID(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setCPGID(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);

					break;
				}

				case 140 : {
					LocaleSelector obj = AfplibFactory.eINSTANCE.createLocaleSelector();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setLocFlgs(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setLangCode(new String(buffer, pos + 4, sstop - pos - 4 + 1, charset));

					}

					{
						int sstop = pos + 19;

						if (sstop <= stop)

							obj.setScrptCde(new String(buffer, pos + 12, sstop - pos - 12 + 1, charset));

					}

					{
						int sstop = pos + 27;

						if (sstop <= stop)

							obj.setRegCde(new String(buffer, pos + 20, sstop - pos - 20 + 1, charset));

					}

					{
						int sstop = pos + 35;

						if (sstop <= stop)

							obj.setReserved(Arrays.copyOfRange(buffer, pos + 28, sstop + 1));

					}

					{
						int sstop = pos + 32768;

						if (stop >= pos + 36) {
							sstop = stop;

							obj.setVarCde(new String(buffer, pos + 36, sstop - pos - 36 + 1, charset));

						}

					}

					triplets.add(obj);

					break;
				}

				case 133 : {
					FinishingOperation obj = AfplibFactory.eINSTANCE.createFinishingOperation();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFOpType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setRefEdge(Data.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setFOpCnt(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setAxOffst(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 32768;

						if (stop >= pos + 9) {
							sstop = stop;

							obj.setOpPos(Arrays.copyOfRange(buffer, pos + 9, sstop + 1));

						}

					}

					triplets.add(obj);

					break;
				}

				case 142 : {
					UP3iFinishingOperation obj = AfplibFactory.eINSTANCE.createUP3iFinishingOperation();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setSeqnum(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 256;

						sstop = stop;
						if (sstop >= pos + 4)

							obj.setUP3iDat(Arrays.copyOfRange(buffer, pos + 4, sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 151 : {
					DeviceAppearance obj = AfplibFactory.eINSTANCE.createDeviceAppearance();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setDevApp(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setReserved(Arrays.copyOfRange(buffer, pos + 5, sstop + 1));

					}

					triplets.add(obj);

					break;
				}

				case 108 : {
					ResourceObjectInclude obj = AfplibFactory.eINSTANCE.createResourceObjectInclude();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setObjType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setObjName(new String(buffer, pos + 3, sstop - pos - 3 + 1, charset));

					}

					{
						int sstop = pos + 13;

						if (sstop <= stop)

							obj.setXobjOset(Data.toSigned(buffer, pos + 11, sstop));

					}

					{
						int sstop = pos + 16;

						if (sstop <= stop)

							obj.setYobjOset(Data.toSigned(buffer, pos + 14, sstop));

					}

					{
						int sstop = pos + 18;

						if (stop >= pos + 18) {

							obj.setObOrent(Data.toUnsigned(buffer, pos + 17, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 70 : {
					PageOverlayConditionalProcessing obj = AfplibFactory.eINSTANCE
							.createPageOverlayConditionalProcessing();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setPgOvType(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (stop >= pos + 3) {

							obj.setLevel(Data.toUnsigned(buffer, pos + 3, sstop));

						}

					}

					triplets.add(obj);

					break;
				}

				case 71 : {
					ResourceUsageAttribute obj = AfplibFactory.eINSTANCE.createResourceUsageAttribute();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFrequency(Data.toUnsigned(buffer, pos + 2, sstop));

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
		int number = 0;

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

			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			length += lengthAddition;

			int stop = pos + length - 1;
			if (stop > bufstop)
				break;

			switch (id) {

				case 112 : {
					BeginSegment obj = AfplibFactory.eINSTANCE.createBeginSegment();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 5;

						if (stop >= pos + 5) {

							obj.setSEGNAME(Data.toUnsigned(buffer, pos + 2, sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 113 : {
					EndSegment obj = AfplibFactory.eINSTANCE.createEndSegment();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

				case 140 : {
					BeginTile obj = AfplibFactory.eINSTANCE.createBeginTile();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

				case 141 : {
					EndTile obj = AfplibFactory.eINSTANCE.createEndTile();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

				case 142 : {
					BeginTransparencyMask obj = AfplibFactory.eINSTANCE.createBeginTransparencyMask();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

				case 143 : {
					EndTransparencyMask obj = AfplibFactory.eINSTANCE.createEndTransparencyMask();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

				case 145 : {
					BeginImage obj = AfplibFactory.eINSTANCE.createBeginImage();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setOBJTYPE(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 147 : {
					EndImage obj = AfplibFactory.eINSTANCE.createEndImage();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

				case 148 : {
					ImageSize obj = AfplibFactory.eINSTANCE.createImageSize();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setUNITBASE(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setHRESOL(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setVRESOL(Data.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setHSIZE(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setVSIZE(Data.toUnsigned(buffer, pos + 9, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 149 : {
					ImageEncoding obj = AfplibFactory.eINSTANCE.createImageEncoding();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setCOMPRID(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setRECID(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 4;

						if (stop >= pos + 4) {

							obj.setBITORDR(Data.toUnsigned(buffer, pos + 4, sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 150 : {
					IDESize obj = AfplibFactory.eINSTANCE.createIDESize();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setIDESZ(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 151 : {
					ImageLUTID obj = AfplibFactory.eINSTANCE.createImageLUTID();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setLUTID(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 152 : {
					BandImage obj = AfplibFactory.eINSTANCE.createBandImage();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

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

							obj.setBCOUNT(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 155 : {
					IDEStructure obj = AfplibFactory.eINSTANCE.createIDEStructure();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFLAGS(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFORMAT(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setSIZE1(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 8;

						if (stop >= pos + 8) {

							obj.setSIZE2(Data.toUnsigned(buffer, pos + 8, sstop));

						}

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setSIZE3(Data.toUnsigned(buffer, pos + 9, sstop));

						}

					}

					{
						int sstop = pos + 10;

						if (stop >= pos + 10) {

							obj.setSIZE4(Data.toUnsigned(buffer, pos + 10, sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 159 : {
					ExternalAlgorithm obj = AfplibFactory.eINSTANCE.createExternalAlgorithm();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 4)

						{

							ExternalAlgorithmRG(obj.getRg(), buffer, pos + 4, sstop, 3);

						}

					}

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setALGTYPE(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 181 : {
					TilePosition obj = AfplibFactory.eINSTANCE.createTilePosition();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setXOFFSET(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setYOFFSET(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 182 : {
					TileSize obj = AfplibFactory.eINSTANCE.createTileSize();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setTHSIZE(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setTVSIZE(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 10;

						if (stop >= pos + 10) {

							obj.setRELRES(Data.toUnsigned(buffer, pos + 10, sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 183 : {
					TileSetColor obj = AfplibFactory.eINSTANCE.createTileSetColor();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setCSPACE(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setRESERVED(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setSIZE1(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setSIZE2(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setSIZE3(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setSIZE4(Data.toUnsigned(buffer, pos + 9, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setCVAL1(Data.toUnsigned(buffer, pos + 10, sstop));

					}

					{
						int sstop = pos + 13;

						if (sstop <= stop)

							obj.setCVAL2(Data.toUnsigned(buffer, pos + 12, sstop));

					}

					{
						int sstop = pos + 15;

						if (sstop <= stop)

							obj.setCVAL3(Data.toUnsigned(buffer, pos + 14, sstop));

					}

					{
						int sstop = pos + 17;

						if (sstop <= stop)

							obj.setCVAL4(Data.toUnsigned(buffer, pos + 16, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 246 : {
					SetBiLevelImageColor obj = AfplibFactory.eINSTANCE.createSetBiLevelImageColor();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setAREA(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						sstop = stop;
						if (sstop >= pos + 3)

							obj.setReserved(Arrays.copyOfRange(buffer, pos + 3, sstop + 1));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setNAMECOLR(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 247 : {
					IOCAFunctionSetIdentification obj = AfplibFactory.eINSTANCE.createIOCAFunctionSetIdentification();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setCATEGORY(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setFCNSET(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 65170 : {
					ImageData obj = AfplibFactory.eINSTANCE.createImageData();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 4)

							obj.setDATA(Arrays.copyOfRange(buffer, pos + 4, sstop + 1));

					}

					triplets.add(obj);
					break;
				}

				case 65180 : {
					BandImageData obj = AfplibFactory.eINSTANCE.createBandImageData();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setBANDNUM(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setRESERVED(Data.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 32768;

						if (stop >= pos + 7) {
							sstop = stop;

							obj.setDATA(Arrays.copyOfRange(buffer, pos + 7, sstop + 1));

						}

					}

					triplets.add(obj);
					break;
				}

				case 65208 : {
					IncludeTile obj = AfplibFactory.eINSTANCE.createIncludeTile();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setTIRID(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 65230 : {
					ImageSubsampling obj = AfplibFactory.eINSTANCE.createImageSubsampling();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

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
					SamplingRatios obj = AfplibFactory.eINSTANCE.createSamplingRatios();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							SamplingRatiosRG(obj.getRg(), buffer, pos + 2, sstop, 2);

						}

					}

					triplets.add(obj);
					break;
				}

				case 65211 : {
					TileTOC obj = AfplibFactory.eINSTANCE.createTileTOC();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						if (stop >= pos + 6) {
							sstop = stop;

							{

								TileTOCRG(obj.getRg(), buffer, pos + 6, sstop, 26);

							}

						}

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setReserved(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);
					break;
				}

			}
			pos += length;
		}
	}

	void cmd(List<Triplet> triplets, byte[] buffer, int start, int bufstop) {
		int pos = start;
		int number = 0;

		while (pos + 1 <= bufstop) {

			int id = Data.toUnsigned(buffer, pos, pos);
			int length = 0;

			if (0x0 == id) {
				length = 1;
			} else if ((id & 0x88) == 0x08) {
				length = 2;
			} else if (id == 0xfe) {
				// unsupported
			} else {
				length = Data.toUnsigned(buffer, pos + 1, pos + 1) + 2;
			}

			int stop = pos + length - 1;
			if (stop > bufstop)
				break;

			switch (id) {

				case 112 : {
					BeginSegmentCommand obj = AfplibFactory.eINSTANCE.createBeginSegmentCommand();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setLENGTH(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setNAME(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setFLAG1(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setFLAG2(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setSEGL(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 13;

						if (sstop <= stop)

							obj.setPSNAME(new String(buffer, pos + 10, sstop - pos - 10 + 1, charset));

					}

					triplets.add(obj);
					break;
				}

				case 113 : {
					EndSegmentCommand obj = AfplibFactory.eINSTANCE.createEndSegmentCommand();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

				case 104 : {
					GBAR obj = AfplibFactory.eINSTANCE.createGBAR();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setFLAGS(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 209 : {
					GBIMG obj = AfplibFactory.eINSTANCE.createGBIMG();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setXPOS(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYPOS(Data.toSigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setFORMAT(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setRES(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setWIDTH(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setHEIGHT(Data.toUnsigned(buffer, pos + 10, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 145 : {
					GCBIMG obj = AfplibFactory.eINSTANCE.createGCBIMG();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFORMAT(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setRES(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setWIDTH(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setHEIGHT(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 192 : {
					GBOX obj = AfplibFactory.eINSTANCE.createGBOX();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setRES(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setXPOS0(Data.toSigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setYPOS0(Data.toSigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setXPOS1(Data.toSigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setYPOS1(Data.toSigned(buffer, pos + 10, sstop));

					}

					{
						int sstop = pos + 13;

						if (stop >= pos + 13) {

							obj.setHAXIS(Data.toUnsigned(buffer, pos + 12, sstop));

						}

					}

					{
						int sstop = pos + 15;

						if (stop >= pos + 15) {

							obj.setVAXIS(Data.toUnsigned(buffer, pos + 14, sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 128 : {
					GCBOX obj = AfplibFactory.eINSTANCE.createGCBOX();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setRES(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setXPOS1(Data.toSigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setYPOS1(Data.toSigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setHAXIS(Data.toUnsigned(buffer, pos + 8, sstop));

						}

					}

					{
						int sstop = pos + 11;

						if (stop >= pos + 11) {

							obj.setVAXIS(Data.toUnsigned(buffer, pos + 10, sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 195 : {
					GCHST obj = AfplibFactory.eINSTANCE.createGCHST();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setXPOS(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYPOS(Data.toSigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 32767;

						sstop = stop;
						if (sstop >= pos + 6)

							obj.setCP(new String(buffer, pos + 6, sstop - pos - 6 + 1, charset));

					}

					triplets.add(obj);
					break;
				}

				case 131 : {
					GCCHST obj = AfplibFactory.eINSTANCE.createGCCHST();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32767;

						sstop = stop;
						if (sstop >= pos + 2)

							obj.setCP(new String(buffer, pos + 2, sstop - pos - 2 + 1, charset));

					}

					triplets.add(obj);
					break;
				}

				case 1 : {
					GCOMT obj = AfplibFactory.eINSTANCE.createGCOMT();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32767;

						if (stop >= pos + 2) {
							sstop = stop;

							obj.setDATA(Arrays.copyOfRange(buffer, pos + 2, sstop + 1));

						}

					}

					triplets.add(obj);
					break;
				}

				case 96 : {
					GEAR obj = AfplibFactory.eINSTANCE.createGEAR();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32767;

						if (stop >= pos + 2) {
							sstop = stop;

							obj.setDATA(Arrays.copyOfRange(buffer, pos + 2, sstop + 1));

						}

					}

					triplets.add(obj);
					break;
				}

				case 147 : {
					GEIMG obj = AfplibFactory.eINSTANCE.createGEIMG();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32767;

						if (stop >= pos + 2) {
							sstop = stop;

							obj.setDATA(Arrays.copyOfRange(buffer, pos + 2, sstop + 1));

						}

					}

					triplets.add(obj);
					break;
				}

				case 62 : {
					GEPROL obj = AfplibFactory.eINSTANCE.createGEPROL();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setRES(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 197 : {
					GFLT obj = AfplibFactory.eINSTANCE.createGFLT();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							GFLTRG(obj.getRg(), buffer, pos + 2, sstop, 4);

						}

					}

					triplets.add(obj);
					break;
				}

				case 133 : {
					GCFLT obj = AfplibFactory.eINSTANCE.createGCFLT();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							GCFLTRG(obj.getRg(), buffer, pos + 2, sstop, 4);

						}

					}

					triplets.add(obj);
					break;
				}

				case 199 : {
					GFARC obj = AfplibFactory.eINSTANCE.createGFARC();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setXPOS(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYPOS(Data.toSigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setMH(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setMFR(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 135 : {
					GCFARC obj = AfplibFactory.eINSTANCE.createGCFARC();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setMH(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setMFR(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 146 : {
					GIMD obj = AfplibFactory.eINSTANCE.createGIMD();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3768;

						sstop = stop;
						if (sstop >= pos + 2)

							obj.setDATA(Arrays.copyOfRange(buffer, pos + 2, sstop + 1));

					}

					triplets.add(obj);
					break;
				}

				case 193 : {
					GLINE obj = AfplibFactory.eINSTANCE.createGLINE();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							GLINERG(obj.getRg(), buffer, pos + 2, sstop, 4);

						}

					}

					triplets.add(obj);
					break;
				}

				case 129 : {
					GCLINE obj = AfplibFactory.eINSTANCE.createGCLINE();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							GCLINERG(obj.getRg(), buffer, pos + 2, sstop, 4);

						}

					}

					triplets.add(obj);
					break;
				}

				case 194 : {
					GMRK obj = AfplibFactory.eINSTANCE.createGMRK();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							GMRKRG(obj.getRg(), buffer, pos + 2, sstop, 4);

						}

					}

					triplets.add(obj);
					break;
				}

				case 130 : {
					GCMRK obj = AfplibFactory.eINSTANCE.createGCMRK();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							GCMRKRG(obj.getRg(), buffer, pos + 2, sstop, 4);

						}

					}

					triplets.add(obj);
					break;
				}

				case 0 : {
					GNOP1 obj = AfplibFactory.eINSTANCE.createGNOP1();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

				case 227 : {
					GPARC obj = AfplibFactory.eINSTANCE.createGPARC();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setXPOS(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYPOS(Data.toSigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setXCENT(Data.toSigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setYCENT(Data.toSigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setMH(Data.toUnsigned(buffer, pos + 10, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setMFR(Data.toUnsigned(buffer, pos + 11, sstop));

					}

					{
						int sstop = pos + 15;

						if (sstop <= stop)

							obj.setSTART(Data.toSigned(buffer, pos + 12, sstop));

					}

					{
						int sstop = pos + 19;

						if (sstop <= stop)

							obj.setSWEEP(Data.toSigned(buffer, pos + 16, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 163 : {
					GCPARC obj = AfplibFactory.eINSTANCE.createGCPARC();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setXCENT(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYCENT(Data.toSigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 6;

						if (sstop <= stop)

							obj.setMH(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setMFR(Data.toUnsigned(buffer, pos + 7, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setSTART(Data.toSigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 15;

						if (sstop <= stop)

							obj.setSWEEP(Data.toSigned(buffer, pos + 12, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 225 : {
					GRLINE obj = AfplibFactory.eINSTANCE.createGRLINE();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 6)

						{

							GRLINERG(obj.getRg(), buffer, pos + 6, sstop, 2);

						}

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setXPOS(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYPOS(Data.toSigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 161 : {
					GCRLINE obj = AfplibFactory.eINSTANCE.createGCRLINE();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							GCRLINERG(obj.getRg(), buffer, pos + 2, sstop, 2);

						}

					}

					triplets.add(obj);
					break;
				}

				case 4 : {
					GSGCH obj = AfplibFactory.eINSTANCE.createGSGCH();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

				case 34 : {
					GSAP obj = AfplibFactory.eINSTANCE.createGSAP();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setP(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setQ(Data.toSigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setR(Data.toSigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setS(Data.toSigned(buffer, pos + 8, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 13 : {
					GSBMX obj = AfplibFactory.eINSTANCE.createGSBMX();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setMODE(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 52 : {
					GSCA obj = AfplibFactory.eINSTANCE.createGSCA();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setXPOS(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYPOS(Data.toSigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 51 : {
					GSCC obj = AfplibFactory.eINSTANCE.createGSCC();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setCELLWI(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setCELLHI(Data.toSigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 7;

						if (stop >= pos + 7) {

							obj.setCELLWFR(Data.toUnsigned(buffer, pos + 6, sstop));

						}

					}

					{
						int sstop = pos + 9;

						if (stop >= pos + 9) {

							obj.setCELLHFR(Data.toUnsigned(buffer, pos + 8, sstop));

						}

					}

					triplets.add(obj);
					break;
				}

				case 58 : {
					GSCD obj = AfplibFactory.eINSTANCE.createGSCD();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setDIRECTION(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 57 : {
					GSCR obj = AfplibFactory.eINSTANCE.createGSCR();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setPREC(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 56 : {
					GSCS obj = AfplibFactory.eINSTANCE.createGSCS();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setLCID(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 53 : {
					GSCH obj = AfplibFactory.eINSTANCE.createGSCH();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setHX(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setHY(Data.toSigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 10 : {
					GSCOL obj = AfplibFactory.eINSTANCE.createGSCOL();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setCOL(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 33 : {
					GSCP obj = AfplibFactory.eINSTANCE.createGSCP();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setXPOS(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setYPOS(Data.toSigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 38 : {
					GSECOL obj = AfplibFactory.eINSTANCE.createGSECOL();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setCOLOR(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 17 : {
					GSFLW obj = AfplibFactory.eINSTANCE.createGSFLW();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setMH(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setMFR(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 24 : {
					GSLT obj = AfplibFactory.eINSTANCE.createGSLT();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setLINETYPE(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 25 : {
					GSLW obj = AfplibFactory.eINSTANCE.createGSLW();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setMH(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 55 : {
					GSMC obj = AfplibFactory.eINSTANCE.createGSMC();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setCELLWI(Data.toSigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setCELLHI(Data.toSigned(buffer, pos + 4, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 59 : {
					GSMP obj = AfplibFactory.eINSTANCE.createGSMP();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setPREC(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 60 : {
					GSMS obj = AfplibFactory.eINSTANCE.createGSMS();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setLCID(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 41 : {
					GSMT obj = AfplibFactory.eINSTANCE.createGSMT();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setMCPT(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 12 : {
					GSMX obj = AfplibFactory.eINSTANCE.createGSMX();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setMODE(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 8 : {
					GSPS obj = AfplibFactory.eINSTANCE.createGSPS();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setLCID(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 40 : {
					GSPT obj = AfplibFactory.eINSTANCE.createGSPT();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setPATT(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 178 : {
					GSPCOL obj = AfplibFactory.eINSTANCE.createGSPCOL();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setRES1(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setCOLSPCE(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setRES2(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 8;

						if (sstop <= stop)

							obj.setCOLSIZE1(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setCOLSIZE2(Data.toUnsigned(buffer, pos + 9, sstop));

					}

					{
						int sstop = pos + 10;

						if (sstop <= stop)

							obj.setCOLSIZE3(Data.toUnsigned(buffer, pos + 10, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setCOLSIZE4(Data.toUnsigned(buffer, pos + 11, sstop));

					}

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 12)

							obj.setCOLVALUE(Arrays.copyOfRange(buffer, pos + 12, sstop + 1));

					}

					triplets.add(obj);
					break;
				}

				case 26 : {
					GSLE obj = AfplibFactory.eINSTANCE.createGSLE();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setLINEEND(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 27 : {
					GSLJ obj = AfplibFactory.eINSTANCE.createGSLJ();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 1;

						if (sstop <= stop)

							obj.setLINEJOIN(Data.toUnsigned(buffer, pos + 1, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 229 : {
					GCBEZ obj = AfplibFactory.eINSTANCE.createGCBEZ();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							GCBEZRG(obj.getRg(), buffer, pos + 2, sstop, 4);

						}

					}

					triplets.add(obj);
					break;
				}

				case 165 : {
					GCCBEZ obj = AfplibFactory.eINSTANCE.createGCCBEZ();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 32768;

						sstop = stop;
						if (sstop >= pos + 2)

						{

							GCCBEZRG(obj.getRg(), buffer, pos + 2, sstop, 4);

						}

					}

					triplets.add(obj);
					break;
				}

				case 246 : {
					WindowSpecification obj = AfplibFactory.eINSTANCE.createWindowSpecification();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					{
						int sstop = pos + 2;

						if (sstop <= stop)

							obj.setFLAGS(Data.toUnsigned(buffer, pos + 2, sstop));

					}

					{
						int sstop = pos + 3;

						if (sstop <= stop)

							obj.setRES3(Data.toUnsigned(buffer, pos + 3, sstop));

					}

					{
						int sstop = pos + 4;

						if (sstop <= stop)

							obj.setCFORMAT(Data.toUnsigned(buffer, pos + 4, sstop));

					}

					{
						int sstop = pos + 5;

						if (sstop <= stop)

							obj.setUBASE(Data.toUnsigned(buffer, pos + 5, sstop));

					}

					{
						int sstop = pos + 7;

						if (sstop <= stop)

							obj.setXRESOL(Data.toUnsigned(buffer, pos + 6, sstop));

					}

					{
						int sstop = pos + 9;

						if (sstop <= stop)

							obj.setYRESOL(Data.toUnsigned(buffer, pos + 8, sstop));

					}

					{
						int sstop = pos + 11;

						if (sstop <= stop)

							obj.setIMGXYRES(Data.toUnsigned(buffer, pos + 10, sstop));

					}

					{
						int sstop = pos + 13;

						if (sstop <= stop)

							obj.setXLWIND(Data.toSigned(buffer, pos + 12, sstop));

					}

					{
						int sstop = pos + 15;

						if (sstop <= stop)

							obj.setXRWIND(Data.toSigned(buffer, pos + 14, sstop));

					}

					{
						int sstop = pos + 17;

						if (sstop <= stop)

							obj.setYBWIND(Data.toSigned(buffer, pos + 16, sstop));

					}

					{
						int sstop = pos + 19;

						if (sstop <= stop)

							obj.setYTWIND(Data.toSigned(buffer, pos + 18, sstop));

					}

					triplets.add(obj);
					break;
				}

				case 247 : {
					DrawingOrderSubset obj = AfplibFactory.eINSTANCE.createDrawingOrderSubset();
					obj.setTripletId(id);
					obj.setTripletNumber(number++);
					obj.setTripletLength(length);
					obj.setFileOffset(pos);

					triplets.add(obj);
					break;
				}

			}
			pos += length;
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

						obj.setRWIDTHFRACTION(Data.toSigned(buffer, pos + 5, sstop));

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

						obj.setRWIDTHFRACTION(Data.toSigned(buffer, pos + 5, sstop));

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

						obj.setIGNDATA(Arrays.copyOfRange(buffer, pos + 1, sstop + 1));

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

						obj.setRPTDATA(new String(buffer, pos + 3, sstop - pos - 3 + 1, charset));

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

						obj.setCOLSIZE4(Data.toUnsigned(buffer, pos + 10, sstop));

				}

				{
					int sstop = pos + 14;

					if (stop >= pos + 11) {
						sstop = stop;

						obj.setCOLVALUE(Arrays.copyOfRange(buffer, pos + 11, sstop + 1));

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

						obj.setTRNDATA(Arrays.copyOfRange(buffer, pos + 1, sstop + 1));

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

	void CFIRG(List<CFIRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_CFIRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_CFIRG(byte[] buffer, int bstart, List<CFIRG> triplets) {
		int start = bstart;

		for (CFIRG obj : triplets) {
			int length = _CFIRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void CPIRG(List<CPIRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_CPIRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_CPIRG(byte[] buffer, int bstart, List<CPIRG> triplets) {
		int start = bstart;

		for (CPIRG obj : triplets) {
			int length = _CPIRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void FNIRG(List<FNIRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_FNIRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_FNIRG(byte[] buffer, int bstart, List<FNIRG> triplets) {
		int start = bstart;

		for (FNIRG obj : triplets) {
			int length = _FNIRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void FNMRG(List<FNMRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_FNMRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_FNMRG(byte[] buffer, int bstart, List<FNMRG> triplets) {
		int start = bstart;

		for (FNMRG obj : triplets) {
			int length = _FNMRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void FNORG(List<FNORG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_FNORG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_FNORG(byte[] buffer, int bstart, List<FNORG> triplets) {
		int start = bstart;

		for (FNORG obj : triplets) {
			int length = _FNORG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void FNPRG(List<FNPRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_FNPRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_FNPRG(byte[] buffer, int bstart, List<FNPRG> triplets) {
		int start = bstart;

		for (FNPRG obj : triplets) {
			int length = _FNPRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void LLERG(List<LLERG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_LLERG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_LLERG(byte[] buffer, int bstart, List<LLERG> triplets) {
		int start = bstart;

		for (LLERG obj : triplets) {
			int length = _LLERG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MBCRG(List<MBCRG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MBCRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MBCRG(byte[] buffer, int bstart, List<MBCRG> triplets) {
		int start = bstart;

		for (MBCRG obj : triplets) {
			int length = _MBCRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MCARG(List<MCARG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MCARG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MCARG(byte[] buffer, int bstart, List<MCARG> triplets) {
		int start = bstart;

		for (MCARG obj : triplets) {
			int length = _MCARG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MCCRG(List<MCCRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MCCRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MCCRG(byte[] buffer, int bstart, List<MCCRG> triplets) {
		int start = bstart;

		for (MCCRG obj : triplets) {
			int length = _MCCRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MCDRG(List<MCDRG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MCDRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MCDRG(byte[] buffer, int bstart, List<MCDRG> triplets) {
		int start = bstart;

		for (MCDRG obj : triplets) {
			int length = _MCDRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MCFRG(List<MCFRG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MCFRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MCFRG(byte[] buffer, int bstart, List<MCFRG> triplets) {
		int start = bstart;

		for (MCFRG obj : triplets) {
			int length = _MCFRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MCF1RG(List<MCF1RG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MCF1RG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MCF1RG(byte[] buffer, int bstart, List<MCF1RG> triplets) {
		int start = bstart;

		for (MCF1RG obj : triplets) {
			int length = _MCF1RG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MDRRG(List<MDRRG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MDRRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MDRRG(byte[] buffer, int bstart, List<MDRRG> triplets) {
		int start = bstart;

		for (MDRRG obj : triplets) {
			int length = _MDRRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MGORG(List<MGORG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MGORG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MGORG(byte[] buffer, int bstart, List<MGORG> triplets) {
		int start = bstart;

		for (MGORG obj : triplets) {
			int length = _MGORG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MIORG(List<MIORG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MIORG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MIORG(byte[] buffer, int bstart, List<MIORG> triplets) {
		int start = bstart;

		for (MIORG obj : triplets) {
			int length = _MIORG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MMCRG(List<MMCRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MMCRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MMCRG(byte[] buffer, int bstart, List<MMCRG> triplets) {
		int start = bstart;

		for (MMCRG obj : triplets) {
			int length = _MMCRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MMDRG(List<MMDRG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MMDRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MMDRG(byte[] buffer, int bstart, List<MMDRG> triplets) {
		int start = bstart;

		for (MMDRG obj : triplets) {
			int length = _MMDRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MMORG(List<MMORG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MMORG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MMORG(byte[] buffer, int bstart, List<MMORG> triplets) {
		int start = bstart;

		for (MMORG obj : triplets) {
			int length = _MMORG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MMTRG(List<MMTRG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MMTRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MMTRG(byte[] buffer, int bstart, List<MMTRG> triplets) {
		int start = bstart;

		for (MMTRG obj : triplets) {
			int length = _MMTRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MPGRG(List<MPGRG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MPGRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MPGRG(byte[] buffer, int bstart, List<MPGRG> triplets) {
		int start = bstart;

		for (MPGRG obj : triplets) {
			int length = _MPGRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MPORG(List<MPORG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_MPORG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MPORG(byte[] buffer, int bstart, List<MPORG> triplets) {
		int start = bstart;

		for (MPORG obj : triplets) {
			int length = _MPORG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MPSRG(List<MPSRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MPSRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MPSRG(byte[] buffer, int bstart, List<MPSRG> triplets) {
		int start = bstart;

		for (MPSRG obj : triplets) {
			int length = _MPSRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void MSURG(List<MSURG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_MSURG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_MSURG(byte[] buffer, int bstart, List<MSURG> triplets) {
		int start = bstart;

		for (MSURG obj : triplets) {
			int length = _MSURG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void PGPRG(List<PGPRG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_PGPRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_PGPRG(byte[] buffer, int bstart, List<PGPRG> triplets) {
		int start = bstart;

		for (PGPRG obj : triplets) {
			int length = _PGPRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void PPORG(List<PPORG> objs, byte[] buffer, int start, int bufstop, int lengthOffset, int lengthSize) {
		int pos = start;
		while (pos <= bufstop) {
			int length = Data.toUnsigned(buffer, pos + lengthOffset, pos + lengthOffset - 1 + lengthSize);
			if (length == 0)
				break;
			int stop = pos + length - 1;
			if (stop > bufstop)
				break;
			objs.add(_PPORG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_PPORG(byte[] buffer, int bstart, List<PPORG> triplets) {
		int start = bstart;

		for (PPORG obj : triplets) {
			int length = _PPORG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void BandImageRG(List<BandImageRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_BandImageRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_BandImageRG(byte[] buffer, int bstart, List<BandImageRG> triplets) {
		int start = bstart;

		for (BandImageRG obj : triplets) {
			int length = _BandImageRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void ExternalAlgorithmRG(List<ExternalAlgorithmRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_ExternalAlgorithmRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_ExternalAlgorithmRG(byte[] buffer, int bstart, List<ExternalAlgorithmRG> triplets) {
		int start = bstart;

		for (ExternalAlgorithmRG obj : triplets) {
			int length = _ExternalAlgorithmRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void SamplingRatiosRG(List<SamplingRatiosRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_SamplingRatiosRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_SamplingRatiosRG(byte[] buffer, int bstart, List<SamplingRatiosRG> triplets) {
		int start = bstart;

		for (SamplingRatiosRG obj : triplets) {
			int length = _SamplingRatiosRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void TileTOCRG(List<TileTOCRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_TileTOCRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_TileTOCRG(byte[] buffer, int bstart, List<TileTOCRG> triplets) {
		int start = bstart;

		for (TileTOCRG obj : triplets) {
			int length = _TileTOCRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GFLTRG(List<GFLTRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GFLTRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GFLTRG(byte[] buffer, int bstart, List<GFLTRG> triplets) {
		int start = bstart;

		for (GFLTRG obj : triplets) {
			int length = _GFLTRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GCFLTRG(List<GCFLTRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCFLTRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GCFLTRG(byte[] buffer, int bstart, List<GCFLTRG> triplets) {
		int start = bstart;

		for (GCFLTRG obj : triplets) {
			int length = _GCFLTRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GLINERG(List<GLINERG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GLINERG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GLINERG(byte[] buffer, int bstart, List<GLINERG> triplets) {
		int start = bstart;

		for (GLINERG obj : triplets) {
			int length = _GLINERG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GCLINERG(List<GCLINERG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCLINERG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GCLINERG(byte[] buffer, int bstart, List<GCLINERG> triplets) {
		int start = bstart;

		for (GCLINERG obj : triplets) {
			int length = _GCLINERG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GMRKRG(List<GMRKRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GMRKRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GMRKRG(byte[] buffer, int bstart, List<GMRKRG> triplets) {
		int start = bstart;

		for (GMRKRG obj : triplets) {
			int length = _GMRKRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GCMRKRG(List<GCMRKRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCMRKRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GCMRKRG(byte[] buffer, int bstart, List<GCMRKRG> triplets) {
		int start = bstart;

		for (GCMRKRG obj : triplets) {
			int length = _GCMRKRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GRLINERG(List<GRLINERG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GRLINERG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GRLINERG(byte[] buffer, int bstart, List<GRLINERG> triplets) {
		int start = bstart;

		for (GRLINERG obj : triplets) {
			int length = _GRLINERG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GCRLINERG(List<GCRLINERG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCRLINERG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GCRLINERG(byte[] buffer, int bstart, List<GCRLINERG> triplets) {
		int start = bstart;

		for (GCRLINERG obj : triplets) {
			int length = _GCRLINERG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GCBEZRG(List<GCBEZRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCBEZRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GCBEZRG(byte[] buffer, int bstart, List<GCBEZRG> triplets) {
		int start = bstart;

		for (GCBEZRG obj : triplets) {
			int length = _GCBEZRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	void GCCBEZRG(List<GCCBEZRG> objs, byte[] buffer, int start, int bufstop, int length) {
		if (length == 0)
			return;
		int pos = start;
		while (pos + length - 1 <= bufstop) {
			int stop = pos + length - 1;
			objs.add(_GCCBEZRG(buffer, pos, stop));
			pos += length;
		}
	}

	int binary_GCCBEZRG(byte[] buffer, int bstart, List<GCCBEZRG> triplets) {
		int start = bstart;

		for (GCCBEZRG obj : triplets) {
			int length = _GCCBEZRG(obj, buffer, start);
			start += length;
		}

		return start - bstart;
	}

	CPIRG _CPIRG(byte[] buffer, int pos, int stop) {
		CPIRG obj = AfplibFactory.eINSTANCE.createCPIRG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setGCGID(new String(buffer, pos + 0, sstop - pos - 0 + 1, charset));

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

	int _CPIRG(CPIRG obj, byte[] buffer, int start) {
		int length = 0;

		if (7 + 1 > length)
			length = 7 + 1;

		if (8 + 1 > length)
			length = 8 + 1;

		if (9 + 1 > length)
			length = 9 + 1;

		if (obj.getCount() != null) {

			if (10 + 1 > length)
				length = 10 + 1;

		}

		if (obj.getGCGID() != null) {

			if (obj.getGCGID() != null) {
				Saver.save(buffer, start + 0, start + 7, obj.getGCGID(), charset);
			}

			if (7 + 1 > length)
				length = 7 + 1;

		}

		if (obj.getPrtFlags() != null) {

			Saver.saveUnsigned(buffer, start + 8, start + 8, obj.getPrtFlags());

			if (8 + 1 > length)
				length = 8 + 1;

		}

		if (obj.getCodePoint() != null) {

			Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getCodePoint());

			if (9 + 1 > length)
				length = 9 + 1;

		}

		if (obj.getCount() != null) {

			Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getCount());

			if (10 + 1 > length)
				length = 10 + 1;

		}

		return length;
	}

	CFIRG _CFIRG(byte[] buffer, int pos, int stop) {
		CFIRG obj = AfplibFactory.eINSTANCE.createCFIRG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setFCSName(new String(buffer, pos + 0, sstop - pos - 0 + 1, charset));

		}

		{
			int sstop = pos + 15;

			if (sstop <= stop)

				obj.setCPName(new String(buffer, pos + 8, sstop - pos - 8 + 1, charset));

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

	int _CFIRG(CFIRG obj, byte[] buffer, int start) {
		int length = 0;

		if (7 + 1 > length)
			length = 7 + 1;

		if (15 + 1 > length)
			length = 15 + 1;

		if (17 + 1 > length)
			length = 17 + 1;

		if (19 + 1 > length)
			length = 19 + 1;

		if (24 + 1 > length)
			length = 24 + 1;

		if (obj.getFCSName() != null) {

			if (obj.getFCSName() != null) {
				Saver.save(buffer, start + 0, start + 7, obj.getFCSName(), charset);
			}

			if (7 + 1 > length)
				length = 7 + 1;

		}

		if (obj.getCPName() != null) {

			if (obj.getCPName() != null) {
				Saver.save(buffer, start + 8, start + 15, obj.getCPName(), charset);
			}

			if (15 + 1 > length)
				length = 15 + 1;

		}

		if (obj.getSVSize() != null) {

			Saver.saveUnsigned(buffer, start + 16, start + 17, obj.getSVSize());

			if (17 + 1 > length)
				length = 17 + 1;

		}

		if (obj.getSHScale() != null) {

			Saver.saveUnsigned(buffer, start + 18, start + 19, obj.getSHScale());

			if (19 + 1 > length)
				length = 19 + 1;

		}

		if (obj.getReserved() != null) {

			{
				int size = Saver.save(buffer, start + 20, obj.getReserved());
				if (20 + size > length)
					length = 20 + size;
			}

		}

		if (obj.getSection() != null) {

			Saver.saveUnsigned(buffer, start + 24, start + 24, obj.getSection());

			if (24 + 1 > length)
				length = 24 + 1;

		}

		return length;
	}

	FNIRG _FNIRG(byte[] buffer, int pos, int stop) {
		FNIRG obj = AfplibFactory.eINSTANCE.createFNIRG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setGCGID(new String(buffer, pos + 0, sstop - pos - 0 + 1, charset));

		}

		{
			int sstop = pos + 9;

			if (sstop <= stop)

				obj.setCharInc(Data.toUnsigned(buffer, pos + 8, sstop));

		}

		{
			int sstop = pos + 11;

			if (stop >= pos + 11) {

				obj.setAscendHt(Data.toSigned(buffer, pos + 10, sstop));

			}

		}

		{
			int sstop = pos + 13;

			if (stop >= pos + 13) {

				obj.setDescendDp(Data.toSigned(buffer, pos + 12, sstop));

			}

		}

		{
			int sstop = pos + 15;

			if (stop >= pos + 15) {

				obj.setReserved(Data.toUnsigned(buffer, pos + 14, sstop));

			}

		}

		{
			int sstop = pos + 17;

			if (stop >= pos + 17) {

				obj.setFNMCnt(Data.toUnsigned(buffer, pos + 16, sstop));

			}

		}

		{
			int sstop = pos + 19;

			if (stop >= pos + 19) {

				obj.setASpace(Data.toSigned(buffer, pos + 18, sstop));

			}

		}

		{
			int sstop = pos + 21;

			if (stop >= pos + 21) {

				obj.setBSpace(Data.toUnsigned(buffer, pos + 20, sstop));

			}

		}

		{
			int sstop = pos + 23;

			if (stop >= pos + 23) {

				obj.setCSpace(Data.toSigned(buffer, pos + 22, sstop));

			}

		}

		{
			int sstop = pos + 25;

			if (stop >= pos + 25) {

				obj.setReserved2(Data.toUnsigned(buffer, pos + 24, sstop));

			}

		}

		{
			int sstop = pos + 27;

			if (stop >= pos + 27) {

				obj.setBaseOset(Data.toSigned(buffer, pos + 26, sstop));

			}

		}

		return obj;
	}

	int _FNIRG(FNIRG obj, byte[] buffer, int start) {
		int length = 0;

		if (7 + 1 > length)
			length = 7 + 1;

		if (9 + 1 > length)
			length = 9 + 1;

		if (obj.getAscendHt() != null) {

			if (11 + 1 > length)
				length = 11 + 1;

		}

		if (obj.getDescendDp() != null) {

			if (13 + 1 > length)
				length = 13 + 1;

		}

		if (obj.getReserved() != null) {

			if (15 + 1 > length)
				length = 15 + 1;

		}

		if (obj.getFNMCnt() != null) {

			if (17 + 1 > length)
				length = 17 + 1;

		}

		if (obj.getASpace() != null) {

			if (19 + 1 > length)
				length = 19 + 1;

		}

		if (obj.getBSpace() != null) {

			if (21 + 1 > length)
				length = 21 + 1;

		}

		if (obj.getCSpace() != null) {

			if (23 + 1 > length)
				length = 23 + 1;

		}

		if (obj.getReserved2() != null) {

			if (25 + 1 > length)
				length = 25 + 1;

		}

		if (obj.getBaseOset() != null) {

			if (27 + 1 > length)
				length = 27 + 1;

		}

		if (obj.getGCGID() != null) {

			if (obj.getGCGID() != null) {
				Saver.save(buffer, start + 0, start + 7, obj.getGCGID(), charset);
			}

			if (7 + 1 > length)
				length = 7 + 1;

		}

		if (obj.getCharInc() != null) {

			Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getCharInc());

			if (9 + 1 > length)
				length = 9 + 1;

		}

		if (obj.getAscendHt() != null) {

			if (obj.getAscendHt() != null) {
				Saver.saveSigned(buffer, start + 10, start + 11, obj.getAscendHt());
			}

			if (11 + 1 > length)
				length = 11 + 1;

		}

		if (obj.getDescendDp() != null) {

			if (obj.getDescendDp() != null) {
				Saver.saveSigned(buffer, start + 12, start + 13, obj.getDescendDp());
			}

			if (13 + 1 > length)
				length = 13 + 1;

		}

		if (obj.getReserved() != null) {

			Saver.saveUnsigned(buffer, start + 14, start + 15, obj.getReserved());

			if (15 + 1 > length)
				length = 15 + 1;

		}

		if (obj.getFNMCnt() != null) {

			Saver.saveUnsigned(buffer, start + 16, start + 17, obj.getFNMCnt());

			if (17 + 1 > length)
				length = 17 + 1;

		}

		if (obj.getASpace() != null) {

			if (obj.getASpace() != null) {
				Saver.saveSigned(buffer, start + 18, start + 19, obj.getASpace());
			}

			if (19 + 1 > length)
				length = 19 + 1;

		}

		if (obj.getBSpace() != null) {

			Saver.saveUnsigned(buffer, start + 20, start + 21, obj.getBSpace());

			if (21 + 1 > length)
				length = 21 + 1;

		}

		if (obj.getCSpace() != null) {

			if (obj.getCSpace() != null) {
				Saver.saveSigned(buffer, start + 22, start + 23, obj.getCSpace());
			}

			if (23 + 1 > length)
				length = 23 + 1;

		}

		if (obj.getReserved2() != null) {

			Saver.saveUnsigned(buffer, start + 24, start + 25, obj.getReserved2());

			if (25 + 1 > length)
				length = 25 + 1;

		}

		if (obj.getBaseOset() != null) {

			if (obj.getBaseOset() != null) {
				Saver.saveSigned(buffer, start + 26, start + 27, obj.getBaseOset());
			}

			if (27 + 1 > length)
				length = 27 + 1;

		}

		return length;
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

	int _FNMRG(FNMRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (7 + 1 > length)
			length = 7 + 1;

		if (obj.getCharBoxWd() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getCharBoxWd());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getCharBoxHt() != null) {

			Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getCharBoxHt());

			if (3 + 1 > length)
				length = 3 + 1;

		}

		if (obj.getPatDOset() != null) {

			Saver.saveUnsigned(buffer, start + 4, start + 7, obj.getPatDOset());

			if (7 + 1 > length)
				length = 7 + 1;

		}

		return length;
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

	int _LLERG(LLERG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (2 + 1 > length)
			length = 2 + 1;

		{

			int size = binary_triplets(buffer, start + 3, obj.getTriplets());
			if (3 + size > length)
				length = 3 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getRGFunct() != null) {

			Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getRGFunct());

			if (2 + 1 > length)
				length = 2 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

				obj.setPsegName(new String(buffer, pos + 4, sstop - pos - 4 + 1, charset));

		}

		return obj;
	}

	int _MPSRG(MPSRG obj, byte[] buffer, int start) {
		int length = 0;

		if (3 + 1 > length)
			length = 3 + 1;

		if (11 + 1 > length)
			length = 11 + 1;

		if (obj.getReserved() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 3, obj.getReserved());

			if (3 + 1 > length)
				length = 3 + 1;

		}

		if (obj.getPsegName() != null) {

			if (obj.getPsegName() != null) {
				Saver.save(buffer, start + 4, start + 11, obj.getPsegName(), charset);
			}

			if (11 + 1 > length)
				length = 11 + 1;

		}

		return length;
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

	int _MCFRG(MCFRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MBCRG(MBCRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MCARG(MCARG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MCDRG(MCDRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MDRRG(MDRRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MGORG(MGORG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MIORG(MIORG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MMDRG(MMDRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MMTRG(MMTRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MPGRG(MPGRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _MPORG(MPORG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		{

			int size = binary_triplets(buffer, start + 2, obj.getTriplets());
			if (2 + size > length)
				length = 2 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _PPORG(PPORG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (2 + 1 > length)
			length = 2 + 1;

		if (5 + 1 > length)
			length = 5 + 1;

		if (8 + 1 > length)
			length = 8 + 1;

		if (11 + 1 > length)
			length = 11 + 1;

		{

			int size = binary_triplets(buffer, start + 12, obj.getTriplets());
			if (12 + size > length)
				length = 12 + size;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getRGLength());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getObjType() != null) {

			Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getObjType());

			if (2 + 1 > length)
				length = 2 + 1;

		}

		if (obj.getProcFlgs() != null) {

			Saver.saveUnsigned(buffer, start + 5, start + 5, obj.getProcFlgs());

			if (5 + 1 > length)
				length = 5 + 1;

		}

		if (obj.getXocaOset() != null) {

			if (obj.getXocaOset() != null) {
				Saver.saveSigned(buffer, start + 6, start + 8, obj.getXocaOset());
			}

			if (8 + 1 > length)
				length = 8 + 1;

		}

		if (obj.getYocaOset() != null) {

			if (obj.getYocaOset() != null) {
				Saver.saveSigned(buffer, start + 9, start + 11, obj.getYocaOset());
			}

			if (11 + 1 > length)
				length = 11 + 1;

		}

		if (obj.getTriplets() != null) {

		}

		return length;
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

	int _PGPRG(PGPRG obj, byte[] buffer, int start) {
		int length = 0;

		if (0 + 1 > length)
			length = 0 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (6 + 1 > length)
			length = 6 + 1;

		if (8 + 1 > length)
			length = 8 + 1;

		if (9 + 1 > length)
			length = 9 + 1;

		if (obj.getPgFlgs() != null) {

			if (10 + 1 > length)
				length = 10 + 1;

		}

		if (obj.getPMCid() != null) {

			if (11 + 1 > length)
				length = 11 + 1;

		}

		obj.setRGLength(length);

		if (obj.getRGLength() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 0, obj.getRGLength());

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getXmOset() != null) {

			if (obj.getXmOset() != null) {
				Saver.saveSigned(buffer, start + 1, start + 3, obj.getXmOset());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		if (obj.getYmOset() != null) {

			if (obj.getYmOset() != null) {
				Saver.saveSigned(buffer, start + 4, start + 6, obj.getYmOset());
			}

			if (6 + 1 > length)
				length = 6 + 1;

		}

		if (obj.getPGorient() != null) {

			Saver.saveUnsigned(buffer, start + 7, start + 8, obj.getPGorient());

			if (8 + 1 > length)
				length = 8 + 1;

		}

		if (obj.getSHside() != null) {

			Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getSHside());

			if (9 + 1 > length)
				length = 9 + 1;

		}

		if (obj.getPgFlgs() != null) {

			Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getPgFlgs());

			if (10 + 1 > length)
				length = 10 + 1;

		}

		if (obj.getPMCid() != null) {

			Saver.saveUnsigned(buffer, start + 11, start + 11, obj.getPMCid());

			if (11 + 1 > length)
				length = 11 + 1;

		}

		return length;
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

	int _MCCRG(MCCRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (5 + 1 > length)
			length = 5 + 1;

		if (obj.getStartnum() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getStartnum());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getStopnum() != null) {

			Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getStopnum());

			if (3 + 1 > length)
				length = 3 + 1;

		}

		if (obj.getMMCid() != null) {

			Saver.saveUnsigned(buffer, start + 5, start + 5, obj.getMMCid());

			if (5 + 1 > length)
				length = 5 + 1;

		}

		return length;
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

				obj.setOVLname(new String(buffer, pos + 4, sstop - pos - 4 + 1, charset));

		}

		return obj;
	}

	int _MMORG(MMORG obj, byte[] buffer, int start) {
		int length = 0;

		if (0 + 1 > length)
			length = 0 + 1;

		if (1 + 1 > length)
			length = 1 + 1;

		if (11 + 1 > length)
			length = 11 + 1;

		if (obj.getOVLid() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 0, obj.getOVLid());

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getFlags() != null) {

			Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getFlags());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getOVLname() != null) {

			if (obj.getOVLname() != null) {
				Saver.save(buffer, start + 4, start + 11, obj.getOVLname(), charset);
			}

			if (11 + 1 > length)
				length = 11 + 1;

		}

		return length;
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

	int _BandImageRG(BandImageRG obj, byte[] buffer, int start) {
		int length = 0;

		if (0 + 1 > length)
			length = 0 + 1;

		if (obj.getBITCNT() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 0, obj.getBITCNT());

			if (0 + 1 > length)
				length = 0 + 1;

		}

		return length;
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

				obj.setCFName(new String(buffer, pos + 4, sstop - pos - 4 + 1, charset));

		}

		{
			int sstop = pos + 19;

			if (sstop <= stop)

				obj.setCPName(new String(buffer, pos + 12, sstop - pos - 12 + 1, charset));

		}

		{
			int sstop = pos + 27;

			if (sstop <= stop)

				obj.setFCSName(new String(buffer, pos + 20, sstop - pos - 20 + 1, charset));

		}

		{
			int sstop = pos + 29;

			if (stop >= pos + 29) {

				obj.setCharRot(Data.toUnsigned(buffer, pos + 28, sstop));

			}

		}

		return obj;
	}

	int _MCF1RG(MCF1RG obj, byte[] buffer, int start) {
		int length = 0;

		if (0 + 1 > length)
			length = 0 + 1;

		if (2 + 1 > length)
			length = 2 + 1;

		if (11 + 1 > length)
			length = 11 + 1;

		if (19 + 1 > length)
			length = 19 + 1;

		if (27 + 1 > length)
			length = 27 + 1;

		if (obj.getCharRot() != null) {

			if (29 + 1 > length)
				length = 29 + 1;

		}

		if (obj.getCFLid() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 0, obj.getCFLid());

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getSectid() != null) {

			Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getSectid());

			if (2 + 1 > length)
				length = 2 + 1;

		}

		if (obj.getCFName() != null) {

			if (obj.getCFName() != null) {
				Saver.save(buffer, start + 4, start + 11, obj.getCFName(), charset);
			}

			if (11 + 1 > length)
				length = 11 + 1;

		}

		if (obj.getCPName() != null) {

			if (obj.getCPName() != null) {
				Saver.save(buffer, start + 12, start + 19, obj.getCPName(), charset);
			}

			if (19 + 1 > length)
				length = 19 + 1;

		}

		if (obj.getFCSName() != null) {

			if (obj.getFCSName() != null) {
				Saver.save(buffer, start + 20, start + 27, obj.getFCSName(), charset);
			}

			if (27 + 1 > length)
				length = 27 + 1;

		}

		if (obj.getCharRot() != null) {

			Saver.saveUnsigned(buffer, start + 28, start + 29, obj.getCharRot());

			if (29 + 1 > length)
				length = 29 + 1;

		}

		return length;
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

	int _MMCRG(MMCRG obj, byte[] buffer, int start) {
		int length = 0;

		if (0 + 1 > length)
			length = 0 + 1;

		if (1 + 1 > length)
			length = 1 + 1;

		if (obj.getKey() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 0, obj.getKey());

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getValue() != null) {

			Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getValue());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		return length;
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

	int _FNORG(FNORG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (5 + 1 > length)
			length = 5 + 1;

		if (7 + 1 > length)
			length = 7 + 1;

		if (9 + 1 > length)
			length = 9 + 1;

		if (11 + 1 > length)
			length = 11 + 1;

		if (12 + 1 > length)
			length = 12 + 1;

		if (13 + 1 > length)
			length = 13 + 1;

		if (15 + 1 > length)
			length = 15 + 1;

		if (17 + 1 > length)
			length = 17 + 1;

		if (19 + 1 > length)
			length = 19 + 1;

		if (21 + 1 > length)
			length = 21 + 1;

		if (23 + 1 > length)
			length = 23 + 1;

		if (25 + 1 > length)
			length = 25 + 1;

		if (obj.getReserved() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getReserved());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getCharRot() != null) {

			Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getCharRot());

			if (3 + 1 > length)
				length = 3 + 1;

		}

		if (obj.getMaxBOset() != null) {

			if (obj.getMaxBOset() != null) {
				Saver.saveSigned(buffer, start + 4, start + 5, obj.getMaxBOset());
			}

			if (5 + 1 > length)
				length = 5 + 1;

		}

		if (obj.getMaxCharInc() != null) {

			Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getMaxCharInc());

			if (7 + 1 > length)
				length = 7 + 1;

		}

		if (obj.getSpCharInc() != null) {

			Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getSpCharInc());

			if (9 + 1 > length)
				length = 9 + 1;

		}

		if (obj.getMaxBExt() != null) {

			Saver.saveUnsigned(buffer, start + 10, start + 11, obj.getMaxBExt());

			if (11 + 1 > length)
				length = 11 + 1;

		}

		if (obj.getOrntFlgs() != null) {

			Saver.saveUnsigned(buffer, start + 12, start + 12, obj.getOrntFlgs());

			if (12 + 1 > length)
				length = 12 + 1;

		}

		if (obj.getReserved2() != null) {

			Saver.saveUnsigned(buffer, start + 13, start + 13, obj.getReserved2());

			if (13 + 1 > length)
				length = 13 + 1;

		}

		if (obj.getEmSpInc() != null) {

			Saver.saveUnsigned(buffer, start + 14, start + 15, obj.getEmSpInc());

			if (15 + 1 > length)
				length = 15 + 1;

		}

		if (obj.getReserved3() != null) {

			Saver.saveUnsigned(buffer, start + 16, start + 17, obj.getReserved3());

			if (17 + 1 > length)
				length = 17 + 1;

		}

		if (obj.getFigSpInc() != null) {

			Saver.saveUnsigned(buffer, start + 18, start + 19, obj.getFigSpInc());

			if (19 + 1 > length)
				length = 19 + 1;

		}

		if (obj.getNomCharInc() != null) {

			Saver.saveUnsigned(buffer, start + 20, start + 21, obj.getNomCharInc());

			if (21 + 1 > length)
				length = 21 + 1;

		}

		if (obj.getDefBInc() != null) {

			Saver.saveUnsigned(buffer, start + 22, start + 23, obj.getDefBInc());

			if (23 + 1 > length)
				length = 23 + 1;

		}

		if (obj.getMinASp() != null) {

			Saver.saveUnsigned(buffer, start + 24, start + 25, obj.getMinASp());

			if (25 + 1 > length)
				length = 25 + 1;

		}

		return length;
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

				obj.setReserved2(Arrays.copyOfRange(buffer, pos + 10, sstop + 1));

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

	int _FNPRG(FNPRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (5 + 1 > length)
			length = 5 + 1;

		if (7 + 1 > length)
			length = 7 + 1;

		if (9 + 1 > length)
			length = 9 + 1;

		if (14 + 1 > length)
			length = 14 + 1;

		if (15 + 1 > length)
			length = 15 + 1;

		if (16 + 1 > length)
			length = 16 + 1;

		if (18 + 1 > length)
			length = 18 + 1;

		if (19 + 1 > length)
			length = 19 + 1;

		if (21 + 1 > length)
			length = 21 + 1;

		if (obj.getReserved() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 1, obj.getReserved());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getLcHeight() != null) {

			if (obj.getLcHeight() != null) {
				Saver.saveSigned(buffer, start + 2, start + 3, obj.getLcHeight());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		if (obj.getCapMHt() != null) {

			if (obj.getCapMHt() != null) {
				Saver.saveSigned(buffer, start + 4, start + 5, obj.getCapMHt());
			}

			if (5 + 1 > length)
				length = 5 + 1;

		}

		if (obj.getMaxAscHt() != null) {

			if (obj.getMaxAscHt() != null) {
				Saver.saveSigned(buffer, start + 6, start + 7, obj.getMaxAscHt());
			}

			if (7 + 1 > length)
				length = 7 + 1;

		}

		if (obj.getMaxDesDp() != null) {

			if (obj.getMaxDesDp() != null) {
				Saver.saveSigned(buffer, start + 8, start + 9, obj.getMaxDesDp());
			}

			if (9 + 1 > length)
				length = 9 + 1;

		}

		if (obj.getReserved2() != null) {

			if (obj.getReserved2() != null) {
				Saver.save(buffer, start + 10, start + 14, obj.getReserved2());
			}

			if (14 + 1 > length)
				length = 14 + 1;

		}

		if (obj.getRetired() != null) {

			Saver.saveUnsigned(buffer, start + 15, start + 15, obj.getRetired());

			if (15 + 1 > length)
				length = 15 + 1;

		}

		if (obj.getReserved3() != null) {

			Saver.saveUnsigned(buffer, start + 16, start + 16, obj.getReserved3());

			if (16 + 1 > length)
				length = 16 + 1;

		}

		if (obj.getUscoreWd() != null) {

			Saver.saveUnsigned(buffer, start + 17, start + 18, obj.getUscoreWd());

			if (18 + 1 > length)
				length = 18 + 1;

		}

		if (obj.getUscoreWdf() != null) {

			Saver.saveUnsigned(buffer, start + 19, start + 19, obj.getUscoreWdf());

			if (19 + 1 > length)
				length = 19 + 1;

		}

		if (obj.getUscorePos() != null) {

			if (obj.getUscorePos() != null) {
				Saver.saveSigned(buffer, start + 20, start + 21, obj.getUscorePos());
			}

			if (21 + 1 > length)
				length = 21 + 1;

		}

		return length;
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

	int _TileTOCRG(TileTOCRG obj, byte[] buffer, int start) {
		int length = 0;

		if (3 + 1 > length)
			length = 3 + 1;

		if (7 + 1 > length)
			length = 7 + 1;

		if (11 + 1 > length)
			length = 11 + 1;

		if (15 + 1 > length)
			length = 15 + 1;

		if (16 + 1 > length)
			length = 16 + 1;

		if (17 + 1 > length)
			length = 17 + 1;

		if (25 + 1 > length)
			length = 25 + 1;

		if (obj.getXOFFSET() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 3, obj.getXOFFSET());

			if (3 + 1 > length)
				length = 3 + 1;

		}

		if (obj.getYOFFSET() != null) {

			Saver.saveUnsigned(buffer, start + 4, start + 7, obj.getYOFFSET());

			if (7 + 1 > length)
				length = 7 + 1;

		}

		if (obj.getTHSIZE() != null) {

			Saver.saveUnsigned(buffer, start + 8, start + 11, obj.getTHSIZE());

			if (11 + 1 > length)
				length = 11 + 1;

		}

		if (obj.getTVSIZE() != null) {

			Saver.saveUnsigned(buffer, start + 12, start + 15, obj.getTVSIZE());

			if (15 + 1 > length)
				length = 15 + 1;

		}

		if (obj.getRELRES() != null) {

			Saver.saveUnsigned(buffer, start + 16, start + 16, obj.getRELRES());

			if (16 + 1 > length)
				length = 16 + 1;

		}

		if (obj.getCOMPR() != null) {

			Saver.saveUnsigned(buffer, start + 17, start + 17, obj.getCOMPR());

			if (17 + 1 > length)
				length = 17 + 1;

		}

		if (obj.getDATAPOS() != null) {

			Saver.saveUnsigned(buffer, start + 18, start + 25, obj.getDATAPOS());

			if (25 + 1 > length)
				length = 25 + 1;

		}

		return length;
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

	int _SamplingRatiosRG(SamplingRatiosRG obj, byte[] buffer, int start) {
		int length = 0;

		if (0 + 1 > length)
			length = 0 + 1;

		if (1 + 1 > length)
			length = 1 + 1;

		if (obj.getHSAMPLE() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 0, obj.getHSAMPLE());

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getVSAMPLE() != null) {

			Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getVSAMPLE());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		return length;
	}

	ExternalAlgorithmRG _ExternalAlgorithmRG(byte[] buffer, int pos, int stop) {
		ExternalAlgorithmRG obj = AfplibFactory.eINSTANCE.createExternalAlgorithmRG();

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

	int _ExternalAlgorithmRG(ExternalAlgorithmRG obj, byte[] buffer, int start) {
		int length = 0;

		if (0 + 1 > length)
			length = 0 + 1;

		if (1 + 1 > length)
			length = 1 + 1;

		if (2 + 1 > length)
			length = 2 + 1;

		if (obj.getDIRCTN() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 0, obj.getDIRCTN());

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getPADBDRY() != null) {

			Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getPADBDRY());

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getPADALMT() != null) {

			Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getPADALMT());

			if (2 + 1 > length)
				length = 2 + 1;

		}

		return length;
	}

	FNNRG _FNNRG(byte[] buffer, int pos, int stop) {
		FNNRG obj = AfplibFactory.eINSTANCE.createFNNRG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setGCGID(new String(buffer, pos + 0, sstop - pos - 0 + 1, charset));

		}

		{
			int sstop = pos + 11;

			if (sstop <= stop)

				obj.setTSOffset(Data.toUnsigned(buffer, pos + 8, sstop));

		}

		return obj;
	}

	int _FNNRG(FNNRG obj, byte[] buffer, int start) {
		int length = 0;

		if (7 + 1 > length)
			length = 7 + 1;

		if (11 + 1 > length)
			length = 11 + 1;

		if (obj.getGCGID() != null) {

			if (obj.getGCGID() != null) {
				Saver.save(buffer, start + 0, start + 7, obj.getGCGID(), charset);
			}

			if (7 + 1 > length)
				length = 7 + 1;

		}

		if (obj.getTSOffset() != null) {

			Saver.saveUnsigned(buffer, start + 8, start + 11, obj.getTSOffset());

			if (11 + 1 > length)
				length = 11 + 1;

		}

		return length;
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

	int _FNNRG2(FNNRG2 obj, byte[] buffer, int start) {
		int length = 0;

		if (obj.getTSIDLen() != null) {

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getTSID() != null) {

		}

		if (obj.getTSIDLen() != null) {

			Saver.saveUnsigned(buffer, start + 0, start + 0, obj.getTSIDLen());

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getTSID() != null) {

			{
				int size = Saver.save(buffer, start + 1, obj.getTSID());
				if (1 + size > length)
					length = 1 + size;
			}

		}

		return length;
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

	int _GCBEZRG(GCBEZRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (obj.getXPOS() != null) {

			if (obj.getXPOS() != null) {
				Saver.saveSigned(buffer, start + 0, start + 1, obj.getXPOS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getYPOS() != null) {

			if (obj.getYPOS() != null) {
				Saver.saveSigned(buffer, start + 2, start + 3, obj.getYPOS());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		return length;
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

	int _GCCBEZRG(GCCBEZRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (obj.getXPOS() != null) {

			if (obj.getXPOS() != null) {
				Saver.saveSigned(buffer, start + 0, start + 1, obj.getXPOS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getYPOS() != null) {

			if (obj.getYPOS() != null) {
				Saver.saveSigned(buffer, start + 2, start + 3, obj.getYPOS());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		return length;
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

	int _GFLTRG(GFLTRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (obj.getXPOS() != null) {

			if (obj.getXPOS() != null) {
				Saver.saveSigned(buffer, start + 0, start + 1, obj.getXPOS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getYPOS() != null) {

			if (obj.getYPOS() != null) {
				Saver.saveSigned(buffer, start + 2, start + 3, obj.getYPOS());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		return length;
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

	int _GCFLTRG(GCFLTRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (obj.getXPOS() != null) {

			if (obj.getXPOS() != null) {
				Saver.saveSigned(buffer, start + 0, start + 1, obj.getXPOS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getYPOS() != null) {

			if (obj.getYPOS() != null) {
				Saver.saveSigned(buffer, start + 2, start + 3, obj.getYPOS());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		return length;
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

	int _GLINERG(GLINERG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (obj.getXPOS() != null) {

			if (obj.getXPOS() != null) {
				Saver.saveSigned(buffer, start + 0, start + 1, obj.getXPOS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getYPOS() != null) {

			if (obj.getYPOS() != null) {
				Saver.saveSigned(buffer, start + 2, start + 3, obj.getYPOS());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		return length;
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

	int _GCLINERG(GCLINERG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (obj.getXPOS() != null) {

			if (obj.getXPOS() != null) {
				Saver.saveSigned(buffer, start + 0, start + 1, obj.getXPOS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getYPOS() != null) {

			if (obj.getYPOS() != null) {
				Saver.saveSigned(buffer, start + 2, start + 3, obj.getYPOS());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		return length;
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

	int _GMRKRG(GMRKRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (obj.getXPOS() != null) {

			if (obj.getXPOS() != null) {
				Saver.saveSigned(buffer, start + 0, start + 1, obj.getXPOS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getYPOS() != null) {

			if (obj.getYPOS() != null) {
				Saver.saveSigned(buffer, start + 2, start + 3, obj.getYPOS());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		return length;
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

	int _GCMRKRG(GCMRKRG obj, byte[] buffer, int start) {
		int length = 0;

		if (1 + 1 > length)
			length = 1 + 1;

		if (3 + 1 > length)
			length = 3 + 1;

		if (obj.getXPOS() != null) {

			if (obj.getXPOS() != null) {
				Saver.saveSigned(buffer, start + 0, start + 1, obj.getXPOS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		if (obj.getYPOS() != null) {

			if (obj.getYPOS() != null) {
				Saver.saveSigned(buffer, start + 2, start + 3, obj.getYPOS());
			}

			if (3 + 1 > length)
				length = 3 + 1;

		}

		return length;
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

	int _GRLINERG(GRLINERG obj, byte[] buffer, int start) {
		int length = 0;

		if (0 + 1 > length)
			length = 0 + 1;

		if (1 + 1 > length)
			length = 1 + 1;

		if (obj.getXOSSF() != null) {

			if (obj.getXOSSF() != null) {
				Saver.saveSigned(buffer, start + 0, start + 0, obj.getXOSSF());
			}

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getYOFFS() != null) {

			if (obj.getYOFFS() != null) {
				Saver.saveSigned(buffer, start + 1, start + 1, obj.getYOFFS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		return length;
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

	int _GCRLINERG(GCRLINERG obj, byte[] buffer, int start) {
		int length = 0;

		if (0 + 1 > length)
			length = 0 + 1;

		if (1 + 1 > length)
			length = 1 + 1;

		if (obj.getXOSSF() != null) {

			if (obj.getXOSSF() != null) {
				Saver.saveSigned(buffer, start + 0, start + 0, obj.getXOSSF());
			}

			if (0 + 1 > length)
				length = 0 + 1;

		}

		if (obj.getYOFFS() != null) {

			if (obj.getYOFFS() != null) {
				Saver.saveSigned(buffer, start + 1, start + 1, obj.getYOFFS());
			}

			if (1 + 1 > length)
				length = 1 + 1;

		}

		return length;
	}

	MSURG _MSURG(byte[] buffer, int pos, int stop) {
		MSURG obj = AfplibFactory.eINSTANCE.createMSURG();

		{
			int sstop = pos + 7;

			if (sstop <= stop)

				obj.setSUPname(new String(buffer, pos + 0, sstop - pos - 0 + 1, charset));

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

	int _MSURG(MSURG obj, byte[] buffer, int start) {
		int length = 0;

		if (7 + 1 > length)
			length = 7 + 1;

		if (8 + 1 > length)
			length = 8 + 1;

		if (9 + 1 > length)
			length = 9 + 1;

		if (obj.getSUPname() != null) {

			if (obj.getSUPname() != null) {
				Saver.save(buffer, start + 0, start + 7, obj.getSUPname(), charset);
			}

			if (7 + 1 > length)
				length = 7 + 1;

		}

		if (obj.getReserved() != null) {

			if (obj.getReserved() != null) {
				Saver.save(buffer, start + 8, start + 8, obj.getReserved());
			}

			if (8 + 1 > length)
				length = 8 + 1;

		}

		if (obj.getSUPid() != null) {

			Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getSUPid());

			if (9 + 1 > length)
				length = 9 + 1;

		}

		return length;
	}

	int binary_triplets(byte[] buffer, int bstart, List<Triplet> triplets) {
		int start = bstart;

		for (Triplet m : triplets) {
			int length = 0;
			switch (m.eClass().getClassifierID()) {

				case AfplibPackage.ATTRIBUTE_QUALIFIER : {
					m.setTripletId(128);
					AttributeQualifier obj = (AttributeQualifier) m;

					if (5 + 1 > length)
						length = 5 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (obj.getSeqNum() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getSeqNum());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getLevNum() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 9, obj.getLevNum());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(128)[0];

					break;
				}

				case AfplibPackage.ATTRIBUTE_VALUE : {
					m.setTripletId(54);
					AttributeValue obj = (AttributeValue) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getReserved0() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getReserved0());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getAttVal() != null) {

						{
							int size = Saver.save(buffer, start + 4, obj.getAttVal(), charset);
							if (4 + size > length)
								length = 4 + size;
						}

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(54)[0];

					break;
				}

				case AfplibPackage.CGCSGID : {
					m.setTripletId(1);
					CGCSGID obj = (CGCSGID) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getGCSGID() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getGCSGID());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getCPGID() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getCPGID());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(1)[0];

					charset = CodepageHelper.getCharset(obj.getCPGID(), obj.getGCSGID());

					break;
				}

				case AfplibPackage.CRC_RESOURCE_MANAGEMENT : {
					m.setTripletId(99);
					CRCResourceManagement obj = (CRCResourceManagement) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getFmtQual() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getFmtQual());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRMValue() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 5, obj.getRMValue());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getResClassFlg() != null) {

						Saver.saveUnsigned(buffer, start + 5, start + 5, obj.getResClassFlg());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(99)[0];

					break;
				}

				case AfplibPackage.CHARACTER_ROTATION : {
					m.setTripletId(38);
					CharacterRotation obj = (CharacterRotation) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getCharRot() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getCharRot());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(38)[0];

					break;
				}

				case AfplibPackage.COLOR_SPECIFICATION : {
					m.setTripletId(78);
					ColorSpecification obj = (ColorSpecification) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (obj.getColSpce() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getColSpce());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getColSize1() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 8, obj.getColSize1());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getColSize2() != null) {

						Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getColSize2());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getColSize3() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getColSize3());

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getColSize4() != null) {

						Saver.saveUnsigned(buffer, start + 11, start + 11, obj.getColSize4());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getColor() != null) {

						{
							int size = Saver.save(buffer, start + 12, obj.getColor());
							if (12 + size > length)
								length = 12 + size;
						}

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(78)[0];

					break;
				}

				case AfplibPackage.COMMENT : {
					m.setTripletId(101);
					Comment obj = (Comment) m;

					if (obj.getComment() != null) {

						{
							int size = Saver.save(buffer, start + 2, obj.getComment(), charset);
							if (2 + size > length)
								length = 2 + size;
						}

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(101)[0];

					break;
				}

				case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR : {
					m.setTripletId(139);
					DataObjectFontDescriptor obj = (DataObjectFontDescriptor) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (13 + 1 > length)
						length = 13 + 1;

					if (15 + 1 > length)
						length = 15 + 1;

					if (obj.getDOFtFlgs() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getDOFtFlgs());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getFontTech() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getFontTech());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getVFS() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getVFS());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getHFS() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getHFS());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getCharRot() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getCharRot());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getEncEnv() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 11, obj.getEncEnv());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getEncID() != null) {

						Saver.saveUnsigned(buffer, start + 12, start + 13, obj.getEncID());

						if (13 + 1 > length)
							length = 13 + 1;

					}

					if (obj.getReserved() != null) {

						if (obj.getReserved() != null) {
							Saver.save(buffer, start + 14, start + 15, obj.getReserved());
						}

						if (15 + 1 > length)
							length = 15 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(139)[0];

					break;
				}

				case AfplibPackage.DESCRIPTOR_POSITION : {
					m.setTripletId(67);
					DescriptorPosition obj = (DescriptorPosition) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getDesPosID() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getDesPosID());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(67)[0];

					break;
				}

				case AfplibPackage.ENCODING_SCHEME_ID : {
					m.setTripletId(80);
					EncodingSchemeID obj = (EncodingSchemeID) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getESidUD() != null) {

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getESidCP() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getESidCP());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getESidUD() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getESidUD());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(80)[0];

					break;
				}

				case AfplibPackage.FONT_RESOLUTION : {
					m.setTripletId(132);
					FontResolution obj = (FontResolution) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getMetTech() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getMetTech());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRPuBase() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getRPuBase());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getRPUnits() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getRPUnits());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(132)[0];

					break;
				}

				case AfplibPackage.FULLY_QUALIFIED_NAME : {
					m.setTripletId(2);
					FullyQualifiedName obj = (FullyQualifiedName) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getFQNType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getFQNType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getFQNFormat() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getFQNFormat());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getFQName() != null) {

						if (obj.getFQNType() == FullyQualifiedNameFQNType.CONST_DATA_OBJECT_INTERNAL_RESOURCE_REFERENCE_VALUE) {
							int lid = Integer.parseInt(obj.getFQName());
							Saver.saveUnsigned(buffer, start + 4, start + 4, lid);
							length = 4 + 1;
						} else {
							int size = Saver.save(buffer, start + 4, obj.getFQName(), charset);
							if (4 + size > length)
								length = 4 + size;
						}

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(2)[0];

					break;
				}

				case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP : {
					m.setTripletId(98);
					LocalDateAndTimeStamp obj = (LocalDateAndTimeStamp) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (12 + 1 > length)
						length = 12 + 1;

					if (14 + 1 > length)
						length = 14 + 1;

					if (16 + 1 > length)
						length = 16 + 1;

					if (obj.getStampType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getStampType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getTHunYear() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getTHunYear());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getTenYear() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getTenYear());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getDay() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 8, obj.getDay());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getHour() != null) {

						Saver.saveUnsigned(buffer, start + 9, start + 10, obj.getHour());

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getMinute() != null) {

						Saver.saveUnsigned(buffer, start + 11, start + 12, obj.getMinute());

						if (12 + 1 > length)
							length = 12 + 1;

					}

					if (obj.getSecond() != null) {

						Saver.saveUnsigned(buffer, start + 13, start + 14, obj.getSecond());

						if (14 + 1 > length)
							length = 14 + 1;

					}

					if (obj.getHundSec() != null) {

						Saver.saveUnsigned(buffer, start + 15, start + 16, obj.getHundSec());

						if (16 + 1 > length)
							length = 16 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(98)[0];

					break;
				}

				case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP : {
					m.setTripletId(114);
					UniversalDateAndTimeStamp obj = (UniversalDateAndTimeStamp) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (12 + 1 > length)
						length = 12 + 1;

					if (obj.getReserved() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getReserved());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getYearAD() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 4, obj.getYearAD());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getMonth() != null) {

						Saver.saveUnsigned(buffer, start + 5, start + 5, obj.getMonth());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getDay() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 6, obj.getDay());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getHour() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 7, obj.getHour());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getMinute() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 8, obj.getMinute());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getSecond() != null) {

						Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getSecond());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getTimeZone() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getTimeZone());

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getUTCDiffH() != null) {

						Saver.saveUnsigned(buffer, start + 11, start + 11, obj.getUTCDiffH());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getUTCDiffM() != null) {

						Saver.saveUnsigned(buffer, start + 12, start + 12, obj.getUTCDiffM());

						if (12 + 1 > length)
							length = 12 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(114)[0];

					break;
				}

				case AfplibPackage.MAPPING_OPTION : {
					m.setTripletId(4);
					MappingOption obj = (MappingOption) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getMapValue() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getMapValue());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(4)[0];

					break;
				}

				case AfplibPackage.MEDIA_EJECT_CONTROL : {
					m.setTripletId(69);
					MediaEjectControl obj = (MediaEjectControl) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getReserved() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getReserved());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getEjCtrl() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getEjCtrl());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(69)[0];

					break;
				}

				case AfplibPackage.MEDIUM_MAP_PAGE_NUMBER : {
					m.setTripletId(86);
					MediumMapPageNumber obj = (MediumMapPageNumber) m;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getPageNum() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getPageNum());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(86)[0];

					break;
				}

				case AfplibPackage.MEDIUM_ORIENTATION : {
					m.setTripletId(104);
					MediumOrientation obj = (MediumOrientation) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getMedOrient() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getMedOrient());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(104)[0];

					break;
				}

				case AfplibPackage.MEASUREMENT_UNITS : {
					m.setTripletId(75);
					MeasurementUnits obj = (MeasurementUnits) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (obj.getXoaBase() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getXoaBase());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getYoaBase() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getYoaBase());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getXoaUnits() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getXoaUnits());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getYoaUnits() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getYoaUnits());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(75)[0];

					break;
				}

				case AfplibPackage.MODCA_INTERCHANGE_SET : {
					m.setTripletId(24);
					MODCAInterchangeSet obj = (MODCAInterchangeSet) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (obj.getIStype() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getIStype());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getISid() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 4, obj.getISid());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(24)[0];

					break;
				}

				case AfplibPackage.OBJECT_AREA_SIZE : {
					m.setTripletId(76);
					ObjectAreaSize obj = (ObjectAreaSize) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (obj.getSizeType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getSizeType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getXoaSize() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 5, obj.getXoaSize());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getYoaSize() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 8, obj.getYoaSize());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(76)[0];

					break;
				}

				case AfplibPackage.OBJECT_CLASSIFICATION : {
					m.setTripletId(16);
					ObjectClassification obj = (ObjectClassification) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (23 + 1 > length)
						length = 23 + 1;

					if (obj.getObjTpName() != null) {

						if (55 + 1 > length)
							length = 55 + 1;

					}

					if (obj.getObjLev() != null) {

						if (63 + 1 > length)
							length = 63 + 1;

					}

					if (obj.getCompName() != null) {

						if (95 + 1 > length)
							length = 95 + 1;

					}

					if (obj.getObjClass() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getObjClass());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getStrucFlgs() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getStrucFlgs());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getRegObjId() != null) {

						if (obj.getRegObjId() != null) {
							Saver.save(buffer, start + 8, start + 23, obj.getRegObjId());
						}

						if (23 + 1 > length)
							length = 23 + 1;

					}

					if (obj.getObjTpName() != null) {

						if (obj.getObjTpName() != null) {
							Saver.save(buffer, start + 24, start + 55, obj.getObjTpName(), charset);
						}

						if (55 + 1 > length)
							length = 55 + 1;

					}

					if (obj.getObjLev() != null) {

						if (obj.getObjLev() != null) {
							Saver.save(buffer, start + 56, start + 63, obj.getObjLev(), charset);
						}

						if (63 + 1 > length)
							length = 63 + 1;

					}

					if (obj.getCompName() != null) {

						if (obj.getCompName() != null) {
							Saver.save(buffer, start + 64, start + 95, obj.getCompName(), charset);
						}

						if (95 + 1 > length)
							length = 95 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(16)[0];

					break;
				}

				case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION : {
					m.setTripletId(-33);
					ObjectFunctionSetSpecification obj = (ObjectFunctionSetSpecification) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (obj.getObjType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getObjType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getArchVrsn() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getArchVrsn());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getDCAFnSet() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getDCAFnSet());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getOCAFnSet() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getOCAFnSet());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(-33)[0];

					break;
				}

				case AfplibPackage.OBJECT_OFFSET : {
					m.setTripletId(90);
					ObjectOffset obj = (ObjectOffset) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (obj.getObjOstHi() != null) {

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getObjTpe() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getObjTpe());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getObjOset() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 7, obj.getObjOset());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getObjOstHi() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 11, obj.getObjOstHi());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(90)[0];

					break;
				}

				case AfplibPackage.RESOURCE_OBJECT_TYPE : {
					m.setTripletId(33);
					ResourceObjectType obj = (ResourceObjectType) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (obj.getObjType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getObjType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getConData() != null) {

						if (obj.getConData() != null) {
							Saver.save(buffer, start + 3, start + 9, obj.getConData());
						}

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(33)[0];

					break;
				}

				case AfplibPackage.PAGE_POSITION_INFORMATION : {
					m.setTripletId(129);
					PagePositionInformation obj = (PagePositionInformation) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getPGPRG() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getPGPRG());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(129)[0];

					break;
				}

				case AfplibPackage.PRESENTATION_CONTROL : {
					m.setTripletId(131);
					PresentationControl obj = (PresentationControl) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getPRSFlg() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getPRSFlg());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(131)[0];

					break;
				}

				case AfplibPackage.PRESENTATION_SPACE_RESET_MIXING : {
					m.setTripletId(112);
					PresentationSpaceResetMixing obj = (PresentationSpaceResetMixing) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getBgMxFlag() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getBgMxFlag());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(112)[0];

					break;
				}

				case AfplibPackage.PRESENTATION_SPACE_MIXING_RULES : {
					m.setTripletId(113);
					PresentationSpaceMixingRules obj = (PresentationSpaceMixingRules) m;

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(113)[0];

					break;
				}

				case AfplibPackage.RESOURCE_LOCAL_IDENTIFIER : {
					m.setTripletId(36);
					ResourceLocalIdentifier obj = (ResourceLocalIdentifier) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getResType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getResType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getResLID() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getResLID());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(36)[0];

					break;
				}

				case AfplibPackage.RESOURCE_SECTION_NUMBER : {
					m.setTripletId(37);
					ResourceSectionNumber obj = (ResourceSectionNumber) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getResSNum() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getResSNum());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(37)[0];

					break;
				}

				case AfplibPackage.TEXT_ORIENTATION : {
					m.setTripletId(29);
					TextOrientation obj = (TextOrientation) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getIAxis() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getIAxis());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getBAxis() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getBAxis());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(29)[0];

					break;
				}

				case AfplibPackage.FONT_HORIZONTAL_SCALE_FACTOR : {
					m.setTripletId(93);
					FontHorizontalScaleFactor obj = (FontHorizontalScaleFactor) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getHscale() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getHscale());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(93)[0];

					break;
				}

				case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION : {
					m.setTripletId(31);
					FontDescriptorSpecification obj = (FontDescriptorSpecification) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (obj.getFtUsFlags() != null) {

						if (19 + 1 > length)
							length = 19 + 1;

					}

					if (obj.getFtWtClass() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getFtWtClass());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getFtWdClass() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getFtWdClass());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getFtHeight() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getFtHeight());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getFtWidth() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getFtWidth());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getFtDsFlags() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 8, obj.getFtDsFlags());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getFtUsFlags() != null) {

						Saver.saveUnsigned(buffer, start + 19, start + 19, obj.getFtUsFlags());

						if (19 + 1 > length)
							length = 19 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(31)[0];

					break;
				}

				case AfplibPackage.TONER_SAVER : {
					m.setTripletId(116);
					TonerSaver obj = (TonerSaver) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getTSvCtrl() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getTSvCtrl());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(116)[0];

					break;
				}

				case AfplibPackage.COLOR_FIDELITY : {
					m.setTripletId(117);
					ColorFidelity obj = (ColorFidelity) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (obj.getStpCoEx() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getStpCoEx());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRepCoEx() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getRepCoEx());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getColSub() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 6, obj.getColSub());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(117)[0];

					break;
				}

				case AfplibPackage.FONT_FIDELITY : {
					m.setTripletId(120);
					FontFidelity obj = (FontFidelity) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getStpFntEx() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getStpFntEx());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(120)[0];

					break;
				}

				case AfplibPackage.TEXT_FIDELITY : {
					m.setTripletId(134);
					TextFidelity obj = (TextFidelity) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (obj.getStpTxtEx() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getStpTxtEx());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRepTxtEx() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getRepTxtEx());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(134)[0];

					break;
				}

				case AfplibPackage.MEDIA_FIDELITY : {
					m.setTripletId(135);
					MediaFidelity obj = (MediaFidelity) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (obj.getStpMedEx() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getStpMedEx());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getReserved() != null) {

						if (obj.getReserved() != null) {
							Saver.save(buffer, start + 3, start + 6, obj.getReserved());
						}

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(135)[0];

					break;
				}

				case AfplibPackage.FINISHING_FIDELITY : {
					m.setTripletId(136);
					FinishingFidelity obj = (FinishingFidelity) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (obj.getStpFinEx() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getStpFinEx());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRepFinEx() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getRepFinEx());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(136)[0];

					break;
				}

				case AfplibPackage.CMR_FIDELITY : {
					m.setTripletId(150);
					CMRFidelity obj = (CMRFidelity) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (obj.getStpCMREx() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getStpCMREx());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRepCMREx() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getRepCMREx());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(150)[0];

					break;
				}

				case AfplibPackage.OBJECT_BYTE_EXTENT : {
					m.setTripletId(87);
					ObjectByteExtent obj = (ObjectByteExtent) m;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getByteExtHi() != null) {

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getByteExt() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getByteExt());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getByteExtHi() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 9, obj.getByteExtHi());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(87)[0];

					break;
				}

				case AfplibPackage.OBJECT_BYTE_OFFSET : {
					m.setTripletId(45);
					ObjectByteOffset obj = (ObjectByteOffset) m;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getDirByHi() != null) {

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getDirByOff() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getDirByOff());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getDirByHi() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 9, obj.getDirByHi());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(45)[0];

					break;
				}

				case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT : {
					m.setTripletId(89);
					ObjectStructuredFieldExtent obj = (ObjectStructuredFieldExtent) m;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getSFExtHi() != null) {

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getSFExt() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getSFExt());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getSFExtHi() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 9, obj.getSFExtHi());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(89)[0];

					break;
				}

				case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET : {
					m.setTripletId(88);
					ObjectStructuredFieldOffset obj = (ObjectStructuredFieldOffset) m;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getSFOffHi() != null) {

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getSFOff() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getSFOff());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getSFOffHi() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 9, obj.getSFOffHi());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(88)[0];

					break;
				}

				case AfplibPackage.OBJECT_COUNT : {
					m.setTripletId(94);
					ObjectCount obj = (ObjectCount) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (obj.getSobjNmHi() != null) {

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getSubObj() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getSubObj());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getSObjNum() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 7, obj.getSObjNum());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getSobjNmHi() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 11, obj.getSobjNmHi());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(94)[0];

					break;
				}

				case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER : {
					m.setTripletId(100);
					ObjectOriginIdentifier obj = (ObjectOriginIdentifier) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (16 + 1 > length)
						length = 16 + 1;

					if (60 + 1 > length)
						length = 60 + 1;

					if (obj.getSystem() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getSystem());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getSysID() != null) {

						if (obj.getSysID() != null) {
							Saver.save(buffer, start + 3, start + 10, obj.getSysID());
						}

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getMedID() != null) {

						if (obj.getMedID() != null) {
							Saver.save(buffer, start + 11, start + 16, obj.getMedID());
						}

						if (16 + 1 > length)
							length = 16 + 1;

					}

					if (obj.getDSID() != null) {

						if (obj.getDSID() != null) {
							Saver.save(buffer, start + 17, start + 60, obj.getDSID());
						}

						if (60 + 1 > length)
							length = 60 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(100)[0];

					break;
				}

				case AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION : {
					m.setTripletId(39);
					LineDataObjectPositionMigration obj = (LineDataObjectPositionMigration) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getTempOrient() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getTempOrient());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(39)[0];

					break;
				}

				case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR : {
					m.setTripletId(145);
					ColorManagementResourceDescriptor obj = (ColorManagementResourceDescriptor) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (obj.getProcMode() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getProcMode());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getCMRScpe() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getCMRScpe());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(145)[0];

					break;
				}

				case AfplibPackage.IMAGE_RESOLUTION : {
					m.setTripletId(154);
					ImageResolution obj = (ImageResolution) m;

					if (4 + 1 > length)
						length = 4 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (obj.getXBase() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getXBase());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getYBase() != null) {

						Saver.saveUnsigned(buffer, start + 5, start + 5, obj.getYBase());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getXResol() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getXResol());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getYResol() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getYResol());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(154)[0];

					break;
				}

				case AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE : {
					m.setTripletId(156);
					ObjectContainerPresentationSpaceSize obj = (ObjectContainerPresentationSpaceSize) m;

					if (4 + 1 > length)
						length = 4 + 1;

					if (obj.getPDFSize() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getPDFSize());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(156)[0];

					break;
				}

				case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER : {
					m.setTripletId(34);
					ExtendedResourceLocalIdentifier obj = (ExtendedResourceLocalIdentifier) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (obj.getResType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getResType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getResLID() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 6, obj.getResLID());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(34)[0];

					break;
				}

				case AfplibPackage.METRIC_ADJUSTMENT : {
					m.setTripletId(121);
					MetricAdjustment obj = (MetricAdjustment) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (12 + 1 > length)
						length = 12 + 1;

					if (14 + 1 > length)
						length = 14 + 1;

					if (obj.getUnitBase() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getUnitBase());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getXUPUB() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 4, obj.getXUPUB());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getYUPUB() != null) {

						Saver.saveUnsigned(buffer, start + 5, start + 6, obj.getYUPUB());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getHUniformIncrement() != null) {

						if (obj.getHUniformIncrement() != null) {
							Saver.saveSigned(buffer, start + 7, start + 8, obj.getHUniformIncrement());
						}

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getVUniformIncrement() != null) {

						if (obj.getVUniformIncrement() != null) {
							Saver.saveSigned(buffer, start + 9, start + 10, obj.getVUniformIncrement());
						}

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getHBaselineIncrement() != null) {

						if (obj.getHBaselineIncrement() != null) {
							Saver.saveSigned(buffer, start + 11, start + 12, obj.getHBaselineIncrement());
						}

						if (12 + 1 > length)
							length = 12 + 1;

					}

					if (obj.getVBaselineIncrement() != null) {

						if (obj.getVBaselineIncrement() != null) {
							Saver.saveSigned(buffer, start + 13, start + 14, obj.getVBaselineIncrement());
						}

						if (14 + 1 > length)
							length = 14 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(121)[0];

					break;
				}

				case AfplibPackage.EXTENSION_FONT : {
					m.setTripletId(109);
					ExtensionFont obj = (ExtensionFont) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getGCSGID() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getGCSGID());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(109)[0];

					break;
				}

				case AfplibPackage.RENDERING_INTENT : {
					m.setTripletId(149);
					RenderingIntent obj = (RenderingIntent) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (obj.getReserved() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getReserved());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getIOCARI() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getIOCARI());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getOCRI() != null) {

						Saver.saveUnsigned(buffer, start + 5, start + 5, obj.getOCRI());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getPTOCRI() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 6, obj.getPTOCRI());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getGOCARI() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 7, obj.getGOCARI());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getReserved2() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getReserved2());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(149)[0];

					break;
				}

				case AfplibPackage.FONT_CODED_GRAPHIC_CHARACTER_SET_GLOBAL_IDENTIFIER : {
					m.setTripletId(32);
					FontCodedGraphicCharacterSetGlobalIdentifier obj = (FontCodedGraphicCharacterSetGlobalIdentifier) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getGCSGID() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getGCSGID());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getCPGID() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getCPGID());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(32)[0];

					break;
				}

				case AfplibPackage.LOCALE_SELECTOR : {
					m.setTripletId(140);
					LocaleSelector obj = (LocaleSelector) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (19 + 1 > length)
						length = 19 + 1;

					if (27 + 1 > length)
						length = 27 + 1;

					if (35 + 1 > length)
						length = 35 + 1;

					if (obj.getVarCde() != null) {

					}

					if (obj.getLocFlgs() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getLocFlgs());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getLangCode() != null) {

						if (obj.getLangCode() != null) {
							Saver.save(buffer, start + 4, start + 11, obj.getLangCode(), charset);
						}

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getScrptCde() != null) {

						if (obj.getScrptCde() != null) {
							Saver.save(buffer, start + 12, start + 19, obj.getScrptCde(), charset);
						}

						if (19 + 1 > length)
							length = 19 + 1;

					}

					if (obj.getRegCde() != null) {

						if (obj.getRegCde() != null) {
							Saver.save(buffer, start + 20, start + 27, obj.getRegCde(), charset);
						}

						if (27 + 1 > length)
							length = 27 + 1;

					}

					if (obj.getReserved() != null) {

						if (obj.getReserved() != null) {
							Saver.save(buffer, start + 28, start + 35, obj.getReserved());
						}

						if (35 + 1 > length)
							length = 35 + 1;

					}

					if (obj.getVarCde() != null) {

						{
							int size = Saver.save(buffer, start + 36, obj.getVarCde(), charset);
							if (36 + size > length)
								length = 36 + size;
						}

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(140)[0];

					break;
				}

				case AfplibPackage.FINISHING_OPERATION : {
					m.setTripletId(133);
					FinishingOperation obj = (FinishingOperation) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (obj.getOpPos() != null) {

					}

					if (obj.getFOpType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getFOpType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRefEdge() != null) {

						Saver.saveUnsigned(buffer, start + 5, start + 5, obj.getRefEdge());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getFOpCnt() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 6, obj.getFOpCnt());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getAxOffst() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 8, obj.getAxOffst());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getOpPos() != null) {

						{
							int size = Saver.save(buffer, start + 9, obj.getOpPos());
							if (9 + size > length)
								length = 9 + size;
						}

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(133)[0];

					break;
				}

				case AfplibPackage.UP_3I_FINISHING_OPERATION : {
					m.setTripletId(142);
					UP3iFinishingOperation obj = (UP3iFinishingOperation) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getSeqnum() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getSeqnum());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getUP3iDat() != null) {

						{
							int size = Saver.save(buffer, start + 4, obj.getUP3iDat());
							if (4 + size > length)
								length = 4 + size;
						}

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(142)[0];

					break;
				}

				case AfplibPackage.DEVICE_APPEARANCE : {
					m.setTripletId(151);
					DeviceAppearance obj = (DeviceAppearance) m;

					if (4 + 1 > length)
						length = 4 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (obj.getDevApp() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 4, obj.getDevApp());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getReserved() != null) {

						if (obj.getReserved() != null) {
							Saver.save(buffer, start + 5, start + 6, obj.getReserved());
						}

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(151)[0];

					break;
				}

				case AfplibPackage.RESOURCE_OBJECT_INCLUDE : {
					m.setTripletId(108);
					ResourceObjectInclude obj = (ResourceObjectInclude) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (13 + 1 > length)
						length = 13 + 1;

					if (16 + 1 > length)
						length = 16 + 1;

					if (obj.getObOrent() != null) {

						if (18 + 1 > length)
							length = 18 + 1;

					}

					if (obj.getObjType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getObjType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getObjName() != null) {

						if (obj.getObjName() != null) {
							Saver.save(buffer, start + 3, start + 10, obj.getObjName(), charset);
						}

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getXobjOset() != null) {

						if (obj.getXobjOset() != null) {
							Saver.saveSigned(buffer, start + 11, start + 13, obj.getXobjOset());
						}

						if (13 + 1 > length)
							length = 13 + 1;

					}

					if (obj.getYobjOset() != null) {

						if (obj.getYobjOset() != null) {
							Saver.saveSigned(buffer, start + 14, start + 16, obj.getYobjOset());
						}

						if (16 + 1 > length)
							length = 16 + 1;

					}

					if (obj.getObOrent() != null) {

						Saver.saveUnsigned(buffer, start + 17, start + 18, obj.getObOrent());

						if (18 + 1 > length)
							length = 18 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(108)[0];

					break;
				}

				case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING : {
					m.setTripletId(70);
					PageOverlayConditionalProcessing obj = (PageOverlayConditionalProcessing) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getLevel() != null) {

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getPgOvType() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getPgOvType());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getLevel() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getLevel());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(70)[0];

					break;
				}

				case AfplibPackage.RESOURCE_USAGE_ATTRIBUTE : {
					m.setTripletId(71);
					ResourceUsageAttribute obj = (ResourceUsageAttribute) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getFrequency() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getFrequency());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 2;
					buffer[start] = Data.toUnsignedByte(length)[0];
					buffer[start + 1] = Data.toUnsignedByte(71)[0];

					break;
				}

				default :
					throw new IllegalArgumentException("unknown triplet: " + m);
			}
			start += length;
		}

		return start - bstart;
	}

	int binary_sdf(byte[] buffer, int bstart, List<Triplet> triplets) {
		int start = bstart;

		for (Triplet m : triplets) {
			int length = 0;
			switch (m.eClass().getClassifierID()) {

				case AfplibPackage.BEGIN_SEGMENT : {
					m.setTripletId(112);
					BeginSegment obj = (BeginSegment) m;

					if (obj.getSEGNAME() != null) {

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getSEGNAME() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getSEGNAME());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if ((112 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(112);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(112)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.END_SEGMENT : {
					m.setTripletId(113);
					EndSegment obj = (EndSegment) m;

					if ((113 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(113);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(113)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.BEGIN_TILE : {
					m.setTripletId(140);
					BeginTile obj = (BeginTile) m;

					if ((140 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(140);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(140)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.END_TILE : {
					m.setTripletId(141);
					EndTile obj = (EndTile) m;

					if ((141 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(141);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(141)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.BEGIN_TRANSPARENCY_MASK : {
					m.setTripletId(142);
					BeginTransparencyMask obj = (BeginTransparencyMask) m;

					if ((142 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(142);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(142)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.END_TRANSPARENCY_MASK : {
					m.setTripletId(143);
					EndTransparencyMask obj = (EndTransparencyMask) m;

					if ((143 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(143);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(143)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.BEGIN_IMAGE : {
					m.setTripletId(145);
					BeginImage obj = (BeginImage) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getOBJTYPE() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getOBJTYPE());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if ((145 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(145);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(145)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.END_IMAGE : {
					m.setTripletId(147);
					EndImage obj = (EndImage) m;

					if ((147 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(147);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(147)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.IMAGE_SIZE : {
					m.setTripletId(148);
					ImageSize obj = (ImageSize) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (obj.getUNITBASE() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getUNITBASE());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getHRESOL() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 4, obj.getHRESOL());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getVRESOL() != null) {

						Saver.saveUnsigned(buffer, start + 5, start + 6, obj.getVRESOL());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getHSIZE() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 8, obj.getHSIZE());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getVSIZE() != null) {

						Saver.saveUnsigned(buffer, start + 9, start + 10, obj.getVSIZE());

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if ((148 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(148);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(148)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.IMAGE_ENCODING : {
					m.setTripletId(149);
					ImageEncoding obj = (ImageEncoding) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getBITORDR() != null) {

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getCOMPRID() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getCOMPRID());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRECID() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getRECID());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getBITORDR() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getBITORDR());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if ((149 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(149);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(149)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.IDE_SIZE : {
					m.setTripletId(150);
					IDESize obj = (IDESize) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getIDESZ() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getIDESZ());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if ((150 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(150);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(150)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.IMAGE_LUTID : {
					m.setTripletId(151);
					ImageLUTID obj = (ImageLUTID) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getLUTID() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getLUTID());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if ((151 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(151);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(151)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.BAND_IMAGE : {
					m.setTripletId(152);
					BandImage obj = (BandImage) m;

					if (2 + 1 > length)
						length = 2 + 1;

					{

						int size = binary_BandImageRG(buffer, start + 3, obj.getRg());
						if (3 + size > length)
							length = 3 + size;

					}

					if (obj.getBCOUNT() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getBCOUNT());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRg() != null) {

					}

					if ((152 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(152);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(152)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.IDE_STRUCTURE : {
					m.setTripletId(155);
					IDEStructure obj = (IDEStructure) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (obj.getSIZE2() != null) {

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getSIZE3() != null) {

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getSIZE4() != null) {

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getFLAGS() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getFLAGS());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getFORMAT() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getFORMAT());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getSIZE1() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 7, obj.getSIZE1());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getSIZE2() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 8, obj.getSIZE2());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getSIZE3() != null) {

						Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getSIZE3());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getSIZE4() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getSIZE4());

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if ((155 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(155);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(155)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.EXTERNAL_ALGORITHM : {
					m.setTripletId(159);
					ExternalAlgorithm obj = (ExternalAlgorithm) m;

					if (2 + 1 > length)
						length = 2 + 1;

					{

						int size = binary_ExternalAlgorithmRG(buffer, start + 4, obj.getRg());
						if (4 + size > length)
							length = 4 + size;

					}

					if (obj.getALGTYPE() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getALGTYPE());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRg() != null) {

					}

					if ((159 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(159);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(159)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.TILE_POSITION : {
					m.setTripletId(181);
					TilePosition obj = (TilePosition) m;

					if (5 + 1 > length)
						length = 5 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (obj.getXOFFSET() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getXOFFSET());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getYOFFSET() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 9, obj.getYOFFSET());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if ((181 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(181);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(181)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.TILE_SIZE : {
					m.setTripletId(182);
					TileSize obj = (TileSize) m;

					if (5 + 1 > length)
						length = 5 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (obj.getRELRES() != null) {

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getTHSIZE() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getTHSIZE());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getTVSIZE() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 9, obj.getTVSIZE());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getRELRES() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getRELRES());

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if ((182 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(182);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(182)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.TILE_SET_COLOR : {
					m.setTripletId(183);
					TileSetColor obj = (TileSetColor) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (13 + 1 > length)
						length = 13 + 1;

					if (15 + 1 > length)
						length = 15 + 1;

					if (17 + 1 > length)
						length = 17 + 1;

					if (obj.getCSPACE() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getCSPACE());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRESERVED() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 5, obj.getRESERVED());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getSIZE1() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 6, obj.getSIZE1());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getSIZE2() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 7, obj.getSIZE2());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getSIZE3() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 8, obj.getSIZE3());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getSIZE4() != null) {

						Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getSIZE4());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getCVAL1() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 11, obj.getCVAL1());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getCVAL2() != null) {

						Saver.saveUnsigned(buffer, start + 12, start + 13, obj.getCVAL2());

						if (13 + 1 > length)
							length = 13 + 1;

					}

					if (obj.getCVAL3() != null) {

						Saver.saveUnsigned(buffer, start + 14, start + 15, obj.getCVAL3());

						if (15 + 1 > length)
							length = 15 + 1;

					}

					if (obj.getCVAL4() != null) {

						Saver.saveUnsigned(buffer, start + 16, start + 17, obj.getCVAL4());

						if (17 + 1 > length)
							length = 17 + 1;

					}

					if ((183 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(183);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(183)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR : {
					m.setTripletId(246);
					SetBiLevelImageColor obj = (SetBiLevelImageColor) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getAREA() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getAREA());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getReserved() != null) {

						{
							int size = Saver.save(buffer, start + 3, obj.getReserved());
							if (3 + size > length)
								length = 3 + size;
						}

					}

					if (obj.getNAMECOLR() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getNAMECOLR());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if ((246 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(246);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(246)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION : {
					m.setTripletId(247);
					IOCAFunctionSetIdentification obj = (IOCAFunctionSetIdentification) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getCATEGORY() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getCATEGORY());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getFCNSET() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getFCNSET());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if ((247 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(247);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(247)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.IMAGE_DATA : {
					m.setTripletId(65170);
					ImageData obj = (ImageData) m;

					if (obj.getDATA() != null) {

						{
							int size = Saver.save(buffer, start + 4, obj.getDATA());
							if (4 + size > length)
								length = 4 + size;
						}

					}

					if ((65170 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(65170);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(65170)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.BAND_IMAGE_DATA : {
					m.setTripletId(65180);
					BandImageData obj = (BandImageData) m;

					if (4 + 1 > length)
						length = 4 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (obj.getDATA() != null) {

					}

					if (obj.getBANDNUM() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getBANDNUM());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getRESERVED() != null) {

						Saver.saveUnsigned(buffer, start + 5, start + 6, obj.getRESERVED());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getDATA() != null) {

						{
							int size = Saver.save(buffer, start + 7, obj.getDATA());
							if (7 + size > length)
								length = 7 + size;
						}

					}

					if ((65180 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(65180);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(65180)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.INCLUDE_TILE : {
					m.setTripletId(65208);
					IncludeTile obj = (IncludeTile) m;

					if (7 + 1 > length)
						length = 7 + 1;

					if (obj.getTIRID() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 7, obj.getTIRID());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if ((65208 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(65208);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(65208)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.IMAGE_SUBSAMPLING : {
					m.setTripletId(65230);
					ImageSubsampling obj = (ImageSubsampling) m;

					if (obj.getSdfs() != null && obj.getSdfs().size() > 0) {

						{

							int size = binary_sdf(buffer, start + 4, obj.getSdfs());
							if (4 + size > length)
								length = 4 + size;

						}

					}

					if (obj.getSdfs() != null) {

					}

					if ((65230 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(65230);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(65230)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.SAMPLING_RATIOS : {
					m.setTripletId(1);
					SamplingRatios obj = (SamplingRatios) m;

					{

						int size = binary_SamplingRatiosRG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((1 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(1);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(1)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				case AfplibPackage.TILE_TOC : {
					m.setTripletId(65211);
					TileTOC obj = (TileTOC) m;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getRg() != null && obj.getRg().size() > 0) {

						{

							int size = binary_TileTOCRG(buffer, start + 6, obj.getRg());
							if (6 + size > length)
								length = 6 + size;

						}

					}

					if (obj.getReserved() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getReserved());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getRg() != null) {

					}

					if ((65211 & 0xff00) == 0xfe00) {
						if (length == 0)
							length = 4;
						byte[] bId = Data.toUnsignedShort(65211);
						byte[] bLength = Data.toUnsignedShort(length - 4);
						buffer[start] = bId[0];
						buffer[start + 1] = bId[1];
						buffer[start + 2] = bLength[0];
						buffer[start + 3] = bLength[1];
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = Data.toUnsignedByte(65211)[0];
						buffer[start + 1] = Data.toUnsignedByte(length - 2)[0];
					}
					break;
				}

				default :
					throw new IllegalArgumentException("unknown triplet: " + m);
			}
			start += length;
		}

		return start - bstart;
	}

	int binary_cmd(byte[] buffer, int bstart, List<Triplet> triplets) {
		int start = bstart;

		for (Triplet m : triplets) {
			int length = 0;
			switch (m.eClass().getClassifierID()) {

				case AfplibPackage.BEGIN_SEGMENT_COMMAND : {
					m.setTripletId(112);
					BeginSegmentCommand obj = (BeginSegmentCommand) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (13 + 1 > length)
						length = 13 + 1;

					if (obj.getLENGTH() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLENGTH());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if (obj.getNAME() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 5, obj.getNAME());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getFLAG1() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 6, obj.getFLAG1());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getFLAG2() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 7, obj.getFLAG2());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getSEGL() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getSEGL());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getPSNAME() != null) {

						if (obj.getPSNAME() != null) {
							Saver.save(buffer, start + 10, start + 13, obj.getPSNAME(), charset);
						}

						if (13 + 1 > length)
							length = 13 + 1;

					}

					if ((112 & 0x88) == 0x08) {
						buffer[start] = (byte) 112;
					} else if (112 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 112;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.END_SEGMENT_COMMAND : {
					m.setTripletId(113);
					EndSegmentCommand obj = (EndSegmentCommand) m;

					if ((113 & 0x88) == 0x08) {
						buffer[start] = (byte) 113;
					} else if (113 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 113;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GBAR : {
					m.setTripletId(104);
					GBAR obj = (GBAR) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getFLAGS() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getFLAGS());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((104 & 0x88) == 0x08) {
						buffer[start] = (byte) 104;
					} else if (104 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 104;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GBIMG : {
					m.setTripletId(209);
					GBIMG obj = (GBIMG) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (obj.getXPOS() != null) {

						if (obj.getXPOS() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getXPOS());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getYPOS() != null) {

						if (obj.getYPOS() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getYPOS());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getFORMAT() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 6, obj.getFORMAT());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getRES() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 7, obj.getRES());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getWIDTH() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getWIDTH());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getHEIGHT() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 11, obj.getHEIGHT());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if ((209 & 0x88) == 0x08) {
						buffer[start] = (byte) 209;
					} else if (209 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 209;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCBIMG : {
					m.setTripletId(145);
					GCBIMG obj = (GCBIMG) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (obj.getFORMAT() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getFORMAT());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRES() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getRES());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getWIDTH() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 5, obj.getWIDTH());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getHEIGHT() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getHEIGHT());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if ((145 & 0x88) == 0x08) {
						buffer[start] = (byte) 145;
					} else if (145 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 145;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GBOX : {
					m.setTripletId(192);
					GBOX obj = (GBOX) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (obj.getHAXIS() != null) {

						if (13 + 1 > length)
							length = 13 + 1;

					}

					if (obj.getVAXIS() != null) {

						if (15 + 1 > length)
							length = 15 + 1;

					}

					if (obj.getRES() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getRES());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getXPOS0() != null) {

						if (obj.getXPOS0() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getXPOS0());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getYPOS0() != null) {

						if (obj.getYPOS0() != null) {
							Saver.saveSigned(buffer, start + 6, start + 7, obj.getYPOS0());
						}

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getXPOS1() != null) {

						if (obj.getXPOS1() != null) {
							Saver.saveSigned(buffer, start + 8, start + 9, obj.getXPOS1());
						}

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getYPOS1() != null) {

						if (obj.getYPOS1() != null) {
							Saver.saveSigned(buffer, start + 10, start + 11, obj.getYPOS1());
						}

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getHAXIS() != null) {

						Saver.saveUnsigned(buffer, start + 12, start + 13, obj.getHAXIS());

						if (13 + 1 > length)
							length = 13 + 1;

					}

					if (obj.getVAXIS() != null) {

						Saver.saveUnsigned(buffer, start + 14, start + 15, obj.getVAXIS());

						if (15 + 1 > length)
							length = 15 + 1;

					}

					if ((192 & 0x88) == 0x08) {
						buffer[start] = (byte) 192;
					} else if (192 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 192;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCBOX : {
					m.setTripletId(128);
					GCBOX obj = (GCBOX) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (obj.getHAXIS() != null) {

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getVAXIS() != null) {

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getRES() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getRES());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getXPOS1() != null) {

						if (obj.getXPOS1() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getXPOS1());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getYPOS1() != null) {

						if (obj.getYPOS1() != null) {
							Saver.saveSigned(buffer, start + 6, start + 7, obj.getYPOS1());
						}

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getHAXIS() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getHAXIS());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getVAXIS() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 11, obj.getVAXIS());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if ((128 & 0x88) == 0x08) {
						buffer[start] = (byte) 128;
					} else if (128 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 128;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCHST : {
					m.setTripletId(195);
					GCHST obj = (GCHST) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getXPOS() != null) {

						if (obj.getXPOS() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getXPOS());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getYPOS() != null) {

						if (obj.getYPOS() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getYPOS());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getCP() != null) {

						{
							int size = Saver.save(buffer, start + 6, obj.getCP(), charset);
							if (6 + size > length)
								length = 6 + size;
						}

					}

					if ((195 & 0x88) == 0x08) {
						buffer[start] = (byte) 195;
					} else if (195 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 195;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCCHST : {
					m.setTripletId(131);
					GCCHST obj = (GCCHST) m;

					if (obj.getCP() != null) {

						{
							int size = Saver.save(buffer, start + 2, obj.getCP(), charset);
							if (2 + size > length)
								length = 2 + size;
						}

					}

					if ((131 & 0x88) == 0x08) {
						buffer[start] = (byte) 131;
					} else if (131 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 131;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCOMT : {
					m.setTripletId(1);
					GCOMT obj = (GCOMT) m;

					if (obj.getDATA() != null) {

					}

					if (obj.getDATA() != null) {

						{
							int size = Saver.save(buffer, start + 2, obj.getDATA());
							if (2 + size > length)
								length = 2 + size;
						}

					}

					if ((1 & 0x88) == 0x08) {
						buffer[start] = (byte) 1;
					} else if (1 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 1;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GEAR : {
					m.setTripletId(96);
					GEAR obj = (GEAR) m;

					if (obj.getDATA() != null) {

					}

					if (obj.getDATA() != null) {

						{
							int size = Saver.save(buffer, start + 2, obj.getDATA());
							if (2 + size > length)
								length = 2 + size;
						}

					}

					if ((96 & 0x88) == 0x08) {
						buffer[start] = (byte) 96;
					} else if (96 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 96;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GEIMG : {
					m.setTripletId(147);
					GEIMG obj = (GEIMG) m;

					if (obj.getDATA() != null) {

					}

					if (obj.getDATA() != null) {

						{
							int size = Saver.save(buffer, start + 2, obj.getDATA());
							if (2 + size > length)
								length = 2 + size;
						}

					}

					if ((147 & 0x88) == 0x08) {
						buffer[start] = (byte) 147;
					} else if (147 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 147;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GEPROL : {
					m.setTripletId(62);
					GEPROL obj = (GEPROL) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getRES() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getRES());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((62 & 0x88) == 0x08) {
						buffer[start] = (byte) 62;
					} else if (62 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 62;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GFLT : {
					m.setTripletId(197);
					GFLT obj = (GFLT) m;

					{

						int size = binary_GFLTRG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((197 & 0x88) == 0x08) {
						buffer[start] = (byte) 197;
					} else if (197 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 197;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCFLT : {
					m.setTripletId(133);
					GCFLT obj = (GCFLT) m;

					{

						int size = binary_GCFLTRG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((133 & 0x88) == 0x08) {
						buffer[start] = (byte) 133;
					} else if (133 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 133;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GFARC : {
					m.setTripletId(199);
					GFARC obj = (GFARC) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (obj.getXPOS() != null) {

						if (obj.getXPOS() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getXPOS());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getYPOS() != null) {

						if (obj.getYPOS() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getYPOS());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getMH() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 6, obj.getMH());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getMFR() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 7, obj.getMFR());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if ((199 & 0x88) == 0x08) {
						buffer[start] = (byte) 199;
					} else if (199 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 199;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCFARC : {
					m.setTripletId(135);
					GCFARC obj = (GCFARC) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getMH() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getMH());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getMFR() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getMFR());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if ((135 & 0x88) == 0x08) {
						buffer[start] = (byte) 135;
					} else if (135 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 135;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GIMD : {
					m.setTripletId(146);
					GIMD obj = (GIMD) m;

					if (obj.getDATA() != null) {

						{
							int size = Saver.save(buffer, start + 2, obj.getDATA());
							if (2 + size > length)
								length = 2 + size;
						}

					}

					if ((146 & 0x88) == 0x08) {
						buffer[start] = (byte) 146;
					} else if (146 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 146;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GLINE : {
					m.setTripletId(193);
					GLINE obj = (GLINE) m;

					{

						int size = binary_GLINERG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((193 & 0x88) == 0x08) {
						buffer[start] = (byte) 193;
					} else if (193 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 193;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCLINE : {
					m.setTripletId(129);
					GCLINE obj = (GCLINE) m;

					{

						int size = binary_GCLINERG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((129 & 0x88) == 0x08) {
						buffer[start] = (byte) 129;
					} else if (129 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 129;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GMRK : {
					m.setTripletId(194);
					GMRK obj = (GMRK) m;

					{

						int size = binary_GMRKRG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((194 & 0x88) == 0x08) {
						buffer[start] = (byte) 194;
					} else if (194 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 194;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCMRK : {
					m.setTripletId(130);
					GCMRK obj = (GCMRK) m;

					{

						int size = binary_GCMRKRG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((130 & 0x88) == 0x08) {
						buffer[start] = (byte) 130;
					} else if (130 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 130;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GNOP1 : {
					m.setTripletId(0);
					GNOP1 obj = (GNOP1) m;

					buffer[start] = 0;

					break;
				}

				case AfplibPackage.GPARC : {
					m.setTripletId(227);
					GPARC obj = (GPARC) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (15 + 1 > length)
						length = 15 + 1;

					if (19 + 1 > length)
						length = 19 + 1;

					if (obj.getXPOS() != null) {

						if (obj.getXPOS() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getXPOS());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getYPOS() != null) {

						if (obj.getYPOS() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getYPOS());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getXCENT() != null) {

						if (obj.getXCENT() != null) {
							Saver.saveSigned(buffer, start + 6, start + 7, obj.getXCENT());
						}

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getYCENT() != null) {

						if (obj.getYCENT() != null) {
							Saver.saveSigned(buffer, start + 8, start + 9, obj.getYCENT());
						}

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getMH() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getMH());

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getMFR() != null) {

						Saver.saveUnsigned(buffer, start + 11, start + 11, obj.getMFR());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getSTART() != null) {

						if (obj.getSTART() != null) {
							Saver.saveSigned(buffer, start + 12, start + 15, obj.getSTART());
						}

						if (15 + 1 > length)
							length = 15 + 1;

					}

					if (obj.getSWEEP() != null) {

						if (obj.getSWEEP() != null) {
							Saver.saveSigned(buffer, start + 16, start + 19, obj.getSWEEP());
						}

						if (19 + 1 > length)
							length = 19 + 1;

					}

					if ((227 & 0x88) == 0x08) {
						buffer[start] = (byte) 227;
					} else if (227 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 227;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCPARC : {
					m.setTripletId(163);
					GCPARC obj = (GCPARC) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (6 + 1 > length)
						length = 6 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (15 + 1 > length)
						length = 15 + 1;

					if (obj.getXCENT() != null) {

						if (obj.getXCENT() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getXCENT());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getYCENT() != null) {

						if (obj.getYCENT() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getYCENT());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getMH() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 6, obj.getMH());

						if (6 + 1 > length)
							length = 6 + 1;

					}

					if (obj.getMFR() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 7, obj.getMFR());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getSTART() != null) {

						if (obj.getSTART() != null) {
							Saver.saveSigned(buffer, start + 8, start + 11, obj.getSTART());
						}

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getSWEEP() != null) {

						if (obj.getSWEEP() != null) {
							Saver.saveSigned(buffer, start + 12, start + 15, obj.getSWEEP());
						}

						if (15 + 1 > length)
							length = 15 + 1;

					}

					if ((163 & 0x88) == 0x08) {
						buffer[start] = (byte) 163;
					} else if (163 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 163;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GRLINE : {
					m.setTripletId(225);
					GRLINE obj = (GRLINE) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					{

						int size = binary_GRLINERG(buffer, start + 6, obj.getRg());
						if (6 + size > length)
							length = 6 + size;

					}

					if (obj.getXPOS() != null) {

						if (obj.getXPOS() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getXPOS());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getYPOS() != null) {

						if (obj.getYPOS() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getYPOS());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getRg() != null) {

					}

					if ((225 & 0x88) == 0x08) {
						buffer[start] = (byte) 225;
					} else if (225 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 225;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCRLINE : {
					m.setTripletId(161);
					GCRLINE obj = (GCRLINE) m;

					{

						int size = binary_GCRLINERG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((161 & 0x88) == 0x08) {
						buffer[start] = (byte) 161;
					} else if (161 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 161;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSGCH : {
					m.setTripletId(4);
					GSGCH obj = (GSGCH) m;

					if ((4 & 0x88) == 0x08) {
						buffer[start] = (byte) 4;
					} else if (4 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 4;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSAP : {
					m.setTripletId(34);
					GSAP obj = (GSAP) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (obj.getP() != null) {

						if (obj.getP() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getP());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getQ() != null) {

						if (obj.getQ() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getQ());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getR() != null) {

						if (obj.getR() != null) {
							Saver.saveSigned(buffer, start + 6, start + 7, obj.getR());
						}

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getS() != null) {

						if (obj.getS() != null) {
							Saver.saveSigned(buffer, start + 8, start + 9, obj.getS());
						}

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if ((34 & 0x88) == 0x08) {
						buffer[start] = (byte) 34;
					} else if (34 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 34;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSBMX : {
					m.setTripletId(13);
					GSBMX obj = (GSBMX) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getMODE() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getMODE());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((13 & 0x88) == 0x08) {
						buffer[start] = (byte) 13;
					} else if (13 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 13;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSCA : {
					m.setTripletId(52);
					GSCA obj = (GSCA) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getXPOS() != null) {

						if (obj.getXPOS() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getXPOS());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getYPOS() != null) {

						if (obj.getYPOS() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getYPOS());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if ((52 & 0x88) == 0x08) {
						buffer[start] = (byte) 52;
					} else if (52 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 52;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSCC : {
					m.setTripletId(51);
					GSCC obj = (GSCC) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getCELLWFR() != null) {

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getCELLHFR() != null) {

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getCELLWI() != null) {

						if (obj.getCELLWI() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getCELLWI());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getCELLHI() != null) {

						if (obj.getCELLHI() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getCELLHI());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getCELLWFR() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getCELLWFR());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getCELLHFR() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getCELLHFR());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if ((51 & 0x88) == 0x08) {
						buffer[start] = (byte) 51;
					} else if (51 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 51;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSCD : {
					m.setTripletId(58);
					GSCD obj = (GSCD) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getDIRECTION() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getDIRECTION());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((58 & 0x88) == 0x08) {
						buffer[start] = (byte) 58;
					} else if (58 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 58;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSCR : {
					m.setTripletId(57);
					GSCR obj = (GSCR) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getPREC() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getPREC());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((57 & 0x88) == 0x08) {
						buffer[start] = (byte) 57;
					} else if (57 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 57;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSCS : {
					m.setTripletId(56);
					GSCS obj = (GSCS) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getLCID() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLCID());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((56 & 0x88) == 0x08) {
						buffer[start] = (byte) 56;
					} else if (56 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 56;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSCH : {
					m.setTripletId(53);
					GSCH obj = (GSCH) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getHX() != null) {

						if (obj.getHX() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getHX());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getHY() != null) {

						if (obj.getHY() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getHY());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if ((53 & 0x88) == 0x08) {
						buffer[start] = (byte) 53;
					} else if (53 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 53;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSCOL : {
					m.setTripletId(10);
					GSCOL obj = (GSCOL) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getCOL() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getCOL());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((10 & 0x88) == 0x08) {
						buffer[start] = (byte) 10;
					} else if (10 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 10;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSCP : {
					m.setTripletId(33);
					GSCP obj = (GSCP) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getXPOS() != null) {

						if (obj.getXPOS() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getXPOS());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getYPOS() != null) {

						if (obj.getYPOS() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getYPOS());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if ((33 & 0x88) == 0x08) {
						buffer[start] = (byte) 33;
					} else if (33 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 33;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSECOL : {
					m.setTripletId(38);
					GSECOL obj = (GSECOL) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getCOLOR() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getCOLOR());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if ((38 & 0x88) == 0x08) {
						buffer[start] = (byte) 38;
					} else if (38 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 38;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSFLW : {
					m.setTripletId(17);
					GSFLW obj = (GSFLW) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getMH() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getMH());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getMFR() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getMFR());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if ((17 & 0x88) == 0x08) {
						buffer[start] = (byte) 17;
					} else if (17 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 17;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSLT : {
					m.setTripletId(24);
					GSLT obj = (GSLT) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getLINETYPE() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLINETYPE());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((24 & 0x88) == 0x08) {
						buffer[start] = (byte) 24;
					} else if (24 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 24;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSLW : {
					m.setTripletId(25);
					GSLW obj = (GSLW) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getMH() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getMH());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((25 & 0x88) == 0x08) {
						buffer[start] = (byte) 25;
					} else if (25 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 25;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSMC : {
					m.setTripletId(55);
					GSMC obj = (GSMC) m;

					if (3 + 1 > length)
						length = 3 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (obj.getCELLWI() != null) {

						if (obj.getCELLWI() != null) {
							Saver.saveSigned(buffer, start + 2, start + 3, obj.getCELLWI());
						}

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getCELLHI() != null) {

						if (obj.getCELLHI() != null) {
							Saver.saveSigned(buffer, start + 4, start + 5, obj.getCELLHI());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if ((55 & 0x88) == 0x08) {
						buffer[start] = (byte) 55;
					} else if (55 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 55;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSMP : {
					m.setTripletId(59);
					GSMP obj = (GSMP) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getPREC() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getPREC());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((59 & 0x88) == 0x08) {
						buffer[start] = (byte) 59;
					} else if (59 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 59;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSMS : {
					m.setTripletId(60);
					GSMS obj = (GSMS) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getLCID() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLCID());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((60 & 0x88) == 0x08) {
						buffer[start] = (byte) 60;
					} else if (60 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 60;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSMT : {
					m.setTripletId(41);
					GSMT obj = (GSMT) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getMCPT() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getMCPT());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((41 & 0x88) == 0x08) {
						buffer[start] = (byte) 41;
					} else if (41 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 41;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSMX : {
					m.setTripletId(12);
					GSMX obj = (GSMX) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getMODE() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getMODE());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((12 & 0x88) == 0x08) {
						buffer[start] = (byte) 12;
					} else if (12 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 12;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSPS : {
					m.setTripletId(8);
					GSPS obj = (GSPS) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getLCID() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLCID());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((8 & 0x88) == 0x08) {
						buffer[start] = (byte) 8;
					} else if (8 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 8;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSPT : {
					m.setTripletId(40);
					GSPT obj = (GSPT) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getPATT() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getPATT());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((40 & 0x88) == 0x08) {
						buffer[start] = (byte) 40;
					} else if (40 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 40;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSPCOL : {
					m.setTripletId(178);
					GSPCOL obj = (GSPCOL) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (obj.getRES1() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getRES1());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getCOLSPCE() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getCOLSPCE());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getRES2() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 7, obj.getRES2());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getCOLSIZE1() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 8, obj.getCOLSIZE1());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getCOLSIZE2() != null) {

						Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getCOLSIZE2());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getCOLSIZE3() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getCOLSIZE3());

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getCOLSIZE4() != null) {

						Saver.saveUnsigned(buffer, start + 11, start + 11, obj.getCOLSIZE4());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getCOLVALUE() != null) {

						{
							int size = Saver.save(buffer, start + 12, obj.getCOLVALUE());
							if (12 + size > length)
								length = 12 + size;
						}

					}

					if ((178 & 0x88) == 0x08) {
						buffer[start] = (byte) 178;
					} else if (178 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 178;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSLE : {
					m.setTripletId(26);
					GSLE obj = (GSLE) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getLINEEND() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLINEEND());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((26 & 0x88) == 0x08) {
						buffer[start] = (byte) 26;
					} else if (26 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 26;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GSLJ : {
					m.setTripletId(27);
					GSLJ obj = (GSLJ) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getLINEJOIN() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLINEJOIN());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if ((27 & 0x88) == 0x08) {
						buffer[start] = (byte) 27;
					} else if (27 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 27;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCBEZ : {
					m.setTripletId(229);
					GCBEZ obj = (GCBEZ) m;

					{

						int size = binary_GCBEZRG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((229 & 0x88) == 0x08) {
						buffer[start] = (byte) 229;
					} else if (229 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 229;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.GCCBEZ : {
					m.setTripletId(165);
					GCCBEZ obj = (GCCBEZ) m;

					{

						int size = binary_GCCBEZRG(buffer, start + 2, obj.getRg());
						if (2 + size > length)
							length = 2 + size;

					}

					if (obj.getRg() != null) {

					}

					if ((165 & 0x88) == 0x08) {
						buffer[start] = (byte) 165;
					} else if (165 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 165;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.WINDOW_SPECIFICATION : {
					m.setTripletId(246);
					WindowSpecification obj = (WindowSpecification) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (5 + 1 > length)
						length = 5 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (11 + 1 > length)
						length = 11 + 1;

					if (13 + 1 > length)
						length = 13 + 1;

					if (15 + 1 > length)
						length = 15 + 1;

					if (17 + 1 > length)
						length = 17 + 1;

					if (19 + 1 > length)
						length = 19 + 1;

					if (obj.getFLAGS() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getFLAGS());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRES3() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getRES3());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getCFORMAT() != null) {

						Saver.saveUnsigned(buffer, start + 4, start + 4, obj.getCFORMAT());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getUBASE() != null) {

						Saver.saveUnsigned(buffer, start + 5, start + 5, obj.getUBASE());

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getXRESOL() != null) {

						Saver.saveUnsigned(buffer, start + 6, start + 7, obj.getXRESOL());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getYRESOL() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 9, obj.getYRESOL());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getIMGXYRES() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 11, obj.getIMGXYRES());

						if (11 + 1 > length)
							length = 11 + 1;

					}

					if (obj.getXLWIND() != null) {

						if (obj.getXLWIND() != null) {
							Saver.saveSigned(buffer, start + 12, start + 13, obj.getXLWIND());
						}

						if (13 + 1 > length)
							length = 13 + 1;

					}

					if (obj.getXRWIND() != null) {

						if (obj.getXRWIND() != null) {
							Saver.saveSigned(buffer, start + 14, start + 15, obj.getXRWIND());
						}

						if (15 + 1 > length)
							length = 15 + 1;

					}

					if (obj.getYBWIND() != null) {

						if (obj.getYBWIND() != null) {
							Saver.saveSigned(buffer, start + 16, start + 17, obj.getYBWIND());
						}

						if (17 + 1 > length)
							length = 17 + 1;

					}

					if (obj.getYTWIND() != null) {

						if (obj.getYTWIND() != null) {
							Saver.saveSigned(buffer, start + 18, start + 19, obj.getYTWIND());
						}

						if (19 + 1 > length)
							length = 19 + 1;

					}

					if ((246 & 0x88) == 0x08) {
						buffer[start] = (byte) 246;
					} else if (246 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 246;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				case AfplibPackage.DRAWING_ORDER_SUBSET : {
					m.setTripletId(247);
					DrawingOrderSubset obj = (DrawingOrderSubset) m;

					if ((247 & 0x88) == 0x08) {
						buffer[start] = (byte) 247;
					} else if (247 == 0xfe) {
						// extended - unsupported
					} else {
						if (length == 0)
							length = 2;
						buffer[start] = (byte) 247;
						buffer[start + 1] = (byte) (length - 2);
					}

					break;
				}

				default :
					throw new IllegalArgumentException("unknown triplet: " + m);
			}
			start += length;
		}

		return start - bstart;
	}

	int binary_cs(byte[] buffer, int bstart, List<Triplet> triplets) {
		int start = bstart;

		boolean nextCSisUnChained = true;
		Triplet lastTriplet = triplets.size() == 0 ? null : triplets.get(triplets.size() - 1);

		for (Triplet m : triplets) {
			int length = 0;

			if (nextCSisUnChained) {
				buffer[start] = (byte) 0x2b;
				buffer[start + 1] = (byte) 0xd3;
				start += 2;
				nextCSisUnChained = false;
			}

			start++; // length is not considered to be part of cs -> model error

			switch (m.eClass().getClassifierID()) {

				case AfplibPackage.AMB : {
					m.setTripletId(210);
					AMB obj = (AMB) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getDSPLCMNT() != null) {

						if (obj.getDSPLCMNT() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getDSPLCMNT());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(210 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(210 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.AMI : {
					m.setTripletId(198);
					AMI obj = (AMI) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getDSPLCMNT() != null) {

						if (obj.getDSPLCMNT() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getDSPLCMNT());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(198 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(198 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.BLN : {
					m.setTripletId(216);
					BLN obj = (BLN) m;

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(216 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(216 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.BSU : {
					m.setTripletId(242);
					BSU obj = (BSU) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getLID() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLID());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(242 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(242 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.DBR : {
					m.setTripletId(230);
					DBR obj = (DBR) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getRWIDTH() != null) {

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getRWIDTHFRACTION() != null) {

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getRLENGTH() != null) {

						if (obj.getRLENGTH() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getRLENGTH());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRWIDTH() != null) {

						if (obj.getRWIDTH() != null) {
							Saver.saveSigned(buffer, start + 3, start + 4, obj.getRWIDTH());
						}

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getRWIDTHFRACTION() != null) {

						if (obj.getRWIDTHFRACTION() != null) {
							Saver.saveSigned(buffer, start + 5, start + 5, obj.getRWIDTHFRACTION());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(230 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(230 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.DIR : {
					m.setTripletId(228);
					DIR obj = (DIR) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getRWIDTH() != null) {

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getRWIDTHFRACTION() != null) {

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (obj.getRLENGTH() != null) {

						if (obj.getRLENGTH() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getRLENGTH());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRWIDTH() != null) {

						if (obj.getRWIDTH() != null) {
							Saver.saveSigned(buffer, start + 3, start + 4, obj.getRWIDTH());
						}

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getRWIDTHFRACTION() != null) {

						if (obj.getRWIDTHFRACTION() != null) {
							Saver.saveSigned(buffer, start + 5, start + 5, obj.getRWIDTHFRACTION());
						}

						if (5 + 1 > length)
							length = 5 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(228 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(228 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.ESU : {
					m.setTripletId(244);
					ESU obj = (ESU) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getLID() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLID());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(244 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(244 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.NOPCS : {
					m.setTripletId(248);
					NOPCS obj = (NOPCS) m;

					if (obj.getIGNDATA() != null) {

					}

					if (obj.getIGNDATA() != null) {

						{
							int size = Saver.save(buffer, start + 1, obj.getIGNDATA());
							if (1 + size > length)
								length = 1 + size;
						}

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(248 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(248 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.OVS : {
					m.setTripletId(114);
					OVS obj = (OVS) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (3 + 1 > length)
						length = 3 + 1;

					if (obj.getBYPSIDEN() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getBYPSIDEN());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if (obj.getOVERCHAR() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 3, obj.getOVERCHAR());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(114 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(114 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.RMB : {
					m.setTripletId(212);
					RMB obj = (RMB) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getINCRMENT() != null) {

						if (obj.getINCRMENT() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getINCRMENT());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(212 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(212 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.RMI : {
					m.setTripletId(200);
					RMI obj = (RMI) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getINCRMENT() != null) {

						if (obj.getINCRMENT() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getINCRMENT());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(200 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(200 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.RPS : {
					m.setTripletId(238);
					RPS obj = (RPS) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getRPTDATA() != null) {

					}

					if (obj.getRLENGTH() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 2, obj.getRLENGTH());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getRPTDATA() != null) {

						{
							int size = Saver.save(buffer, start + 3, obj.getRPTDATA(), charset);
							if (3 + size > length)
								length = 3 + size;
						}

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(238 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(238 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.SBI : {
					m.setTripletId(208);
					SBI obj = (SBI) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getINCRMENT() != null) {

						if (obj.getINCRMENT() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getINCRMENT());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(208 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(208 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.SCFL : {
					m.setTripletId(240);
					SCFL obj = (SCFL) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getLID() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getLID());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(240 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(240 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.SEC : {
					m.setTripletId(128);
					SEC obj = (SEC) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (2 + 1 > length)
						length = 2 + 1;

					if (7 + 1 > length)
						length = 7 + 1;

					if (8 + 1 > length)
						length = 8 + 1;

					if (9 + 1 > length)
						length = 9 + 1;

					if (10 + 1 > length)
						length = 10 + 1;

					if (obj.getCOLVALUE() != null) {

					}

					if (obj.getRESERVED() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getRESERVED());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if (obj.getCOLSPCE() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getCOLSPCE());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getCOLSIZE1() != null) {

						Saver.saveUnsigned(buffer, start + 7, start + 7, obj.getCOLSIZE1());

						if (7 + 1 > length)
							length = 7 + 1;

					}

					if (obj.getCOLSIZE2() != null) {

						Saver.saveUnsigned(buffer, start + 8, start + 8, obj.getCOLSIZE2());

						if (8 + 1 > length)
							length = 8 + 1;

					}

					if (obj.getCOLSIZE3() != null) {

						Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getCOLSIZE3());

						if (9 + 1 > length)
							length = 9 + 1;

					}

					if (obj.getCOLSIZE4() != null) {

						Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getCOLSIZE4());

						if (10 + 1 > length)
							length = 10 + 1;

					}

					if (obj.getCOLVALUE() != null) {

						{
							int size = Saver.save(buffer, start + 11, obj.getCOLVALUE());
							if (11 + size > length)
								length = 11 + size;
						}

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(128 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(128 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.SIA : {
					m.setTripletId(194);
					SIA obj = (SIA) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getDIRCTION() != null) {

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getADJSTMNT() != null) {

						if (obj.getADJSTMNT() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getADJSTMNT());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getDIRCTION() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getDIRCTION());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(194 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(194 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.SIM : {
					m.setTripletId(192);
					SIM obj = (SIM) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getDSPLCMNT() != null) {

						if (obj.getDSPLCMNT() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getDSPLCMNT());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(192 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(192 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.STC : {
					m.setTripletId(116);
					STC obj = (STC) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getPRECSION() != null) {

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (obj.getFRGCOLOR() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 2, obj.getFRGCOLOR());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getPRECSION() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 3, obj.getPRECSION());

						if (3 + 1 > length)
							length = 3 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(116 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(116 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.STO : {
					m.setTripletId(246);
					STO obj = (STO) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (4 + 1 > length)
						length = 4 + 1;

					if (obj.getIORNTION() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 2, obj.getIORNTION());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getBORNTION() != null) {

						Saver.saveUnsigned(buffer, start + 3, start + 4, obj.getBORNTION());

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(246 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(246 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.SVI : {
					m.setTripletId(196);
					SVI obj = (SVI) m;

					if (2 + 1 > length)
						length = 2 + 1;

					if (obj.getINCRMENT() != null) {

						if (obj.getINCRMENT() != null) {
							Saver.saveSigned(buffer, start + 1, start + 2, obj.getINCRMENT());
						}

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(196 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(196 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.TBM : {
					m.setTripletId(120);
					TBM obj = (TBM) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getPRECSION() != null) {

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getINCRMENT() != null) {

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (obj.getDIRCTION() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getDIRCTION());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if (obj.getPRECSION() != null) {

						Saver.saveUnsigned(buffer, start + 2, start + 2, obj.getPRECSION());

						if (2 + 1 > length)
							length = 2 + 1;

					}

					if (obj.getINCRMENT() != null) {

						if (obj.getINCRMENT() != null) {
							Saver.saveSigned(buffer, start + 3, start + 4, obj.getINCRMENT());
						}

						if (4 + 1 > length)
							length = 4 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(120 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(120 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.TRN : {
					m.setTripletId(218);
					TRN obj = (TRN) m;

					if (obj.getTRNDATA() != null) {

						{
							int size = Saver.save(buffer, start + 1, obj.getTRNDATA());
							if (1 + size > length)
								length = 1 + size;
						}

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(218 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(218 | 0x01)[0]; // chain it
					}
					break;
				}

				case AfplibPackage.USC : {
					m.setTripletId(118);
					USC obj = (USC) m;

					if (1 + 1 > length)
						length = 1 + 1;

					if (obj.getBYPSIDEN() != null) {

						Saver.saveUnsigned(buffer, start + 1, start + 1, obj.getBYPSIDEN());

						if (1 + 1 > length)
							length = 1 + 1;

					}

					if (length == 0)
						length = 1;
					buffer[start - 1] = Data.toUnsignedByte(length + 1)[0]; // include type
					if (lastTriplet.equals(m)) {
						buffer[start] = Data.toUnsignedByte(118 & 0xfe)[0]; // unchain it
						nextCSisUnChained = true;
					} else {
						buffer[start] = Data.toUnsignedByte(118 | 0x01)[0]; // chain it
					}
					break;
				}

				default :
					throw new IllegalArgumentException("unknown triplet: " + m);
			}
			start += length;
		}

		return start - bstart;
	}

	public int binary(byte[] buffer, int start, SF sf) {
		int length = 9;
		if (sf instanceof UNKNSF) {
			System.arraycopy(sf.getRawData(), 0, buffer, start, sf.getRawData().length);
			length = sf.getRawData().length - 2;
			return length;
		}
		switch (sf.eClass().getClassifierID()) {

			case AfplibPackage.BAG : {
				sf.setId(13871305);
				BAG obj = (BAG) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getAEGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getAEGName() != null) {

					if (obj.getAEGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getAEGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BBC : {
				sf.setId(13871339);
				BBC obj = (BBC) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getBCdoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getBCdoName() != null) {

					if (obj.getBCdoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getBCdoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BCA : {
				sf.setId(13871223);
				BCA obj = (BCA) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getCATName() != null) {

					if (obj.getCATName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getCATName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BCF : {
				sf.setId(13871242);
				BCF obj = (BCF) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getRSName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getRSName() != null) {

					if (obj.getRSName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRSName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.BCP : {
				sf.setId(13871239);
				BCP obj = (BCP) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getRSName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getRSName() != null) {

					if (obj.getRSName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRSName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BDA : {
				sf.setId(13889259);
				BDA obj = (BDA) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (11 + 1 > length)
					length = 11 + 1;

				if (13 + 1 > length)
					length = 13 + 1;

				if (obj.getFlags() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getFlags());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getXoffset() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 11, obj.getXoffset());

					if (11 + 1 > length)
						length = 11 + 1;

				}

				if (obj.getYoffset() != null) {

					Saver.saveUnsigned(buffer, start + 12, start + 13, obj.getYoffset());

					if (13 + 1 > length)
						length = 13 + 1;

				}

				if (obj.getData() != null) {

					{
						int size = Saver.save(buffer, start + 14, obj.getData());
						if (14 + size > length)
							length = 14 + size;
					}

				}

				return length;
			}

			case AfplibPackage.BDD : {
				sf.setId(13870827);
				BDD obj = (BDD) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (16 + 1 > length)
					length = 16 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (21 + 1 > length)
					length = 21 + 1;

				if (22 + 1 > length)
					length = 22 + 1;

				if (23 + 1 > length)
					length = 23 + 1;

				if (25 + 1 > length)
					length = 25 + 1;

				if (26 + 1 > length)
					length = 26 + 1;

				if (28 + 1 > length)
					length = 28 + 1;

				if (29 + 1 > length)
					length = 29 + 1;

				if (31 + 1 > length)
					length = 31 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 32, obj.getTriplets());
						if (32 + size > length)
							length = 32 + size;

					}

				}

				if (obj.getUBASE() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getUBASE());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getReserved() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getReserved());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getXUPUB() != null) {

					Saver.saveUnsigned(buffer, start + 11, start + 12, obj.getXUPUB());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getYUPUB() != null) {

					Saver.saveUnsigned(buffer, start + 13, start + 14, obj.getYUPUB());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getXEXTENT() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 16, obj.getXEXTENT());

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getYEXTENT() != null) {

					Saver.saveUnsigned(buffer, start + 17, start + 18, obj.getYEXTENT());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getReserved2() != null) {

					Saver.saveUnsigned(buffer, start + 19, start + 20, obj.getReserved2());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getTYPE() != null) {

					Saver.saveUnsigned(buffer, start + 21, start + 21, obj.getTYPE());

					if (21 + 1 > length)
						length = 21 + 1;

				}

				if (obj.getMOD() != null) {

					Saver.saveUnsigned(buffer, start + 22, start + 22, obj.getMOD());

					if (22 + 1 > length)
						length = 22 + 1;

				}

				if (obj.getLID() != null) {

					Saver.saveUnsigned(buffer, start + 23, start + 23, obj.getLID());

					if (23 + 1 > length)
						length = 23 + 1;

				}

				if (obj.getCOLOR() != null) {

					Saver.saveUnsigned(buffer, start + 24, start + 25, obj.getCOLOR());

					if (25 + 1 > length)
						length = 25 + 1;

				}

				if (obj.getMODULEWIDTH() != null) {

					Saver.saveUnsigned(buffer, start + 26, start + 26, obj.getMODULEWIDTH());

					if (26 + 1 > length)
						length = 26 + 1;

				}

				if (obj.getELEMENTHEIGHT() != null) {

					Saver.saveUnsigned(buffer, start + 27, start + 28, obj.getELEMENTHEIGHT());

					if (28 + 1 > length)
						length = 28 + 1;

				}

				if (obj.getMULT() != null) {

					Saver.saveUnsigned(buffer, start + 29, start + 29, obj.getMULT());

					if (29 + 1 > length)
						length = 29 + 1;

				}

				if (obj.getWENE() != null) {

					Saver.saveUnsigned(buffer, start + 30, start + 31, obj.getWENE());

					if (31 + 1 > length)
						length = 31 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BDG : {
				sf.setId(13871300);
				BDG obj = (BDG) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getDEGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getDEGName() != null) {

					if (obj.getDEGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getDEGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BDI : {
				sf.setId(13871271);
				BDI obj = (BDI) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getIndxName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getIndxName() != null) {

					if (obj.getIndxName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getIndxName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BDM : {
				sf.setId(13871306);
				BDM obj = (BDM) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (17 + 1 > length)
					length = 17 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 18, obj.getTriplets());
						if (18 + size > length)
							length = 18 + size;

					}

				}

				if (obj.getDMName() != null) {

					if (obj.getDMName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getDMName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getDatFmt() != null) {

					Saver.saveUnsigned(buffer, start + 17, start + 17, obj.getDatFmt());

					if (17 + 1 > length)
						length = 17 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BDT : {
				sf.setId(13871272);
				BDT obj = (BDT) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 19, obj.getTriplets());
						if (19 + size > length)
							length = 19 + size;

					}

				}

				if (obj.getDocName() != null) {

					if (obj.getDocName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getDocName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getReserved() != null) {

					Saver.saveUnsigned(buffer, start + 17, start + 18, obj.getReserved());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BDX : {
				sf.setId(13871331);
				BDX obj = (BDX) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getDMXName() != null) {

					if (obj.getDMXName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getDMXName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.BFG : {
				sf.setId(13871301);
				BFG obj = (BFG) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getFEGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getFEGName() != null) {

					if (obj.getFEGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getFEGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.BFM : {
				sf.setId(13871309);
				BFM obj = (BFM) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getFMName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getFMName() != null) {

					if (obj.getFMName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getFMName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BFN : {
				sf.setId(13871241);
				BFN obj = (BFN) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getRSName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getRSName() != null) {

					if (obj.getRSName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRSName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BGR : {
				sf.setId(13871291);
				BGR obj = (BGR) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getGdoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getGdoName() != null) {

					if (obj.getGdoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getGdoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BII : {
				sf.setId(13871227);
				BII obj = (BII) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getImoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getImoName() != null) {

					if (obj.getImoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getImoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.BIM : {
				sf.setId(13871355);
				BIM obj = (BIM) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getIdoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getIdoName() != null) {

					if (obj.getIdoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getIdoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BMM : {
				sf.setId(13871308);
				BMM obj = (BMM) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getMMName() != null) {

					if (obj.getMMName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getMMName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BMO : {
				sf.setId(13871327);
				BMO obj = (BMO) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getOvlyName() != null) {

					if (obj.getOvlyName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getOvlyName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BNG : {
				sf.setId(13871277);
				BNG obj = (BNG) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getPGrpName() != null) {

					if (obj.getPGrpName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPGrpName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BOC : {
				sf.setId(13871250);
				BOC obj = (BOC) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				{

					int size = binary_triplets(buffer, start + 17, obj.getTriplets());
					if (17 + size > length)
						length = 17 + size;

				}

				if (obj.getObjCName() != null) {

					if (obj.getObjCName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getObjCName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BOG : {
				sf.setId(13871303);
				BOG obj = (BOG) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getOEGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getOEGName() != null) {

					if (obj.getOEGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getOEGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BPF : {
				sf.setId(13871269);
				BPF obj = (BPF) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getPFName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getPFName() != null) {

					if (obj.getPFName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPFName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BPG : {
				sf.setId(13871279);
				BPG obj = (BPG) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getPageName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getPageName() != null) {

					if (obj.getPageName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPageName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BPM : {
				sf.setId(13871307);
				BPM obj = (BPM) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getPMName() != null) {

					if (obj.getPMName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPMName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.BPS : {
				sf.setId(13871199);
				BPS obj = (BPS) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getPsegName() != null) {

					if (obj.getPsegName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPsegName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BPT : {
				sf.setId(13871259);
				BPT obj = (BPT) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getPTdoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getPTdoName() != null) {

					if (obj.getPTdoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPTdoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BRG : {
				sf.setId(13871302);
				BRG obj = (BRG) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getRGrpName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getRGrpName() != null) {

					if (obj.getRGrpName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRGrpName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BRS : {
				sf.setId(13871310);
				BRS obj = (BRS) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				{

					int size = binary_triplets(buffer, start + 19, obj.getTriplets());
					if (19 + size > length)
						length = 19 + size;

				}

				if (obj.getRSName() != null) {

					if (obj.getRSName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRSName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.BSG : {
				sf.setId(13871321);
				BSG obj = (BSG) sf;

				charsets.push(charset);
				charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getREGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getREGName() != null) {

					if (obj.getREGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getREGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.CAT : {
				sf.setId(13873271);
				CAT obj = (CAT) sf;

				if (obj.getCATData() != null) {

				}

				if (obj.getCATData() != null) {

					{
						int size = Saver.save(buffer, start + 9, obj.getCATData());
						if (9 + size > length)
							length = 9 + size;
					}

				}

				return length;
			}

			case AfplibPackage.CDD : {
				sf.setId(13870738);
				CDD obj = (CDD) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (17 + 1 > length)
					length = 17 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 21, obj.getTriplets());
						if (21 + size > length)
							length = 21 + size;

					}

				}

				if (obj.getXocBase() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getXocBase());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getYocBase() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getYocBase());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getXocUnits() != null) {

					Saver.saveUnsigned(buffer, start + 11, start + 12, obj.getXocUnits());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getYocUnits() != null) {

					Saver.saveUnsigned(buffer, start + 13, start + 14, obj.getYocUnits());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getXocSize() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 17, obj.getXocSize());

					if (17 + 1 > length)
						length = 17 + 1;

				}

				if (obj.getYocSize() != null) {

					Saver.saveUnsigned(buffer, start + 18, start + 20, obj.getYocSize());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.CFC : {
				sf.setId(13870986);
				CFC obj = (CFC) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 11, obj.getTriplets());
						if (11 + size > length)
							length = 11 + size;

					}

				}

				if (obj.getCFIRGLen() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getCFIRGLen());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getRetired1() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getRetired1());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.CFI : {
				sf.setId(13864074);
				CFI obj = (CFI) sf;

				{

					int size = binary_CFIRG(buffer, start + 9, obj.getFixedLengthRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getFixedLengthRG() != null) {

				}

				return length;
			}

			case AfplibPackage.CPC : {
				sf.setId(13870983);
				CPC obj = (CPC) sf;

				if (16 + 1 > length)
					length = 16 + 1;

				if (17 + 1 > length)
					length = 17 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (19 + 1 > length)
					length = 19 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (21 + 1 > length)
					length = 21 + 1;

				if (obj.getDefCharID() != null) {

					if (obj.getDefCharID() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getDefCharID(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getPrtFlags() != null) {

					Saver.saveUnsigned(buffer, start + 17, start + 17, obj.getPrtFlags());

					if (17 + 1 > length)
						length = 17 + 1;

				}

				if (obj.getCPIRGLen() != null) {

					Saver.saveUnsigned(buffer, start + 18, start + 18, obj.getCPIRGLen());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getVSCharSN() != null) {

					Saver.saveUnsigned(buffer, start + 19, start + 19, obj.getVSCharSN());

					if (19 + 1 > length)
						length = 19 + 1;

				}

				if (obj.getVSChar() != null) {

					Saver.saveUnsigned(buffer, start + 20, start + 20, obj.getVSChar());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getVSFlags() != null) {

					Saver.saveUnsigned(buffer, start + 21, start + 21, obj.getVSFlags());

					if (21 + 1 > length)
						length = 21 + 1;

				}

				return length;
			}

			case AfplibPackage.CPD : {
				sf.setId(13870727);
				CPD obj = (CPD) sf;

				if (40 + 1 > length)
					length = 40 + 1;

				if (42 + 1 > length)
					length = 42 + 1;

				if (46 + 1 > length)
					length = 46 + 1;

				if (48 + 1 > length)
					length = 48 + 1;

				if (50 + 1 > length)
					length = 50 + 1;

				if (obj.getEncScheme() != null) {

					if (52 + 1 > length)
						length = 52 + 1;

				}

				if (obj.getCPDesc() != null) {

					if (obj.getCPDesc() != null) {
						Saver.save(buffer, start + 9, start + 40, obj.getCPDesc(), Charset.forName("IBM500"));
					}

					if (40 + 1 > length)
						length = 40 + 1;

				}

				if (obj.getGCGIDLen() != null) {

					Saver.saveUnsigned(buffer, start + 41, start + 42, obj.getGCGIDLen());

					if (42 + 1 > length)
						length = 42 + 1;

				}

				if (obj.getNumCdPts() != null) {

					Saver.saveUnsigned(buffer, start + 43, start + 46, obj.getNumCdPts());

					if (46 + 1 > length)
						length = 46 + 1;

				}

				if (obj.getGCSGID() != null) {

					Saver.saveUnsigned(buffer, start + 47, start + 48, obj.getGCSGID());

					if (48 + 1 > length)
						length = 48 + 1;

				}

				if (obj.getCPGID() != null) {

					Saver.saveUnsigned(buffer, start + 49, start + 50, obj.getCPGID());

					if (50 + 1 > length)
						length = 50 + 1;

				}

				if (obj.getEncScheme() != null) {

					Saver.saveUnsigned(buffer, start + 51, start + 52, obj.getEncScheme());

					if (52 + 1 > length)
						length = 52 + 1;

				}

				return length;
			}

			case AfplibPackage.CPI : {
				sf.setId(13864071);
				CPI obj = (CPI) sf;

				{

					int size = binary_CPIRG(buffer, start + 9, obj.getRg());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRg() != null) {

				}

				return length;
			}

			case AfplibPackage.CTC : {
				sf.setId(13871003);
				CTC obj = (CTC) sf;

				if (18 + 1 > length)
					length = 18 + 1;

				if (obj.getConData() != null) {

					if (obj.getConData() != null) {
						Saver.save(buffer, start + 9, start + 18, obj.getConData());
					}

					if (18 + 1 > length)
						length = 18 + 1;

				}

				return length;
			}

			case AfplibPackage.DXD : {
				sf.setId(13870819);
				DXD obj = (DXD) sf;

				return length;
			}

			case AfplibPackage.EAG : {
				sf.setId(13871561);
				EAG obj = (EAG) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getAEGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getAEGName() != null) {

					if (obj.getAEGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getAEGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EBC : {
				sf.setId(13871595);
				EBC obj = (EBC) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getBCdoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getBCdoName() != null) {

					if (obj.getBCdoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getBCdoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.ECA : {
				sf.setId(13871479);
				ECA obj = (ECA) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getCATName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getCATName() != null) {

					if (obj.getCATName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getCATName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.ECF : {
				sf.setId(13871498);
				ECF obj = (ECF) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getRSName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getRSName() != null) {

					if (obj.getRSName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRSName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.ECP : {
				sf.setId(13871495);
				ECP obj = (ECP) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getRSName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getRSName() != null) {

					if (obj.getRSName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRSName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EDG : {
				sf.setId(13871556);
				EDG obj = (EDG) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getDEGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getDEGName() != null) {

					if (obj.getDEGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getDEGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EDI : {
				sf.setId(13871527);
				EDI obj = (EDI) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getIndxName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getIndxName() != null) {

					if (obj.getIndxName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getIndxName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.EDM : {
				sf.setId(13871562);
				EDM obj = (EDM) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getDMName() != null) {

					if (obj.getDMName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getDMName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EDT : {
				sf.setId(13871528);
				EDT obj = (EDT) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getDocName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getDocName() != null) {

					if (obj.getDocName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getDocName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.EDX : {
				sf.setId(13871587);
				EDX obj = (EDX) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getDMXName() != null) {

					if (obj.getDMXName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getDMXName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EFG : {
				sf.setId(13871557);
				EFG obj = (EFG) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getFEGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getFEGName() != null) {

					if (obj.getFEGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getFEGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EFM : {
				sf.setId(13871565);
				EFM obj = (EFM) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getFMName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getFMName() != null) {

					if (obj.getFMName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getFMName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EFN : {
				sf.setId(13871497);
				EFN obj = (EFN) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getRSName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getRSName() != null) {

					if (obj.getRSName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRSName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EGR : {
				sf.setId(13871547);
				EGR obj = (EGR) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getGdoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getGdoName() != null) {

					if (obj.getGdoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getGdoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.EII : {
				sf.setId(13871483);
				EII obj = (EII) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getImoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getImoName() != null) {

					if (obj.getImoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getImoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EIM : {
				sf.setId(13871611);
				EIM obj = (EIM) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getIdoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getIdoName() != null) {

					if (obj.getIdoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getIdoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.EMM : {
				sf.setId(13871564);
				EMM obj = (EMM) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getMMName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getMMName() != null) {

					if (obj.getMMName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getMMName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EMO : {
				sf.setId(13871583);
				EMO obj = (EMO) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getOvlyName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getOvlyName() != null) {

					if (obj.getOvlyName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getOvlyName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.ENG : {
				sf.setId(13871533);
				ENG obj = (ENG) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getPGrpName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getPGrpName() != null) {

					if (obj.getPGrpName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPGrpName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.EOC : {
				sf.setId(13871506);
				EOC obj = (EOC) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getObjCName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getObjCName() != null) {

					if (obj.getObjCName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getObjCName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.EOG : {
				sf.setId(13871559);
				EOG obj = (EOG) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getOEGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getOEGName() != null) {

					if (obj.getOEGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getOEGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EPF : {
				sf.setId(13871525);
				EPF obj = (EPF) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getPFName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getPFName() != null) {

					if (obj.getPFName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPFName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.EPG : {
				sf.setId(13871535);
				EPG obj = (EPG) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getPageName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getPageName() != null) {

					if (obj.getPageName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPageName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.EPM : {
				sf.setId(13871563);
				EPM obj = (EPM) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getPMName() != null) {

					if (obj.getPMName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPMName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EPS : {
				sf.setId(13871455);
				EPS obj = (EPS) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getPsegName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getPsegName() != null) {

					if (obj.getPsegName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPsegName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.EPT : {
				sf.setId(13871515);
				EPT obj = (EPT) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getPTdoName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getPTdoName() != null) {

					if (obj.getPTdoName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPTdoName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.ERG : {
				sf.setId(13871558);
				ERG obj = (ERG) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getRGrpName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getRGrpName() != null) {

					if (obj.getRGrpName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRGrpName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.ERS : {
				sf.setId(13871566);
				ERS obj = (ERS) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getRSName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getRSName() != null) {

					if (obj.getRSName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getRSName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.ESG : {
				sf.setId(13871577);
				ESG obj = (ESG) sf;

				if (!charsets.isEmpty())
					charset = charsets.pop();
				else
					charset = CodepageHelper.CHARSET_IBM500;

				if (obj.getREGName() != null) {

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getREGName() != null) {

					if (obj.getREGName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getREGName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				return length;
			}

			case AfplibPackage.FNC : {
				sf.setId(13870985);
				FNC obj = (FNC) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (11 + 1 > length)
					length = 11 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (13 + 1 > length)
					length = 13 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (16 + 1 > length)
					length = 16 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (22 + 1 > length)
					length = 22 + 1;

				if (23 + 1 > length)
					length = 23 + 1;

				if (24 + 1 > length)
					length = 24 + 1;

				if (25 + 1 > length)
					length = 25 + 1;

				if (28 + 1 > length)
					length = 28 + 1;

				if (29 + 1 > length)
					length = 29 + 1;

				if (30 + 1 > length)
					length = 30 + 1;

				if (obj.getResXUBase() != null) {

					if (31 + 1 > length)
						length = 31 + 1;

				}

				if (obj.getResYUBase() != null) {

					if (32 + 1 > length)
						length = 32 + 1;

				}

				if (obj.getXfrUnits() != null) {

					if (34 + 1 > length)
						length = 34 + 1;

				}

				if (obj.getYfrUnits() != null) {

					if (36 + 1 > length)
						length = 36 + 1;

				}

				if (obj.getOPatDCnt() != null) {

					if (40 + 1 > length)
						length = 40 + 1;

				}

				if (obj.getReserved2() != null) {

					if (43 + 1 > length)
						length = 43 + 1;

				}

				if (obj.getFNNRGLen() != null) {

					if (44 + 1 > length)
						length = 44 + 1;

				}

				if (obj.getFNNDCnt() != null) {

					if (48 + 1 > length)
						length = 48 + 1;

				}

				if (obj.getFNNMapCnt() != null) {

					if (50 + 1 > length)
						length = 50 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 51, obj.getTriplets());
						if (51 + size > length)
							length = 51 + size;

					}

				}

				if (obj.getRetired() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getRetired());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getPatTech() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getPatTech());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getReserved1() != null) {

					if (obj.getReserved1() != null) {
						Saver.save(buffer, start + 11, start + 11, obj.getReserved1());
					}

					if (11 + 1 > length)
						length = 11 + 1;

				}

				if (obj.getFntFlags() != null) {

					Saver.saveUnsigned(buffer, start + 12, start + 12, obj.getFntFlags());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getXUnitBase() != null) {

					Saver.saveUnsigned(buffer, start + 13, start + 13, obj.getXUnitBase());

					if (13 + 1 > length)
						length = 13 + 1;

				}

				if (obj.getYUnitBase() != null) {

					Saver.saveUnsigned(buffer, start + 14, start + 14, obj.getYUnitBase());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getXftUnits() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 16, obj.getXftUnits());

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getYftUnits() != null) {

					Saver.saveUnsigned(buffer, start + 17, start + 18, obj.getYftUnits());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getMaxBoxWd() != null) {

					Saver.saveUnsigned(buffer, start + 19, start + 20, obj.getMaxBoxWd());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getMaxBoxHt() != null) {

					Saver.saveUnsigned(buffer, start + 21, start + 22, obj.getMaxBoxHt());

					if (22 + 1 > length)
						length = 22 + 1;

				}

				if (obj.getFNORGLen() != null) {

					Saver.saveUnsigned(buffer, start + 23, start + 23, obj.getFNORGLen());

					if (23 + 1 > length)
						length = 23 + 1;

				}

				if (obj.getFNIRGLen() != null) {

					Saver.saveUnsigned(buffer, start + 24, start + 24, obj.getFNIRGLen());

					if (24 + 1 > length)
						length = 24 + 1;

				}

				if (obj.getPatAlign() != null) {

					Saver.saveUnsigned(buffer, start + 25, start + 25, obj.getPatAlign());

					if (25 + 1 > length)
						length = 25 + 1;

				}

				if (obj.getRPatDCnt() != null) {

					Saver.saveUnsigned(buffer, start + 26, start + 28, obj.getRPatDCnt());

					if (28 + 1 > length)
						length = 28 + 1;

				}

				if (obj.getFNPRGLen() != null) {

					Saver.saveUnsigned(buffer, start + 29, start + 29, obj.getFNPRGLen());

					if (29 + 1 > length)
						length = 29 + 1;

				}

				if (obj.getFNMRGLen() != null) {

					Saver.saveUnsigned(buffer, start + 30, start + 30, obj.getFNMRGLen());

					if (30 + 1 > length)
						length = 30 + 1;

				}

				if (obj.getResXUBase() != null) {

					Saver.saveUnsigned(buffer, start + 31, start + 31, obj.getResXUBase());

					if (31 + 1 > length)
						length = 31 + 1;

				}

				if (obj.getResYUBase() != null) {

					Saver.saveUnsigned(buffer, start + 32, start + 32, obj.getResYUBase());

					if (32 + 1 > length)
						length = 32 + 1;

				}

				if (obj.getXfrUnits() != null) {

					Saver.saveUnsigned(buffer, start + 33, start + 34, obj.getXfrUnits());

					if (34 + 1 > length)
						length = 34 + 1;

				}

				if (obj.getYfrUnits() != null) {

					Saver.saveUnsigned(buffer, start + 35, start + 36, obj.getYfrUnits());

					if (36 + 1 > length)
						length = 36 + 1;

				}

				if (obj.getOPatDCnt() != null) {

					Saver.saveUnsigned(buffer, start + 37, start + 40, obj.getOPatDCnt());

					if (40 + 1 > length)
						length = 40 + 1;

				}

				if (obj.getReserved2() != null) {

					if (obj.getReserved2() != null) {
						Saver.save(buffer, start + 41, start + 43, obj.getReserved2());
					}

					if (43 + 1 > length)
						length = 43 + 1;

				}

				if (obj.getFNNRGLen() != null) {

					Saver.saveUnsigned(buffer, start + 44, start + 44, obj.getFNNRGLen());

					if (44 + 1 > length)
						length = 44 + 1;

				}

				if (obj.getFNNDCnt() != null) {

					Saver.saveUnsigned(buffer, start + 45, start + 48, obj.getFNNDCnt());

					if (48 + 1 > length)
						length = 48 + 1;

				}

				if (obj.getFNNMapCnt() != null) {

					Saver.saveUnsigned(buffer, start + 49, start + 50, obj.getFNNMapCnt());

					if (50 + 1 > length)
						length = 50 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.FND : {
				sf.setId(13870729);
				FND obj = (FND) sf;

				if (40 + 1 > length)
					length = 40 + 1;

				if (41 + 1 > length)
					length = 41 + 1;

				if (42 + 1 > length)
					length = 42 + 1;

				if (44 + 1 > length)
					length = 44 + 1;

				if (46 + 1 > length)
					length = 46 + 1;

				if (48 + 1 > length)
					length = 48 + 1;

				if (50 + 1 > length)
					length = 50 + 1;

				if (52 + 1 > length)
					length = 52 + 1;

				if (54 + 1 > length)
					length = 54 + 1;

				if (55 + 1 > length)
					length = 55 + 1;

				if (56 + 1 > length)
					length = 56 + 1;

				if (57 + 1 > length)
					length = 57 + 1;

				if (72 + 1 > length)
					length = 72 + 1;

				if (74 + 1 > length)
					length = 74 + 1;

				if (84 + 1 > length)
					length = 84 + 1;

				if (86 + 1 > length)
					length = 86 + 1;

				if (88 + 1 > length)
					length = 88 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 89, obj.getTriplets());
						if (89 + size > length)
							length = 89 + size;

					}

				}

				if (obj.getTypeFcDesc() != null) {

					if (obj.getTypeFcDesc() != null) {
						Saver.save(buffer, start + 9, start + 40, obj.getTypeFcDesc(), Charset.forName("IBM500"));
					}

					if (40 + 1 > length)
						length = 40 + 1;

				}

				if (obj.getFtWtClass() != null) {

					Saver.saveUnsigned(buffer, start + 41, start + 41, obj.getFtWtClass());

					if (41 + 1 > length)
						length = 41 + 1;

				}

				if (obj.getFtWdClass() != null) {

					Saver.saveUnsigned(buffer, start + 42, start + 42, obj.getFtWdClass());

					if (42 + 1 > length)
						length = 42 + 1;

				}

				if (obj.getMaxPtSize() != null) {

					Saver.saveUnsigned(buffer, start + 43, start + 44, obj.getMaxPtSize());

					if (44 + 1 > length)
						length = 44 + 1;

				}

				if (obj.getNomPtSize() != null) {

					Saver.saveUnsigned(buffer, start + 45, start + 46, obj.getNomPtSize());

					if (46 + 1 > length)
						length = 46 + 1;

				}

				if (obj.getMinPtSize() != null) {

					Saver.saveUnsigned(buffer, start + 47, start + 48, obj.getMinPtSize());

					if (48 + 1 > length)
						length = 48 + 1;

				}

				if (obj.getMaxHSize() != null) {

					Saver.saveUnsigned(buffer, start + 49, start + 50, obj.getMaxHSize());

					if (50 + 1 > length)
						length = 50 + 1;

				}

				if (obj.getNomHSize() != null) {

					Saver.saveUnsigned(buffer, start + 51, start + 52, obj.getNomHSize());

					if (52 + 1 > length)
						length = 52 + 1;

				}

				if (obj.getMinHSize() != null) {

					Saver.saveUnsigned(buffer, start + 53, start + 54, obj.getMinHSize());

					if (54 + 1 > length)
						length = 54 + 1;

				}

				if (obj.getDsnGenCls() != null) {

					Saver.saveUnsigned(buffer, start + 55, start + 55, obj.getDsnGenCls());

					if (55 + 1 > length)
						length = 55 + 1;

				}

				if (obj.getDsnSubCls() != null) {

					Saver.saveUnsigned(buffer, start + 56, start + 56, obj.getDsnSubCls());

					if (56 + 1 > length)
						length = 56 + 1;

				}

				if (obj.getDsnSpcGrp() != null) {

					Saver.saveUnsigned(buffer, start + 57, start + 57, obj.getDsnSpcGrp());

					if (57 + 1 > length)
						length = 57 + 1;

				}

				if (obj.getReserved1() != null) {

					if (obj.getReserved1() != null) {
						Saver.save(buffer, start + 58, start + 72, obj.getReserved1());
					}

					if (72 + 1 > length)
						length = 72 + 1;

				}

				if (obj.getFtDsFlags() != null) {

					Saver.saveUnsigned(buffer, start + 73, start + 74, obj.getFtDsFlags());

					if (74 + 1 > length)
						length = 74 + 1;

				}

				if (obj.getReserved2() != null) {

					if (obj.getReserved2() != null) {
						Saver.save(buffer, start + 75, start + 84, obj.getReserved2());
					}

					if (84 + 1 > length)
						length = 84 + 1;

				}

				if (obj.getGCSID() != null) {

					Saver.saveUnsigned(buffer, start + 85, start + 86, obj.getGCSID());

					if (86 + 1 > length)
						length = 86 + 1;

				}

				if (obj.getFGID() != null) {

					Saver.saveUnsigned(buffer, start + 87, start + 88, obj.getFGID());

					if (88 + 1 > length)
						length = 88 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.FNG : {
				sf.setId(13889161);
				FNG obj = (FNG) sf;

				if (obj.getPatData() != null) {

				}

				if (obj.getPatData() != null) {

					{
						int size = Saver.save(buffer, start + 9, obj.getPatData());
						if (9 + size > length)
							length = 9 + size;
					}

				}

				return length;
			}

			case AfplibPackage.FNI : {
				sf.setId(13864073);
				FNI obj = (FNI) sf;

				{

					int size = binary_FNIRG(buffer, start + 9, obj.getRg());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRg() != null) {

				}

				return length;
			}

			case AfplibPackage.FNN : {
				sf.setId(13872009);
				FNN obj = (FNN) sf;

				if (obj.getFNNData() != null) {

				}

				if (obj.getFNNData() != null) {

					{
						int size = Saver.save(buffer, start + 9, obj.getFNNData());
						if (9 + size > length)
							length = 9 + size;
					}

				}

				return length;
			}

			case AfplibPackage.FNM : {
				sf.setId(13869705);
				FNM obj = (FNM) sf;

				{

					int size = binary_FNMRG(buffer, start + 9, obj.getRg());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRg() != null) {

				}

				return length;
			}

			case AfplibPackage.FNO : {
				sf.setId(13872777);
				FNO obj = (FNO) sf;

				{

					int size = binary_FNORG(buffer, start + 9, obj.getRg());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRg() != null) {

				}

				return length;
			}

			case AfplibPackage.FNP : {
				sf.setId(13872265);
				FNP obj = (FNP) sf;

				{

					int size = binary_FNPRG(buffer, start + 9, obj.getRg());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRg() != null) {

				}

				return length;
			}

			case AfplibPackage.GAD : {
				sf.setId(13889211);
				GAD obj = (GAD) sf;

				if (obj.getGOCAdat() != null) {

				}

				if (obj.getGOCAdat() != null) {

					{
						int size = Saver.save(buffer, start + 9, obj.getGOCAdat());
						if (9 + size > length)
							length = 9 + size;
					}

				}

				return length;
			}

			case AfplibPackage.GDD : {
				sf.setId(13870779);
				GDD obj = (GDD) sf;

				if (obj.getGOCAdes() != null) {

				}

				if (obj.getCommands() != null && obj.getCommands().size() > 0) {

					{

					}

				}

				if (obj.getGOCAdes() != null) {

					{
						int size = Saver.save(buffer, start + 9, obj.getGOCAdes());
						if (9 + size > length)
							length = 9 + size;
					}

				}

				if (obj.getCommands() != null) {

				}

				return length;
			}

			case AfplibPackage.ICP : {
				sf.setId(13872251);
				ICP obj = (ICP) sf;

				if (10 + 1 > length)
					length = 10 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (16 + 1 > length)
					length = 16 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (obj.getXCOset() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 10, obj.getXCOset());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getYCOset() != null) {

					Saver.saveUnsigned(buffer, start + 11, start + 12, obj.getYCOset());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getXCSize() != null) {

					Saver.saveUnsigned(buffer, start + 13, start + 14, obj.getXCSize());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getYCSize() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 16, obj.getYCSize());

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getXFilSize() != null) {

					Saver.saveUnsigned(buffer, start + 17, start + 18, obj.getXFilSize());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getYFilSize() != null) {

					Saver.saveUnsigned(buffer, start + 19, start + 20, obj.getYFilSize());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				return length;
			}

			case AfplibPackage.IDD : {
				sf.setId(13870843);
				IDD obj = (IDD) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (11 + 1 > length)
					length = 11 + 1;

				if (13 + 1 > length)
					length = 13 + 1;

				if (15 + 1 > length)
					length = 15 + 1;

				if (17 + 1 > length)
					length = 17 + 1;

				if (obj.getSDFS() != null && obj.getSDFS().size() > 0) {

					{

						int size = binary_sdf(buffer, start + 18, obj.getSDFS());
						if (18 + size > length)
							length = 18 + size;

					}

				}

				if (obj.getUNITBASE() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getUNITBASE());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getXRESOL() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 11, obj.getXRESOL());

					if (11 + 1 > length)
						length = 11 + 1;

				}

				if (obj.getYRESOL() != null) {

					Saver.saveUnsigned(buffer, start + 12, start + 13, obj.getYRESOL());

					if (13 + 1 > length)
						length = 13 + 1;

				}

				if (obj.getXSIZE() != null) {

					Saver.saveUnsigned(buffer, start + 14, start + 15, obj.getXSIZE());

					if (15 + 1 > length)
						length = 15 + 1;

				}

				if (obj.getYSIZE() != null) {

					Saver.saveUnsigned(buffer, start + 16, start + 17, obj.getYSIZE());

					if (17 + 1 > length)
						length = 17 + 1;

				}

				if (obj.getSDFS() != null) {

				}

				return length;
			}

			case AfplibPackage.IEL : {
				sf.setId(13873831);
				IEL obj = (IEL) sf;

				{

					int size = binary_triplets(buffer, start + 9, obj.getTriplets());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.IID : {
				sf.setId(13870715);
				IID obj = (IID) sf;

				if (20 + 1 > length)
					length = 20 + 1;

				if (21 + 1 > length)
					length = 21 + 1;

				if (22 + 1 > length)
					length = 22 + 1;

				if (24 + 1 > length)
					length = 24 + 1;

				if (26 + 1 > length)
					length = 26 + 1;

				if (28 + 1 > length)
					length = 28 + 1;

				if (30 + 1 > length)
					length = 30 + 1;

				if (36 + 1 > length)
					length = 36 + 1;

				if (38 + 1 > length)
					length = 38 + 1;

				if (40 + 1 > length)
					length = 40 + 1;

				if (42 + 1 > length)
					length = 42 + 1;

				if (44 + 1 > length)
					length = 44 + 1;

				if (obj.getConData1() != null) {

					if (obj.getConData1() != null) {
						Saver.save(buffer, start + 9, start + 20, obj.getConData1());
					}

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getXBase() != null) {

					Saver.saveUnsigned(buffer, start + 21, start + 21, obj.getXBase());

					if (21 + 1 > length)
						length = 21 + 1;

				}

				if (obj.getYBase() != null) {

					Saver.saveUnsigned(buffer, start + 22, start + 22, obj.getYBase());

					if (22 + 1 > length)
						length = 22 + 1;

				}

				if (obj.getXUnits() != null) {

					Saver.saveUnsigned(buffer, start + 23, start + 24, obj.getXUnits());

					if (24 + 1 > length)
						length = 24 + 1;

				}

				if (obj.getYUnits() != null) {

					Saver.saveUnsigned(buffer, start + 25, start + 26, obj.getYUnits());

					if (26 + 1 > length)
						length = 26 + 1;

				}

				if (obj.getXSize() != null) {

					Saver.saveUnsigned(buffer, start + 27, start + 28, obj.getXSize());

					if (28 + 1 > length)
						length = 28 + 1;

				}

				if (obj.getYSize() != null) {

					Saver.saveUnsigned(buffer, start + 29, start + 30, obj.getYSize());

					if (30 + 1 > length)
						length = 30 + 1;

				}

				if (obj.getConData2() != null) {

					if (obj.getConData2() != null) {
						Saver.save(buffer, start + 31, start + 36, obj.getConData2());
					}

					if (36 + 1 > length)
						length = 36 + 1;

				}

				if (obj.getXCSizeD() != null) {

					Saver.saveUnsigned(buffer, start + 37, start + 38, obj.getXCSizeD());

					if (38 + 1 > length)
						length = 38 + 1;

				}

				if (obj.getYCSizeD() != null) {

					Saver.saveUnsigned(buffer, start + 39, start + 40, obj.getYCSizeD());

					if (40 + 1 > length)
						length = 40 + 1;

				}

				if (obj.getConData3() != null) {

					if (obj.getConData3() != null) {
						Saver.save(buffer, start + 41, start + 42, obj.getConData3());
					}

					if (42 + 1 > length)
						length = 42 + 1;

				}

				if (obj.getColor() != null) {

					Saver.saveUnsigned(buffer, start + 43, start + 44, obj.getColor());

					if (44 + 1 > length)
						length = 44 + 1;

				}

				return length;
			}

			case AfplibPackage.IMM : {
				sf.setId(13872076);
				IMM obj = (IMM) sf;

				if (16 + 1 > length)
					length = 16 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 17, obj.getTriplets());
						if (17 + size > length)
							length = 17 + size;

					}

				}

				if (obj.getMMPName() != null) {

					if (obj.getMMPName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getMMPName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.IOB : {
				sf.setId(13873091);
				IOB obj = (IOB) sf;

				if (16 + 1 > length)
					length = 16 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (21 + 1 > length)
					length = 21 + 1;

				if (24 + 1 > length)
					length = 24 + 1;

				if (26 + 1 > length)
					length = 26 + 1;

				if (28 + 1 > length)
					length = 28 + 1;

				if (31 + 1 > length)
					length = 31 + 1;

				if (34 + 1 > length)
					length = 34 + 1;

				if (35 + 1 > length)
					length = 35 + 1;

				{

					int size = binary_triplets(buffer, start + 36, obj.getTriplets());
					if (36 + size > length)
						length = 36 + size;

				}

				if (obj.getObjName() != null) {

					if (obj.getObjName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getObjName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getObjType() != null) {

					Saver.saveUnsigned(buffer, start + 18, start + 18, obj.getObjType());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getXoaOset() != null) {

					if (obj.getXoaOset() != null) {
						Saver.saveSigned(buffer, start + 19, start + 21, obj.getXoaOset());
					}

					if (21 + 1 > length)
						length = 21 + 1;

				}

				if (obj.getYoaOset() != null) {

					if (obj.getYoaOset() != null) {
						Saver.saveSigned(buffer, start + 22, start + 24, obj.getYoaOset());
					}

					if (24 + 1 > length)
						length = 24 + 1;

				}

				if (obj.getXoaOrent() != null) {

					Saver.saveUnsigned(buffer, start + 25, start + 26, obj.getXoaOrent());

					if (26 + 1 > length)
						length = 26 + 1;

				}

				if (obj.getYoaOrent() != null) {

					Saver.saveUnsigned(buffer, start + 27, start + 28, obj.getYoaOrent());

					if (28 + 1 > length)
						length = 28 + 1;

				}

				if (obj.getXocaOset() != null) {

					if (obj.getXocaOset() != null) {
						Saver.saveSigned(buffer, start + 29, start + 31, obj.getXocaOset());
					}

					if (31 + 1 > length)
						length = 31 + 1;

				}

				if (obj.getYocaOset() != null) {

					if (obj.getYocaOset() != null) {
						Saver.saveSigned(buffer, start + 32, start + 34, obj.getYocaOset());
					}

					if (34 + 1 > length)
						length = 34 + 1;

				}

				if (obj.getRefCSys() != null) {

					Saver.saveUnsigned(buffer, start + 35, start + 35, obj.getRefCSys());

					if (35 + 1 > length)
						length = 35 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.IOC : {
				sf.setId(13870971);
				IOC obj = (IOC) sf;

				if (11 + 1 > length)
					length = 11 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (16 + 1 > length)
					length = 16 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (26 + 1 > length)
					length = 26 + 1;

				if (28 + 1 > length)
					length = 28 + 1;

				if (30 + 1 > length)
					length = 30 + 1;

				if (32 + 1 > length)
					length = 32 + 1;

				if (obj.getXoaOset() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 11, obj.getXoaOset());

					if (11 + 1 > length)
						length = 11 + 1;

				}

				if (obj.getYoaOset() != null) {

					Saver.saveUnsigned(buffer, start + 12, start + 14, obj.getYoaOset());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getXoaOrent() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 16, obj.getXoaOrent());

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getYoaOrent() != null) {

					Saver.saveUnsigned(buffer, start + 17, start + 18, obj.getYoaOrent());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getConData1() != null) {

					if (obj.getConData1() != null) {
						Saver.save(buffer, start + 19, start + 26, obj.getConData1());
					}

					if (26 + 1 > length)
						length = 26 + 1;

				}

				if (obj.getXMap() != null) {

					Saver.saveUnsigned(buffer, start + 27, start + 28, obj.getXMap());

					if (28 + 1 > length)
						length = 28 + 1;

				}

				if (obj.getYMap() != null) {

					Saver.saveUnsigned(buffer, start + 29, start + 30, obj.getYMap());

					if (30 + 1 > length)
						length = 30 + 1;

				}

				if (obj.getConData2() != null) {

					if (obj.getConData2() != null) {
						Saver.save(buffer, start + 31, start + 32, obj.getConData2());
					}

					if (32 + 1 > length)
						length = 32 + 1;

				}

				return length;
			}

			case AfplibPackage.IPD : {
				sf.setId(13889275);
				IPD obj = (IPD) sf;

				if (obj.getIOCAdat() != null) {

				}

				if (obj.getIOCAdat() != null) {

					{
						int size = Saver.save(buffer, start + 9, obj.getIOCAdat());
						if (9 + size > length)
							length = 9 + size;
					}

				}

				return length;
			}

			case AfplibPackage.IPG : {
				sf.setId(13873071);
				IPG obj = (IPG) sf;

				if (16 + 1 > length)
					length = 16 + 1;

				if (25 + 1 > length)
					length = 25 + 1;

				{

					int size = binary_triplets(buffer, start + 26, obj.getTriplets());
					if (26 + size > length)
						length = 26 + size;

				}

				if (obj.getPgName() != null) {

					if (obj.getPgName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPgName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getIPgFlgs() != null) {

					Saver.saveUnsigned(buffer, start + 25, start + 25, obj.getIPgFlgs());

					if (25 + 1 > length)
						length = 25 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.IPO : {
				sf.setId(13873112);
				IPO obj = (IPO) sf;

				if (16 + 1 > length)
					length = 16 + 1;

				if (19 + 1 > length)
					length = 19 + 1;

				if (22 + 1 > length)
					length = 22 + 1;

				if (obj.getOvlyOrent() != null) {

					if (24 + 1 > length)
						length = 24 + 1;

				}

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 25, obj.getTriplets());
						if (25 + size > length)
							length = 25 + size;

					}

				}

				if (obj.getOvlyName() != null) {

					if (obj.getOvlyName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getOvlyName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getXolOset() != null) {

					if (obj.getXolOset() != null) {
						Saver.saveSigned(buffer, start + 17, start + 19, obj.getXolOset());
					}

					if (19 + 1 > length)
						length = 19 + 1;

				}

				if (obj.getYolOset() != null) {

					if (obj.getYolOset() != null) {
						Saver.saveSigned(buffer, start + 20, start + 22, obj.getYolOset());
					}

					if (22 + 1 > length)
						length = 22 + 1;

				}

				if (obj.getOvlyOrent() != null) {

					Saver.saveUnsigned(buffer, start + 23, start + 24, obj.getOvlyOrent());

					if (24 + 1 > length)
						length = 24 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.IPS : {
				sf.setId(13872991);
				IPS obj = (IPS) sf;

				if (16 + 1 > length)
					length = 16 + 1;

				if (19 + 1 > length)
					length = 19 + 1;

				if (22 + 1 > length)
					length = 22 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 23, obj.getTriplets());
						if (23 + size > length)
							length = 23 + size;

					}

				}

				if (obj.getPsegName() != null) {

					if (obj.getPsegName() != null) {
						Saver.save(buffer, start + 9, start + 16, obj.getPsegName(), Charset.forName("IBM500"));
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getXpsOset() != null) {

					if (obj.getXpsOset() != null) {
						Saver.saveSigned(buffer, start + 17, start + 19, obj.getXpsOset());
					}

					if (19 + 1 > length)
						length = 19 + 1;

				}

				if (obj.getYpsOset() != null) {

					if (obj.getYpsOset() != null) {
						Saver.saveSigned(buffer, start + 20, start + 22, obj.getYpsOset());
					}

					if (22 + 1 > length)
						length = 22 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.IRD : {
				sf.setId(13889147);
				IRD obj = (IRD) sf;

				if (obj.getIMdata() != null) {

					{
						int size = Saver.save(buffer, start + 9, obj.getIMdata());
						if (9 + size > length)
							length = 9 + size;
					}

				}

				return length;
			}

			case AfplibPackage.LLE : {
				sf.setId(13874320);
				LLE obj = (LLE) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				{

					int size = binary_LLERG(buffer, start + 11, obj.getRG());
					if (11 + size > length)
						length = 11 + size;

				}

				if (obj.getLnkType() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getLnkType());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.LNC : {
				sf.setId(13871847);
				LNC obj = (LNC) sf;

				if (10 + 1 > length)
					length = 10 + 1;

				if (obj.getNumDSC() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 10, obj.getNumDSC());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				return length;
			}

			case AfplibPackage.LND : {
				sf.setId(13870823);
				LND obj = (LND) sf;

				if (10 + 1 > length)
					length = 10 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (19 + 1 > length)
					length = 19 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (22 + 1 > length)
					length = 22 + 1;

				if (24 + 1 > length)
					length = 24 + 1;

				if (26 + 1 > length)
					length = 26 + 1;

				if (34 + 1 > length)
					length = 34 + 1;

				if (35 + 1 > length)
					length = 35 + 1;

				if (39 + 1 > length)
					length = 39 + 1;

				if (41 + 1 > length)
					length = 41 + 1;

				if (43 + 1 > length)
					length = 43 + 1;

				if (45 + 1 > length)
					length = 45 + 1;

				if (46 + 1 > length)
					length = 46 + 1;

				if (48 + 1 > length)
					length = 48 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 49, obj.getTriplets());
						if (49 + size > length)
							length = 49 + size;

					}

				}

				if (obj.getLNDFlgs() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 10, obj.getLNDFlgs());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getIPos() != null) {

					Saver.saveUnsigned(buffer, start + 11, start + 12, obj.getIPos());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getBPos() != null) {

					Saver.saveUnsigned(buffer, start + 13, start + 14, obj.getBPos());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getTxtOrent() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 18, obj.getTxtOrent());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getFntLID() != null) {

					Saver.saveUnsigned(buffer, start + 19, start + 19, obj.getFntLID());

					if (19 + 1 > length)
						length = 19 + 1;

				}

				if (obj.getChnlCde() != null) {

					Saver.saveUnsigned(buffer, start + 20, start + 20, obj.getChnlCde());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getNLNDskp() != null) {

					Saver.saveUnsigned(buffer, start + 21, start + 22, obj.getNLNDskp());

					if (22 + 1 > length)
						length = 22 + 1;

				}

				if (obj.getNLNDsp() != null) {

					Saver.saveUnsigned(buffer, start + 23, start + 24, obj.getNLNDsp());

					if (24 + 1 > length)
						length = 24 + 1;

				}

				if (obj.getNLNDreu() != null) {

					Saver.saveUnsigned(buffer, start + 25, start + 26, obj.getNLNDreu());

					if (26 + 1 > length)
						length = 26 + 1;

				}

				if (obj.getSupName() != null) {

					if (obj.getSupName() != null) {
						Saver.save(buffer, start + 27, start + 34, obj.getSupName(), Charset.forName("IBM500"));
					}

					if (34 + 1 > length)
						length = 34 + 1;

				}

				if (obj.getSOLid() != null) {

					Saver.saveUnsigned(buffer, start + 35, start + 35, obj.getSOLid());

					if (35 + 1 > length)
						length = 35 + 1;

				}

				if (obj.getDataStrt() != null) {

					Saver.saveUnsigned(buffer, start + 36, start + 39, obj.getDataStrt());

					if (39 + 1 > length)
						length = 39 + 1;

				}

				if (obj.getDataLgth() != null) {

					Saver.saveUnsigned(buffer, start + 40, start + 41, obj.getDataLgth());

					if (41 + 1 > length)
						length = 41 + 1;

				}

				if (obj.getTxtColor() != null) {

					Saver.saveUnsigned(buffer, start + 42, start + 43, obj.getTxtColor());

					if (43 + 1 > length)
						length = 43 + 1;

				}

				if (obj.getNLNDccp() != null) {

					Saver.saveUnsigned(buffer, start + 44, start + 45, obj.getNLNDccp());

					if (45 + 1 > length)
						length = 45 + 1;

				}

				if (obj.getSubpgID() != null) {

					Saver.saveUnsigned(buffer, start + 46, start + 46, obj.getSubpgID());

					if (46 + 1 > length)
						length = 46 + 1;

				}

				if (obj.getCCPID() != null) {

					Saver.saveUnsigned(buffer, start + 47, start + 48, obj.getCCPID());

					if (48 + 1 > length)
						length = 48 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.MBC : {
				sf.setId(13872107);
				MBC obj = (MBC) sf;

				{

					int size = binary_MBCRG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MCA : {
				sf.setId(13871991);
				MCA obj = (MCA) sf;

				{

					int size = binary_MCARG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MCC : {
				sf.setId(13869704);
				MCC obj = (MCC) sf;

				{

					int size = binary_MCCRG(buffer, start + 9, obj.getRg());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRg() != null) {

				}

				return length;
			}

			case AfplibPackage.MCD : {
				sf.setId(13872018);
				MCD obj = (MCD) sf;

				{

					int size = binary_MCDRG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MCF : {
				sf.setId(13872010);
				MCF obj = (MCF) sf;

				{

					int size = binary_MCFRG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MCF1 : {
				sf.setId(13873546);
				MCF1 obj = (MCF1) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				{

					int size = binary_MCF1RG(buffer, start + 13, obj.getRG());
					if (13 + size > length)
						length = 13 + size;

					if (obj.getRG().size() > 0)
						Saver.saveUnsigned(buffer, start + 13 + -4, start + 13 + -4 + 1 - 1, size / obj.getRG().size());
					else
						Saver.saveUnsigned(buffer, start + 13 + -4, start + 13 + -4 + 1 - 1, 0);

				}

				if (obj.getRGLength() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getRGLength());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MDD : {
				sf.setId(13870728);
				MDD obj = (MDD) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (17 + 1 > length)
					length = 17 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (21 + 1 > length)
					length = 21 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 22, obj.getTriplets());
						if (22 + size > length)
							length = 22 + size;

					}

				}

				if (obj.getXmBase() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getXmBase());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getYmBase() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getYmBase());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getXmUnits() != null) {

					Saver.saveUnsigned(buffer, start + 11, start + 12, obj.getXmUnits());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getYmUnits() != null) {

					Saver.saveUnsigned(buffer, start + 13, start + 14, obj.getYmUnits());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getXmSize() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 17, obj.getXmSize());

					if (17 + 1 > length)
						length = 17 + 1;

				}

				if (obj.getYmSize() != null) {

					Saver.saveUnsigned(buffer, start + 18, start + 20, obj.getYmSize());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getMDDFlgs() != null) {

					Saver.saveUnsigned(buffer, start + 21, start + 21, obj.getMDDFlgs());

					if (21 + 1 > length)
						length = 21 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.MDR : {
				sf.setId(13872067);
				MDR obj = (MDR) sf;

				{

					int size = binary_MDRRG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MFC : {
				sf.setId(13869192);
				MFC obj = (MFC) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (11 + 1 > length)
					length = 11 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 13, obj.getTriplets());
						if (13 + size > length)
							length = 13 + size;

					}

				}

				if (obj.getMFCFlgs() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getMFCFlgs());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getMedColl() != null) {

					Saver.saveUnsigned(buffer, start + 11, start + 11, obj.getMedColl());

					if (11 + 1 > length)
						length = 11 + 1;

				}

				if (obj.getMFCScpe() != null) {

					Saver.saveUnsigned(buffer, start + 12, start + 12, obj.getMFCScpe());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.MGO : {
				sf.setId(13872059);
				MGO obj = (MGO) sf;

				{

					int size = binary_MGORG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MIO : {
				sf.setId(13872123);
				MIO obj = (MIO) sf;

				{

					int size = binary_MIORG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MMC : {
				sf.setId(13870984);
				MMC obj = (MMC) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (obj.getRg() != null && obj.getRg().size() > 0) {

					{

						int size = binary_MMCRG(buffer, start + 11, obj.getRg());
						if (11 + size > length)
							length = 11 + size;

					}

				}

				if (obj.getMMCid() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getMMCid());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getPARAMETER1() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getPARAMETER1());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getRg() != null) {

				}

				return length;
			}

			case AfplibPackage.MMD : {
				sf.setId(13872077);
				MMD obj = (MMD) sf;

				{

					int size = binary_MMDRG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MMO : {
				sf.setId(13873631);
				MMO obj = (MMO) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				{

					int size = binary_MMORG(buffer, start + 13, obj.getRg());
					if (13 + size > length)
						length = 13 + size;

				}

				if (obj.getRGLength() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getRGLength());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getRg() != null) {

				}

				return length;
			}

			case AfplibPackage.MMT : {
				sf.setId(13872008);
				MMT obj = (MMT) sf;

				{

					int size = binary_MMTRG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MPG : {
				sf.setId(13872047);
				MPG obj = (MPG) sf;

				{

					int size = binary_MPGRG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MPO : {
				sf.setId(13872088);
				MPO obj = (MPO) sf;

				{

					int size = binary_MPORG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MPS : {
				sf.setId(13873503);
				MPS obj = (MPS) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				{

					int size = binary_MPSRG(buffer, start + 13, obj.getFixedLengthRG());
					if (13 + size > length)
						length = 13 + size;

					if (obj.getFixedLengthRG().size() > 0)
						Saver.saveUnsigned(buffer, start + 13 + -4, start + 13 + -4 + 1 - 1,
								size / obj.getFixedLengthRG().size());
					else
						Saver.saveUnsigned(buffer, start + 13 + -4, start + 13 + -4 + 1 - 1, 0);

				}

				if (obj.getRGLength() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getRGLength());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getReserved() != null) {

					if (obj.getReserved() != null) {
						Saver.save(buffer, start + 10, start + 12, obj.getReserved());
					}

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getFixedLengthRG() != null) {

				}

				return length;
			}

			case AfplibPackage.MSU : {
				sf.setId(13872106);
				MSU obj = (MSU) sf;

				{

					int size = binary_MSURG(buffer, start + 9, obj.getRg());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRg() != null) {

				}

				return length;
			}

			case AfplibPackage.NOP : {
				sf.setId(13889262);
				NOP obj = (NOP) sf;

				if (obj.getUndfData() != null) {

				}

				if (obj.getUndfData() != null) {

					{
						int size = Saver.save(buffer, start + 9, obj.getUndfData());
						if (9 + size > length)
							length = 9 + size;
					}

				}

				return length;
			}

			case AfplibPackage.OBD : {
				sf.setId(13870699);
				OBD obj = (OBD) sf;

				{

					int size = binary_triplets(buffer, start + 9, obj.getTriplets());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.OBP : {
				sf.setId(13872235);
				OBP obj = (OBP) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (13 + 1 > length)
					length = 13 + 1;

				if (16 + 1 > length)
					length = 16 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (24 + 1 > length)
					length = 24 + 1;

				if (27 + 1 > length)
					length = 27 + 1;

				if (29 + 1 > length)
					length = 29 + 1;

				if (31 + 1 > length)
					length = 31 + 1;

				if (32 + 1 > length)
					length = 32 + 1;

				if (obj.getOAPosID() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getOAPosID());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getRGLength() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getRGLength());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getXoaOset() != null) {

					if (obj.getXoaOset() != null) {
						Saver.saveSigned(buffer, start + 11, start + 13, obj.getXoaOset());
					}

					if (13 + 1 > length)
						length = 13 + 1;

				}

				if (obj.getYoaOset() != null) {

					if (obj.getYoaOset() != null) {
						Saver.saveSigned(buffer, start + 14, start + 16, obj.getYoaOset());
					}

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getXoaOrent() != null) {

					Saver.saveUnsigned(buffer, start + 17, start + 18, obj.getXoaOrent());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getYoaOrent() != null) {

					Saver.saveUnsigned(buffer, start + 19, start + 20, obj.getYoaOrent());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getXocaOset() != null) {

					if (obj.getXocaOset() != null) {
						Saver.saveSigned(buffer, start + 22, start + 24, obj.getXocaOset());
					}

					if (24 + 1 > length)
						length = 24 + 1;

				}

				if (obj.getYocaOset() != null) {

					if (obj.getYocaOset() != null) {
						Saver.saveSigned(buffer, start + 25, start + 27, obj.getYocaOset());
					}

					if (27 + 1 > length)
						length = 27 + 1;

				}

				if (obj.getXocaOrent() != null) {

					Saver.saveUnsigned(buffer, start + 28, start + 29, obj.getXocaOrent());

					if (29 + 1 > length)
						length = 29 + 1;

				}

				if (obj.getYocaOrent() != null) {

					Saver.saveUnsigned(buffer, start + 30, start + 31, obj.getYocaOrent());

					if (31 + 1 > length)
						length = 31 + 1;

				}

				if (obj.getRefCSys() != null) {

					Saver.saveUnsigned(buffer, start + 32, start + 32, obj.getRefCSys());

					if (32 + 1 > length)
						length = 32 + 1;

				}

				return length;
			}

			case AfplibPackage.OCD : {
				sf.setId(13889170);
				OCD obj = (OCD) sf;

				if (obj.getObjCdat() != null) {

				}

				if (obj.getObjCdat() != null) {

					{
						int size = Saver.save(buffer, start + 9, obj.getObjCdat());
						if (9 + size > length)
							length = 9 + size;
					}

				}

				return length;
			}

			case AfplibPackage.PEC : {
				sf.setId(13871016);
				PEC obj = (PEC) sf;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 11, obj.getTriplets());
						if (11 + size > length)
							length = 11 + size;

					}

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.PFC : {
				sf.setId(13873800);
				PFC obj = (PFC) sf;

				if (10 + 1 > length)
					length = 10 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 13, obj.getTriplets());
						if (13 + size > length)
							length = 13 + size;

					}

				}

				if (obj.getPFCFlgs() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getPFCFlgs());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.PGD : {
				sf.setId(13870767);
				PGD obj = (PGD) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (17 + 1 > length)
					length = 17 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (23 + 1 > length)
					length = 23 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 24, obj.getTriplets());
						if (24 + size > length)
							length = 24 + size;

					}

				}

				if (obj.getXpgBase() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getXpgBase());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getYpgBase() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getYpgBase());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getXpgUnits() != null) {

					Saver.saveUnsigned(buffer, start + 11, start + 12, obj.getXpgUnits());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getYpgUnits() != null) {

					Saver.saveUnsigned(buffer, start + 13, start + 14, obj.getYpgUnits());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getXpgSize() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 17, obj.getXpgSize());

					if (17 + 1 > length)
						length = 17 + 1;

				}

				if (obj.getYpgSize() != null) {

					Saver.saveUnsigned(buffer, start + 18, start + 20, obj.getYpgSize());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getReserved() != null) {

					Saver.saveUnsigned(buffer, start + 21, start + 23, obj.getReserved());

					if (23 + 1 > length)
						length = 23 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.PGP : {
				sf.setId(13873583);
				PGP obj = (PGP) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				{

					int size = binary_PGPRG(buffer, start + 10, obj.getRG());
					if (10 + size > length)
						length = 10 + size;

				}

				if (obj.getConstant() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getConstant());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.PGP1 : {
				sf.setId(13872303);
				PGP1 obj = (PGP1) sf;

				if (11 + 1 > length)
					length = 11 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (obj.getXOset() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 11, obj.getXOset());

					if (11 + 1 > length)
						length = 11 + 1;

				}

				if (obj.getYOset() != null) {

					Saver.saveUnsigned(buffer, start + 12, start + 14, obj.getYOset());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				return length;
			}

			case AfplibPackage.PMC : {
				sf.setId(13871023);
				PMC obj = (PMC) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (obj.getTriplets() != null && obj.getTriplets().size() > 0) {

					{

						int size = binary_triplets(buffer, start + 11, obj.getTriplets());
						if (11 + size > length)
							length = 11 + size;

					}

				}

				if (obj.getPMCid() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getPMCid());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.PPO : {
				sf.setId(13872579);
				PPO obj = (PPO) sf;

				{

					int size = binary_PPORG(buffer, start + 9, obj.getRG());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getRG() != null) {

				}

				return length;
			}

			case AfplibPackage.PTD : {
				sf.setId(13873563);
				PTD obj = (PTD) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (17 + 1 > length)
					length = 17 + 1;

				if (20 + 1 > length)
					length = 20 + 1;

				if (obj.getRESERVED() != null) {

					if (22 + 1 > length)
						length = 22 + 1;

				}

				if (obj.getCS() != null && obj.getCS().size() > 0) {

					{

						int size = binary_cs(buffer, start + 23, obj.getCS());
						if (23 + size > length)
							length = 23 + size;

					}

				}

				if (obj.getXPBASE() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getXPBASE());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getYPBASE() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getYPBASE());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getXPUNITVL() != null) {

					Saver.saveUnsigned(buffer, start + 11, start + 12, obj.getXPUNITVL());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getYPUNITVL() != null) {

					Saver.saveUnsigned(buffer, start + 13, start + 14, obj.getYPUNITVL());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getXPEXTENT() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 17, obj.getXPEXTENT());

					if (17 + 1 > length)
						length = 17 + 1;

				}

				if (obj.getYPEXTENT() != null) {

					Saver.saveUnsigned(buffer, start + 18, start + 20, obj.getYPEXTENT());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getRESERVED() != null) {

					Saver.saveUnsigned(buffer, start + 21, start + 22, obj.getRESERVED());

					if (22 + 1 > length)
						length = 22 + 1;

				}

				if (obj.getCS() != null) {

				}

				return length;
			}

			case AfplibPackage.PTD1 : {
				sf.setId(13870747);
				PTD1 obj = (PTD1) sf;

				if (9 + 1 > length)
					length = 9 + 1;

				if (10 + 1 > length)
					length = 10 + 1;

				if (12 + 1 > length)
					length = 12 + 1;

				if (14 + 1 > length)
					length = 14 + 1;

				if (16 + 1 > length)
					length = 16 + 1;

				if (18 + 1 > length)
					length = 18 + 1;

				if (obj.getRESERVED() != null) {

					if (20 + 1 > length)
						length = 20 + 1;

				}

				if (obj.getXPBASE() != null) {

					Saver.saveUnsigned(buffer, start + 9, start + 9, obj.getXPBASE());

					if (9 + 1 > length)
						length = 9 + 1;

				}

				if (obj.getYPBASE() != null) {

					Saver.saveUnsigned(buffer, start + 10, start + 10, obj.getYPBASE());

					if (10 + 1 > length)
						length = 10 + 1;

				}

				if (obj.getXPUNITVL() != null) {

					Saver.saveUnsigned(buffer, start + 11, start + 12, obj.getXPUNITVL());

					if (12 + 1 > length)
						length = 12 + 1;

				}

				if (obj.getYPUNITVL() != null) {

					Saver.saveUnsigned(buffer, start + 13, start + 14, obj.getYPUNITVL());

					if (14 + 1 > length)
						length = 14 + 1;

				}

				if (obj.getXPEXTENT() != null) {

					Saver.saveUnsigned(buffer, start + 15, start + 16, obj.getXPEXTENT());

					if (16 + 1 > length)
						length = 16 + 1;

				}

				if (obj.getYPEXTENT() != null) {

					Saver.saveUnsigned(buffer, start + 17, start + 18, obj.getYPEXTENT());

					if (18 + 1 > length)
						length = 18 + 1;

				}

				if (obj.getRESERVED() != null) {

					Saver.saveUnsigned(buffer, start + 19, start + 20, obj.getRESERVED());

					if (20 + 1 > length)
						length = 20 + 1;

				}

				return length;
			}

			case AfplibPackage.PTX : {
				sf.setId(13889179);
				PTX obj = (PTX) sf;

				{

					int size = binary_cs(buffer, start + 9, obj.getCS());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getCS() != null) {

				}

				return length;
			}

			case AfplibPackage.TLE : {
				sf.setId(13869200);
				TLE obj = (TLE) sf;

				{

					int size = binary_triplets(buffer, start + 9, obj.getTriplets());
					if (9 + size > length)
						length = 9 + size;

				}

				if (obj.getTriplets() != null) {

				}

				return length;
			}

			case AfplibPackage.FGD : {
				sf.setId(13870789);
				FGD obj = (FGD) sf;

				if (12 + 1 > length)
					length = 12 + 1;

				if (obj.getConData() != null) {

					if (obj.getConData() != null) {
						Saver.save(buffer, start + 9, start + 12, obj.getConData());
					}

					if (12 + 1 > length)
						length = 12 + 1;

				}

				return length;
			}

			default :
				throw new IllegalArgumentException("unknown sf: " + sf);
		}
	}

}
