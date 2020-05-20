package com.AutomatePractice.Genirics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Health.Pages.BasePage;

public class LoginPage extends BasePage 
{
	public static WebDriver driver;
	private static final String title = null;
	private static final String un = null;
	private static final WebElement element = null;
	@FindBy(id = "header")
	private WebElement header;
	@FindBy(id = "footer")
	private WebElement footer;
	@FindBy(xpath = "//h4[contains(text(),'Newsletter')]")
	private WebElement newsLtr;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement unTB;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement lgBT;
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement womenTitle;
	@FindBy(xpath="//a[contains(text(),'Dresses')]")
	private WebElement Dresses;
	@FindBy(xpath="//a[contains(text(),'Summer Dresses')]")
	private WebElement summerDresses;
	@FindBy(xpath="//label[contains(text(),'Sort by')]")
	private WebElement sortBy;
	@FindBy(xpath = "//span[@style='width: 148px; user-select: none;']")
	private WebElement sotingFilter;
	@FindBy(xpath = "//select[@id='selectProductSort']")
	private WebElement filterDropdown;
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	private WebElement clickonCart;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void EnterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void ClickOnLogin()
	{
		lgBT.click();
	}
	public void ClickOnWomenTitle()
	{
		womenTitle.click();
	}
	public void ClickOnWomenDresses()
	{
		Dresses.click();
	}
	public void ClickOnWomensummerDresses()
	{
		summerDresses.click();
	}
	public void ClickOnfilterDropdown()
	{
		filterDropdown.click();
	}
	public void ClickOnCart()
	{
		clickonCart.click();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		
		LoginPage lp = new LoginPage(driver);
		lp.getTitle(title);
		lp.VerifyElement(element);
		lp.EnterUserName(un);
		lp.ClickOnLogin();
		lp.ClickOnWomenTitle();
		lp.ClickOnWomenDresses();
		lp.ClickOnWomensummerDresses();
		lp.ClickOnfilterDropdown();
		lp.ClickOnCart();
		
		WebElement dropdownlist = driver.findElement(By.id("selectProductSort"));
		Thread.sleep(2000);
		Select sel = new Select(dropdownlist);
		Thread.sleep(2000);
		sel.selectByValue("price:asc");
		Thread.sleep(2000);
		sel.selectByValue("price:desc");
		Thread.sleep(2000);
		sel.selectByValue("name:asc");
		Thread.sleep(2000);
		sel.selectByValue("name:desc");
		
		String xp1 = "//a[text()='Proceed to checkout']//child::span//child::i[@class='icon-chevron-right right __web-inspector-hide-shortcut__']";
		driver.findElement(By.xpath(xp1)).click();
		String xp2 = "//a[text()='Proceed to checkout']//child::span//child::i[@class='icon-chevron-right right']";
		driver.findElement(By.xpath(xp2)).click();
		String xp3 = "//div[@class='form-group form-error']//child::label[text(),'Email address']//child::input[@type='text']";
		driver.findElement(By.xpath(xp3)).sendKeys("srujana.khagga@gmail.com").ENTER;
		String xp4 = "//button[@type='submit']//child::span//child::i[@class='icon-user left']";
		driver.findElement(By.xpath(xp4)).click();
	}
}

