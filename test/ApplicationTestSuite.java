import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sessionnotes.model.business.AllBusinessTests;
import com.sessionnotes.model.domain.AllDomainTests;
import com.sessionnotes.model.service.AllServiceTests;

/**
 * @author David Garcia
 */
@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class, AllDomainTests.class, AllServiceTests.class})
public class ApplicationTestSuite{

}
