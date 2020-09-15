package org.afplib.io;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;

import org.afplib.Data;
import org.afplib.base.SF;

public class AfpMappedFile implements Closeable {

	StructuredFieldFactory factory = new StructuredFieldFactory();

	byte[] data = new byte[32768];

	int number = 0;
	int length;
	int leadingLengthBytes = -1;

	private MappedByteBuffer afpData;
	
	public AfpMappedFile(File afp) throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(afp);
			long size = afp.length();
			afpData = fis.getChannel().map(MapMode.READ_ONLY, 0, size);
		} finally {
			if(fis != null) fis.close();
		}
	}
	
	/**
	 * Reads a new structured field from the mapped file.
	 * This method is not thread-safe!
	 * 
	 * @return structured field or null if end of input.
	 * @throws IOException
	 */
	public SF next() throws IOException {

		int remaining = afpData.remaining();
		if(remaining == 0) return null;
		if(remaining < 9) throw new AFPFormatException("trailing garbage at the end of file.");
		
		byte buf;
		long thisOffset = afpData.position();

		try {
			if(leadingLengthBytes == -1) {
				// we haven't tested for mvs download leading length bytes
				// we don't need them and don't want to see them
				int leadingLength = 0;
				do {
					buf = afpData.get();
					leadingLength++;
				} while((buf & 0xff) != 0x5a && afpData.remaining() > 0 && leadingLength < 5);
				
				leadingLengthBytes = leadingLength-1;
								
			} else {
				if(leadingLengthBytes > 0) afpData.position(afpData.position() + leadingLengthBytes); // just throw away those
				buf = afpData.get();
			}
			
			if((buf & 0xff) != 0x5a)
				throw new AFPFormatException("cannot find 5a magic byte");
			data[0] = buf;
			
			buf = afpData.get();
			data[1] = buf;
			length = (byte) buf << 8;

			buf = afpData.get();
			data[2] = (byte) (buf & 0xff);
			length |= (byte) buf & 0xff;
			
			length -= 2;
			
			if(length + 3 > data.length)
				throw new AFPFormatException("length of structured field is too large: "+length);
					
			afpData.get(data, 3, length);
		} catch (BufferUnderflowException e) {
			return null; // FIXME could also be an error
		}
		
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

	@Override
	public void close() throws IOException {
		afpData.force();
		afpData = null; // actually there seems to be no close method on a mapped file ...
	}
}
