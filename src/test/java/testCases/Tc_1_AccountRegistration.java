package testCases;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegisterPage;
import pageObjects.HomePage;

import testBase.BaseClass;

public class Tc_1_AccountRegistration extends BaseClass{
	
	@Test(groups= {"sanity"})
	public void implement() throws InterruptedException
	{
		logger.info("starting");
		HomePage obj=new HomePage(driver);
		
		logger.info("my account clicking");
		obj.myaccountclick();
		
		logger.info("my registerr clicking");
		obj.myregisterclick();
		
		AccountRegisterPage pg=new AccountRegisterPage(driver);
		pg.setFirstName(randomeString());
		pg.setLastName(randomeString());
		pg.setEmail(randomeString()+"@gmail.com");
		pg.setPassword(randomAlphaNumeric());
		
		pg.setPrivacyPolicy();
		
		
		pg.clickContinue();
		
		String sa=pg.gettxt();
		
		Assert.assertEquals(sa, "Your Account Has Been Created!");		
		
	}
	 
	

}
