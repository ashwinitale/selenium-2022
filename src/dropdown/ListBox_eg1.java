package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ListBox_eg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 
		 
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);

			
			WebElement ToCreateNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			ToCreateNewAccount.click();
			Thread.sleep(3000);
			
			//1.to identify list and stored in referance variable
			WebElement day = driver.findElement(By.name("birthday_day"));
			
			//2.create object of select class
			Select s=new Select(day);
			//Byusing one of the select class method which will acept webelement as argumment
			s.selectByVisibleText("8");
			Thread.sleep(4000);
			s.selectByIndex(9);
			Thread.sleep(4000);
			s.selectByValue("15");
			Thread.sleep(4000);

			WebElement month = driver.findElement(By.id("month"));
			Select s1=new Select(month);
			s1.selectByValue("10");
			s1.selectByIndex(4);
			s1.selectByVisibleText("Dec");
			
	}

}
