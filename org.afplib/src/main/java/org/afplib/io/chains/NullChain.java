package org.afplib.io.chains;

import java.io.IOException;

import org.afplib.base.SF;
import org.afplib.io.Chain;
import org.afplib.io.ChainLink;

public class NullChain implements ChainLink {

	@Override
	public boolean needTwoPass() {
		return false;
	}

	@Override
	public boolean onStructuredField(Chain chain, SF sf) throws IOException {
		chain.commit(this, sf);
		return true;
	}

}
