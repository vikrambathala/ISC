package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDrivers.AppDrivers;

public class SignUPPage extends	AppDrivers	
{
	public SignUPPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "txtcompany") WebElement companyname;
	@FindBy (id = "txtFirstName") WebElement firstname;
	@FindBy (id = "txtLastName") WebElement lastname;
	@FindBy (id = "txtAddress") WebElement address;
	@FindBy (id = "txtCity") WebElement city;
	@FindBy (id = "cmbState") WebElement state;
	@FindBy (id = "txtZip") WebElement zip;
	@FindBy (id = "txtPhone") WebElement phone;
	@FindBy (id = "txtUserName") WebElement username;
	@FindBy (id = "txtPassword") WebElement password;
	@FindBy (id = "txtEmailAddress") WebElement emailaddress;
	@FindBy (id = "check_terms") WebElement tnccheckbox;
	@FindBy (id = "btnSubmit") WebElement submitbutton;
	@FindBy (id = "btnNew") WebElement newbutton;
	@FindBy (id = "btnCancel") WebElement loginbutton;
	
	
	
	public void enterCompany(String cmp)
	{
		companyname.clear();
		companyname.sendKeys(cmp);
	}
	public void enterFirstname(String fname)
	{
		firstname.clear();
		firstname.sendKeys(fname);
	}
	public void enterLastname(String lname)
	{
		lastname.clear();
		lastname.sendKeys(lname);
	}
	public void enterlAddress(String addr)
	{
		address.clear();
		address.sendKeys(addr);
	}
	public void enterCity(String ct)
	{
		city.clear();
		city.sendKeys(ct);
	}
	public void selectState(int st)
	{
		Select s = new Select(state);
		s.selectByIndex(st);
	}
	public void selectState(String st)
	{
	Select s2 = new Select(state);
	s2.selectByVisibleText(st);
	}
	public void Enterzip(int zipc )
	{
		zip.clear();
		zip.sendKeys(String.valueOf(zipc));
	}
	
	public void Enterzip(String zipc )
	{
		zip.clear();
		zip.sendKeys(zipc);
	}
	public void enterPhone(int phn)
	{
		phone.clear();
		phone.sendKeys(String.valueOf(phn));
	}
	public void enterPhone(String phn)
	{
		phone.clear();
		phone.sendKeys(phn);
	}
	public void enterUsername(String uname)
	{
		username.clear();
		username.sendKeys(uname);
	}
	public void enterPassword(String upwd)
	{
		password.clear();
		password.sendKeys(upwd);
	}
	public void enterEmailAddress(String uemail)
	{
		emailaddress.clear();
		emailaddress.sendKeys(uemail);
	}
	public void selectTndCCheckbox()
	{
		tnccheckbox.click();
	}
	public void clickSubmitbutton() 
	{
		submitbutton.click();
	}
	
	public void clickNewbutton() 
	{
		newbutton.click();
	}
	public void clickLoginbutton() 
	{
		loginbutton.click();
	}
	
	
}
