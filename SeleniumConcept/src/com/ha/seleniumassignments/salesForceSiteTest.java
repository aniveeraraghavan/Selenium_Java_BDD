package com.ha.seleniumassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class salesForceSiteTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.name("UserFirstName")).sendKeys("John");
		 driver.findElement(By.name("UserLastName")).sendKeys("Wick");
		 driver.findElement(By.name("UserEmail")).sendKeys("john.wick@gmaiil.com");
		 Select s1 = new Select(driver.findElement(By.name("UserTitle")));
		 s1.selectByVisibleText("IT Manager");
		 
		
		Select s2= new Select(driver.findElement(By.name("CompanyEmployees")));
		s2.selectByVisibleText("101 - 500 employees");
		Select s3= new Select(driver.findElement(By.name("CompanyCountry")));
		s2.selectByVisibleText("101 - 500 employees");
		 s3.selectByVisibleText("United Kingdom");
		 driver.findElement(By.name("CompanyName")).sendKeys("HA");
		 driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		//below is also the valid xpath. there we have the 1 to decide which one to get.
		// driver.findElement(By.xpath("(//div[contains(@class,'checkbox-ui')])[1]")).click();
		//after getting the country we get a tool tip. so this hides the i accept check box. so we fill the company next to country.
	     driver.findElement(By.xpath("//button[normalize-space()='start my free trial']")).click();
		 
		 String error = driver.findElement(By.xpath("")).getText();
	System.out.println(error);
	
	driver.quit();
	}

}
