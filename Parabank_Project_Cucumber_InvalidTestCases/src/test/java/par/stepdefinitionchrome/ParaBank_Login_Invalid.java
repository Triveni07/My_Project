package par.stepdefinitionchrome;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import par.baseclass.ParaBank_BaseClass;
import par.pages.Parabank_Login_Invalid;

public class ParaBank_Login_Invalid extends ParaBank_BaseClass
{
	Parabank_Login_Invalid pli;
	
	@Given("^the user launchs the chrome browser$")
	public void the_user_launchs_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    launchBrowser("chrome");
	    pli=new Parabank_Login_Invalid(driver);
	}

	@When("^the user open the ParabankLoginpage$")
	public void the_user_open_the_ParabankLoginpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     getUrl();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pli.enterUsername();
	    pli.enterPassword();
	}

	@And("^then the user login and close the browser$")
	public void then_the_user_login_and_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pli.logInButton();
	    pli.closeBrowser();
	}

}
