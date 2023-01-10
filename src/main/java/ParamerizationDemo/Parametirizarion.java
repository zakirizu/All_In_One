package ParamerizationDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parametirizarion {
	
    @Given("^I want to write a step with (.+)$")
    public void i_want_to_write_a_step_with(String name) throws Throwable {
    	System.out.println("Printing Name:"+name);
       
    }

    @When("^I check for the (.+) in step$")
    public void i_check_for_the_in_step(String value) throws Throwable {
    	System.out.println("Printing value:"+value);
    }

    @Then("^I verify the (.+) in step$")
    public void i_verify_the_in_step(String password) throws Throwable {
    	System.out.println("Printing password:"+password);
       
    }


}
