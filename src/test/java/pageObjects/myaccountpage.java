package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myaccountpage extends basepage {

	public myaccountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	 WebElement txtacc;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	 WebElement logout;
	
	public void logout()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",logout);
		
	}
	
	public boolean disp()
	{
		try
		{
		return(txtacc.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		
		}
	}

