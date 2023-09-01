package generic_Script;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Selen_Frmwrk_Constant
{
	public WebDriver driver;
	
  @BeforeMethod
  public void openApp()
  {
	  System.setProperty(key_chrome, value_chrome);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(url);
  }
  @AfterMethod
  public void closeApp(ITestResult res)
  {
	  if(ITestResult.FAILURE==res.getStatus())
	  {
		  Take_Screenshots.getpic(driver);
	  }
	  driver.close();
  }
  
}
