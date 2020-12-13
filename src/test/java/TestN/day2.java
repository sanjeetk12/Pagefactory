package TestN;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2 {
	
	@BeforeClass
	public void Click()
	{
		
		System.out.println("Befor class method displayed");	
	}
	@AfterClass
	public void Signout()
	{
		
		System.out.println("After class method displayed");	
	}
	
	@BeforeGroups(groups="Smoke")
	public void Registration() {
		System.out.println(" Registration page opened");
		
	}
	@Test
	public void succefullyreg()
	
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		Assert.fail();
	
		System.out.println(" Registration succefully message opened");
	}
	
	@Test
	
	public void hompage() {
		System.out.println(" Home page displayed");
	}
	
	
	@AfterTest
	public void close() {
		System.out.println("Browser closed");
		
	}
	}

