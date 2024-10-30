package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com");
		driver.manage().window().getSize();
		
		//to set size-->>use dimension class and create objecvt of the dimension class
		Dimension d=new Dimension(1000,10);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());


	}

}
