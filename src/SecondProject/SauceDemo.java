package SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemo {
 
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void setup() {
	driver.get("https://www.saucedemo.com/");	
	driver.manage().window().maximize();
	
	}
	
	@Test (priority = 1)
	public void test() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
	}
	@Test (priority = 2)
	public void test2() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
	}
	}

