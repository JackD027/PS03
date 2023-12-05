package stepDefinition;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
    SharedSteps.class,
    TestLoginPage.class,
    TestSearchPage.class
})
public class TestSuite {
}
