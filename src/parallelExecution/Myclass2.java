package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass2 {
	
@Test
public void myMethod1() 
    {
	
	//System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Reporter.log("myMethod2 is running", true);
	}

}
