package kiteWithExcel1_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LoginPage {
		
	//1.data members/variables
		@FindBy(id= "userid") private WebElement UN;
		@FindBy(id="password") private WebElement PWD;
	
		@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
		
	//constructor
		public Kite_LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//methods
		public void sendusername(String username)
		{
			UN.sendKeys(username);
		}

	   public void sendpassword(String pwd)
	   {
		   PWD.sendKeys(pwd);
	   }

	   public void clickOnLoginButton()
	   {
		   loginButton.click();
		   
	   }
	   
}
