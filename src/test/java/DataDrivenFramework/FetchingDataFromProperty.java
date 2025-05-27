package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromProperty {
public static void main(String[] args) throws IOException {
	
	//to load your property file
	
	FileInputStream f=new FileInputStream("./src/test/resources/CommandData.properties");
	
	//create the object of properties class
	
	Properties p=new Properties();
	
	//to load all the keys
	p.load(f);
	
	System.out.println(p.getProperty("browser"));
	System.out.println(p.getProperty("url"));
	
}
}
