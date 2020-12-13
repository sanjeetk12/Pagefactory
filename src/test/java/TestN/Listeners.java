package TestN;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listeners implements ITestListener {
	WebDriver driver;
	// When Test case get passed, this method is called.		
    @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :"+Result.getName());					
    }		
    
    @Override	
    public void onTestFailure(ITestResult Result)
    {
    	System.out.println("The name of the testcase failed is :"+Result.getName());
    	
    	if(ITestResult.FAILURE==Result.getStatus())
    	{
    	try 
    	{
    	// Create refernce of TakesScreenshot
    	 TakesScreenshot ts =(TakesScreenshot)driver;
    	 
    	// Call method to capture screenshot
    	File source=ts.getScreenshotAs(OutputType.FILE);
    	 
    	// Copy files to specific location here it will save all screenshot in our project home directory and
    	// result.getName() will return name of test case so that screenshot name will be same
    	FileUtils.copyFile(source, new File("./screenshots/"+Result.getName()+".png"));
    	 
    	System.out.println("Screenshot taken");
    	} 
    	catch (Exception e)
    	{
    	 
    	System.out.println("Exception while taking screenshot "+e.getMessage());
    	} 
    }
    }
}

