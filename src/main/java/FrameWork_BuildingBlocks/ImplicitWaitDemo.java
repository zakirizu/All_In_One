package FrameWork_BuildingBlocks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		/********************************************************************************************
		 * Implicitly wait has now been updated with below syntax
		 * *****************************************************************************************/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)) ;
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(1));
		driver.get("https://dev.to/mwickrmanayaka/using-webdriver-manager-with-maven-pom-dependency-2oa7");
		Thread.sleep(5000);
		driver.quit();

	}

}
