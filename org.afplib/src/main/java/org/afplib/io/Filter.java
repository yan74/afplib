package org.afplib.io;

import org.afplib.base.SF;

public interface Filter {

	enum STATE { DROP, MODIFIED, UNTOUCHED, STOP }
	
	STATE onStructuredField(SF sf);
	
}
