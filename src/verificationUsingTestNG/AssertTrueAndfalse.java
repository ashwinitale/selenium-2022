package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueAndfalse {
  @Test
  public void myMethod() 
  {
	  boolean a=true;
	  boolean b=false;
	  
//	  Assert.assertTrue(a, "value is false TC is failed");
//	  Reporter.log("value is true TC is passed",true);
 
  Assert.assertFalse(b, "value is true Tc is passed");
  Reporter.log("value is false TC is failed",true);
  }
}
