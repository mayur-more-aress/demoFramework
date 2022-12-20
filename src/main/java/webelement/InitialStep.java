package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialStep {
	
	static WebDriver driver;
	static public void first() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
	}
	public static void main(String[] args) throws InterruptedException {
		first();	
	    LoginPageElements ob =new LoginPageElements(driver);
		ob.usernameValue("Admin");
		ob.passwordValue("admin123");
		ob.loginFun();
		ob.adminClick();
		ob.systemUserSet("Kaiwalya");
		ob.selectDropDown();
		ob.adminDropdown();
		ob.select();
		
		
		
	}
	
	
	

}
