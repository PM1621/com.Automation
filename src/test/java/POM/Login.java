package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
public Login(WebDriver driver)
{
PageFactory.initElements( driver,this);	
}

@FindAll({})
private WebElement emailTextfield;

@FindBy(id="pass")
private WebElement passwordTextfield;

@FindBy(name="login")
private WebElement loginButton;


public WebElement getEmailTextfield() {
	return emailTextfield;
}


public WebElement getPasswordTextfield() {
	return passwordTextfield;
}

public WebElement getloginButton()
{
	return loginButton;
}
}
