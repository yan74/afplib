package org.afplib.io;

import java.io.IOException;

import org.afplib.base.SF;

public class AfpFilter {
	
	private AfpInputStream in;
	private AfpOutputStream out;

	public AfpFilter(AfpInputStream in, AfpOutputStream out) {
		this.in = in;
		this.out = out;
	}
	
	public void filter(Filter filter) throws IOException {
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
	
	public AfpInputStream getInputStream() { return in; }
	
	public AfpOutputStream getOutputStream() { return out; }
	
	public static void filter(AfpInputStream in, AfpOutputStream out, Filter filter) throws IOException {
		new AfpFilter(in, out).filter(filter);
	}
	
}
