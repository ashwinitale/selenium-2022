package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage 
{
	
	//1.data memebers
	@FindBy(xpath="//span[@class='user-id']")private WebElement UserID;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogOut;
	
	//2.constructor
      public KiteHomepage (WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
	
      
      //3.methods
      public void validateUserID()
      {
    	  UserID.click();
      }
	
	public void clickOnLogOutButton()
	{
		LogOut.click();
	}

	
	
}
