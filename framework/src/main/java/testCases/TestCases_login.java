package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webelement.loginPage;

public class TestCases_login extends loginPage {
	WebDriver driver;
	loginPage lg = new loginPage();
	@BeforeClass
	public void setProp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void hitURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	public void action() {
		lg.uname();
		lg.pwd();
		lg.signin();
	}
		
}
