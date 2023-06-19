 package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassAda {
	public static WebDriver driver;
	public static WebDriver launchBrowser() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(ops);
return driver;
}
	public static void launchUrl(String url) {
driver.get(url);
	}
	public static void maximizeWindow() {
driver.manage().window().maximize();
	}
	public static void insertText(WebElement element, String data) {
element.sendKeys(data);
	}
	public static void btnClick(WebElement element) {
element.click();
}
	public static String getPageText(WebElement element) {
	String text = element.getText();
	return text;	
	}
}