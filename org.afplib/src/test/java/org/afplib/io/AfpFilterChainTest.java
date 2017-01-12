package org.afplib.io;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.afplib.base.SF;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

public class AfpFilterChainTest {

	@Test
	public void testNoop() throws IOException {
		File in = new File("testdata/asciiComment.afp");
		File out = File.createTempFile("test", ".afp");
		out.delete();
		out.deleteOnExit();

		AfpFilterChain chain = new AfpFilterChain(in, out);
		chain.filter(new ChainLink() {

			@Override
			public boolean onStructuredField(Chain chain, SF sf) throws IOException {
				chain.commit(this, sf);
				return true;
			}

			@Override
			public boolean needTwoPass() {
				return false;
			}
		});

		AfpInputStream a1 = new AfpInputStream(new FileInputStream(in));
		AfpInputStream a2 = new AfpInputStream(new FileInputStream(out));
		try {

			SF sf1, sf2;
			while((sf1 = a1.readStructuredField()) != null) {
				sf2 = a2.readStructuredField();
				assertTrue(EcoreUtil.equals(sf1, sf2));
			}

		} finally {
			a1.close();
			a2.close();
		}
	}

}
