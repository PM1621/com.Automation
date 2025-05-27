package TestNg_use;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_Priority {
	@Test(priority=-2)
	public void login()
	{
		Reporter.log("Login test script should be executed successfully", true);
	}
    
	@Test(priority=-5)
	public void register()
	{
		Reporter.log("Register test script should be executed successfully",true);
		
	}
	
	@Test(priority=-2)
	public void addCart()
	{
		Reporter.log("Add Cart test script should be executed successfully",true);
	}
}
