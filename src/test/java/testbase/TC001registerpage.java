package testbase;
import org.testng.annotations.Test;
import org.testng.Assert;
import pageobject.Homeclass;
import pageobject.pageregister;

public class TC001registerpage extends basepage {


@Test(groups= {"master","sanity"})
public void verifyaccount_register() {
	// Home page 
	
			logger.info("*** Starting TC001_ Account Registration ***");
			logger.debug("This is a debug log Message");
			try {
				
			
			Homeclass hp =new Homeclass(driver);
			hp.Clickacount();
			
			logger.info("Clicked on the account link");
			hp.Clickregister();
			
			logger.info("Clicked on the registeration link");
			// Account register page
			
			pageregister aa =new pageregister(driver);
			
			logger.info("Providing customer details");
			
			aa.Clickfname(randomString().toUpperCase());
			aa.Clicklname(randomString().toUpperCase());
			aa.Clickemail(randomString()+"@gmail.com");
			aa.Clicknumber(randomnumber());
			
			String password =randomalphabeticnumeric(); 
			
			aa.Clickpassword(password);
			aa.Clickconfirmpassword(password);
			aa.Clickagree();
			aa.clickcontinue();
			
			logger.info("validating Expected message..");
			
			String  conform = aa.getConfirmationMsg();
			Assert.assertEquals(conform,"Your Account Has Been Created!");
			logger.info("Test passed");
			}
			catch(Exception e) {
				logger.error("Test failed:"+ e.getMessage());
				Assert.fail("Test failed:"+e.getMessage());
			}
			finally {
				logger.info(" Finished TC001 Account registration test");
			}
			
			}
			
	}
