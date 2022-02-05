package com.ha.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
		
		//below 2 lines are the valid xpath of the Go button of the above link
		//img[@alt='Go']
		//img[contains(@src,'go.gif')]
		driver.findElement(By.xpath("//img[@alt='Go']")).click();
		
		
		
	String alert=driver.switchTo().alert().getText();
System.out.println(alert);
	driver.switchTo().alert().accept();///switches to alert window and will accept the alert window
//driver.switchTo().alert().dismiss();//switch to alert window and will dismiss the alert window

	}

}
