package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	private WebDriver driver;
	
	private By accountSections = By.cssSelector("div#center_column span");
	
	public AccountPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public int getAccountsSectionCount()
	{
		return driver.findElements(accountSections).size() - 1;
	}
	
	public List<String> getAccountsSectionList()
	{
		List<String> accountList = new ArrayList<>();
		List<WebElement> accountHeaderList = driver.findElements(accountSections);
		
		for(WebElement ele : accountHeaderList)
		{
			accountList.add(ele.getText());
		}
		
		return accountList;
	}

}
