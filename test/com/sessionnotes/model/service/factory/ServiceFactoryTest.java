/**
 * 
 */
package com.sessionnotes.model.service.factory;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sessionnotes.model.service.factory.ServiceFactory;

/**
 * @author David_Garcia
 *
 */
public class ServiceFactoryTest {
	private static ServiceFactory serviceFactory;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		serviceFactory = new ServiceFactory();	
		
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.service.factory.ServiceFactory#validate()}
	 */
	@Test
	public void testServiceFactoryValidate() {
		System.out.println("Starting testServiceFactoryValidate");
		serviceFactory.validate();
		System.out.println("testServiceFactoryValidate PASSED");
		
		
	}
}
