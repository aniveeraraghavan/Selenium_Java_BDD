package com.ha.advance;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.db4free.net/");
	
	driver.findElement(By.xpath("//b[contains(text(),'phpMy')]")).click();
	List<String> windows =  new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windows.get(1));
	driver.findElement(By.id("input_username")).sendKeys("anitha");
	
	

}
}