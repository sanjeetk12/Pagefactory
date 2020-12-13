package TestN;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	@BeforeTest()
	
	public void browser() {
		
		System.out.println("Chrome browser launched");
	}
	
	@BeforeMethod
	public void browserutils()
	{
		System.out.println("Before method reusable methods launched");
	}
	
	@Test
	public void URL()
	{
		System.out.println(" automationpractice.com URL launched");
	}
	
	@Test
	public void Launchpage()
	{
		System.out.println(" launch page opened");
	}
	
	@Test
	public void Signin()
	{
		System.out.println(" Click signin button");
	}
	
	@AfterMethod()
public void Webutils() {
		
	System.out.println("After method webutils page opened");
	}
	}
	

