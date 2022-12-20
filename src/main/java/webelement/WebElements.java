package webelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebElements 
{
	
	@FindBy(xpath = "//input[@name='username']")
	 WebElement username;

	 @FindBy(xpath = "//input[@name='password']")
	 WebElement password;

	 @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	 WebElement login;

	 @FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
    WebElement admin;
	 
	 @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement systemusers;
	 
	 @FindBy(className = "oxd-main-menu-item active")
	 WebElement leavebtn;

	 @FindBy(xpath ="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
	 WebElement fromDate;
	 
	 @FindBy(xpath="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
	 WebElement toDate;
	 
	 @FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	 WebElement leaveStatus;
	 
	 @FindBy(xpath ="oxd-icon bi-caret-down-fill oxd-select-text--arrow")
	 WebElement leaveType;
	 
	 @FindBy(className = "oxd-autocomplete-text-input oxd-autocomplete-text-input--active")
	 WebElement empName;
	 
	 @FindBy(className ="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	 WebElement subUnit;
	 
	 @FindBy(xpath="(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
	 WebElement includePastEmp;
	 
	 @FindBy(xpath="//button[@type = 'submit']")
	 WebElement searchbtn;
	 
	 
}
