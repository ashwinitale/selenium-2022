package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement Element1 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		System.out.println(Element1.getText());
		String ActualText=Element1.getText();
		//String actualText="Facebook helps you connect and share with the people in your life";
		String ExceptedText="Facebook helps you connect and share with the people in your life.";

		if(ActualText.equals(ExceptedText))
		{
			System.out.println("Text is matching TC is passed");
		}
		else
		{
			System.out.println("Text is not matching TC is failed");
		}
		
	}

}
