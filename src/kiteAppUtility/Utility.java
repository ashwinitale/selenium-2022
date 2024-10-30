package kiteAppUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility
{
	
	public static String readDataFormExcel(int row,int cell) throws EncryptedDocumentException, IOException
	
	{
		 File myfile=new File ("D:\\Ashwini\\5thmarchExcel\\kite.xlsx");
		  Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		  
		 String myvalue = mysheet.getRow(row).getCell(cell).getStringCellValue();
		 return myvalue;
		 
	}
	public static void TakeScreenShot(WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File Dest=new File("D:\\Ashwini\\Screenshot\\TestSreenshot"+random+".png");
		FileHandler.copy(src, Dest);
		
		
	}

}
