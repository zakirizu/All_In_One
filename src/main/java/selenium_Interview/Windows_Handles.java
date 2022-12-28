package selenium_Interview;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WORK_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		String MainWindow = driver.getWindowHandle();
		
			
		WebElement about_link = driver.findElement(By.xpath("//div[text()='About']"));
		WebElement blog_link = driver.findElement(By.xpath("//div[text()='Blog']"));
		WebElement api_link = driver.findElement(By.xpath("//div[text()='API']"));
		
		about_link.click();
		blog_link.click();
		api_link.click();
		Thread.sleep(10000);
		
					
		int count = driver.getWindowHandles().size();		
		System.out.println(count);
		
		
		//Explain iterator post explaning the count of windows handles
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it  =  windows.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			String Title = driver.getTitle();
			System.out.println(Title);						
		}
		
		
	}

}
