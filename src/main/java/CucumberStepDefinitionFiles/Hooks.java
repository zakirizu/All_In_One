package CucumberStepDefinitionFiles;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	
	/******************************************************************************************************************************
	 *  						HOOKS
	 *  These are similar to the BeforeMethod in TestNg 
	 *  Using this we can define what code can we run before and after every scenario
	 ******************************************************************************************************************************
	 */
	
	
	@Before("@DataTableDemo1")
	public void beforeValidation() {
		System.out.println("ZR: This is code for the Before Hook");
	}
	
	
	
	@After("@DataTableDemo2")
	public void afterValidation() {
		System.out.println("ZR: This is code for the After Hook");
	}
}
