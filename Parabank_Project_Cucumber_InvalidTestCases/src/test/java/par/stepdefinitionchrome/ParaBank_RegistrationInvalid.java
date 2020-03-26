package par.stepdefinitionchrome;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import par.baseclass.ParaBank_BaseClass;
import par.pages.Parabank_Registration_Invalid;

public class ParaBank_RegistrationInvalid extends ParaBank_BaseClass
{
	Parabank_Registration_Invalid pri;
	
	@Given("^the user launchs the chrome application$")
	public void the_user_launchs_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    launchBrowser("chrome");
	    pri=new Parabank_Registration_Invalid(driver);
	}

	@When("^the user open the Parabank Registration Page$")
	public void the_user_open_the_Parabank_Registration_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	}

	@Then("^the user enters the details$")
	public void the_user_enters_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   pri.registrationOfCustomer();
	}

	@And("^submits the registration and the closes the browser$")
	public void submits_the_registration_and_the_closes_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        pri.submitRegistration();
        pri.closeBrowser();
	}
}
