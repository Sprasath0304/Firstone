package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homeclass extends Bassclass {

	public Homeclass(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement inkmyaccount; 	


@FindBy(xpath ="//a[normalize-space()='Register']")WebElement inkRegister;


@FindBy(xpath ="//a[normalize-space()='Login']") WebElement inklogin;

public void Clickacount() {
	inkmyaccount.click();
}

public void Clickregister() {
	inkRegister.click();
	
	}

public void clicklogin() {
	inklogin.click();
}
}
