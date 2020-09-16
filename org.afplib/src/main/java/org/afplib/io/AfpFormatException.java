package org.afplib.io;

import java.io.IOException;

public class AfpFormatException extends IOException {

	public AfpFormatException() {
		super();
	}

	public AfpFormatException(String message) {
		super(message);
	}

	public AfpFormatException(Throwable cause) {
		super(cause);
	}

	public AfpFormatException(String message, Throwable cause) {
		super(message, cause);
	}

}
