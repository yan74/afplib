package org.afplib.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.afplib.base.SF;

public abstract class AbstractChainLink implements ChainLink {

	protected List<SF> sfBuffer = new ArrayList<SF>();
	protected Chain chain;

	private long nsFirstPass = 0;
	private long nsSecondPass = 0;

	public long getNsFirstPass() {
		return nsFirstPass;
	}

	public long getNsSecondPass() {
		return nsSecondPass;
	}

	@Override
	public boolean needTwoPass() {
		return false;
	}

	@Override
	public final boolean onStructuredField(Chain chain, SF sf) throws IOException {
		long time = System.nanoTime();

		if(chain == null) {
			try {
				return read(sf);
			} finally {
				time = System.nanoTime() - time;
				nsFirstPass += time;
			}
		}

		try {
			this.chain = chain;
			sfBuffer.add(sf);
			if(!onStructuredField(sf)) {
				commit();
				return false;
			}

			return true;
		} finally {
			time = System.nanoTime() - time;
			nsSecondPass += time;
		}
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
