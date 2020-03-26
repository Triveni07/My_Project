package par.testrunnerchrome;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\feature\\parabnk.feature",	
		plugin = {"pretty", "html:reports\\cucumber_html_report","json:reports\\cucumber_html_report\\jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports\\Extentreports\\Extentreport.html"},
		glue = {"par.stepdefinitionchrome"},
		monochrome=true
		)

public class Parabank_TestRunner_Chrome {
	@AfterClass
	public static void extendReport() {
    Reporter.loadXMLConfig("src\\test\\resources\\extent_config.xml");
	
}
}
