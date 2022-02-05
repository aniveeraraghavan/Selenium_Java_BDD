package com.ha.seleniumassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openOrangehrmlive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//input[@class='button'] - xpath 
		
		driver.findElement(By.xpath("//input[@class='button']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.id("welcome")).click();//  element not interactable error was shown previously. Because code is trying to log out before it loads.
		//so added the implicit wait above.
		//driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.partialLinkText("Logout")).click();
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
		
		driver.quit();
	}

	
}
