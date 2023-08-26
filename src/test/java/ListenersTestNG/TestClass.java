package ListenersTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersTestNG.ListnerImplimentation.class)
public class TestClass extends BaseClass
{
  @Test
  public void testMethod1()
  {
	 System.out.println("Test1");
	 Assert.fail();
  }
  @Test(dependsOnMethods="testMethod1")
  public void testMethod2()
  {
	 System.out.println("Test2");
	 
  }
}
