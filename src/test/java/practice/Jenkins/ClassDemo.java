package practice.Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassDemo {
	
	WebDriver driver;
	@Test
	public void mOne()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys(" admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
		
	}

	@AfterMethod
	public void closure()
	{
	  driver.close();
	}
}
