package org.afplib.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

import org.afplib.base.SF;

public class AfpFile extends RandomAccessFile {

	private final class AfpIn extends InputStream {
		private AfpFile afpFile;

		public AfpIn(AfpFile afpFile) {
			this.afpFile = afpFile;
		}

		@Override
		public int read(byte[] b, int off, int len) throws IOException {
			return afpFile.read(b, off, len);
		}

		@Override
		public int read() throws IOException {
			try {
				return afpFile.readByte();
			} catch(EOFException e) {
				return -1;
			}
		}
	}
	
	private final class AfpOut extends OutputStream {
		private AfpFile afpFile;

		public AfpOut(AfpFile afpFile) {
			this.afpFile = afpFile;
		}
		
		@Override
		public void write(byte[] b, int off, int len) throws IOException {
			afpFile.write(b, off, len);
		}

		@Override
		public void write(int b) throws IOException {
			afpFile.writeByte(b);
		}
	}

	public AfpFile(File file, String mode) throws FileNotFoundException {
		super(file, mode);
	}
	
	public SF readStructuredField() throws IOException {
		try(AfpInputStream afpin = new AfpInputStream(new AfpIn(this))) {
			return afpin.readStructuredField();
		}
	}
	
	public void writeStructuredField(SF sf) throws IOException {
		throw new UnsupportedOperationException();
//		try(AfpOutputStream afpout = new AfpOutputStream(new AfpOut(this))) {
//			afpout.writeStructuredField(sf);
//		}
	}

}
