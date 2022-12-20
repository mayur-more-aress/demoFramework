package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	public loginPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='username']")
	WebElement unm;
	@FindBy(xpath = "//input[@name='password']")
	WebElement pw;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	public void uname() {
		unm.sendKeys("Admin");
	}
	public void pwd() {
		pw.sendKeys("admin123");
	}
	public void signin() {
		login.click();
	}
}
