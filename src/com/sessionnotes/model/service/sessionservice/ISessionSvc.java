/**
 * 
 */
package com.sessionnotes.model.service.sessionservice;

import com.sessionnotes.model.domain.Session;
import com.sessionnotes.model.service.IService;
import com.sessionnotes.model.service.exception.SessionException;

/**
 * <h1>ISessionSvc</h1>
 * This class is an interface IService for 
 * services that handle Session class logic.
 * 
 * @author David Garcia
 * @version 2.0
 * @since 6-2-2018
 *
 */
public interface ISessionSvc extends IService{
	
	public final String NAME = "ISessionSvc";	// Factory will look up NAME in properties file.
	
	public Session createSession(Session session) throws SessionException;
	public Session retrieveSession(Session session) throws SessionException;
	public Session updateSession(Session session) throws SessionException;
}
