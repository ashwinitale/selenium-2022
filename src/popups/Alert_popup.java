package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		//we need switch selenium focus from main page to popup by using 
		
		Alert alt=driver.switchTo().alert();
		
		
		System.out.println(alt.getText());//use to get text present in popup
		alt.accept();//to use click on ok button
		//alt.dismiss();///use click on cancel button
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Alert alt1=driver.switchTo().alert();
		System.out.println(alt1.getText());

		alt1.dismiss();
		Thread.sleep(1000);
		
	}

}
