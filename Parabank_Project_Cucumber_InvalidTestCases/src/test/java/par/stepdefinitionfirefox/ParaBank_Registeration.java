package par.stepdefinitionfirefox;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import par.baseclass.ParaBank_BaseClass;
import par.pages.Parabank_Registration;

public class ParaBank_Registeration extends ParaBank_BaseClass
{
	 Parabank_Registration pr;
	 
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    launchBrowser("firefox");
	    pr=new Parabank_Registration(driver);
	}

	@When("^the user open the Parabank Registration page$")
	public void the_user_open_the_Parabank_Registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	}

	@Then("^user enters the details$")
	public void user_enters_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        pr.registrationOfCustomer();
	}

	@And("^submits the registration and close the browser$")
	public void submits_the_registration_and_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pr.submitRegistration();
	    pr.closeBrowser();
	}

}
