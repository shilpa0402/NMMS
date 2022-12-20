package NMMS2023._2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	public static String nmmsschLg(String key) throws IOException 
	{
		FileInputStream file =new FileInputStream("D:\\Automation\\NMMS2022-2023\\LoginDetails\\schoolLogin.properties");
		Properties p= new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
	public static String  getexceldata(int row, int col) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file =new FileInputStream("D:\\Automation\\NMMS2022-2023\\TestData\\SchoolData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("School1");
		String value = sh.getRow(row).getCell(col).getStringCellValue();
		return value;

	}
}
