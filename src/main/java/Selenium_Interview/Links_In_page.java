package Selenium_Interview;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_In_page {

	public static void main(String[] args) throws InterruptedException {
		
		
		Count_Of_Links();	
		
	}

	private static void Count_Of_Links() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		int size = Links.size();
		System.out.println("Count of All the Links is "+size);
		Thread.sleep(3000);
		Links.get(3).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
