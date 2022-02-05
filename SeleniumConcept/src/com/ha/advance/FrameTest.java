package com.ha.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//we will not be able to find the loginuserid as that attribute in frame.
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("123");
		
		driver.findElement(By.linkText("CONTINUE")).click();
		driver.switchTo().defaultContent();//to come out of the frame

	}

}
