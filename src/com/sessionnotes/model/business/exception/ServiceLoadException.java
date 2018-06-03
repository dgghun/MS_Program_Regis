/**
 * 
 */
package com.sessionnotes.model.business.exception;

/**
 * <h1>ServiceLoadException</h1>
 * This a exception class that is used when ServiceSvcImpl
 * hits exceptions.
 * 
 * @author David Garcia
 * @version 1.0
 * @since 06-02-2018
 *
 */
public class ServiceLoadException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceLoadException(final String inMessage) {
		super(inMessage);
	}
	
	public ServiceLoadException(final String inServiceLoadMessage, final Throwable inNestedMessage) {
		super(inServiceLoadMessage, inNestedMessage);
	}
}
