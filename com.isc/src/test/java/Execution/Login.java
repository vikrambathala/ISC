package Execution;

import org.testng.annotations.Test;

import BaseDrivers.AppDrivers;
import Pages.EnterSecurityQuestionsPage;
import Pages.LoginPage;

public class Login extends AppDrivers
{
	
	public void loginTest() 
	{
		LoginPage lpobj = new LoginPage();
		lpobj.enterUserName(config.getProperty("username"));
		lpobj.enterPassword(config.getProperty("password"));
		lpobj.clickLoginButton();
		try
		{
			EnterSecurityQuestionsPage esqp = new EnterSecurityQuestionsPage();
			esqp.selectSecurityQuestion(config.getProperty("SecurityQuestion"));
			esqp.selectSecurityAnswer(config.getProperty("SecurityAnswer"));
			esqp.clcikSubmit();
			
		}
		catch(Exception e)
		{
			System.out.println("Login successfull without Security Questions and Answers");
		}
		
	}
	
}
