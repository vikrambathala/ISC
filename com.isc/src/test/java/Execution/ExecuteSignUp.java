package Execution;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseDrivers.AppDrivers;
import Pages.LoginPage;
import Pages.SignUPPage;
import Utilities.ExcelUtilities;

public class ExecuteSignUp extends AppDrivers
{
	SignUPPage supojb;
	@Test(priority = 0)
	public void registerUser() throws InterruptedException
	{
		LoginPage lpojb2 = new LoginPage();
		lpojb2.signupNewUser();
	}
	@Test(priority = 1)
	public void enterDetails() throws IOException, InterruptedException
	{
		supojb = new SignUPPage();
		
		String cmp = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 0);
		supojb.enterCompany(cmp);
		
		String fname = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 1);
		supojb.enterFirstname(fname);
		
		String lname = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 2);
		supojb.enterFirstname(lname);
		
		String addr = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 3);
		supojb.enterlAddress(addr);
		
		String ct = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 4);
		supojb.enterCity(ct);
		
		
		try
		{
			String st = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 5);
			supojb.selectState(st);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			supojb.selectState(2);
			Thread.sleep(1000);
		}
		
		String zipc = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 6);
		supojb.Enterzip(zipc);
		
		String phn = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 7);
		supojb.enterPhone(phn);
		
		String uname = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 8);
		supojb.enterUsername(uname);
		
		String upwd = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 9);
		supojb.enterPassword(upwd);
		
		String uemail = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 10);
		supojb.enterEmailAddress(uemail);
		
		supojb.selectTndCCheckbox();
		
		
	}
}
