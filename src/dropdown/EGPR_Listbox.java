package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EGPR_Listbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        // driver.findElement(By.id("u_0_0_Lf")).click();
         Thread.sleep(1000);
		
         WebElement day = driver.findElement(By.name("birthday_day"));
         
         Select s= new Select(day);
         s.selectByIndex(1);
         Thread.sleep(1000);
         s.selectByValue("9");
		
         WebElement month = driver.findElement(By.id("month"));
         
         Select s1=new Select(month);
         s1.selectByIndex(0);
         Thread.sleep(1000);
         
         
	}

}
