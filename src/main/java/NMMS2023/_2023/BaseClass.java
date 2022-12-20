package NMMS2023._2023;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	public void nmmssetup() throws IOException 
	{	
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\NMMS2022-2023\\Browsers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(UtilityClass.nmmsschLg("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
}
