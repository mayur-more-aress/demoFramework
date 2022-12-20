package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webelement.PIM_module;

public class TestCases extends PIM_module {
	WebDriver driver;
	PIM_module pim;
	@BeforeSuite
	public void setProperty()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	@BeforeTest
	public void gotoPIM() {
		pim.GoToPIM();
	}
	@BeforeClass
	public void switchToEmpList() {
		pim.Emp_List();
	}
	@BeforeMethod
	public void addInformation() {
		pim.Emp_Name();
		pim.Emp_ID();
	}
	@Test
	public void addStatus() {
		pim.Status();
		pim.IncludeStatus();
		pim.Supervisor_Name();
		pim.Job();
		pim.Subunit();
		
	}
	@AfterMethod
	public void clickOnSearch() {
		pim.Click_on_Search();
	}

}

