package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		String idOfMainPage=driver.getWindowHandle();
		System.out.println("main pagr ID is "+idOfMainPage);
		
		//all ids are received in set
		Set<String> allIds = driver.getWindowHandles();
		//set need convert into arraylist
		ArrayList<String> ar=new ArrayList<>(allIds);
		
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(i);
		}
		
         String MianPageId=ar.get(0);
         String childPageId=ar.get(1);
         System.out.println(MianPageId);
         
         //to switch to child page
         driver.switchTo().window(childPageId);//here selenium focus switched to child page
         Thread.sleep(1000);
         driver.manage().window().maximize();
         Thread.sleep(1000);
         driver.findElement(By.id("the7-search")).sendKeys("selenuim");
         driver.close();
         //driver.quite();
         Thread.sleep(1000);
         driver.switchTo().window(ar.get(0));
         driver.findElement(By.name("NewTab")).click();
                 
	}

}