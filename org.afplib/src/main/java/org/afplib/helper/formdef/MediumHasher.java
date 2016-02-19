package org.afplib.helper.formdef;


import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.afplib.base.SF;
import org.afplib.io.AfpOutputStream;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MediumHasher {

	private static final Logger log = LoggerFactory.getLogger(MediumHasher.class);

	/**
	 * creates a hash code based on provided structured fields.
	 * 
	 * @param sfs array of structured fields
	 * @return hash code
	 */
	public static int hashCode(SF[] sfs) {
		
		if (sfs == null || sfs.length == 0) return 0;

		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		AfpOutputStream out = null;
		try {
			out = new AfpOutputStream(bout);
			for (SF sf : sfs)
				out.writeStructuredField(sf);
		} catch (IOException e) {
			log.error("hashcode error", e);
			return 0;
		} finally {
			if(out != null) try { out.close(); } catch(IOException e) {}
		}

		return new HashCodeBuilder().append(bout.toByteArray()).toHashCode();
	}

}
