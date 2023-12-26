package FrameWork_BuildingBlocks;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SendKeysDemo {
	static String highLigtElement = PropertiesFileData.getProperty("highLightElement");
	public static Logger myLogger =LogManager.getLogger(ActionsClassDemo.class.getName());
	static JavascriptExecutor js;
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		js = (JavascriptExecutor) driver;	
		//ReadDataFromExcel data = new ReadDataFromExcel();		
		
		HashMap<String,String> testData =ReadDataFromExcel.readDatafromExcelSheet("realTime","HighLightElement");
		String userID = testData.get("userName");
		String pwd = testData.get("passWord");
		
		
		sendKeys(userName,userID);
		sendKeys(password, pwd);
		Thread.sleep(3000);
		driver.close();
		

	}

	private static void sendKeys(WebElement ele, String value) {

		String title=null;
		try 
		{
		 title = driver.getTitle();	
		if(!ele.isDisplayed())
		{
			myLogger.info("Not able to find Element :"+ele +". Refreshing the page");
			driver.navigate().refresh();
			Thread.sleep(5000);
		}
		if(highLigtElement.equalsIgnoreCase("yes"))
		{
			myLogger.info("Entering text:"+value+". In textbox WebElement: "+ele +" On Page: "+title);				
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			ele.clear();
			ele.sendKeys(value);
			myLogger.info("Entered text:"+value+". In textbox WebElement: "+ele +" On Page: "+title);	
		}
		else
		{
			myLogger.info("Entering text:"+value+". In textbox WebElement: "+ele +" On Page: "+title);	
			ele.clear();
			ele.sendKeys(value);
			myLogger.info("Entered text:"+value+". In textbox WebElement: "+ele +" On Page: "+title);	
		}
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Entered text: "+value+" in textbox WebElement: "+ele +" On Page: "+title);	
			e.printStackTrace();
			
		}
	}

}
