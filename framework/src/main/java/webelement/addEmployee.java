package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;

public class addEmployee {
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;
	
	
	@FindBy(xpath="//input[@name='middleName']")
	WebElement middlename;
	
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active'][1]")
	WebElement eid;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement savebutton;
	
	@FindBy(xpath="//button[@class='oxd-icon-button employee-image-action']")
	WebElement image;
	
	
	addEmployee(WebDriver d){
		  driver= d;
		  PageFactory.initElements(d, this);
		 
	}
	public void firstname(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void add() {
		String pull = "testdemo";
	}
	public void middlename(String mname) {
		middlename.sendKeys(mname);
	}
	
	public void lastname(String lname) {
		lastname.sendKeys(lname);
	}
}
