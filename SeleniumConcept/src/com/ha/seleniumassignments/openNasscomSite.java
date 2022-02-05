package com.ha.seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class openNasscomSite {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nasscom.in/");
		driver.findElement(By.partialLinkText("New User")).click();
		driver.findElement(By.id("edit-field-fname-reg")).sendKeys("admin");
		driver.findElement(By.id("edit-field-lname")).sendKeys("pass");
		driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("edit-field-company-name-registration")).sendKeys("Google");
		Select s1 = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		s1.selectByVisibleText("IT Consulting");
		
		driver.findElement(By.id("edit-submit--2")).click();
//not able to get the image 
	}

}
