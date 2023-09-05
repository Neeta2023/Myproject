package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseclassRoicians;

public class PomcontactUs extends BaseclassRoicians {
	
	@FindBy(id="text-77525447616") WebElement firstname;
	@FindBy(id="text-95374915097") WebElement lastname;
	@FindBy(id="text-27022866830") WebElement email;
	@FindBy(id="field-tIgxvmTMez6ibt1") WebElement phone;
	@FindBy(id="field-kJfKGbPLNi5yFI7") WebElement msg;
	@FindBy (id="button-18782068913") WebElement send;
	
	public PomcontactUs() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterfname(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void enterlname(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void enteremail(String mailid) {
		email.sendKeys(mailid);
	}
	
	public void enterphone(String number) {
		phone.sendKeys(number);
	}
	
	public void entermsg(String message) {
		msg.sendKeys(message);
	}
	
	public void clicksend() {
		send.click();
	}
}
