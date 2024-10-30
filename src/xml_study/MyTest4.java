package xml_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest4 {
	
	//i want 1,2,3.
  @Test
  public void myMethod1() 
  {
	  Assert.fail();
	  Reporter.log("mymethod1 is running", true);
  }
  
  @Test
  public void myMethod2() 
  {
	  Reporter.log("mymethod2 is running", true);
  }
  
  @Test
  public void myMethod3() 
  {
	 // Assert.fail();
	  Reporter.log("mymethod3 is running", true);
  }
  
  @Test
  public void myMethod4() 
  {
	  Reporter.log("mymethod4 is running", true);
  }
  
  @Test
  public void myMethod5() 
  {
	  Reporter.log("mymethod5 is running", true);
  }
}