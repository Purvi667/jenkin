package com.maventest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class maventest {
WebDriver driver;
@Test
public void firsttest()
{
	System.out.println("This is my First Test");
	System.getProperty("Webdriver.gecko.driver","/home/ubuntu/libs/geckodriver");
	driver=new FirefoxDriver();
	driver.get("https://www.simplilearn.com/");
}
@AfterTest
public void closeBrowser() {
	driver.close();
}
}
