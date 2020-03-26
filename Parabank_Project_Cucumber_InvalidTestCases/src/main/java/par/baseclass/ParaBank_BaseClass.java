package par.baseclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParaBank_BaseClass
{
	public static WebDriver driver;

	public void launchBrowser(String browserName) throws IOException{

		if(browserName.equals("chrome")){

			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver_v80.exe");
			driver = new ChromeDriver();
		}

		else if(browserName.equals("firefox")){

			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void getUrl(){
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}

}
