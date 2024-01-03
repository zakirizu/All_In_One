package FrameWork_BuildingBlocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionsClassDemo {
	static double startTime	= System.currentTimeMillis();	
	//public static Logger myLogger =LogManager.getLogger();
	static String highLigtElement = PropertiesFileData.getProperty("highLightElement");
	public static Logger myLogger =LogManager.getLogger(ActionsClassDemo.class.getName());
	static JavascriptExecutor js;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement eleRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement eleDoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		js = (JavascriptExecutor) driver;	
		rightClick(eleRightClick);
		doubleClick(eleDoubleClick);
		//dragAndDrop();
		Thread.sleep(5000);
		driver.close();	
		double endTime = System.currentTimeMillis();
		System.out.println("Total Execution Time:" + String.format("%.3f", ( endTime- startTime)/1000/60F )+" Minutes");
		

	}
	private static void rightClick(WebElement ele) {
		
		Actions ac = new Actions(driver);
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
			myLogger.info("Performing RightClick on Element :"+ele +" On Page: "+title);				
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			ac.contextClick(ele).build().perform();
			//Remove the below line it was added just for testing
			ac.click(ele).build().perform();
			myLogger.info("Performed RightClick on Element :"+ele +" On Page: "+title);	
		}
		else
		{
			myLogger.info("Performing RightClick on Element :"+ele +" On Page: "+title);			
			ac.contextClick(ele).build().perform();
			//Remove the below line it was added just for testing
			ac.click(ele).build().perform();
			myLogger.info("Performing RightClick on Element :"+ele +" On Page: "+title);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Performing RightClick on Element :"+ele +" On Page: "+title);	
			e.printStackTrace();
			
		}
		
		
	}
		
		
		
		
		
	
	private static void doubleClick(WebElement ele) {
		Actions ac = new Actions(driver);
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
			myLogger.info("Performing RightClick on Element :"+ele +" On Page: "+title);				
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			ac.doubleClick(ele).build().perform();
			//Remove the below line it was added just for testing
			driver.switchTo().alert().accept();
			myLogger.info("Performed RightClick on Element :"+ele +" On Page: "+title);	
		}
		else
		{
			myLogger.info("Performing RightClick on Element :"+ele +" On Page: "+title);			
			ac.doubleClick(ele).build().perform();
			//Remove the below line it was added just for testing
			driver.switchTo().alert().accept();
			myLogger.info("Performing RightClick on Element :"+ele +" On Page: "+title);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Performing RightClick on Element :"+ele +" On Page: "+title);	
			e.printStackTrace();			
		}
		
		
	}
	private static void dragAndDrop() {
		WebElement From = null;
		WebElement To = null;
		Actions ac = new Actions(driver);	    
		String title=null;
		try 
		{
		 title = driver.getTitle();	
		if(!(From.isDisplayed() && To.isDisplayed()))
		{
			myLogger.info("Not able to find WebElement Refreshing the page");
			driver.navigate().refresh();
			Thread.sleep(5000);
		}
		if(highLigtElement.equalsIgnoreCase("yes"))
		{
			myLogger.info("Moving Element:"+From +" To :"+To +"On Page: "+title);				
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", From);		
			ac.clickAndHold(From).moveToElement(To).release(To).build().perform();
			myLogger.info("Moved Element:"+From +" To :"+To +"On Page: "+title);
		}
		else
		{
			myLogger.info("Moving Element:"+From +" To :"+To +"On Page: "+title);
			ac.clickAndHold(From).moveToElement(To).release(To).build().perform();
			myLogger.info("Movied Element:"+From +" To :"+To +"On Page: "+title);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception While Moving Element:"+From +" To :"+To +"On Page: "+title);	
			e.printStackTrace();			
		}
		
		
	}

}
 