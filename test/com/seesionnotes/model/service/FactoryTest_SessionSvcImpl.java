/**
 * 
 */
package com.seesionnotes.model.service;

import static org.junit.Assert.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sessionnotes.model.domain.Address;
import com.sessionnotes.model.domain.Client;
import com.sessionnotes.model.domain.InsuranceCard;
import com.sessionnotes.model.domain.Name;
import com.sessionnotes.model.domain.Session;
import com.sessionnotes.model.service.Factory;
import com.sessionnotes.model.service.ISessionSvc;

/**
 * @author David Garcia
 *
 */
public class FactoryTest_SessionSvcImpl {

	private static Factory factory;
	private static ISessionSvc sessionSvc;
	private static Client client;
	private static Session session;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = new Factory();
		sessionSvc = factory.getSessionSvc();
		
		// Setup client information to add to Client objects
		Name name = new Name("David", "Garcia", "Gabriel");
		Name name2 = new Name("Mel", "Garcia", "Lynn");
		Address address = new Address("123 S. Code Ave.", "123456", "TechVille", "CA");
		GregorianCalendar birthdate = new GregorianCalendar(1981, 12, 22);
		InsuranceCard insuranceCard = new InsuranceCard("Medicare", "123", "456", name, address, "909-555-5555",
				birthdate);
		ArrayList<Name> secondaryClients = new ArrayList<Name>();
		secondaryClients.add(name2);
		short fee = 123;

		// Create Client objects
		client = new Client(123, name, "909-555-5555", address, "dave@regis.edu", fee, secondaryClients, insuranceCard);

		// Set up Session info to add to Session object
		Calendar date = new GregorianCalendar();
		Time time = new Time(date.getTimeInMillis());
		String note = "This is a note about how the session went with a client.";

		// Create Session objects
		session = new Session(client, date, time, fee, fee, "Cash", note);

	}

	
	/**
	 * Test method for {@link com.sessionnotes.model.service.SessionSvcImpl#createSession(Session))}
	 */
	@Test
	public void testFactoryCreateSession() {
		System.out.println("Starting testFactoryCreateSession");
		assertTrue(session.equals(sessionSvc.createSession(session)));
		System.out.println("testFactoryCreateSession PASSED");
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.service.SessionSvcImpl#retrieveSession(Session)}
	 */
	@Test
	public void testFactoryRetrieveSession() {
		System.out.println("Starting testFactoryRetrieveSession");
		assertTrue(session.equals(sessionSvc.retrieveSession(session)));
		System.out.println("testFactoryRetrieveSession PASSED");
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.service.SessionSvcImpl#updateSession(Session)}
	 */
	@Test
	public void testFactoryUpdateSession() {
		System.out.println("Starting testFactoryUpdateSession");
		assertTrue(session.equals(sessionSvc.updateSession(session)));
		System.out.println("testFactoryUpdateSession PASSED");
	}
	
}
