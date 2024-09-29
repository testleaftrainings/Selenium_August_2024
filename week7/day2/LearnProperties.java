package week7.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {

	
	public static void main(String[] args) throws IOException {
		
		//Step 1: Instance the FileInputStream
		FileInputStream fis = new FileInputStream("./src/main/resources/credentials.properties");
		
		//Step 2: Create object for Properties
		Properties prop = new Properties();
		
		//Step 3: Load the property file
		prop.load(fis);
		
		//Step 4: Read the value from the file based on key
		String uname = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		
		System.out.println(uname);
		System.out.println(pwd);
	}
	
}
