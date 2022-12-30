package FrameWork_BuildingBlocks;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightElement {
	static WebDriver driver;
	static JavascriptExecutor js;
	static String highLightOption = PropertiesFileData.getProperty("highLigthElement");
public static void main(String[] args) throws IOException, InterruptedException {
	
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//ReadDataFromExcel data = new ReadDataFromExcel();		
		HashMap<String,String> testData =ReadDataFromExcel.readDatafromExcelSheet("realTime","HighLightElement");
		
		String userID = testData.get("userName");
		String pwd = testData.get("passWord");
				
		highLightSendKeys(userName,userID );
		Thread.sleep(2000);
		highLightSendKeys(password,pwd );
		Thread.sleep(2000);
		highLightClick(submitBtn);
		Thread.sleep(3000);
		
		driver.quit();
		}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Exception occured in Main Block: "+e);
		driver.quit();
	}
	
	}


private static void highLightClick(WebElement ele) {
		if(highLightOption.equalsIgnoreCase("yes")) {
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);
			ele.click();		
			}
		else
		{
			ele.click();	
		}
}


private static void highLightSendKeys(WebElement ele,String text) {
	if(highLightOption.equalsIgnoreCase("yes")) 
		{
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);
			ele.sendKeys(text);		
		}
	else
		{
			ele.sendKeys(text);	
		}
	}

}
