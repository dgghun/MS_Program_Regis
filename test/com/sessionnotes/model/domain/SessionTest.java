/**
 * 
 */
package com.sessionnotes.model.domain;

import static org.junit.Assert.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author David Garcia
 *
 */
public class SessionTest {

	private static Session session1, session2, session3;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		// Setup client information to add to Client objects
		Name name = new Name("David", "Garcia", "Gabriel");
		Name name2 = new Name("Mel", "Garcia", "Lynn");
		Address address = new Address("123 S. Code Ave.", "123456", "TechVille", "CA");
		GregorianCalendar birthdate = new GregorianCalendar(1981, 12, 22);
		InsuranceCard insuranceCard = new InsuranceCard("Medicare", "123", "456", name, address, "909-555-5555", birthdate);
		ArrayList<Name> secondaryClients = new ArrayList<Name>();
		secondaryClients.add(name2);
		short fee = 123;
		Client client = new Client(123, name, "909-555-5555", address, "dave@regis.edu", fee, secondaryClients, insuranceCard);
		Calendar date = new GregorianCalendar();
		Time time = new Time(date.getTimeInMillis());
		String note = "This is a note about how the session went with a client.";
		
		//Create Session objects
		session1 = new Session(client, date, time, fee, fee, "Cash", note);
		session2 = new Session(client, date, time, fee, fee, "Cash", note);
		session3 = new Session(client, date, time, fee, fee, "Visa", note);
	}

	/**
	 * Test of method {@link com.sessionnotes.model.domain.Session#validate()}
	 */
	@Test
	public void testValidateSession() {
		System.out.println("Starting testValidateSession");
		assertTrue("Session Validate", session1.validate());
		System.out.println("testValidateSession PASSED\n");
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.domain.Session#equals(Object)} 
	 */
	@Test
	public void testEqualsSession() {
		System.out.println("Starting testEqualsSession");
		assertTrue("session1 equals session2", session1.equals(session2));
		assertFalse("session1 equals session3", session1.equals(session3));
		System.out.println("testEqualsSession PASSED\n");
	}

}
