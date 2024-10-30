package kiteWithExcel1_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage {
	
	
	
	@FindBy(xpath= "//span[@class='user-id']") private WebElement userID;
	
	@FindBy(xpath="//a[@target='_self']") private WebElement logOutButton;
	
	
	//2.constructor
	public Kite_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.method
	
	public String getActualUserID()
	{
		String ActualUserID=userID.getText();
		return ActualUserID;
	}
	
	public void validateUserID(String exceptedUsername)
	{
		String ActualUserID=userID.getText();
		
		String exceptedUserID=exceptedUsername;
		if(ActualUserID.equals(exceptedUserID))
		{
			System.out.println("UserID is matching TC is passed");
		}
		else 
		{
			System.out.println("UserID is not matching TC is failed");
		}
	}
	
	
	public void clickOnLogOutButton() throws InterruptedException
	{
		userID.click();
		Thread.sleep(1000);
		logOutButton.click();
	}

		
}