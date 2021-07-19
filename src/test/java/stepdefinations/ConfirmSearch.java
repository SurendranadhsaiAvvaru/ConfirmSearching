package stepdefinations;

import Base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectsM.DashBoardPage;
import pageobjectsM.HomePage;
import pageobjectsM.JobDetailsPage;
import pageobjectsM.LoginPage;

public class ConfirmSearch extends Base {
	
	@Before("@ConfirmSearch")
	public void browser(){
			
		loadDataProperties();
		driver = initializeBrowser(prop.getProperty("browser"));
	
	}
		
	@After("@ConfirmSearch")
	public void teardown(){
			
		driver.quit();			
	}
	
	@Given("^I visit the website as a registered user$")
    public void i_visit_the_website_as_a_registered_user(){
        
		HomePage hp = new HomePage(driver);
		//hp.ClosingOfAdds();
		hp.ClickingOnLoginButton();
		
		LoginPage lp = new LoginPage(driver);
		lp.enteremailid(prop.getProperty("validemail"));
		lp.enterpassword(prop.getProperty("validpassword"));
		lp.ClickloginbuttonAfterProvidingDetails();
		
		HomePage hp1 = new HomePage(driver);
		hp1.ProfileNameWillBeDisplayed();
		System.out.println("Successfully LoggedIn");
    }

    @When("^I click on Dashboard$")
    public void i_click_on_dashboard(){
        
    	HomePage hp = new HomePage(driver);
    	hp.ClosingOfAdds();
		hp.ClickingOnDashboard();
		System.out.println("Successfully Clicked on DashBoard Option");
    	
    }

    @Then("^I will be redirected to the Dasboard page$")
    public void i_will_be_redirected_to_the_dasboard_page(){
    	
    	HomePage hp = new HomePage(driver);
		hp.ClosingOfAdds();
    	
    	DashBoardPage dbp = new DashBoardPage(driver);
    	dbp.UploadResumeReminder();
    	dbp.ClosingUploadReminderOption();
		dbp.AbleToSeeDashboardTitle();
		System.out.println("Successfully Entered Into DashBoardPage");
    	
    }
    
    @And("^I should click on Saved Jobs$")
    public void i_should_click_on_saved_jobs(){
		
		DashBoardPage dbp = new DashBoardPage(driver);		
		dbp.ClickingOnSavedJobsOption();
		System.out.println("Successfully Clicked on SavedJobs Option");
		
    }
    
    @And("^I will be redirected to the Saved Jobs page$")
    public void i_will_be_redirected_to_the_saved_jobs_page(){
    	
		DashBoardPage dbp = new DashBoardPage(driver);
		dbp.AbleToSeeSavedJobsTitle();
		System.out.println("Successfully Entered Into SavedJobsPage");
    	
    }
    
    @Then("^I should click on the desired job$")
    public void i_should_click_on_the_desired_job() throws InterruptedException{
        
    	DashBoardPage dbp = new DashBoardPage(driver);
    	dbp.ClikingOnSampleJobToSaveAndUnsave();
    	Thread.sleep(2000);
    	
    	JobDetailsPage jdp = new JobDetailsPage(driver);
		jdp.AbleToViewJobDetailsPage();
    	System.out.println("Suceessfully Entered into Job Details page");
		
    }
    
    @And("^I should click on Applied Jobs$")
    public void i_should_click_on_applied_jobs(){
		
		DashBoardPage dbp = new DashBoardPage(driver);
		dbp.ClickingOnAppliedJobsOption();
		System.out.println("Successfully Clicked on AppliedJobs Option");
    	
    }
    
    @And("^I will be redirected to the Applied Jobs page$")
    public void i_will_be_redirected_to_the_applied_jobs_page() {
    	
    	DashBoardPage dbp = new DashBoardPage(driver);
		dbp.AbleToSeeAppliedJobsTitle();
		System.out.println("Successfully Entered Into AppliedJobsPage");
    	
    }
    
    @And("^I should click on the star icon to save$")
    public void i_should_click_on_the_star_icon_to_save() throws InterruptedException{
    	
		JobDetailsPage jdp = new JobDetailsPage(driver);
		jdp.ClickingOnStartToSave();
		System.out.println("Successfully Clicked on StartOption");
		Thread.sleep(2000);
		jdp.ClickingOnCrossOptionDisplayed();
		Thread.sleep(2000);
		System.out.println("Successfully Clicked on CrossOption");
    	
    }
    
    @And("^I should click on the star icon to unsave$")
    public void i_should_click_on_the_star_icon_to_unsave() throws InterruptedException{
    	
		JobDetailsPage jdp = new JobDetailsPage(driver);
		jdp.ClickingOnStartToUnSave();
		System.out.println("Successfully Clicked on StartOption");
		Thread.sleep(2000);
		jdp.ClickingOnCrossOptionDisplayed();
		Thread.sleep(2000);
		System.out.println("Successfully Clicked on CrossOption");
    	
    }
    
    @Then("^I should click on the selected job in SavedJobs page to apply$")
    public void i_should_click_on_the_selected_job_in_savedjobs_page_to_apply() throws InterruptedException{
        
    	DashBoardPage dbp = new DashBoardPage(driver);
    	dbp.ClickingOnFirstJob();
    	Thread.sleep(2000);
    	
    	JobDetailsPage jdp = new JobDetailsPage(driver);
    	jdp.AbleToViewJobDetailsPage();
    	System.out.println("Suceessfully Entered into Job Details page");
	    
    }
    
    @And("^I should click on the Apply button$")
    public void i_should_click_on_the_apply_button(){
        
    	JobDetailsPage jdp = new JobDetailsPage(driver);
		jdp.ClickingOnApplyOption();
		System.out.println("Successfully Clicked on ApplyButton");
    	
    }

    @Then("^I should be able to see a Job Successful message$")
    public void i_should_be_able_to_see_a_job_successful_message(){
    	
    	HomePage hp = new HomePage(driver);
		hp.ClosingOfAdds();
		
		JobDetailsPage jdp = new JobDetailsPage(driver);
    	jdp.ClosingUplodOption();
    	System.out.println("Successfully Closed the UploadResume Option");
    	jdp.ConfirmingJobIsApplied();
    	System.out.println("Finally I Applied for a Job");
    	    	
    }

}
