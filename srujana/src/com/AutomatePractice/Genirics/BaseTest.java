package com.AutomatePractice.Genirics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Health.Generic.GenericUtils;

public class BaseTest implements Autoconstants
{

	static 
	{
		System.setProperty(Chrome_key, Chrome_value);
		System.setProperty(firefox_key, firefox_value);
		System.setProperty(ie_key, ie_value);
	}
	public WebDriver driver;
	
	@BeforeMethod
	public void Precondition()
	{
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
	}
	
	@AfterMethod
	public void Postcondition(ITestResult res) 
	{
		int status = res.getStatus();
		if (status == 2)
		{
			String name = res.getMethod().getMethodName();
			GenericUtils.getScreenshot(driver,name);
		}
		driver.close();
		
	}
}
