package FrameWork_BuildingBlocks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	static WebDriver driver;
	static String path = System.getProperty("user.dir")+"\\Resources\\ScreenShots\\test.png";
	
	
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Convert WebDriver Object to TakeScreenShot
		Thread.sleep(5000);
		TakesScreenshot  scrShot  = ((TakesScreenshot) driver);
	//Call  getScreenshotAs method to create Image file	
		File srFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile =  new File(path);
		FileUtils.copyFile(srFile, destFile);
		driver.quit();


	}

}
