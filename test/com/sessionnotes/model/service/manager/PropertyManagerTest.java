package com.sessionnotes.model.service.manager;

import org.junit.Before;

import com.sessionnotes.model.service.sessionservice.ISessionSvc;

import junit.framework.TestCase;

public class PropertyManagerTest extends TestCase{

	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		String propLocation = System.getProperty("application.properties");
		PropertyManager.loadProperties(propLocation);
		
	}

	
	public final void testPropertyManagerGetPropertyValue() {
		System.out.println("\nStarting testPropertyManagerGetPropertyValue");
		assertNotNull(PropertyManager.getPropertyValue(ISessionSvc.NAME));
		System.out.println("testPropertyManagerGetPropertyValue PASSED.");
	}

}
