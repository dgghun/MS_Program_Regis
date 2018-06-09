/**
 * 
 */
package com.sessionnotes.model.business.manager;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.sessionnotes.model.domain.Address;
import com.sessionnotes.model.domain.Client;
import com.sessionnotes.model.domain.InsuranceCard;
import com.sessionnotes.model.domain.Name;
import com.sessionnotes.model.domain.Session;

import junit.framework.TestCase;

/**
 * @author David Garcia
 */
public class SessionNotesManagerTest extends TestCase{
	private SessionNotesManager sessionNotesManager;
	private Client client;
	private Session session;
	

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		// Setup client information to add to Client objects
		Name name = new Name("David","Garcia","Gabriel");
		Name name2 = new Name("Mel","Garcia","Lynn");
		Address address = new Address("123 S. Code Ave.","123456","TechVille","CA");
		GregorianCalendar birthdate = new GregorianCalendar(1981, 12, 22);
		InsuranceCard insuranceCard = new InsuranceCard("Medicare","123","456", name, address, "909-555-5555", birthdate);
		ArrayList<Name> secondaryClients = new ArrayList<Name>();
		secondaryClients.add(name2);
		short fee = 123;
		Calendar date = new GregorianCalendar();
		Time time = new Time(date.getTimeInMillis());
		String note = "This is a note about how the session went with a client.";
		
		//Create Client and Session objects
		client = new Client(123, name, "909-555-5555", address, "dave@regis.edu", fee, secondaryClients, insuranceCard);
		session = new Session(client, date, time, fee, fee, "Cash", note);
		
		sessionNotesManager = SessionNotesManager.getInstance();
		
	}

	
	/**
	 * Test for {@link com.sessionnotes.model.business.manager.SessionNotesManager#performAction(String, Client)}
	 */
	public final void testPeformActionCreateClient() {
		System.out.println("\nStarting testNotesManagerPeformActionCreateClient");
		assertTrue(sessionNotesManager.performAction(SessionNotesManager.CREATE_CLIENT, client));
		System.out.println("testNotesManagerPeformActionCreateClient PASSED");
	}
	
	
	/**
	 * Test for {@link com.sessionnotes.model.business.manager.SessionNotesManager#performAction(String, Session)}
	 */
	public final void testPeformActionCreateSession() {
		System.out.println("\nStarting testNotesManagerPeformActionCreateSession");
		assertTrue(sessionNotesManager.performAction(SessionNotesManager.CREATE_SESSION, session));
		System.out.println("testNotesManagerPeformActionCreateSession PASSED");
	}

}
