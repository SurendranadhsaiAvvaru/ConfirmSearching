package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
/*plugin = {"html:target/cucumber_html_report.html","pretty"} - For HTML report( Here to run this code we need not to use @AfterClass )
  plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"} - Creating html file using extent-config.xml file*/
@CucumberOptions(plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html","pretty"},
features="features",glue="stepdefinations",tags={"@All","~@Ignore"})
public class Runner extends AbstractTestNGCucumberTests{

	@AfterClass
	public static void writeExtentReport() {
		
		String projectPath = System.getProperty("user.dir");
		String extentReportConfigurePath = projectPath+"//src//test//java//extent-config.xml";
		File extentConfigFile = new File(extentReportConfigurePath);
		Reporter.loadXMLConfig(extentConfigFile);
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.141.59");	
	    Reporter.setSystemInfo("Browser", "Chrome");
	    Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	    
	}
	
}
