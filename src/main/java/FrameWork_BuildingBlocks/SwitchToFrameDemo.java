package FrameWork_BuildingBlocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class SwitchToFrameDemo {
	static String highLigtElement = PropertiesFileData.getProperty("highLightElement");
	public static Logger myLogger =LogManager.getLogger(ActionsClassDemo.class.getName());
	static JavascriptExecutor js;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		double startTime	= System.currentTimeMillis();
		
			driver = WebDriverManagerDemo.chromeDriverSetUp();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			WebElement eleRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
			WebElement eleDoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			js = (JavascriptExecutor) driver;	
			Thread.sleep(5000);
			driver.close();	
			double endTime = System.currentTimeMillis();
			System.out.println("Total Execution Time:" + String.format("%.3f", ( endTime- startTime)/1000/60F )+" Minutes");
			

		}
		private static void switchFrameById(int id) {			
			
			String title=null;
			String frameTitle = null;
			title = driver.getTitle();
			try 
			{	myLogger.info("Switching to Frame By Index:"+id +" On Page: "+title);				
				driver.switchTo().frame(id);
				frameTitle = driver.getTitle();
				myLogger.info("Switched to Frame By Index:"+id +" Frame title: "+frameTitle);	
			}

			catch(Exception e)
			{
				myLogger.info("Exception occured Switching to Frame By Index:"+id);	
				e.printStackTrace();
			}
			
			
		}
			
				
		private static void switchFrameByWebElement(WebElement ele) {
			String title=null;
			String frameTitle = null;
			title = driver.getTitle();
			try 
			{	myLogger.info("Switching to Frame By WebElement:"+ele +" On Page: "+title);				
				driver.switchTo().frame(ele);
				frameTitle = driver.getTitle();
				myLogger.info("Switched to Frame By WebElement:"+ele +" Frame title: "+frameTitle);	
			}

			catch(Exception e)
			{
				myLogger.info("Exception occured Switching to Frame By WebElement:"+ele);	
				e.printStackTrace();
			}
			
			
		}
		
		private static void switchFrameByNameorID(String nameORid) {

			String title=null;
			String frameTitle = null;
			title = driver.getTitle();
			try 
			{	myLogger.info("Switching to Frame By nameORid:"+nameORid +" On Page: "+title);				
				driver.switchTo().frame(nameORid);
				frameTitle = driver.getTitle();
				myLogger.info("Switched to Frame By nameORid:"+nameORid +" Frame title: "+frameTitle);	
			}

			catch(Exception e)
			{
				myLogger.info("Exception occured Switching to Frame By name   ORid:"+nameORid);	
				e.printStackTrace();
			}
			
			
		
			
		}
		
		
	

	

}
