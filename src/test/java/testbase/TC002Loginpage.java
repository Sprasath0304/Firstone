package testbase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Homeclass;
import pageobject.loginpage;
import pageobject.myaccountpage;

public class TC002Loginpage extends basepage {

	@Test(groups= {"master","regression"})
	public void  verify_login() {
		
		
			
		logger.info("The logintest is start");
		
		Homeclass hc = new Homeclass(driver);
		
		hc.Clickacount();
		hc.clicklogin();
		
		loginpage lp =new loginpage(driver);
		
		lp.enteremail(p.getProperty("MAIL"));
		
		lp.enterpassword(p.getProperty("PassWord"));
		
		lp.clicklogin();
		
		
		myaccountpage map = new myaccountpage(driver);
		
		 boolean message =  map.displaymyaccountmessage();
		
		 Assert.assertEquals(message, true,"login failed");;
	
	
}
}