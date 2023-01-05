package pagesDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInitilization {
	static WebDriver driver;
	//static WebDriver driver;
	public static  WebDriver getDriverObject() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
		
		
	}
	
	

}
