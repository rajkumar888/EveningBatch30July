package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDef {
	
	@Before()
	public void init(){
		System.out.println(" Cucumber Before hooks example");
	}
	
//	@After()
//	public void teaDown(Scenario scenario){
//		
//		System.out.println(" Cucumber After hooks example "+scenario.getName()+" is "+scenario.getStatus());
//	}
	
	
	
	
	@Given("The web browser is opened")
	public void the_web_browser_is_opened() {
	    
		System.out.println("The web browser is opened is called for execution......");
		
	}

	@Given("url is opened")
	public void url_is_opened() {
		
		System.out.println("url is opened called for execution.......");
	  
	}

	@When("user has entered user name as {string}")
	public void user_has_entered_user_name_as(String username) {
	    
		System.out.println("user has entered user name called for execution "+username);
	}

	@When("user has enetered password as {string}")
	public void user_has_enetered_password_as(String password) {
		System.out.println("user has enetered password called for execution "+password);
	}

	@When("user has clicked on login button")
	public void user_has_clicked_on_login_button() {
		System.out.println("user has clicked on called for execution");
	}

	@Then("user is allowed to navigate to hompe page")
	public void user_is_allowed_to_navigate_to_hompe_page() {
		System.out.println("user is allowed to navigate for execution");
	}

	@Then("verify the title and logo of the home page")
	public void verify_the_title_and_logo_of_the_home_page() {
		System.out.println("verify the title and logo of the home page called for execution");
	}

	@When("user has closed the application")
	public void user_has_closed_the_application() {
		System.out.println("user has closed the application called for execution");
	}
	
	
	
	@Given("I am on a new user registration page")
	public void i_am_on_a_new_user_registration_page() {
		System.out.println("I am on a new user registration page called for execution");
	}
	
	
	@When("I enter valid data on the page")
	public void i_enter_valid_data_on_the_page(DataTable dataTable) {
		
		 //Initialize data table 
	       List<List<String>> data = dataTable.asLists();
	       
//	       List<String> testdata = dataTable.asList(String.class);
	      
	      System.out.println(data.get(1).get(0));
	      System.out.println(data.get(1).get(1));
	      System.out.println(data.get(2).get(0));
	      System.out.println(data.get(2).get(1));
	      System.out.println(data.get(3).get(0));
	      System.out.println(data.get(3).get(1));
	      System.out.println(data.get(4).get(0));
	      System.out.println(data.get(4).get(1));
	      System.out.println(data.get(5).get(0));
	      System.out.println(data.get(5).get(1));
	      System.out.println(data.get(6).get(0));
	      System.out.println(data.get(6).get(1));
	      System.out.println(data.get(7).get(0));
	      System.out.println(data.get(7).get(1));
	      System.out.println(data.get(8).get(0));
	      System.out.println(data.get(8).get(1));
	}
	
	@Then("the user registration should be successful.")
	public void the_user_registration_should_be_successful() {
		System.out.println("the user registration should be successful. called for execution"); 
	}
	
	@Then("the given message should be displayed")
	public void the_given_message_should_be_displayed(String docstringdemotext) {
		System.out.println("Docstring demo "+docstringdemotext); 
	}
	
	
	
	
}
