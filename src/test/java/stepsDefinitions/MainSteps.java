package stepsDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on Netbanking Landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User landed on netbanking page");
	    }

//	@When("User login into application")
//	public void user_login_into_application() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}

//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String username, String password) {
//	    System.out.println(username +"and password is "+password);
//	}

	@When("^User login into application with (.+) and password (.+)$ ")
	public void user_login_into_application_with_credituser_and_password_combination(String password) {
	    
	}


	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
		   
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards is displayed");
		
	}

//	@When("User login into application with {string} and password {string} combination")
//	public void user_login_into_application_with_and_password_combination(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Home page is displayed")
//	public void home_page_is_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	////////////////////////////////////////////////////////////////////////////
	
	
//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String username, String password) {
//	    }
//
//	@When("User login into application with {string} and password {string} combination")
//	public void user_login_into_application_with_and_password_combination(String string, String string2) {
//	    }
//
//	@Then("Home page is displayed")
//	public void home_page_is_displayed() {
//	        
//	}
//
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User is on Practice landing page");
		Assert.assertTrue(false);
	}

	@When("User Signup into application")
	public void user_signup_into_application(List<String> dataTable) {
		
		System.out.println(dataTable.get(0));
		System.out.println(dataTable.get(1));
		System.out.println(dataTable.get(2));
		System.out.println(dataTable.get(3));
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   	}


	@Given("setup the enteries in database")
	public void setup_the_enteries_in_database() {
		System.out.println("*********************************");
		System.out.println("setup the enteries in database");
	    	}

	@When("launch the browser from config variables")
	public void launchBrowser() 
	{
		System.out.println("launch the browser from config variables");
	    	}

	@When("hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
		System.out.println("hit the home page url of banking site");
		}


	/////////////////////////////////////////////////////////////////////////////
	
	


}



//undefined steps exceptions