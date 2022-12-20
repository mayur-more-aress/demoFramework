package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestElement.TestBase;
import webelement.loginPage;

public class LoginPageTest extends TestBase
{
	loginPage lp;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		init();
		lp = new loginPage();
	}
	
	@Test
	public void loginTest()
	{
		lp.login();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
