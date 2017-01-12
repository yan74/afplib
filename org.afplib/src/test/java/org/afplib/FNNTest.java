package org.afplib;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.afplib.io.AfpOutputStream;
import org.junit.Before;
import org.junit.Test;

public class FNNTest {

	@Before public void setup() {
		new File("out").mkdirs();
	}

	@Test public void testOpenAndSaveType1Font() throws IOException {
		AfpInputStream ain = null;
		AfpOutputStream aout = null;
		try {

			ain = new AfpInputStream(new FileInputStream("testdata/C0X00006.afp"));
			aout = new AfpOutputStream(new FileOutputStream("out/C0X00006.afp"));

			SF sf;
			while((sf = ain.readStructuredField()) != null) {
				aout.writeStructuredField(sf);
			}

			PrintWriter report = new PrintWriter(System.out);
			boolean result = BinaryAFPCompare.equals(new File("testdata/C0X00006.afp"), new File("out/C0X00006.afp"), report);
			report.flush();
			assertTrue(result);

		} finally {
			if(ain != null) ain.close();
			if(aout != null) aout.close();
		}
	}

}
