package NMMS_2022_SchoolLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NMMS_HomePage 
{
	@FindBy (xpath="//a[text()='NMMS (2021-22)  ']")private WebElement nmms2021_2022;
	@FindBy (xpath="//a[text()='NMMS (2022-23) ']")private WebElement nmms2022_2023;
	
	
	public NMMS_HomePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public String getbtntext1() 
	{
		String actBtname = nmms2021_2022.getText();
		return actBtname;
	}
	public String getbtntext2() 
	{
		String actBtname = nmms2022_2023.getText();
		return actBtname;
	}
	public void clickonnmms22_23() 
	{
		nmms2022_2023.click();
	}
}
