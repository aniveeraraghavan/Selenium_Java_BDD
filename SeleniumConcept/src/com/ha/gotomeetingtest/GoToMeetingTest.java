package com.ha.gotomeetingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoToMeetingTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goto.com/meeting/");
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.xpath("//a[@class='go-button go-button--secondary go-button--large']")).click();
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("wick");
		driver.findElement(By.id("login__email")).sendKeys("john.wick@gmaiil.com");
		driver.findElement(By.id("login__password")).sendKeys("1234567");
		Select s1 = new Select(driver.findElement(By.id("CompanySize")));
		//s1.selectByVisibleText("10 - 99");
		s1.selectByValue("10 - 99");
		//button[contains(text(), 'Start')] when we have more space in between the texts.
		
		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();
		
		String header= driver.findElement(By.xpath("//h1[contains(text(),'free')]")).getText();
		System.out.println(header);
		
		
		String error= driver.findElement(By.xpath("//div[@class='inputField__requirements']")).getText();
		System.out.println(error);
		
	String href= driver.findElement(By.linkText("Terms of Service")).getAttribute("href");
	System.out.println(href);
	
	String tagname = driver.findElement(By.linkText("Terms of Service")).getTagName();
	System.out.println(tagname);
	}

}
