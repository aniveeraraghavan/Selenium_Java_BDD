package com.ha.seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openGitHub {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		//login did not work with By.class method
		//driver.findElement(By.className("HeaderMenu-link flex-shrink-0 no-underline")).click();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.id("login_field")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.name("commit")).click();
		
	}

}
