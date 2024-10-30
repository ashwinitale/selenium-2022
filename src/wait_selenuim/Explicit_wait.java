package wait_selenuim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
         WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(5000));
        WebElement singleButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
         
		//w.until(ExpectedConditions.visibilityOf(singleButton));
		singleButton.click();
		
	}

}
