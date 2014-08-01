package org.afplib.io;

import java.io.IOException;

import org.afplib.base.SF;

public interface Filter {

	enum STATE { DROP, MODIFIED, UNTOUCHED, STOP }
	
	STATE onStructuredField(SF sf) throws IOException;
	
}
