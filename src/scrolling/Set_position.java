package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com");
		driver.manage().window().getPosition();
		Thread.sleep(1000);
      
		//to use point class and create object of point class
		
		Point p=new Point(800,500);
		driver.manage().window().setPosition(p);

	}

}
