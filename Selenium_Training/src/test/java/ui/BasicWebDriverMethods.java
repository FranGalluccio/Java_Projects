package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebDriverMethods {

	public static String browser = "Chrome";
	public static WebDriver driver;
	public static void main(String[] args) {

		if(browser == "Firefox") {
			WebDriverManager.firefoxdriver().setup();	
			driver = new FirefoxDriver();
		}else if(browser == "Chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser == "Edge") {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
	}
}