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
 * for the IClientSvc interface. It is currently stubbed out
 * for now.
 * 
 * @author David Garcia
 * @version 1.0
 * @since 5-26-2018
 *
 */
public class ClientSvcImpl implements IClientSvc{
	
	private ObjectOutputStream output;
	
	/**
	 * @param client Client object
	 * @return boolean Returns true if 
	 */
	@Override
	public boolean createClient(Client client) throws ClientException{
		boolean success = false;
		
		try {
			
			output = new ObjectOutputStream(new FileOutputStream("clients"));
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
	
	

}
