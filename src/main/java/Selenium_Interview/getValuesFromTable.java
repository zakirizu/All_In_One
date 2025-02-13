package Selenium_Interview;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getValuesFromTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		WebElement webTable = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tr//th"));
		
		
		for(int i =2; i<=rows.size();i++)
		{
			for(int j=1;j<=columns.size();j++)
			{
				String temp = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]")).getText();
				String targer = "Ernst Handel";
				System.out.println(temp);
				
				
			}
				
			
		}
		driver.close();
		

		
		
		

	}

}
