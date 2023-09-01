package generic_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page_Pom
{
	public WebDriver driver;
	
public Base_Page_Pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
