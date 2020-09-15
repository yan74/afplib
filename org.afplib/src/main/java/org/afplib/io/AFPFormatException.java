package org.afplib.io;

import java.io.IOException;

public class AFPFormatException extends IOException {

	public AFPFormatException() {
		super();
	}

	public AFPFormatException(String message) {
		super(message);
	}

	public AFPFormatException(Throwable cause) {
		super(cause);
	}

	public AFPFormatException(String message, Throwable cause) {
		super(message, cause);
	}

}
