package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Recruitment 
{
	WebDriver driver;
	
	@FindBy(xpath="*//div[@class='oxd-sidepanel-body']//ul//li[5]")
	WebElement Recruitment;
	
	@FindBy(xpath ="//li[1]//a[@class='oxd-topbar-body-nav-tab-item']")
	WebElement Candidate;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div")
	WebElement JobTitle;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")
	WebElement Vacancy;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
	WebElement HiringManager;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
	WebElement Status;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div")
	WebElement CandidateName;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement Keywords;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/input")
	WebElement Fromdate;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[4]/div/div[2]/div/div/input")
	WebElement Todate;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/div/div/div/div[2]/div/div/div[1]")
	WebElement ApplicationMethod;
		
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement Search;
	
	Recruitment (WebDriver a)
	{
		driver = a;
		PageFactory.initElements(a, this);
	}
	
	public void clickRecruitment()
	{
		Recruitment.click();
	}
	
	public void clickCandidate()
	{
		Candidate.click();
	}
	
	public void selectJobtitle()
	{
		JobTitle.click();
		Select c=new Select(JobTitle);
		c.selectByVisibleText("QA Lead");
	}
	
	public void selectVacancy()
	{
		Vacancy.click();
		Select x=new Select(Vacancy);
		x.selectByVisibleText("Senior QA Lead");
	}
	
	public void selectHiringManager()
	{
		HiringManager.click();
		Select y=new Select(HiringManager);
		y.selectByVisibleText("Odis Adalwin");
	}
	
	public void selectStatus()
	{
		Status.click();
		Select b=new Select(Status);
		b.selectByVisibleText("Shortlisted");
	}
	
	public void Keywords()
	{
		Keywords.sendKeys("QA Lead Engineer");
	}
	
	public void Fromdate()
	{
		Fromdate.sendKeys("2022-07-05");
	}
	
	public void Todate()
	{
		Todate.sendKeys("2022-12-30");
	}
	
	public void selectApplicationMethod()
	{
		ApplicationMethod.click();
		Select d=new Select(ApplicationMethod);
		d.selectByVisibleText("Online");
	}
	
	public void clickSearch()
	{
		Search.click();
	}
	
}

