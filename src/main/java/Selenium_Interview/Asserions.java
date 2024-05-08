package Selenium_Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserions {
@Test
public void HardAssertion() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		WebElement contextLink = driver.findElement(By.xpath("//a[text()='Context Menu']"));
		contextLink.click();		
		Actions ac = new Actions(driver);		
		WebElement contexArea = driver.findElement(By.xpath("//div[@id='hot-spot']"));		
		ac.contextClick(contexArea).build().perform();		
		String RunTimeText = driver.switchTo().alert().getText();
		String ExpectedMsg = "You selected a Context menu";
		
		Assert.assertEquals(RunTimeText, ExpectedMsg);	//Hard Assert-- Failing 		
		System.out.println("I am Zakir Hussain");	
	}

@Test
public void Soft_Assertion() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));		
		WebElement contextLink = driver.findElement(By.xpath("//a[text()='Context Menu']"));
		contextLink.click();		
		Actions ac = new Actions(driver);		
		WebElement contexArea = driver.findElement(By.xpath("//div[@id='hot-spot']"));		
		ac.contextClick(contexArea).build().perform();			
		String RunTimeText = driver.switchTo().alert().getText();
		String ExpectedMsg = "BlueStone";		
		SoftAssert sa = new SoftAssert();		
		sa.assertEquals(RunTimeText, ExpectedMsg);// Soft Aseertion			
		System.out.println("I am Zakir Hussain");
	}	
}
