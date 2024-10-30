package wait_selenuim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.discoveryplus.in/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
			driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
			//Thread.sleep(100);
			


	}

}
