package Execution;

import java.io.IOException;

import BaseDrivers.AppDrivers;
import Pages.LoginPage;
import Pages.SignUPPage;
import Utilities.ExcelUtilities;

public class ExecuteSignUp extends AppDrivers
{
	SignUPPage supojb;
	public void registerUser() throws InterruptedException
	{
		LoginPage lpojb2 = new LoginPage();
		lpojb2.signupNewUser();
	}
	public void enterDetails() throws IOException
	{
		supojb = new SignUPPage();
		
		String cmp = ExcelUtilities.readexcel(config.getProperty("signupuserdetails"), 0, 1, 0);
		supojb.enterCompany(cmp);
		
		
	}
}
