package org.afplib.samples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class DumpAFP {

	public static void main(String[] args) {
		try (AfpInputStream in = new AfpInputStream(
				new BufferedInputStream(new FileInputStream(args[0])))) {
			
			SF sf;
			while((sf = in.readStructuredField()) != null) {
				System.out.print(sf.eClass().getName()+"  ");
				printAttributes(sf);
				System.out.println();
				printContents(sf, 2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void printAttributes(EObject eobj) {
		for(EAttribute atr : eobj.eClass().getEAllAttributes()) {
			System.out.print(atr.getName()+":"+eobj.eGet(atr)+",");
		}
	}
	
	private static void printContents(EObject eobj, int indent) {
		for(EObject eo : eobj.eContents()) {
			for(int i=0; i<indent; i++) System.out.print(" ");
			System.out.print(eo.eClass().getName()+"  ");
			printAttributes(eo);
			System.out.println();
			printContents(eo, indent + 2);
		}
	}
	
}
