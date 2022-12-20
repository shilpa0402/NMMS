package NMMSTEST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NMMS2023._2023.BaseClass;
import NMMS2023._2023.UtilityClass;
import NMMS_2022_SchoolLogin.NMMS_DashboradPage;
import NMMS_2022_SchoolLogin.NMMS_HomePage;

public class NMMS_2023_Test extends BaseClass
{   
	NMMS_HomePage home;
	NMMS_DashboradPage dashboard;
	
	@BeforeClass
	public void nmmsopenbrowser() throws IOException 
	{
		nmmssetup();
		home=new NMMS_HomePage(driver);
		dashboard=new NMMS_DashboradPage(driver);

	}
	@BeforeMethod
	public void nmmsopensite()  
	{
		Reporter.log("hi",true);
	}
	@Test
	public void verifybuttontext1() throws IOException
	{
		String actbtn1 = home.getbtntext1();
		String exctbtn1= UtilityClass.getexceldata(1, 0);

		Reporter.log("Actual Button Name : "+actbtn1,true);
		Reporter.log("Expected Button Name : "+exctbtn1,true);
		Assert.assertEquals(actbtn1, exctbtn1);
		Reporter.log("-------------------------------------------", true);
			
	}
	@Test
	public void verifybuttontext2() throws IOException
	{
		String actbtn2 = home.getbtntext2();
		String exctbtn2= UtilityClass.getexceldata(2, 0);
		Reporter.log("Actual Button Name : "+actbtn2,true);
		Reporter.log("Expected Button Name : "+exctbtn2,true);
		Assert.assertEquals(actbtn2, exctbtn2);	
		
		home.clickonnmms22_23();
		
		
	}
	@Test(dependsOnMethods = "verifybuttontext2")
	public void switchtosclogin() 
	{
//		Set<String> allid = driver.getWindowHandles();
//		ArrayList<String> id = new ArrayList<String>(allid);
//		String childwindow = id.get(0);
//		driver.switchTo().window(childwindow);
		dashboard.clickonSchlogin();
		
		Set<String> nmmsid = driver.getWindowHandles();
		ArrayList<String> nmms =new ArrayList<String>(nmmsid);
	    String childWin = nmms.get(1);
	    driver.switchTo().window(childWin);
	    dashboard.entreuserid();
		Reporter.log("Done",true);	
	}
	
	@AfterMethod
	public void logoutfromsite()
	{
		

	}
	@AfterClass
	public void closebrowser()
	{
		

    }
}
