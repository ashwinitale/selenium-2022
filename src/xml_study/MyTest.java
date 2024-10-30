package xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void myMethod1() 
  {
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