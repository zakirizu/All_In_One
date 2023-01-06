package FrameWork_BuildingBlocks;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandleDemo {
	static WebDriver driver;
	static JavascriptExecutor js;
	static String highLightOption = PropertiesFileData.getProperty("highLigthElement");
	static Logger myLogger =LogManager.getLogger(WindowsHandleDemo.class.getName());
	
	
	private static String SwitchToWindow() throws InterruptedException {
		/*
		 * ***************************************************************************************************************
		 * THE WAY IT HAS BEEN WRITTEN IS 
		 * IT WILL LOOK FOR THE WEBELEMT IN ALL THE WINDOWS  
		 * ****************************************************************************************************************
		 */
		String parentWindow = driver.getWindowHandle();
		String childWindowTilte = null;
		System.out.println(parentWindow);
		myLogger.info("Parent Window title: " +driver.getTitle());
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> ite = handles.iterator();
		while(ite.hasNext())
		{
			String childWindow = ite.next();
			if(!parentWindow.equals(childWindow))
			{	
				myLogger.info("Switching to the Child Window");
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				childWindowTilte = driver.getTitle();
				myLogger.info("Switched to the Child Window title: "+childWindowTilte);
			}
		}
		return childWindowTilte;
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.instagram.com/");
		WebElement help = driver.findElement(By.xpath("//div[text()='Help']"));
		help.click();
		String childWindowName = SwitchToWindow();
		System.out.println("Child Window title: "+childWindowName);
		driver.quit();
}



}
