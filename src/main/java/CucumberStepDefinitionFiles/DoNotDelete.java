package CucumberStepDefinitionFiles;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoNotDelete {

	
	//Background
	@Given("Clear the Cache")
	public void clear_the_cache() {
		System.out.println("Background:Clearing the cache");
	}
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("i_want_to_write_a_step_with_precondition");	    
	}
	
	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("some_other_precondition");
	    
	}
	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("check more outcomes {string}")
	public void check_more_outcomes(String text) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Data is"+text);
	   
	}
	
//Scenario for addition
	@Given("Here we are sending text as {string} and {string}")
	public void Here_we_are_perfroming_addiion(String x, String y) {
		System.out.println("This is the frist Text: "+x);
		System.out.println("This is the frist Text: "+y); 
	}
	

	
	int sum;
	@Then("Add {int} and {int}")
	public void adding_numbers(int x, int y) {
		sum = x+y;    
	}
	
	@Then("Print the values of sum")
	public void printTheValuesOfString() {
		System.out.println("The sum of two numbers: "+sum);		
	}
	
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with_name2(String s) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("I verify the {string} in step")
	public void i_verify_the_fail_in_step(String x) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	
	
	
	
	
	
	
//Step Definition for the Scenario Outline example 
	
	@Given("Launch the url")
	public void launch_the_url() throws InterruptedException {
	    System.out.println("Launching the URL");
	   
	    
	}
	
	@Then("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
	    System.out.println(string + string2);
	}
	
	

	@Then("Close the browser")
	public void close_the_browser() {
		System.out.println("Closing the browser");
		
		
		
	
	}
	
//-->
	@Given("Launch the url of the Application")
	public void launch_the_url_of_the_application() {
		 System.out.println("Launch the Application URL");
	    
	}
	@Then("^Validate the (.+) and (.+) in the Application$")
	public void validate_the_and_in_the_application(String string, String string2) {
		 System.out.println(string + string2);
	    
	}
	
	@Then("Application closure")
	public void Application_closure() {
		System.out.println("Closing the browser");
	
	}
	
	
//-- #Sending the Data directly on to single step	
	
@Given("Launch the APSRTC Applicaiton")
public void launch_the_apsrtc_applicaiton() {
    System.out.println("Launch the APSRTC Application");
}
@Then("Enter the Student data in the form")
public void enter_the_student_data_in_the_form(List<String> data) {
System.out.println(data.get(0));
System.out.println(data.get(1));
System.out.println(data.get(2));
System.out.println(data.get(3));
}
@Then("Click on the submit button")
public void click_on_the_submit_button() {
    System.out.println("Clicling on the Submit BUtton");
}
	
	
	
	
	
	
	
	
	
	
	
}
