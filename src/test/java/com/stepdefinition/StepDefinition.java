package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(ops);
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    WebElement txtuser = driver.findElement(By.id("email"));
	    txtuser.sendKeys("greens");
	    WebElement txtPass = driver.findElement(By.id("pass"));
	    txtPass.sendKeys("greens@123");
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_Login_Button() {
	    WebElement btnLogin = driver.findElement(By.name("login"));
	    btnLogin.click();
	}

	@Then("User verifies home page is displayed")
	public void user_verifies_home_page_is_displayed() {
	    System.out.println("Success");
	}



}
