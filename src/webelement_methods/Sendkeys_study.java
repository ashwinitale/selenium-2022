package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_study {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("Velocity Carporates");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("12345");
	
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	

	}

}
