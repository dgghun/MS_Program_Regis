/**
 * 
 */
package com.sessionnotes.model.service.exception;

/**
 * <h1>ClientException</h1>
 * This a exception class that is used when ClientSvcImpl
 * hits exceptions.
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-02-2018
 *
 */
public class ClientException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClientException(final String inMessage) {
		super(inMessage);
	}
	
	public ClientException(final String inClientMessage, final Throwable inNestedMessage) {
		super(inClientMessage, inNestedMessage);
	}

}
