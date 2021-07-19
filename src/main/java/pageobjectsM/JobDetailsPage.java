package pageobjectsM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class JobDetailsPage{
	
	WebDriver driver;
	public JobDetailsPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='main-heading mt15 mb5 nowrap']")
	WebElement JobDetails;
	
	@FindBy(xpath="//span[@class='star pr mt5 fr']//i[@class='mqfi-star-empty']")
	WebElement StarOptionTosave;
	
	@FindBy(xpath="//span[@class='star pr mt5 fr']//i[@class='star-active mqfi-star-v2']")
	WebElement StarOptionToUnsave;
	
	@FindBy(xpath="//div[@class='full notification-content theme-success']//i[@class='mqfi-cross']")
	WebElement ClickingOnCross;
	
	@FindBy(xpath="//div[@class='apply-footer-action fr mt10']//div[@class='fr']//div//button[@type='button'][normalize-space()='APPLY']")
	WebElement ClickOnApplyOption;
	
	@FindBy(xpath="//div[@class='global-modal custom-v-scroll slideModal']//i[@class='icon-cross']")
	WebElement ClosingTheUploadResumeOption;
	
	@FindBy(className="color-blue-d lh22 medium")
	WebElement ConfirmingTheJobApplied;	
	
	public void ClickingOnStartToSave() {
		
		StarOptionTosave.click();
			
	}
	
	public void ClickingOnStartToUnSave() {
		
		StarOptionToUnsave.click();
			
	}
	
	public void ClickingOnCrossOptionDisplayed() {
		
		ClickingOnCross.click();
			
	}
	
	public void ClickingOnApplyOption() {
		
		ClickOnApplyOption.click();
			
	}
	
	public void ConfirmingJobIsApplied() {
		
		Assert.assertTrue(ConfirmingTheJobApplied.isDisplayed());
			
	}
	
	public void ClosingUplodOption() {
		
		ClosingTheUploadResumeOption.click();
			
	}
	
	public void AbleToViewJobDetailsPage() throws InterruptedException{
		
		System.out.println(driver.getCurrentUrl());
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		Assert.assertTrue(JobDetails.isDisplayed());
		
	}
	
}