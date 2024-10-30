package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void myMethod() 
  {
	  
	  
	  String a="Ashwini";
	  String b="Shingade";
	  String c="Ashwini";
	  
	  //if a and b are same then TC should be passed else failed
	  Assert.assertEquals(a,c,"Strings are not matching Tc is failed");
	  Reporter.log("Strings are matching Tc is passed", true);
	  
	  Assert.assertNotEquals(a,b,"Strings are matching Tc is failed");
	  Reporter.log("Strings are not matching TC is passed",true);
  }
}
