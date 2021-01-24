package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestStringAdvanceMethod.class, TestStringBoolean.class, TestStringMethod.class })
public class TestSuite {

}

