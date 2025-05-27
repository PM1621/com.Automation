package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram_Login {
	public Instagram_Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Log in']")
	private WebElement loginbutton;
	
	public WebElement getUserName()
	{
		return username;
	}
	public WebElement getPassword()
	{
		return password;
		
	}
	public WebElement getLoginButton()
	{
		return loginbutton;
	}
}
