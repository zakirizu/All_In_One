package CucumberStepDefinitionFiles;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	static String name;
	/******************************************************************************************************************************
	 *  						HOOKS
	 *  These are similar to the BeforeMethod in TestNg , but the difference is we need to pass the tag Name for the scenarios
	 *  Using this we can define what code can we run before and after every scenario
	 *  if you are not giving any TagName inside the Before and After then that hook will be applicable for all the scenarios
	 ******************************************************************************************************************************
	 */
	
	
	@Before()
	public void beforeValidation() {
		System.out.println("ZR: This is code for the Before Hook");
		 name = "ZAKIR ZR";
	}
	
	
	@After("@DataTableDemo2")
	public void afterValidation() {
		System.out.println("ZR: This is code for the After Hook");
	}
	

	@Before("@hcm")
	public void beforehcm() {
		System.out.println("ZR: This is code for the Before Hook for HCM Feature");
	}
	
	
	
	@After("@hcm")
	public void afterhcm() {
		System.out.println("ZR: This is code for the After Hook for HCM Feature");
	}
}
