package FrameWork_BuildingBlocks;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDataReader_Old {
	
	
	
	
	/**************************************************
	 ***************Read JSon Data********************
	 *************************************************/
	public static List<HashMap<String, String>> getJsonDataReader(String filePath) throws IOException{
	//Read Json String 	
	String jsconContent = FileUtils.readFileToString(new File(filePath));
	//String to HashMap -- can be done by using jackson Databid Dependency
	ObjectMapper mapper 				 = new ObjectMapper();
	List<HashMap<String,String>>	data = mapper.readValue(jsconContent, new TypeReference<List<HashMap<String,String>>>() {});
	return data;
	//now this list has two maps
	}
	

}
