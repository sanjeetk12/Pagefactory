package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pfPack.util.Constants;

public class LoginPage {
	

	WebDriver driver=null;
	@FindBy(xpath=("//*[@id='login_id']"))
	public WebElement Emailfield;
	
	@FindBy(xpath=("//*[@id='password']"))
	public WebElement password;
	
	@FindBy (xpath="//*[@id='nextbtn'][1]")
	public WebElement Next;
	

	@FindBy (xpath="//*[@id='nextbtn']")
	public WebElement SIGNIN;
   
	public LoginPage(WebDriver driver ) {
		
		this.driver=driver;
	}

	public boolean dologin() {
		
		Emailfield.sendKeys(Constants.Username);
		Next.click();
		password.sendKeys(Constants.Password);
		SIGNIN.click();
		
		HomePage homepage=new HomePage(driver);
		PageFactory.initElements(driver, homepage);

	boolean loginstatus=homepage.Dispalyhomepage();
	
	return loginstatus;
		}
	
	
}

