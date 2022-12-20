package webelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestElement.TestBase;

public class RecruitmentPage extends TestBase
{
	@FindBy(xpath="//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")
	WebElement recruitment;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div")
	WebElement JobTitle;
	
	@FindBy(className="oxd-autocomplete-text-input oxd-autocomplete-text-input--active")
	WebElement candidateName;
	
	@FindBy(xpath="//input[@placeholder='Enter comma seperated words...']")
	WebElement keywords;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
	
	@FindBy(xpath="//button[@type='reset']")
	WebElement reset;
}

public void recruitmentpage()
{
	recruitment.click();
}
