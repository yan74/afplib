package org.afplib.io;

import java.nio.charset.Charset;

import org.afplib.Data;

class Saver {
	
	private static final Charset DEFAULT_CHARSET = Charset.forName("ibm500");
	
	static void save(byte[] buffer, int start, int stop, String string, Charset charset) {
		byte[] bString = string.getBytes(charset == null ? DEFAULT_CHARSET : charset);

		save(buffer, start, stop, bString);
	}
	
	static int save(byte[] buffer, int start, String string, Charset charset) {
//		CharsetEncoder enc = charset == null ? DEFAULT_CHARSET.newEncoder() : charset.newEncoder();
		byte[] bString = string == null ? new byte[0] : string.getBytes(charset == null ? DEFAULT_CHARSET : charset);

		// TODO replace this hack with something reasonable (supress BOM)
		if(charset != null && charset.name().equals("UTF-16") && bString.length >= 2 && bString[0] == (byte) 0xfe && bString[1] == (byte) 0xff) {
			byte[] b = new byte[bString.length - 2];
			System.arraycopy(bString, 2, b, 0, b.length);
			bString = b;
		}
		
		return save(buffer, start, bString);
	}

	static void save(byte[] buffer, int start, int stop, byte[] b) {
		for(int i = start; i<=stop && (i-start) < b.length; i++)
			buffer[i] = b[i-start];

		for(int i = start + b.length; i<=stop; i++)
			buffer[i] = (byte) 0x0;
	}
	
	static int save(byte[] buffer, int start, byte[] b) {
		if(b == null) return 0;
		int stop = start + b.length - 1;
		
		for(int i = start; i<=stop; i++)
			buffer[i] = b[i-start];

		return b.length;
	}

	static void saveSigned(byte[] buffer, int start, int stop, Integer integer) {
		byte[] bInt;
		
		switch(stop-start) {
		case 0: bInt = Data.toUnsignedByte(integer); break;
		case 1: bInt = Data.toSignedShort(integer); break;
		case 2: bInt = Data.toSignedMedium(integer); break;
		case 3: bInt = Data.toSignedLong(integer); break;
		default: throw new IllegalArgumentException(""+(stop-start));
		}
		for(int i = start; i<=stop; i++) {
			buffer[i] = bInt[i-start];
		}
	}
	
	static void saveUnsigned(byte[] buffer, int start, int stop, Integer integer) {
		byte[] bInt;
		
		switch(stop-start) {
		case 0: bInt = Data.toUnsignedByte(integer); break;
		case 1: bInt = Data.toUnsignedShort(integer); break;
		case 2: bInt = Data.toUnsignedMedium(integer); break;
		case 3: bInt = Data.toUnsignedLong(integer); break;
		default: throw new IllegalArgumentException(""+(stop-start));
		}
		for(int i = start; i<=stop; i++) {
			buffer[i] = bInt[i-start];
		}
	}

}
