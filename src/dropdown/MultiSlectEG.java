package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSlectEG {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement dropDownBox = driver.findElement(By.xpath("//b[text()='Multiselect drop down']"));
		
		Select s=new Select(dropDownBox);
		//s.getAllSelectedOptions();
		s.selectByIndex(0);
		Thread.sleep(1000);

	}

}
