package testbase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Homeclass;
import pageobject.loginpage;
import pageobject.myaccountpage;
import untilize.DataProviders;

/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class TC003loginddt extends basepage{
@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
public void Verify_loginddt(String mail, String pwd,String exp) {
	
	
	try {
		logger.info("**** Starting TC_003_LoginDDT *****");
	Homeclass hc = new Homeclass(driver);
	
	hc.Clickacount();
	hc.clicklogin();
	
	loginpage lp =new loginpage(driver);
	
	lp.enteremail(mail);
	
	lp.enterpassword(pwd);
	
	lp.clicklogin();
	
	
	myaccountpage map = new myaccountpage(driver);
	
	 boolean message =  map.displaymyaccountmessage();
	 
	 if(exp.equalsIgnoreCase("Valid"))
		{
			if(message==true)
			{
				map.Clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(message==true)
			{
				map.Clicklogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	catch(Exception e)
	{
		Assert.fail("An exception occurred: " + e.getMessage());
	}
		
	logger.info("**** Finished TC_003_LoginDDT *****");
}

}


