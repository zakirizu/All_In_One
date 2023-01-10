package CucumberStepDefinitionFiles;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableDemo {
	
	
    @Given("^Reading Data from DataTable$")
    public void reading_data_from_datatable() throws Throwable {
       System.out.println("ZR Reading the Data from Data Table");
    }

    @Then("^Print the Data from DataTable$")
    public void print_the_data_from_datatable(DataTable data) throws Throwable {
    	List<List<String>> getData    =data.asLists();
    	String row1col1 = getData.get(0).get(0);
    	System.out.println(row1col1);
    	String row2col1 = getData.get(1).get(0);
    	System.out.println(row2col1);
    	String row2col4 = getData.get(1).get(3);
    	System.out.println(row2col4);
    	String row2col5 = getData.get(1).get(4);
    	System.out.println(row2col5);
    	
       
    }


}
