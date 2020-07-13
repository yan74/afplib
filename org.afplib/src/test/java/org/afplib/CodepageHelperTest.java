package org.afplib;

import static org.afplib.CodepageHelper.getCharset;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CodepageHelperTest {

	private static final int UNUSED = 123;

	@Test
	public void testGetCharset() throws Exception {
		assertEquals("IBM500", getCharset(500, UNUSED).toString());
		assertEquals("IBM850", getCharset(850, UNUSED).toString());

		assertEquals("UTF-16", getCharset(1200, UNUSED).toString());
		assertEquals("windows-1252", getCharset(1252, UNUSED).toString());
		assertEquals("IBM01141", getCharset(1141, UNUSED).toString());

		assertEquals("IBM273", getCharset(273, UNUSED).toString());

		assertEquals("IBM500", getCharset(9999999, UNUSED).toString());
	}

}
