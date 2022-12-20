package webelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage {
	
	@FindBy(xpath = "//a[contains(text(),'Apply')]")
	WebElement applyTabButton;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement leaveTypeDropdownArrow;
	
	@FindBy(xpath = "//div[contains(text(),'CAN - Bereavement')]")
	WebElement selectCANBereavement;
	
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement commentBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;
	
	
	public void applyBut() {
		applyTabButton.click();
	}
	
	public void leaveTypeDropDown() {
		leaveTypeDropdownArrow.click();
	}
	
	public void leaveTypeCANBereavement() {
		selectCANBereavement.click();
	}
	
	public void comment(String commentText) {
		commentBox.sendKeys(commentText);
	}
	
	public void submitLeave() {
		submitButton.click();
	}

}
