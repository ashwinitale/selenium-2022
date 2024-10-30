package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_method {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(10000);
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[@type='submit']"));
        boolean result = OTPButton.isEnabled();
		System.out.println("status of otp button is "+result);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543201");
		Thread.sleep(4000);
		
		boolean result1 = OTPButton.isEnabled();
		System.out.println("status of otp button is "+result1);
	}

}
