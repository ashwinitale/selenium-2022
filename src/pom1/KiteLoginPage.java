package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//1.
public class KiteLoginPage
{
	@FindBy (id="userid") private WebElement UN;
	@FindBy(id="password") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']") private WebElement LogIn;


//2.
	
     public KiteLoginPage(WebDriver driver)
    {
       PageFactory.initElements(driver, this);	
    }

  //3.

     public void sendUsername()
      {
	     UN.sendKeys("ELR321");
      }

      public void sendpassword()
      {
	     PWD.sendKeys("Dhana1111");
      }

     public void clickOnLoginButton()
      {
	     LogIn.click();
      }
    }
