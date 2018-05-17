/**
 * 
 */
package com.sessionnotes.model.domain;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author David Garcia
 *
 */
public class AddressTest {
	
	private static Address address1;
	private static Address address2;
	private static Address address3;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//Create Address objects
		address1 = new Address("123 S. Code Ave.","123456","TechVille","CA");
		address2 = new Address("123 S. Code Ave.","123456","TechVille","CA");
		address3 = new Address("456 N. Code Ave.","123456","TechVille","CA");
	}

	
	/**
	 * Test method for {@link com.sessionnotes.model.domain.Address#validate()}
	 */
	@Test
	public void testValidateAddress() {
		System.out.println("Starting testValidateAddress");
		assertTrue("Address Validate", address1.validate());
		System.out.println("testValidateAddress PASSED\n");
		
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.domain.Address#equals(Object)} 
	 */
	@Test
	public void testEqualsAddress() {
		System.out.println("Starting testEqualsAddress");
		assertTrue("address1 equals address2", address1.equals(address2));
		assertFalse("address1 equals address3", address1.equals(address3));
		System.out.println("testEqualsAddress PASSED\n");
	}

}
