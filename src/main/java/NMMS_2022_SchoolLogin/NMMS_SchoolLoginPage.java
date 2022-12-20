package NMMS_2022_SchoolLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NMMS_SchoolLoginPage 
{
	@FindBy (xpath="//input[@name='txtUDISE']") private WebElement username;
	@FindBy (xpath="//input[@name='txtPassword']") private WebElement passward;
	@FindBy (xpath="//input[@type='submit']")private WebElement loginbtn;
	
	public NMMS_SchoolLoginPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public void enterusname() 
	{
		username.sendKeys("");
	}
}
