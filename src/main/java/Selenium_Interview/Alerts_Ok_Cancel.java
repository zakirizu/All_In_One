package Selenium_Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Ok_Cancel {

	public static void main(String[] args) throws InterruptedException {
		
		
	//	Cancel_Alerts();	//driver.switchTo().alert().dismiss();
	//	Accept_Alerts();	//driver.switchTo().alert().ACCEPT();
		getText();			//driver.switchTo().alert().getText();
	//	SendKeys();			//driver.switchTo().alert().SendKeys();	
	}

	
	

	private static void getText() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		WebElement CustomerID_TxtBox = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_btn 		 = driver.findElement(By.xpath("//input[@name='submit']"));
		CustomerID_TxtBox.sendKeys("9642869539");
		Thread.sleep(3000);		
		Submit_btn.click();	
		Thread.sleep(3000);		
		
	//Text in the Pop Up 	
		String AlertText = driver.switchTo().alert().getText();
		System.out.println("ALERT TEXT = "+AlertText);
		Thread.sleep(3000);	
		driver.quit();
	}



	private static void Cancel_Alerts() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		WebElement CustomerID_TxtBox = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_btn 		 = driver.findElement(By.xpath("//input[@name='submit']"));
		
		CustomerID_TxtBox.sendKeys("964286");
		Submit_btn.click();	
		Thread.sleep(3000);		
	//Cancel the Pop Up 	
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);	
		driver.quit();
	}

	
	private static void Accept_Alerts() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	WebElement CustomerID_TxtBox = driver.findElement(By.xpath("//input[@name='cusid']"));
	WebElement Submit_btn 		 = driver.findElement(By.xpath("//input[@name='submit']"));	
	CustomerID_TxtBox.sendKeys("964286");
	Submit_btn.click();	
	Thread.sleep(3000);
	
//Accept the Pop UP Window
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.quit();

	}


	private static void SendKeys() {
		// TODO Auto-generated method stub
		
	}
	
}
