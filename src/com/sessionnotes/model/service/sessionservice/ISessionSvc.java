/**
 * 
 */
package com.sessionnotes.model.service.sessionservice;

import com.sessionnotes.model.domain.Session;

/**
 * <h1>ISessionSvc</h1>
 * This class is an interface for services that handle
 * Session class logic.
 * 
 * @author David Garcia
 * @version 1.0
 * @since 5-26-2018
 *
 */
public interface ISessionSvc {
	public Session createSession(Session session);
	public Session retrieveSession(Session session);
	public Session updateSession(Session session);
}
