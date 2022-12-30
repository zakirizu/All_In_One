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
	static Logger myLogger =LogManager.getLogger(dropDownList.class.getName());
	static String highLigtElement = propertiesFileData.getProperty("highLigthElement");
	static JavascriptExecutor js;
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		WebElement sscBoardType = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
		//int index = 2;
		//String value = "others";
		//String visibleText = "Other Board";
		//selectByValue(sscBoardType,"others");
		//selectByIndex(sscBoardType, 2);
		SelectByVisibleText(sscBoardType, "Other Board");
		Thread.sleep(5000);
		driver.quit();
	}

	private static void SelectByVisibleText(WebElement ele, String visibleText) {
		String title = driver.getTitle();
		
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
			myLogger.info("Drop Down List Element is Visible :"+ele +" On Page: "+title);	
			myLogger.info("Selecting Drop down list with VisbleText : "+visibleText +" in DropDownList :"+ele +" On Page: "+title);	
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			Select sc = new Select(ele);
			sc.selectByVisibleText(visibleText);
			myLogger.info("Selected Drop down list selected with Visible Text of :"+visibleText+" On Page: "+title);	
		}
		else
		{
			myLogger.info("Drop Down List Element is Visible :"+ele+" On Page: "+title);	
			myLogger.info("Selecting drop down list VisbleText : "+visibleText +" in DropDownList :"+ele+" On Page: "+title);	
			Select sc = new Select(ele);
			sc.selectByVisibleText(visibleText);
			myLogger.info("Drop down list selected with Visible Text of :"+visibleText+" On Page: "+title);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception Occured while selecting VisibleText : "+visibleText +" in DropDownList :"+ele+" On Page: "+title);	
			e.printStackTrace();
			
		}
		

		
	}

	private static void selectByValue(WebElement ele, String value) {
		String title = driver.getTitle();
		try 
		{
		if(!ele.isDisplayed())
		{
			myLogger.info("Not able to find Element :"+ele +". Refreshing the page"+" On Page: "+title);
			driver.navigate().refresh();
			Thread.sleep(5000);
		}
		if(highLigtElement.equalsIgnoreCase("yes"))
		{
			myLogger.info("Drop Down List Element is Visible :"+ele+" On Page: "+title);	
			myLogger.info("Selecting drop down list value : "+value +" in DropDownList :"+ele+" On Page: "+title);	
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			Select sc = new Select(ele);
			sc.selectByValue(value);
			myLogger.info("Drop down list selected with Value of :"+value+" On Page: "+title);	
		}
		else
		{
			myLogger.info("Drop Down List Element is Visible :"+ele+" On Page: "+title);	
			myLogger.info("Selecting drop down list value  : "+value +" in DropDownList :"+ele+" On Page: "+title);	
			Select sc = new Select(ele);
			sc.selectByValue(value);
			myLogger.info("Drop down list selected with Value of :"+value+" On Page: "+title);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception Occured while selecting value : "+value +" in DropDownList :"+ele+" On Page: "+title);	
			e.printStackTrace();
		}
		
		
	}

	private static void selectByIndex(WebElement ele, int index) {
		String title = driver.getTitle();
		try 
		{
		if(!ele.isDisplayed())
		{
			myLogger.info("Not able to find Element :"+ele +". Refreshing the page"+" On Page: "+title);
			driver.navigate().refresh();
			Thread.sleep(5000);
		}
		if(highLigtElement.equalsIgnoreCase("yes"))
		{
			myLogger.info("Drop Down List Element is Visible :"+ele);	
			myLogger.info("Selecting Drop Down List with Index of : "+index +" in DropDownList :"+ele+" On Page: "+title);	
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);		
			Select sc = new Select(ele);
			sc.selectByIndex(index);
			myLogger.info("Drop down list selected with Index of :"+index+" On Page: "+title);	
		}
		else
		{
			myLogger.info("Drop Down List Element is Visible :"+ele+" On Page: "+title);	
			myLogger.info("Selecting Drop Down List with Index of : "+index +" in DropDownListl :"+ele+" On Page: "+title);	
			Select sc = new Select(ele);
			sc.selectByIndex(index);
			myLogger.info("Drop down list selected with Index of :"+index+" On Page: "+title);	
		}

		}
		catch(Exception e)
		{
			myLogger.info("Exception Occured while selecting Index : "+index +" in DropDownList :"+ele+" On Page: "+title);	
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	

}
