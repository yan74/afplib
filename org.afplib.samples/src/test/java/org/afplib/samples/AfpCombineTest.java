package org.afplib.samples;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class AfpCombineTest {

	@Test
	public void testRun() throws IOException {
		new File("tmp").mkdirs();
		AfpCombine combine = new AfpCombine("tmp/out.afp", new String[] { "testdata/start.afp", "testdata/start.afp" , "testdata/ende.afp" , "testdata/ende.afp"});
		combine.run();
	}

}
