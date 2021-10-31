package Selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumLib\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Manage and Options
		driver.manage().window().maximize();
		//Get page
		driver.get("https://www.saucedemo.com/");
		
		//Login
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.manage().timeouts().getScriptTimeout();
		Thread.sleep(4000);
		
		Select dropDwn = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
		dropDwn.selectByVisibleText("Price (high to low)");	
		Thread.sleep(4000);
		
		//Add to cart
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		Thread.sleep(4000);
		
		//CheckOut information
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("fake1");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("fake2");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("99300");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//Finish
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		
		//Back to home
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		Thread.sleep(4000);
		//Quit
		driver.close();
		driver.quit();
		
	}

}
