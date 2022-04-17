package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global
{
	//stdrule:To Provide all re-usable fun:/methods related to whole application
	public void openApplication() 
	{
	System.setProperty("webdriver.gecko.driver", "G:\\Programing\\Selenium\\software\\Jarfiles\\Driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");//console
	Reporter.log("Application Opened");
	Log.info("Application Opened");
	}
	public void closeApplication() 
	{
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	public void login() 
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Log.info("Login completed");
	}
	public void logout() 
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}
	public void enterFrame() 
	{
		driver.switchTo().frame(frm_frame);
		System.out.println("Entered into frame");
		Log.info("Entered into frame");
	}
	public void exitFrame() 
	{
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from frame");
	}
	public void addEmp() 
	{
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_FN)).sendKeys(FN);
		driver.findElement(By.name(txt_LN)).sendKeys(LN);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New emp Added");
		Log.info("New emp Added");
	}
}