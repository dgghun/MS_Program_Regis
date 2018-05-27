/**
 * 
 */
package com.sessionnotes.model.service;

/**
 * <h1>Factory</h1>
 * This factory is responsible instantiating and returning services
 * that this application requires.
 * 
 * @author David_Garcia
 * @version 1.0
 * @since 5-17-2018
 */
public class Factory {
	
	/**
	 * 
	 * @return ClientSvcImpl()	Returns a new Client service implementation. 
	 */
	public IClientSvc getClientSvc() {
		return new ClientSvcImpl();
	}
	
	/**
	 * 
	 * @return Returns a new Session service implementation.
	 */
	public ISessionSvc getSessionSvc() {
		return new SessionSvcImpl();
	}

}
