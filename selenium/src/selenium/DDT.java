package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT 
{
	public static String ddt(String sheet, int row, int cell ) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream("./book1/selen.xlsx");
     Workbook book = WorkbookFactory.create(fis);
	  Sheet sheet1 = book.getSheet(sheet);
	   Row row1 = sheet1.getRow(row);
	  Cell cell1 = row1.getCell(cell);
	  
	  String value = cell1.toString();
	  return value;
	 
			 
}
}

