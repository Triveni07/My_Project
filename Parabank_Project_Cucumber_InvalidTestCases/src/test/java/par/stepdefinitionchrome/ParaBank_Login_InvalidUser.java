package par.stepdefinitionchrome;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import par.baseclass.ParaBank_BaseClass;
import par.pages.Parabank_Login_InvalidUser;

public class ParaBank_Login_InvalidUser extends ParaBank_BaseClass
{
	Parabank_Login_InvalidUser pliu;
	
	@Given("^the user launch the chrome browser$")
	public void the_user_launch_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("chrome");
	    pliu=new Parabank_Login_InvalidUser(driver);
	}

	@When("^the user open the Parabankpage$")
	public void the_user_open_the_Parabankpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   getUrl();
	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pliu.enterUsername();
	    pliu.enterPassword();
	}

	@And("^then login and close the browser$")
	public void then_login_and_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pliu.logInButton();
	    pliu.closeBrowser();
	}

}
