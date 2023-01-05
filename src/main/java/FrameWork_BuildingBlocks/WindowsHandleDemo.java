package FrameWork_BuildingBlocks;

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
	
	
	private static void SwitchToWindow() throws InterruptedException {
		/*
		 * ***************************************************************************************************************
		 * THE WAY IT HAS BEEN WRITTEN IS 
		 * IT WILL LOOK FOR THE WEBELEMT IN ALL THE WINDOWS
		 *  
		 * ****************************************************************************************************************
		 */
		String parentWindow = driver.getWindowHandle();
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
				Thread.sleep(5000);
				//myLogger.info("Switched to Child Window: "+driver.getTitle());
				System.out.println(childWindow);
				String text  = driver.findElement(By.xpath("//body[contains(text(),'Knowledge')]")).getText();
				System.out.println(text);
				//break;
			}
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));	
		WebElement newWindowMessage = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
		newWindowMessage.click();
				
		SwitchToWindow();
		driver.quit();
	

	}



}
