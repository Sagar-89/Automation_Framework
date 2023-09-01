package runner_Script;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Script.Base_Test;
import generic_Script.DDT_Script;
import pom_Script.Pom_Script;

public class Runner_Script extends Base_Test
{
	@Test(dataProvider = "test")
	public void insta(String dp1, String dp2)
	{
		
		Pom_Script p1 = new Pom_Script(driver);
		try {
		String u = DDT_Script.getdata("Sheet1", 0, 0);	
		String p=DDT_Script.getdata("Sheet1", 1, 0);
		
		p1.usrN(dp1);
		Thread.sleep(2000);
		p1.pssW(dp2);
		Thread.sleep(2000);
		p1.login();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		//Assert.fail();
	}
	
	@DataProvider(name="test")
	public Object[][] createData1()
	{
		return new Object[][]    {
			{"afdlfjf","lldffk"},
			{"zkdkdmd","sllfffhg"} };
		}
	
	}
//tester
//changing here
