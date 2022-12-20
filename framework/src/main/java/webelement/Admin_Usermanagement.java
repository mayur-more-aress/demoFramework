package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Usermanagement {
    WebDriver driver;
	public Admin_Usermanagement() {
	   PageFactory.initElements(driver,this);
   }
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
	WebElement admin;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")
	WebElement UserManagement;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link']")
	WebElement user;
	
	@FindBy(className="oxd-input oxd-input--active")
	WebElement username;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")
	WebElement UserRole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']") 
	WebElement EmployeeName;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div") 
	WebElement selectstatus;
}
