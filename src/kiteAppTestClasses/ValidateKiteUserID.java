package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClasses;
import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteAppUtility.Utility;

public class ValidateKiteUserID extends BaseClasses
{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
  @BeforeClass
  public void LaunchBrowser()
  {
	 openBrowser();
	 login =new KiteLoginPage(driver);
	 pin=new KitePinPage(driver);
	 home=new KiteHomePage (driver);
	  
  }
  
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.sendUserName(Utility.readDataFormExcel(0, 0));
	  login.sendPassword(Utility.readDataFormExcel(0, 1));
	  login.clicjOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendPin(Utility.readDataFormExcel(0, 2));
	  pin.clickONContinueButton();
  }
  
  @Test
  public void ValidateUsername() throws EncryptedDocumentException, IOException
  {
	  String actualUserName=home.getActualUserID();
	  String exceptedUserName=Utility.readDataFormExcel(0, 0);
	  
	  
	  Assert.assertEquals(actualUserName, exceptedUserName,"TC is failed actual and excepted username is naot matching");
	  Reporter.log("UserNames are matching TC is passed", true);
	  Utility.TakeScreenShot(driver);
	  
  }
  
  @AfterMethod
  public void LogOutfromKiteApp() throws InterruptedException
  {
	  home.clickOnLogOutButton();
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
