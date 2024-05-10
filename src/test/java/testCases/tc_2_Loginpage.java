package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.myaccountpage;
import testBase.BaseClass;

public class tc_2_Loginpage extends BaseClass {
	
	@Test(groups= {"regression"})
	public void loginn() {
		
		logger.info("hitting on account ->login");
		
		//homepage
		HomePage hp=new HomePage(driver);
		hp.myaccountclick();
	hp.clicklogin();
		
		//LOGIN PAGE
		LoginPage lp=new LoginPage(driver);
		lp.emailset(p.getProperty("gmail"));
		lp.setpass(p.getProperty("pass"));
		lp.clickcontinue();
		
		myaccountpage ac=new myaccountpage(driver);
		
		Assert.assertEquals(ac.disp(), true,"login failed");
		
		
		
		
	}
	

}
