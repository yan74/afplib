package org.afplib.io;

import java.io.IOException;

import org.afplib.base.SF;

public class AfpFilter {
	
	public static void filter(AfpInputStream in, AfpOutputStream out, Filter filter) throws IOException {
		SF sf;
		while((sf = in.readStructuredField()) != null) {
			switch(filter.onStructuredField(sf)) {
			case DROP:
				break;
			case MODIFIED:
				out.writeStructuredField(sf);
				break;
			case UNTOUCHED:
				out.write(in.data, 0, in.length + 3);
				break;
			}
		}
		
	}
	
}
