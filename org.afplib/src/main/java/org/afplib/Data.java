package org.afplib;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Data {
	public static final char[] hexLookup = new char[] { '0', '1', '2', '3',
			'4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	public static final String LEFT = "  <!-- ";
	public static final String RIGHT = " -->";

	public static byte[] toSignedShort(int value) {
		byte[] bytes = new byte[2];
		bytes[0] = (byte) ((value >> 8) & 0xff);
		bytes[1] = (byte) (value & 0xff);
		return bytes;
	}

	public static byte[] toSignedMedium(int value) {
		byte[] bytes = new byte[3];
		bytes[0] = (byte) ((value >> 16) & 0xff);
		bytes[1] = (byte) ((value >> 8) & 0xff);
		bytes[2] = (byte) (value & 0xff);
		return bytes;
	}

	public static byte[] toSignedLong(int value) {
		byte[] bytes = new byte[4];
		bytes[0] = (byte) ((value >> 24) & 0xff);
		bytes[1] = (byte) ((value >> 16) & 0xff);
		bytes[2] = (byte) ((value >> 8) & 0xff);
		bytes[3] = (byte) (value & 0xff);
		return bytes;
	}

	public static final int toUnsignedByte(byte b) {
		return b & 0xff;
	}

	public static final byte[] toUnsignedByte(int value) {
		byte[] bytes = new byte[1];
		bytes[0] = (byte) (value & 0xff);
		return bytes;
	}

	public static final int toUnsignedShort(byte[] buffer, int offset) {
		return (Data.toUnsignedByte(buffer[offset]) << 8)
				| Data.toUnsignedByte(buffer[offset + 1]);
	}

	public static final byte[] toUnsignedShort(int value) {
		byte[] bytes = new byte[2];
		bytes[0] = (byte) (((value & 0xff00) >> 8) & 0xff);
		bytes[1] = (byte) (value & 0xff);
		return bytes;
	}

	public static byte[] toUnsignedMedium(int value) {
		byte[] bytes = new byte[3];
		bytes[0] = (byte) (((value & 0xff0000) >> 16) & 0xff);
		bytes[1] = (byte) (((value & 0xff00) >> 8) & 0xff);
		bytes[2] = (byte) (value & 0xff);
		return bytes;
	}

	public static byte[] toUnsignedLong(int value) {
		byte[] bytes = new byte[4];
		bytes[0] = (byte) (((value & 0xff000000) >> 24) & 0xff);
		bytes[1] = (byte) (((value & 0xff0000) >> 16) & 0xff);
		bytes[2] = (byte) (((value & 0xff00) >> 8) & 0xff);
		bytes[3] = (byte) (value & 0xff);
		return bytes;
	}

	public static Integer toUnsigned(byte[] buffer, int start, int end) {

		if(start > end) throw new IllegalArgumentException("start > end");
		if(end - start > 4) throw new IllegalArgumentException("code size > 32 bit");
		if(end >= buffer.length) return null;
		
		int value = 0;

		for (int i = start; i <= end; i++) {
			value <<= 8;
			value |= Data.toUnsignedByte(buffer[i]);
		}

		return value;
	}

	public static int toSigned(byte[] buffer, int start, int end) {
		int value = buffer[start];

		for (int i = start + 1; i <= end; i++) {
			value <<= 8;
			value |= Data.toUnsignedByte(buffer[i]);
		}

		return value;
	}

	public static int lookup(char c) {
		for (int i = 0; i < hexLookup.length; i++) {
			if (c == hexLookup[i]) {
				return i;
			}
		}

		throw new RuntimeException("Invalid hex character (" + c + ")");
	}

	public static byte[] fromHex(String value) {
		int length = value.length();
		if (length % 2 != 0) {
			throw new RuntimeException("Invalid hex string length (" + value
					+ ")");
		}

		byte[] bytes = new byte[length / 2];

		for (int i = 0; i < bytes.length; i++) {
			int hiNibble = lookup(value.charAt(i * 2));
			int lowNibble = lookup(value.charAt((i * 2) + 1));
			bytes[i] = (byte) ((hiNibble << 4) | lowNibble);
		}

		return bytes;
	}

	public static String toHex(byte signedByte) {
		int unsignedByte = toUnsignedByte(signedByte);
		return "" + hexLookup[unsignedByte >> 4]
				+ hexLookup[unsignedByte & 0xf];
	}

	public static String toHex(byte[] buffer) {
		return formatHex(buffer, 0, buffer.length, -1, 0, "", "", "", false);
	}

	public static String toHex(byte[] buffer, int start, int length) {
		return Data.formatHex(buffer, start, length, -1, 0, "", "", "", false);
	}

	public static String formatHex(byte[] buffer, int indentAmount) {
		return formatHex(buffer, 0, buffer.length, 16, indentAmount, " ", " ",
				"\n", true);
	}

	public static Object formatHex(byte[] buffer, int offset, int length,
			int indentAmount) {
		return formatHex(buffer, offset, length, 16, indentAmount, " ", " ",
				"\n", true);
	}

	public static String formatHex(byte[] buffer, int offset, int length,
			int maximumBytesPerLine, int indentAmount, String indentString,
			String byteDelimiter, String recordDelimiter,
			boolean isFormatPrintables) {
		int delimiterCount = length / maximumBytesPerLine;
		int recordCount = delimiterCount + 1;
		int recordIndentSize = indentAmount * indentString.length();
		int totalIndentSize = recordIndentSize * recordCount;
		int hexDigitSize = length * 2;
		int hexDelimiterSize = length * byteDelimiter.length();
		int lineDelimiterSize = recordDelimiter.length() * recordCount;

		int hexCapacity = totalIndentSize + hexDigitSize + hexDelimiterSize
				+ lineDelimiterSize;

		StringBuilder hexBuilder = new StringBuilder(hexCapacity);

		int printablesCapacity = 0;
		String printables = null;
		StringBuilder printablesBuilder = null;

		if (isFormatPrintables) {
			int printablesSize = LEFT.length() + maximumBytesPerLine
					+ RIGHT.length();
			printablesCapacity = printablesSize * recordCount;
			printables = get(buffer, offset, length, Charset.forName("ibm500")); // TODO
																					// fix
																					// charset
		}

		int totalIterations = length;

		if (maximumBytesPerLine != -1) {
			totalIterations = ((length + maximumBytesPerLine - 1) / maximumBytesPerLine)
					* maximumBytesPerLine;
		}

		for (int i = 0; i < totalIterations; i++) {
			if ((maximumBytesPerLine != -1) && (i % maximumBytesPerLine == 0)) {
				if (i > 0) {
					hexBuilder.append(recordDelimiter);
				}
				if (isFormatPrintables) {
					printablesBuilder = new StringBuilder(printablesCapacity);
					printablesBuilder.append(LEFT);
				}
				for (int j = 0; j < indentAmount; j++) {
					hexBuilder.append(indentString);
				}
			} else {
				hexBuilder.append(byteDelimiter);
			}

			if (i < length) {
				int bufferIndex = offset + i;
				hexBuilder.append(hexLookup[(buffer[bufferIndex] >> 4) & 0xf]);
				hexBuilder.append(hexLookup[(buffer[bufferIndex] & 0xf)]);

				if (isFormatPrintables) {
					char c = printables.charAt(i);
					if (c < ' ' || c > '~' || c == '-') {
						c = '.';
					}
					printablesBuilder.append(c);
				}
			} else {
				hexBuilder.append("  ");
				if (isFormatPrintables) {
					printablesBuilder.append(" ");
				}
			}

			if ((maximumBytesPerLine != -1)
					&& ((i + 1) % maximumBytesPerLine == 0)) {
				if (isFormatPrintables) {
					hexBuilder.append(printablesBuilder);
					hexBuilder.append(RIGHT);
				}
			}

		}

		return hexBuilder.toString();
	}

	public static String copy(String value, int copies) {
		StringBuilder s = new StringBuilder(value.length() * copies);
		for (int i = 0; i < copies; i++) {
			s.append(value);
		}
		return s.toString();
	}

	public static String get(byte[] buffer, int start, int length,
			Charset charset) {
		// Java 1.5 does not support the Java 1.6 String.String(byte[], int,
		// int, Charset) constructor
		// return new String(buffer, start, length, charset);
		try {
			return new String(buffer, start, length, charset.name());
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public static byte[] copyOf(byte[] buffer, int newLength) {
		// Java 1.5 does not support the Java 1.6 Arrays.copyOf(byte[], int)
		// method
		// returnBuffer = Arrays.copyOf(buffer, length + 3);
		byte[] returnBuffer = new byte[newLength];
		for (int i = 0; i < newLength; i++) {
			returnBuffer[i] = buffer[i];
		}
		return returnBuffer;
	}

	public static byte[] copyOf(byte[] buffer, int offset, int length) {
		byte[] returnBuffer = new byte[length];
		for (int i = 0; i < length; i++) {
			returnBuffer[i] = buffer[offset + i];
		}
		return returnBuffer;
	}

	public static byte[] getBytes(String value, Charset charset) {
		// Java 1.5 does not support the Java 1.6 String.getBytes(Charset)
		// method
		// byte[] byteValue = value.getBytes(c);
		try {
			byte[] byteValue = value.getBytes(charset.name());
			return byteValue;
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	private enum UrlDecoderState {
		INITIAL, FIRST_HEX, SECOND_HEX,
	};

	// Like java.net.URLDecoder except no conversion of "+" to space

	public static String decode(String urlString) {
		StringBuilder s = new StringBuilder();
		UrlDecoderState state = UrlDecoderState.INITIAL;
		int hiNibble = 0;
		int lowNibble = 0;
		int length = urlString.length();
		for (int i = 0; i < length; i++) {
			char c = urlString.charAt(i);
			switch (state) {
			case INITIAL:
				if (c == '%') {
					state = UrlDecoderState.FIRST_HEX;
				} else {
					s.append(c);
				}
				break;
			case FIRST_HEX:
				hiNibble = lookup(c);
				state = UrlDecoderState.SECOND_HEX;
				break;
			case SECOND_HEX:
				lowNibble = lookup(c);
				byte b = (byte) ((hiNibble << 4) | lowNibble);
				s.append((char) b);
				state = UrlDecoderState.INITIAL;
				break;
			}
		}
		return s.toString();
	}

	public static byte[] concat(byte[] A, byte[] B) {
		byte[] C = new byte[A.length + B.length];
		System.arraycopy(A, 0, C, 0, A.length);
		System.arraycopy(B, 0, C, A.length, B.length);

		return C;
	}

}
