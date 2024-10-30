package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test(invocationCount = 3)
  public void myMethod() 
  {
	  Reporter.log("my method is Running", true);
  }
  
  @AfterMethod
  public void close()
  
  {
	  Reporter.log("closing browser",true); 
  }
  
  
  
  
}
