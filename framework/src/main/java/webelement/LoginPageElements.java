
	package webelement;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPageElements extends InitialStep {
	
	 WebDriver driver;
	 
     @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]")
	 WebElement sel;

	 @FindBy(xpath = "//input[@name='username']")
	 WebElement username;

	 @FindBy(xpath = "//input[@name='password']")
	 WebElement password;

	 @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	 WebElement login;

	 @FindBy(xpath="//span[text()='Admin']")
     WebElement admin;
	 
	 @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
     WebElement systemusers;

	  @FindBy(className = "oxd-select-text-input")
	  WebElement selectdropdown;
	   
	  @FindBy(xpath ="(//div[text()='ESS'])[1]")
	  WebElement selectESS;
	  
	  @FindBy(xpath = "(//div[text()='Admin'])[1]")
		 WebElement selectAdmin;
	  
	 
	 
	 public LoginPageElements(WebDriver d) {
		 driver=d;
		 PageFactory.initElements(d, this);
	}


	 public void usernameValue(String uname)
	 {
		 username.sendKeys(uname);
	 }
	 
	 public void passwordValue(String pass)
	 {
		 password.sendKeys(pass);
	 }
	 public void loginFun()
	 {
		 login.click();
	 }
	 public void adminClick(){
		  admin.click();
	 }
	 public void systemUserSet(String ename) {
		 systemusers.sendKeys(ename);
	 }
	 public void selectDropDown() {
		 selectdropdown.click();
	 }
	 public void adminDropdown(){
		 selectAdmin.click();
	 }
	public void select(){
		 
		 WebElement we=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
		we.click();
		  
	}}
	 
		
	

