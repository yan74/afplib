package org.afplib.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.afplib.Data;
import org.afplib.base.SF;

public class AfpOutputStream extends FilterOutputStream {

	StructuredFieldFactory factory = new StructuredFieldFactory();
	byte[] buffer = new byte[32768];
	int index;

	public AfpOutputStream(OutputStream out) {
		super(out);
	}

	public void writeStructuredField(SF sf) throws IOException {
		int length = factory.binary(buffer, 0, sf);
		
		buffer[0] = (byte) 0x5a;
		byte[] bLength = Data.toUnsignedShort(length - 1);
		buffer[1] = bLength[0];
		buffer[2] = bLength[1];
		byte[] bId = Data.toUnsignedMedium(sf.getId());
		buffer[3] = bId[0];
		buffer[4] = bId[1];
		buffer[5] = bId[2];
		buffer[6] = (byte) 0x0; // flags
		byte[] bIndex = Data.toUnsignedShort(index++);
		buffer[7] = bIndex[0]; // reserved
		buffer[8] = bIndex[1]; // reserved
		
		write(buffer, 0, length);
	}
}
