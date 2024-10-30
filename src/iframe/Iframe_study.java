package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_study {

	public static void main(String[] args) throws InterruptedException
	{
		
			WebDriver driver=new ChromeDriver();

			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			Thread.sleep(1000);

		// we need to switch selenuim focus from msin page to frame
			driver.switchTo().frame("iframe-name");
			Thread.sleep(1000);
			
	    //current focus is on frame now
			driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();//this element present on iframe(need to switch selrnuim focus from main page to frame)
		
	     //to take action on main page we needswitch selenium  focus from main page frame
	     //parentframe();;default content();
			
		driver.switchTo().defaultContent();	
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();			
			
	}

}
