package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Fetch_data_from_excel {
	
	static String path="./src/test/resources/login.xlsx";
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String username=flib.getDataFromExcel(path,"sheet1" ,1,0);
		String pwd=flib.getDataFromExcel(path,"sheet1",1,1);
		System.out.println(username +" : "+pwd);
		//System.out.println(pwd);
		
	}

}
