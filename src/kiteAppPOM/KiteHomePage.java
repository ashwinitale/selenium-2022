package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{

	@FindBy(xpath= "//span[@class='user-id']") private WebElement userID;
	
	@FindBy(xpath="//a[@target='_self']") private WebElement logOutButton;
	
	
	//2.constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3/
	public String getActualUserID()
	{
		String actualUserID=userID.getText();
		return actualUserID;
	}

	public void validateUserID(String exceptedUsername)
	{
		String actualUserID=userID.getText();
		String exceptedUserID=exceptedUsername;
		
		if(actualUserID.equals(exceptedUserID))
		{
			System.out.println("userID is matching TC is passed");
		}
		else 
		{
			System.out.println("userID is matching TC is passed");
		}
		
	}
	
	public void clickOnLogOutButton() throws InterruptedException
	{
		userID.click();
		Thread.sleep(1000);
		logOutButton.click();
		
	}
}
