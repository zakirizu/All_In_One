package FrameWork_BuildingBlocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Properties;

public class PropertiesFileData {
	static FileInputStream fis;
	static String locationPath;
	 static String value=null;
	public static void main(String[] args) throws IOException {		
		String test = getProperty("highLightElement");
		System.out.println(test);
	}
	public static String getProperty(String key) {
		try {
			
			locationPath = System.getProperty("user.dir")+"\\Resources\\propertyFile.properties";
			FileInputStream fis = new FileInputStream(locationPath);
			Properties prop = new Properties();
			prop.load(fis);
			 value = prop.getProperty(key);
			//String emailfromProperFile = prop.getProperty("email");
			//String timefromPropFile =  prop.getProperty("timeSet");
			//System.out.println(" Email From the Property File: "+emailfromProperFile);
			//System.out.println(" Time  From the Property File: "+timefromPropFile);
			
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
		return value;
		
	}

}
