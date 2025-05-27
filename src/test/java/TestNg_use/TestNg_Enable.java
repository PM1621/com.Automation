package TestNg_use;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Enable {
	
	@Test(enabled=false,priority=1)
	public void login()
	{
		Reporter.log("Login test script execute successfully",true);
	}

	@Test(priority=-2)
	public void register()
	{
		Reporter.log("Register test script execute successfully",true);
	}
	
	@Test(priority=3)
	public void addCart()
	{
		Reporter.log("Add Cart test script execute successfully",true);
	}
}
