/**
 * 
 */
package com.sessionnotes.model.service.clientservice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.sessionnotes.model.domain.Client;
import com.sessionnotes.model.service.exception.ClientException;

/**
 * <h1>ClientSvcImpl</h1>
 * The client implementation class contains the client logic
 * for the IClientSvc interface. 
 * 
 * ONLY to use case createClient is implemented in this @version
 * and the other methods are stubbed out.
 * 
 * @author David Garcia
 * @version 2.0
 * @since 6-3-2018
 *
 */
public class ClientSvcImpl implements IClientSvc{
	
	private ObjectOutputStream output;
	private final String FILE_NAME_CLIENT = "clients";
	
	
	/**
	 * A temporary implementation of a file that should already be 
	 * ready for use once application starts. 
	 */
	public ClientSvcImpl() {
		
		makeFile(FILE_NAME_CLIENT);	//TODO this is temporary.
	}
	
	
	/**
	 * Creates and writes/serializes a single Client object to a file.
	 * @param client Client object
	 * @return boolean Returns true if 
	 */
	@Override
	public boolean createClient(Client client) throws ClientException{
		boolean success = false;
		
		try {
			output = new ObjectOutputStream(new FileOutputStream(FILE_NAME_CLIENT));
			output.writeObject(client);
			
			success = true;	// set to true indicating everything went well
			
		}catch (IOException ioException) {
			System.out.println("IOException while trying to save Client to file!");
			throw new ClientException("IOException while trying to save Client to file!", ioException);
		}catch (Exception e) {
			System.out.println("Exception while trying to save Client to file!");
			throw new ClientException("Exception while trying to save Client to file!", e);
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
	 * @param client
	 * @return client	Stubbed out for now
	 */
	public Client retrieveClient(Client client) {
		return client;
	}


	/**
	 * @param client
	 * @return client	Stubbed out for now
	 */
	public boolean updateClient(Client client) {
		return true;
	}
	
	
	/**
	 * This method makes a Client file emulating how the 
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
