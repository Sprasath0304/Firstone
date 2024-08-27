package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageregister extends Bassclass{
	
	public pageregister(WebDriver driver) {
		
		super(driver);
		
	}
	
@FindBy (xpath ="//input[@id='input-firstname']") WebElement First_name;
	
	@FindBy (xpath ="//input[@id='input-lastname']") WebElement last_name;
	
	@FindBy (xpath ="//input[@id='input-email']") WebElement email;
	
	@FindBy (xpath ="//input[@id='input-telephone']") WebElement telephone;
	
	@FindBy (xpath= "//input[@id='input-password']")WebElement password;
	
	@FindBy (xpath="//input[@id='input-confirm']")WebElement confirmpassword;
	
	@FindBy (xpath ="//input[@name='agree']") WebElement agree;
	
	@FindBy(xpath ="//input[@value='Continue']")WebElement Continue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	
	public void Clickfname(String fname) {
		
		First_name.sendKeys(fname);
	}
	
	public void Clicklname(String lname) {
		
		last_name.sendKeys(lname);
	}
	
	public void Clickemail(String Email) {
		
		email.sendKeys(Email);
	}
	
	public void Clicknumber(String num) {
		telephone.sendKeys(num);
	}
	
	public void Clickpassword(String Pwd) {
		password.sendKeys(Pwd);
	}
	
	public void Clickconfirmpassword(String pwd) {
		confirmpassword.sendKeys(pwd);
	}
	public void Clickagree() {
	
		agree.click();
	}
	public void clickcontinue() {
		
		Continue.click();
	}
	
	//sol2 
		//btnContinue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
					
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnContinue);
		
		//Sol 5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//Sol6  
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		
	

public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());

		}
	}

	}


