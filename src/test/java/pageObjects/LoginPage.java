package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends basepage {
	

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	 WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	 WebElement pas;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	 WebElement cont;
	
	
	
	public void emailset(String id)
	{
		email.sendKeys(id);
	}
	public void setpass(String pss)
	{
		pas.sendKeys(pss);
	}
	public void clickcontinue()
	{
		cont.click();
	}
}
	
	
	

