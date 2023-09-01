package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import generic_Script.Base_Page_Pom;

//2nd change
public class Pom_Script extends Base_Page_Pom
{
	@FindBy (name="username")
	private WebElement un;
	
	@FindBy (name="password")
	private WebElement pw;
	
	@FindBy (xpath = "//div[text()='Log in']")
	private WebElement lgnbtn;
	
public Pom_Script(WebDriver driver)
{
	super(driver);
}

public void usrN(String u)
{
	un.sendKeys(u);
}
public void pssW(String p)
{
	pw.sendKeys(p);
}
public void login()
{
	lgnbtn.click();
}
}
