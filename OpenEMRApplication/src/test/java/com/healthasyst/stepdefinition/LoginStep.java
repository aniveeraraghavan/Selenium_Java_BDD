package com.healthasyst.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;


public class LoginStep {

	WebDriver driver;
	
	
	@Given("I have a browser")
	public void i_have_a_browser() {
		//alternate  option to set the web driver automatically instead of set property
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	 
	 
	 driver.get("https://demo.openemr.io/b/openemr");
	
	}
	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
	    driver.findElement(By.id("authUser")).sendKeys(username);
	}
	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
	    
		driver.findElement(By.id("clearPass")).sendKeys(password);
	}
	@When("I select  language as {string}")
	public void i_select_language_as(String string) {
		Select s1 = new Select(driver.findElement(By.name("languageChoice")));
		s1.selectByVisibleText("English (Indian)");
	    
	}
	@When("I click on Login")
	public void i_click_on_login() {
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
	    
	}
	@Then("I shoudl get access to OpenEMR with title as {string}")
	public void i_shoudl_get_access_to_open_emr_with_title_as(String expectedResult) {
	    
		 String actualTitle=driver.getTitle();
		 Assert.assertEquals(expectedResult,actualTitle);
	}

	
	@Then("I shoudl get {string}")
	public void i_shoudl_get(String expectedError) {
		String actualError=driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();
		 Assert.assertEquals(expectedError,actualError);
	}


}
