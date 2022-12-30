package FrameWork_BuildingBlocks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerDemo {


	public static void main(String[] args) throws InterruptedException {
		
		chromeDriverSetUp();
		edgeBrowserSetUp();
		//IEBrowserSetUp();
	
	}

	private static void edgeBrowserSetUp() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)) ;
		driver.manage().window().maximize();
		driver.get("https://dev.to/mwickrmanayaka/using-webdriver-manager-with-maven-pom-dependency-2oa7");
		Thread.sleep(5000);
		driver.quit();
		
	}

	private static void chromeDriverSetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)) ;
		driver.manage().window().maximize();
		driver.get("https://dev.to/mwickrmanayaka/using-webdriver-manager-with-maven-pom-dependency-2oa7");
		Thread.sleep(5000);
		driver.quit();
		
	}
	private static void IEBrowserSetUp() throws InterruptedException {
		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)) ;
		driver.manage().window().maximize();
		driver.get("https://dev.to/mwickrmanayaka/using-webdriver-manager-with-maven-pom-dependency-2oa7");
		Thread.sleep(5000);
		driver.quit();
		driver.close();
		
	}
}
