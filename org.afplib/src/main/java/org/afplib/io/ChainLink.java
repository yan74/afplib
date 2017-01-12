package org.afplib.io;

import java.io.IOException;

import org.afplib.base.SF;

/**
 * Represents a link in an AFP filter chain. Links can be chained
 * so that the output of preceding link is the input of the following
 * link.
 */
public interface ChainLink {

	/**
	 * signals that this filter wants to read the AFP before actually
	 * modifying it. Can be used to first know e.g. which IMMs are used
	 * in an AFP file. If {@link needTwoPass} returns true,
	 * {@link onStructuredField} will be first called with chain=null
	 * passing all SF for reading. The second pass actually requires
	 * a commit call on {@link Chain}.
	 *
	 * @return true, if this filter wants to read the AFP before modifying it.
	 */
	boolean needTwoPass();

	/**
	 * is called for each structured field. The implementing class needs
	 * to call commit on {@link Chain} for each structured field(s) it wants
	 * to be saved. If a filter does not commit the resulting AFP will be
	 * empty.
	 *
	 * @param chain functional interface for committing changes or just passing SFs to the next filter
	 * @param sf structured field
	 * @return false, if the work of this filter is done.
	 * @throws IOException
	 */
	boolean onStructuredField(Chain chain, SF sf) throws IOException;

}
