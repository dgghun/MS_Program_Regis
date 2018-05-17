/**
 * 
 */
package com.sessionnotes.model.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author David Garcia
 *
 */
public class ClientTest {

	private static Client client1;
	private static Client client2, client3;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		// Setup client information to add to Client objects
		Name name = new Name("David","Garcia","Gabriel");
		Name name2 = new Name("Mel","Garcia","Lynn");
		Address address = new Address("123 S. Code Ave.","123456","TechVille","CA");
		GregorianCalendar birthdate = new GregorianCalendar(1981, 12, 22);
		InsuranceCard insuranceCard = new InsuranceCard("Medicare","123","456", name, address, "909-555-5555", birthdate);
		ArrayList<Name> secondaryClients = new ArrayList<Name>();
		secondaryClients.add(name2);
		short fee = 123;
		
		//Create Client objects
		client1 = new Client(123, name, "909-555-5555", address, "dave@regis.edu", fee, secondaryClients, insuranceCard);
		client2 = new Client(123, name, "909-555-5555", address, "dave@regis.edu", fee, secondaryClients, insuranceCard);
		client3 = new Client(123, name, "xxx-xxx-xxxx", address, "dave@software.org", fee, secondaryClients, insuranceCard);
	}

	/**
	 * Test method for {@link com.sessionnotes.model.domain.Client#validate()}
	 */
	@Test
	public void testValidateClient() {
		System.out.println("Starting testValidateClient");
		assertTrue("Client Validate", client1.validate());
		System.out.println("testValidateClient PASSED\n");
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.domain.Client#equals(Object)} 
	 */
	@Test
	public void testEqualsClient() {
		System.out.println("Starting testEqualsClient");
		assertTrue("client1 equals client2", client1.equals(client2));
		assertFalse("client1 equals client3", client1.equals(client3));
		System.out.println("testEqualsClient PASSED\n");
	}


}
