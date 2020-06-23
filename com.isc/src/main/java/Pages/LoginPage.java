package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrivers.AppDrivers;

public class LoginPage extends AppDrivers
{
	public LoginPage() 
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy (id = "txtUserName" ) WebElement username;
	@FindBy (id = "txtPassword") WebElement password;
	@FindBy (id = "btnLogin") WebElement loginbutton;
	@FindBy (xpath = "//span[@id='lbl_signup']") WebElement signuplink;
	@FindBy (xpath = "//span[@id='lbl_forgotpassword']") WebElement forgotpasswordlink;
	
	
	public void enterUserName(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLoginButton()
	{
		loginbutton.click();
	}
	 public void signupNewUser() throws InterruptedException
	    {
	    	try
	    	{
	    		signuplink.click();
	    		Thread.sleep(3000);
	    	}
	    	catch(Exception e)
	    	{
	    	System.out.println(e);
	    	driver.navigate().to("https://cleannet.steri-clean.com/hoardersQA/UserMaintain.aspx");
	    	Thread.sleep(3000);

	    	}
	    }
	    public void clickforgetpwd() throws InterruptedException
		{
	    	forgotpasswordlink.click();
			Thread.sleep(3000);
		}
}
