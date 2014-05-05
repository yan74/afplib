package org.afplib.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.afplib.base.SF;

public class AfpInputStream extends FilterInputStream {

	StructuredFieldFactory factory = new StructuredFieldFactory();
	byte[] data = new byte[32768];
	
	public AfpInputStream(InputStream in) {
		super(in);
	}

	public SF readStructuredField() throws IOException {
		
		int buf;
		int leadingLength = 0;
		
		do {
			buf = read();
			leadingLength++;
		} while((buf & 0xff) != 0x5a && buf != -1 && leadingLength < 5);
		
		if(buf == -1 && leadingLength > 1)
			throw new IOException("found trailing garbage at the end of file.");
		
		if(buf == -1)
			return null;
		
		if((buf & 0xff) != 0x5a)
			throw new IOException("cannot find 5a magic byte");
		data[0] = (byte) (buf & 0xff);
		
		int length;
		
		buf = read();
		if(buf == -1)
			throw new IOException("premature end of file.");
		data[1] = (byte) (buf & 0xff);

		length = (byte) buf << 8;

		buf = read();
		if(buf == -1)
			throw new IOException("premature end of file.");
		data[2] = (byte) (buf & 0xff);

		length |= (byte) buf & 0xff;
		
		length -= 2;
		
		if(length > data.length)
			throw new IOException("length of structured field is too large: "+length);
				
		int read = read(data, 3, length);
		
		if(read < length)
			throw new IOException("premature end of file.");
		
		return factory.sf(data, 0, length + 2);
	}
	
}
