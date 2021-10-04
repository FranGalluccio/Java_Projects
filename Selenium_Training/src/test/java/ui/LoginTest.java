package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static String browser = "Edge";
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
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();	
		
	}
}