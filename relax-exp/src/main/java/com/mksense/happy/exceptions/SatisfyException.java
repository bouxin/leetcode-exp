package com.mksense.happy.exceptions;

/**
 * @author lubosson
 * @see com.mksense.happy.exceptions
 * @since 2020-08-21
 */
public class SatisfyException extends RuntimeException {

	/**
	 * Constructs a new runtime exception with the specified detail message. The cause is
	 * not initialized, and may subsequently be initialized by a call to {@link
	 * #initCause}.
	 *
	 * @param message the detail message. The detail message is saved for later retrieval
	 * by the {@link #getMessage()} method.
	 */
	public SatisfyException(String message) {
		super(message);
	}
}
