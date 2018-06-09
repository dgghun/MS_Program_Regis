package com.sessionnotes.model.business;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sessionnotes.model.business.manager.SessionNotesManagerTest;

/**
 * @author David Garcia
 */
@RunWith(Suite.class)
@SuiteClasses({ SessionNotesManagerTest.class})
public class AllBusinessTests {

}
