package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading_eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("D:\\Ashwini\\5thmarchExcel\\kite.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		int lastRowNum=mysheet.getLastRowNum();
		int lastCellNum=mysheet.getRow(0).getLastCellNum();
		
		int totalRowCount=lastRowNum;
		int totalCellCount=lastCellNum-1;
		
		System.out.println(totalRowCount);
		System.out.println(totalCellCount);
		
		for(int i=0;i<=totalRowCount;i++)
		{
			for(int j=0;j<=totalCellCount;j++)
			{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+ " ");
			}
			System.out.println();
		}

	}

}
