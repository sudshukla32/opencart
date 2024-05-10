package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage extends basepage{
	public AccountRegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstn;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastn;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@class='form-check-input']/following::input")
	WebElement agree;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement continued;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement txt;
	
	
	public void setFirstName(String fname) {
		firstn.sendKeys(fname);

	}

	public void setLastName(String lname) {
		lastn.sendKeys(lname);

	}

	public void setEmail(String emails) {
		email.sendKeys(emails);

	}
	
	


	public void setPassword(String pwd) {
		pass.sendKeys(pwd);
	}
		
		public void setPrivacyPolicy() {
			 JavascriptExecutor js=(JavascriptExecutor)driver;  
			  
			js.executeScript("arguments[0].scrollIntoView();",agree);
			
			js.executeScript("arguments[0].click();",agree);

		}

		public void clickContinue() {
			 JavascriptExecutor js=(JavascriptExecutor)driver;  
			  
				js.executeScript("arguments[0].scrollIntoView();",continued);
				
				js.executeScript("arguments[0].click();",continued);
			//sol1 

	}
	
		public String gettxt() {
			
			try
			{
			String s=txt.getText();
			return s;
			}
			catch(Exception e)
			{
				return(e.getMessage());
				
		}
		}
}
