package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basepage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement myregister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement mylogin;
	
	public void myaccountclick()
	{
		myaccount.click();
	}
	public void myregisterclick()
	{
		myregister.click();
	}
	public void clicklogin()
	{
		mylogin.click();
	}
	}
	
	

