package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException 
	{
		 //System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/select-menu");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			WebElement dropDownBox = driver.findElement(By.name("cars"));
			
			Select s=new Select(dropDownBox);
			
			boolean result = s.isMultiple();
			System.out.println("IsMultiple selection is "+result);
			
			s.selectByIndex(0);
			Thread.sleep(1000);
			s.selectByIndex(1);
			Thread.sleep(1000);
			s.selectByIndex(2);
			
//			//how to select deselect
//			s.deselectByVisibleText("Volvo");
//			
//			System.out.println(s.getFirstSelectedOption().getText());
//			
//			WebElement firstWebElement = s.getFirstSelectedOption();
//			String mytext=firstWebElement.getText();
//			System.out.println("1st selected option is "+mytext);
//			System.out.println(s.getAllSelectedOptions().size());
//			
//			for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++)
//			{
//				System.out.println(s.getAllSelectedOptions().get(i).getText());
//			}
			
	}

}