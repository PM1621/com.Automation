package TestNg_use;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNg {
	@Test
	public void login()
	{
		Reporter.log("Login test script execute Successfully", true);
	}
	
	@Test
	public void register()
	{
		Reporter.log("Register test script execute successfully", true);
	}
	
	@Test
	public void addCart()
	{
		Reporter.log("Add Cart  test script execute successfully", true);
	}

}
