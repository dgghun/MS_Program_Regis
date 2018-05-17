/**
 * 
 */
package com.sessionnotes.model.domain;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author David Garcia
 *
 */
public class InsuranceCardTest {

	private static InsuranceCard insuranceCard1;
	private static InsuranceCard insuranceCard2, insuranceCard3;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		// Setup client information to add to Client objects
		Name name = new Name("David","Garcia","Gabriel");
		Address address = new Address("123 S. Code Ave.","123456","TechVille","CA");
		GregorianCalendar birthdate = new GregorianCalendar(1981, 12, 22);
		
		//Create InsuranceCard Objects
		insuranceCard1 = new InsuranceCard("Medicare","123","456", name, address, "909-555-5555", birthdate);
		insuranceCard2 = new InsuranceCard("Medicare","123","456", name, address, "909-555-5555", birthdate);
		insuranceCard3 = new InsuranceCard("Medicare","001","001", name, address, "909-777-5555", birthdate);
		
	}

	/**
	 * Test method for {@link com.sessionnotes.model.domain.InsuranceCard#validate()}
	 */
	@Test
	public void testValidateInsurance() {
		System.out.println("Starting testValidateInsuranceCard");
		assertTrue("InsuranceCard Validate", insuranceCard1.validate());
		System.out.println("testValidateInsuranceCard PASSED\n");
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.domain.InsuranceCard#equals(Object)} 
	 */
	@Test
	public void testEqualsInsuranceCard() {
		System.out.println("Starting testEqualsInsuranceCard");
		assertTrue("insuranceCard1 equals insuranceCard2", insuranceCard1.equals(insuranceCard2));
		assertFalse("insuranceCard1 equals insuranceCard3", insuranceCard1.equals(insuranceCard3));
		System.out.println("testEqualsInsuranceCard PASSED\n");
	}
}
