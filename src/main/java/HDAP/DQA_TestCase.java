package HDAP;

import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DQA_TestCase {
	static WebDriver driver = new ChromeDriver();
	

	public static void main(String[] args) {
		dqaTask_Test();	
		EmailTask_TestCase();
	}
		
		
		
	
		private static void EmailTask_TestCase() {

try
		{		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		driver.manage().window().maximize();
		driver.get("https://cotvti-row-dt4.pega.net/prweb/app/hdap/4sQ1uGB36iO1QZw4xl3BL6CyZUv6LdMq*/!STANDARD?");
		WebElement username =driver.findElement(By.xpath("//input[@id='UserID']"));
		WebElement Password =driver.findElement(By.xpath("//input[@type=\"password\"]"));
		WebElement Login_button=driver.findElement(By.xpath("//button[@class=\"loginButton\"]"));		
		username.sendKeys("QA_Retrieval");
		Password.sendKeys("rules@123");
		 Login_button.click();		 
		 Thread.sleep(5000);		 
		 driver.switchTo().frame("PegaGadget0Ifr");		 
		 WebElement search=driver.findElement(By.xpath("//span[text()='Search']"));
		 search.click();
		 WebElement ID=driver.findElement(By.xpath("//input[@id='dc89b4dd']"));
		 ID.sendKeys("RET-9642869539");
		 WebElement Masum = driver.findElement(By.xpath("//button[text()='Search']"));
		 Masum.click();
		 WebElement Zak = driver.findElement(By.xpath("//a[text()='RET-9642869539']"));
		 Zak.click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("PegaGadget1Ifr");
		 WebElement SAif = driver.findElement(By.xpath("//button[@title='Add task']"))		 ;
		 SAif.click();
		 WebElement DQA = driver.findElement(By.xpath("//a[text()='Email']"));
		 DQA.click();
		 WebElement Add = driver.findElement(By.xpath("//button[@title='Add tasks']"));
		 Add.click();
		 driver.close();	 
		}
		

		catch(Exception obj)
		{
			System.out.println("Exception Occured is----->>"+obj);
			driver.close();
		}
		
		
	}
		
		
	




		private static void dqaTask_Test() {

try
		{		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		driver.manage().window().maximize();
		driver.get("https://cotvti-row-dt4.pega.net/prweb/app/hdap/4sQ1uGB36iO1QZw4xl3BL6CyZUv6LdMq*/!STANDARD?");
		WebElement username =driver.findElement(By.xpath("//input[@id='txtUserID']"));
		WebElement Password =driver.findElement(By.xpath("//input[@type=\"password\"]"));
		WebElement Login_button=driver.findElement(By.xpath("//button[@class=\"loginButton\"]"));		
		username.sendKeys("QA_Retrieval");
		Password.sendKeys("rules@123");
		 Login_button.click();		 
		 Thread.sleep(5000);		 
		 driver.switchTo().frame("PegaGadget0Ifr");		 
		 WebElement search=driver.findElement(By.xpath("//span[text()='Search']"));
		 search.click();
		 WebElement ID=driver.findElement(By.xpath("//input[@id='dc89b4dd']"));
		 ID.sendKeys("RET-9642869539");
		 WebElement Masum = driver.findElement(By.xpath("//button[text()='Search']"));
		 Masum.click();
		 WebElement Zak = driver.findElement(By.xpath("//a[text()='RET-9642869539']"));
		 Zak.click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("PegaGadget1Ifr");
		 WebElement SAif = driver.findElement(By.xpath("//button[@title='Add task']"))		 ;
		 SAif.click();
		 WebElement DQA = driver.findElement(By.xpath("//a[text()='DQA']"));
		 DQA.click();
		 WebElement Add = driver.findElement(By.xpath("//button[@title='Add tasks']"));
		 Add.click();
		 driver.close();	 
		}
		

		catch(Exception obj)
		{
			System.out.println("Exception Occured is----->>"+obj);
			driver.close();
		}
		
		
	}


		 
		 
		}



