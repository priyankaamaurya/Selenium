package task;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromProp {
	
	public static void main(String[] args) throws IOException{
		
		FileInputStream file = new FileInputStream("/Selenium/src/test/resources/Facebook.properties");
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("Url");
		String email = prop.getProperty("Email");
		String password = prop.getProperty("Password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(email);
		System.out.println(password);
		
		System.out.println("Print");
	}

}
