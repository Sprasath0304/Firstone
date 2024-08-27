package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends Bassclass {

	public loginpage (WebDriver driver) {
		
		super(driver);
		
	}
	
	
	@FindBy (xpath ="//input[@id='input-email']") WebElement linkgmail;
	
	@FindBy(xpath ="//input[@id='input-password']") WebElement linkPassword;
	
	@FindBy (xpath =" //input[@value='Login']") WebElement linklogin;
	
	
	public void enteremail(String mail) {
		linkgmail.sendKeys(mail);
	}
	
	public void enterpassword (String psw ) {
		linkPassword.sendKeys(psw);
	}
	
	public void clicklogin() {
		linklogin.click();
	}
	
}
