package com.mobilesales.juaracoding.extentreport.driver.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver",  "D:\\Training\\QA\\aplikasi\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
