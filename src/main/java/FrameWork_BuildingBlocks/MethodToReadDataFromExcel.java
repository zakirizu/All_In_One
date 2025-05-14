package FrameWork_BuildingBlocks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MethodToReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		MethodToReadDataFromExcel obj = new MethodToReadDataFromExcel();
		HashMap<String, String> testData = new HashMap<String,String>();
		testData = 	obj.readData("zeta", "tc_09");
		}
	
	
	public  HashMap<String,String> readData(String sheetName, String tcid) throws IOException {
		HashMap<String, String> hmap = new HashMap<String,String>();
				System.out.println("Ready");
		//Access the File
		String path  = System.getProperty("user.dir")+"\\TestData\\InputData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		//Code to Access the Excel Sheet
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		//getting the Exact Row Number
	     int lastRowNum =	sheet.getLastRowNum();
	     for(int i=0;i<lastRowNum ; i=i+2)
	     {
	    	String targetID = sheet.getRow(i).getCell(0).getStringCellValue(); 
	    	
	    	if(targetID.equalsIgnoreCase(tcid))
	    	{
	    		 XSSFRow targetKeyRow = sheet.getRow(i);
	    		 XSSFRow targetValueRow = sheet.getRow(i+1);	    		 
	    		 int lastColumn = targetKeyRow.getLastCellNum();
	    		 
	    		 for(int j=0; i<lastColumn-1;j++)
	    		 {
	    			 String key = targetKeyRow.getCell(j).getStringCellValue();
	    			 String value = targetValueRow.getCell(j).getStringCellValue();	    			 
	    			 hmap.put(key, value);
	    			 System.out.println(key +"->"+value);	    		
	    			 break;
	    			 
	    		 }
	    		
	    		
	    		
	    	}

	     }
		return hmap;
		
		
		
		
		
		
		
		
		
	}

}
