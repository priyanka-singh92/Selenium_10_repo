package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1: Create FileInputStream object
		FileInputStream fis= new FileInputStream("./TestData/TestScriptData.xlsx");
		
		//Step 2: Create respective file type object
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3: Call read methods
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
	}

}
