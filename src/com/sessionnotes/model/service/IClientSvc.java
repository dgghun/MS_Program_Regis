/**
 * 
 */
package com.sessionnotes.model.service;

import com.sessionnotes.model.domain.Client;

/**
 * <h1>IClientSvc</h1>
 * This class is an interface for services that handle
 * Client class logic.
 * 
 * @author David Garcia
 * @version 1.0
 * @since 5-26-2018
 *
 */
public interface IClientSvc {
	public Client createClient(Client client);
	public Client retrieveClient(Client client);
	public Client updateClient(Client client);

}
