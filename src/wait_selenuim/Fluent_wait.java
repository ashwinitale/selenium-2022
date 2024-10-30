package wait_selenuim;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
      ///Declare and initialize fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(6000));
		
	}

}
