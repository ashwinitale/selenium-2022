package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anatation_study {
  @Test
  public void mytest3() 
  {
	  Reporter.log("test method is running", true);
  }
 
  @Test
  public void mytest4() 
  {
	  Reporter.log("test method1 is running", true);
  }

  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("test method1 is running", true);
  }
  
  @AfterMethod
  public void logout()
  {
	Reporter.log("After method is running", true);  
  }
  
  @BeforeClass
  public void LaunchBrowser()
  {
	Reporter.log("before class is running",true);  
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("after class is running", true);
  }
  
  
}