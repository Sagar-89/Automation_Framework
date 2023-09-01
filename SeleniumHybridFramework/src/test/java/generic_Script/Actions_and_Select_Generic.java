package generic_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions_and_Select_Generic 
{
	public static void action(WebDriver driver)
	{
		Actions act = new Actions(driver);
	}
	
	public static void sel(WebElement ele)
	{
		Select sel = new Select(ele);
	}

}
