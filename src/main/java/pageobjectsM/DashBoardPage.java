package pageobjectsM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashBoardPage {
	
	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='col-md-12']//h1[@class='main-heading mt20']")
	WebElement DashboardTitle;
	
	@FindBy(xpath="//li[@data-tab='applied']//span[@class='fl']")
	WebElement AppliedJobsOption;
	
	@FindBy(xpath="//li[@data-tab='saved']//span[@class='fl']")
	WebElement SavedJobsOption;	
	
	@FindBy(xpath="//h3[@class='color-black medium fs-18 mt10']")
	WebElement AppliedJobsTitle;
	
	@FindBy(xpath="//h3[@class='color-black medium fs-18 mt10']")
	WebElement SavedJobsTitle;
	
	@FindBy(xpath="//h3[normalize-space()='AWS Developer']")
	WebElement FirstJob;
	
	@FindBy(xpath="//h3[normalize-space()='Sr. .NET Developer']")
	WebElement SampleJob;
	
	@FindBy(xpath="//h2[normalize-space()='Upload Your Resume']")
	WebElement UploadReminder;
	
	@FindBy(xpath="//span[@class='remind-me']")
	WebElement ClosingUploadReminder;
	
	public void UploadResumeReminder(){
		
		try {
		
			UploadReminder.isDisplayed();
			System.out.println("Successfully Able to view Reminder");
		
		}catch(Exception e) {
			
			System.out.println("UploadResume Reminder is not appeared");
		
		}
		
	}
	
	public void ClosingUploadReminderOption() {
		
		try {
			
			ClosingUploadReminder.click();
			System.out.println("Successfully closed Reminder");
			
		}catch(Exception e){
			
			System.out.println("UploadResume Reminder is not appeared");
		
		}
		
	}
	
	public void AbleToSeeDashboardTitle(){
		
		Assert.assertTrue(DashboardTitle.isDisplayed());
		
	}
	
	public void ClickingOnAppliedJobsOption() {
		
		AppliedJobsOption.click();
		
	}
	
	public void AbleToSeeAppliedJobsTitle(){
		
		Assert.assertTrue(AppliedJobsTitle.isDisplayed());
		
	}
	
	public void ClickingOnSavedJobsOption() {
		
		SavedJobsOption.click();
		
	}
	
	public void AbleToSeeSavedJobsTitle(){
		
		Assert.assertTrue(SavedJobsTitle.isDisplayed());
		
		
	}
	
	public void ClickingOnFirstJob() {
		
		FirstJob.click();
		
	}
	
	public void ClikingOnSampleJobToSaveAndUnsave() {
		
		 SampleJob.click();
		
	}		
	
}