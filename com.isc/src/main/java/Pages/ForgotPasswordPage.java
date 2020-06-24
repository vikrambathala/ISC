package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrivers.AppDrivers;

public class ForgotPasswordPage extends AppDrivers
{
	public ForgotPasswordPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy (id = "txt_username")  WebElement usrnm;
	@FindBy (id = "txt_email")  WebElement email;
	@FindBy (id = "btnsubmit")  WebElement submitbutton;
	@FindBy (id = "btnclear")  WebElement clearbutton;
	@FindBy (id = "btncancel") WebElement loginbutton;

	
	public void enterUsername(String un)
	
	{	
		usrnm.clear();
		usrnm.sendKeys(un);
	}
	
	public void enterEmail(String em)
	{
		email.clear();
		email.sendKeys(em);
	}
	public void clickSubmit()
	{
		submitbutton.click();
	}
	public void clickClear()
	{
		clearbutton.click();
	}
	public void clickLogin()
	{
		loginbutton.click();
	}
}

