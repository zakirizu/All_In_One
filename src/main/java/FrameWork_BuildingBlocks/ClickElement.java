package FrameWork_BuildingBlocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickElement {
	static WebDriver driver;
	static String path = System.getProperty("user.dir")+"\\Resources\\ScreenShots\\test.png";	
	public static Logger myLogger =LogManager.getLogger();
	static String highLigtElement = PropertiesFileData.getProperty("highLightElement");
	static JavascriptExecutor js;
	

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		WebElement sscBoardType = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
	
		
		clickElement(sscBoardType);
		Thread.sleep(5000);
		driver.quit();

	}


	private static void clickElement(WebElement ele) {
		String title=driver.getTitle();
		try 
		{
		
		if(!ele.isDisplayed())
		{
			myLogger.info("Not able to find Element :"+ele +". Refreshing the page");
			driver.navigate().refresh();
			Thread.sleep(5000);
		}
		if(highLigtElement.equalsIgnoreCase("yes"))
		{
			myLogger.info("Clicking on Element :"+ele +" On Page: "+title);				
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			ele.click();
			myLogger.info("Clicked on Element :"+ele +" On Page: "+title);	
		}
		else
		{
			//Comment Zakriya
			myLogger.info("Clicking on Element :"+ele +" On Page: "+title);			
			ele.click();
			myLogger.info("Clicked on Element :"+ele +" On Page: "+title);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Clicking on Element :"+ele +" On Page: "+title);	
			e.printStackTrace();
			
		}
		
		
	}

}
