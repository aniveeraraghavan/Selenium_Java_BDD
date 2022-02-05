package com.ha.seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class goToMeeting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goto.com/meeting/");
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.xpath("//a[@class='go-button go-button--secondary go-button--large']")).click();
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("wick");
		driver.findElement(By.id("login__email")).sendKeys("john.wick@gmaiil.com");
		driver.findElement(By.id("login__password")).sendKeys("A1234567");
		Select s1 = new Select(driver.findElement(By.id("CompanySize")));
		s1.selectByVisibleText("10 - 99");
		
		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();
		
	}
}

	