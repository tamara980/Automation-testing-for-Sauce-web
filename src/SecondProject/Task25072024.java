package SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task25072024 {
	WebDriver driver = new ChromeDriver();
	

	@BeforeTest
	public void setup() { 
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
    
	@Test (priority = 1)
	public void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test (priority = 2)
	public void additems() throws InterruptedException {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(10000);
	    }
		
	@Test (priority = 3)
	public void removeitems() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.name("remove-sauce-labs-backpack")).click();
		
	}
	
}
