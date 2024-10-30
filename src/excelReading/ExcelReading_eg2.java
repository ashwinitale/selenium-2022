package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading_eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("D:\\Ashwini\\5thmarchExcel\\kite.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		int lastRowNum=mysheet.getLastRowNum();
		int lastCellNum=mysheet.getRow(0).getLastCellNum();
		
		int totalRowCount=lastRowNum;
		int totalCellCount=lastCellNum-1;
		System.out.println(totalRowCount);
		
		for(int i=0;i<=totalCellCount;i++)
		{
			String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}

	}

}
