package UtilityPackage;



import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browserLaunch {
	
	
	static WebDriver driver;
	public static void chrome(String url) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 
	 driver=new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	 driver.get(url);
	 
	 driver.quit();
	} 
	public static void main(String[] args) throws IOException {
		browserLaunch.chrome("https://www.facebook.com/");
		screenShot.Screenshot("newone");
	}
	
}

