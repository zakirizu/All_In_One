package selenium_Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {


	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//SwtichToFrame_ByIndex(driver);
		//SwitchToFrame_ByNameID(driver);
		SwitchToFrame_ByWebElement(driver);
		
		
	
	}

	private static void SwitchToFrame_ByWebElement(WebDriver driver) {
		
		driver.get("https://the-internet.herokuapp.com/iframe");			
		driver.findElements(By.tagName("a")).size();		
		driver.findElements(By.tagName("iframe")).size();		
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(iFrame);		
		WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		textBox.clear();
		textBox.sendKeys("Sai being Fresher is Doing Great!!!");
		driver.switchTo().defaultContent();
		
	}

	private static void SwitchToFrame_ByNameID(WebDriver driver) {
	
		driver.get("https://the-internet.herokuapp.com/iframe");		
		driver.switchTo().frame("mce_0_ifr");//ByName or ID		
		WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		textBox.clear();
		textBox.sendKeys("Samhita");
		
	}

	private static void SwtichToFrame_ByIndex(WebDriver driver) {
	
		driver.get("https://the-internet.herokuapp.com/iframe");		
		driver.switchTo().frame(0);//by Index		
		WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		textBox.sendKeys("Zakir Hussain Shaik");
		
	}

}
