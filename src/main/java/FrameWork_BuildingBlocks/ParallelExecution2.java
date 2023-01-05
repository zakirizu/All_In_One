package FrameWork_BuildingBlocks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagesDemo.DriverInitilization;

public class ParallelExecution2 {
	
	
	static WebDriver driver;
	
	@BeforeMethod
	public  void before() {
		 driver = DriverInitilization.getDriverObject();
	}
	
	
	@Test
	public void test3() throws InterruptedException {
		//WebDriver driver = DriverInitilization.getDriverObject();
		System.out.println("ZR3 "+driver);
		driver.get("https://www.toolsqa.com/testng/testng-parallel-execution/");
		//Thread.sleep(9000);
		driver.close();
		
	}
	
	
	@Test
	public void test4() throws InterruptedException {
		//WebDriver driver = DriverInitilization.getDriverObject();
		System.out.println("ZR4 "+driver);
		driver.get("https://www.facebook.com/");
		//Thread.sleep(4000);
		driver.close();
		
	}
	
	

}
