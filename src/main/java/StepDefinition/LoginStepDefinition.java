package StepDefinition;



import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	@Given("^user is on Free CRM$")
	public void user_is_on_Free_CRM(){
		
		System.out.println("Given: user is on Free CRM");
		
	}
	
	@When("^user is on Login Page$")
	public void user_is_on_Login_Page(){
		System.out.println("When: user is on Login Page");
	    
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credentials)  {
		for(Map<String, String> data: credentials.asMaps(String.class, String.class))
		{
		System.out.println(data.get("username"));
		System.out.println(data.get("password"));
		}
		
	}

	@Then("^user clicks login button$")
	public void user_clicks_login_button()  {
		System.out.println("Then user clicks login button");
	}

	@Then("^user is on Home page$")
	public void user_is_on_Home_page() {
		System.out.println("Then user is on Home page");
	}

}
