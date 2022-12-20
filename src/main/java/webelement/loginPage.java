package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestElement.TestBase;

public class loginPage extends TestBase{
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public loginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		submit.click();
	}
	
}
