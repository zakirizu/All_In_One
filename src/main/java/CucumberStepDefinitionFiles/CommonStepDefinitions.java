package CucumberStepDefinitionFiles;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepDefinitions {
	
	
	static String driver = Hooks.name;
	
	@Given("^Reading Data from DataTable3$")
    public static void reading_data_from_datatable() throws Throwable {
       System.out.println("ZR Reading the Data from Data Table3");
       System.out.println(Hooks.name);
       System.out.println(driver);
    }

  

}
