package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver=null;
	@FindBy (linkText="Calendar")
	public WebElement Calendar;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
		public boolean Dispalyhomepage()
		{
			boolean calendar=Calendar.isDisplayed();
			if(calendar)
			{
				return true;
			}
	      
			else
				
			{
				return false;
			}
			}

		
	}
