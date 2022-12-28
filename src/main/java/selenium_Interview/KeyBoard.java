package selenium_Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		Element.sendKeys(Keys.ARROW_DOWN);
		Element.sendKeys(Keys.ARROW_RIGHT);
		Element.sendKeys(Keys.ENTER);
		Element.sendKeys(Keys.TAB);

	}

}
