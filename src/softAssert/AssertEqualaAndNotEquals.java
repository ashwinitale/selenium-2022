package softAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualaAndNotEquals
{
	
	SoftAssert soft=new SoftAssert();	

  @Test
  public void myMethod() 
  {
	  String a="Pune";
	  String b="Pune";
	  String c="mumabai";
	 
	  soft.assertNotEquals(a, c, "TC is failed both are not eqiual");
	  Reporter.log("TC is passed both are eqiual", true);
	  soft.assertEquals(a, b,"TC is failed both are not eqiual");
	  Reporter.log("TC is passed both are eqiual", true);
	  soft.assertAll();
	   
  }
  
  @Test
  public void myMethod1() 
  {
	  boolean a=false;
	  soft.assertTrue(a, "A is not true TC is failed");
	  Reporter.log("value of A is true TC is passed", true);
	  soft.assertAll();  
  }
  
  
  
  
  
}
