package par.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parabank_Registration_Invalid 
{
	public static  WebDriver driver;

	By register=By.xpath("//*[@id='loginPanel']/p[2]/a");
	By firstname=By.id("customer.firstName");
	By lastname=By.id("customer.lastName");
	By address=By.name("customer.address.street");
	By city=By.id("customer.address.city");
	By state=By.name("customer.address.state");
	By zipcode=By.name("customer.address.zipCode");
	By phoneNo=By.xpath("//*[@id='customer.phoneNumber']");
	By SSN=By.id("customer.ssn");
	By username=By.xpath("//table[@class='form2']//tbody//tr[10]//input");
	By password=By.id("customer.password");
	By confirmpassword=By.id("repeatedPassword");
	By registerButton=By.xpath("//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input");
	By logout=By.partialLinkText("Log Out");

	public Parabank_Registration_Invalid(WebDriver driver)
	{
		this.driver=driver;
	}

	public void registrationOfCustomer()
	{

		driver.findElement(register).click();
		driver.findElement(firstname).sendKeys("radhika");
		driver.findElement(lastname).sendKeys("k");
		driver.findElement(address).sendKeys("sharadha colony 2nd line");
		driver.findElement(city).sendKeys("guntur");
		driver.findElement(state).sendKeys("AndhraPradesh");
		driver.findElement(zipcode).sendKeys("522004");
		driver.findElement(phoneNo).sendKeys("9856231475");
		driver.findElement(SSN).sendKeys("");
		driver.findElement(username).sendKeys("radhi586");
		driver.findElement(password).sendKeys("rad555");
		driver.findElement(confirmpassword).sendKeys("rad555");
	}

	public void submitRegistration() throws InterruptedException
	{
		driver.findElement(registerButton).click();
		Thread.sleep(3000);
		String exp="ParaBank | Register for Free Online Account Access";
		String act=driver.getTitle();
		assertEquals(exp,act);		
	}

	public void closeBrowser()
	{
		driver.close();
	}
}
