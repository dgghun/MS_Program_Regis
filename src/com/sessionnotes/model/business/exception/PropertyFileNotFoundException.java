/**
 * 
 */
package com.sessionnotes.model.business.exception;

/**
 * <h1>PropertyFileNotFoundException.java</h1>
 * 
 * This custom exception class is responsible for catching exceptions
 * when trying to access the application's property files.
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-08-2018
 *
 */
public class PropertyFileNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public PropertyFileNotFoundException(final String message) {
		super(message);
	}
	
	
	public PropertyFileNotFoundException(final String message, final Throwable cause) {
		super(message, cause);
	}
	

}
