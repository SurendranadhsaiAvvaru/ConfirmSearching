package pageobjectsM;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkFromHomePage {
	
	WebDriver driver;
	
	public WorkFromHomePage(WebDriver driver) {
		
		this.driver = driver;	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//h1[@class='fs-24 srp-seo-data capitalize ib normal']")
	WebElement WorkFromHomePageDisplay;
	
	@FindBy(xpath="//a[@title='Senior Salesforce Developer ']")
	WebElement ClickingOnSelectedJobTitle;
	
	public boolean WorkFromHomeTitleWillBeDisplayed(){
		
		return WorkFromHomePageDisplay.isDisplayed();
		
	}
	
	public void ClickingOnSelectedJobFromWorkFromHomePage() {
		
		ClickingOnSelectedJobTitle.click();
		
	}
	
}