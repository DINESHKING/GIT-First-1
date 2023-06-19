package com.stepdefenitionadahotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionAdaHotel {
	public static WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(ops);
	    driver.get("http://adactinhotelapp.com/index.php");
	    driver.manage().window().maximize();
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		WebElement txtuser = driver.findElement(By.id("username"));
	    txtuser.sendKeys("Mdineshslm");
	    WebElement txtPass = driver.findElement(By.id("password"));
	    txtPass.sendKeys("7667872174");
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_Login_Button() throws InterruptedException {
		WebElement btnLogin = driver.findElement(By.name("login"));
	    btnLogin.click();
	    Thread.sleep(3000);
	    WebElement txtlocation = driver.findElement(By.xpath("//select[@name='location']"));
	    txtlocation.sendKeys("New York");
	    WebElement txthotels = driver.findElement(By.xpath("//select[@name='hotels']"));
	    txthotels.sendKeys("Hotel Sunshine");
	    WebElement txtroom = driver.findElement(By.xpath("//select[@name='room_type']"));
	    txtroom.sendKeys("Super");
	    WebElement txtroomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
	    txtroomnos.sendKeys("2-Two");
	    WebElement txtcindate = driver.findElement(By.xpath("//td[text()='Check In Date']"));
	    txtcindate   
	}

	@Then("User verifies home page is displayed")
	public void user_verifies_home_page_is_displayed() {
		System.out.println("Success");
}
}