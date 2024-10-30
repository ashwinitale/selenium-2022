package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull_And_AssertNotNull {
  @Test
  public void myMethod() 
  {
	  
	  String s=null;
	  String m="Hii";
	  
	//  Assert.assertNull(s, "value is not null TC is failed");
	 // Reporter.log("value is  null TC is passed", true);
	
	  
	  Assert.assertNotNull(m, "value is  null TC is passed");
	  Reporter.log("value is not null TC is failed",true);
  }
}
