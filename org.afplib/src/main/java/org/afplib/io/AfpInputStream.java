package org.afplib.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.afplib.Data;
import org.afplib.base.SF;

public class AfpInputStream extends FilterInputStream {

	StructuredFieldFactory factory = new StructuredFieldFactory();
	byte[] data = new byte[32768];
	int length;
	
	int number = 0;
	long offset = 0;
	
	public AfpInputStream(InputStream in) {
		super(in);
	}

	public SF readStructuredField() throws IOException {
		
		int buf;
		int leadingLength = 0;
		
		long thisOffset = offset;

		do {
			buf = read(); offset++;
			leadingLength++;
		} while((buf & 0xff) != 0x5a && buf != -1 && leadingLength < 5);
		
		if(buf == -1 && leadingLength > 1)
			throw new IOException("found trailing garbage at the end of file.");
		
		if(buf == -1)
			return null;
		
		if((buf & 0xff) != 0x5a)
			throw new IOException("cannot find 5a magic byte");
		data[0] = (byte) (buf & 0xff);
		
		buf = read(); offset++;
		if(buf == -1)
			throw new IOException("premature end of file.");
		data[1] = (byte) (buf & 0xff);

		length = (byte) buf << 8;

		buf = read(); offset++;
		if(buf == -1)
			throw new IOException("premature end of file.");
		data[2] = (byte) (buf & 0xff);

		length |= (byte) buf & 0xff;
		
		length -= 2;
		
		if(length > data.length)
			throw new IOException("length of structured field is too large: "+length);
				
		int read = read(data, 3, length);
		offset += read;
		
		if(read < length)
			throw new IOException("premature end of file.");
		
		SF sf = factory.sf(data, 0, getLength() + 2);
		sf.setLength(length + 3);
		sf.setOffset(thisOffset);
		sf.setNumber(number++);
		
		return sf;
	}
	
	private int getLength() {
		int result = length;
		
		if((data[6] & 0x08) == 0x08) { // padding
			int padding = 0;
			if(data[data.length - 1] == 0) {
				padding = Data.toUnsigned(data, data.length-3, data.length-2);
			} else {
				padding = Data.toUnsigned(data, data.length-1, data.length-1);
			}
			result -= padding;
		}
		return result;
	}

	
}
