package pagesDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverInitilization {
	static WebDriver driver;
	//static WebDriver driver;
	public static  WebDriver getDriverObject() {
		
		
		driver = new ChromeDriver();
		return driver;
		
		
	}
	
	

}
