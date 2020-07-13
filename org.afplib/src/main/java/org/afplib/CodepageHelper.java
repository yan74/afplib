package org.afplib;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper to convert CGCGID triplet into JAVA code page.
 * 
 * @author Yan Hackl-Feldbusch <yan@hcsystems.de>
 *
 */
public class CodepageHelper {

	private static Logger log = LoggerFactory.getLogger(CodepageHelper.class);
	
	public static final Charset CHARSET_IBM500 = Charset.forName("ibm500");

	public static Charset getCharset(int cpgid, int gcsgid) {		
		Charset result;
		

		if(cpgid == 1200) {
			result = Charset.forName("UTF-16");
		} else if(cpgid == 1252) {
			result = Charset.forName("windows-1252");
		} else {
			try {
				result = Charset.forName("ibm"+cpgid);
			} catch (UnsupportedCharsetException e) {
				log.error("unknown gpgid {}", cpgid);
				result = CHARSET_IBM500; // FIXME
			}
		}

		return result;
	}

	
}
