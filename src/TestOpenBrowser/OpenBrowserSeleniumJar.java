package TestOpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;
import config.PropertiesFileInJar;

public class OpenBrowserSeleniumJar {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
	
		//setBrowser();
		PropertiesFileInJar.readPropertiesFile();
		
		setBrowserConfig();
		
		runTest();
		
		PropertiesFile.writePropertiesFile();
		
	}
	
	public static void setBrowser() {
		browser="Firefox";
		//browser="Chrome";
	}

	public static void setBrowserConfig() {
		String UserDir = System.getProperty("user.dir");
		//E:\softwares\eclipse-jee\eclipse\javaprojects\SeleniumAutomation
		System.out.println(UserDir);
		
		if(browser.contains("Firefox")) {
			//System.setProperty("webdriver.gecko.driver",UserDir+"\\lib\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver","lib\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			//driver = new MarionetteDriver();
		}
		
		if(browser.contains("Chrome")) {
			//System.setProperty("webdriver.chrome.driver",UserDir+"\\lib\\chromedriver\\chromedriver.exe");	
			System.setProperty("webdriver.chrome.driver","lib\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	public static void runTest() {
		driver.get("http://rediff.com/");
		//driver.get("http://seleniumhq.org/");
		System.out.println(driver.getTitle());
		//   driver.close();
		driver.quit();
	}
}
