package pfProject.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pfPack.pages.LaunchPage;
import pfPack.util.Constants;
import pfProject.tests.base.Base;
@Test
public class Logintest extends Base{
	

	public void testlogin()
	{
		openBrowser(Constants.BrowserType);
		LaunchPage launch=new LaunchPage(driver);
		
		PageFactory.initElements(driver, launch);
		boolean launchnew=launch.gotologinpage();
		System.out.print(launchnew);
		System.out.println("test");
	}
	
}
