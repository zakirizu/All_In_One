package selenium_Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes_main {

	public static void main(String[] args) throws InterruptedException {
		SwtichToFrame_ByIndex();
		SwithcToFrame_ByID();
		SwitchToFrame_ByWebElement();
		/* If there are four frame and if you are asked to click on the element that is present in 3rd frame--
		 * Think in line of finding all the links (by tage name a)
		 * Similarly you can find all the elements with tag name iframe
		 * get the count and move to the corresponding frame and click on the element
		*/
		
	}

	private static void SwitchToFrame_ByWebElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WORK_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		WebElement IFrame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(IFrame);
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Zakir Hussain Shaik");
		Thread.sleep(3000);
		System.out.println("Switched to frame by WebElement ");
		driver.close();
		
	}

	private static void SwithcToFrame_ByID() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WORK_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Zakir Hussain Shaik");
		Thread.sleep(3000);
		System.out.println("Switched to frame by ID ");
		driver.close();
		
	}

	private static void SwtichToFrame_ByIndex() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WORK_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Zakir Hussain Shaik");
		Thread.sleep(3000);
		System.out.println("Switched to frame by Index ");
		driver.close();
		
	}

}
