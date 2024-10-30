package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading_eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("D:\\Ashwini\\Excel\\sheet1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	
		//sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		//reading whole row
		int lastRowNum=mysheet.getLastRowNum();
		int lastCellNum=mysheet.getRow(0).getLastCellNum();
		
		int totalRowCount=lastRowNum;
		int totalCellNum=lastCellNum-1;
		
		System.out.println(totalRowCount);
         System.out.println(totalCellNum);
         
         
         for(int i=0;i<=totalCellNum;i++)
         {
        	String value = mysheet.getRow(0).getCell(i).getStringCellValue();
        	 System.out.println(value);
         }
	}

}
