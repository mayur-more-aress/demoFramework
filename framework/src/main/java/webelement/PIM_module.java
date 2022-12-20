package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PIM_module {
	WebDriver driver;
	public PIM_module(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(className = "oxd-main-menu-item active")
	WebElement PIM;
	
	@FindBy(className = "oxd-topbar-body-nav-tab-item")
	WebElement Employee_list;
	
	@FindBy(xpath = "//div[@class='oxd-form-row']//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//input")
	WebElement Employee_Name;
	
	@FindBy(xpath = "//*[@class='oxd-form-row']//div[1]//div[2]//div[1]//div[2]//input")
	WebElement Employee_ID;
	
	@FindBy(xpath = "//div[@class='oxd-layout-container']//div[2]//div[1]//div[1]/div[@class='oxd-table-filter-area']/form/div/div/div[3]/div/div[2]/div/div/div[@class='oxd-select-text-input']")
	WebElement Employee_Status;
	
	@FindBy(xpath = "//div[@class='oxd-layout-container']//div[2]//div[1]//div[1]/div[@class='oxd-table-filter-area']/form/div/div/div[4]/div/div[2]/div/div/div[@class='oxd-select-text-input']")
	WebElement Include;
	
	@FindBy(xpath = "//div[@class='oxd-layout-container']//div[2]//div[1]//div[1]/div[@class='oxd-table-filter-area']/form/div/div/div[5]/div[1]/div[2]/div/div/input")
	WebElement SupervisorName;
	
	@FindBy(xpath = "//div[@class='oxd-layout-container']//div[2]//div[1]//div[1]/div[@class='oxd-table-filter-area']/form/div/div/div[6]/div/div[2]/div/div/div[@class='oxd-select-text-input']")
	WebElement Job_Title;
	
	@FindBy(xpath = "//div[@class='oxd-layout-container']//div[2]//div[1]//div[1]/div[@class='oxd-table-filter-area']/form/div/div/div[7]/div/div[2]/div/div/div[@class='oxd-select-text-input']")
	WebElement SubUnit;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Search;

	public void GoToPIM() {
		PIM.click();
	}
	public void Emp_List() {
		Employee_list.click();
	}
	public void Emp_Name() {
		Employee_Name.sendKeys("Luke");
	}
	public void Emp_ID() {
		Employee_ID.sendKeys("0091");
	}
	public void Status() {
		Select sc = new Select(Employee_Status);
		sc.selectByVisibleText("Full-Time Probation");
	}
	public void IncludeStatus() {
		Select sel = new Select(Include);
		sel.selectByVisibleText("Past Employees Only");
	}
	public void Supervisor_Name() {
		SupervisorName.sendKeys("Dominic Chase");
	}
	public void Job() {
		Select sele = new Select(Job_Title);
		sele.selectByVisibleText("Head of Support");
	}
	public void Subunit() {
		Select select1 = new Select(SubUnit);
		select1.selectByVisibleText("Technical Support");
	}
	public void Click_on_Search() {
		Search.click();
	}
	
	
}
