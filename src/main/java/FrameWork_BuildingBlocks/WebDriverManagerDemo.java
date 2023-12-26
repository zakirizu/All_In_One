package FrameWork_BuildingBlocks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class WebDriverManagerDemo {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		chromeDriverSetUp();
		edgeBrowserSetUp();
		//IEBrowserSetUp();
	
	}

	public static void edgeBrowserSetUp() throws InterruptedException {
	
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)) ;
		driver.manage().window().maximize();
		driver.get("https://dev.to/mwickrmanayaka/using-webdriver-manager-with-maven-pom-dependency-2oa7");
		Thread.sleep(5000);
		driver.quit();
		
	}

	public static WebDriver chromeDriverSetUp() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)) ;
		driver.manage().window().maximize();
		return driver;
		
	}
	public static void IEBrowserSetUp() throws InterruptedException {
		
		
		 driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)) ;
		driver.manage().window().maximize();
		driver.get("https://dev.to/mwickrmanayaka/using-webdriver-manager-with-maven-pom-dependency-2oa7");
		Thread.sleep(5000);
		driver.quit();
		driver.close();
		
	}
}
