/**
 * 
 */
package com.sessionnotes.model.service.exception;

/**
 * <h1>SessionException</h1>
 * This a exception class that is used when SessionSvcImpl
 * hits exceptions.
 * 
 * @author David Garcia
 * @version 1.0
 * @since 06-02-2018
 *
 */
public class SessionException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SessionException(final String inMessage) {
		super(inMessage);
	}
	
	public SessionException(final String inSessionMessage, final Throwable inNestedMessage) {
		super(inSessionMessage, inNestedMessage);
	}

}
