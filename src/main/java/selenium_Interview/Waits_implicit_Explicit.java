package selenium_Interview;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_implicit_Explicit {


	public static void main(String[] args) throws InterruptedException {
		implicitwait();
		//explicitwait();
		}
public static void implicitwait() throws InterruptedException {
	// SYNTAX==========driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	// By Default Polling time is 250ms
	//Globally Defined
	//it waits  for the defined time periods before it throws the no such exception error
	
	System.setProperty("webdriver.chrome.driver", "C:\\WORK_\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

//SYNTAX IMPLICIT Wait	
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("BlueStone");	
	Thread.sleep(2000);
	
	driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
	Thread.sleep(2000);
	
	driver.findElement(By.name("q")).sendKeys(Keys.DOWN);	
	Thread.sleep(2000);
	
	driver.findElement(By.name("q")).sendKeys(Keys.UP);	
	Thread.sleep(2000);
	
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	String title = driver.getTitle();
	
	System.out.println("Title of the Page = "+title);
	driver.quit();
}

public static void explicitwait() {
	// ==========SYNTAX==========
	//WebDriverWait ExplicitWait = new WebDriverWait(driver, 10);
	//ExplicitWait.until(ExpectedConditions.elementToBeClickable(By.name("q")));	
	// By Default Polling time is 250ms
	//Globally Defined
	//it waits  for the defined time periods before it throws the no such exception error
	
	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
//SYNTAX Explicit Wait
	//WebDriverWait ExplicitWait = new WebDriverWait(driver, 10);
	//ExplicitWait.until(ExpectedConditions.elementToBeClickable(By.name("q")));	
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("dfasfdfd"));
	driver.findElement(By.name("q")).sendKeys("Make It Happen");
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);


	String title = driver.getTitle();
	System.out.println("Title of the Page = "+title);
	driver.quit();
	
	
	
}


/*
driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);	

WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);

//The following are the Expected Conditions that can be used in Selenium Explicit Wait

alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
invisibilityOfTheElementLocated()
invisibilityOfElementWithText()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated()

*/








}
