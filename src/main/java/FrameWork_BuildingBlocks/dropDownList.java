package FrameWork_BuildingBlocks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.apache.logging.log4j.*;

public class dropDownList {
	static WebDriver driver;
	static String path = System.getProperty("user.dir")+"\\Resources\\ScreenShots\\test.png";	
	public static Logger myLogger =LogManager.getLogger(dropDownList.class.getName());
	static String highLigtElement = propertiesFileData.getProperty("highLigthElement");
	static JavascriptExecutor js;
	
	
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		WebElement sscBoardType = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
		int index = 2;
		String value = "R";
		String visibleText = "Other Board";
		driver.get("https://online.apsrtcpass.in/counterstupass.do");		
		selectByValue(sscBoardType,index);
		selectByIndex(sscBoardType, value);
		SelectByVisibleText(sscBoardType, visibleText);
	}

	private static void SelectByVisibleText(WebElement ele, String visibleText) {
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
			myLogger.info("Element is Visible :"+ele);	
			myLogger.info("Selecting VisbleText : "+visibleText +" in DropDownListl :"+ele);	
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			Select sc = new Select(ele);
			sc.selectByVisibleText(visibleText);
			myLogger.info("Drop down list selected with Visible Text of :"+visibleText);	
		}
		else
		{
			myLogger.info("Element is Visible :"+ele);	
			myLogger.info("Selecting VisbleText : "+visibleText +" in DropDownListl :"+ele);	
			Select sc = new Select(ele);
			sc.selectByVisibleText(visibleText);
			myLogger.info("Drop down list selected with Visible Text of :"+visibleText);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception Occured while selecting VisibleText : "+visibleText +" in DropDownList :"+ele);	
		}
		

		
	}

	private static void selectByIndex(WebElement ele, String value) {
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
			myLogger.info("Element is Visible :"+ele);	
			myLogger.info("Selecting VisbleText : "+value +" in DropDownListl :"+ele);	
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			Select sc = new Select(ele);
			sc.selectByVisibleText(value);
			myLogger.info("Drop down list selected with Visible Text of :"+value);	
		}
		else
		{
			myLogger.info("Element is Visible :"+ele);	
			myLogger.info("Selecting VisbleText : "+value +" in DropDownListl :"+ele);	
			Select sc = new Select(ele);
			sc.selectByValue(value);
			myLogger.info("Drop down list selected with Visible Text of :"+value);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception Occured while selecting VisibleText : "+value +" in DropDownList :"+ele);	
		}
		
		
	}

	private static void selectByValue(WebElement ele, int index) {
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
			myLogger.info("Element is Visible :"+ele);	
			myLogger.info("Selecting VisbleText : "+index +" in DropDownListl :"+ele);	
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			Select sc = new Select(ele);
			sc.selectByIndex(index);
			myLogger.info("Drop down list selected with Visible Text of :"+index);	
		}
		else
		{
			myLogger.info("Element is Visible :"+ele);	
			myLogger.info("Selecting VisbleText : "+index +" in DropDownListl :"+ele);	
			Select sc = new Select(ele);
			sc.selectByIndex(index);
			myLogger.info("Drop down list selected with Visible Text of :"+index);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception Occured while selecting VisibleText : "+index +" in DropDownList :"+ele);	
		}
		
	}
	
	
	
	
	
	

}
