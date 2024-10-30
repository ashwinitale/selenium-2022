package kiteWithExcel1_testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestClassUsingTestNG {
	
	Kite_LoginPage login;
	Kite_pinPage pin;
	Kite_HomePage home;
	WebDriver driver;
	Sheet mysheet;
	
	
  @BeforeClass
  public void LaunchBrowser() throws EncryptedDocumentException, IOException
  {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  
		login=new Kite_LoginPage(driver);
		pin=new Kite_pinPage(driver);
		home=new Kite_HomePage(driver);
		File myfile=new File("D:\\Ashwini\\5thmarchExce\\kite.xlsx");
		mysheet=WorkbookFactory.create(myfile).getSheet("sheet2");
		
  }
  
  @BeforeMethod
  public void LoginToKite()
  {
	 login.sendusername(mysheet.getRow(0).getCell(0).getStringCellValue());
	 Reporter.log("sending username", true);
	 login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
	 Reporter.log("sending password", true);
	 login.clickOnLoginButton();
	 Reporter.log("clicking on login button", true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	 pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
	 Reporter.log("sending pin", true);
	 pin.clickOnContinueButton();
	 Reporter.log("clicking on continue button", true);
	 
  }
  
  @Test
  public void VerifyKiteUsername()
  {
	  //excepted username-->excel
	  //actual username--??
	  String expectedUserID=mysheet.getRow(0).getCell(0).getStringCellValue();
      String actualUserID = home.getActualUserID();
       Reporter.log("validate UserID", true);
       
	Assert.assertEquals(expectedUserID,actualUserID,"excepted userID and Actual UserID are matching TC is passed");
       
	  
  }
  
  @AfterMethod
  public void logOutFromKiteApp() throws InterruptedException
  {
	  home.clickOnLogOutButton();
	  Reporter.log("Logging Out--",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("closing browser", true);
	  driver.close();
  }
}
