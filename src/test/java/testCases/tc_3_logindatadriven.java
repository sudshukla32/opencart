package testCases;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.myaccountpage;
import testBase.BaseClass;
import utilities.DataProviders;

public class tc_3_logindatadriven extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	
	public void login(String id,String pass,String valid)
	{
	
		//homepage
		HomePage hp=new HomePage(driver);
		hp.myaccountclick();
	    hp.clicklogin();
		
		//LOGIN PAGE
		LoginPage lp=new LoginPage(driver);
		lp.emailset(id);
		lp.setpass(pass);
		lp.clickcontinue();
		
		
		//myaccount
		myaccountpage ac=new myaccountpage(driver);
		try
		{
		ac.logout();
		}
		catch(Exception e)
		{
			
		}
	
 if(valid.equalsIgnoreCase("valid"))
 {
	if(ac.disp()==true)
	{
		ac.logout();
		Assert.assertTrue(true);
	}
	else
		Assert.assertTrue(false);
	
 }
 if(valid.equalsIgnoreCase("Invalid"))
	if(ac.disp()==true)
	{
		ac.logout();
		Assert.assertTrue(false);
	}
	else
		Assert.assertTrue(false);
		//Assert.assertEquals(ac.disp(), true,"login failed");
	
	}
}


