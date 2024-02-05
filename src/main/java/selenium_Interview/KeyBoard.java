package selenium_Interview;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		WebElement Element = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		Element.sendKeys(Keys.ARROW_DOWN);
		Element.sendKeys(Keys.ARROW_RIGHT);
		Element.sendKeys(Keys.ENTER);
		Element.sendKeys(Keys.TAB);

	}

}
