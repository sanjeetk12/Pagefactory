package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pfPack.util.Constants;



public class LaunchPage {
	WebDriver driver=null;
	@FindBy(xpath="//a[@class='zh-customers']")
	public WebElement Customers;
	
	@FindBy(xpath="//a[@class='zh-support']")
	public WebElement Support;
	
	@FindBy(xpath="//a[@class='zh-contact']")
	public WebElement ContactSales;
	
	@FindBy(xpath="//a[@class='zh-login']")
	public WebElement Login;
	
	
	public LaunchPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
public boolean gotologinpage() {
		
		driver.get(Constants.AppURL);
		Login.click();
		LoginPage login = new LoginPage(driver);
		PageFactory.initElements(driver, login);
		boolean loginstatus=login.dologin();
		return loginstatus;
	}
}
