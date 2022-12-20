package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;


	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy (className ="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
	WebElement submit;
	
	@FindBy(xpath="//div[@class='orangehrm-login-forgot']")
	WebElement forgottpassword;
	
	
	
	public loginPage(WebDriver d){
		  driver= d;
		  PageFactory.initElements(d, this);
		 
	}
	
	
	public void username(String uname) {
		username.sendKeys(uname);
	}
	
	
	public void password(String pass) {
		password.sendKeys(pass);
	}
	
	public void submit(){
		submit.click();
	}
}
