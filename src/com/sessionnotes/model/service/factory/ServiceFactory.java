/**
 * 
 */
package com.sessionnotes.model.service.factory;

import com.sessionnotes.model.service.clientservice.ClientSvcImpl;
import com.sessionnotes.model.service.clientservice.IClientSvc;
import com.sessionnotes.model.service.sessionservice.ISessionSvc;
import com.sessionnotes.model.service.sessionservice.SessionSvcImpl;

/**
 * <h1>Factory</h1>
 * This factory is responsible instantiating and returning services
 * that this application requires.
 * 
 * @author David_Garcia
 * @version 1.0
 * @since 5-17-2018
 */
public class ServiceFactory {
	
	/**
	 * Validates that the ServiceFactory was able to return service objects
	 * @return Returns false if any service object is null, else returns true;
	 */
	public boolean validate() {
		if(this.getClientSvc() == null) 
			return false;
		if(this.getSessionSvc() == null)
			return false;
		return true;
	}
	
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
