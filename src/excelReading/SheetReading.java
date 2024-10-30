package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SheetReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("D:\\Ashwini\\5thmarchExcel\\kite.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		int TotalRowNum=mysheet.getLastRowNum();
		int TotalRowCount=TotalRowNum;
		
		int TotalCellNum=mysheet.getRow(0).getLastCellNum();
		int TotalCellCount=TotalCellNum-1;
	System.out.println(TotalRowCount);
	System.out.println(TotalCellCount);
	
	for(int i=0;i<=TotalRowCount;i++)
	{
		for(int j=0;j<=TotalCellCount;j++)
		{
			String value = mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value +" ");
		}
		
		System.out.println();
	}

	}

}
