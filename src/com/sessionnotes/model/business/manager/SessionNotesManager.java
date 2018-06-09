/**
 * 
 */
package com.sessionnotes.model.business.manager;

import com.sessionnotes.model.business.exception.ServiceLoadException;
import com.sessionnotes.model.domain.Client;
import com.sessionnotes.model.domain.Session;
import com.sessionnotes.model.service.clientservice.IClientSvc;
import com.sessionnotes.model.service.exception.ClientException;
import com.sessionnotes.model.service.exception.SessionException;
import com.sessionnotes.model.service.factory.ServiceFactory;
import com.sessionnotes.model.service.sessionservice.ISessionSvc;

/**
 * <h1>SessionNotesManager</h1>
 * 
 * This manager handles all the CRUD tasks for the applications 
 * domain objects.  
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-09-2018
 *
 */
public class SessionNotesManager extends ManagerSuperType{
	
	public static final String CREATE_CLIENT = "createClient";
	public static final String CREATE_SESSION = "createSession";
	
	
	// Singleton pattern for one SessionNotesManager
	private SessionNotesManager() {}
	private static SessionNotesManager sessionNotesManager = new SessionNotesManager();
	public static SessionNotesManager getInstance() {return sessionNotesManager;}
	
	
	/**
	 * This method takes in the command string and executes
	 * the request on domain objects
	 */
	@Override
	public boolean performAction(String command, Object object) {
		boolean success = false;
		
		if(command.equals(CREATE_CLIENT)) {
			success = createClient(IClientSvc.NAME, (Client)object);
		}
		else if(command.equals(CREATE_SESSION)) {
			success = createSession(ISessionSvc.NAME, (Session)object);
		}
		
		return success;
	}
	
	
	/**
	 * This method gets the service factory to instantiate a
	 * Client service to create a new Client and persist it.
	 * 
	 * @param serviceName Name of service needed
	 * @param client The Client to persist
	 * @return True if create a client was successfully. 
	 */
	private boolean createClient(String serviceName, Client client) {
		boolean success = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		IClientSvc iClientSvc;
		final String MESSAGE = "SessionNotesManager: Failed to create new Client.";
		
		try {
			iClientSvc = (IClientSvc)serviceFactory.getService(serviceName);
			success = iClientSvc.createClient(client);
			
		}catch(ServiceLoadException serviceLoadException) {
			System.out.println(MESSAGE);
		}catch(ClientException clientException) {
			System.out.println(MESSAGE);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return success;
	}
	
	
	/**
	 * This method gets the service factory to instantiate a
	 * Session service to create a new Session and persist it.
	 * 
	 * @param serviceName Name of service needed
	 * @param session The Session to persist
	 * @return True if create a session was successfully.
	 */
	private boolean createSession(String serviceName, Session session) {
		boolean success = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ISessionSvc iSessionSvc;
		final String MESSAGE = "SessionNotesManager: Failed to create new Session.";
		
		try {
			iSessionSvc = (ISessionSvc)serviceFactory.getService(serviceName);
			success = iSessionSvc.createSession(session);
			
		}catch(ServiceLoadException serviceLoadException) {
			System.out.println(MESSAGE);
		}catch(SessionException sessionException) {
			System.out.println(MESSAGE);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return success;
	}
	

}
