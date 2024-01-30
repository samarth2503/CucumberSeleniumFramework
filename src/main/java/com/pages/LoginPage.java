package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	
	// By Locators
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLinkExist()
	{
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(emailId).sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(signInButton).click();
	}
	
	public void doLogin(String un, String pwd)
	{
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(emailId).sendKeys(pwd);
		driver.findElement(signInButton).click();
	}
	

}
