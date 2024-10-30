package kiteWith_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_pinPage {


    //1.data members/variables
		@FindBy(id= "pin") private WebElement PIN;
	
		@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
		
	//constructor
		public Kite_pinPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//methods
		public void sendpin(String pin)
		{
			PIN.sendKeys(pin);
		}


	   public void clickOnContinueButton()
	   {
		   continueButton.click();
		   
	   }
	   
}