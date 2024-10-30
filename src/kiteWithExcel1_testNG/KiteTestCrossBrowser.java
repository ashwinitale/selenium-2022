package kiteWithExcel1_testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KiteTestCrossBrowser 
{
	Kite_LoginPage Login;
	Kite_pinPage pin;
	Kite_HomePage home;
	WebDriver driver;
	Sheet mysheet;
	
	
  @Parameters("browser")
  @BeforeClass
  public void launchBrowser(String browser) throws EncryptedDocumentException, IOException
  {
	  if(browser.equals("chrome"))
			  {
		           System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		           driver=new ChromeDriver();
		           
			  }
	  
	  else if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
			 driver=new FirefoxDriver();
	  }
	  
	  
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  Reporter.log("launching URL", true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	  Login=new Kite_LoginPage(driver);
	  pin=new Kite_pinPage(driver);
	  home =new Kite_HomePage(driver);
	 File myfile=new File ("D:\\Ashwini\\5thmarchExcel\\kite.xlsx");
	  mysheet=WorkbookFactory.create(myfile).getSheet("sheet2");
	    
  }
  
  @BeforeMethod
  public void loginToKite()
  {
	 Login.sendusername(mysheet.getRow(0).getCell(0).getStringCellValue());
	 Reporter.log("sending username",true);
	 Login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
	 Reporter.log("sending password",true);
	 Login.clickOnLoginButton();
	 Reporter.log("clicking On Login Button",true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	 pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
	 Reporter.log("sending pin",true);
	 pin.clickOnContinueButton();
	 Reporter.log("clicking On continue Button",true);
  }
  
  @Test
  public void verifyKiteUserName()
  {
	//excepted username-->excel
	  //actual username-->
	  String ExceptedUserID=mysheet.getRow(0).getCell(0).getStringCellValue();
	  String ActualUserID=home.getActualUserID();
	  Reporter.log("Validating UserID", true);
	  Assert.assertEquals(ExceptedUserID,ActualUserID, "excepted UserID and ActualUserID are not matching TC is failed");
	  Reporter.log("ExceptedUserID and ActualUserID are matching TC is passed", true);
  }
  
  @AfterMethod
  public void LogOutFrameKiteApp() throws InterruptedException
  {
	  home.clickOnLogOutButton();
	  Reporter.log("Logging Out....",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("closing browser", true);
	  driver.close();
  }
  
}