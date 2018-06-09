/**
 * 
 */
package com.sessionnotes.model.service.sessionservice;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sessionnotes.model.business.exception.ServiceLoadException;
import com.sessionnotes.model.domain.Address;
import com.sessionnotes.model.domain.Client;
import com.sessionnotes.model.domain.InsuranceCard;
import com.sessionnotes.model.domain.Name;
import com.sessionnotes.model.domain.Session;
import com.sessionnotes.model.service.exception.SessionException;
import com.sessionnotes.model.service.factory.ServiceFactory;

/**
 * @author David_Garcia
 * @since 6-3-2018
 *
 */
public class SessionSvcImplTest {
	private static ServiceFactory serviceFactory;
	private static ISessionSvc sessionSvc;
	private static Client client;
	private static Session session;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		serviceFactory = ServiceFactory.getInstance();
		
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
		
		//In case tests are run out of order this service is instantiated
		sessionSvc = (ISessionSvc) serviceFactory.getService(ISessionSvc.NAME);
		
	}

	
	/**
	 * Test method for {@link com.sessionnotes.model.service.SessionSvcImpl#createSession(Session))}
	 */
	@Test
	public void testFactoryCreateSession() {
		try {
			sessionSvc = (ISessionSvc) serviceFactory.getService(ISessionSvc.NAME);
			System.out.println("\nStarting testSessionSvcImplCreateSession");
			assertTrue(sessionSvc.createSession(session));
			System.out.println("testSessionSvcImplCreateSession PASSED");
		} catch(ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoad exception");
		}catch(SessionException e) {
			e.printStackTrace();
			fail("SessionExcpetion exception");
		}
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.service.sessionservice.SessionSvcImpl#retrieveSession(Session)}
	 */
	@Test
	public void testFactoryRetrieveSession() {
		try {
			System.out.println("\nStarting testSessionSvcImplRetrieveSession");
			assertTrue(session.equals(sessionSvc.retrieveSession(session)));
			System.out.println("testSessionSvcImplRetrieveSession PASSED");
		} catch(Exception e) {
			e.printStackTrace();
			fail("SessionSvcImpl Exception on stubbed out method");
		}
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.service.sessionservice.SessionSvcImpl#updateSession(Session)}
	 */
	@Test
	public void testFactoryUpdateSession() {
		try {
			System.out.println("\nStarting testSessionSvcImplUpdateSession");
			assertTrue(sessionSvc.updateSession(session));
			System.out.println("testSessionSvcImplUpdateSession PASSED");
		}catch(Exception e) {
			e.printStackTrace();
			fail("SessionSvcImpl Exception on stubbed out method");
		}
	}
}
