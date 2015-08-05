package org.afplib.io;

import java.util.List;

import org.afplib.Data;
import org.afplib.base.Triplet;

public abstract class AbstractStructuredFieldFactory {

	private enum State {
		READ_PREFIX_AND_CLASS, READ_LENGTH, READ_TYPE, READ_CHAINED, READ_UNCHAINED, TERMINATE
	};

	private final boolean isChained(int functionType) {
		return (functionType & 0x01) == 1;
	}

	private final int unchain(int functionType) {
		return functionType &= 0xfe;
	}
	
	void cs(List<Triplet> triplets, byte[] buffer, int start, int bufstop) {
		int number = 0;
		int len = 0;
		State state = State.READ_PREFIX_AND_CLASS;

		while (state != State.TERMINATE && start <= bufstop) {
			int functionType;
			switch (state) {
			case READ_UNCHAINED:
				state = State.READ_PREFIX_AND_CLASS;
				break;
			case READ_PREFIX_AND_CLASS:
				if (Data.toUnsignedByte(buffer[start]) != 0x2B
						|| Data.toUnsignedByte(buffer[start + 1]) != 0xD3) {
					
					//rest are code points
					
					Triplet m = cs(buffer, start, bufstop, 0xda);
					number++;
					if(m != null) {
						m.setTripletId(0xda);
						m.setTripletNumber(number);
						m.setTripletLength(len + 1);
						m.setFileOffset(start);
						triplets.add(m);
					}
					else System.out.println("failed CS construction."); // FIXME
					start += buffer.length;

					state = State.TERMINATE;
					break;
				}
				state = State.READ_LENGTH;
				start += 2;
				break;
			case READ_CHAINED:
				state = State.READ_LENGTH;
				break;
			case READ_LENGTH:
				len = Data.toUnsignedByte(buffer[start]);
				state = State.READ_TYPE;
				len--; // don't include length byte in length because we
							// increment offset (so it doesn't point to length)
				start++;
				break;
			case READ_TYPE:
				functionType = Data.toUnsignedByte(buffer[start]);
				if (isChained(functionType)) {
					state = State.READ_CHAINED;
					functionType = unchain(functionType);
				} else {
					state = State.READ_UNCHAINED;
				}
				Triplet m = cs(buffer, start, start + len - 1, functionType);
				if(m != null) {
					m.setTripletId(functionType);
					m.setTripletNumber(number);
					m.setTripletLength(len + 1);
					m.setFileOffset(start);
					triplets.add(m);
				}
				else System.out.println("failed CS construction."); // FIXME
				number++;
				start += len;
				if (start == buffer.length) {
					state = State.TERMINATE;
				}
				break;
			case TERMINATE:
				break;
			}
		}		
	}

	abstract Triplet cs(byte[] buffer, int start, int stop, int functionType);

}
