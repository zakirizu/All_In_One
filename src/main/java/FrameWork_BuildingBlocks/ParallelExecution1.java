package FrameWork_BuildingBlocks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagesDemo.DriverInitilization;

public class ParallelExecution1 {
	
	/*
	 * ***********************************************************************************************************************
	 * NOTE THAT IF YOU WANT TO RUN THE TEST CASES IN PARLELL AT THE METHOD LEVEL, 
	 * THEN YOU NEED TO HAVE DRIVER OBJECT CREATED AT THE METHOD LEVEL. HENCE YOU NEED TO CREATE A OBJECT IN EVERY TEST CASE
	 * ***********************************************************************************************************************
	 * IT IS RECOMMENED TO HAVE PARALLEL EXECUTION AT THE CLASS LEVEL 
	 * SO THAT WE CAN CREATE A DRIVER IN BEFORE METHOD FOR EVERY TEST CASE AND ACHIEVE PARALLEL EXECUTION AT DIFFRENT CLASSES
	 * 
	 * ***********************************************************************************************************************
	 */
	
	
	static WebDriver driver;
	
	@BeforeMethod
	public  void before() {
		 driver = DriverInitilization.getDriverObject();
	}
	
	
	@Test
	public void test1() throws InterruptedException {
		//WebDriver driver = DriverInitilization.getDriverObject();
		System.out.println("ZR1 "+driver);
		driver.get("https://demo.guru99.com/test/web-table-element.php");	
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
	@Test
	public void test2() throws InterruptedException {
		//WebDriver driver = DriverInitilization.getDriverObject();
		System.out.println("ZR2 "+driver);
		driver.get("https://www.amazon.in/");
		//Thread.sleep(2000);
		driver.close();
		
	}
	
	

}
