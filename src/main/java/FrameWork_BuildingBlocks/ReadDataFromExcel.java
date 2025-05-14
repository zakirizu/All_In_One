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
	static  String shtName = "alphaSheet";
	static String tcId = "TestCasesID4";
	

	public static void main(String[] args) throws IOException {
		HashMap<String,String> data =readDatafromExcelSheet(shtName,tcId );				

	}

	public static HashMap<String,String> readDatafromExcelSheet(String sheetName, String tcID) throws IOException {
		
		HashMap<String, String> hmap = null;
		try {
		 hmap = new HashMap<String, String>();
		String path = System.getProperty("user.dir")+"\\Resources\\TestData.xlsx";		
		FileInputStream fis = new FileInputStream(path);		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);		
		XSSFSheet sheet 		= workbook.getSheet(sheetName);			
		int lastRowCount 		= sheet.getLastRowNum();			
		//System.out.println("Last Row Count is: "+lastRowCount);
		
		for(int i=0;i<lastRowCount;i=i+2)
		{
			String temp = sheet.getRow(i).getCell(0).getStringCellValue();
			if(temp.equalsIgnoreCase(tcID))
			{
				XSSFRow targetKeyRow 	= sheet.getRow(i);
				XSSFRow targetValueRow 	= sheet.getRow(i+1);
				int lastColumn 			= targetKeyRow.getLastCellNum();
				
				for(int j=1; j<lastColumn-1; j++)						
				{
					String k = targetKeyRow.getCell(j).getStringCellValue();
					String v = targetValueRow.getCell(j).getStringCellValue();
					hmap.put(k, v);
				}
		
				break;}
		}
	}
	
	catch(Exception e)
	{

		e.printStackTrace();
	}
	System.out.println(hmap);
return hmap;
	}

		
	}

