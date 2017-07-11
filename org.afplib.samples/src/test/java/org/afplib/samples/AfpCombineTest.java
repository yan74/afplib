package org.afplib.samples;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class AfpCombineTest {

	// does currently not work due to the 5a checking and header preloading in AfpInputStream
//	@Test
	public void testRun() throws IOException {
		new File("tmp").mkdirs();
		AfpCombine combine = new AfpCombine("tmp/out.afp", new String[] { "testdata/start.afp", "testdata/start.afp" , "testdata/ende.afp" , "testdata/ende.afp"});
		combine.run();
	}

}
