package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import TestOpenBrowser.OpenBrowserSelenium;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String UserDir; 
	
	public static void main(String[] args) {
		UserDir = System.getProperty("user.dir");
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}
	
	public static void readPropertiesFile() {
		
		
		try {
			UserDir = System.getProperty("user.dir");
		//	InputStream input = new FileInputStream(UserDir+"\\src\\config\\config.properties");
			InputStream input = new FileInputStream("E:\\softwares\\eclipse-jee\\eclipse\\javaprojects\\SeleniumAutomation\\src\\config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			OpenBrowserSelenium.browser=prop.getProperty("browser");
			System.out.println(OpenBrowserSelenium.browser);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Properties file read IO error");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unhandled error");
			e.printStackTrace();
		}
		
	}
	
	public static void writePropertiesFile() {
		try {
			//OutputStream output =  new FileOutputStream(UserDir+"\\src\\config\\config.properties");
			OutputStream output =  new FileOutputStream("E:\\softwares\\eclipse-jee\\eclipse\\javaprojects\\SeleniumAutomation\\src\\config\\config.properties");
			prop.setProperty("browser","Chrome");
			prop.setProperty("result","Passed");
			prop.store(output, "first property write");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
