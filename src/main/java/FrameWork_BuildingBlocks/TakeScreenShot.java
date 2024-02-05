package FrameWork_BuildingBlocks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShot {
	static WebDriver driver;
	static String path = System.getProperty("user.dir")+"\\Resources\\ScreenShots\\testScrSht.png";
	
	
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		
		driver = new ChromeDriver();		
		driver.get("https://www.bluestone.com/goldmine.html?gmfidv=GMS25");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	//Convert WebDriver Object to TakeScreenShot
		Thread.sleep(3000);
		TakesScreenshot  scrShot  = ((TakesScreenshot) driver);
	//Call  getScreenshotAs method to create Image file	
		File srFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile =  new File(path);
		FileUtils.copyFile(srFile, destFile);
		driver.quit();


	}

}
