package xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest3 {
  @Test(groups="sanity")
  public void myMethod6() 
  {
	  Reporter.log("mymethod1 is running", true);
  }
  
  @Test(groups="regression")
  public void myMethod7() 
  {
	  Reporter.log("mymethod2 is running", true);
  }
  
  @Test
  public void myMethod8() 
  {
	  Reporter.log("mymethod3 is running", true);
  }
  
  @Test
  public void myMethod9() 
  {
	  Reporter.log("mymethod4 is running", true);
  }
  
  @Test
  public void myMethod10() 
  {
	  Reporter.log("mymethod5 is running", true);
  }
}