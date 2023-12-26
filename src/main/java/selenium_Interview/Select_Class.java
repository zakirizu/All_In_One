package selenium_Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {

	public static void main(String[] args) throws InterruptedException {
		
		


		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement Country_ddl = driver.findElement(By.xpath("//select[@name='country']"));
	//Creating an Object for Select Class	
		Select sc = new Select(Country_ddl);
		int count = sc.getOptions().size();
		System.out.println(count);
		
		
		
		
	//BY INDEX - INDEX WILL BE START FROM O --ZERO
		sc.selectByIndex(2);
		Thread.sleep(2000);
	//BY VALUE
			sc.selectByValue("BERMUDA");
		Thread.sleep(3000);
	//BY VISIBLE TEXT
		sc.selectByVisibleText("INDIA");
		Thread.sleep(3000);
	//MULTIPLE
		System.out.println("Country DDL allows Multiple Values = "+sc.isMultiple());
	//SELECT LAST BUT ONE VALUE
		int TotalCount = sc.getOptions().size();
		sc.selectByIndex(TotalCount-2);
		Thread.sleep(3000);
		driver.quit();

	}

}
