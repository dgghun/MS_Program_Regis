package com.sessionnotes.model.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sessionnotes.model.service.clientservice.ClientSvcImplTest;
import com.sessionnotes.model.service.factory.ServiceFactoryTest;
import com.sessionnotes.model.service.sessionservice.SessionSvcImplTest;

@RunWith(Suite.class)
@SuiteClasses({ ClientSvcImplTest.class, SessionSvcImplTest.class, ServiceFactoryTest.class })
public class AllServiceTests {

}
