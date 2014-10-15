package org.afplib.helper.formdef;

import java.io.IOException;
import java.util.LinkedList;

import org.afplib.afplib.AfplibPackage;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reads the formdef and finds all medium maps
 *
 */
public class FormdefScanner {

	private static final Logger log = LoggerFactory.getLogger(FormdefScanner.class);

	/**
	 * Scans the input for medium maps and adds to the
	 * formdef.
	 * 
	 * This scanner will modify the AfpInputStreams position.
	 * If you need to keep position, please provide a new
	 * AfpInputStream.
	 * 
	 * @param in formdef or afp file to read medium maps from
	 * @return formdef in memory representation of the formdef
	 * @throws IOException 
	 */
	public static Formdef scan(AfpInputStream in) throws IOException {
		Formdef formdef = new FormdefImpl();
		SF sf;
		
		LinkedList<SF> sfbuffer = null;
		while((sf = in.readStructuredField()) != null) {
			log.trace("{}", sf);

			switch(sf.eClass().getClassifierID()) {
			case AfplibPackage.ERG:
			case AfplibPackage.BDT:
				return null;
			case AfplibPackage.EFM:
				return formdef;
			case AfplibPackage.BDG:
				sfbuffer = new LinkedList<SF>();
				break;
			case AfplibPackage.EDG:
				sfbuffer.add(sf);
				formdef.setBDG((SF[]) sfbuffer.toArray(new SF[sfbuffer.size()]));
				sfbuffer = null;
				break;
			case AfplibPackage.BMM:
				sfbuffer = new LinkedList<SF>();
				break;
			case AfplibPackage.EMM:
				sfbuffer.add(sf);
				formdef.add((SF[]) sfbuffer.toArray(new SF[sfbuffer.size()]));
				sfbuffer = null;
				break;
			}
			
			if(sfbuffer != null) sfbuffer.add(sf);
		}
		
		return null;
	}
	
}
