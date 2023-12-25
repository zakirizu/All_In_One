package selenium_Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Class {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		
	      options.addArguments("--remote-allow-origins=*");
	      options.addArguments("--no-sandbox");
	      options.addArguments("--disable-dev-shm-usage");
		
		
		WebDriverManager.chromedriver().setup();
			
		//Right_Click(); 		//ContextClick
		//Double_Click();  		//DoubleClick
		//Drag_And_Drop(); 		//DragAndDrop
		Hover();	       		//MoveToElement
	}

	private static void Right_Click() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		WebElement Droppable_Link = driver.findElement(By.xpath("//a[contains(text(),'Droppable')]"));
	//CONTEXT CLICK
		ac.contextClick(Droppable_Link).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

	private static void Double_Click() throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		Actions ac = new Actions(driver);		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		WebElement Droppable_Link = driver.findElement(By.xpath("//a[contains(text(),'Droppable')]"));
	//DOUBLE CLICK
		ac.doubleClick(Droppable_Link).build().perform();
		Thread.sleep(6000);
		driver.quit();	
	}
	
	private static void Drag_And_Drop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);        
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));			
	//DRAG AND DROP ACTION
         Actions ac = new Actions(driver);
         ac.dragAndDrop(From, To).build().perform();
         Thread.sleep(4000);
         driver.close(); //Closes only that tab. quit will close all the tabs     
	}

	private static void Hover() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		WebElement ToolTip = driver.findElement(By.xpath("//a[text()='Tooltip']"));
		ToolTip.click();
		Thread.sleep(6000);
		WebElement HoverTo = driver.findElement(By.xpath("//a[text()='Tooltips']"));
	//HOVER ACTION
		ac.moveToElement(HoverTo).build().perform();
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
