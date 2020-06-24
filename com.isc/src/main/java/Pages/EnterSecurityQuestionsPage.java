package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDrivers.AppDrivers;

public class EnterSecurityQuestionsPage extends AppDrivers
{
	public EnterSecurityQuestionsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "ddlQuestion") WebElement questiondrpdwn;
	@FindBy (id = "txtAnswer") WebElement answer;
	@FindBy (id = "btnAnswer") WebElement submitbutton;
	@FindBy (id = "btnCancel") WebElement cancelbutton;
	
	public void selectSecurityQuestion(String sq)
	{
		Select secque = new Select(questiondrpdwn);
		secque.selectByValue(sq);
	}
	public void selectSecurityQuestion(int sq)
	{
		Select s2 = new Select(questiondrpdwn);
		s2.selectByIndex(sq);
	}
	public void selectSecurityAnswer(String ans)
	{
		answer.clear();
		answer.sendKeys(ans);
	}
	public void clcikSubmit()
	{
		submitbutton.click();
	}
	public void clickCancel()
	{
		cancelbutton.click();
	}
}
