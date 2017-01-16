package org.afplib.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.afplib.base.SF;

public abstract class AbstractChainLink implements ChainLink {

	protected List<SF> sfBuffer = new ArrayList<SF>();
	protected Chain chain;

	@Override
	public boolean needTwoPass() {
		return false;
	}

	@Override
	public final boolean onStructuredField(Chain chain, SF sf) throws IOException {
		if(chain == null) return read(sf);

		this.chain = chain;
		sfBuffer.add(sf);
		if(!onStructuredField(sf)) {
			commit();
			return false;
		}

		return true;
	}

	protected abstract boolean onStructuredField(SF sf) throws IOException;

	protected void commit() throws IOException {
		if(sfBuffer.isEmpty()) return;

		chain.commit(this, (SF[]) sfBuffer.toArray(new SF[sfBuffer.size()]));
		sfBuffer.clear();
	}

	protected boolean read(SF sf) {
		return false;
	}

}
