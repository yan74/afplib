package org.afplib.io;

import org.afplib.base.SF;

public interface Filter {

	enum STATE { DROP, MODIFIED, UNTOUCHED }
	
	STATE onStructuredField(SF sf);
	
}
