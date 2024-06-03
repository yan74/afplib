package org.afplib.io;

import org.afplib.Data;
import org.afplib.base.SF;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.channels.FileChannel;

public class AfpInputStream extends FilterInputStream {

	StructuredFieldFactory factory = new StructuredFieldFactory();
	byte[] header = new byte[5];
	byte[] data = new byte[32768];
	int length;

	int number = 0;
	long offset = 0;
	int leadingLengthBytes = -1;
	boolean has5a = true;

	public AfpInputStream(InputStream in) {
		super(in);
		try {
            readFully(in, header, 0, header.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public AfpInputStream(InputStream in, int leadingBytesToIgnorePerSF) {
	    this(in);
		leadingLengthBytes = leadingBytesToIgnorePerSF;
	}

	public FileChannel position(long filepos) throws IOException {
		if(leadingLengthBytes == -1) {
			readStructuredField(); // get rid of the header and initialize leadingLengthBytes
		}
		if(in instanceof FileInputStream) {
			offset = filepos;
			FileChannel channel = ((FileInputStream)in).getChannel();
			return channel.position(filepos);
		}
		throw new IOException("position needs to be used with a FileInputStream");
	}

	/**
	 * Reads a new structured field from the input stream.
	 * This method is not thread-safe!
	 *
	 * @return structured field or null if end of input.
	 * @throws IOException
	 */
	public SF readStructuredField() throws IOException {
		long offset = readStructuredFieldData();
		if (offset == -1) return null;

		SF sf = factory.sf(data, 0, getLength() + 2);
		sf.setLength(length + 3);
		sf.setOffset(offset);
		sf.setNumber(number++);

		return sf;
	}

	/**
	 * Skips the next structured field in the input stream.
	 * This method is not thread-safe!
	 *
	 * @return true if a structured field was skipped or false if end of input
	 * @throws IOException
	 */
	public boolean skipStructuredField() throws IOException {
		long offset = readStructuredFieldData();
		if (offset == -1) return false;

		number++;

		return true;
	}

	/**
	 * Reads the raw data of a new structured field from the input stream.
	 * This method is not thread-safe!
	 *
	 * @return offset to structured field or -1 if end of input.
	 * @throws IOException
	 */
	private long readStructuredFieldData() throws IOException {
		int buf = 0;

		long thisOffset = offset;

		if(leadingLengthBytes == -1) {
			// we haven't tested for mvs download leading length bytes
			// we don't need them and don't want to see them
			int leadingLength = 0;
			do {
				buf = read(); offset++;
				leadingLength++;
			} while((buf & 0xff) != 0x5a && buf != -1 && leadingLength < 5);

			if((buf & 0xff) != 0x5a) {
			    has5a = false;
			    leadingLength = 1;
			    // so try if byte 3 is 0xd3 -> so this would be an afp without 5a magic byte
			    offset = 2;
			    buf = read();
			    if(buf == -1) return -1;
			    if((buf & 0xff) != 0xd3) {
		            throw new AfpFormatException("cannot find 5a magic byte nor d3 -> this is no AFP");
			    }
			    offset = 0;
			}

			leadingLengthBytes = leadingLength-1;

//			if(buf == -1 && leadingLength > 1)
//				throw new IOException("found trailing garbage at the end of file.");
		} else {
			if(leadingLengthBytes > 0) skipFully(this.in, leadingLengthBytes); // just throw away those
			if(has5a) {
			    buf = read();
			    offset++;
			}
		}

		if(buf == -1) {
			return -1;
		}

		if(has5a && (buf & 0xff) != 0x5a) {
			throw new AfpFormatException("cannot find 5a magic byte");
		}
		data[0] = 0x5a; // (byte) (buf & 0xff);

		buf = read();
		offset++;
		if(buf == -1 && !has5a) {
			return -1;
		}

		if(buf == -1) {
			throw new AfpFormatException("premature end of file.");
		}
		data[1] = (byte) (buf & 0xff);

		length = (byte) buf << 8;

		buf = read();
		offset++;
		if(buf == -1)
			throw new AfpFormatException("premature end of file.");
		data[2] = (byte) (buf & 0xff);

		length |= (byte) buf & 0xff;

		length -= 2;

		if(length > data.length)
			throw new AfpFormatException("length of structured field is too large: "+length);

		int read = read(data, 3, length);
		offset += read;

		if(read < length)
			throw new AfpFormatException("premature end of file.");
		return thisOffset;
	}

	@Override
	public int read() throws IOException {
		// Fix for Issue #65 "AFPInputStream does not handle structured field length correctly"
		// https://github.com/yan74/afplib/issues/65
		if (this.header != null && this.offset < this.header.length) {
			return this.header[(int) this.offset] & 0xff;
		}
		this.header = null;
		return super.read();
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
	    if(header != null && offset < header.length) {
	        int bytesToReadFromHeaderBuffer = Math.min(header.length - (int) offset, len);
            System.arraycopy(header, (int) offset, b, off, bytesToReadFromHeaderBuffer);
	        if(offset + len <= header.length) return len;

	        int res = readFully(in, b, off + bytesToReadFromHeaderBuffer, len - bytesToReadFromHeaderBuffer);
	        header = null;
	        return res + bytesToReadFromHeaderBuffer;
	    }
	    header = null;
	    return readFully(this.in, b, off, len);
	}

	/**
	 * Current position in the input stream
	 *
	 * @return position
	 */
	public long getCurrentOffset() {
		return offset;
	}

	/**
	 * returns a copy of the last read buffer that
	 * contained the previous structured field.
	 *
	 * @return copy of internal buffer
	 */
	public byte[] getLastReadBuffer() {
		byte[] result = new byte[length + 3];
		System.arraycopy(data, 0, result, 0, length + 3);
		return result;
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

	public int getLeadingLengthBytes() {
		return leadingLengthBytes;
	}

	private static int readFully(final InputStream stream, final byte[] buffer, final int off, final int len)
			throws IOException {

		int read = 0;
		while (read < len) {
			if (Thread.currentThread().isInterrupted()) {
				throw new InterruptedIOException();
			}
			final long cur = stream.read(buffer, off + read, len - read);
			if (cur < 0) {
				return read == 0 ? -1 : read;
			}
			read += cur;
		}
		return read;
	}

	public static long skipFully(final InputStream stream, final long length) throws IOException {

		long skipped = 0;
		while (skipped < length) {
			if (Thread.currentThread().isInterrupted()) {
				throw new InterruptedIOException();
			}
			final long cur = stream.skip(length);
			if (cur == 0) {
				return skipped == 0 ? -1 : skipped;
			}
			skipped += cur;
		}
		return skipped;
	}

}
