package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestElement.TestBase;
import webelement.RecruitmentPage;
import webelement.loginPage;

public class RecruitmentPageTest extends TestBase {
	
	RecruitmentPage rt;
	loginPage lp;
	
	public RecruitmentPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void recruitment()
	{
		init();
		rt = new RecruitmentPage();
	}

	@Test
	public void recruitmentTest()
	{
		lp.login();
		rt.recruitmentpage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
