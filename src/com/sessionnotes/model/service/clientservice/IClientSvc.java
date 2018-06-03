/**
 * 
 */
package com.sessionnotes.model.service.clientservice;

import com.sessionnotes.model.domain.Client;
import com.sessionnotes.model.service.IService;
import com.sessionnotes.model.service.exception.ClientException;

/**
 * <h1>IClientSvc</h1>
 * This class is an interface that extends IService for 
 * services that handle Client class logic.
 * 
 * @author David Garcia
 * @version 2.0
 * @since 6-2-2018
 *
 */
public interface IClientSvc extends IService{
	
	public final String NAME = "IClientSvc";	// Factory will look up NAME in properties file.
	
	public boolean createClient(Client client) throws ClientException;
	public Client retrieveClient(Client client) throws ClientException;
	public boolean updateClient(Client client) throws ClientException;

}
