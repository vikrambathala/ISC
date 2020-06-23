package Execution;

import org.testng.annotations.Test;

import BaseDrivers.AppDrivers;
import Pages.LoginPage;

public class Login extends AppDrivers
{
	
	public void loginTest() 
	{
		LoginPage lpobj = new LoginPage();
		lpobj.enterUserName(config.getProperty("username"));
		lpobj.enterPassword(config.getProperty("password"));
		lpobj.clickLoginButton();
		
	}
	
}
