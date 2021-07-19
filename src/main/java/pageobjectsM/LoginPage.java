package pageobjectsM;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="signInName")
	WebElement emailidfield;
	
	@FindBy(id="password")
	WebElement passwordfield;
	
	@FindBy(id="signInbtn")
	WebElement loginbutton;
		
	public void enteremailid(String emailaddress){
		
		emailidfield.sendKeys(emailaddress);
		
	}
	
	public void enterpassword(String password){
		
		passwordfield.sendKeys(password);
		
	}

	public void ClickloginbuttonAfterProvidingDetails(){
		
		loginbutton.click();
	
	}
		
}
