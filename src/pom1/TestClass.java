package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUsername();
		login.sendpassword();
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		KitePinPage pin=new KitePinPage(driver);
		pin.sendpin();
		pin.clickOnCntinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		KiteHomepage home=new KiteHomepage(driver);
		home.validateUserID();
		home.clickOnLogOutButton();
		driver.close();
		
		

	}

}
