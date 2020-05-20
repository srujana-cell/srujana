package com.AutomatePractice.Genirics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericUtils
{
	public static void getscreenshot(WebDriver driver,String name)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+name+".png");
		try
		{
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
		}
	}
}
