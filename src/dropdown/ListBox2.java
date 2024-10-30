package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
			Thread.sleep(2000);
			//1.
			WebElement day = driver.findElement(By.name("birthday_day"));
			//2.
			Select s=new Select(day);
			//3.
			for(int i=0;i<=9;i++)
			{
				Thread.sleep(5000);
				s.selectByIndex(i);
			}
			for(int i=9;i>=0;i--)
			{
				Thread.sleep(5000);
				s.selectByIndex(i);
				
			}
			boolean result = s.isMultiple();
			System.out.println("multiple selection available result is "+result);
	}
	}