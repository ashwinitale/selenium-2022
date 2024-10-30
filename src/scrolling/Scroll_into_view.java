package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_into_view {

	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']")).click();
		Thread.sleep(1000);
		
		WebElement SoftwareTesting = driver.findElement(By.xpath("//h2[text()='We offer following courses']"));
		
		//WebElement ref = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
//       JavascriptExecutor j=((JavascriptExecutor)driver);
//       Thread.sleep(100);
//       j.executeScript("arguments[0].scrollIntoView(true);",ref);
       
      // j.executeScript("arguments[0].scrollIntoView(true);",referanceElement);
		Actions act=new Actions(driver);
		act.scrollToElement(SoftwareTesting).perform();
		
		
	}

}
