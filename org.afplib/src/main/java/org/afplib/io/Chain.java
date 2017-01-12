package org.afplib.io;

import java.io.IOException;

import org.afplib.base.SF;

/**
 * This functional interface is used by {@link ChainLink} to pass
 * modified, unmodified or even new structured fields to the next
 * filter. The last filter will store the output in a file.
 */
public interface Chain {

	/**
	 * Passes the structured fields to the next filter or to the
	 * output file if link is the last filter in the chain.
	 *
	 * @param link the filter commiting the change
	 * @param sf strutured fields to pass
	 * @throws IOException
	 */
	void commit(ChainLink link, SF... sf) throws IOException;

}
