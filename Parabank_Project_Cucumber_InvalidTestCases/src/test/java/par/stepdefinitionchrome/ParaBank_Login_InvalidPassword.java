package par.stepdefinitionchrome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import par.baseclass.ParaBank_BaseClass;
import par.pages.Parabank_Login_InvalidPassword;

public class ParaBank_Login_InvalidPassword extends ParaBank_BaseClass
{
	Parabank_Login_InvalidPassword plip;
	
	@Given("^the user launchs chrome browser$")
	public void the_user_launchs_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    launchBrowser("chrome");
	    plip=new Parabank_Login_InvalidPassword(driver);
	}

	@When("^the user opens the Parabankpage$")
	public void the_user_opens_the_Parabankpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	}

	@Then("^user enters the username and password in the fields$")
	public void user_enters_the_username_and_password_in_the_fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    plip.enterUsername();
	    plip.enterPassword();
	}

	@Then("^the user login into the application and close browser$")
	public void the_user_login_into_the_application_and_close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    plip.logInButton();
	    plip.closeBrowser();
	}
}
