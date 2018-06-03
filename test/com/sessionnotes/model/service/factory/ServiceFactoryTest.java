/**
 * 
 */
package com.sessionnotes.model.service.factory;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sessionnotes.model.business.exception.ServiceLoadException;
import com.sessionnotes.model.service.clientservice.ClientSvcImpl;
import com.sessionnotes.model.service.clientservice.IClientSvc;

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
		serviceFactory = ServiceFactory.getInstance(); // Get factory singleton	
		
	}
	
	/**
	 * Test method for {@link com.sessionnotes.model.service.factory.ServiceFactory#validate()}
	 */
	@Test
	public void testServiceFactoryValidate() {
		IClientSvc clientSvc;
		
		try {
			System.out.println("\nStarting testServiceFactoryValidate");
			clientSvc = (IClientSvc) serviceFactory.getService(IClientSvc.NAME);
			assertTrue(clientSvc instanceof ClientSvcImpl);
			System.out.println("testServiceFactoryValidate PASSED");
		} catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("Service load exception");
		}
		
	}
	
}
