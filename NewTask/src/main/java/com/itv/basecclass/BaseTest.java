package com.itv.basecclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest 
{
	public static WebDriver driver;
	
	public static void setup(String browser) {	
	
	if(browser.equalsIgnoreCase("chrome"))
	{	
	System.setProperty("webdriver.chrome.driver","D://SeleniumResources//chromedriver.exe");
	driver=new ChromeDriver();
	}
	if(browser.equalsIgnoreCase("firefox"))
	{
	System.setProperty("webdriver.gecko.driver","D://SeleniumResources//firefoxdriver.exe");
	driver=new FirefoxDriver();
	}
	if(browser.equalsIgnoreCase("ie")) {
	System.setProperty("webdriver.ie.driver","D://SeleniumResources//IEdriverServer.exe");
	driver=new InternetExplorerDriver();
	}
}

}