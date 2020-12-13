package pfPack.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class actlog {
	private static Logger log =LogManager.getLogger(actlog.class.getName());
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		  // BasicConfigurator.configure();  
	   log.debug("Setting chrome driver property");
	   WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	   log.info("Window Maximized");
	   log.debug("Now hitting Amazon server");
	driver.get("https://www.amazon.com/");
	   log.info("Landed on amazon home page");
}
}