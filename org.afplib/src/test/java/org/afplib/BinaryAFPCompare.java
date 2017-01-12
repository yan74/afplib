package org.afplib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class BinaryAFPCompare {

	public static boolean equals(File f1, File f2, PrintWriter out) throws IOException {
		return equals(f1, f2, out, false);
	}

	public static boolean equals(File f1, File f2, PrintWriter out, boolean strict) throws IOException {

		boolean result = true;

		FileInputStream is1 = null, is2 = null;
		out.println(String.format("checking %s vs. %s", f1.getName(), f2.getName()));

		try {
			long pos = 0;
			int number = 1;
			is1 = new FileInputStream(f1);
			is2 = new FileInputStream(f2);

			byte[] b1 = new byte[32768];
			byte[] b2 = new byte[32768];
			while(true) {
				boolean ignore = false;

				if(is1.read(b1, 0, 1) == -1) break;
				is2.read(b2, 0, 1);

				if(b1[0] == 0xd) {
					if(is1.read(b1, 0, 1) == -1) break;
					if(b1[0] != 0xa) {
						out.println("seemed like crlf but lf is missing in f1 at "+number+"/"+pos);
						return false;
					}
					if(is1.read(b1, 0, 1) == -1) break;
					pos+=2;
				}

				if(b1[0] != 0x5a) {
					out.println("missing 5a in f1 at "+number+"/"+pos);
					return false;
				}
				if(b2[0] != 0x5a) {
					out.println("missing 5a in f2 at "+number+"/"+pos);
					return false;
				}

				if(is1.read(b1, 1, 8) == -1) break;
				is2.read(b2, 1, 8);

				int l1 = readSF(is1, b1);
				int l2 = readSF(is2, b2);

				int id1 = Data.toUnsigned(b1, 3, 5);
				int id2 = Data.toUnsigned(b2, 3, 5);

				if(id1 == 0xd3a6af && l1 == 22 && l2 == 23) // common problem with PGD not having reserved field
					ignore = true;

				if(!ignore || strict) {
					if(l1 != l2) {
						out.println(String.format("length of sf %X differs (f1:%d f2:%d) at %d/%d",id1,l1,l2,number,pos));
						result = false;
					}

					if(id1 != id2) {
						out.println(String.format("id of sf differs (f1:%X f2:%X) at %d/%d",id1,id2,number,pos));
						return false;
					}

//					if(l1 > 8)
//						is1.read(b1, 9, l1 - 8);
//					if(l2 > 8)
//						is2.read(b2, 9, l2 - 8);

					if((l1 > 8 || strict) && !equals(b1, l1, b2, l2)) {
						if(l1 == l2) {
							out.println(String.format("content for sf %X differs at %d/%d",id1,number,pos));
							result = false;
						}
						printDifference(b1, l1, b2, l2, out);
					}
				}

				pos += l1 + 1;
				number++;
			}

		} finally {
			if(is1 != null) try { is1.close(); } catch(IOException e) {}
			if(is2 != null) try { is2.close(); } catch(IOException e) {}
		}

		return result;

	}

	private static int readSF(FileInputStream is, byte[] buffer) throws IOException {
		int length = Data.toUnsignedShort(buffer, 1);

		if(length > 8)
			is.read(buffer, 9, length - 8);

		if((buffer[6] & 0x08) == 0x08) { // padding
			int padding = 0;
			if(buffer[length - 1] == 0) {
				padding = Data.toUnsigned(buffer, length-3, length-2);
			} else {
				padding = Data.toUnsigned(buffer, length-1, length-1);
			}
			length -= padding;
		}
		return length;
	}

	private static void printDifference(byte[] b1, int l1, byte[] b2, int l2, PrintWriter out) {
		boolean equal = true;
		for(int i= 9; i<Math.min(l1, l2); i++) {
			if(b1[i] != b2[i]) {
				if(equal) {
					equal = false;
					out.print(String.format("{ %02x ", b1[i]));
				} else {
					out.print(String.format("%02x ", b1[i]));
				}
			} else {
				if(equal) {
					out.print(String.format("%02x ", b1[i]));
				} else {
					equal = true;
					out.print(String.format("} %02x ", b1[i]));
				}
			}
		}
		if(!equal) out.print("}");
		for(int i=l2; i<l1; i++) {
			out.print(String.format("%02x ", b1[i]));
		}
		out.println();
		equal = true;
		for(int i= 9; i<Math.min(l1, l2); i++) {
			if(b1[i] != b2[i]) {
				if(equal) {
					equal = false;
					out.print(String.format("{ %02x ", b2[i]));
				} else {
					out.print(String.format("%02x ", b2[i]));
				}
			} else {
				if(equal) {
					out.print(String.format("%02x ", b2[i]));
				} else {
					equal = true;
					out.print(String.format("} %02x ", b2[i]));
				}
			}
		}
		if(!equal) out.print("}");
		for(int i=l1; i<l2; i++) {
			out.print(String.format("%02x ", b2[i]));
		}
		out.println();
	}

	private static boolean equals(byte[] b1, int l1, byte[] b2, int l2) {
		for(int i= 9; i<Math.min(l1, l2); i++) {
			if(b1[i] != b2[i]) return false;
		}
		return true;
	}

}
