package kiteWithExcel1_testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

		File myfile=new File("D:\\Ashwini\\5thmarchExcel\\kite.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		String username = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String Kitepin = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		Kite_LoginPage login=new Kite_LoginPage(driver);
		//login.sendusername(username);
		login.sendusername(mysheet.getRow(0).getCell(0).getStringCellValue());
		//login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue();
		login.sendpassword(password);
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		Kite_pinPage pin=new Kite_pinPage(driver);
		pin.sendpin(Kitepin);
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		Kite_HomePage home=new Kite_HomePage(driver);
		home.validateUserID(username);
        home.clickOnLogOutButton();
        Thread.sleep(1000);
        driver.close();
		
		
		}

}
