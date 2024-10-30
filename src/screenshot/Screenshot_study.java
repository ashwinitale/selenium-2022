package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_study {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		 //System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);

      File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File dest=new File("D:\\screenshot folder\\emage.png");
      FileHandler.copy(src, dest);
      
			
			
	}

}
