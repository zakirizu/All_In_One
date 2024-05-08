package Selenium_Interview;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\WORK_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement about_link = driver.findElement(By.xpath("//div[text()='About']"));
		WebElement blog_link = driver.findElement(By.xpath("//div[text()='Blog']"));
		WebElement api_link = driver.findElement(By.xpath("//div[text()='API']"));
		
		about_link.click();
		blog_link.click();
		api_link.click();
		Thread.sleep(10000);
		
		int count = driver.getWindowHandles().size();
		System.out.println("Count of windows opened = "+count);
		
	//How to switch to windows and get the titles
		
		Set<String> Windowshandles = driver.getWindowHandles();		
		Iterator<String> ite = Windowshandles.iterator();
		
		while(ite.hasNext()) {
			
			driver.switchTo().window(ite.next());
			String WindowName = driver.getTitle();
			System.out.println(WindowName);	
			Thread.sleep(4000);
			
		}
		

	}

}
