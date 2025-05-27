package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException_Handle {
	
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/");
	Login lg=new Login(driver);
	WebElement email=lg.getEmailTextfield();
	WebElement password=lg.getPasswordTextfield();
	WebElement loginbutton=lg.getloginButton();
	driver.navigate().refresh();
	email.sendKeys("abcd");
	password.sendKeys("12345");
	loginbutton.click();
	
}
}
