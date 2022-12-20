package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(className="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
	WebElement submit;
	
	public void setUserName() {
		user.sendKeys("Admin");
	}
	public void setPassword() {
		pwd.sendKeys("admin@123");
	}
	public void submit() {
		submit.click();
	}
}

