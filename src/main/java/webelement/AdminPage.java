package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	WebDriver driver;
	@FindBy(name ="username")
	WebElement userName;
	
	@FindBy(name ="password")
	WebElement passWord;
	
	@FindBy(css ="button[type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminModule;

	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement systemUser;
	
	@FindBy(css = "input[placeholder='Type for hints...']")
	WebElement empName;
	
	@FindBy(css = "button[type='submit']")
	WebElement searchButton;
}
