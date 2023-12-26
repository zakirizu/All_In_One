package FrameWork_BuildingBlocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesDemo.testPage;

public class FindBy_PageObjectDesginPattern{

static WebDriver driver;

	
	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		System.out.println("ZR1:"+driver);
		driver.get("https://www.facebook.com/");
		
		
		/*******************************************************************************************************
		 *******************************************************************************************************
		 * THE SAME INSTANC OF THE DRIVER WHICH HAS OPENED THE WEBDRIVER WILL NOW BE GIVEN TO THE PAGE
		 * SO THAT IT CAN FIND THE ELEMENT ON THE GIVEN PAGE. BY THAT WE ARE KEEPING IN SYNC WITH THE
		 * LOCATOIN OF DRIVER OBJECT PAGE AND THE ELEMENTS 
		 * ******************************************************************************************************
		 *******************************************************************************************************/
		testPage tp = new testPage(driver);		
		System.out.println(tp.getUid());
		tp.uid.sendKeys("ZakirHussainShaik");
		
		
		
		
	}




	

}
