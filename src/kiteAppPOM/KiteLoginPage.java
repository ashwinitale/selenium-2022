package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	
	//1.data members/variables
		@FindBy(id= "userid") private WebElement UN;
		@FindBy(id="password") private WebElement PWD;
	
		@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
		
	//constructor
    public KiteLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
    //3.Method
    public void sendUserName(String username)
    {
    	UN.sendKeys(username);
    }
    
    public void sendPassword(String password)
    {
    	PWD.sendKeys(password);
    	
    }

    public void clicjOnLoginButton()
    {
    	loginButton.click();
    }
    
}
