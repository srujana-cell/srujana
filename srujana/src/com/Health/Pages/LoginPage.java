package com.Health.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage 
{
	public WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Sign Up')]")
	private WebElement SignUpBTN;
	@FindBy(id = "firstname")
	private WebElement fnTB;
	@FindBy(name = "lastname")
	private WebElement lnTB;
	@FindBy(id = "email")
	private WebElement emailTB;
	@FindBy(name = "password")
	private WebElement pwdTB;
	@FindBy(xpath="(//input[@class='cmfw'])")
	private WebElement PracticenameTB;
	WebElement menu = driver.findElement(By.id("x_speciality"));
	Select sel = new Select(menu);
	Thread.sleep(2000);
	//sel.selectByIndex(10);
	sel.selectByValue("Family Practice");
	@FindBy(xpath = "//input[contains[@name='x_mobile']")
	private WebElement SignInBTN;
}
