package Testngnav;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class amazon {
	String Actualtxt="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	WebDriver driver;
	
	@BeforeTest
	public void urlsetup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority =1)
	public void urltitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, Actualtxt);
	}
	
	@Test(priority =2)
	public void urltest()
	{
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertTrue(URL.contains("amazon"));
	}
	@AfterTest
	
	public void urlclose()
	{
		driver.close();
	
	
}
}

