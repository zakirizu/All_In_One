package Selenium_Interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOddValuesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//lauch 
		//find ddl 
		// select class
		// get all the options and save in list 
		// get the text of that
		// print only odd values
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		WebElement ddl = driver.findElement(By.xpath("//select"));
		
		Select sc = new Select(ddl);
		List<WebElement>     options = sc.getOptions();
		
		for(int i=0;i<options.size();i=i+5){
			
			
			
		    System.out.println(options.get(i).getText());
			
		} 
		
		
		
		

	}

}
