import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void methodOne(){
		
		/*User should be able to Sign into his/her Account
		Completed
		FirstOne*/
		boolean bol1 = driver.findElement(By.xpath("//p[@class='bold break-word lh-16 capitalize']")).isDisplayed();
        System.out.println(bol1);
        		
		System.out.println("Successfully LoggedIn");
		
	}//Done
	
	/*@Test(priority=5)
	public void methodTwo(){
		
		//Applying for the desired job as a Registered User
		driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Work from Home']")).click();
		boolean bol2 = driver.findElement(By.xpath("//h1[@class='fs-24 srp-seo-data capitalize ib normal']")).isDisplayed();
        System.out.println(bol2);
        
        //driver.findElement(By.xpath("//a[@title='Opening for Drupal Engineer, Mumbai']")).click();
        
        driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
        driver.findElement(By.linkText("APPLY")).click();
        driver.findElement(By.xpath("//div[@class='global-modal custom-v-scroll slideModal']//i[@class='icon-cross']")).click();
        
		boolean bol3 = driver.findElement(By.linkText("You have successfully submitted your application for")).isDisplayed();
        System.out.println(bol3);
        
        System.out.println("Successfully Applied for the Jobs");
        
	}*/
	
	@Test(priority=4)
	public void methodThree() throws InterruptedException{
		
		/*Registered User should be able to View the Job Description and Contact details 
		Completed
		FourthOne*/
		driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		
		driver.findElement(By.xpath("//ul[@id='logged']//li[2]//a[1]//span[1]")).click();
		boolean bool1 = driver.findElement(By.xpath("//div[@class='col-md-12']//h1[@class='main-heading mt20']")).isDisplayed();
		System.out.println(bool1);
		
		driver.findElement(By.xpath("//li[@data-tab='saved']//span[@class='fl']")).click();
		boolean bool2 = driver.findElement(By.xpath("//h3[@class='color-black medium fs-18 mt10']")).isDisplayed();
		System.out.println(bool2);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[normalize-space()='Tech. Lead. - Java']")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
        
	}
	
	@Test(priority=2)
	public void methodFour(){
		
		/*User should be able to view the Applied jobs
		Completed
		SecondOne*/
		driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		
		driver.findElement(By.xpath("//ul[@id='logged']//li[2]//a[1]//span[1]")).click();
		boolean bool1 = driver.findElement(By.xpath("//div[@class='col-md-12']//h1[@class='main-heading mt20']")).isDisplayed();
		System.out.println(bool1);
		
		driver.findElement(By.xpath("//li[@data-tab='applied']//span[@class='fl']")).click();
		boolean bool2 = driver.findElement(By.xpath("//h3[@class='color-black medium fs-18 mt10']")).isDisplayed();
		System.out.println(bool2);
						
	}//Done
	
	@Test(priority=3)
	public void methodFive(){
		
		/*User should be able to view the Saved jobs
		Completed
		ThirdOne*/
		driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		
		driver.findElement(By.xpath("//ul[@id='logged']//li[2]//a[1]//span[1]")).click();
		boolean bool1 = driver.findElement(By.xpath("//div[@class='col-md-12']//h1[@class='main-heading mt20']")).isDisplayed();
		System.out.println(bool1);
		
		driver.findElement(By.xpath("//li[@data-tab='saved']//span[@class='fl']")).click();
		boolean bool2 = driver.findElement(By.xpath("//h3[@class='color-black medium fs-18 mt10']")).isDisplayed();
		System.out.println(bool2);
				
	}//Done
	
	@Test(priority=5)
	public void methodSeven() throws InterruptedException{
			
		/*User should be able to Save the job
		Completed
		FifthOne*/
		//driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		
		driver.findElement(By.xpath("//ul[@id='logged']//li[2]//a[1]//span[1]")).click();
		boolean bool1 = driver.findElement(By.xpath("//div[@class='col-md-12']//h1[@class='main-heading mt20']")).isDisplayed();
		System.out.println(bool1);
		
		driver.findElement(By.xpath("//li[@data-tab='applied']//span[@class='fl']")).click();
		boolean bool2 = driver.findElement(By.xpath("//h3[@class='color-black medium fs-18 mt10']")).isDisplayed();
		System.out.println(bool2);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[normalize-space()='Sr. .NET Developer']")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		boolean bool3 = driver.findElement(By.xpath("//div[@class='main-heading mt15 mb5 nowrap']")).isDisplayed();
		System.out.println(bool3);	
		driver.findElement(By.xpath("//span[@class='star pr mt5 fr']//i[@class='mqfi-star-empty']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='full notification-content theme-success']//i[@class='mqfi-cross']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@Test(priority=6)
	public void methodEight() throws InterruptedException{
			
		/*User should be able to UnSave the job
		Completed
		SixthOne*/
		//driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		
		driver.findElement(By.xpath("//ul[@id='logged']//li[2]//a[1]//span[1]")).click();
		boolean bool1 = driver.findElement(By.xpath("//div[@class='col-md-12']//h1[@class='main-heading mt20']")).isDisplayed();
		System.out.println(bool1);
		
		driver.findElement(By.xpath("//li[@data-tab='saved']//span[@class='fl']")).click();
		boolean bool2 = driver.findElement(By.xpath("//h3[@class='color-black medium fs-18 mt10']")).isDisplayed();
		System.out.println(bool2);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[normalize-space()='Sr. .NET Developer']")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		boolean bool3 = driver.findElement(By.xpath("//div[@class='main-heading mt15 mb5 nowrap']")).isDisplayed();
		System.out.println(bool3);	
		driver.findElement(By.xpath("//span[@class='star pr mt5 fr']//i[@class='mqfi-star-empty']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='full notification-content theme-success']//i[@class='mqfi-cross']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@Test(priority=7)
	public void methodSixth(){
		
		/*Registered User should be able to Apply for a job
		Completed 
		SeventhOne*/
		driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		
		driver.findElement(By.xpath("//ul[@id='logged']//li[2]//a[1]//span[1]")).click();
		boolean bool1 = driver.findElement(By.xpath("//div[@class='col-md-12']//h1[@class='main-heading mt20']")).isDisplayed();
		System.out.println(bool1);
		
		driver.findElement(By.xpath("//li[@data-tab='saved']//span[@class='fl']")).click();
		boolean bool2 = driver.findElement(By.xpath("//h3[@class='color-black medium fs-18 mt10']")).isDisplayed();
		System.out.println(bool2);
		
		driver.findElement(By.xpath("//h3[normalize-space()='Tech. Lead. - Java']")).click();
		driver.findElement(By.linkText("APPLY"));
		
		driver.findElement(By.xpath("//div[@class='global-modal custom-v-scroll slideModal']//i[@class='icon-cross']")).click();
		boolean bol3 = driver.findElement(By.linkText("You have successfully submitted your application for")).isDisplayed();
        System.out.println(bol3);
        
        System.out.println("Successfully Applied for the Jobs");
        
				
	}
	
	@AfterMethod
	public void testClose() {
		
		driver.quit();
		
	}
	
	@BeforeMethod
	public void setUp(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.monsterindia.com/");
		
		driver.findElement(By.xpath("//p/button[normalize-space()='×']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://www.monsterindia.com/rio/login/seeker?return_url=%2F%3FimportProfile%3Dcheck']")).click();	
		driver.findElement(By.id("signInName")).sendKeys("slvs5921@gmail.com");
		driver.findElement(By.id("password")).sendKeys("!1A2s3d4f5g");
		driver.findElement(By.id("signInbtn")).click();
			
	}
		
}
