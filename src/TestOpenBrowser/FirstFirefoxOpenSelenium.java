package TestOpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstFirefoxOpenSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserDir = System.getProperty("user.dir");
		//E:\softwares\eclipse-jee\eclipse\javaprojects\SeleniumAutomation
		System.out.println(UserDir);
		//System.setProperty("webdriver.gecko.driver",UserDir+"\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",UserDir+"\\lib\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	
		//WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new MarionetteDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com/");
		//driver.get("http://seleniumhq.org/");
		System.out.println(driver.getTitle());
	 //   driver.close();
		driver.quit();
			
		
		
		
		

	}

}
