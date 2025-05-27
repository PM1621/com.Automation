package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Handle_StaleElementReferenceException_For_Instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		Instagram_Login ilg=new Instagram_Login(driver);
		WebElement username=ilg.getUserName();
		WebElement pwd=ilg.getPassword();
		WebElement button=ilg.getLoginButton();
		
		driver.navigate().refresh();
		username.sendKeys("12334");
		pwd.sendKeys("2345");
		Thread.sleep(2000);
		button.submit();
	}
}
