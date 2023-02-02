package propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HowToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		//1. created an object of property file
		
		Properties prop = new Properties();
		
		//2. created file and pass file path
		
		FileInputStream file = new FileInputStream("C:\\Users\\Bhushan\\eclipse-workspace\\MySeleniumProject\\myProperty.properties");

		prop.load(file);
		
		String value = prop.getProperty("url");
		System.out.println(value);
		System.out.println(prop.getProperty("mobileNumber"));
	}

}
