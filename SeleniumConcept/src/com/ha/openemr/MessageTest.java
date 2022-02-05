package com.ha.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MessageTest {
	
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	 //2 back slashes are needed above.then only java will consider as directory
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	 
	 
	 driver.get("https://demo.openemr.io/b/openemr");
	 
//	 WebElement ele = driver driver.findElement(By.id ("authUser"));
//	 ele.sendKeys("admin");
	// Thread.sleep(5000);- will wait for the given seconds 
	driver.findElement(By.id("authUser")).sendKeys("admin");
	driver.findElement(By.id("clearPass")).sendKeys("pass");
	//driver.findElement(By.);
	
	
	Select s1 = new Select(driver.findElement(By.name("languageChoice")));
	s1.selectByVisibleText("English (Indian)");
	
	driver.findElement(By.xpath("//button[@type= 'submit']")).click();
//	String actualTitle=driver.getTitle();
//	System.out.println(actualTitle);
//	
//	String url = driver.getCurrentUrl();
//	System.out.println(url);
	// this is java script --document.querySelector("li[data-bind='click: logout']");
	driver.findElement(By.xpath("//div[text()= \"Patient/Client\"]")).click();
	driver.findElement(By.xpath("//div[text()= \"Patients\"]")).click();
	driver.switchTo().frame(driver.findElement(By.name("fin")));
	driver.findElement(By.id("//button[@id= \"create_patient_btn1\"]")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.name("pat")));
	driver.findElement(By.id("form_fname")).sendKeys("Anitha");
	driver.findElement(By.id("form_lname")).sendKeys("Anith");
	
	
			
	
	//JavascriptExecutor js=(JavascriptExecutor) driver;

//	js.executeScript("document.querySelector(\"li[data-bind='click: logout']\").click();");
//	driver.switchTo().frame(driver.findElement(By.id("logoutinnerframe")));
//	driver.findElement(By.cssSelector("menuLabel dropdown-toggle oe-dropdown-toggle")).click();
	
	 
	
}
}
