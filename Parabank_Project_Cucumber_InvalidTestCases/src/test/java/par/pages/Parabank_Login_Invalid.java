package par.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parabank_Login_Invalid 
{
	public static WebDriver driver;

	By username=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//*[@id='loginPanel']/form/div[3]/input");
	By logout=By.partialLinkText("Log Out");

	public Parabank_Login_Invalid(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enterUsername()
	{
		driver.findElement(username).sendKeys("triv");
	}

	public void enterPassword()
	{
		driver.findElement(password).sendKeys("");
	}

	public void logInButton() throws InterruptedException
	{
		driver.findElement(login).click();
		Thread.sleep(3000);
		String exp="ParaBank | Error";
		String act=driver.getTitle();
		assertEquals(exp,act);
	}

	public void closeBrowser()
	{
		driver.close();
	}
}
