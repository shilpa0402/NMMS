package NMMS_2022_SchoolLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NMMS_DashboradPage 
{
	@FindBy (xpath="(//a)[11]")private WebElement schoolloginbtn;
	@FindBy (xpath="//input[@id='txtUDISE']")private WebElement userid;
	
	public NMMS_DashboradPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void clickonSchlogin() 
	{
		schoolloginbtn.click();
	}
	public void entreuserid() 
	{
		userid.sendKeys("2456783456");
	}
}

	

 	
