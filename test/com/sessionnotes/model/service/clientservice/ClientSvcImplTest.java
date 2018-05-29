/**
 * 
 */
package com.sessionnotes.model.service.clientservice;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sessionnotes.model.domain.Address;
import com.sessionnotes.model.domain.Client;
import com.sessionnotes.model.domain.InsuranceCard;
import com.sessionnotes.model.domain.Name;
import com.sessionnotes.model.service.clientservice.IClientSvc;
import com.sessionnotes.model.service.factory.ServiceFactory;

/**
 * @author David_Garcia
 *
 */
public class ClientSvcImplTest {
	private static ServiceFactory serviceFactory;
	private static IClientSvc clientSvc;
	private static Client client;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		serviceFactory = new ServiceFactory();	// Create factory object
		clientSvc = serviceFactory.getClientSvc();	// Get Client service from Factory
		
		// Setup client information to add to Client objects
		Name name = new Name("David", "Garcia", "Gabriel");
		Name name2 = new Name("Mel", "Garcia", "Lynn");
		Address address = new Address("123 S. Code Ave.", "123456", "TechVille", "CA");
		GregorianCalendar birthdate = new GregorianCalendar(1981, 12, 22);
		InsuranceCard insuranceCard = new InsuranceCard("Medicare", "123", "456", name, address, "909-555-5555", birthdate);
		ArrayList<Name> secondaryClients = new ArrayList<Name>();
		secondaryClients.add(name2);
		short fee = 123;

		// Create Client objects
		client = new Client(123, name, "909-555-5555", address, "dave@regis.edu", fee, secondaryClients, insuranceCard);
	}

	
	/**
	 * Test method for {@link com.sessionnotes.model.service.clientservice.ClientSvcImpl#createClient(Client)}
	 */
	@Test
	public void testFactoryCreateClient() {
		System.out.println("Starting testFactoryCreateClient");
		assertTrue(client.equals(clientSvc.createClient(client)));
		System.out.println("testFactoryCreateClient PASSED");
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.service.clientservice.ClientSvcImpl#retrieveClient(Client)}
	 */
	@Test
	public void testFactoryRetrieveClient() {
		System.out.println("Starting testFactoryRetrieveClient");
		assertTrue(client.equals(clientSvc.retrieveClient(client)));
		System.out.println("testFactoryRetrieveClient PASSED");
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.service.clientservice.ClientSvcImpl#updateClient(Client)}
	 */
	@Test
	public void testFactoryUpdateClient() {
		System.out.println("Starting testFactoryUpdateClient");
		assertTrue(client.equals(clientSvc.updateClient(client)));
		System.out.println("testFactoryUpdateClient PASSED");
	}
}
