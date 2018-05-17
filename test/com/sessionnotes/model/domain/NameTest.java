/**
 * 
 */
package com.sessionnotes.model.domain;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author david
 *
 */
public class NameTest {

	private static Name name1, name2, name3;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//Create Name objects
		name1 = new Name("David", "Garcia", "Gabriel");
		name2 = new Name("David", "Garcia", "Gabriel");
		name3 = new Name("Mel", "Garcia", "Lynn");
	}

	/**
	 * Test method for {@link com.sessionnotes.model.domain.Name#validate()}
	 */
	@Test
	public void testValidateName() {
		System.out.println("Starting testValidateName");
		assertTrue("Name Validate", name1.validate());
		System.out.println("testValidateName PASSED\n");
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.domain.Name#equals(Object)} 
	 */
	@Test
	public void testEqualsName() {
		System.out.println("Starting testEqualsName");
		assertTrue("name1 equals name2", name1.equals(name2));
		assertFalse("name1 equals name3", name1.equals(name3));
		System.out.println("testEqualsName PASSED\n");
	}

}
