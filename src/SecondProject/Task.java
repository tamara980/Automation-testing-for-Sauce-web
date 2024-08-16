package SecondProject;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task {
	
	WebDriver driver = new ChromeDriver();
	//WebDriver dd = new EdgeDriver();

	@BeforeTest
	public void s() {
	driver.get("https://www.google.co.uk/");	
		
	}
	
	@Test
	public void ss() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Tamara Dabit linkedin");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3/span")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
	} 
	
}
