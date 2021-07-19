package pageobjectsM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@href='https://www.monsterindia.com/rio/login/seeker?return_url=%2F%3FimportProfile%3Dcheck']")
	WebElement LoginButton;
	
	@FindBy(xpath="//p[@class='bold break-word lh-16 capitalize']")
	WebElement profilename;
	
	@FindBy(xpath="//ul[@id='logged']//li[2]//a[1]//span[1]")
	WebElement ClickingDashboard;
	
	@FindBy(xpath="//p/button[normalize-space()='×']")
	WebElement ClosingAdds;
	
	public void ClickingOnLoginButton() {
		
		LoginButton.click();
		
	}
	
	public void ProfileNameWillBeDisplayed(){
		
		Assert.assertTrue(profilename.isDisplayed());
		
	}
	
	public void ClosingOfAdds() {
		try {
			
			ClosingAdds.click();
		
		}catch(Exception e) {
		
			System.out.println("NO adds to close");
		
		}
		
	}
	
	public void ClickingOnDashboard() {
		
		ClickingDashboard.click();
		
	}
	
}
