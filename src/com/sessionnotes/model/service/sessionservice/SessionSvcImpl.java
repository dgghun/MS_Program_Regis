package com.sessionnotes.model.service.sessionservice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.sessionnotes.model.domain.Session;
import com.sessionnotes.model.service.exception.SessionException;

/**
 * <h1>SessionSvcImpl</h1>
 * The session implementation class contains the service logic
 * for the ISessionSvc interface. .
 * 
 * ONLY to use case createSession is implemented in this @version
 * and the other methods are stubbed out.
 * 
 * @author David Garcia
 * @version 2.0
 * @since 6-3-2018
 *
 */
public class SessionSvcImpl implements ISessionSvc{
	
	private ObjectOutputStream output;
	private final String FILE_NAME_CLIENT = "sessions";

	
	/**
	 * A temporary implementation of a file that should already be 
	 * ready for use once application starts. 
	 */
	public SessionSvcImpl() {
		makeFile(FILE_NAME_CLIENT);		//TODO this is temporary.
	}
	
	
	/**
	 * Creates and writes/serializes a single Session object to a file.
	 * @param client Client object
	 * @return boolean Returns true if 
	 */
	public boolean createSession(Session session) throws SessionException{
		boolean success = false;

		try {
			output = new ObjectOutputStream(new FileOutputStream(FILE_NAME_CLIENT));
			output.writeObject(session);

			success = true;	// set to true indicating everything went well

		}catch (IOException ioException) {
			System.out.println("IOException while trying to save Session to file!");
			throw new SessionException("IOException while trying to save Session to file!", ioException);
		}catch (Exception e) {
			System.out.println("Exception while trying to save Session to file!");
			throw new SessionException("Exception while trying to save Session to file!", e);
		}finally {
			//Flush and close stream
			if(output != null) {
				try {
					output.flush();
					output.close();		
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}// end try/catch/finally

		return success;
	}
	

	/**
	 * @param session
	 * @return session	Stubbed out for now
	 */
	public Session retrieveSession(Session session) {
		System.out.println(session.toString());
		return session;
	}

	/**
	 * @param session
	 * @return session	Stubbed out for now
	 */
	public boolean updateSession(Session session) {
		return true;
	}
	
	
	/**
	 * This method makes a Session file emulating how the 
	 * program would work once a user had already logged in.
	 * When making account this file would be created. In the
	 * future a database file will be used and encrypted.
	 * 
	 * @param fileName Name of file to make
	 */
	private void makeFile(String fileName){
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.flush();
			out.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
