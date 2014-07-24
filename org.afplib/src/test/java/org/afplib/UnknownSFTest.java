package org.afplib;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.BRG;
import org.afplib.afplib.CGCSGID;
import org.afplib.afplib.Comment;
import org.afplib.base.SF;
import org.afplib.base.UNKNSF;
import org.afplib.io.AfpInputStream;
import org.afplib.io.AfpOutputStream;
import org.junit.Test;

public class UnknownSFTest {

	@Test
	public void unknownSF() throws IOException {
		File ftmp = File.createTempFile("tmp", ".afp");
		ftmp.deleteOnExit();

		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream("testdata/unknownSF.afp"));
				AfpOutputStream afpout = new AfpOutputStream(new FileOutputStream(ftmp))) {
		
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof UNKNSF);
			
			afpout.writeStructuredField(sf);
		}
		
		try (FileInputStream f1 = new FileInputStream(ftmp); FileInputStream f2 = new FileInputStream("testdata/unknownSF.afp")) {
			byte[] b1 = new byte[1024];
			byte[] b2 = new byte[1024];
			int l;
			while((l = f1.read(b1)) > 0) {
				int l2 = f2.read(b2);
				assertEquals(l, l2);
				
				assertTrue(Arrays.equals(b1, b2));
			}
		}
		
	}

}
