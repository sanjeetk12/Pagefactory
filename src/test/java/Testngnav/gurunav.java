package Testngnav;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class gurunav {
	static String Actualtitle="Guru99 Bank Home Page";
	static WebDriver driver;
	@BeforeTest
	public static void urlsetup() {
		
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://www.demo.guru99.com/V4/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}
	
	@Test (priority=1)
	
public static void dologin()	{
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr295127");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UhehymU");		
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
	
	@Test
	public static void gettitle() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, gurunav.Actualtitle);
		
	}
	
	@Test
	
	public static void getcurrentURL() {
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertTrue(URL.contains("guru99"));
	}
	
	
	@AfterTest
		
	public static void closeurl() {
		driver.quit();
	}

}
