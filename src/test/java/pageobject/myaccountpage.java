package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myaccountpage extends Bassclass{
	
	public myaccountpage (WebDriver driver){
		
		super(driver);
	}
	
	@FindBy(xpath = "//h2[normalize-space()='My Account']") WebElement linkmessage; 
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement logout;

	
	public boolean displaymyaccountmessage() {//driver.findElement(By.xpath("//h2[normalize-space()='My Account']"))
		
		try {
			return(linkmessage.isDisplayed());
		}
		catch(Exception  e){
			return false;
		}
	}
	
	public void Clicklogout() {
		
		logout.click();
	}
}
