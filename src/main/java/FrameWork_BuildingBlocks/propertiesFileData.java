package FrameWork_BuildingBlocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Properties;

public class propertiesFileData {
	static FileInputStream fis;
	static String locationPath;
	public static void main(String[] args) throws IOException {
		
		try {
		
		locationPath = System.getProperty("user.dir")+"\\Resources\\propertyFile.properties";
		FileInputStream fis = new FileInputStream(locationPath);
		Properties prop = new Properties();
		prop.load(fis);		
		String emailfromProperFile = prop.getProperty("email");
		String timefromPropFile =  prop.getProperty("timeSet");
		System.out.println(" EMail From the Property File: "+emailfromProperFile);
		System.out.println(" Time  From the Property File: "+timefromPropFile);
		
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
			System.out.println("user is not able to find the file at location: "+locationPath);
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally {
			// fis.close();
			
		}
		

	}

}
