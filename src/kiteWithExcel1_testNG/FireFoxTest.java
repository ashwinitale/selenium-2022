package kiteWithExcel1_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();

	}

}
