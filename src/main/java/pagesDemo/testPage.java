package pagesDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import FrameWork_BuildingBlocks.FindBy_PageObjectDesginPattern;


public class testPage  {	
	public static WebDriver driver;	
	public testPage(WebDriver driver)
	{
		testPage.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("ZR2:"+driver);
	}
	
	
	
	/*
	 * ************************************************************************************************************
	 * ************************************************************************************************************
	 *   WE CAN CREATE GETTERS AND SETTER FROM SOURCE 
	 *   JUST USER THE BELOW CODE 
	 *   		@FindBy(xpath = "//input[@id='email']")
				public	WebElement uid;
		AND THEN CLICK ON SOURCE->SELECT THE WEBELEMENT & SELECT GENERATE GETTER AND SETTER
	 * ************************************************************************************************************* 
	 * *************************************************************************************************************
	 * 
	 */
	@FindBy(xpath = "//input[@id='email']")
	public	WebElement uid;
	public WebElement getUid() {
		return uid;
	}
	public void setUid(WebElement uid) {
		this.uid = uid;
	}

	
	
	
	
	@FindBy(xpath = "//input[@id='password']")
	public	WebElement pwd;
	

}
