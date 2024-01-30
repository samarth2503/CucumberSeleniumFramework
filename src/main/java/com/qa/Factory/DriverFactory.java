package com.qa.Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver init_browser(String browser)
	{
		System.out.println("Browser value is : "+browser);
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = (WebDriver) new ChromeDriver();
			tlDriver.set(driver);
			
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver = (WebDriver) new FirefoxDriver();
			tlDriver.set(driver);
		}
		else {
			System.out.println("Please pass correct browser");
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver()
	{
		return tlDriver.get();
	}

}
