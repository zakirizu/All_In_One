package Selenium_Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Common_Xpath_With_Text {
	
	@Test(dataProvider = "signInMenuTexts")
	public static void checkSignInXpaths(String text) throws InterruptedException
	{
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement signIn = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));	
		Actions ac = new Actions(driver);
		ac.moveToElement(signIn).build().perform();
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//div[@id='nav-al-container']//span[text()='"+text+"']"));
		target.click();
		Thread.sleep(5000);		
		driver.quit();		
	}
	
	@DataProvider(name = "signInMenuTexts")
	public static Object[][]  signInMenuTexts() {
		
		String[][] data = {
				{"Your Account"},
				{"Your Orders"},
				{"Your Wish List"},
				{"Your Recommendations"},
				{"Your Prime Membership"},
		};
			
		return data;
		
	}
	
	


}
