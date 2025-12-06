package FrameWork_BuildingBlocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	static  String shtName = "TIME";
	static String tcId = "Time_TestCase01";
	

	public static void main(String[] args) throws IOException {
		HashMap<String,String> data =readDatafromExcelSheet(shtName,tcId );		
		//Print the HashMap
		for (String key : data.keySet()) {
			System.out.println("Key: " + key + ", Value: " + data.get(key));
		}
}

	public static HashMap<String,String> readDatafromExcelSheet(String sheetName, String tcID) throws IOException {
		HashMap<String, String> hmap = null;
		try {
		hmap = new HashMap<String, String>();
		String path = System.getProperty("user.dir")+"\\Resources\\TestData_Input.xlsx";
		
		FileInputStream fis = new FileInputStream(path);		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);		
		XSSFSheet sheet = workbook.getSheet(sheetName);			
		int lastRowCount = sheet.getLastRowNum();		
		//System.out.println(" Last Row Count is "+lastRowCount);		
		for(int i=0; i<=lastRowCount;i=i+2)
		{
		String temp = sheet.getRow(i).getCell(0).getStringCellValue();
		//System.out.println(" TC ID is "+temp);
		
		if(temp.equalsIgnoreCase(tcID))
		{ 
			int lastCellCount = sheet.getRow(i).getLastCellNum();
			int keyValuePairCount = lastCellCount-2;
			System.out.println("Count of Key-Value Pair Loaded to HashMap "+keyValuePairCount);
			for(int j=1;j<lastCellCount-1;j++)
			{
				String key 		= sheet.getRow(i).getCell(j).getStringCellValue();
				String value 	= sheet.getRow(i+1).getCell(j).getStringCellValue();
				hmap.put(key, value);
			}
			break;
		}
	
		}
		
	
		workbook.close();
		}
		catch(Exception e)
		{
			System.out.print("Exception while reading the data from Excel Sheet "+e);
		}
		return hmap;
		
	
		
	}

}
