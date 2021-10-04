package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.InvokeDynamic.WithImplicitTarget;

public class Locator {
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
		driver.get("https://www.saucedemo.com");
		WebElement password = driver.findElement(By.id("password"));
	}

}

