package DataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practice_feching_data {
	static String path="./src/test/resources/data.properties";
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		String  browser=Practice_load_and_fetch.getData(path,"browser");
		String url=Practice_load_and_fetch.getData(path,"url");
		if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("chrome"))
			driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
	}

	
	}


