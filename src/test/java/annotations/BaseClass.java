package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
  @BeforeSuite
  public void suiteConfig()
  {
	  System.out.println("before suite");
  }
  @BeforeTest
  public void testConfig()
  {
	  System.out.println("before test");
  }
  @BeforeClass
  public void classConfig()
  {
	  System.out.println("before class");
  }
  @BeforeMethod
  public void methodConfig()
  {
	  System.out.println("before method");
  }
  @AfterMethod
  public void methodConfg()
  {
	  System.out.println("after method");
  }
  @AfterClass
  public void classConfg()
  {
	  System.out.println("after class");
  }
  
  @AfterTest
  public void testConfg()
  {
	  System.out.println("after test");
  }
  @AfterSuite
  public void suiteConfg()
  {
	  System.out.println("after suite");
  }
}
